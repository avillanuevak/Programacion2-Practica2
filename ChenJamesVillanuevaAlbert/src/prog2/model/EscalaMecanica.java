/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 * 
 *
 * @author Albert Villanueva
 */
public class EscalaMecanica extends AccessDesnivell{
    
    private String marca;
    
    /**
     * Constructor de la classe EscalaMecanica amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param desnivell
     * @param marca 
     */
    public EscalaMecanica(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell, String marca){
        super(nom, accessibilitat, estat, vies, desnivell);
        this.marca = marca;
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
        return super.toString() +"\nMarca: " + this.getMarca();
    }
}