public class Main {
    public static void main(String[] args)
    {
        int result = multiplyThreeNumbers(4,2,3);
        System.out.println("The result of your numbers is: " +result);
    }

    public static int multiplyThreeNumbers(int numA, int numB, int numC )
    {
        int solve = numA * numB * numC;
        return solve;
    }
}