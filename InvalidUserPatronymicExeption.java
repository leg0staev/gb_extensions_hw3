import java.io.IOException;

public class InvalidUserPatronymicExeption extends IOException {

    InvalidUserPatronymicExeption() {
        super("Отчество не указано!");
    }
    
}