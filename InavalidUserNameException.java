public class InavalidUserNameException extends NullPointerException {

    InavalidUserNameException() {
        super("Имя не указано или указано не в верном формате");
    }
    
}
