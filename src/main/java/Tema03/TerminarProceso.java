package Tema03;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Gipsy Dávy
 */

public class TerminarProceso {
    public static void main (String[] args) {
        TerminarProceso tp = new TerminarProceso();
       
        tp.ejecutar();
    
    }
    
    private void ejecutar() {
        
        try {
            ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\AIMP\\AIMP.exe");
                       
            Process p = pb.start();
            
            System.out.println("Terminar el proceso? (S|N)");
            Scanner sc = new Scanner(System.in);
            
            if ('S' == sc.nextLine().toUpperCase().charAt(0)) {            
            p.waitFor(3, TimeUnit.SECONDS);
            p.destroy();
            }
            
            /* Creamos un multi-catch, serían dos try y dos catch distintos pero se engloba todo en un try
            y en el catch se pone los dos que hay se parador por '|' (y)
            */           
            } catch (IOException | InterruptedException ex) {
                System.getLogger(TerminarProceso.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
        }                      
        
}
