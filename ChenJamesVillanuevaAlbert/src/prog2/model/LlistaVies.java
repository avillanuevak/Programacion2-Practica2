/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;


/**
 * A class representing a single road in the simulation.
 */
import java.util.ArrayList;
import prog2.vista.ExcepcioEstacio;
public class LlistaVies implements InLlistaVies{
    private ArrayList<Via> llistaVia;
    
    /**
     * Constructor de la classe LlistaVies sense paràmetres
     */
    public LlistaVies(){
    llistaVia = new ArrayList<Via>();
    }
    
    /**
     * Consstructor de la classe LlistaVies amb paràmetres
     * @param llistaVia 
     */
    public LlistaVies(ArrayList<Via> llistaVia){
        this.llistaVia = llistaVia;
    }
    
    /**
     * Mètodes getters i setters de llistaVia
     * @return 
     */
    public ArrayList<Via> getVies() {
        return llistaVia;
    }

    public void setLlistaVia(ArrayList<Via> llistaVia) {
        this.llistaVia = llistaVia;
    }
        
    /**
     * Afegeix una via rebuda per paràmetre a la llista de vies.
     * @param via Objecte de tipus Via
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    @Override
     public void afegirVia(Via via) throws ExcepcioEstacio{
         if(!llistaVia.isEmpty()) llistaVia.add(via);
         else{
             throw new ExcepcioEstacio("No hi ha vies registrades.");
         }
     }
    
    /**
     * Buida la llista de vies.
     */
     @Override
    public void buidar(){
        llistaVia.clear();
    }
    
    /**
     * Itera sobre la llista de vies i retorna un String amb la informació de totes les vies amb l'estat rebut per paràmetre.
     * En cas que no hi hagi vies en l'estat passat com a paràmetre llança una excepció. 
     * @param estat
     * @return String
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode llança una excepció en cas que no hi hagi vies en l'estat passat com a parametre.
     */
    @Override
    public String llistarVies(String estat) throws ExcepcioEstacio{
        boolean comprobar = false;
        String elString = "";
        for (Via it: llistaVia){
            if(it.getEstat().equals(estat)){
                comprobar = true;
                elString += it.toString();

            }
        }
        if(!comprobar){
            throw new ExcepcioEstacio("No hi han vies registrades");
        }
        return elString;
    }
    
    /**
     * Mira si la llista de vies conté alguna via oberta.
     * @return boolean
     */
    @Override
    public boolean containsViesObertes(){
        for (Via it : llistaVia){
            if(it.getEstat().equals("Oberta")){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Mira si la llista de vies conté la via rebuda per paràmetre i retorna un booleà amb la informació.
     * @param via
     * @return boolean
     */
    @Override
    public boolean contains(Via via){
        for (Via it : llistaVia){
            if(it.getNom().equals(via.getNom())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca la via amb el nom rebut per paràmetre i la retorna. En cas que no existeixi llança una excepció.
     * @param nom String amb el nom de la Via
     * @return  Objecte de tipus Via
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    @Override
    public Via getVia(String nom) throws ExcepcioEstacio{
        for(Via it: llistaVia){
            if(it.getNom().equals(nom)){
                return it;
            }
        }
        throw new ExcepcioEstacio ("No existeix aquesta Via o no esta registrada");
    }
}