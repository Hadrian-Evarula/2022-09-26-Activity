import java.util.*;

public class Main{
    public static void main(String[]args) {

        ArrayList<Person> person = new ArrayList<Person>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many person you will input:");
        int count = input.nextInt();

        try {

            if (count > 5) {
                boolean y;
                while (y = true) {
                    System.out.println("-----------------------------------");
                    System.out.println("You're out of bound:");
                    System.out.println("-----------------------------------");
                    System.out.println("wanna try again?");
                    String yes = input.next();
                    if (yes == "yes") {
                        y = true;
                        return;
                    } else {
                        y = false;
                        break;
                    }
                }

            } else {

                int choice = -1;

                boolean f;

                while (f = true) {
                    System.out.println("------------------------------------");
                    System.out.println("1.Input:"); 
                    System.out.println("2.Display");
                    System.out.println("3.Exit");
                    System.out.println("------------------------------------");
                    System.out.println("Enter your choice:");

                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("Name:");
                        String name = input.next();
                        System.out.println("Age:");
                        int age = input.nextInt();
                        person.add(new Person(name, age));
                    }

                    else if (choice == 2) {

                        System.out.println(person);

                    } else if (choice == 3) {
                        System.out.println("Thank you for participating!");
                        System.out.println("you want to continue?");
                        String u = input.next();
                            if(u =="yes"){
                                return;
                            }else{
                                f = false;
                                break;
                            }
                        

                    } else if (choice >= 4) {
                       
                        System.out.println("Out of bound try to input another number!");
                        System.out.println("");
                    }else if(choice ==0){
                        System.out.println("Out of bound try to input another number!");
                        System.out.println("");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
