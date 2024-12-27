public class Main {
    public static void main(String[] args) {
        classeCasting();
    }

    private static void classeCasting() {
        System.out.println("**** classeCasting ****");

        int num1 = 1;
        System.out.println(num1);

        int num2 = (Integer) num1;
        System.out.println(num2);

    }

}