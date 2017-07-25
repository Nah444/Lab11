/**
 * Created by Grand Circus Student on 7/24/2017.
 */

//Point is to add something different for the building parameter that building doesn't have
public class House extends Building {

        private String familyName;
        //Forcing them to have location, sqFt, and familyName

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public House(String location, int sqFt, String familyName) {
        super(location, sqFt);


    }
}

