package dk.kimhrac.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Partner
 */
@Entity
@Table(name = "Partner")
public class Partner extends AbstractEntity {

    private String partnerName = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL
    private String partnerKey = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL
    private String partnerCode = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL

    /**
     * @return the partnerName
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * @param partnerName the partnerName to set
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * @return the partnerKey
     */
    public String getPartnerKey() {
        return partnerKey;
    }

    /**
     * @param partnerKey the partnerKey to set
     */
    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
    }

    /**
     * @return the partnerCode
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * @param partnerCode the partnerCode to set
     */
    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public static class PartnerBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private String partnerName = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL
        private String partnerKey = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL
        private String partnerCode = null;                                                                                // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private PartnerBuilder() {
        }

        public static PartnerBuilder aPartner() {
            return new PartnerBuilder();
        }

        public PartnerBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public PartnerBuilder withPartnerName(String partnerName) {
            this.partnerName = partnerName;
            return this;
        }

        public PartnerBuilder withPartnerKey(String partnerKey) {
            this.partnerKey = partnerKey;
            return this;
        }

        public PartnerBuilder withPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }

        public PartnerBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public PartnerBuilder but() {
            return aPartner().withAddedDate(addedDate)
                    .withPartnerName(partnerName).withPartnerKey(partnerKey)
                    .withPartnerCode(partnerCode)
                    .withModifiedDate(modifiedDate);
        }

        public Partner build() {
            Partner partner = new Partner();
            partner.setAddedDate(addedDate);
            partner.setPartnerName(partnerName);
            partner.setPartnerKey(partnerKey);
            partner.setPartnerCode(partnerCode);
            partner.setModifiedDate(modifiedDate);
            return partner;
        }
    }
}