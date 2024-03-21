/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

import java.util.ArrayList;
import prog2.vista.ExcepcioEstacio;

/**
 * Represents a list of incidents.
 *
 * @author Albert
 */
public class LlistaIncidencies implements InLlistaIncidencies{

    /**
     * Artibut llistaIncidencies de tipus ArrayList d'Incidencia
     */
    private ArrayList<Incidencia> llistaIncidencies = new ArrayList();
   
    /**
     * Constructor de la classe LlistaIncidencies sense paràmetres
     */
    public LlistaIncidencies(){
        llistaIncidencies = new ArrayList<Incidencia>();
    }
    /**
     * Constructor amb paràmetres de la classe LlistaIncidencies
     * @param llistaIncidencies 
     */
    public LlistaIncidencies(ArrayList<Incidencia> llistaIncidencies){
        this.llistaIncidencies = llistaIncidencies;
    }
       
    
    /**
     * Aquest mètode crea una incidència amb la informació passada com a paràmetres 
     * (número d'identificador, tipus, la via on s'ha produït i la data) i l'afegeix a la llista.
     * A més, s'ha de comprovar que aquesta via no té ja una incidència si ja té una incidència s'ha de llançar una excepció.
     * Una vegada creada la incidència s'ha de tancar la via corresponent.
     * @param num Número d'identificació de la incidència.
     * @param tipus Aquest String permet crear el enum TipusIncidencia
     * @param via Via on es produiex la incidència
     * @param data Data quan es produeix la incidènica.
     * @throws ExcepcioEstacio Per comprovar i avisar si la via ja té una incidènica o si el tipus d’incidència que es vol afegir no existeix.
     */
    @Override
    public void afegirIncidencia(int num, String tipus, Via via, String data) throws ExcepcioEstacio{
        if(via.getEstat().equals("Tancada")) throw new ExcepcioEstacio("La via ja te una incidencia");
        else{
            if(tipus.equals("Reparacio")){
            Incidencia in = new Incidencia(num, Incidencia.TipusIncidencia.Reparacio, via, data);
            in.getVia().tancarVia(in);
            llistaIncidencies.add(in);
            }
            if(tipus.equals("Objecte")){
                Incidencia in = new Incidencia(num, Incidencia.TipusIncidencia.Objecte, via, data);
                in.getVia().tancarVia(in);
                llistaIncidencies.add(in);            
            }
            if(tipus.equals("Tancament")){
                Incidencia in = new Incidencia(num, Incidencia.TipusIncidencia.Tancament, via, data);
                in.getVia().tancarVia(in);
                llistaIncidencies.add(in);
            }
        }
    }   
    
    /**
    * Aquest mètode elimina una incidència de la llista i actualitza l'estat de la via mitjançant el mètode obrirVia de la classe Via.
    * @param in Objecte de tipus Incidència
    * @throws ExcepcioEstacio 
     */
    @Override
    public void eliminarIncidencia(Incidencia in) throws ExcepcioEstacio{
        if(in.getNum() != llistaIncidencies.indexOf(in.getNum())){
            throw new ExcepcioEstacio("Incidencia no existeix.");
        }
        else{
            in.getVia().obrirVia();
            for(Incidencia init: llistaIncidencies){
                if(init.getNum() == in.getNum()) llistaIncidencies.remove(in);
            }
        }
    }
    
    /**
     * Itera sobre la llista d'incidències i retorna un String amb la informació de totes les incidències. 
     * En cas que no hi hagi cap incidència llança una excepció. 
     * @return String
     * @throws ExcepcioEstacio 
     */
    @Override
    public String llistarIncidencies() throws ExcepcioEstacio{
        StringBuilder incidencies = new StringBuilder();
        if(llistaIncidencies.isEmpty()) throw new ExcepcioEstacio("No hi ha cap incidencia registrada.");
        else{
            for(Incidencia in : llistaIncidencies){
                incidencies.append(in.toString());
            }
        }
        return incidencies.toString();
    }
    
    /**
     * Busca la incidència amb el número rebut per paràmetre i la retorna. 
     * En cas que no existeixi llança una excepció.
     * @param num Número d'identificació de la incidència.
     * @return Objecte de tipus Incidència
     * @throws ExcepcioEstacio Aquest mètode llança una excepció si no existeix cap incidència amb el número passat per paràmetre.
     */
    @Override
    public Incidencia getIncidencia(int num) throws ExcepcioEstacio{
        for(Incidencia in : llistaIncidencies){
            if(in.getNum() == num) return in;
        }
        throw new ExcepcioEstacio("No hi ha una incidencia amb aquell identificador");
    }

}
