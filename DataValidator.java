import java.util.regex.*;

public class DataValidator {
    protected String[] userData = new String[6];

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

    public String searchDate(String[] array) {
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{4}";

        String date = null;

        for (int index = 0; index < array.length; index++) {
            if (array[index] != null && Pattern.matches(pattern, array[index])) {
                date = array[index];
            }
        }
        return date;
    }

    public String searchGender(String[] array) {

        String gender = null;

        for (int index = 0; index < array.length; index++) {
            if (array[index] != null && (array[index].equals("m") || array[index].equals("f"))) {
                gender = array[index];
            }
        }

        return gender;
    }

    public Long searchPhone(String[] array) {

        Long phone = null;

        for (int index = 0; index < array.length; index++) {
            try {
                phone = Long.parseLong(array[index]);

            } catch (NumberFormatException e) {

            }
        }

        return phone;
    }

    public String searchSurname(String[] array, Human h) {

        String surname = null;
        for (String string : array) {
            if (!string.equals(h.getBirthday()) && !string.equals(h.getGender())
                    && !string.equals(Long.toString(h.getPhone()))) {
                surname = string;
                break;
            }
        }
        return surname;
    }

    public String searchName(String[] array, Human h) {

        String name = null;
        for (String string : array) {
            if (!string.equals(h.getBirthday())
                    && !string.equals(h.getGender())
                    && !string.equals(Long.toString(h.getPhone()))
                    && !string.equals(h.getSurname())) {

                name = string;
                break;
            }
        }
        return name;
    }

    public String searchPatronymic(String[] array, Human h) {

        String patronymic = null;

        for (String string : array) {
            if (!string.equals(h.getBirthday())
                && !string.equals(h.getGender())
                && !string.equals(Long.toString(h.getPhone()))
                && !string.equals(h.getSurname())
                && !string.equals(h.getName())) {

                patronymic = string;
                break;
            }
        }
        return patronymic;
    }

}