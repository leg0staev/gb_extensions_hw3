import java.util.regex.Pattern;

public class DataChecker {

    public void checkSurname(String surname) throws InavalidUserSurnameException {
        if (surname.length() == 0)
            throw new InavalidUserSurnameException();
    }

    public void checkName(String name) throws InavalidUserNameException {
        if (name.length() == 0)
            throw new InavalidUserNameException();
    }

    public void checkPatronymic(String patronymic) throws InvalidUserPatronymicExeption {
        if (patronymic.length() == 0)
            throw new InvalidUserPatronymicExeption();
    }

    public void checkDate(String date) throws InvalidUserBirthdayExeption {
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{4}";

        if (date.length() == 0)
            throw new InvalidUserBirthdayExeption();
        if (!Pattern.matches(pattern, date))
            throw new InvalidUserBirthdayExeption(date);
    }

    public void checkPhone(String phone) throws InvalidUserPhoneExeption {

        if (phone.length() == 0) {
            throw new InvalidUserPhoneExeption();
        }

        try {
            Long.parseLong(phone);
        } catch (NumberFormatException e) {
            throw new InvalidUserPhoneExeption(phone);
        }
    }

    public void checkGender(String gender) throws InvalidUserGenderExeption {

        if (gender.length() == 0)
            throw new InvalidUserGenderExeption();
        if (!gender.equals("m") && !gender.equals("f"))
            throw new InvalidUserGenderExeption(gender);
    }

}
