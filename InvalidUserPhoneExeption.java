public class InvalidUserPhoneExeption extends NumberFormatException {

    InvalidUserPhoneExeption(String phone) {
        super("Введите телефон цифрами!");
    }

    InvalidUserPhoneExeption() {
        super("Телефон не указан!");
    }
    
}