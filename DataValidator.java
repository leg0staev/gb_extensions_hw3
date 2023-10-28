public class DataValidator {
    protected String[] userData;

    // public Validator(String userData){
    //     this.userData = userData.split(" ");
    // }

    public int setUserData(String data){
        String[] userData = data.split(" ");
        if (userData.length < 6 ) return -1;
        if (userData.length > 6 ) return -2;
        this.userData = userData;
        return 1;
    }

}
