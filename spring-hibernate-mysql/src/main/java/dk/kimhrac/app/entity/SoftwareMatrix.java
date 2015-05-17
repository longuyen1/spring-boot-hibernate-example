package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * SoftwareMatrix
 */
@Entity
@Table(name = "SoftwareMatrix")
public class SoftwareMatrix extends AbstractEntity {

    @OneToMany(mappedBy="softwareMatrix",cascade = {CascadeType.ALL})
    private Set<SystemRelease> systemReleaseSet;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="SystemTypeId")
    private SystemType systemType = null;

    private Partner partner = null;                                                                                    // INT(10) UNSIGNED NOT NULL
    private String softwareMatrixName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
    private String repositoryProtocol = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
    private String repositorySecure = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String repositoryHost = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    private Integer repositoryPort = 0;                                                                                    // INT(11) NULL DEFAULT NULL
    private String repositoryUid = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String repositoryPwd = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    public Set<SystemRelease> getSystemReleaseSet() {
        return systemReleaseSet;
    }

    public void setSystemReleaseSet(Set<SystemRelease> systemReleaseSet) {
        this.systemReleaseSet = systemReleaseSet;
    }

    public SystemType getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    /**
     * @return the softwareMatrixName
     */
    public String getSoftwareMatrixName() {
        return softwareMatrixName;
    }

    /**
     * @param softwareMatrixName the softwareMatrixName to set
     */
    public void setSoftwareMatrixName(String softwareMatrixName) {
        this.softwareMatrixName = softwareMatrixName;
    }

    /**
     * @return the repositoryProtocol
     */
    public String getRepositoryProtocol() {
        return repositoryProtocol;
    }

    /**
     * @param repositoryProtocol the repositoryProtocol to set
     */
    public void setRepositoryProtocol(String repositoryProtocol) {
        this.repositoryProtocol = repositoryProtocol;
    }

    /**
     * @return the repositorySecure
     */
    public String getRepositorySecure() {
        return repositorySecure;
    }

    /**
     * @param repositorySecure the repositorySecure to set
     */
    public void setRepositorySecure(String repositorySecure) {
        this.repositorySecure = repositorySecure;
    }

    /**
     * @return the repositoryHost
     */
    public String getRepositoryHost() {
        return repositoryHost;
    }

    /**
     * @param repositoryHost the repositoryHost to set
     */
    public void setRepositoryHost(String repositoryHost) {
        this.repositoryHost = repositoryHost;
    }

    public Integer getRepositoryPort() {
        return repositoryPort;
    }

    public void setRepositoryPort(Integer repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    /**
     * @return the repositoryUid
     */
    public String getRepositoryUid() {
        return repositoryUid;
    }

    /**
     * @param repositoryUid the repositoryUid to set
     */
    public void setRepositoryUid(String repositoryUid) {
        this.repositoryUid = repositoryUid;
    }

    /**
     * @return the repositoryPwd
     */
    public String getRepositoryPwd() {
        return repositoryPwd;
    }

    /**
     * @param repositoryPwd the repositoryPwd to set
     */
    public void setRepositoryPwd(String repositoryPwd) {
        this.repositoryPwd = repositoryPwd;
    }

    public static class SoftwareMatrixBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private Set<SystemRelease> systemReleaseSet;
        private SystemType systemType = null;
        private Partner partner = null;                                                                                    // INT(10) UNSIGNED NOT NULL
        private String softwareMatrixName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private String repositoryProtocol = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private String repositorySecure = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String repositoryHost = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Integer repositoryPort = 0;                                                                                    // INT(11) NULL DEFAULT NULL
        private String repositoryUid = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String repositoryPwd = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SoftwareMatrixBuilder() {
        }

        public static SoftwareMatrixBuilder aSoftwareMatrix() {
            return new SoftwareMatrixBuilder();
        }

        public SoftwareMatrixBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SoftwareMatrixBuilder withSystemReleaseSet(
                Set<SystemRelease> systemReleaseSet) {
            this.systemReleaseSet = systemReleaseSet;
            return this;
        }

        public SoftwareMatrixBuilder withSystemType(SystemType systemType) {
            this.systemType = systemType;
            return this;
        }

        public SoftwareMatrixBuilder withPartner(Partner partner) {
            this.partner = partner;
            return this;
        }

        public SoftwareMatrixBuilder withSoftwareMatrixName(
                String softwareMatrixName) {
            this.softwareMatrixName = softwareMatrixName;
            return this;
        }

        public SoftwareMatrixBuilder withRepositoryProtocol(
                String repositoryProtocol) {
            this.repositoryProtocol = repositoryProtocol;
            return this;
        }

        public SoftwareMatrixBuilder withRepositorySecure(
                String repositorySecure) {
            this.repositorySecure = repositorySecure;
            return this;
        }

        public SoftwareMatrixBuilder withRepositoryHost(String repositoryHost) {
            this.repositoryHost = repositoryHost;
            return this;
        }

        public SoftwareMatrixBuilder withRepositoryPort(
                Integer repositoryPort) {
            this.repositoryPort = repositoryPort;
            return this;
        }

        public SoftwareMatrixBuilder withRepositoryUid(String repositoryUid) {
            this.repositoryUid = repositoryUid;
            return this;
        }

        public SoftwareMatrixBuilder withRepositoryPwd(String repositoryPwd) {
            this.repositoryPwd = repositoryPwd;
            return this;
        }

        public SoftwareMatrixBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SoftwareMatrixBuilder but() {
            return aSoftwareMatrix().withAddedDate(addedDate)
                    .withSystemReleaseSet(systemReleaseSet)
                    .withSystemType(systemType).withPartner(partner)
                    .withSoftwareMatrixName(softwareMatrixName)
                    .withRepositoryProtocol(repositoryProtocol)
                    .withRepositorySecure(repositorySecure)
                    .withRepositoryHost(repositoryHost)
                    .withRepositoryPort(repositoryPort)
                    .withRepositoryUid(repositoryUid)
                    .withRepositoryPwd(repositoryPwd)
                    .withModifiedDate(modifiedDate);
        }

        public SoftwareMatrix build() {
            SoftwareMatrix softwareMatrix = new SoftwareMatrix();
            softwareMatrix.setAddedDate(addedDate);
            softwareMatrix.setSystemReleaseSet(systemReleaseSet);
            softwareMatrix.setSystemType(systemType);
            softwareMatrix.setPartner(partner);
            softwareMatrix.setSoftwareMatrixName(softwareMatrixName);
            softwareMatrix.setRepositoryProtocol(repositoryProtocol);
            softwareMatrix.setRepositorySecure(repositorySecure);
            softwareMatrix.setRepositoryHost(repositoryHost);
            softwareMatrix.setRepositoryPort(repositoryPort);
            softwareMatrix.setRepositoryUid(repositoryUid);
            softwareMatrix.setRepositoryPwd(repositoryPwd);
            softwareMatrix.setModifiedDate(modifiedDate);
            return softwareMatrix;
        }
    }
}