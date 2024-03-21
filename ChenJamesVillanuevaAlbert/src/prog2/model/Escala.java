<<<<<<< HEAD:P2-2324-Practica2/ChenJamesVillanuevaAlbert/src/prog2/model/Escala.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**

 * @author Albert Villanueva
 */
public class Escala extends AccessDesnivell{
    
    /**
     * Constructor de la classe Escala amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param desnivell 
     */
    public Escala(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell){
        super(nom, accessibilitat, estat, vies, desnivell);
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
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**

 * @author Albert Villanueva
 */
public class Escala extends AccessDesnivell{
    
    /**
     * Constructor de la classe Escala amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param desnivell 
     */
    public Escala(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell){
        super(nom, accessibilitat, estat, vies, desnivell);
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
>>>>>>> b6be361f32be4969fb08a2bc743ef74145a141fc:ChenJamesVillanuevaAlbert/src/prog2/model/Escala.java
}