<<<<<<< HEAD:P2-2324-Practica2/ChenJamesVillanuevaAlbert/src/prog2/model/AccessDesnivell.java
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
    public AccessDesnivell(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell){
        super(nom, accessibilitat, estat, vies);
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
                "\nAccessibilitat: " + DesAccessibilitat + " Estat: " + DesEstat  + this.getVies();
    }
}
=======
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
    public AccessDesnivell(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell){
        super(nom, accessibilitat, estat, vies);
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
                "\nAccessibilitat: " + DesAccessibilitat + " Estat: " + DesEstat  + this.getVies();
    }
}
>>>>>>> b6be361f32be4969fb08a2bc743ef74145a141fc:ChenJamesVillanuevaAlbert/src/prog2/model/AccessDesnivell.java
