import java.util.Scanner;
public class Vetor5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int codigo[]=new int[5];
        String nome[]=new String [5];
        double preco[]=new double[5];
        for (int i = 0; i < preco.length; i++){
            System.out.println("Digite o código do produto");
            codigo[i]=sc.nextInt();
            System.out.println("Digite o nome do produto");
            nome[i]=sc.next();
            System.out.println("Digite o preço do produto");
            preco[i]=sc.nextDouble();
        }
        for (int i = 0; i < preco.length; i++){
            System.out.println("Código: "+codigo[i]);
            System.out.println("Nome: "+nome[i]);
            if(preco[i]>120){
                System.out.println("Preço: "+(preco[i]+20));
            }
            else{
                System.out.println("Preço: "+(preco[i]));
            }
            
        }
        sc.close();
    }
    
}
