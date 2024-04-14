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
public class Passadis extends AccessNivell implements Serializable{
    private String nom;
    private boolean estat;
    /**
     * Constructor de la classe Passadís amb paràmetres
     * @param nom
     * @param estat
     * @param longitud 
     */
    public Passadis(float longitud, String nom, boolean estat){
        super(longitud);
        this.nom = nom;
        this.estat = estat;
    }
    
    /**
     * Mètode isAccessibilitat(), els passadisos són accessibles
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return true;
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
     * Mètode toString() de Passadís que crida al mètode toString() de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString();
    }
}