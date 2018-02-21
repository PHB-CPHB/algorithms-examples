package egg;

/**
 * @author (Torben Østrup)
 * @version (a, 14.02.18)
 */
public class Egg
{
    // instance variables
    private int nooffloors;
    private int secretfloor;
    private int flowbuilding;
    private int egglowbuilding = 0;
    private int fhighbuilding;
    private int egghighbuilding = 0;
    private int low;
    private int high;
    
    // constructor
    public Egg(int nooffloors, int secretfloor)
    {
        this.nooffloors = nooffloors;
        this.secretfloor = secretfloor;
        egg1();
        System.out.println("Low : N = " + nooffloors + " F = " + flowbuilding + ". Eggs used = " + egglowbuilding);
        egg2();
        System.out.println("Low : N = " + nooffloors + " F = " + fhighbuilding + ". Eggs used = " + egghighbuilding);
    }

    // low building
    public void egg1()
    {
        low = 1;
        high = nooffloors;
        while (high - low > 1)
        {
           flowbuilding = (low + high) / 2;
           if (flowbuilding >= secretfloor)
           {
               egglowbuilding++;
               high = flowbuilding;
           }
           else
           {
               low = flowbuilding;
           }
        }
        flowbuilding = high;
    }
    
    // high building
    public void egg2()
    {
        low = 0;
        high = 1;
        
        while(high < secretfloor)
        {
            low = high;
            high = 2 * high;
            if(high > nooffloors) high = nooffloors;
        }
        egghighbuilding++;     
        
        while (high - low > 1)
        {
           fhighbuilding = (low + high) / 2;
           if (fhighbuilding >= secretfloor)
           {
               egghighbuilding++;
               high = fhighbuilding;
           }
           else
           {
               low = fhighbuilding;
           }
        }
        fhighbuilding = high;
    }
    
    // main
    public static void main(String[] args)
    {
        new Egg(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
