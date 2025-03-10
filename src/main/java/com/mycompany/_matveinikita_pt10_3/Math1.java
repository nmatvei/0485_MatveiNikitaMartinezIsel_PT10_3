package com.mycompany._matveinikita_pt10_3;

import Interficies.Extrems;

/**
 * Classe final Math1
 * 
 * @author nikita
 */
public final class Math1 implements Extrems{
    /**
     * Constructor buit, ja que, volem instanciar l'objecte però, com no tenim
     * cap atribut, no donem cap valor a res i només volem utilitzar l'objecte 
     * per fer ús dels seus mètodes.
     */
    public Math1(){}
    
    /**
     * Mètode sobrescrit min que rep com a parametre una llista de itn per extreure
     * el nombre més petit de la llista.
     * 
     * @param a
     * @return minim
     */
    @Override
    public int min(int[ ] a){
        /*Declaració de variables*/
        int minim = a[0];
        
        /*Estructura FOR per pasar per tot la taula i determinar el mínim valor
        d'aquesta*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minim){
                minim = a[i];
            }
        }
        /*Retornem el valor mínim*/
        return minim;
    }
    
    /**
     * Mètode sobrescrit max que rep com a parametre una llista de itn per extreure
     * el nombre més gran de la llista.
     * 
     * @param a
     * @return maxim
     */
    @Override
    public int max(int[ ] a){
        /*Declaració de variables*/
        int maxim = a[0];
        
        /*Estructura FOR per pasar per tot la taula i determinar el màxim valor
        d'aquesta*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxim){
                maxim = a[i];
            }
        }
        
        /*Retornem el valor màxim*/
        return maxim;
    }
    
    /**
     * Mètode sobrescrit min que rep com a paràmetre una llistat de doubles per
     * extreure el nombre més petit de la llista.
     * 
     * @param a
     * @return minim
     */
    @Override
    public double min(double[ ] a){
        /*Declaració de variables*/
        double minim = a[0];
        
        /*Estructura FOR per pasar per tot la taula i determinar el mínim valor
        d'aquesta*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] > minim){
                minim = a[i];            }
        }
        
        /*Retornem el valor mínim*/
        return minim;
    }
    
    /**
     * Mètode sobrescrit max que rep com a paràmetre una llistat de doubles per 
     * extreure el nombre més gran de la llista.
     * 
     * @param a
     * @return maxim
     */
    @Override
    public double max(double[ ] a){
        /*Declaració de variables*/
        double maxim = a[0];
        
        /*Estructura FOR per pasar per tot la taula i determinar el màxim valor
        d'aquesta*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxim){
                maxim = a[i];
            }
        }
        
        /*Retornem el valor màxim*/
        return maxim;
    }
}
