package dk.kimhrac.app.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

/**
 * Locale
 */
@Entity
@Table(name = "Locale")
public class Locale extends AbstractEntity {

    @OneToMany(mappedBy="locale")
    private Set<SystemLocaleMap> systemLocaleMaps;

    private String countryCode = null; // VARCHAR(200) NULL DEFAULT NULL
    private String languageCode = null; // VARCHAR(200) NULL DEFAULT NULL

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * @param languageCode the languageCode to set
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Set<SystemLocaleMap> getSystemLocaleMaps() {
        return systemLocaleMaps;
    }

    public void setSystemLocaleMaps(Set<SystemLocaleMap> systemLocaleMaps) {
        this.systemLocaleMaps = systemLocaleMaps;
    }

    public static interface CountryCodeStep {
        LanguageCodeStep withCountryCode(String countryCode);
    }

    public static interface LanguageCodeStep {
        SystemLocaleMapsStep withLanguageCode(String languageCode);
    }

    public static interface SystemLocaleMapsStep {
        AddedDateStep withSystemLocaleMaps(
                Set<SystemLocaleMap> systemLocaleMaps);
    }

    public static interface AddedDateStep {
        ModifiedDateStep withAddedDate(Date addedDate);
    }

    public static interface ModifiedDateStep {
        BuildStep withModifiedDate(Date modifiedDate);
    }

    public static interface BuildStep {
        Locale build();
    }

    public static class Builder
            implements CountryCodeStep, LanguageCodeStep, SystemLocaleMapsStep,
            AddedDateStep, ModifiedDateStep, BuildStep {
        private String countryCode;
        private String languageCode;
        private Set<SystemLocaleMap> systemLocaleMaps;
        private Date addedDate;
        private Date modifiedDate;

        private Builder() {
        }

        public static CountryCodeStep locale() {
            return new Builder();
        }

        @Override
        public LanguageCodeStep withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @Override
        public SystemLocaleMapsStep withLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        @Override
        public AddedDateStep withSystemLocaleMaps(
                Set<SystemLocaleMap> systemLocaleMaps) {
            this.systemLocaleMaps = systemLocaleMaps;
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
        public Locale build() {
            Locale locale = new Locale();
            locale.setCountryCode(this.countryCode);
            locale.setLanguageCode(this.languageCode);
            locale.setSystemLocaleMaps(this.systemLocaleMaps);
            locale.setAddedDate(this.addedDate);
            locale.setModifiedDate(this.modifiedDate);
            return locale;
        }
    }
}