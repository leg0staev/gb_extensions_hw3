import java.io.IOException;

public class InavalidUserSurnameException extends IOException {

    InavalidUserSurnameException() {
        super("Фамилия не указана!");
    }
    
}
