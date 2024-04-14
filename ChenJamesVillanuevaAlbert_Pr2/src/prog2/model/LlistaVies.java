/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import java.io.Serializable;
import java.util.ArrayList;
import prog2.vista.ExcepcioEstacio;

/**
 * Classe de via
 */

public class LlistaVies implements InLlistaVies, Serializable{
    private ArrayList<Via> llistaVies;
    
    /**
     * Constructor de la classe LlistaVies sense paràmetres
     */
    public LlistaVies(){
    llistaVies = new ArrayList<>();
    }
    
    /**
     * Consstructor de la classe LlistaVies amb paràmetres
     * @param llistaVies 
     */
    public LlistaVies(ArrayList<Via> llistaVies){
        this.llistaVies = llistaVies;
    }
    
    /**
     * Mètodes getters i setters de llistaVies
     * @param llistaVies
     * @return 
     */

    public void setLlistaVies(ArrayList<Via> llistaVies) {
        this.llistaVies = llistaVies;
    }

    public ArrayList<Via> getLlistaVies() {
        return llistaVies;
    }
    
        
    /**
     * Afegeix una via rebuda per paràmetre a la llista de vies.
     * @param via Objecte de tipus Via
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    @Override
     public void afegirVia(Via via) throws ExcepcioEstacio{
        llistaVies.add(via);
         
     }
    
    /**
     * Buida la llista de vies.
     */
     @Override
    public void buidar(){
        llistaVies.clear();
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
        StringBuilder sb = new StringBuilder(); boolean bEstat;
        bEstat = estat.equals("Obert");
        if(!llistaVies.isEmpty()){
                for (Via it: llistaVies){
                    if(it.isEstat() == bEstat){
                       sb.append(it.toString());
                    }
                }
        }
        else{
            throw new ExcepcioEstacio("No hi han vies registrades");
        }
        if(!sb.isEmpty()) return sb.toString();
        return "No hi han vies registrades amb aquell estat";
    }
    
    /**
     * Mira si la llista de vies conté alguna via oberta.
     * @return boolean
     */
    @Override
    public boolean containsViesObertes(){
        for (Via it : llistaVies){
            if(it.isEstat()){
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
        for (Via it : llistaVies){
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
        for(Via it: llistaVies){
            if(it.getNom().equals(nom)){
                return it;
            }
        }
        System.out.println("No existeix aquesta Via o no esta registrada");
        return null;
    }
}