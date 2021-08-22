public class CheckForOption {
    public static void main(String[] args) {
        int position = 0;
        int dieRoll = 1 + (int) Math.floor(Math.random()*10)%6; // dieroll 6
        System.out.println("dir roll: " +dieRoll);//dieroll6
        int check = (int) Math.floor(Math.random()*10)%3;// check4
        if (check == 0) {//check 4

            System.out.println("no palyer ");
        }
        else if (check == 1) {
            position += dieRoll;
            System.out.println(" ladder come ");
        }
        else {
            position -= dieRoll;//position=0  dieroll =6
                                 //positio = -6 dieroll 6
            System.out.println("snake come ");
        }


    }
}