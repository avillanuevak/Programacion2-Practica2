/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;

/**
 * A class representing a Via.
 * @author James Chen
 */
public class Via implements InVia {
    private String nom;
    private int amplada, nTunels;
    private String estat;
    private String llum;
    
    
    /**
     * Constructor de la classe Via amb paràmetres
     * @param nom
     * @param amplada
     * @param nTunels
     * @param estat
     * @param llum 
     */
    public Via(String nom, int amplada, int nTunels, String estat, String llum){
        this.nom = nom;
        this.amplada = amplada;
        this.nTunels = nTunels;
        this.estat = estat;
        this.llum = llum;
    }
    
    /**
     * Mètodes getters i setters 
     * @return 
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAmplada() {
        return amplada;
    }

    public void setAmplada(int amplada) {
        this.amplada = amplada;
    }

    public int getnTunels() {
        return nTunels;
    }

    public void setnTunels(int nTunels) {
        this.nTunels = nTunels;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }


    public String getLlum() {
        return llum;
    }

    public void setLlum(String llum) {
        this.llum = llum;
    }

    
        /**
     * Modifica l'estat de la via a Tancada i la il·luminació depenent de la incidència rebuda com a paràmetre
     * @param in Objecte de tipus Incidencia.
     */
    @Override
    public void tancarVia(Incidencia in){
        estat = "Tancada";
        llum = in.getIluminacioVia();
    }
    
    /**
     * Modifica l'estat de la via a Oberta i la il·luminació al 100%
     */
    @Override
    public void obrirVia(){
        estat = "Oberta";
        llum = "100%";
    }
    @Override
    public String toString() {
        return "Incidencia{" + "nom=" + this.getNom() + ", amplada=" + this.getAmplada() + ", nTunels=" + 
                this.getnTunels() + ", estat=" + this.getEstat() + ", llum=" + this.getLlum()+ "}";
    }
}