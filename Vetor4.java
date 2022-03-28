import java.util.Random;
public class Vetor4 {
    
    public static void main(String[] args) {
        Random random=new Random();
        int numero[]={random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100),random.nextInt(100)};

        for (int index = 0; index < numero.length; index++){
            System.out.print(numero[index]+" ");
        }
        System.out.println(" ");
        for (int index = 0; index < numero.length; index++){
            if(numero[index]%2==0){
                System.out.print("Par: ");
                System.out.println(numero[index]);
            }
            else{
                System.out.print("Impar: ");
                System.out.println(numero[index]);
            }
        }

    }
}
