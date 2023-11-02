public class InavalidUserSurnameException extends NullPointerException {

    InavalidUserSurnameException() {
        super("Фамилия не указана или указана не в верном формате");
    }
    
}
