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

/**
 * @author (Torben Østrup) 
 * @version (a, 10.02.17)
 */
public class Root
{
    // instance variables 

    // constructor
    public Root()
    {
        
    }

    // step
    public void simpleRoot(double x, double precision)
    {
        boolean running = true;
        double min = 0.;
        while(running)
        {
            if(min*min >= x)
            {
                running = false;
            }
            else
            {
                min += precision;
            }
        }
        System.out.println("Sqrt of " + x + " = " + min);
    }
    
    // binary search for x > 1
    public void binaryRoot(double x, double precision)
    {
        boolean running = true;
        double min = 0.;
        double max = x;
        double result = (min + max) / 2;
        
        while(running)
        {
            if(max - min < precision)
            {
                running = false;
            }
            else
            {
                if(result * result > x)
                {
                    max = result;
                }
                else
                {
                    min = result;
                }
            }
            result = (min + max) / 2;
        }
        System.out.println("Sqrt of " + x + " = " + min);
    }
}

