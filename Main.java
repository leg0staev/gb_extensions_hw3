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

        String[] userInputArr = userInput.split(" ");

        human.setBirthday(validator.searchDate(userInputArr));
        human.setGender(validator.searchGender(userInputArr));
        human.setPhone(validator.searchPhone(userInputArr));
        human.setSurname(validator.searchName(userInputArr, human));
        human.setName(validator.searchName(userInputArr, human));
        human.setPatronymic(validator.searchPatronymic(userInputArr, human));

        System.out.println(human);




    }
}