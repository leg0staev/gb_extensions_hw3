import java.io.IOException;

public class DataChecker {
    
    public void checkSurname(String surname) throws IOException {
        if (surname.length() == 0) throw new InavalidUserSurnameException();
    }

    public void checkName(String name) throws IOException {
        if(name.length() == 0) throw new InavalidUserNameException();
    }

    public void checkPatronymic(String patronymic) throws IOException {
        if(patronymic.length() == 0) throw new InavalidUserNameException();
    }
}
