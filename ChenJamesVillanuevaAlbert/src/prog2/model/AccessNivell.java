/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert Villanueva
 */
public abstract class AccessNivell extends Access {
    private int longitud;

    
    /**
     * Constructor de la Classe AccessNivell amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param longitud 
     */
    public AccessNivell(int longitud) {
        super();
        this.longitud = longitud;
    }
    
/**
 * Mètodes getters i setters dels atributs de la classe
 * @return 
 */
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}