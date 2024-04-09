/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert Villanueva
 */
public abstract class AccessDesnivell extends Access{
    private float desnivell;
    
    
    /**
     * Constructor de la classe AccessDesnivell amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
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
        String DesAccessibilitat = "", DesEstat = "";
        if(this.isAccessibilitat()) DesAccessibilitat = "Si.";
        if(this.isEstat()) DesEstat = "Obert.";
        return "Nom: " + this.getNom() + ". Tipus: " + this.getClass().getSimpleName() + ". Desnivell: " + this.getDesnivell() + 
                "\nAccessibilitat: " + DesAccessibilitat + " Estat: " + DesEstat;
    }
}