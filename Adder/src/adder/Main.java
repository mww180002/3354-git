package adder;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide some integers to add.");
        }
    }

    private static int addArguments(String[] args) {
        String input = "";
        int total = 0;
        for (String str : args){
            if(!str.equals("-")){
                input = input + str + " ";
            }
        }
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            if(args[0].equals("-")) {
                total -= scanner.nextInt();
            }
            else{
                total += scanner.nextInt();
            }
        }


        return total;
    }
}
