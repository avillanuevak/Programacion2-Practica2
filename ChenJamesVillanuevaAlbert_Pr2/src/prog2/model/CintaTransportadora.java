/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.io.Serializable;

/**
 *
 * @author Albert
 */
public class CintaTransportadora extends AccessNivell implements Serializable{
    private float velocitat;
    private String nom;
    private boolean estat;
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
        this.nom = nom;
        this.estat = estat;
              
    }

    // Mètodes getters i setters de velocitat
    public float getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(float velocitat) {
        this.velocitat = velocitat;
    }
    
    @Override 
    public String getNom(){
        return this.nom;
    }
    
    @Override
    public boolean isEstat(){
        return this.estat;
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
        return super.toString() + ", velocitat de la cinta: " + this.getVelocitat();
    }
}