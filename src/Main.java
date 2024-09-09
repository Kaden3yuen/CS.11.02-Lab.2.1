/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

        int result = add(3 , 8);
        System.out.println(result);

        int addFour = addTwo(3 , 8, 4, 9);
        System.out.println(addFour);

        String morningGreetingsResults = morningGreetings("Kaden");
        System.out.println(morningGreetingsResults);

        String afternoonGreetingResults = afternoonGreetings("Kaden");
        System.out.println(afternoonGreetingResults);

        String tripletResults = triplets("ohhhbaby");
        System.out.println(tripletResults);

        double halvesResult = halves(6);
        System.out.println(halvesResult);

        double roundedPositive1 = round1(8.5);
        System.out.println(roundedPositive1);

        double roundedPositive2 = round2(8.49);
        System.out.println(roundedPositive2);

        double roundnegative1 = round4(-8.49);
        System.out.println(roundnegative1);

        double roundnegative2 = round3(-8.51);
        System.out.println(roundnegative2);

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
    public static String morningGreetings(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreetings(String name){
        return "下午好， " + name + "!";
    }
    // 5. triple
    public static String triplets(String name){
        return name+name+name;
    }

    // 6. half
    public static double halves(int a){
        return a/2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double round1(double a){
        return (int) Math.round(a);
    }
    public static double round2(double b) {
        return (int) Math.round(b);
    }
    // 8. roundNegativeValueToNearestInteger
    public static double round3(double c){
        return (int) Math.round(c);
    }
    public static double round4(double d) {
        return (int) Math.round(d);
    }
}
