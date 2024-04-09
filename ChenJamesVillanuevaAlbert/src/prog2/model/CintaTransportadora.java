/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert
 */
public class CintaTransportadora extends AccessNivell{
    private float velocitat;
    /**
     * Constructor de la classe CintaTransportadora amb paràmetres
     * @param velocitat
     * @param nom
     * @param estat
     * @param longitud 
     */
    public CintaTransportadora(float velocitat, float longitud, String nom,boolean estat){
        super(longitud);
        this.velocitat = velocitat;
    }

    // Mètodes getters i setters de velocitat
    public float getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(float velocitat) {
        this.velocitat = velocitat;
    }
    
    
    /**
     * La cinta transportadora no és accessible
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
    
    /**
     * El mètode toString crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + "\nVelocitat de la cinta: " + this.getVelocitat();
    }
}