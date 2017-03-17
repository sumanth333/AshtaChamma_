package ashtachamma;

public class Buttons02A extends Attributes
{
	Buttons02A()
	{

     	if(dice==1&&buttons[0][1].getIcon()!=outside[1])
     	{	
     		
                int temp=kill1;bclick=false;
     		gp1[0]--;
     		if(buttons[0][1].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
     		buttons[0][1].setIcon(outside[1]);
     		new setNumbers1(temp,kill1);
                new disHighlight1();
     	}
     	else if(dice==2&&buttons[0][0].getIcon()!=outside[1])
     	{
     		
                int temp=kill1;bclick=false;
     		gp1[0]--;
     		if(buttons[0][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
     		buttons[0][0].setIcon(outside[1]);
                dievalues[loc].setIcon(numbers[0][0]);
                new setNumbers1(temp,kill1);
                new disHighlight1();
       	}
     	else if(dice==3&&buttons[1][0].getIcon()!=outside[1])
     	{
                int temp = kill1;bclick=false;
     		gp1[0]--;
     		if(buttons[1][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
     		buttons[1][0].setIcon(outside[1]);
                new setNumbers1(temp,kill1);
                new disHighlight1();
       	}
     	else if(dice==4)
     	{
     		gp1[0]--;gp1[1]++;bclick=false;
     		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
                new setNumbers1(0,0);
                new disHighlight1();
     	}
     	else if(dice==8)
     	{
     		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     		gp1[0]--;gp1[2]++;bclick=false;
     		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
     		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
                new setNumbers1(0,0);
                new disHighlight1();
     	}
	}
}
class Buttons01A extends Attributes
{
	Buttons01A()
	{
 	   
     if(dice==1&&buttons[0][0].getIcon()!=outside[1])
     {
        int temp=kill1;bclick=false;
     	if(buttons[0][0].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
         buttons[0][1].setIcon(outside[0]);
         buttons[0][0].setIcon(outside[1]);
         new setNumbers1(temp,kill1);
         new disHighlight1();
     }
     else if(dice==2&&buttons[1][0].getIcon()!=outside[1])
     {
         int temp=kill1;bclick=false;
     	if(buttons[1][0].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else {roll=true;actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     	buttons[0][1].setIcon(outside[0]);
     	buttons[1][0].setIcon(outside[1]); 
         new setNumbers1(temp,kill1);
         new disHighlight1();
     }
     else if(dice==3)
      {
         gp1[1]++;bclick=false;
         buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
         buttons[0][1].setIcon(outside[0]);
         new setNumbers1(0,0);
         new disHighlight1();
        actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
      }
     else if(dice==4&&buttons[3][0].getIcon()!=outside[1])
     {
         int temp=kill1;bclick=false;
     	if(buttons[3][0].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);choice.setText(p1Name+" You got another chance");
     	}
     	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     	
     	buttons[0][1].setIcon(outside[0]);
         buttons[3][0].setIcon(outside[1]);
         new setNumbers1(temp,kill1);
         new disHighlight1();
     }
     else if(dice==8&&buttons[4][3].getIcon()!=outside[1])//(dice==8)
     {
         int temp=kill1;bclick=false;
     	if(buttons[4][3].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     	buttons[0][1].setIcon(outside[0]);
         buttons[4][3].setIcon(outside[1]);
         new setNumbers1(temp,kill1);
         new disHighlight1();
     }
    }
}
class Buttons00A extends Attributes
{
	Buttons00A()
	{
		
        if(dice==1 && buttons[1][0].getIcon()!=outside[1])
        {
                int temp=kill1;bclick=false;
        	if(buttons[1][0].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
        		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][0].setIcon(outside[0]);
            buttons[1][0].setIcon(outside[1]);
            new setNumbers1(temp,kill1);
            new disHighlight1();
        }
            
        else if(dice==2)
        {
            actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            gp1[1]++;bclick=false;
            buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
            buttons[0][0].setIcon(outside[0]);
            new setNumbers1(0,0);
            new disHighlight1();
        }
        else if(dice==3 && buttons[3][0].getIcon()!=outside[1])
        {
                int temp = kill1;bclick=false;
        	if(buttons[3][0].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
        		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[3][0].setIcon(outside[1]);
            buttons[0][0].setIcon(outside[0]);
            new setNumbers1(temp,kill1);
            new disHighlight1();
        }
        else if(dice==4&& buttons[4][0].getIcon()!=outside[1])
        {
                int temp = kill1;bclick=false;
        	if(buttons[4][0].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[0][0].setIcon(outside[0]);
            buttons[4][0].setIcon(outside[1]);
            new setNumbers1(temp,kill1);
            new disHighlight1();
        }
        else if(dice==8&& buttons[4][4].getIcon()!=outside[1])//(dice==8)
        {
                int temp = kill1;bclick=false;
        	if(buttons[4][4].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[4][4].setIcon(outside[1]);
            buttons[0][0].setIcon(outside[0]);
            new setNumbers1(0,0);
            new disHighlight1();
        }
	}
}
class Buttons10A extends Attributes
{
	Buttons10A()
	{
		 
     	if(dice==1)
     	{		bclick=false;gp1[1]++;
     			actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
                      buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
                      buttons[1][0].setIcon(outside[0]);
                      new setNumbers1(0,0);
                        new disHighlight1();
     	}
     	else if(dice==2&&buttons[3][0].getIcon()!=outside[1])
     	{
                int temp=kill1;bclick=false;
     		if(buttons[3][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[1][0].setIcon(outside[0]);
     		buttons[3][0].setIcon(outside[1]);
                new setNumbers1(temp,kill1);
                new disHighlight1();
   
     	}
     	else if(dice==3&&buttons[4][0].getIcon()!=outside[1])
     	{
                int temp = kill1;bclick=false;
     		if(buttons[4][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[1][0].setIcon(outside[0]);
     		buttons[4][0].setIcon(outside[1]);
                new setNumbers1(temp,kill1);
                new disHighlight1();
   
     	}
     	else if(dice==4&&buttons[4][1].getIcon()!=blackEntry.get(1))//To be continued
     	{
                        int temp = kill1;bclick=false;
     			if(buttons[4][1].getIcon()==blackEntry_1.get(2))
     			{
     				kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
         			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     			}
     			else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     			buttons[1][0].setIcon(outside[0]);
     			buttons[4][1].setIcon(blackEntry.get(1));
                        new setNumbers1(temp,kill1);
                        new disHighlight1();
         }
     	else if(dice==8&&buttons[3][4].getIcon()!=outside[1])
     	{
                int temp=kill1;bclick=false;
     		if(buttons[3][4].getIcon()==outside1[2])
                      {
			     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
			     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                      }
     		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
                      buttons[1][0].setIcon(outside[0]);
                      buttons[3][4].setIcon(outside[1]);
                      new setNumbers1(temp,kill1);
                        new disHighlight1();
     	}
	}
}
class Buttons20A extends Attributes
{
	Buttons20A()
	{
		 
     	if(dice==1&&buttons[3][0].getIcon()!=outside[1])
     	{
                int temp=kill1;bclick=false;
     		gp1[1]--;
     		if(buttons[3][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
     		buttons[3][0].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
     	}
     	else if(dice==2&&buttons[4][0].getIcon()!=outside[1])
     	{
                int temp=kill1;bclick=false;
     		gp1[1]--;
     		if(buttons[4][0].getIcon()==outside1[2])
     		{	
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
     		buttons[4][0].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
     	}
     	else if(dice==3&&buttons[4][1].getIcon()!=blackEntry.get(1))
     	{
                int temp=kill1;bclick=false;
     		gp1[1]--;
     		if(buttons[4][1].getIcon()==blackEntry_1.get(2))
     		{
     			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     		}
     		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
     		buttons[4][1].setIcon(blackEntry.get(1));
                new setNumbers1(temp,kill1);new disHighlight1();
     	}
     	else if(dice==4)
     	{
     		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     		gp1[1]--;gp1[2]++;bclick=false;
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
     		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
                new setNumbers1(0,0);new disHighlight1();
   
     	}
     	else if(dice==8)
     	{	bclick=false;
     		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     		gp1[1]--;gp1[3]++;
     		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
     		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
                new setNumbers1(0,0);new disHighlight1();
     	}
	}
}
class Buttons30A extends Attributes
{
	Buttons30A()
	{
		 
         if(dice==1 && buttons[4][0].getIcon()!=outside[1])
         {
             int temp=kill1;bclick=false;
             if(buttons[4][0].getIcon()==outside1[2])
             {
               kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
               actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
             }
             else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
             buttons[3][0].setIcon(outside[0]);
             buttons[4][0].setIcon(outside[1]);
             new setNumbers1(temp,kill1);new disHighlight1();
         }
        else if(dice==2 && buttons[4][1].getIcon()!=blackEntry.get(1))
         {
             int temp=kill1;bclick=false;
             if(buttons[4][1].getIcon()==blackEntry_1.get(2))
             {
               kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
               actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
             }
             else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
             buttons[3][0].setIcon(outside[0]);
             buttons[4][1].setIcon(blackEntry.get(1));
             new setNumbers1(temp,kill1);new disHighlight1();
         }
        else if(dice==3)
        {
        	actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            gp1[2]++;bclick=false;
             buttons[3][0].setIcon(outside[0]);
             buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
             new setNumbers1(0,0);new disHighlight1();
        }
        else if(dice==4 && buttons[4][3].getIcon()!=outside[1])
        {
            int temp = kill1;bclick=false;
           if(buttons[4][3].getIcon()==outside1[2])
             {
        	   kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
             }
           else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
           	buttons[3][0].setIcon(outside[0]);
             buttons[4][3].setIcon(outside[1]); 
             new setNumbers1(temp,kill1);new disHighlight1();
        }
         else if(dice==8&&buttons[1][4].getIcon()!=outside[1])//dice==8
         {
             int temp=kill1;bclick=false;
              if(buttons[1][4].getIcon()==outside[2])
            {
            	  kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
       			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[3][0].setIcon(outside[0]);
            buttons[1][4].setIcon(outside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();
         }
	}
}
class Buttons40A extends Attributes
{
	Buttons40A()
	{
		
        if(dice==1 &&buttons[4][1].getIcon()!=blackEntry.get(1))
        {
            int temp=kill1;bclick=false;
            if(buttons[4][1].getIcon()==blackEntry_1.get(2))
            {
              kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
              actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[4][0].setIcon(outside[0]);
            buttons[4][1].setIcon(blackEntry.get(1));
            new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==2)
        {
       	  actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
             gp1[2]++;bclick=false;
             buttons[4][0].setIcon(outside[0]);
             buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
             new setNumbers1(0,0);new disHighlight1();
        }
        else if(dice==3 && (buttons[4][3]!=outside[1]))
        {
            int temp=kill1;bclick=false;
           if(buttons[4][3].getIcon()==outside1[2])
           {
               kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
              actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
           }
           else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
           buttons[4][0].setIcon(outside[0]);
           buttons[4][3].setIcon(outside[1]);
           new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==4&&buttons[4][4].getIcon()!=outside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[4][4].getIcon()==outside1[2])
           {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
           }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
           buttons[4][0].setIcon(outside[0]);
           buttons[4][4].setIcon(outside[1]);
           new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==8&&buttons[0][4].getIcon()!=outside[1])//dice==8
        {
            int temp=kill1;bclick=false;
             if(buttons[0][4].getIcon()==outside1[2])
           {
            	 kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
      			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
           }
             else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
           buttons[4][0].setIcon(outside[0]);
           buttons[0][4].setIcon(outside[1]);
           new setNumbers1(temp,kill1);new disHighlight1();
        }
	}
}
class Buttons41A extends Attributes
{
	Buttons41A()
	{
		
    	if(dice==1)
    	{	
    		bclick=false;
         		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
         		gp1[2]++;
                buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
                buttons[4][1].setIcon(blackEntry.get(0));
                new setNumbers1(0,0);new disHighlight1();
                     
    	}
    	else if(dice==2&&buttons[4][3].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		if(buttons[4][3].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}  
    		buttons[4][1].setIcon(blackEntry.get(0));
    		buttons[4][3].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==3&&buttons[4][4].getIcon()!=outside[1])
    	{
                int temp = kill1;bclick=false;
    		if(buttons[4][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		buttons[4][1].setIcon(blackEntry.get(0));
    		buttons[4][4].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==4&&buttons[3][4].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		if(buttons[3][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		buttons[4][1].setIcon(blackEntry.get(0));  
    		buttons[3][4].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==8&&buttons[0][3].getIcon()!=whiteEntry.get(1))
    	{
                int temp=kill1;bclick=false;
    		if(buttons[0][3].getIcon()==whiteEntry_1.get(2))
              {
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
              }
    		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		buttons[4][1].setIcon(blackEntry.get(0));
    		buttons[0][3].setIcon(whiteEntry.get(1));
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
	}
}
class Buttons42A extends Attributes
{
	Buttons42A()
	{
		
    	if(dice==1&&buttons[4][3].getIcon()!=outside[1])
    	{
            int temp=kill1;bclick=false;
            if(buttons[4][3].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		gp1[2]--;
    		buttons[4][3].setIcon(outside[1]);
    		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==2&&buttons[4][4].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		if(buttons[4][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		gp1[2]--;
    		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
    		buttons[4][4].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==3&&buttons[3][4].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		if(buttons[3][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);roll=!roll;
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		gp1[2]--;
    		buttons[3][4].setIcon(outside[1]);
    		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==4)
    	{
    		actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		gp1[2]--;gp1[3]++;bclick=false;
    		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
                new setNumbers1(0,0);new disHighlight1();
  
    	}
    	else if(dice==8&&kill1>0&&buttons[1][3].getIcon()!=inside[1])
    	{
                int temp=kill1;bclick=false;
    		if(buttons[1][3].getIcon()==inside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		gp1[2]--;
    		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
    		buttons[1][3].setIcon(inside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
    	}
	}
}
class Buttons43A extends Attributes
{
	Buttons43A()
	{
		
        if(dice==1 && buttons[4][4].getIcon()!=outside[1])
        {
                int temp=kill1;bclick=false;
        	if(buttons[4][4].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
        		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[4][4].setIcon(outside[1]);
            buttons[4][3].setIcon(outside[0]);
            new setNumbers1(temp,kill1);new disHighlight1();
        }
            
        else if(dice==2&&buttons[3][4].getIcon()!=outside[1])
        {
                int temp=kill1;bclick=false;
        	if(buttons[3][4].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
        		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[3][4].setIcon(outside[1]);
            buttons[4][3].setIcon(outside[0]);
            new setNumbers1(temp,kill1);new disHighlight1();

        }
        else if(dice==3)
        {
        	actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            gp1[3]++;bclick=false;
            buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
            buttons[4][3].setIcon(outside[0]);
            new setNumbers1(0,0);new disHighlight1();
        }
        else if(dice==4&& buttons[1][4].getIcon()!=outside[1])
        {
                int temp=kill1;bclick=false;
        	if(buttons[1][4].getIcon()==outside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[4][3].setIcon(outside[0]);
            buttons[1][4].setIcon(outside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==8&&kill1>0&&buttons[2][3].getIcon()!=inside[1])//(dice==8)
        {
                int temp=kill1;bclick=false;
        	if(buttons[2][3].getIcon()==inside1[2])
        	{
        		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
        	}
        	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[2][3].setIcon(inside[1]);
            buttons[4][3].setIcon(outside[0]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
	}
}
class Buttons44A extends Attributes
{
	Buttons44A()
	{
   	
     if(dice==1&&buttons[3][4].getIcon()!=outside[1])
     {
         int temp=kill1;bclick=false;
     	if(buttons[3][4].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
         buttons[4][4].setIcon(outside[0]);
         buttons[3][4].setIcon(outside[1]);
         new setNumbers1(temp,kill1);new disHighlight1();
     }
     else if(dice==2)
     {
     	actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
         gp1[3]++;bclick=false;
         buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
         buttons[4][4].setIcon(outside[0]);
         new setNumbers1(0,0);new disHighlight1();
     	 
     }
     else if(dice==3&&buttons[1][4].getIcon()!=outside[1])
      {
          int temp=kill1;bclick=false;
     	if(buttons[1][4].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
     	buttons[1][4].setIcon(outside[1]);
     	buttons[4][4].setIcon(outside[0]); 
        new setNumbers1(temp,kill1);new disHighlight1();
      }
     else if(dice==4&&buttons[0][4].getIcon()!=outside[1])
     {
         int temp=kill1;bclick=false;
     	if(buttons[0][4].getIcon()==outside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     	buttons[0][4].setIcon(outside[1]);
         buttons[4][4].setIcon(outside[0]);
         new setNumbers1(temp,kill1);new disHighlight1();
     }
     else if(dice==8&&kill1>0&&buttons[3][3].getIcon()!=inside[1])//(dice==8)
     {
         int temp=kill1;bclick=false;
     	if(buttons[3][3].getIcon()==inside1[2])
     	{
     		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
     	}
     	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
     	buttons[3][3].setIcon(inside[1]);
         buttons[4][4].setIcon(outside[0]);
         new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
     }
	}
}
class Buttons34A extends Attributes
{
	Buttons34A()
	{
		
        if(dice==1)
        {
       	 actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            gp1[3]++;bclick=false;
            buttons[3][4].setIcon(outside[0]);
            buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
            new setNumbers1(0,0);new disHighlight1();
        }
        else if(dice==2&&buttons[1][4].getIcon()!=outside[1])
        {
           int temp=kill1;bclick=false;
       	 if(buttons[1][4].getIcon()==outside1[2])
       	 {
       		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
       		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
       	 }
       	 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
       	 buttons[1][4].setIcon(outside[1]);
       	 buttons[3][4].setIcon(outside[0]);
         new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==3&&buttons[0][4].getIcon()!=outside[1])
        {
            int temp=kill1;bclick=false;
       	 if(buttons[0][4].getIcon()==outside1[2])
       	 {
       		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
       		actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
       	 }
       	 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
       	 buttons[0][4].setIcon(outside[1]);
       	 buttons[3][4].setIcon(outside[0]);
         new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==4&&buttons[0][3].getIcon()!=whiteEntry.get(1))
        {
            int temp=kill1;bclick=false;
       	 if(buttons[0][3].getIcon()==whiteEntry_1.get(2))
       	 {
       		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
       	 }
       	 else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
       	 buttons[0][3].setIcon(whiteEntry.get(1));
       	 buttons[3][4].setIcon(outside[0]);
         new setNumbers1(temp,kill1);new disHighlight1();
        }
       else if(dice==8&&kill1>0&&buttons[3][2].getIcon()!=inside[1])//(dice==8)
       {
           int temp=kill1;bclick=false;
       	if(buttons[3][2].getIcon()==inside1[2])
       	{
       		kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
       	}
       	else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
       	buttons[3][2].setIcon(inside[1]);
           buttons[3][4].setIcon(outside[0]);
           new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
       }
	}
}
class Buttons24A extends Attributes
{
	Buttons24A()
	{
		
    	if(dice==1&&buttons[1][4].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		gp1[3]--;
    		if(buttons[1][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
    		buttons[1][4].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	} 
    	else if(dice==2&&buttons[0][4].getIcon()!=outside[1])
    	{
                int temp=kill1;bclick=false;
    		gp1[3]--;
    		if(buttons[0][4].getIcon()==outside1[2])
    		{	
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
    		buttons[0][4].setIcon(outside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==3&&buttons[0][3].getIcon()!=whiteEntry.get(1))
    	{
                int temp=kill1;bclick=false;
    		gp1[3]--;
    		if(buttons[0][3].getIcon()==whiteEntry_1.get(2))
    		{
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
    			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
    		buttons[0][3].setIcon(whiteEntry.get(1));
                new setNumbers1(temp,kill1);new disHighlight1();
    	}
    	else if(dice==4&&kill1>0&&buttons[1][3].getIcon()!=inside[1])
    	{
                int temp=kill1;bclick=false;
    		gp1[3]--;
    		if(buttons[1][3].getIcon()==inside1[2])
    		{
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
    		buttons[1][3].setIcon(inside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
    	}
    	else if(dice==8&&kill1>0&&buttons[3][1].getIcon()!=inside[1])
    	{
                int temp=kill1;bclick=false;
    		gp1[3]--;
    		if(buttons[3][1].getIcon()==inside1[2])
    		{
    			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
    		}
    		else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
    		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
    		buttons[3][1].setIcon(inside[1]);
                new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
    	}
	}
}
class Buttons14A extends Attributes
{
	Buttons14A()
	{
		
        if(dice==1 && buttons[0][4].getIcon()!=outside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[0][4].getIcon()==outside1[2])
            {
                kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[1][4].setIcon(outside[0]);
            buttons[0][4].setIcon(outside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==2 && buttons[0][3].getIcon()!=whiteEntry.get(1))
        {
            int temp=kill1;bclick=false;
            if(buttons[0][3].getIcon()==whiteEntry_1.get(2))
            {
                 kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[1][4].setIcon(outside[0]);
            buttons[0][3].setIcon(whiteEntry.get(1));
            new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==3 && kill1>0 && buttons[1][3].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[1][3].getIcon()==inside1[2])
            {
                 kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[1][4].setIcon(outside[0]);
            buttons[1][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        else if(dice==4 && kill1>0 && buttons[2][3].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[2][3].getIcon()==inside1[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[1][4].setIcon(outside[0]);
            buttons[2][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        else if(dice==8 && kill1>0 && buttons[2][1].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[2][1].getIcon()==inside[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[1][4].setIcon(outside[0]);
            buttons[2][1].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
	}
}
class Buttons04A extends Attributes
{
	Buttons04A()
	{
		
        if(dice==1 && buttons[0][3].getIcon()!=whiteEntry.get(1))
        {
            int temp=kill1;bclick=false;
            if(buttons[0][3].getIcon()==whiteEntry_1.get(2))
            {
                kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][4].setIcon(outside[0]);
            buttons[0][3].setIcon(whiteEntry.get(1));
            new setNumbers1(temp,kill1);new disHighlight1();
        }
        else if(dice==2 && kill1>0 && buttons[1][3].getIcon()!=inside[1])
        {
               int temp=kill1;bclick=false;
            if(buttons[1][3].getIcon()==inside1[2])
            {
               kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
               actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][4].setIcon(outside[0]);
            buttons[1][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        else if(dice==3 && kill1>0 && buttons[2][3].getIcon()!=inside[1])
        {   int temp=kill1;bclick=false;
            if(buttons[2][3].getIcon()==inside1[2])
            {
               kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
               actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][4].setIcon(outside[0]);
            buttons[2][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
         else if(dice==4 && kill1>0 && buttons[3][3].getIcon()!=inside[1])
        {   int temp=kill1;bclick=false;
            if(buttons[3][3].getIcon()==inside1[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[0][4].setIcon(outside[0]);
            buttons[3][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        else if(dice==8 && kill1>0 && buttons[1][1].getIcon()!=inside[1])
        {   int temp=kill1;bclick=false;
            if(buttons[1][1].getIcon()==inside1[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[0][4].setIcon(outside[0]);
            buttons[1][1].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
	}
}
class Buttons03A extends Attributes
{
	Buttons03A()
	{
		
        if(dice==1 && kill1>0 && buttons[1][3].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[1][3].getIcon()==inside1[2])
            {
                kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][3].setIcon(whiteEntry.get(0));
            buttons[1][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        if(dice==2 && kill1>0 && buttons[2][3].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[2][3].getIcon()==inside1[2])
            {
                kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][3].setIcon(whiteEntry.get(0));
            buttons[2][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        if(dice==3 && kill1>0 && buttons[3][3].getIcon()!=inside[1])
        {
             int temp=kill1;bclick=false;
            if(buttons[3][3].getIcon()==inside1[2])
            {
                kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
                actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
            buttons[0][3].setIcon(whiteEntry.get(0));
            buttons[3][3].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        if(dice==4 && kill1>0 && buttons[3][2].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[3][2].getIcon()==inside1[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[0][3].setIcon(whiteEntry.get(0));
            buttons[3][2].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
        if(dice==8 && kill1>0 && buttons[1][2].getIcon()!=inside[1])
        {
            int temp=kill1;bclick=false;
            if(buttons[1][2].getIcon()==inside1[2])
            {
            	kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
     			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
            }
            else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
            buttons[0][3].setIcon(whiteEntry.get(0));
            buttons[1][2].setIcon(inside[1]);
            new setNumbers1(temp,kill1);new disHighlight1();new Winner1();
        }
	}
}
class Buttons13A extends Attributes
{
	Buttons13A()
	{
		int temp=kill1;
   	 if(dice==1&&buttons[2][3].getIcon()!=inside[1])
   	 {
   		bclick=false;
   		 if(buttons[2][3].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[1][3].setIcon(inside[0]);
   		 buttons[2][3].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[3][3].getIcon()!=inside[1])
   	 {	bclick=false;
   		 if(buttons[3][3].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[1][3].setIcon(inside[0]);
   		 buttons[3][3].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3&&buttons[3][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[1][3].setIcon(inside[0]);
   		 buttons[3][2].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==4&&buttons[3][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][1].getIcon()==inside1[2])
   		 {
   			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
   		 buttons[1][3].setIcon(inside[0]);
   		 buttons[3][1].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==8&&goal1<3)
   	 {		bclick=false;
   		 actionLabel.setText(p1Name+"'s coin reached goal");
   		 gp1[4]++;goal1++;labels[1][1].setText(""+goal1);
   		 buttons[1][3].setIcon(inside[0]);
   		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons23A extends Attributes
{
	Buttons23A()
	{
            int temp=kill1;
   	 if(dice==1&&buttons[3][3].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][3].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[2][3].setIcon(inside[0]);
   		 buttons[3][3].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[3][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[2][3].setIcon(inside[0]);
   		 buttons[3][2].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3&&buttons[3][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[2][3].setIcon(inside[0]);
   		 buttons[3][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==4&&buttons[2][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[2][1].getIcon()==inside1[2])
   		 {
   			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
   		 buttons[2][3].setIcon(inside[0]);
   		 buttons[2][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons33A extends Attributes
{
	Buttons33A()
	{
            int temp=kill1;
   	 if(dice==1&&buttons[3][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][3].setIcon(inside[0]);
   		 buttons[3][2].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[3][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][3].setIcon(inside[0]);
   		 buttons[3][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3&&buttons[2][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[2][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][3].setIcon(inside[0]);
   		 buttons[2][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==4&&buttons[1][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][1].getIcon()==inside1[2])
   		 {
   			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                
   		 }
   		 else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
   		 buttons[3][3].setIcon(inside[0]);
   		 buttons[1][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons32A extends Attributes
{
	Buttons32A()
	{
            int temp=kill1;
   	 if(dice==1&&buttons[3][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[3][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][2].setIcon(inside[0]);
   		 buttons[3][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[2][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[2][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][2].setIcon(inside[0]);
   		 buttons[2][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3&&buttons[1][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][2].setIcon(inside[0]);
   		 buttons[1][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==4&&buttons[1][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][2].getIcon()==inside1[2])
   		 {
   			kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
 			actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");
   		 buttons[3][2].setIcon(inside[0]);
   		 buttons[1][2].setIcon(inside[1]);
                 new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons31A extends Attributes
{
	Buttons31A()
	{
            int temp=kill1;
   	 if(dice==1&&buttons[2][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[2][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][1].setIcon(inside[0]);
   		 buttons[2][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[1][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][1].setIcon(inside[0]);
   		 buttons[1][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3&&buttons[1][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[3][1].setIcon(inside[0]);
   		 buttons[1][2].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==4&&goal1<3)
   	 {		bclick=false;
   		 actionLabel.setText(p1Name+"'s coin reached goal");
   		 gp1[4]++;goal1++;labels[1][1].setText(""+goal1);
   		 buttons[3][1].setIcon(inside[0]);
   		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons21A extends Attributes
{
	Buttons21A()
	{
            int temp=kill1;
   	 if(dice==1&&buttons[1][1].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][1].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[2][1].setIcon(inside[0]);
   		 buttons[1][1].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2&&buttons[1][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[2][1].setIcon(inside[0]);
   		 buttons[1][2].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==3)
   	 {		bclick=false;
   		 actionLabel.setText(p1Name+"'s coin reached goal");
   		 gp1[4]++;goal1++;labels[1][1].setText(""+goal1);
   		 buttons[2][1].setIcon(inside[0]);
   		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons11A extends Attributes
{
	Buttons11A()
	{
            int temp = kill1;
   	 if(dice==1&&buttons[1][2].getIcon()!=inside[1])
   	 {		bclick=false;
   		 if(buttons[1][2].getIcon()==inside1[2])
   		 {
   		      kill1++;actionLabel.setText(p1Name+" killed "+p2Name+"'s coin");choice.setText(p1Name+" You got another chance");labels[1][2].setText(""+kill1);roll=true;c2--;p2BaseButton.setIcon(p2BaseCoins[c2]);
           	 actionLabel.setText(p2Name+"'s coin killed by "+p1Name);
                
   		 }
   		 else {actionLabel.setText(p1Name+"'s coin moved");dieRoll.setText("");}
   		 buttons[1][1].setIcon(inside[0]);
   		 buttons[1][2].setIcon(inside[1]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
   	 else if(dice==2)
   	 {		bclick=false;
   		 actionLabel.setText(p1Name+"'s coin reached goal");
   		 gp1[4]++;goal1++;labels[1][1].setText(""+goal1);
   		 buttons[1][1].setIcon(inside[0]);
   		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers1(temp,kill1);new disHighlight1();
   	 }
	}
}
class Buttons12A extends Attributes
{
	Buttons12A()
	{
    	 if(dice==1)
    	 {		bclick=false;
    		 actionLabel.setText(p1Name+"'s coin reached goal");
    		 gp1[4]++;goal1++;labels[1][1].setText(""+goal1);
    		 buttons[1][2].setIcon(inside[0]);
    		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);
                 new setNumbers1(0,0);new disHighlight1();
    	 }
	}
}
class Winner1 extends Attributes
{
	Winner1()
	{
		int count1=0;
		if(buttons[1][3].getIcon()==inside[1]) count1++;
		if(buttons[2][3].getIcon()==inside[1]) count1++;
		if(buttons[3][3].getIcon()==inside[1]) count1++;
		if(buttons[3][2].getIcon()==inside[1]) count1++;
		if(buttons[3][1].getIcon()==inside[1]) count1++;
		if(buttons[2][1].getIcon()==inside[1]) count1++;
		if(buttons[1][1].getIcon()==inside[1]) count1++;
		if(buttons[1][2].getIcon()==inside[1]) count1++;
		
		count1 = count1+goal1;
		if(count1==4&&kill2==0)goal1=4;
	}
}