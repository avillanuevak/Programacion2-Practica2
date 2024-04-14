/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.io.Serializable;

/**
 *
 * @author Albert Villanueva
 */
public abstract class AccessNivell extends Acces implements Serializable{
    private float longitud;

    
    /**
     * Constructor de la Classe AccessNivell amb paràmetres
     * @param longitud 
     */
    public AccessNivell(float longitud) {
        this.longitud = longitud;
    }
    
/**
 * Mètodes getters i setters dels atributs de la classe
 * @return 
 */
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    @Override
    public String toString(){
        String accessibilitatString, estatString;
        accessibilitatString = this.isAccessibilitat() ? "Si." : "No.";
        estatString = this.isEstat() ? "Obert" : "Tancat";
        return "\nNom: " + getNom() + ", tipus: " + this.getClass().getSimpleName() + 
                ", caracteristiques: Longitud " + this.getLongitud() + " metres." + 
                " Accessibilitat: " + accessibilitatString + " ,estat: " + estatString;
    }
}