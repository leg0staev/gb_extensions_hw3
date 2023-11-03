public class InvalidUserGenderExeption extends RuntimeException {

    
    InvalidUserGenderExeption(String Gender) {
        super("Пол указан не в верном формате! Укажите f или m");
    }
    
    
    InvalidUserGenderExeption() {
        super("Пол не указан!");
    }
    
}