/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author Viktoria
 */
public class Day2 {

    public static void main(String[] args) {
        /* strada//Scanner sc = new Scanner(System.in);
        System.out.println("Kads tagad ir gads?"); 
        int skaitlis1 = sc.nextInt();
        
        System.out.println("Kura gada esiet dzimis?");
        int skaitlis2 = sc.nextInt();
        int rezultats = skaitlis1 - skaitlis2;
        System.out.println("Jus esat " + rezultats + " gadus vecs");
        /*Scanner sc = new Scanner(System.in);*/
        /*System.out.println("Ievadiet skaitlis1!");
        /*int skaitlis1 = sc.nextInt();*/
        
         /*System.out.println("Ievadiet 2.skaitli!");
        int skaitlis2 = sc.nextInt();
        int rezultats = skaitlis1 + skaitlis2;
        
        System.out.println("Rezultats ir " +rezultats +5);
        
         //*nakamaja japarada kad dzimis un cik gadu jaaprekina 

 /*Scanner sc = new Scanner(System.in); // - sitais strada....lai sakartotu rindkopasa alt+shift+f

        System.out.println("Ievadiet gadu kurs ir sobrid");
        int tekosaisGads = sc.nextInt();

        System.out.println("Ievadiet savu dzimsanas gadu");
        int dzimsanasGads = sc.nextInt();
        
        int rezultats = tekosaisGads - dzimsanasGads;
        
        System.out.println("Jusu vecums ir" + rezultats + "gadi");

         dzimsanasGadaAprekins(); /*lai izsauktu funkciju uz apaksejo kodu un lai to 3 reizes jaizdara tad tris reiz jaiekope vien
         zem otra zimsanasGadaAprekins*, Ja kods atkartojas tad ta ir visdrizak kluda. Visam funkcijam jabut klase*/
         /*saskaitisana(9,5);
         saskaitisana(20,11); 
         int a = 5;
         saskaitisana(a, 6);*/
         ievade();
        //atnemsana();
        //atnemsana(9, 11);*/
       
             
    }
    /*strada//public static void saskaitisana(int skaitlis1, int skaitlis2){
       int rezultats = skaitlis1 + skaitlis2;
        System.out.println(rezultats);*/
    public static void ievade() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet skaitli 1");
        int sk1 = sc.nextInt();

        System.out.println("Ievadiet skaitli 2");
        int sk2 = sc.nextInt();
        
        int citsRezultats = reizinasana(sk1, sk2);
        int a = citsRezultats + 7;
        System.out.println(a);
        
        //atnemsana(sk1, sk2);
    }
        
       // atnemsana(sk1, sk2);
        /*int citsRezultats = reizinasana(sk1, sk2);
        reizinasana(4, 5);
        System.out.println(citsRezultats);*/
    
    public static void atnemsana(int skaitlis1, int skaitlis2){
        int rezultats = skaitlis1 - skaitlis2;
        System.out.println(rezultats);
    }

public static int reizinasana(int skaitlis1, int skaitlis2){
    int rezultats = skaitlis1 * skaitlis2;
    return rezultats;

      
    /*public static void dzimsanasGadaAprekins() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet gadu kurs ir sobrid");
        int tekosaisGads = sc.nextInt();

        System.out.println("Ievadiet savu dzimsanas gadu");
        int dzimsanasGads = sc.nextInt();

        int rez2
    /*public static void saskaitisana(int skaitlis1, int skaitlis2){ // mainigie vai parametri tie skaitli
         int rezultats = skaitlis1 + skaitlis2;
            System.out.println(rezultats);*/
    /*public static void atnemsana(int skaitlis1, int skaitlis2) { //si ir funkcija
        int rezultats = skaitlis2 - skaitlis1;
        System.out.println(rezultats);*/
        
    }
}
    /*public static int reizinasana(int skaitlis1, int skaitlis2);
    int rezultats = skaitlis1 * skaitlis2;
    return rezultats;    */

