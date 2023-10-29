import java.util.regex.*;

public class DataValidator {
    protected String[] userData = new String[6];
    protected Human h;

    // public Validator(String userData){
    // this.userData = userData.split(" ");
    // }

    public int setUserData(String data) {
        String[] userData = data.split(" ");
        if (userData.length < 6)
            return -1;
        if (userData.length > 6)
            return -2;
        this.userData = userData;
        return 1;
    }

    public void searchDate(String[] array) {
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{4}";

        for (int index = 0; index < array.length; index++) {
            if (array[index] != null && Pattern.matches(pattern, array[index])) {
                h.setBirthday(array[index]);
                array[index] = null;
            }
        }
    }

    public void searchGender(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null && (array[index].equals("m") || array[index].equals("f"))) {
                h.setGender(array[index]);
                array[index] = null;
            }
        }
    }

    // public void searchPhone(String[] array) {
    //     for (int index = 0; index < array.length; index++) {
    //         try {
    //             Integer.parseInt(array[index])
    //         };
    //     }
    // }
    

}
