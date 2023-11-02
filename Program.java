import java.io.IOException;
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

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
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

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
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
            } catch (InvalidUserPatronymicExeption iune) {
                System.out.println(iune.getMessage());

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }

        scanner.close();
    }
}
