package prog2.vista;
import prog2.model.VistaEstacioTren;

/**
 * Entry point of the program.
 * Initializes the station name and creates a new View of the Train Station
 * passing the station name as parameter. Then, starts the management of the Train Station.
 *
 * @author lauraigual
 */
public class IniciadorEstacioTren {

    /**
     * Main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize the station name
        String stationName = "Green";

        // Create a new View of the Train Station and pass the station name as parameter
        VistaEstacioTren vistaEstacioTren = new VistaEstacioTren(stationName);

        // Start the management of the Train Station
        vistaEstacioTren.gestioEstacioTren();
    }
}
