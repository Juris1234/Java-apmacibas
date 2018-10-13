/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author Viktoria
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Garums gar = new Garums();
       Uzdevumi uzd = new Uzdevumi();
        //System.out.println(uzd.VirknesGarums());
        //System.out.println(uzd.Kopa());
          //Cipari cpr = new Cipari();
          //stem.out.println(cpr.Cipari());
          System.out.println("Ievadiet skaitli: ");
          Scanner sc = new Scanner (System.in);
          int skaitlis = sc.nextInt();
          
          System.out.println(uzd.IsPositive(skaitlis) ) ;
          
          if(uzd.IsPositive(skaitlis)){
              System.out.println("vii");
          }else{
              System.out.println("vii2");  
          }
    }
    
}
