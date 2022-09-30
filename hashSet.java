/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashset;

import java.util.*;
import static java.lang.System.*;

public class hashSet {

    /**
     * @param args the command line arguments
     */
    public void addHash() {
        HashSet<String> set = new HashSet<String>();
        Scanner input = new Scanner(System.in);

        out.println("Enter first number :");
        int num1 = input.nextInt();
        set.add(String.valueOf(num1));
        out.println("Enter second number :");
        int num2 = input.nextInt();
        set.add(String.valueOf(num2));
        out.println("Enter third number :");
        int num3 = input.nextInt();
        set.add(String.valueOf(num3));
        out.println("Enter fourth number :");
        int num4 = input.nextInt();
        set.add(String.valueOf(num4));
        out.println("Enter fifth number :");
        int num5 = input.nextInt();
        set.add(String.valueOf(num5));
        out.println("...........................................................");
        out.println(set);
        out.println("...........................................................");

    }

    public void Remove() {
        HashSet<String> set = new HashSet<String>();
        Scanner input = new Scanner(System.in);

        out.println("Enter first number :");
        int num1 = input.nextInt();
        set.add(String.valueOf(num1));
        out.println("Enter second number :");
        int num2 = input.nextInt();
        set.add(String.valueOf(num2));
        out.println("Enter third number :");
        int num3 = input.nextInt();
        set.add(String.valueOf(num3));
        out.println("Enter fourth number :");
        int num4 = input.nextInt();
        set.add(String.valueOf(num4));
        out.println("Enter fifth number :");    
        int num5 = input.nextInt();
        set.add(String.valueOf(num5));
        out.println("...........................................................");
        out.println(set);
        out.println("...........................................................");
        out.println("choose index you want to remove(0-4) :");
        String[] Geeks = set.toArray(new String[set.size()]);
        int index = input.nextInt();
        set.remove(index);
        out.println("After removing the index:" + set);

    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        HashSet<String> set1 = new HashSet<String>();
        Scanner input = new Scanner(System.in);
        hashSet n = new hashSet();

        String yes, no;
        out.println("would you want to Enter(yes/no) :");
        String would = input.next();

        if (would.equals("no")) {
            out.println("Thank you for participating!");
        } else {
            while (true) {
                char A, B, C, D, E;
                out.println("A. Add number");
                out.println("B. Remove number");
                out.println("C. Display");
                out.println("D. Clear number");
                out.println("E. Exit");
                out.println("...........................................................");

                out.println("Choose letter above :");
                String choose = input.next();

                if (choose.equals("A")) {
                    out.println("A. Add number");
                    n.addHash();
                   

                } else if (choose.equals("B")) {
                    out.println("B. Remove number");
                    n.Remove();

                    out.println("would you like to clear all the numbers(yes/no)?");
                    String why = input.next();
                    if (why.equals("yes")) {
                        set.clear();
                        out.println("[]");
                        out.println("...........................................................");
                        continue;
                    } else {
                        out.println("Thank you please proceed!");
                        out.println("...........................................................");
                        continue;

                    }
                } else if (choose.equals("C")) {
                    out.println("C. Display");
                    out.println("[]");
                    out.println("...........................................................");

                } else if (choose.equals("D")) {
                    out.println("D. Clear number");
                    set.clear();
                    out.println("[]");
                    out.println("...........................................................");
                } else if (choose.equals("E")) {
                    out.println("Thank you!");
                    out.println("...........................................................");
                    out.print("would you like to go on(yes/no) ?");
                    String ko = input.next();
                    if (ko.equals("yes")) {
                        out.println("Thank you Kindly proceed!");
                        out.println("...........................................................");
                        continue;
                    } else {
                        out.println("Thank you and God bless!");
                        break;
                    }
                }

            }

        }
    }

}
