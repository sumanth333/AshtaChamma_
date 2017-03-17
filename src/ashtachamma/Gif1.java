package ashtachamma;

import static ashtachamma.Attributes.dieImage;

public class Gif1 extends Attributes implements Runnable
{

    @Override
    public void run() 
    {
         m1();
    } 
    synchronized void m1()
    {
        dieImage.setIcon(diceValue[0]);
         
        try{Thread.sleep(400);}catch(InterruptedException e){}  
         if(dice<=4)
        dieImage.setIcon(diceValue[dice]);
        else
            dieImage.setIcon(diceValue[5]);
         
         
    }
    
}
