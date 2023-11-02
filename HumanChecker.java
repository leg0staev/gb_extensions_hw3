public class HumanChecker {

    protected Human h;

    public HumanChecker(Human h) {
        this.h = h;
    }

    public void checkHumanSurname() throws InavalidUserSurnameException {

        if (h.getSurname() == null)
            throw new InavalidUserSurnameException();
    }

    public void checkHumanName() throws InavalidUserNameException {
        if (h.getName() == null)
            throw new InavalidUserNameException();
    }

    public void checkHumanPatronymic() throws InvalidUserPatronymicExeption {
        if (h.getPatronymic() == null)
            throw new InvalidUserPatronymicExeption();
    }

    public void checkHumanGender() throws InvalidUserGenderExeption {
        if (h.getGender() == null)
            throw new InvalidUserGenderExeption();
    }

    public void checkHumanPhone() throws InvalidUserPhoneExeption {
        if (h.getPhone() == null)
            throw new InvalidUserPhoneExeption();
    }

    public void checkHumanBirthday() throws InvalidUserBirthdayExeption {
        if (h.getBirthday() == null)
            throw new InvalidUserBirthdayExeption();
    }

}
