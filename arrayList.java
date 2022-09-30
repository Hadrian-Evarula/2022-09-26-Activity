
package haddyassignment;

import static java.lang.System.*;
import java.util.*;

public class arrayList {


    public static void main(String[] args) {

        try {
             Scanner input = new Scanner(System.in);
            String yes, no;
            out.print("Are you sure you want to participate?");
            String one = input.next();
            
            
               
            
                if (one.equals("no")) {
                   out.println("Thank you!");
                    
                } else {
                    while (true) {

                    ArrayList<String> numbers = new ArrayList<>();
                    out.println("ArrayList implementation");
                    out.println("A. Add Number");
                    out.println("B. Remove Number");
                    out.println("C. Display Number");
                    out.println("D. Clear number");
                    out.println("");
                    out.println("...........................................................");

                    out.println("A. Add Number");

                    out.println("What is your Favorite number :");
                    int number = input.nextInt();
                    numbers.add(String.valueOf(number));
                    out.println("What is your less favorite number :");
                    int number2 = input.nextInt();
                    numbers.add(String.valueOf(number2));
                    out.println("Enter your second fav number :");
                    int number3 = input.nextInt();
                    numbers.add(String.valueOf(number3));
                    out.println("Enter your third choice of number :");
                    int number4 = input.nextInt();
                    numbers.add(String.valueOf(number4));
                    out.println("Enter your fourth number :");
                    int number5 = input.nextInt();
                    numbers.add(String.valueOf(number5));
                    out.println("");
                    out.println("...........................................................");
                    out.println("");
                    out.println("C. Display numbers");

                    out.println(numbers);

                    out.println("...........................................................");
                    out.println("");
                    out.println("B. Remove index in an array (0-4): ");
                    int index = input.nextInt();
                    numbers.remove(index);
                    out.print("Display");
                    out.print(numbers);

                    out.println("");
                    out.println("...........................................................");
                    out.println("");

                    out.println("D. Clear array list(ok/not)?");
                    String i = input.next();
                    
                    if(i.equals("ok")){
                        out.println("");
                    out.println("C. Display");
                    out.println("[]");
                    out.println("...........................................................");
                    out.println("");
                    }else{
                        out.println(numbers);
                        continue;
                    }
                    
                    
                     out.print("E. Continue (y/n)?");
                        String ones = input.next();
                        String y,n;
                        if(ones.equals("y")){
                            continue;
                        }else{
                            break;
                        }
                        

                }

            }

        } catch (Exception e) {
            out.println(e);
        }

    }
}
