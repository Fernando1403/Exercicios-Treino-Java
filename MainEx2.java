import java.util.Scanner;

public class MainEx2 {

    public static void main(String[] args) {
        String[] nomes = new String[] {"Maria", "Joao","Jose","Caio","Ana"};

        for(int i = 0; i< nomes.length; i++){
            System.out.println(nomes[i] + "");
        }

        Scanner input = new Scanner(System.in);

        String valor = input.nextLine();

        nomes[2] = String.valueOf(valor);

        for(int i = 0; i< nomes.length; i++){
            System.out.println(nomes[i] + "");
        }
    }
}
