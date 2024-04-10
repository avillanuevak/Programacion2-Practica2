/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.util.ArrayList;
import java.util.Iterator;
import prog2.vista.ExcepcioEstacio;

/**
 * Represents a linked list of Acces objects.
 *
 * @author Albert Villanueva
 */
public class LlistaAccessos implements InLlistaAccessos{
    private ArrayList<Acces> llistaAccessos = new ArrayList();
    
    
    /**
     * Constructor de la classe LlistaAccessos sense paràmetres
     */
    public LlistaAccessos(){
        llistaAccessos = new ArrayList<Acces>();
    }
    
    /**
     * Constructor de la classe LlistaAccessos amb paràmetres
     * @param llistaAccessos 
     */
    public LlistaAccessos(ArrayList<Acces> llistaAccessos){
        this.llistaAccessos = llistaAccessos;
    }
    
    /**
     * Afegeix un accés rebut per paràmetre a la llista d'accessos.
     * @param acc Objecte de tipus Acces.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
    @Override
    public void afegirAcces(Acces acc) throws ExcepcioEstacio{
        llistaAccessos.add(acc);
    }
    
    /**
     * Buida la llista d'accessos
     */
    @Override
     public void buidar(){
         llistaAccessos.clear();
     }
     
     /**
     * Itera sobre la llista d'accessos i retorna un String amb la informació de tots els accessos amb l'estat rebut per paràmetre.
     * En cas que no hi hagi accessos en l'estat passat com a paràmetre llança una excepció. 
     * @param estat boolean
     * @return String
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode llança una excepció en cas que no hi hagi accessos en l'estat passat com a parametre.
     * 
     */
     @Override
     public String llistarAccessos(boolean estat) throws ExcepcioEstacio{
        StringBuilder accessos = new StringBuilder();
        if(llistaAccessos.isEmpty()) throw new ExcepcioEstacio("No hi ha cap access registrada.");
        else{
            for(Acces acc : llistaAccessos){
                accessos.append(acc.toString());
            }
        }
        return accessos.toString();
     }
     
     /**
      * Recorre tota la llista d'accessos i els tanca. Només decidirà obrir cadascun d'ells si permet l'accés a alguna via oberta.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
      */
     @Override
     public void actualitzaEstatAccessos() throws ExcepcioEstacio{
         
         if(!llistaAccessos.isEmpty()){
             for(Acces acc : llistaAccessos){
                 acc.setEstat(false);
                 LlistaVies llista = acc.getLlistaVies();
                 ArrayList llistaVies = llista.getLlistaVia();
                 Iterator<Via> it = llistaVies.iterator();
                 while(it.hasNext()){
                    if(it.next().getEstat()) acc.setEstat(true);
                 } 
             }
         }
         else{
             throw new ExcepcioEstacio("No hi ha accessos registrats.");
         }
     }
     
     /**
     * Itera sobre la llista d'accessos i retorna el número d'accessos amb accessibilitat.
     * @return int
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
     @Override
     public int calculaAccessosAccessibles() throws ExcepcioEstacio{
         int accAccessibles = 0;
         if(!llistaAccessos.isEmpty()){
            for(Acces acc : llistaAccessos){
                if(acc.isEstat()) accAccessibles ++;
            }
         }
         else{
             throw new ExcepcioEstacio("No hi ha accessos registrats");
         }
         return accAccessibles;
     }
     
     /**
     * Itera sobre la llista d'accessos, i per els accessos a nivell suma la longitud i la retorna. 
     * @return float amb la longitud dels accessos a nivell.
     * @throws prog2.vista.ExcepcioEstacio Aquest mètode podria llançar una excepció si fos necessari.
     */
     @Override
     public float calculaLongitudAccessosNivell() throws ExcepcioEstacio{
         float longNivell = 0;
         if(!llistaAccessos.isEmpty()){
             for(Acces acc : llistaAccessos){
                 if(acc.getClass().getName().equals("AccessNivell")){
                     AccessNivell accNivell = (AccessNivell) acc;
                     longNivell += accNivell.getLongitud();
                 }
             }
         }
         else{
             throw new ExcepcioEstacio("No hi ha accessos registrats");
         }
         return longNivell;
     }
}