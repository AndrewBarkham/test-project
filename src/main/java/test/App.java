package test;

public class App
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Concatenating 'Hello' and 'Mate' equals " + obj.concatenate("Hello", "Mate"));
        System.out.println("Multiplying 4 by 10 equals " + obj.multiply(4, 10));
        System.out.println("Adding 2 to 3 equals " + obj.add(2, 3));
    }

    public String concatenate(String one, String two){

        return one + two;

    }

    public int multiply(int a, int b){

        return a * b;

    }

    public int add(int a, int b){

        return a + b;

    }
}