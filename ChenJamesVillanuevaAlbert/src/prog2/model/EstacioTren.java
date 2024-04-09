/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import java.io.*;

import prog2.vista.ExcepcioEstacio;
/**
 * Represents a train station.
 *
 * @author Albert
 */
public class EstacioTren implements Serializable{
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
        try{
            File fitxer = new File(camiDesti);
            FileOutputStream fout = new FileOutputStream(fitxer);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
            
            oos.close();
            fout.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Mètode per carregar la classe EstacioTren
     * @param camiOrigen
     * @return
     * @throws ExcepcioEstacio
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static EstacioTren carregar(String camiOrigen) throws ExcepcioEstacio, IOException{
        EstacioTren estacio = new EstacioTren();
        try{
            File fitxer = new File(camiOrigen);
            FileInputStream fin = new FileInputStream(fitxer);
            ObjectInputStream ois = new ObjectInputStream(fin);
            estacio =  (EstacioTren) ois.readObject();
            
            ois.close();
            fin.close();
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        
        return estacio;   
    }
    
    public void inicialitzaDadesEstacioTren() {
    
        llistaAccessos.buidar();
        
        float desnivell = 9;
        
        float pes = 200;
        Acces Acc1 = new Ascensor(pes, desnivell, "A1", true);      
        llistaAccessos.afegirAcces(Acc1);
        
        
        String marca = "Schindler";
       
        Acces  Acc2 = new EscalaMecanica(marca, desnivell, "A2", true);     
          
        llistaAccessos.afegirAcces(Acc2);
        
        float longitud = 30;
        Acces Acc3 = new Passadis(longitud, "A3", true); 
        llistaAccessos.afegirAcces(Acc3);
        
        
        float vel = 0.3f;  
        Acces  Acc4 = new CintaTransportadora(vel, longitud, "A4", true);     
        llistaAccessos.afegirAcces(Acc4);
        
        desnivell = 7;
        pes = 300;
        Acces Acc5 = new Ascensor(pes, desnivell, "A5", true);    
        llistaAccessos.afegirAcces(Acc5);
        
        Acces Acc6 = new Escala(desnivell, "A6", true);    
        llistaAccessos.afegirAcces(Acc6);
        
        desnivell = 8.5f;
        pes = 250;
        Acces  Acc7 = new Ascensor(pes, desnivell, "A7", true);      
        llistaAccessos.afegirAcces(Acc7);
        
        Acces Acc8 = new Escala(desnivell, "A8", true);       
        llistaAccessos.afegirAcces(Acc8);
        
        longitud = 25;
        Acces Acc9 = new Passadis(longitud, "A9", true);   
        llistaAccessos.afegirAcces(Acc9);
        
        vel = 0.4f; 
        Acces Acc10 = new CintaTransportadora(vel, longitud, "A10", true);       
        llistaAccessos.afegirAcces(Acc10);
        
        desnivell = 8;
        marca = "Otis";
        Acces Acc11 = new EscalaMecanica(marca, desnivell, "A11", true);   
        llistaAccessos.afegirAcces(Acc11);
        
        longitud = 20;
        Acces Acc12 = new Passadis(longitud, "A12", true); 
        llistaAccessos.afegirAcces(Acc12);
        
        desnivell = 20;
        Acces Acc13 = new Escala(desnivell, "A13", true);       
        llistaAccessos.afegirAcces(Acc13);
        
        pes = 350;
        Acces Acc14 = new Ascensor(pes, desnivell, "A14", true);       
        llistaAccessos.afegirAcces(Acc14);
        
        /* Pistes */
        llistaVies.buidar();
        Via V1  = new Via("V1",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V1);
        Via V2  = new Via("V2",  "Iberica", 2, true, "100%"); llistaVies.afegirVia(V2);
        Via V3  = new Via("V3",  "Internacional", 2, true, "100%");  llistaVies.afegirVia(V3);
        Via V4  = new Via("V4", "Iberica", 1, true, "100%"); llistaVies.afegirVia(V4);
        Via V5  = new Via("V5", "Iberica", 1, true, "100%");  llistaVies.afegirVia(V5);
        Via V6  = new Via("V6",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V6);
        Via V7  = new Via("V7",  "Estreta", 1, true, "100%");  llistaVies.afegirVia(V7);
         
        /* Accés */
        Acc1.afegirVia(V1);
        Acc2.afegirVia(V1); 
        Acc3.afegirVia(V2);
        Acc4.afegirVia(V2);
        Acc5.afegirVia(V3);
        Acc6.afegirVia(V3);
        Acc7.afegirVia(V4); Acc7.afegirVia(V6);
        Acc8.afegirVia(V4); Acc8.afegirVia(V6);
        Acc9.afegirVia(V5); Acc9.afegirVia(V7);
        Acc10.afegirVia(V5); Acc10.afegirVia(V7);
        Acc11.afegirVia(V6);
        Acc12.afegirVia(V6);
        Acc13.afegirVia(V7);
        Acc14.afegirVia(V7);
        
    }

}

