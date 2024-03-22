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
    public AccessNivell(String nom, boolean accessibilitat, boolean estat, Via vies, int longitud) {
        super(nom, accessibilitat, estat, vies);
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
    @Override
    public String toString(){
        String accessibilitatString, estatString;
        accessibilitatString = this.isAccessibilitat() ? "Si." : "No.";
        estatString = this.isEstat() ? "Oberta" : "Tancada";
        return "Nom: " + this.getNom() + "Tipus: " + this.getClass().getSimpleName() + 
                "\nCaracteristiques: Longitud " + this.getLongitud() + " metres." + 
                "Accessibilitat: " + accessibilitatString + " Estat: " + estatString + 
                " Acces a: " + this.getVies();
    }
}