package dk.kimhrac.app.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * SystemRelease
 */
@Entity
@Table(name = "SystemRelease")
public class SystemRelease extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="SoftwareMatrixId")
    private SoftwareMatrix softwareMatrix = null;                                                                            // INT(10) UNSIGNED NOT NULL

    private String systemReleaseVersion = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
    private String systemReleaseName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL

    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL

    @Column(columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean major = false;                                                                                // TINYINT(1) UNSIGNED NULL DEFAULT NULL

    @Column(columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean critical = false;                                                                                // TINYINT(1) UNSIGNED NULL DEFAULT NULL

    @Column(columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean beta = false;                                                                                    // TINYINT(1) UNSIGNED NULL DEFAULT NULL

    @Column(columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean forceUpdate = false;                                                                            // TINYINT(1) UNSIGNED NULL DEFAULT NULL

    public SoftwareMatrix getSoftwareMatrix() {
        return softwareMatrix;
    }

    public void setSoftwareMatrix(SoftwareMatrix softwareMatrix) {
        this.softwareMatrix = softwareMatrix;
    }

    /**
     * @return the systemReleaseVersion
     */
    public String getSystemReleaseVersion() {
        return systemReleaseVersion;
    }

    /**
     * @param systemReleaseVersion the systemReleaseVersion to set
     */
    public void setSystemReleaseVersion(String systemReleaseVersion) {
        this.systemReleaseVersion = systemReleaseVersion;
    }

    /**
     * @return the systemReleaseName
     */
    public String getSystemReleaseName() {
        return systemReleaseName;
    }

    /**
     * @param systemReleaseName the systemReleaseName to set
     */
    public void setSystemReleaseName(String systemReleaseName) {
        this.systemReleaseName = systemReleaseName;
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

    public boolean isBeta() {
        return beta;
    }

    public void setBeta(boolean beta) {
        this.beta = beta;
    }

    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    /**
     * @return the forceUpdate
     */
    public boolean isForceUpdate() {
        return forceUpdate;
    }

    /**
     * @param forceUpdate the forceUpdate to set
     */
    public void setForceUpdate(boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public static class SystemReleaseBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private SoftwareMatrix softwareMatrix = null;                                                                            // INT(10) UNSIGNED NOT NULL
        private String systemReleaseVersion = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private String systemReleaseName = null;                                                                        // VARCHAR(200) NULL DEFAULT NULL
        private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL
        private boolean major = false;                                                                                // TINYINT(1) UNSIGNED NULL DEFAULT NULL
        private boolean critical = false;                                                                                // TINYINT(1) UNSIGNED NULL DEFAULT NULL
        private boolean beta = false;                                                                                    // TINYINT(1) UNSIGNED NULL DEFAULT NULL
        private boolean forceUpdate = false;                                                                            // TINYINT(1) UNSIGNED NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SystemReleaseBuilder() {
        }

        public static SystemReleaseBuilder aSystemRelease() {
            return new SystemReleaseBuilder();
        }

        public SystemReleaseBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SystemReleaseBuilder withSoftwareMatrix(
                SoftwareMatrix softwareMatrix) {
            this.softwareMatrix = softwareMatrix;
            return this;
        }

        public SystemReleaseBuilder withSystemReleaseVersion(
                String systemReleaseVersion) {
            this.systemReleaseVersion = systemReleaseVersion;
            return this;
        }

        public SystemReleaseBuilder withSystemReleaseName(
                String systemReleaseName) {
            this.systemReleaseName = systemReleaseName;
            return this;
        }

        public SystemReleaseBuilder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public SystemReleaseBuilder withMajor(boolean major) {
            this.major = major;
            return this;
        }

        public SystemReleaseBuilder withCritical(boolean critical) {
            this.critical = critical;
            return this;
        }

        public SystemReleaseBuilder withBeta(boolean beta) {
            this.beta = beta;
            return this;
        }

        public SystemReleaseBuilder withForceUpdate(boolean forceUpdate) {
            this.forceUpdate = forceUpdate;
            return this;
        }

        public SystemReleaseBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SystemReleaseBuilder but() {
            return aSystemRelease().withAddedDate(addedDate)
                    .withSoftwareMatrix(softwareMatrix)
                    .withSystemReleaseVersion(systemReleaseVersion)
                    .withSystemReleaseName(systemReleaseName)
                    .withReleaseDate(releaseDate).withMajor(major)
                    .withCritical(critical).withBeta(beta)
                    .withForceUpdate(forceUpdate)
                    .withModifiedDate(modifiedDate);
        }

        public SystemRelease build() {
            SystemRelease systemRelease = new SystemRelease();
            systemRelease.setAddedDate(addedDate);
            systemRelease.setSoftwareMatrix(softwareMatrix);
            systemRelease.setSystemReleaseVersion(systemReleaseVersion);
            systemRelease.setSystemReleaseName(systemReleaseName);
            systemRelease.setReleaseDate(releaseDate);
            systemRelease.setMajor(major);
            systemRelease.setCritical(critical);
            systemRelease.setBeta(beta);
            systemRelease.setForceUpdate(forceUpdate);
            systemRelease.setModifiedDate(modifiedDate);
            return systemRelease;
        }
    }
}