/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.model;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import prog2.vista.ExcepcioEstacio;

/**
 * Represents a train station view.
 *
 * @author Albert
 */
public class VistaEstacioTren implements Serializable{
    private String nomEstacio;
    private EstacioTren estacioTren;
    
    
    /**
     * Constructor de la classe VistaEstacioTren amb paràmetres
     * @param nomEstacio 
     * @throws prog2.vista.ExcepcioEstacio 
     */
    public VistaEstacioTren(String nomEstacio) throws ExcepcioEstacio{
        this.nomEstacio = nomEstacio;
        this.estacioTren = new EstacioTren(nomEstacio);
        this.estacioTren.inicialitzaDadesEstacioTren();
    }
    
    /**
     * Mètodes getters i setters de nomEstacio
     * @return 
     */
    public String getNomEstacio() {
        return nomEstacio;
    }

    public void setNomEstacio(String nomEstacio) {
        this.nomEstacio = nomEstacio;
    }
    
    /**
     * Mètode que gestiona el menu principal de l'aplicació
     * @throws prog2.vista.ExcepcioEstacio
     * @throws java.io.IOException
     */
    public void gestioEstacioTren() throws ExcepcioEstacio, IOException{
        Scanner sc = new Scanner(System.in);
        enum MenuOpcions{OP1, OP2, OP3, OP4, OP5, OP6, OP7, OP8, OP9, OP10, OP11, OP12, OPSORTIR}
        MenuOpcions[] menuOpcions = MenuOpcions.values(); //Converteix l'enum en un array de constants
        Menu<MenuOpcions> menu = new Menu<>("MENU PRINCIPAL",menuOpcions); //Defineix el menu amb el nom d'estacio i l'array d'opcions
        
        String[] descripcions = {"Llistar la informacio de totes les vies",
                                               "Llistar la informacio de les vies obertes",
                                               "Llistar la informacio de les vies tancades",
                                               "Llistar la informacio dels accessos oberts", 
                                               "Llistar la informacio dels accessos tancats",
                                               "Llistar la informacio de les incidencies actuals", 
                                               "Afegir una incidencia", 
                                               "Eliminar una incidencia", 
                                               "Calcular i mostrar el numero total d'accessos que proporcionen accessibilitat", 
                                               "Calcular i mostrar el numero total de metres de longitud d'accessos de nivell", 
                                               "Guardar estacio", 
                                               "Recuperar estacio", 
                                               "Sortir de l'aplicacio"};
        menu.setDescripcions(descripcions);
        MenuOpcions op = null;
        do{
            menu.mostrarMenu(); //Mostrar menu
            op = menu.getOpcio(sc);
            
            switch(op){
                
                case OP1:
                    System.out.println("Informacio de totes les vies:\n");
                    ArrayList<Via> vies = estacioTren.getLlistaVies().getLlistaVies();
                    for(Via via : vies) System.out.println(via.toString());
                    
                    break;
                
                case OP2:
                    System.out.println("Informacio de vies obertes:\n");
                    System.out.println(estacioTren.getLlistaVies().llistarVies("Obert"));
                    break;
                
                case OP3:
                    System.out.println("Informacio de vies tancades:\n");
                    System.out.println(estacioTren.getLlistaVies().llistarVies("Tancat"));
                    break;
                    
                case OP4:
                    System.out.println("Informacio dels accessos oberts:\n");
                    System.out.println(estacioTren.getLlistaAccessos().llistarAccessos(true));
                    estacioTren.getLlistaAccessos().llistarAccessos(true);
                    break;
                    
                case OP5:
                    System.out.println("Informacio dels accessos tancats:\n");
                    System.out.println(estacioTren.getLlistaAccessos().llistarAccessos(false));
                    estacioTren.getLlistaAccessos().llistarAccessos(false);
                    break;
                    
                case OP6:
                    System.out.println("Informacio d'indidencies actuals:\n");
                    System.out.println(estacioTren.getLlistaIncidencies().llistarIncidencies());
                    break;
                    
                case OP7:
                    System.out.println("Afegir una incidencia\n");
                    /* Afegir incidencia */
                    System.out.println("Entra informacio de l'incidencia:\nNumero: ");
                    int num = sc.nextInt();
                    
                    System.out.println("Tipus: ");
                    String tipus = sc.next(); 
                    
                    
                    StringBuilder sb = new StringBuilder(tipus);
                    char c = tipus.charAt(0);
                    if(!Character.isUpperCase(c)){  //Si el primer caracter del tipus no està en majúscula, el posa en majúscula 
                        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0))); // Cal posar-lo per quan sigui llegit pel mètode afegirIncidencia()
                    }
                    
                    System.out.println("Nom de via: ");
                    String nom = sc.next();
                    System.out.println("Data: ");
                    String data = sc.next();
                    
                    estacioTren.afegirIncidencia(num, sb.toString(), nom, data);
                    System.out.println("Incidencia afegida");
                    
                    /* Tancar accessos de la via on hi ha incidencia*/
                    estacioTren.getLlistaAccessos().actualitzaEstatAccessos();
                    
                    break;
                    
                case OP8:
                    System.out.println("Eliminar una incidencia\n");
                    System.out.println(estacioTren.getLlistaIncidencies().llistarIncidencies());
                    
                    System.out.println("Entra numero d'incidencia a eliminar:\n");
                    int numIn = sc.nextInt();
                    
                    estacioTren.eliminarIncidencia(numIn);
                    
                    System.out.println("Incidencia eliminada");
                    break;
                    
                case OP9:
                    System.out.println("Calcular totat d'accessos accessibles\n");
                    
                    System.out.println("Nombre d'accessos accessibles: " + estacioTren.getLlistaAccessos().calculaAccessosAccessibles());
                    break;
                    
                case OP10:
                    System.out.println("El numero total de metres de longitud d'accessos de nivell:\n");
                    
                    System.out.println("Metres de longitud d'accessos a nivell: " + estacioTren.getLlistaAccessos().calculaLongitudAccessosNivell() + " metres");
                    break;
                    
                case OP11:
                    System.out.println("Guardar estacio\n");
                    try{
                        estacioTren.guardar("EstacioTren.dat");
                        System.out.println("Estacio guardada");
                    }catch (ExcepcioEstacio e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case OP12:
                    System.out.println("Recuperar estacio\n");
                    try{
                        this.estacioTren = EstacioTren.carregar("EstacioTren.dat");
                        System.out.println("Estacio recuperada");
                    }catch (ExcepcioEstacio e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case OPSORTIR:
                    System.out.println("Sortint del menu de gestio de l'estacio");
                    break;
            }
        }while(op != MenuOpcions.OPSORTIR);
    }
}
