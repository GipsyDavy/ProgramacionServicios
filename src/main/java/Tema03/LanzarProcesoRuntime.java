package Tema03;

import java.io.IOException;

/**
 *
 * @author Gipsy Dávy
 */
public class LanzarProcesoRuntime {
    
    public static void main (String[] args) {
    
    LanzarProcesoRuntime lr = new LanzarProcesoRuntime();
    
    // Probar de manera correcta
        String ruta1 = 
                "C:\\Program Files\\AIMP\\AIMP.exe";
    
    lr.ejecutar(ruta1);

    }
    
    private void ejecutar(String comando) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process p = runtime.exec(comando);
        } catch (IOException ex) {
            System.getLogger(LanzarProcesoRuntime.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
        
    }
    
}
