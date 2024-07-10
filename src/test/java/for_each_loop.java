
public class for_each_loop {
    public static void main (String [] args){

        String[] ar ={"Black", "Blue", "White", "Red", "Yellow" };

        for (String Color  : ar)
            System.out.print(Color + " " );

        for(String Color : ar){
            if(Color != "White")
                System.out.print(Color + " ");
        }
    }
}
