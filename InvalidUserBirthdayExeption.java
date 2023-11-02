public class InvalidUserBirthdayExeption extends NullPointerException {

    InvalidUserBirthdayExeption() {
        super("Дата рождения не указана или указана не в верном формате");
    }
    
}