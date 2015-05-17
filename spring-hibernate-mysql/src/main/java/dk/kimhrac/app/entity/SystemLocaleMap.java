package dk.kimhrac.app.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * SystemLocaleMap
 */
@Entity
@Table(name = "SystemLocaleMap")
public class SystemLocaleMap extends AbstractEntity {

    private SystemRelease systemRelease = null;

    @ManyToOne
    @JoinColumn(name="locale_id")
    private Locale locale = null;                                                                                    // INT(10) UNSIGNED NOT NULL
    private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL

    public SystemRelease getSystemRelease() {
        return systemRelease;
    }

    public void setSystemRelease(SystemRelease systemRelease) {
        this.systemRelease = systemRelease;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * @return the mapName
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * @param mapName the mapName to set
     */
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public static class SystemLocaleMapBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private SystemRelease systemRelease = null;
        private Locale locale = null;                                                                                    // INT(10) UNSIGNED NOT NULL
        private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SystemLocaleMapBuilder() {
        }

        public static SystemLocaleMapBuilder aSystemLocaleMap() {
            return new SystemLocaleMapBuilder();
        }

        public SystemLocaleMapBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SystemLocaleMapBuilder withSystemRelease(
                SystemRelease systemRelease) {
            this.systemRelease = systemRelease;
            return this;
        }

        public SystemLocaleMapBuilder withLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public SystemLocaleMapBuilder withMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }

        public SystemLocaleMapBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SystemLocaleMapBuilder but() {
            return aSystemLocaleMap().withAddedDate(addedDate)
                    .withSystemRelease(systemRelease).withLocale(locale)
                    .withMapName(mapName).withModifiedDate(modifiedDate);
        }

        public SystemLocaleMap build() {
            SystemLocaleMap systemLocaleMap = new SystemLocaleMap();
            systemLocaleMap.setAddedDate(addedDate);
            systemLocaleMap.setSystemRelease(systemRelease);
            systemLocaleMap.setLocale(locale);
            systemLocaleMap.setMapName(mapName);
            systemLocaleMap.setModifiedDate(modifiedDate);
            return systemLocaleMap;
        }
    }
}