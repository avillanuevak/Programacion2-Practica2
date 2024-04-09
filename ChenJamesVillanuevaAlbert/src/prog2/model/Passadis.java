/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert Villanueva
 */
public class Passadis extends AccessNivell{
   
    /**
     * Constructor de la classe Passadís amb paràmetres
     * @param nom
     * @param estat
     * @param longitud 
     */
    public Passadis(float longitud, String nom, boolean estat){
        super(longitud);
    }
    
    /**
     * Mètode isAccessibilitat(), els passadisos són accessibles
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return true;
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