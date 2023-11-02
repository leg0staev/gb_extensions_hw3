import java.util.regex.*;

public class DataValidator {
    protected String[] userData = new String[6];


    public int setUserData(String data) {
        String[] userData = data.split(" ");
        if (userData.length < 6)
            return -1;
        if (userData.length > 6)
            return -2;
        this.userData = userData;
        return 1;
    }

    public String searchDate() {
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{4}";

        String date = null;

        for (int index = 0; index < this.userData.length; index++) {
            if (this.userData[index] != null && Pattern.matches(pattern, this.userData[index])) {
                date = this.userData[index];
            }
        }
        return date;
    }

    public String searchGender() {

        String gender = null;

        for (int index = 0; index < this.userData.length; index++) {
            if (this.userData[index] != null && (this.userData[index].equals("m") || this.userData[index].equals("f"))) {
                gender = this.userData[index];
            }
        }

        return gender;
    }

    public Long searchPhone() {

        Long phone = null;

        for (int index = 0; index < this.userData.length; index++) {
            try {
                phone = Long.parseLong(this.userData[index]);

            } catch (NumberFormatException e) {

            }
        }

        return phone;
    }

    public String searchSurname(Human h) {

        String surname = null;
        for (String string : this.userData) {
            if (!string.equals(h.getBirthday()) && !string.equals(h.getGender())
                    && !string.equals(Long.toString(h.getPhone()))) {
                surname = string;
                break;
            }
        }
        return surname;
    }

    public String searchName(Human h) {

        String name = null;
        for (String string : this.userData) {
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

    public String searchPatronymic(Human h) {

        String patronymic = null;

        for (String string : this.userData) {
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