public class InvalidUserPatronymicExeption extends NullPointerException {

    InvalidUserPatronymicExeption() {
        super("Отчество не указано или указана не в верном формате");
    }
    
}