public class javaExercise {


    public static void fizzBuzz (int x) {
        for(int i = 0; i <= x; i++){
            if(i == 0){
                System.out.println(0);
                continue;
            }
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    

    public static String reverString(String x) {
        String reversedString = "";
        for(int i = x.length()-1; i >= 0; i--){
            reversedString += x.charAt(i);
        }
        return reversedString;

    }

    public static boolean palindomeCheck(String x) {
        String reversedString = "";
        for(int i = x.length()-1; i >= 0; i--){
            reversedString += x.charAt(i);
        }

        return reversedString.equalsIgnoreCase(x);
    }

    public static void main(String[] args) {
        fizzBuzz(187);
        System.out.println(reverString("this is a reversed string"));
        System.out.println(reverString("racecar"));

        System.out.println(palindomeCheck("bob"));
        System.out.println(palindomeCheck("Bob"));
        System.out.println(palindomeCheck("ooB"));
        System.out.println(palindomeCheck("oob"));
    }    
}