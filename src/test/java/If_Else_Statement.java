public class If_Else_Statement {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < number.length; i++){
            if (number [i] % 2 == 0) {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < number.length; i++){
            if (number [i] % 2!= 0){
                System.out.print(number[i] + " ");
            }
        }
        System.out.println("");
    }
    }

