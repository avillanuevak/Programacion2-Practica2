<<<<<<< HEAD:P2-2324-Practica2/ChenJamesVillanuevaAlbert/src/prog2/model/Ascensor.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 *
 * @author Albert
 */
public class Ascensor extends AccessDesnivell{
    private int carregaMax;
    
    /**
     * Constructor de la classe Ascensor amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param desnivell
     * @param carregaMax 
     */
    
    public Ascensor(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell, int carregaMax){
        super(nom, accessibilitat, estat, vies, desnivell);
        this.carregaMax = carregaMax;
    }

    /**
     * Mètodes getters i setter de carregaMax
     * @return 
     */
    public int getCarregaMax() {
        return carregaMax;
    }

    public void setCarregaMax(int carregaMax) {
        this.carregaMax = carregaMax;
    }
    
    /**
     * Mètode isAccessibilitat(), retorna true ja que els ascensors tenen accessibilitat
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return true;
    }
    
    /**
     * El mètode toString() crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + "\nCarrega maxima de l'ascensor: " + this.getCarregaMax();
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
public class Ascensor extends AccessDesnivell{
    private int carregaMax;
    
    /**
     * Constructor de la classe Ascensor amb paràmetres
     * @param nom
     * @param accessibilitat
     * @param estat
     * @param vies
     * @param desnivell
     * @param carregaMax 
     */
    
    public Ascensor(String nom, boolean accessibilitat, boolean estat, Via vies, float desnivell, int carregaMax){
        super(nom, accessibilitat, estat, vies, desnivell);
        this.carregaMax = carregaMax;
    }

    /**
     * Mètodes getters i setter de carregaMax
     * @return 
     */
    public int getCarregaMax() {
        return carregaMax;
    }

    public void setCarregaMax(int carregaMax) {
        this.carregaMax = carregaMax;
    }
    
    /**
     * Mètode isAccessibilitat(), retorna true ja que els ascensors tenen accessibilitat
     * @return 
     */
    @Override
    public boolean isAccessibilitat(){
        return true;
    }
    
    /**
     * El mètode toString() crida al mètode de la superclasse
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + "\nCarrega maxima de l'ascensor: " + this.getCarregaMax();
    }
}
>>>>>>> b6be361f32be4969fb08a2bc743ef74145a141fc:ChenJamesVillanuevaAlbert/src/prog2/model/Ascensor.java
