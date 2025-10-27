package Tema03;

import java.io.IOException;

/**
 *
 * @author Gipsy Dávy
 */
public class LanzarProcesoPBuilder {

    public static void main(String[] args) {
        LanzarProcesoPBuilder lp = new LanzarProcesoPBuilder();       
        
        // Probar de manera correcta
        String ruta1 = 
                "C:\\Program Files\\AIMP\\AIMP.exe";
        
        /** Probar excepcion si no encuentra el ejecutable (se añade una 's' a 'exe')
         * Para probar la excepcion, expecificamos que es la ruta2 en lp.ejecutar(....);
         */
        String ruta2 =
                "C:\\Program Files\\AIMP\\AIMP.exes";
        
        // Probar excepción si el archivo que referenciamos no es un ejecutable válido.
        String ruta3 =
                "C:\\Users\\Gipsy Dávy\\Pictures\\Saved Pictures\\buho.jpg";
                                
        lp.ejecutar(ruta1);
    }
        
    private void ejecutar(String comando) {
            ProcessBuilder pb = new ProcessBuilder(comando);
        try {
            pb.start();
        } catch (IOException ex) {
            System.getLogger(LanzarProcesoPBuilder.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
            
        
    }
           
        
}
