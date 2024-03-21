<<<<<<< HEAD:P2-2324-Practica2/ChenJamesVillanuevaAlbert/src/prog2/model/CintaTransportadora.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert
 */
public class CintaTransportadora extends AccessNivell{
    
    /**
     * Constructor de la classe CintaTransportadora amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param longitud 
     */
    public CintaTransportadora(String nom, boolean accessibilitat, boolean estat, Via vies, int longitud){
        super(nom, accessibilitat, estat, vies, longitud);
    }
    
    /**
     * La cinta transportadora no és accessible
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
    
    /**
     * El mètode toString crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString();
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
 * @author Albert
 */
public class CintaTransportadora extends AccessNivell{
    
    /**
     * Constructor de la classe CintaTransportadora amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param longitud 
     */
    public CintaTransportadora(String nom, boolean accessibilitat, boolean estat, Via vies, int longitud){
        super(nom, accessibilitat, estat, vies, longitud);
    }
    
    /**
     * La cinta transportadora no és accessible
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
    
    /**
     * El mètode toString crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString();
    }
}
>>>>>>> b6be361f32be4969fb08a2bc743ef74145a141fc:ChenJamesVillanuevaAlbert/src/prog2/model/CintaTransportadora.java
