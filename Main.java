import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DataValidator validator = new DataValidator();
        Human human = new Human();
        
        String userInput;
        
        try (Scanner scanner = new Scanner(System.in)) {
            int quantityValidation;
            do {
                System.out.print("введите данные через пробел - ФИО, др в формате dd.mm.yyyy, тел, пол (f/m): ");
                userInput = scanner.nextLine();
                
                quantityValidation = validator.setUserData(userInput);
                
                if (quantityValidation == -1) {
                    System.out.println("Вы ввели мало данных, попробуйте еще раз");
                }
                
                if (quantityValidation == -2) {
                    System.out.println("Вы ввели много данных, попробуйте еще раз");
                }
                
            } while (quantityValidation != 1);
            
            System.out.println("Данные прияты!");
            
        }
                
        human.setBirthday(validator.searchDate());
        human.setGender(validator.searchGender());
        human.setPhone(validator.searchPhone());
        human.setSurname(validator.searchName(human));
        human.setName(validator.searchName(human));
        human.setPatronymic(validator.searchPatronymic(human));

        System.out.println(human);

    }
}