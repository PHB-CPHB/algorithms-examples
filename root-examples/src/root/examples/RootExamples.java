/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.examples;

/**
 *
 * @author philliphbrink
 */
public class RootExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Root root = new Root();
        if (Double.valueOf(args[0]) == 1){
            root.simpleRoot(Double.valueOf(args[1]), Double.valueOf(args[2]));
        } else {
            root.binaryRoot(Double.valueOf(args[1]), Double.valueOf(args[2]));
        }
    }
    
}
