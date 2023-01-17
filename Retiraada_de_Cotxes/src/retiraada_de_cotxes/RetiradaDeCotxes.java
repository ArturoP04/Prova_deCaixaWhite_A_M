/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retiraada_de_cotxes;

/**
 *
 * @author arturo.perez
 */
public class RetiradaDeCotxes {

    /**
     */
    public static String[][] cotxes = {
        {"1", "6057-ZDD", "Gasoil", "2008"},
        {"2", "9402-JXP", "Diesel", "2009"},
        {"3", "6764-KCR", "Gasoil", "2018"},
        {"4", "1121-UPX", "Diesel", "2017"},
        {"5", "9297-GHX", "Diesel", "2007"},
        {"6", "8354-SBQ", "Gasoil", "2012"}
    };

    private static String[][] cotxesRetirats = new String[1][4];

    static boolean trobat = false;
    static int poscotxe = 0;

    public static String[][] getCotxes() {
        for (int i = 0; i < cotxes.length; i++) {
            System.out.println("  ");
            for (int j = 0; j < cotxes[i].length; j++) {
                System.out.print(" " + cotxes[i][j] + " ");

            }

        }
        System.out.println("  ");
        return cotxes;
    }

    public static String[][] getCotxesRetirats() {
        for (int i = 0; i < cotxesRetirats.length; i++) {
            System.out.println("  ");
            for (int j = 0; j < cotxesRetirats[i].length; j++) {
                System.out.println(" " + cotxesRetirats[i][j] + " ");
            }

        }
        System.out.println("  ");
        return cotxesRetirats;
    }

    public static void menu() {
        System.out.println("Escull una opció");
        System.out.println("1. Llitsar cotxes");
        System.out.println("2. Llistar cotxes retirats");
        System.out.println("3. Verificar cotxes");
        System.out.println("0. Sortir");
    }

    public static void Verifacio() {
        int Matricula = 2010;
        int comptadortrobat = 1;
        /*PASSEM 3 VALOR A INT*/

 /*   if (number < 2010) {
         */
        trobat = false;
        int comptadortest = 1;
        for (int z = 0; z < cotxes.length; z++) {/*BUCLE FOR AMB CONDICIÓ DE TROBAR*/
            if ((cotxes[z][2] == "Diesel") && (Integer.parseInt(cotxes[z][3]) < Matricula)) {
                poscotxe = z;
                trobat = true;
            }

         if (trobat) {
                if (comptadortrobat != 0) {

                    String[][] aux = new String[comptadortrobat][4];

                    for (int k = 0; k < cotxesRetirats.length; k++) {
                        for (int l = 0; l < 4; l++) {
                            aux[k][l] = cotxesRetirats[k][l];
                        }
                    }
                        cotxesRetirats = aux;
//                     String[][] cotxesRetirats = new String[comptadortest][4];
//
//                    for (int k = 0; k < aux.length; k++) {
//                        for  (int l = 0; l < 4; l++) {
//                              cotxesRetirats[k][l] = aux[k][l];
//                        }
//                    }

                }
                for (int b = 0, n = 0; n < 4; n++) {
                    cotxesRetirats[cotxesRetirats.length-1][0] = cotxes[poscotxe][0];
                    cotxesRetirats[cotxesRetirats.length-1][1] = cotxes[poscotxe][1];
                    cotxesRetirats[cotxesRetirats.length-1][2] = cotxes[poscotxe][2];
                    cotxesRetirats[cotxesRetirats.length-1][3] = cotxes[poscotxe][3];
                    /*  b++;*/
                }   
            comptadortrobat++;
            trobat = false;
            }
            
        }

    }
}
