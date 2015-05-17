package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * DeviceType
 */
@Entity
@Table(name = "DeviceType")
public class DeviceType extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SystemType systemType;                                                                                // INT(10) UNSIGNED NOT NULL
    private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL
    private Date eolDate = null;                                                                                    // TIMESTAMP NULL DEFAULT NULL
    private String deviceTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String deviceTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String deviceTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    /**
     * @return the releaseDate
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * @return the eolDate
     */
    public Date getEolDate() {
        return eolDate;
    }

    /**
     * @param eolDate the eolDate to set
     */
    public void setEolDate(Date eolDate) {
        this.eolDate = eolDate;
    }

    /**
     * @return the deviceTypeName
     */
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    /**
     * @param deviceTypeName the deviceTypeName to set
     */
    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    /**
     * @return the deviceTypeKey
     */
    public String getDeviceTypeKey() {
        return deviceTypeKey;
    }

    /**
     * @param deviceTypeKey the deviceTypeKey to set
     */
    public void setDeviceTypeKey(String deviceTypeKey) {
        this.deviceTypeKey = deviceTypeKey;
    }

    /**
     * @return the deviceTypeCode
     */
    public String getDeviceTypeCode() {
        return deviceTypeCode;
    }

    /**
     * @param deviceTypeCode the deviceTypeCode to set
     */
    public void setDeviceTypeCode(String deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
    }

    public static class DeviceTypeBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private SystemType systemType;                                                                                // INT(10) UNSIGNED NOT NULL
        private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL
        private Date eolDate = null;                                                                                    // TIMESTAMP NULL DEFAULT NULL
        private String deviceTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String deviceTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String deviceTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private DeviceTypeBuilder() {
        }

        public static DeviceTypeBuilder aDeviceType() {
            return new DeviceTypeBuilder();
        }

        public DeviceTypeBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public DeviceTypeBuilder withSystemType(SystemType systemType) {
            this.systemType = systemType;
            return this;
        }

        public DeviceTypeBuilder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public DeviceTypeBuilder withEolDate(Date eolDate) {
            this.eolDate = eolDate;
            return this;
        }

        public DeviceTypeBuilder withDeviceTypeName(String deviceTypeName) {
            this.deviceTypeName = deviceTypeName;
            return this;
        }

        public DeviceTypeBuilder withDeviceTypeKey(String deviceTypeKey) {
            this.deviceTypeKey = deviceTypeKey;
            return this;
        }

        public DeviceTypeBuilder withDeviceTypeCode(String deviceTypeCode) {
            this.deviceTypeCode = deviceTypeCode;
            return this;
        }

        public DeviceTypeBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public DeviceTypeBuilder but() {
            return aDeviceType().withAddedDate(addedDate)
                    .withSystemType(systemType).withReleaseDate(releaseDate)
                    .withEolDate(eolDate).withDeviceTypeName(deviceTypeName)
                    .withDeviceTypeKey(deviceTypeKey)
                    .withDeviceTypeCode(deviceTypeCode)
                    .withModifiedDate(modifiedDate);
        }

        public DeviceType build() {
            DeviceType deviceType = new DeviceType();
            deviceType.setAddedDate(addedDate);
            deviceType.setSystemType(systemType);
            deviceType.setReleaseDate(releaseDate);
            deviceType.setEolDate(eolDate);
            deviceType.setDeviceTypeName(deviceTypeName);
            deviceType.setDeviceTypeKey(deviceTypeKey);
            deviceType.setDeviceTypeCode(deviceTypeCode);
            deviceType.setModifiedDate(modifiedDate);
            return deviceType;
        }
    }
}