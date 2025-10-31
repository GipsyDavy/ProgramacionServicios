package Tema05;

import java.util.logging.Logger;

/**
 *
 * @author Gipsy Dávy
 */
public class Main01_Anonima {

    public static void main(String[] args) {

        
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Duerme 2 segundos");
                    Thread.sleep(2000);
                    System.out.println("He terminado de dormir");
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
                
        });
        hilo.start();                 
        
    }

}
