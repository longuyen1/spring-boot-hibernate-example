package dk.kimhrac.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * SoftwareType
 */
@Entity
@Table(name = "SoftwareType")
public class SoftwareType extends AbstractEntity {


    private String softwareTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String softwareTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String softwareTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    /**
     * @return the softwareTypeName
     */
    public String getSoftwareTypeName() {
        return softwareTypeName;
    }

    /**
     * @param softwareTypeName the softwareTypeName to set
     */
    public void setSoftwareTypeName(String softwareTypeName) {
        this.softwareTypeName = softwareTypeName;
    }

    /**
     * @return the softwareTypeKey
     */
    public String getSoftwareTypeKey() {
        return softwareTypeKey;
    }

    /**
     * @param softwareTypeKey the softwareTypeKey to set
     */
    public void setSoftwareTypeKey(String softwareTypeKey) {
        this.softwareTypeKey = softwareTypeKey;
    }

    /**
     * @return the softwareTypeCode
     */
    public String getSoftwareTypeCode() {
        return softwareTypeCode;
    }

    /**
     * @param softwareTypeCode the softwareTypeCode to set
     */
    public void setSoftwareTypeCode(String softwareTypeCode) {
        this.softwareTypeCode = softwareTypeCode;
    }

    public static class SoftwareTypeBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private String softwareTypeName = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String softwareTypeKey = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String softwareTypeCode = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SoftwareTypeBuilder() {
        }

        public static SoftwareTypeBuilder aSoftwareType() {
            return new SoftwareTypeBuilder();
        }

        public SoftwareTypeBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SoftwareTypeBuilder withSoftwareTypeName(
                String softwareTypeName) {
            this.softwareTypeName = softwareTypeName;
            return this;
        }

        public SoftwareTypeBuilder withSoftwareTypeKey(String softwareTypeKey) {
            this.softwareTypeKey = softwareTypeKey;
            return this;
        }

        public SoftwareTypeBuilder withSoftwareTypeCode(
                String softwareTypeCode) {
            this.softwareTypeCode = softwareTypeCode;
            return this;
        }

        public SoftwareTypeBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SoftwareTypeBuilder but() {
            return aSoftwareType().withAddedDate(addedDate)
                    .withSoftwareTypeName(softwareTypeName)
                    .withSoftwareTypeKey(softwareTypeKey)
                    .withSoftwareTypeCode(softwareTypeCode)
                    .withModifiedDate(modifiedDate);
        }

        public SoftwareType build() {
            SoftwareType softwareType = new SoftwareType();
            softwareType.setAddedDate(addedDate);
            softwareType.setSoftwareTypeName(softwareTypeName);
            softwareType.setSoftwareTypeKey(softwareTypeKey);
            softwareType.setSoftwareTypeCode(softwareTypeCode);
            softwareType.setModifiedDate(modifiedDate);
            return softwareType;
        }
    }
}