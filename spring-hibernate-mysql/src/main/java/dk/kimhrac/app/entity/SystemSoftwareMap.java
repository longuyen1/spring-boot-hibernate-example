package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * SystemSoftwareMap
 */
@Entity
@Table(name = "SystemSoftwareMap")
public class SystemSoftwareMap extends AbstractEntity {


    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SystemRelease systemRelease = null;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn                                                            // INT(10) UNSIGNED NOT NULL
    private SoftwareComponent softwareComponent = null;                                                                        // INT(10) UNSIGNED NOT NULL

    @Column(length = 200)
    private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL

    public SystemRelease getSystemRelease() {
        return systemRelease;
    }

    public void setSystemRelease(SystemRelease systemRelease) {
        this.systemRelease = systemRelease;
    }

    public SoftwareComponent getSoftwareComponent() {
        return softwareComponent;
    }

    public void setSoftwareComponent(SoftwareComponent softwareComponent) {
        this.softwareComponent = softwareComponent;
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

    public static class SystemSoftwareMapBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private SystemRelease systemRelease = null;
        // INT(10) UNSIGNED NOT NULL
        private SoftwareComponent softwareComponent = null;                                                                        // INT(10) UNSIGNED NOT NULL
        private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SystemSoftwareMapBuilder() {
        }

        public static SystemSoftwareMapBuilder aSystemSoftwareMap() {
            return new SystemSoftwareMapBuilder();
        }

        public SystemSoftwareMapBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SystemSoftwareMapBuilder withSystemRelease(
                SystemRelease systemRelease) {
            this.systemRelease = systemRelease;
            return this;
        }

        public SystemSoftwareMapBuilder withSoftwareComponent(
                SoftwareComponent softwareComponent) {
            this.softwareComponent = softwareComponent;
            return this;
        }

        public SystemSoftwareMapBuilder withMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }

        public SystemSoftwareMapBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SystemSoftwareMapBuilder but() {
            return aSystemSoftwareMap().withAddedDate(addedDate)
                    .withSystemRelease(systemRelease)
                    .withSoftwareComponent(softwareComponent)
                    .withMapName(mapName).withModifiedDate(modifiedDate);
        }

        public SystemSoftwareMap build() {
            SystemSoftwareMap systemSoftwareMap = new SystemSoftwareMap();
            systemSoftwareMap.setAddedDate(addedDate);
            systemSoftwareMap.setSystemRelease(systemRelease);
            systemSoftwareMap.setSoftwareComponent(softwareComponent);
            systemSoftwareMap.setMapName(mapName);
            systemSoftwareMap.setModifiedDate(modifiedDate);
            return systemSoftwareMap;
        }
    }
}