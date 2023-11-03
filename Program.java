import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Human human = new Human();
        DataChecker checker = new DataChecker();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                String userSurnameInput;
                System.out.print("введите Фамилию: ");
                userSurnameInput = scanner.nextLine();
                checker.checkSurname(userSurnameInput);
                human.setSurname(userSurnameInput);
                break;
            } catch (InavalidUserSurnameException iuse) {
                System.out.println(iuse.getMessage());

            }
        }

        while (true) {
            try {
                String userNameInput;
                System.out.print("введите Имя: ");
                userNameInput = scanner.nextLine();
                checker.checkName(userNameInput);
                human.setName(userNameInput);
                break;
            } catch (InavalidUserNameException iune) {
                System.out.println(iune.getMessage());

            }
        }

        while (true) {
            try {
                String userPatronymicInput;
                System.out.print("введите Отчество: ");
                userPatronymicInput = scanner.nextLine();
                checker.checkPatronymic(userPatronymicInput);
                human.setPatronymic(userPatronymicInput);
                break;
            } catch (InvalidUserPatronymicExeption iupe) {
                System.out.println(iupe.getMessage());

            }
        }

        while (true) {
            try {
                String userBirthday;
                System.out.print("введите др в формате dd.mm.yyyy: ");
                userBirthday = scanner.nextLine();
                checker.checkDate(userBirthday);
                human.setBirthday(userBirthday);
                break;
            } catch (InvalidUserBirthdayExeption iube) {
                System.out.println(iube.getMessage());

            }
        }

        while (true) {
            try {
                String userPhone;
                System.out.print("введите телефон: ");
                userPhone = scanner.nextLine();
                checker.checkPhone(userPhone);
                human.setPhone(Long.parseLong(userPhone));
                break;
            } catch (InvalidUserPhoneExeption iupe) {
                System.out.println(iupe.getMessage());

            }
        }

        while (true) {
            try {
                String userGender;
                System.out.print("введите Ваш пол: ");
                userGender = scanner.nextLine();
                checker.checkGender(userGender);
                human.setGender(userGender);
                break;
            } catch (InvalidUserGenderExeption iuge) {
                System.out.println(iuge.getMessage());

            }
        }

        scanner.close();

        System.out.println("Данные собраны. Сохраняю в файл");

        DataSaver saver = new DataSaver(human);
        saver.saveToFile();
    }
}
