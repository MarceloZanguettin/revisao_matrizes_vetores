import java.util.Scanner;
public class Vetor2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=5;
        String funcionario[]=new String[n];

        for (int index = 0; index < funcionario.length; index++){
            System.out.println("Digite o nome do funcionário: ");
            funcionario[index]=sc.next();
        }
        for (int index = 0; index < funcionario.length; index++){
            System.out.println(funcionario[index]);
        }
        sc.close();
    }
}
