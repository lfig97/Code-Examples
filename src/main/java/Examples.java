public class Examples {
    public static void main(String[] args) {
        //Variables
        int age = 24;
        boolean inSchool = true;
        String trafficLight = "";

        //Strings
        String firstName = "Luis";
        String lastName = "Figueroa";

        //Math Operators
        int num = 1 + 2;
        int num2 = 1 - 2;
        int num3 = 1 * 2;
        int num4 = 1 / 2;

        //TypeCasting
        int num5 = 7;
        char letter = (char) num5;

        //IfElse
        if (inSchool == true){
            System.out.println(firstName + " " + "is in school");
        }
        else {
            System.out.println(firstName + " " + "is not in school");
        }

        //Switch Statement
        switch (trafficLight){
            case "red":
                System.out.println("stop");
                break;
            case "yellow":
                System.out.println("prepare to stop");
                break;
            case "green":
                System.out.println("go");
        }

        //While Loop
        int number = 0;
        while (number < 31){
            System.out.println(number);
            number++;
        }

        //For Loop
        for (int i = 0;i < 5;i++){
            System.out.println(age);
        }

        //Arrays and Methods
        String[] fullName = {"Luis", "Salomon", "Figueroa"};
        printName(fullName);
    }
    public static void printName(String[] name){
        for(int i = 0; i < 3; i++){
            System.out.println(name[i]);
        }
    }

}
