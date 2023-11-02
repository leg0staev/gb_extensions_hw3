public class InvalidUserGenderExeption extends NullPointerException {

    InvalidUserGenderExeption() {
        super("Пол не указан или указан не в верном формате");
    }
    
}