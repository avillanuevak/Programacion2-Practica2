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
public class Ascensor extends AccessDesnivell implements Serializable{
    private float pes;
    private float desnivell;
    private String nom;
    private boolean estat;
    /**
     * Constructor de la classe Ascensor amb paràmetres
     * @param nom
     * @param estat
     * @param desnivell
     * @param pes 
     */
    
    public Ascensor(float pes, float desnivell, String nom, boolean estat){
        super(desnivell);
        this.pes = pes;
        this.desnivell = desnivell;
        this.nom = nom;
        this.estat = estat;
        
    }

    /**
     * Mètodes getters i setter de pes
     * @return 
     */
    public float getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    @Override
    public float getDesnivell() {
        return desnivell;
    }

    @Override
    public void setDesnivell(float desnivell) {
        this.desnivell = desnivell;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean isEstat() {
        return estat;
    }

    @Override
    public void setEstat(boolean estat) {
        this.estat = estat;
    }
    
    
    
    /**
     * Mètode isAccessibilitat(), retorna true ja que els ascensors tenen accessibilitat
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return true;
    }
    
    /**
     * El mètode toString() crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + ". Carrega maxima de l'ascensor: " + this.getPes();
    }
}