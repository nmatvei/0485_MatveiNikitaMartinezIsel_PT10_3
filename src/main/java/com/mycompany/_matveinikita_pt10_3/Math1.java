package com.mycompany._matveinikita_pt10_3;

import Interficies.Extrems;

/**
 * Classe final Math1
 * 
 * @author nikita
 */
public final class Math1 implements Extrems{
    /**
     * Constructor buit, ja que, volem instanciar l'objecte Math1 però, com no tenim
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
            if (a[i] < minim){
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
    
    /**
     * Mètode imprimirArrayInt que rep com a paràmetre una taula de int i
     * mostra per pantalla els nombres que hi ha dins
     * @param elementsInt 
     */
    public String imprimirArrayInt(int[] elementsInt){
        String contingutElementsEnters = "";
        for (int i = 0; i < elementsInt.length; i++) {
            if (i == (elementsInt.length - 1)){
                /*Donem un format de sortida al últim nombre*/
                contingutElementsEnters = contingutElementsEnters + elementsInt[i];
            }
            else{
                /*Canviem el fomat per quan no és l'últim nombre*/
                contingutElementsEnters = contingutElementsEnters + elementsInt[i] + ",";
            }
        }
        /*Mostrem per pantalla el contingut de l'array*/
        return contingutElementsEnters;
    }
    
    /**
     * Mètode imprimirArrayDouble que rep com a paràmetre una taula de double i
     * mostra per pantalla els nombres que hi ha dins.
     * @param elementsReals 
     */
    public String imprimirArrayDouble(double[] elementsReals){
        String contingutElementsReals = "";
        for (int i = 0; i < elementsReals.length; i++) {
            if (i == (elementsReals.length - 1)){
                /*Donem un format de sortida al últim nombre*/
                contingutElementsReals = contingutElementsReals + elementsReals[i];
            }
            else{
                /*Canviem el fomat per quan no és l'últim nombre*/
                contingutElementsReals = contingutElementsReals + elementsReals[i] + ",";
            }
        }
        /*Retornem el contingut de l'array*/
        return contingutElementsReals;
    }
}