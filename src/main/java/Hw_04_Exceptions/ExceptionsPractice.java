package Hw_04_Exceptions;

public class ExceptionsPractice {

    public static void main(String[] args) throws InterruptedException, ArithmeticException {

        pause(5000);
        calculator(9, 0);
    }

    private static void calculator(int dividend, int divider) throws ArithmeticException {

//        int reuslt = dividend / divider;
//        System.out.println(result);

        try {

            System.out.println(dividend / divider);

        } catch (Exception e) {

            e.getStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());

        } finally {

            System.out.println("finally");
        }
    }

    private static void pause(int time) throws InterruptedException {

//        Thread.sleep(5000);

        try {

            Thread.sleep(5000);

        } catch (InterruptedException e) {

            throw new RuntimeException();

        } finally {

            System.out.println("finally");
        }
    }
}
