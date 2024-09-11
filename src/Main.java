/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        System.out.println(Main.add(5,7));

        System.out.println(Main.addTwo(5,7, 6, 6));

        System.out.println(Main.morningGreeting("Toby Fox"));

        System.out.println(Main.afternoonGreeting("Mac Miller"));

        System.out.println(Main.triple("oohbaby"));

        System.out.println(Main.half(19));

        System.out.println( Main.roundPositiveValueToNearestInteger(8.5));
        System.out.println(Main.roundPositiveValueToNearestInteger(8.49));

        System.out.println( Main.roundNegativeValueToNearestInteger(-8.49));
        System.out.println(Main.roundNegativeValueToNearestInteger(-8.5));
    }

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int addTwo (int a, int b, int c, int d){
        return a+b+c+d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好， " + name + "!";
    }
    // 5. triple
    public static String triple(String name){
        return name+name+name;
    }

    // 6. half
    public static double half(int a){
        return a/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double b) {
        return (int) Math.round(b-1);
    }
}
