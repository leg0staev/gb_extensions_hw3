import java.io.IOException;

public class InavalidUserNameException extends IOException {

    InavalidUserNameException() {
        super("Имя не указано!");
    }
    
}
