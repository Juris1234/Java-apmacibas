/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4real;

import java.util.Scanner;

/**
 *
 * @author Viktoria
 */
public class Day4real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Kalkulators() {
        JaunaKlase piemers = new JaunaKlase();
        piemers.Izvade();
        int a = piemers.Atgriez();
        
        JaunaKlase piemers2 = new JaunaKlase();
        piemers2.Izvade();*/
    JaunaKlase2 calc = new JaunaKlase2();
    int rezultats = calc.Saskaitit(4, 5);
    rezultats = calc.Saskaitit(1, 2);
    System.out.println(rezultats);
    
    }
    public static void Kalkulators() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Gribat vai saskaitit vai atnemt?Ievadiet + vai - ");
        String izvele = sc.nextLine();
        
        
        System.out.println("Ievadiet 1. skaitli");
        int skaitlis1 = sc.nextInt();
        
        System.out.println("Ievadiet 2. skaitli");
        int skaitlis2 = sc.nextLine();
        
        Aprekini apr = new Aprekini();
        apr.
        
        /*if(izvele.equals("+")){
            System.out.println("Rezultats ir "); 
            System.out.println("skaitlis1+skaitlis2");
        }else if(izvele.equals("-")){
        System.out.println("Rezultats ir"); 
            System.out.println("skaitlis1-skaitlis2");
        }else{
            System.out.println("Ievade nav pareiza");*/
        }
    }
}
