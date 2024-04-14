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
public abstract class AccessDesnivell extends Acces implements Serializable{
    private float desnivell;
    
    
    /**
     * Constructor de la classe AccessDesnivell amb paràmetres
     * @param desnivell 
     */
    public AccessDesnivell(float desnivell){
        super();
        this.desnivell = desnivell;
    }
    
    /**
     * Mètodes getter i setters de l'atribut desnivell
     * @return 
     */
    public float getDesnivell() {
        return desnivell;
    }

    public void setDesnivell(float desnivell) {
        this.desnivell = desnivell;
    }
    @Override
    public String toString(){
        String DesAccessibilitat, DesEstat;
        DesAccessibilitat = this.isAccessibilitat() ? "Si" : "No";
        DesEstat = this.isEstat() ? "Obert" : "Tancat";
        return "\nNom: " + getNom() + ". Tipus: " + this.getClass().getSimpleName() + ". Desnivell: " + this.getDesnivell() + 
                ", accessibilitat: " + DesAccessibilitat + ", Estat: " + DesEstat;
    }
}