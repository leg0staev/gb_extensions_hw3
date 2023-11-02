public class InvalidUserPhoneExeption extends NullPointerException {

    InvalidUserPhoneExeption() {
        super("Телефон не указан или указан не в верном формате");
    }
    
}