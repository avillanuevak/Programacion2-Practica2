/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog2.vista;

/**
 * Custom exception for when a station is full
 * @author Albert
 */
public class ExcepcioEstacio extends Exception {
    public ExcepcioEstacio(String message) {
        super(message);
    }
}