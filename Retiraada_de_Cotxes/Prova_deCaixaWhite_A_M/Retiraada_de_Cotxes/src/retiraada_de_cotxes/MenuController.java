/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retiraada_de_cotxes;

import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class MenuController {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcio = -1;
        boolean sortir=false;
          do {
        RetiradaDeCotxes.menu();
          opcio = entrada.nextInt();
      
        switch (opcio) {
            case 1:  /*Llistar cotxes*/
            RetiradaDeCotxes.getCotxes();
                break;
            case 2:/*Llistar cotxes retirats*/
              RetiradaDeCotxes.getCotxesRetirats();
                break;
            case 3: /*Verificar cotxes*/
                /*bucle for if i funcio de passar a l'altre array augmentant l'array*/
                RetiradaDeCotxes.Verifacio();
                break;               
            case 0:/*Sortir*/
                sortir=true;
                break;    
               
            default:
                System.out.println("Introduexi una de les opcions següents:");
                RetiradaDeCotxes.menu();
        }
        } while (!sortir);

    }

}
