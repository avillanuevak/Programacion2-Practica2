/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert Villanueva
 */
public abstract class AccessNivell extends Acces {
    private float longitud;

    
    /**
     * Constructor de la Classe AccessNivell amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param longitud 
     */
    public AccessNivell(float longitud) {
        super();
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
        estatString = this.isEstat() ? "Oberta" : "Tancada";
        return "Nom: " + this.getNom() + "Tipus: " + this.getClass().getSimpleName() + 
                "\nCaracteristiques: Longitud " + this.getLongitud() + " metres." + 
                "Accessibilitat: " + accessibilitatString + " Estat: " + estatString;
    }
}