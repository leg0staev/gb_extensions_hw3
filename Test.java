public class Test {
    public static void main(String[] args) {
        String[] arr = { "null", null };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("m") || arr[i].equals("f")) {
                System.out.println(" all OK");
            } else {
                System.out.println(" не ок");

            }
        }

    }
}