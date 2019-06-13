public class TestClass {
    public static void main(String[] args) {
        System.out.println("Test class executed.");
    }

    public static int sumOfTwoNumbers(int firstNum, int secondNum) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return firstNum + secondNum;
    }

    public static int divideTwoNumbers(int firstNum, int secondNum) {
        if(firstNum == 0 || secondNum == 0) {
            throw new IllegalArgumentException("Arguments must be not zero");
        }
        return firstNum / secondNum;
    }

    public static boolean isNegativeNumber(int number) {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (number > 0) {
            return false;
        }
        return true;
    }

    public static String helloPrint() {
        return "Hello";
    }

}
