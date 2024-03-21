<<<<<<< HEAD:P2-2324-Practica2/ChenJamesVillanuevaAlbert/src/prog2/model/Access.java
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
    private Via vies;
    LlistaVies llistaVies = new LlistaVies();
    
    
    /**
     * Constructor de la classe acess amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies 
     */
    public Access(String nom, boolean accessibilitat, boolean estat, Via vies){
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.estat = estat;
        this.vies = vies;
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

    public Via getVies() {
        return vies;
    }

    public void setVies(Via vies) {
        this.vies = vies;
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
=======
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
    private Via vies;
    LlistaVies llistaVies = new LlistaVies();
    
    
    /**
     * Constructor de la classe acess amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies 
     */
    public Access(String nom, boolean accessibilitat, boolean estat, Via vies){
        this.nom = nom;
        this.accessibilitat = accessibilitat;
        this.estat = estat;
        this.vies = vies;
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

    public Via getVies() {
        return vies;
    }

    public void setVies(Via vies) {
        this.vies = vies;
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
>>>>>>> b6be361f32be4969fb08a2bc743ef74145a141fc:ChenJamesVillanuevaAlbert/src/prog2/model/Access.java
