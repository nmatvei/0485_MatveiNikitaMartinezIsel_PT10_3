package com.mycompany._matveinikitamartinezisel_pt10_3;

/**
 * 
 * @author nikita i isel
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("PROVES PER COMPROVAR EL FUNCIONAMENT DE LES CLASSES:");
        System.out.println("ArrayReals (que implementa la interfície Estadistiques)");
        System.out.println("\n\tDeclarem un primer objecte amb el constructor per defecte");
        ArrayReals array1 = new ArrayReals();
        System.out.println("\n\tAmb els mètodes que hem heretat de la inteficie, extreiem:");
        System.out.println("\n\t\tEl valor minim de l'array: " + array1.minim());
        System.out.println("\n\t\tEl valor màxim de l'array: " + array1.maxim());
        System.out.println("\n\t\tLa suma de tots els valors de l'array: " + array1.suma());
    }
}
