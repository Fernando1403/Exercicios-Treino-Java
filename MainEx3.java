public class MainEx3 {

    public static void main(String[] args) {

        int [][] numero = new int[3][3];

        int x = 1;

        for (int i = 0; i < numero.length; i++){
            for (int j = 0; j < numero.length; j++){
                numero[i][j] = x;
                x++;
            }
        }

        for (int i = 0; i < numero.length; i++){
            for (int j = 0; j < numero.length; j++){
               System.out.println(numero[i][j]);
            }
            System.out.println();
        }
    }
}
