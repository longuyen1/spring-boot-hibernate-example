package dk.kimhrac.app.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * PredecessorReleaseMap
 */
@Entity
@Table(name = "PredecessorReleaseMap")
public class PredecessorReleaseMap extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="locale_id")
    private PredecessorReleaseMap predecessorRelease = null;                                                                        // INT(10) UNSIGNED NOT NULL

    @ManyToOne
    @JoinColumn(name="systemRelease_id")
    private SystemRelease systemRelease = null;                                                                            // INT(10) UNSIGNED NOT NULL

    private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL

    public PredecessorReleaseMap getPredecessorRelease() {
        return predecessorRelease;
    }

    public void setPredecessorRelease(
            PredecessorReleaseMap predecessorRelease) {
        this.predecessorRelease = predecessorRelease;
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

    public static class PredecessorReleaseMapBuilder {
        private Date addedDate = null;                                                                                    // TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
        private PredecessorReleaseMap predecessorRelease = null;                                                                        // INT(10) UNSIGNED NOT NULL
        private String mapName = null;                                                                                    // VARCHAR(200) NULL DEFAULT NULL
        private Date modifiedDate = null;

        private PredecessorReleaseMapBuilder() {
        }

        public static PredecessorReleaseMapBuilder aPredecessorReleaseMap() {
            return new PredecessorReleaseMapBuilder();
        }

        public PredecessorReleaseMapBuilder withAddedDate(Date addedDate) {
            this.addedDate = addedDate;
            return this;
        }

        public PredecessorReleaseMapBuilder withPredecessorRelease(
                PredecessorReleaseMap predecessorRelease) {
            this.predecessorRelease = predecessorRelease;
            return this;
        }

        public PredecessorReleaseMapBuilder withMapName(String mapName) {
            this.mapName = mapName;
            return this;
        }

        public PredecessorReleaseMapBuilder withModifiedDate(
                Date modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        public PredecessorReleaseMapBuilder but() {
            return aPredecessorReleaseMap().withAddedDate(addedDate)
                    .withPredecessorRelease(predecessorRelease)
                    .withMapName(mapName).withModifiedDate(modifiedDate);
        }

        public PredecessorReleaseMap build() {
            PredecessorReleaseMap predecessorReleaseMap = new PredecessorReleaseMap();
            predecessorReleaseMap.setAddedDate(addedDate);
            predecessorReleaseMap.setPredecessorRelease(predecessorRelease);
            predecessorReleaseMap.setMapName(mapName);
            predecessorReleaseMap.setModifiedDate(modifiedDate);
            return predecessorReleaseMap;
        }
    }
}