package control;
import operaciones.Mes;
import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Mes[] meses = Mes.values();
        
        System.out.print("\nEscribe un numero de dia: ");
        int dia=sc.nextInt();
        
        for(int i=0; i<meses.length; i++){
            if(meses[i].getNumDias()==dia){
                System.out.println(meses[i].toString());
            }
        }
    }
}