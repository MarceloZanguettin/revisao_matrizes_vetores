public class Vetor3 {
    
    public static void main(String[] args){

        String meses[]={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("1ª Semestre");
        for (int i=  0; i < (meses.length)/2; i++){
            System.out.println(meses[i]);
        }

        System.out.println("2ª Semestre");
        for (int i=  6; i < meses.length; i++){
            System.out.println(meses[i]);
        }
    }
}
