package test;

public class App
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Concatenating 'Hello' and 'World' equals " + obj.concatenate("Hello", "World"));
        System.out.println("Multiplying 4 by 10 equals " + obj.multiply(4, 10));
    }

    public String concatenate(String one, String two){

        return one + two;

    }

    public int multiply(int a, int b){

        return a * b;

    }
}