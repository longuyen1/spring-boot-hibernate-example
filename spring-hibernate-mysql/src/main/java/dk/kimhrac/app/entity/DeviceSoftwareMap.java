package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * DeviceSoftwareMap
 */
@Entity
@Table(name = "DeviceSoftwareMap")
public class DeviceSoftwareMap extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private DeviceType deviceType;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SoftwareComponent softwareComponent = null;                                                                        // INT(10) UNSIGNED NOT NULL
    private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
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

    public static interface DeviceTypeStep {
        MapNameStep withDeviceType(DeviceType deviceType);
    }

    public static interface MapNameStep {
        AddedDateStep withMapName(String mapName);
    }

    public static interface AddedDateStep {
        ModifiedDateStep withAddedDate(Date addedDate);
    }

    public static interface ModifiedDateStep {
        BuildStep withModifiedDate(Date modifiedDate);
    }

    public static interface BuildStep {
        DeviceSoftwareMap build();
    }

    public static class Builder
            implements DeviceTypeStep, MapNameStep, AddedDateStep,
            ModifiedDateStep, BuildStep {
        private DeviceType deviceType;
        private String mapName;
        private Date addedDate;
        private Date modifiedDate;

        private Builder() {
        }

        public static DeviceTypeStep deviceSoftwareMap() {
            return new Builder();
        }

        @Override
        public MapNameStep withDeviceType(DeviceType deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        @Override
        public AddedDateStep withMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }

        @Override
        public ModifiedDateStep withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        @Override
        public BuildStep withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        @Override
        public DeviceSoftwareMap build() {
            DeviceSoftwareMap deviceSoftwareMap = new DeviceSoftwareMap();
            deviceSoftwareMap.setDeviceType(this.deviceType);
            deviceSoftwareMap.setMapName(this.mapName);
            deviceSoftwareMap.setAddedDate(this.addedDate);
            deviceSoftwareMap.setModifiedDate(this.modifiedDate);
            return deviceSoftwareMap;
        }
    }
}