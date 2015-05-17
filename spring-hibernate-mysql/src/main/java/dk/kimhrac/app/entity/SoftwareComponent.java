package dk.kimhrac.app.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * SoftwareComponent
 */
@Entity
@Table(name = "SoftwareComponent")
public class SoftwareComponent extends AbstractEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SoftwareType softwareType = null;                                                                                // INT(10) UNSIGNED NOT NULL
    private String softwareComponentVersion = null;                                                                    // VARCHAR(200) NULL DEFAULT NULL
    private String softwareComponentName = null;                                                                    // VARCHAR(200) NULL DEFAULT NULL
    private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL
    private String repositoryPath = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
    private String repositoryFile = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL

    public SoftwareType getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(SoftwareType softwareType) {
        this.softwareType = softwareType;
    }

    /**
     * @return the softwareComponentVersion
     */
    public String getSoftwareComponentVersion() {
        return softwareComponentVersion;
    }

    /**
     * @param softwareComponentVersion the softwareComponentVersion to set
     */
    public void setSoftwareComponentVersion(String softwareComponentVersion) {
        this.softwareComponentVersion = softwareComponentVersion;
    }

    /**
     * @return the softwareComponentName
     */
    public String getSoftwareComponentName() {
        return softwareComponentName;
    }

    /**
     * @param softwareComponentName the softwareComponentName to set
     */
    public void setSoftwareComponentName(String softwareComponentName) {
        this.softwareComponentName = softwareComponentName;
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
     * @return the repositoryPath
     */
    public String getRepositoryPath() {
        return repositoryPath;
    }

    /**
     * @param repositoryPath the repositoryPath to set
     */
    public void setRepositoryPath(String repositoryPath) {
        this.repositoryPath = repositoryPath;
    }

    /**
     * @return the repositoryFile
     */
    public String getRepositoryFile() {
        return repositoryFile;
    }

    /**
     * @param repositoryFile the repositoryFile to set
     */
    public void setRepositoryFile(String repositoryFile) {
        this.repositoryFile = repositoryFile;
    }

    public static class SoftwareComponentBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private SoftwareType softwareType = null;                                                                                // INT(10) UNSIGNED NOT NULL
        private String softwareComponentVersion = null;                                                                    // VARCHAR(200) NULL DEFAULT NULL
        private String softwareComponentName = null;                                                                    // VARCHAR(200) NULL DEFAULT NULL
        private Date releaseDate = null;                                                                                // TIMESTAMP NULL DEFAULT NULL
        private String repositoryPath = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private String repositoryFile = null;                                                                            // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private SoftwareComponentBuilder() {
        }

        public static SoftwareComponentBuilder aSoftwareComponent() {
            return new SoftwareComponentBuilder();
        }

        public SoftwareComponentBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public SoftwareComponentBuilder withSoftwareType(
                SoftwareType softwareType) {
            this.softwareType = softwareType;
            return this;
        }

        public SoftwareComponentBuilder withSoftwareComponentVersion(
                String softwareComponentVersion) {
            this.softwareComponentVersion = softwareComponentVersion;
            return this;
        }

        public SoftwareComponentBuilder withSoftwareComponentName(
                String softwareComponentName) {
            this.softwareComponentName = softwareComponentName;
            return this;
        }

        public SoftwareComponentBuilder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public SoftwareComponentBuilder withRepositoryPath(
                String repositoryPath) {
            this.repositoryPath = repositoryPath;
            return this;
        }

        public SoftwareComponentBuilder withRepositoryFile(
                String repositoryFile) {
            this.repositoryFile = repositoryFile;
            return this;
        }

        public SoftwareComponentBuilder withModifiedDate(Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public SoftwareComponentBuilder but() {
            return aSoftwareComponent().withAddedDate(addedDate)
                    .withSoftwareType(softwareType)
                    .withSoftwareComponentVersion(softwareComponentVersion)
                    .withSoftwareComponentName(softwareComponentName)
                    .withReleaseDate(releaseDate)
                    .withRepositoryPath(repositoryPath)
                    .withRepositoryFile(repositoryFile)
                    .withModifiedDate(modifiedDate);
        }

        public SoftwareComponent build() {
            SoftwareComponent softwareComponent = new SoftwareComponent();
            softwareComponent.setAddedDate(addedDate);
            softwareComponent.setSoftwareType(softwareType);
            softwareComponent
                    .setSoftwareComponentVersion(softwareComponentVersion);
            softwareComponent.setSoftwareComponentName(softwareComponentName);
            softwareComponent.setReleaseDate(releaseDate);
            softwareComponent.setRepositoryPath(repositoryPath);
            softwareComponent.setRepositoryFile(repositoryFile);
            softwareComponent.setModifiedDate(modifiedDate);
            return softwareComponent;
        }
    }
}