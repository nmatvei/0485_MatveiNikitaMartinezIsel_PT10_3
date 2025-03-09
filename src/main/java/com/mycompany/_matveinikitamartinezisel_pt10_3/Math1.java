package com.mycompany._matveinikitamartinezisel_pt10_3;

import Interficies.Extrems;

/**
 * 
 * 
 * @author nikit
 */
public class Math1 implements Extrems{
    /*Declaració de variables i atributs*/
    private int arrayInt[];
    private double arrayDouble[];
    
    public Math1(int[] taula){
        this.arrayInt = taula;
    }
    
    public Math1(double[] taula){
        this.arrayDouble = taula;
    }
    
    @Override
    public int min(int[ ] a){
        int minim = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minim){
                minim = a[i];
            }
        }
        return minim;
    }
    
    @Override
    public int max(int[ ] a){
        int maxim = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxim){
                maxim = a[i];
            }
        }
        return maxim;
    }
    
    
    @Override
    public double min(double[ ] a){
        double minim = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > minim){
                minim = a[i];            }
        }
        return minim;
    }
    
    @Override
    public double max(double[ ] a){
        double maxim = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxim){
                maxim = a[i];
            }
        }
        return maxim;
    }
}
