/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 * Represents a train station view.
 *
 * @author Albert
 */
public class VistaEstacioTren {
    private String nomEstacio;
    
    /**
     * Constructor de la classe VistaEstacioTren sense paràmetres
     */
    public VistaEstacioTren(){
        this.nomEstacio = nomEstacio;
    }
    /**
     * Constructor de la classe VistaEstacioTren amb paràmetres
     * @param nomEstacio 
     */
    public VistaEstacioTren(String nomEstacio){
        this.nomEstacio = nomEstacio;
    }
    
    /**
     * Mètodes getters i setters de nomEstacio
     * @return 
     */
    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }
    
}
