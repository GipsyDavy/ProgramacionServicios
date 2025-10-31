package Tema05;

/**
 *
 * @author Gipsy Dávy
 */
public class Main_Lambda {
    public static void main(String[] args) {
        
                         
        Thread hilo = new Thread(() -> { 
            try {
                    System.out.println("Duerme 2 segundos");
                    Thread.sleep(2000);
                    System.out.println("He terminado de dormir");
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
        });      
                       
        hilo.start();
    }
}
    


            
