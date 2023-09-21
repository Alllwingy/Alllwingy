package Hw_04_Exceptions;

public class ExceptionsPractice {

    public static void main(String[] args) throws InterruptedException {

        pause();
        calculator();
    }

    private static void calculator() throws ArithmeticException {

//        System.out.println(9 / 0);

        try {

            System.out.println(9 / 0);

        } catch (Exception e) {

            e.getStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());

        } finally {

            System.out.println("finally");
        }
    }

    private static void pause() throws InterruptedException {

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
