/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import prog2.vista.ExcepcioEstacio;
/**
 * Represents a train station.
 *
 * @author Albert
 */
public class EstacioTren {
    private String nom;
    private LlistaAccessos llistaAccessos = new LlistaAccessos();
    private LlistaVies llistaVies = new LlistaVies();
    private LlistaIncidencies llistaIncidencies = new LlistaIncidencies();

    public EstacioTren() {
        llistaAccessos = new LlistaAccessos();
        llistaVies = new LlistaVies();
        llistaIncidencies = new LlistaIncidencies();
    }
    
    
    
    /**
     * Constructor de la classe EstacioTren amb paràmteres
     * @param nom
     * @param llistaAccessos
     * @param llistaVies
     * @param llistaIncidencies 
     */
    public EstacioTren(String nom, LlistaAccessos llistaAccessos, LlistaVies llistaVies, LlistaIncidencies llistaIncidencies){
        this.nom = nom;
        this.llistaAccessos = llistaAccessos;
        this.llistaVies = llistaVies;
        this.llistaIncidencies = llistaIncidencies;
        
    }
    
    /**
     * Mètode que afageix una incidència a la llista d'Incidències.
     * També actualitza else estats dels accessos amb el mètode actualitzarEstatAccessos()
     * @param num
     * @param tipus
     * @param nomVia
     * @param data
     * @throws ExcepcioEstacio si la via no està continguda en la llista de vies
     */
    public void afegirIncidencia(int num, String tipus, String nomVia, String data) throws ExcepcioEstacio{
        Via v = llistaVies.getVia(nomVia);
        if(llistaVies.contains(v)){
            llistaIncidencies.afegirIncidencia(num, tipus, v, data);
            llistaAccessos.actualitzaEstatAccessos();
        }
        else{
            throw new ExcepcioEstacio("Aquesta via no existeix o no esta registrada");
        }
    }
    
    /**
     * Mètode que elimina una incidència  de la llista d'incidències entrat el seu identificador.
     * També actualitza else estats dels accessos amb el mètode actualitzarEstatAccessos()
     * @param num
     * @throws ExcepcioEstacio Si no existeix una incidència amb aquell identificador
     */
    public void eliminarIncidencia(int num) throws ExcepcioEstacio{
        Incidencia in = llistaIncidencies.getIncidencia(num);
        llistaIncidencies.eliminarIncidencia(in);
        llistaAccessos.actualitzaEstatAccessos();
        
    }
    /**
     * Mètodes de persistència de dades
     */
    
    /**
     * Mètode per guardar la classe EstacioTren
     * @param camiDesti
     * @throws ExcepcioEstacio
     * @throws IOException 
     */
    public void guardar(String camiDesti) throws ExcepcioEstacio, IOException{
        File fitxer = new File(camiDesti);
        FileInputStream fin = new FileInputStream(fitxer);
        ObjectInputStream ois = new ObjectInputStream(fin);
    }
    
    /**
     * Mètode per carregar la classe EstacioTren
     * @param camiOrigen
     * @return
     * @throws ExcepcioEstacio
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static EstacioTren carregar(String camiOrigen) throws ExcepcioEstacio, FileNotFoundException, IOException{
        File fitxer = new File(camiOrigen);
        FileOutputStream fout = new FileOutputStream(fitxer);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        EstacioTren estacio = new EstacioTren(oos); //Error, no se quin valor retornar 
        return estacio;
    }
}

