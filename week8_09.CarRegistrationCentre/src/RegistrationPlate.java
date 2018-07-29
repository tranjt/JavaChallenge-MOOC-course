
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return this.country + " " + this.regCode;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this.getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;
        
        if (!this.country.equals(compared.getCountry()) || this.country == null) {
            return false;
        }
         if (!this.regCode.equals(compared.getRegCode()) ) {
            return false;
        }
        return true;
    }
    
    public int hashCode() {
        if (this.country == null || this.regCode == null) {
            return -1;
        }
        
        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    

    public String getRegCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }
    

}
