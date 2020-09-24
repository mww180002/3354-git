package adder;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            if(args.length == 0){
                throw new Exception();
            }
            else if(args[0].equals("-") && args.length == 1) {
                throw new Exception();
            }
            for(int i = 0; i < args.length; i++){
                if (!args[0].equals("-")){
                    int num = Integer.parseInt(args[i]);
                }
                else if(args[0].equals("-") && i != 0){
                    int num = Integer.parseInt(args[i]);
                }
            }
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(args.length < 2) {
                System.err.println("Not enough arguments.");
            }
            else{
                System.err.println("Invalid character.");
            }
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
