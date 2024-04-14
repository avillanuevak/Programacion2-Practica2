/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.io.Serializable;

/**
 * 
 *
 * @author Albert Villanueva
 */
public class EscalaMecanica extends AccessDesnivell implements Serializable{
    private String marca;
    private boolean estat;
    private String nom;
    
    /**
     * Constructor de la classe EscalaMecanica amb paràmetres
     * @param nom
     * @param estat
     * @param desnivell
     * @param marca 
     */
    public EscalaMecanica(String marca, float desnivell, String nom, boolean estat){
        super(desnivell);
        this.marca = marca;
        this.estat = estat;
        this.nom = nom;
    }

    /**
     * Mètodes getters i setters de marca
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override 
    public String getNom(){
        return this.nom;
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
     * El mètode isAccessibilitat(), les escales mecàniques no són accessibles
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
    
    /**
     * El mètode toString crida al mètode toString de la superclasse i imprimeix el nou atribut
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() +", marca: " + this.getMarca();
    }
}