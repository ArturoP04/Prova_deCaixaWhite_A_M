/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RetiradaDeCotxes;

/**
 *
 * @author arturo.perez
 */
public class RetiradaDeCotxes {

    /**
     * @param args the command line arguments
     */

    private static String[][] cotxes
            = {
                {"0", "6057 ZDD", "Gasoil", "2008"},
                {"1", "9402 JXP", "Gasoil", "2009"},
                {"2", "6764 KCR", "Gasoil", "2018"},
                {"3", "1121 UPX", "Gasoil", "2017"},
                {"4", "9297 GHX", "Gasoil", "2010"},
                {"5", "8354 SBQ", "Gasoil", "2012"}
            };
    
    private static String[][] cotxesRetirats = new String[1][3];

    public static String[][] getCotxes() {
        return cotxes;
    }
}
