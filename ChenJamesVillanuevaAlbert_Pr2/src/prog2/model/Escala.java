/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.io.Serializable;

/**

 * @author Albert Villanueva
 */
public class Escala extends AccessDesnivell implements Serializable{
    private String nom;
    private boolean estat;
    /**
     * Constructor de la classe Escala amb paràmetres
     * @param nom
     * @param estat
     * @param desnivell 
     */
    public Escala(float desnivell, String nom, boolean estat){
        super(desnivell);
        this.nom = nom;
        this.estat = estat;
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
     * Les escales no són accessibles
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
    
    /**
     * Crida al mètode toString de la superclasse AccessDesnivell
     * @return 
     */
    @Override
    public String toString(){
       return super.toString();
    }
}