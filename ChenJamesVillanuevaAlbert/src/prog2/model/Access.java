/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import prog2.vista.ExcepcioEstacio;

/**
 *
 * @author Albert Villanueva
 */
public abstract class Access implements InAcces{
    private String nom;
    private boolean accessibilitat, estat;
    LlistaVies llistaVies;
    
    
    /**
     * Constructor de la classe acess amb paràmetres
     */
    public Access(){
        this.llistaVies = new LlistaVies();
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.estat = estat;
    }
    
    /**
     * Mètodes getters i setter dels següents atributs
     * @nom
     * @accessibilitat
     * @estat
     * @vies 
     */
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isAccessibilitat() {
        return accessibilitat;
    }

    public void setAccessibilitat(boolean accessibilitat) {
        this.accessibilitat = accessibilitat;
    }

    public boolean isEstat() {
        return estat;
    }

    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    
    /**
     * Afegeix una via rebuda com a paràmetre a la llista de vies de l'accés
     * @param via 
     */
    @Override
    public void afegirVia(Via via){
        try {
            llistaVies.afegirVia(via);
        } catch (ExcepcioEstacio ex) {
            Logger.getLogger(Access.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Canvia l'estat de l'accés a tancat
     */
    @Override
    public void tancarAcces(){
        this.setEstat(false);
    }
    
    /**
     * Canvia l'estat de l'accés a obert 
     */
    @Override
    public void obrirAcces(){
        this.setEstat(true);
    }
   
}