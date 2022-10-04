import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> human = new ArrayList<String>();

        Person<String> personFirst =new Person<String>();
        personFirst.setMyName("Hadrian Evarula");
        personFirst.setMyDetails("Good person");
        personFirst.setMyVehicle("I love driving motorcycle");
        human.add("\""+ personFirst.getMyName() + "\"" + " from "+ personFirst.getMyDetails() + " by: " + personFirst.getMyVehicle());


        Person<String> personSecond =new Person<String>();
        personSecond.setMyName("Haplas Tambal");
        personSecond.setMyDetails("Healer person");
        personSecond.setMyVehicle("I love driving Bike");   
        human.add("\""+ personSecond.getMyName() + "\"" + " from "+ personSecond.getMyDetails() + " by: " + personSecond.getMyVehicle());     

        Person<String> personThird =new Person<String>();
        personThird.setMyName("Sosiete Bedoria");
        personThird.setMyDetails("Sister person");
        personThird.setMyVehicle("I love driving DriveMax");  
        human.add("\""+ personThird.getMyName() + "\"" + " from "+ personThird.getMyDetails() + " by: " + personThird.getMyVehicle());    

        Person<String> personFourth =new Person<String>();
        personFourth.setMyName("JunJun Calesa");
        personFourth.setMyDetails("Sister's of mary person");
        personFourth.setMyVehicle("I love driving Hot Air balloon");      
        human.add("\""+ personFourth.getMyName() + "\"" + " from "+ personFourth.getMyDetails() + " by: " + personFourth.getMyVehicle());

        Person<String> personFifth =new Person<String>();
        personFifth.setMyName("Ethyl Sotero");
        personFifth.setMyDetails("Mother");
        personFifth.setMyVehicle("I love riding Bus");
        human.add("\""+ personFifth.getMyName() + "\"" + " from "+ personFifth.getMyDetails() + " by: " + personFifth.getMyVehicle());

        System.out.print("Enter the index you want:");
        int input=sc.nextInt();

        try{
            if(input < 0){
                sc.close();
                throw new PersonException("Your input is negative. Please input positive index.");
            }
            if(input > 5){
                sc.close();
                throw new PersonException("Your input exceeds the size of array.");
            }

            System.out.println("Book Index: " + input);
            System.out.println(human.get(input));

        }
        catch(PersonException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}