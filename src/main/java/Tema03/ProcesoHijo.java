package Tema03;

/**
 *
 * @author Gipsy Dávy
 */
public class ProcesoHijo {
    
    public static void main (String[] args) {
        int inicio, fin;
        if(args.length == 0 || args.length > 2) {
            inicio = Integer.parseInt("0");
            fin = Integer.parseInt("0");
        } else {
            inicio = Integer.parseInt(args[0]);
            fin = Integer.parseInt(args[1]);
        }
        
        ProcesoHijo ph = new ProcesoHijo();
        
        int resultado = ph.sumar(inicio, fin);
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumar(int inicio, int fin) {
        int total = 0;
        for(int i = inicio; i <= fin; i++) {
            System.out.println("Total: " + total + "Valos a sumar: " + i);
            total = total + i;
        }
        return total;
        
    }
    
}
