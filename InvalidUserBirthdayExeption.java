public class InvalidUserBirthdayExeption extends RuntimeException {


    InvalidUserBirthdayExeption(String date) {
        super("формат даты длжен быть dd.mm.yyyy!");
    } 


    InvalidUserBirthdayExeption() {
        super("Дата рождения не указана!");
    }
    
}