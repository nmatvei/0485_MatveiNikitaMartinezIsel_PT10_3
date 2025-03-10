package com.mycompany._matveinikita_pt10_3;

import java.util.Random;

/**
 * Main per realitzar les proves de les classes ArrayReals i Math1
 * 
 * @author nikita
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("PROVES PER COMPROVAR EL FUNCIONAMENT DE LES CLASSES:");
        System.out.println("ArrayReals (que implementa la interfície Estadistiques)");
        System.out.println("\n\tDeclarem un primer objecte amb el constructor per defecte");
        ArrayReals array1 = new ArrayReals();
        System.out.println("\n\tAmb els mètodes que hem heretat de la inteficie, extreiem:");
        System.out.println("\n\t\tEls valors que hi ha dins de l'array: "); array1.imprimir();
        System.out.println("\n\t\tEl valor minim de l'array: " + array1.minim());
        System.out.println("\n\t\tEl valor màxim de l'array: " + array1.maxim());
        System.out.println("\n\t\tLa suma de tots els valors de l'array: " + array1.suma());
        System.out.println("\n\tDeclarem un segon objecte amb el constructor que rep un parametre");
        ArrayReals array2 = new ArrayReals(4);
        System.out.println("\n\tAmb els mètodes que hem heretat de la inteficie, extreiem:");
        System.out.println("\n\t\tEls valors que hi ha dins de l'array: "); array2.imprimir();
        System.out.println("\n\t\tEl valor minim de l'array: " + array2.minim());
        System.out.println("\n\t\tEl valor màxim de l'array: " + array2.maxim());
        System.out.println("\n\t\tLa suma de tots els valors de l'array: " + array2.suma());
        System.out.println("Math1 (que implementa la interfície Extrems)");
        System.out.println("\nPer realitzar les proves, declararem:");
        System.out.println("\n\t- Un objecte Math1 guardat en una variable");
        Math1 mates = new Math1();
        System.out.println("\n\t- Una taula amb nombres reals de la cual podem extreure amb Math1:");
        double[] llistaDouble = new double[7];
        llistaDouble = omplirArraysDouble(llistaDouble);
        System.out.println("\n\t\tEls seus elements: " + mates.imprimirArrayDouble(llistaDouble));
        System.out.println("\n\t\tEl seu valor mínim: " + mates.min(llistaDouble));
        System.out.println("\n\t\tEl seu valor màxim: " + mates.max(llistaDouble));
        System.out.println("\n\t- Una taula amb nombres enters de la cual podem extreure amb Math1:");
        int[] llistaInt = new int[7];
        llistaInt = omplirArraysInt(llistaInt);
        System.out.println("\n\t\tEls seus elements: " + mates.imprimirArrayInt(llistaInt));
        System.out.println("\n\t\tEl seu valor mínim: " + mates.min(llistaInt));
        System.out.println("\n\t\tEl seu valor màxim: " + mates.max(llistaInt));
    }
    
    /**
     * Mètode omplirArraysInt que rep com a paràmetre un array de int i que retorna
     * aquest mateix omplert amb valors des del 0 fins el 50
     * 
     * @param elementsEnters
     * @return elementsEnters
     */
    public static int[] omplirArraysInt(int[] elementsEnters){
        /*Declaració de variables dins del mètode*/
        Random generarNombreAleatori = new Random();
        final int VALOR_MAXIM = 50;
        
        /*Donem valors a cada posició del array*/
        for (int i = 0; i < elementsEnters.length; i++){
            elementsEnters[i] = generarNombreAleatori.nextInt(VALOR_MAXIM + 1);
            /*Fent VALOR_MAXIM(50)+1 determinem que els valors siguin entre 0 i 50*/
        }
        /*Retornem la llista*/
        return elementsEnters;
    }
    
    /**
     * Mètode omplirArraysDouble que rep com a paràmetre un array de double i que
     * retorna aquest mateix omplert amb valors des del 0 fins el 50 (amb tots 
     * els seus decimals).
     * 
     * @param elementsReals
     * @return elementsReals
     */
    public static double[] omplirArraysDouble(double[] elementsReals){
        /*Declaració de variables dins del mètode*/
        Random generarNombreAleatori = new Random();
        final int VALOR_MAXIM = 50;
        
        /*Donem valors a cada posició del array*/
        for (int i = 0; i < elementsReals.length; i++){
            elementsReals[i] = generarNombreAleatori.nextDouble() * VALOR_MAXIM;
            /*Al multiplicar el VALOR_MAXIM (50) al Random, fem que el valor
            d'aquest també estigui inclos (en el nostre cas, tots els valors
            entre 0 i 100 amb els seus decimas i ambdos inclosos*/
        }
        /*Retornem la llista*/
        return elementsReals;
    }
}
