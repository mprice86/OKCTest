/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package okctest;

public class checkImportance {

    public static int checkImportVal(int importVal) {
        if (importVal == 1) {
            importVal = 0;
        } else if (importVal == 2) {
            importVal = 1;
        } else if (importVal == 3) {
            importVal = 10;
        } else if (importVal == 4) {
            importVal = 50;
        } else if (importVal == 5) {
            importVal = 250;
        }
        return importVal;
    }
}
