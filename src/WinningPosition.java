public class WinningPosition {
    public static void main(String[] args) {
        int position = 0;
        while ( position != 100 ){
        int dieroll = 1 + (int) Math.floor(Math.random()*10)%6;
        System.out.println(" Die Roll :" +dieroll);
        int check = (int) Math.floor(Math.random()*10)%3;
        if ( check == 0){
            System.out.println("no player");
        }
        else if (check == 1){
            check += dieroll;
            System.out.println("ladder come");
        }
        else{
              System.out.println("snake come");
              if ((position - dieroll)<0)
              {
                position = 0;
              }

              else
              {
               position -= dieroll;
              }
        }
    }
}
}