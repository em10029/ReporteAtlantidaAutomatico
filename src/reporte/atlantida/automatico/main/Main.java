/*
 * ©Informática Atlántida 2018.
 * Derechos Reservados.
 * 
 * Este software es propiedad intelectual de Informática Atlántida (Infatlan). La información contenida
 * es de carácter confidencial y no deberá revelarla. Solamente podrá utilizarlo de conformidad con los
 * términos del contrato suscrito con Informática Atlántida S.A.
 */
package reporte.atlantida.automatico.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import reporte.atlantida.control.Control;
import reporte.atlantida.estructura.ReporteAtlantidaExcepcion;
import static reporte.atlantida.estructura.ReporteAtlantidaExcepcion.ERROR_CONFIGURACION_01;

/**
 * Inicio principal del programa.
 *
 * @author Erick Fabricio Martínez Castellanos
 * (<a href='mailto:efmartinez@bancatlan.hn'>efmartinez@bancatlan.hn</a>)
 * @version 1.0 24-oct-2018
 */
public class Main {
    
    /**
     * Constructor privado, clase de comportamiento estático.
     */
    private Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicializador de aplicativo
        Control control = new Control("I");
        
        //Ciclo de ejecucion
        try {
            if(control.configurar()){
                while(true){
                    control.iniciar();
                }
            }
        } catch (ReporteAtlantidaExcepcion ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, ERROR_CONFIGURACION_01, ex);
        }
        System.exit(0);
    }
    
}
