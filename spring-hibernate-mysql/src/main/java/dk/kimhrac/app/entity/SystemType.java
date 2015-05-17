package dk.kimhrac.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * SystemType
 */
@Entity
@Table(name = "SystemType")
public class SystemType extends AbstractEntity {

    @Column(length = 200)
    private String systemTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    @Column(length = 200)
    private String systemTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    @Column(length = 200)
    private String systemTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    /**
     * @return the systemTypeName
     */
    public String getSystemTypeName() {
        return systemTypeName;
    }

    /**
     * @param systemTypeName the systemTypeName to set
     */
    public void setSystemTypeName(String systemTypeName) {
        this.systemTypeName = systemTypeName;
    }

    /**
     * @return the systemTypeKey
     */
    public String getSystemTypeKey() {
        return systemTypeKey;
    }

    /**
     * @param systemTypeKey the systemTypeKey to set
     */
    public void setSystemTypeKey(String systemTypeKey) {
        this.systemTypeKey = systemTypeKey;
    }

    /**
     * @return the systemTypeCode
     */
    public String getSystemTypeCode() {
        return systemTypeCode;
    }

    /**
     * @param systemTypeCode the systemTypeCode to set
     */
    public void setSystemTypeCode(String systemTypeCode) {
        this.systemTypeCode = systemTypeCode;
    }

    public static class SystemTypeBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private String systemTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String systemTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String systemTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SystemTypeBuilder() {
        }

        public static SystemTypeBuilder aSystemType() {
            return new SystemTypeBuilder();
        }

        public SystemTypeBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SystemTypeBuilder withSystemTypeName(String systemTypeName) {
            this.systemTypeName = systemTypeName;
            return this;
        }

        public SystemTypeBuilder withSystemTypeKey(String systemTypeKey) {
            this.systemTypeKey = systemTypeKey;
            return this;
        }

        public SystemTypeBuilder withSystemTypeCode(String systemTypeCode) {
            this.systemTypeCode = systemTypeCode;
            return this;
        }

        public SystemTypeBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SystemTypeBuilder but() {
            return aSystemType().withAddedDate(addedDate)
                    .withSystemTypeName(systemTypeName)
                    .withSystemTypeKey(systemTypeKey)
                    .withSystemTypeCode(systemTypeCode)
                    .withModifiedDate(modifiedDate);
        }

        public SystemType build() {
            SystemType systemType = new SystemType();
            systemType.setAddedDate(addedDate);
            systemType.setSystemTypeName(systemTypeName);
            systemType.setSystemTypeKey(systemTypeKey);
            systemType.setSystemTypeCode(systemTypeCode);
            systemType.setModifiedDate(modifiedDate);
            return systemType;
        }
    }
}