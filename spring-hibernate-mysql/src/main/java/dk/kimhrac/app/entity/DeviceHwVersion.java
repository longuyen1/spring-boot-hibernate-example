package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * DeviceHwVersion
 */
@Entity
@Table(name = "DeviceHwVersion")
public class DeviceHwVersion extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private DeviceType deviceType;                                                                                // INT(10) UNSIGNED NOT NULL COMMENT 'Reference to Device Type'
    private String deviceHwVersionName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
    private String deviceHwVersionKey = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
    private String deviceHwVersionCode = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * @return the deviceHwVersionName
     */
    public String getDeviceHwVersionName() {
        return deviceHwVersionName;
    }

    /**
     * @param deviceHwVersionName the deviceHwVersionName to set
     */
    public void setDeviceHwVersionName(String deviceHwVersionName) {
        this.deviceHwVersionName = deviceHwVersionName;
    }

    /**
     * @return the deviceHwVersionKey
     */
    public String getDeviceHwVersionKey() {
        return deviceHwVersionKey;
    }

    /**
     * @param deviceHwVersionKey the deviceHwVersionKey to set
     */
    public void setDeviceHwVersionKey(String deviceHwVersionKey) {
        this.deviceHwVersionKey = deviceHwVersionKey;
    }

    /**
     * @return the deviceHwVersionCode
     */
    public String getDeviceHwVersionCode() {
        return deviceHwVersionCode;
    }

    /**
     * @param deviceHwVersionCode the deviceHwVersionCode to set
     */
    public void setDeviceHwVersionCode(String deviceHwVersionCode) {
        this.deviceHwVersionCode = deviceHwVersionCode;
    }

    public static class DeviceHwVersionBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private DeviceType deviceType;                                                                                // INT(10) UNSIGNED NOT NULL COMMENT 'Reference to Device Type'
        private String deviceHwVersionName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private String deviceHwVersionKey = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private String deviceHwVersionCode = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private DeviceHwVersionBuilder() {
        }

        public static DeviceHwVersionBuilder aDeviceHwVersion() {
            return new DeviceHwVersionBuilder();
        }

        public DeviceHwVersionBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public DeviceHwVersionBuilder withDeviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public DeviceHwVersionBuilder withDeviceHwVersionName(
                String deviceHwVersionName) {
            this.deviceHwVersionName = deviceHwVersionName;
            return this;
        }

        public DeviceHwVersionBuilder withDeviceHwVersionKey(
                String deviceHwVersionKey) {
            this.deviceHwVersionKey = deviceHwVersionKey;
            return this;
        }

        public DeviceHwVersionBuilder withDeviceHwVersionCode(
                String deviceHwVersionCode) {
            this.deviceHwVersionCode = deviceHwVersionCode;
            return this;
        }

        public DeviceHwVersionBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public DeviceHwVersionBuilder but() {
            return aDeviceHwVersion().withAddedDate(addedDate)
                    .withDeviceType(deviceType)
                    .withDeviceHwVersionName(deviceHwVersionName)
                    .withDeviceHwVersionKey(deviceHwVersionKey)
                    .withDeviceHwVersionCode(deviceHwVersionCode)
                    .withModifiedDate(modifiedDate);
        }

        public DeviceHwVersion build() {
            DeviceHwVersion deviceHwVersion = new DeviceHwVersion();
            deviceHwVersion.setAddedDate(addedDate);
            deviceHwVersion.setDeviceType(deviceType);
            deviceHwVersion.setDeviceHwVersionName(deviceHwVersionName);
            deviceHwVersion.setDeviceHwVersionKey(deviceHwVersionKey);
            deviceHwVersion.setDeviceHwVersionCode(deviceHwVersionCode);
            deviceHwVersion.setModifiedDate(modifiedDate);
            return deviceHwVersion;
        }
    }
}