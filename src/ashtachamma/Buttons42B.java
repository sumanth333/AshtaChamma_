package ashtachamma;
public class Buttons42B extends Attributes
{
    Buttons42B()
    {
                       int temp=kill2;
	                	if(dice==1&&buttons[4][3].getIcon()!=outside[2])
	                	{	bclick=false;
	                		gp2[2]--;
	                		if(buttons[4][3].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
	                		buttons[4][3].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                		
	                	}
	                	else if(dice==2&&buttons[4][4].getIcon()!=outside[2])
	                	{
	                		gp2[2]--;bclick=false;
	                		if(buttons[4][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
	                		buttons[4][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==3&&buttons[3][4].getIcon()!=outside[2])
	                	{
	                		gp2[2]--;bclick=false;
	                		if(buttons[3][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
	                		buttons[3][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==4)
	                	{
	                		gp2[2]--;gp2[3]++;bclick=false;
	                		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==8)
	                	{
	                		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		gp2[2]--;gp2[0]++;bclick=false;
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                		buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);	new setNumbers2(temp,kill2);new disHighlight2();                  
	                	}
    }
}
class Buttons43B extends Attributes
{
    Buttons43B()
    {
                      int temp=kill2;
	                        if(dice==1&&buttons[4][4].getIcon()!=outside[2])
	                        {	bclick=false;
	                        	if(buttons[4][4].getIcon()==outside1[1])
	                        	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
		                		}
		                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                            buttons[4][3].setIcon(outside[0]);
	                            buttons[4][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                        }
	                        else if(dice==2&&buttons[3][4].getIcon()!=outside[2])
	                        {	bclick=false;
	                        	if(buttons[3][4].getIcon()==outside1[1])
	                        	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                        	buttons[4][3].setIcon(outside[0]);
	                        	buttons[3][4].setIcon(outside[2]);  new setNumbers2(temp,kill2);new disHighlight2();
	                        }
	                        else if(dice==3)
	                         {
	                            gp2[3]++;bclick=false;
	                            buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                            buttons[4][3].setIcon(outside[0]);
	                           actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
                                   new setNumbers2(temp,kill2);new disHighlight2();
	                         }
	                        else if(dice==4&&buttons[1][4].getIcon()!=outside[2])
	                        {	bclick=false;
	                        	if(buttons[1][4].getIcon()==outside1[1])
	                        	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                        	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        	buttons[4][3].setIcon(outside[0]);
	                            buttons[1][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                        }
	                        else if(dice==8&&buttons[0][1].getIcon()!=outside[2])//(dice==8)
	                        {	bclick=false;
	                        	if(buttons[0][1].getIcon()==outside1[1])
	                        	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                		}
	                        	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        	buttons[4][3].setIcon(outside[0]);
	                            buttons[0][1].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                        }
    }
}
class Buttons44B extends Attributes
{
    Buttons44B()
    {
                           int temp=kill2;
	                            if(dice==1 && buttons[3][4].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[3][4].getIcon()==outside1[1])
	                            	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                }
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                                buttons[4][4].setIcon(outside[0]);
	                                buttons[3][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                                
	                            else if(dice==2)
	                            {	bclick=false;
	                            	actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                gp2[3]++;
	                                buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                                buttons[4][4].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                            else if(dice==3 && buttons[1][4].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[1][4].getIcon()==outside1[1])
	                            	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                                    else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                                buttons[1][4].setIcon(outside[2]);
	                                buttons[4][4].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                            else if(dice==4&& buttons[0][4].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[0][4].getIcon()==outside1[1])
	                            	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                            }

	 		                            	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                buttons[4][4].setIcon(outside[0]);
	                                buttons[0][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                            else if(dice==8&& buttons[0][0].getIcon()!=outside[2])//(dice==8)
	                            {	bclick=false;
	                            	if(buttons[0][0].getIcon()==outside1[1])
	                            	{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                            	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                buttons[4][4].setIcon(outside[0]);
	                                buttons[0][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
    }
}
class Buttons34B extends Attributes
{
    Buttons34B()
    {
                       int temp=kill2;
	                	if(dice==1)
	                	{		bclick=false;
	                			actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                			gp2[3]++;
	                                 buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                                 buttons[3][4].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==2&&buttons[1][4].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[1][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[3][4].setIcon(outside[0]);
	                		buttons[1][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==3&&buttons[0][4].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[0][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[3][4].setIcon(outside[0]);
	                		buttons[0][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==4&&buttons[0][3].getIcon()!=whiteEntry.get(2))//To be continued
	                	{		bclick=false;
	                			if(buttons[0][3].getIcon()==whiteEntry_1.get(1))
	                			{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                			else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                			buttons[3][4].setIcon(outside[0]);
	                			buttons[0][3].setIcon(whiteEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                    }
	                	else if(dice==8&&buttons[1][0].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[1][0].getIcon()==outside1[1])
	                                 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                }
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                 buttons[3][4].setIcon(outside[0]);
	                                 buttons[1][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
    }
}
class Buttons24B extends Attributes
{
    Buttons24B()
    {
                       int temp=kill2;
	                	if(dice==1&&buttons[1][4].getIcon()!=outside[2])
	                	{	bclick=false;
	                		gp2[3]--;
	                		if(buttons[1][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                		buttons[1][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==2&&buttons[0][4].getIcon()!=outside[2])
	                	{	bclick=false;
	                		gp2[3]--;
	                		if(buttons[0][4].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                		buttons[0][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==3&&buttons[0][3].getIcon()!=whiteEntry.get(2))
	                	{	bclick=false;
	                		gp2[3]--;
	                		if(buttons[0][3].getIcon()==whiteEntry_1.get(1))
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
	                		buttons[0][3].setIcon(whiteEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==4)
	                	{
	                		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		gp2[3]--;gp2[0]++;bclick=false;
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==8)
	                	{	bclick=false;
	                		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		gp2[3]--;gp2[1]++;
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);new setNumbers2(temp,kill2);new disHighlight2();	                  
	                	}
    }
}
class Buttons14B extends Attributes
{
    Buttons14B()
    {                               int temp=kill2;
	                     if(dice==1 && buttons[0][4].getIcon()!=outside[2])
	                     {	bclick=false;
	                         if(buttons[0][4].getIcon()==outside1[1])
	                        {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[1][4].setIcon(outside[0]);
	                         buttons[0][4].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                    else if(dice==2 && buttons[0][3].getIcon()!=whiteEntry.get(2))
	                     {		bclick=false;
	                         if(buttons[0][3].getIcon()==whiteEntry_1.get(1))
	                         {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                            else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[1][4].setIcon(outside[0]);
	                         buttons[0][3].setIcon(whiteEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                    else if(dice==3)
	                    {
	                    	actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        gp2[0]++;bclick=false;
	                         buttons[1][4].setIcon(outside[0]);
	                         buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);new setNumbers2(temp,kill2);new disHighlight2();
	                    }
	                    else if(dice==4 && buttons[0][1].getIcon()!=outside[2])
	                    {	bclick=false;
	                       if(buttons[0][1].getIcon()==outside1[1])
	                         {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                         }
	                           
	                       else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[1][4].setIcon(outside[0]);
	                         buttons[0][1].setIcon(outside[2]); new setNumbers2(temp,kill2);new disHighlight2();
	                    }
	                     else if(dice==8&&buttons[3][0].getIcon()!=outside[2])//dice==8
	                     {		bclick=false;
	                          if(buttons[3][0].getIcon()==outside1[1])
	                         {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                         }
	                        else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        buttons[1][4].setIcon(outside[0]);
	                        buttons[3][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
    }
}
class Buttons04B extends Attributes
{
    Buttons04B()
    {
 	        int temp = kill2;
	                     if(dice==1 &&buttons[4][1].getIcon()!=whiteEntry.get(2))
	                     {		bclick=false;
	                         if(buttons[0][3].getIcon()==whiteEntry_1.get(1))
	                          {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[0][4].setIcon(outside[0]);
	                         buttons[0][3].setIcon(whiteEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==2)
	                     {
	                    	  actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                          gp2[0]++;bclick=false;
	                          buttons[0][4].setIcon(outside[0]);
	                          buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==3 && (buttons[0][1]!=outside[2]))
	                     {		bclick=false;
	                        if(buttons[0][1].getIcon()==outside1[1])
	                        {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                        buttons[0][4].setIcon(outside[0]);
	                        buttons[0][1].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==4&&buttons[0][0].getIcon()!=outside[2])
	                     {		bclick=false;
	                         if(buttons[0][0].getIcon()==outside1[1])
	                       {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                        
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        buttons[0][4].setIcon(outside[0]);
	                        buttons[0][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==8&&buttons[4][0].getIcon()!=outside[2])//dice==8
	                     {		bclick=false;
	                          if(buttons[4][0].getIcon()==outside1[1])
	                        {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                        }
	                          else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        buttons[0][4].setIcon(outside[0]);
	                        buttons[4][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
    }
}
class Buttons03B extends Attributes
{
    Buttons03B()
    {
                      int temp=kill2;
	                	if(dice==1)
	                	{			bclick=false;
		                    		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
		                    		gp2[0]++;
	                            buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                            buttons[0][3].setIcon(whiteEntry.get(0));new setNumbers2(temp,kill2);new disHighlight2();
	                                 
	                	}
	                	else if(dice==2&&buttons[0][1].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[0][1].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[0][3].setIcon(whiteEntry.get(0));
	                		buttons[0][1].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==3&&buttons[0][0].getIcon()!=outside[2])
	                	{		bclick=false;
	                		if(buttons[0][0].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[0][3].setIcon(whiteEntry.get(0));
	                		buttons[0][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==4&&buttons[1][0].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[1][0].getIcon()==outside1[1])
	                		{	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[0][3].setIcon(whiteEntry.get(0));  
	                		buttons[1][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==8&&buttons[4][1].getIcon()!=blackEntry.get(2))
	                	{		bclick=false;
	                		if(buttons[4][1].getIcon()==blackEntry_1.get(1))
	                            {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                            }
	                         
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[0][3].setIcon(whiteEntry.get(0));
	                		buttons[4][1].setIcon(blackEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                	}
    }
}
class Buttons02B extends Attributes
{
    Buttons02B()
    {
              int temp=kill2;
	                	if(dice==1&&buttons[0][1].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[0][1].getIcon()==outside1[1])
	                		 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
                                        }
                                       else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		gp2[0]--;
	                		buttons[0][1].setIcon(outside[2]);
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==2&&buttons[0][0].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[0][0].getIcon()==outside1[1])
	                		 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		gp2[0]--;
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                		buttons[0][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==3&&buttons[1][0].getIcon()!=outside[2])
	                	{	bclick=false;
	                		if(buttons[1][0].getIcon()==outside1[1])
	                		 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		gp2[0]--;
	                		buttons[1][0].setIcon(outside[2]);
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==4)
	                	{	bclick=false;
	                		actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		gp2[0]--;gp2[1]++;
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);new setNumbers2(temp,kill2);new disHighlight2();
	              
	                	}
	                	else if(dice==8&&kill2>0&&buttons[3][1].getIcon()!=inside[2])
	                	{	bclick=false;gp2[0]--;
	                		if(buttons[3][1].getIcon()==inside1[1])
	                		 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
	                		buttons[3][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                	}
    }
}
class Buttons01B extends Attributes
{
    Buttons01B()
    {
     	              int temp = kill2;
	                            if(dice==1 && buttons[0][0].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[0][0].getIcon()==outside1[1])
	                            	 {	
	                			kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                			actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                                buttons[0][0].setIcon(outside[2]);
	                                buttons[0][1].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                                
	                            else if(dice==2&&buttons[1][0].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[1][0].getIcon()==outside1[1])
	                            	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                                    else {roll=true;actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                                buttons[1][0].setIcon(outside[2]);
	                                buttons[0][1].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();

	                            }
	                            else if(dice==3)
	                            {
	                            	actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                gp2[1]++;bclick=false;
	                                buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                                buttons[0][1].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                            else if(dice==4&& buttons[3][0].getIcon()!=outside[2])
	                            {	bclick=false;
	                            	if(buttons[3][0].getIcon()==outside1[1])
	                            	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                            	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                buttons[0][1].setIcon(outside[0]);
	                                buttons[3][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                            }
	                            else if(dice==8&&kill2>0&&buttons[2][1].getIcon()!=inside[2])//(dice==8)
	                            {	bclick=false;
	                            	if(buttons[2][1].getIcon()==inside1[1])
	                            	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                                    }
	                            	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                                buttons[2][1].setIcon(inside[2]);
	                                buttons[0][1].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                            }
    }
}
class Buttons00B extends Attributes
{
    Buttons00B()
    {
                      int temp=kill2;
	                        if(dice==1&&buttons[1][0].getIcon()!=outside[2])
	                        {	bclick=false;
	                        	if(buttons[1][0].getIcon()==outside1[1])
	                        	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                        	else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                            buttons[0][0].setIcon(outside[0]);
	                            buttons[1][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                        }
	                        else if(dice==2)
	                        {
	                        	actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                            gp2[1]++;bclick=false;
	                            buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                            buttons[0][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                        	 
	                        }
	                        else if(dice==3&&buttons[3][0].getIcon()!=outside[2])
	                         {	bclick=false;
	                        	if(buttons[3][0].getIcon()==outside1[1])
	                        	{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                        	else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                        	buttons[3][0].setIcon(outside[2]);
	                        	buttons[0][0].setIcon(outside[0]); new setNumbers2(temp,kill2);new disHighlight2();
	                         }
	                        else if(dice==4&&buttons[4][0].getIcon()!=outside[2])
	                        {	bclick=false;
	                        	if(buttons[4][0].getIcon()==outside1[1])
	                        	{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                        	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        	buttons[4][0].setIcon(outside[2]);
	                            buttons[0][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                        }
	                        else if(dice==8&&kill2>0&&buttons[1][1].getIcon()!=inside[2])//(dice==8)
	                        {	bclick=false;
	                        	if(buttons[1][1].getIcon()==inside1[1])
	                        	{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                        	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                        	buttons[1][1].setIcon(inside[2]);
	                            buttons[0][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                        }
    }
}
class Buttons10B extends Attributes
{
    Buttons10B()
    {
                  int temp=kill2;
	                     if(dice==1)
	                     {
	                    	 actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         gp2[1]++;bclick=false;
	                         buttons[1][0].setIcon(outside[0]);
	                         buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==2&&buttons[3][0].getIcon()!=outside[2])
	                     {	bclick=false;
	                    	 if(buttons[3][0].getIcon()==outside1[1])
	                    	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                    	 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                    	 buttons[3][0].setIcon(outside[2]);
	                    	 buttons[1][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==3&&buttons[4][0].getIcon()!=outside[2])
	                     {		bclick=false;
	                    	 if(buttons[4][0].getIcon()==outside1[1])
	                    	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                    	 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                    	 buttons[4][0].setIcon(outside[2]);
	                    	 buttons[1][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==4&&buttons[4][1].getIcon()!=blackEntry.get(2))
	                     {		bclick=false;
	                    	 if(buttons[4][1].getIcon()==blackEntry_1.get(1))
	                    	 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                    	 else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                    	 buttons[4][1].setIcon(blackEntry.get(2));
	                    	 buttons[1][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                    else if(dice==8&&kill2>0&&buttons[1][2].getIcon()!=inside[2])//(dice==8)
	                    {	bclick=false;
	                    	if(buttons[1][2].getIcon()==inside1[1])
	                    	{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                    	else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                    	buttons[1][2].setIcon(inside[2]);
	                        buttons[1][0].setIcon(outside[0]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                    }
    }
}
class Buttons20B extends Attributes
{
    Buttons20B()
    {
             int temp=kill2;
	                	if(dice==1&&buttons[3][0].getIcon()!=outside[2])
	                	{	bclick=false;
	                		gp2[1]--;
	                		if(buttons[3][0].getIcon()==outside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[3][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	} 
	                	else if(dice==2&&buttons[4][0].getIcon()!=outside[2])
	                	{
	                		bclick=false;
	                		gp2[1]--;
	                		if(buttons[4][0].getIcon()==outside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[4][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==3&&buttons[4][1].getIcon()!=blackEntry.get(2))
	                	{	bclick=false;
	                		gp2[1]--;
	                		if(buttons[4][1].getIcon()==blackEntry_1.get(1))
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[4][1].setIcon(blackEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                	}
	                	else if(dice==4&&kill2>0&&buttons[3][1].getIcon()!=inside[2])
	                	{	bclick=false;
	                		gp2[1]--;
	                		if(buttons[3][1].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[3][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                	}
	                	else if(dice==8&&kill2>0&&buttons[1][3].getIcon()!=inside[2])
	                	{	bclick=false;
	                		gp2[1]--;
	                		if(buttons[1][3].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
	                		buttons[1][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                	}
    }
}
class Buttons30B extends Attributes
{
    Buttons30B()
    {
                  int temp=kill2;
	                     if(dice==1 && buttons[4][0].getIcon()!=outside[2])
	                     {	bclick=false;
	                         if(buttons[4][0].getIcon()==outside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[3][0].setIcon(outside[0]);
	                         buttons[4][0].setIcon(outside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==2 && buttons[4][1].getIcon()!=blackEntry.get(2))
	                     {		bclick=false;
	                         if(buttons[4][1].getIcon()==blackEntry_1.get(1))
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[3][0].setIcon(outside[0]);
	                         buttons[4][1].setIcon(blackEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==3 && kill2>0 && buttons[3][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[3][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[3][0].setIcon(outside[0]);
	                         buttons[3][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     else if(dice==4 && kill2>0 && buttons[2][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[2][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[3][0].setIcon(outside[0]);
	                         buttons[2][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     else if(dice==8 && kill2>0 && buttons[2][3].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[2][3].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[3][0].setIcon(outside[0]);
	                         buttons[2][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
    }
}
class Buttons40B extends Attributes
{
    Buttons40B()
    {
                      int temp=kill2;
	                     if(dice==1 && buttons[4][1].getIcon()!=blackEntry.get(2))
	                     {		bclick=false;
	                         if(buttons[4][1].getIcon()==blackEntry_1.get(1))
	                        {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][0].setIcon(outside[0]);
	                         buttons[4][1].setIcon(blackEntry.get(2));new setNumbers2(temp,kill2);new disHighlight2();
	                     }
	                     else if(dice==2 && kill2>0 && buttons[3][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[3][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][0].setIcon(outside[0]);
	                         buttons[3][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     else if(dice==3 && kill2>0 && buttons[2][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[2][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][0].setIcon(outside[0]);
	                         buttons[2][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                      else if(dice==4 && kill2>0 && buttons[1][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[1][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[4][0].setIcon(outside[0]);
	                         buttons[1][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     else if(dice==8 && kill2>0 && buttons[3][3].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[3][3].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[4][0].setIcon(outside[0]);
	                         buttons[3][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
    }
}
class Buttons41B extends Attributes
{
    Buttons41B()
    {
                 int temp = kill2;
	                     if(dice==1 && kill2>0 && buttons[3][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[3][1].getIcon()==inside1[1])
	                         {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][1].setIcon(blackEntry.get(0));
	                         buttons[3][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     if(dice==2 && kill2>0 && buttons[2][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[2][1].getIcon()==inside1[1])
	                        {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][1].setIcon(blackEntry.get(0));
	                         buttons[2][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     if(dice==3 && kill2>0 && buttons[1][1].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[1][1].getIcon()==inside1[1])
	                        {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                         buttons[4][1].setIcon(blackEntry.get(0));
	                         buttons[1][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     if(dice==4 && kill2>0 && buttons[1][2].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[1][2].getIcon()==inside1[1])
	                          {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[4][1].setIcon(blackEntry.get(0));
	                         buttons[1][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
	                     if(dice==8 && kill2>0 && buttons[3][2].getIcon()!=inside[2])
	                     {		bclick=false;
	                         if(buttons[3][2].getIcon()==inside1[1])
	                          {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                          }
	                         else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                         buttons[4][1].setIcon(blackEntry.get(0));
	                         buttons[3][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();new Winner2();
	                     }
    }
}
class Buttons31B extends Attributes
{
    Buttons31B()
    {
                        int temp=kill2;
	                	 if(dice==1&&buttons[2][1].getIcon()!=inside[2])
	                	 {	bclick=false;
	                		 if(buttons[2][1].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                         }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[3][1].setIcon(inside[0]);
	                		 buttons[2][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[1][1].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][1].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[3][1].setIcon(inside[0]);
	                		 buttons[1][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3&&buttons[1][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][2].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[3][1].setIcon(inside[0]);
	                		 buttons[1][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==4&&buttons[1][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][3].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		 buttons[3][1].setIcon(inside[0]);
	                		 buttons[1][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==8&&goal2<3)
	                	 {		bclick=false;
	                		 actionLabel.setText(p2Name+"'s coin reached goal");
	                		 gp2[4]++;goal2++;labels[2][1].setText(""+goal2);
	                		 buttons[3][1].setIcon(inside[0]);
	                		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons21B extends Attributes
{
    Buttons21B()
    {
                    int temp = kill2;
	                	 if(dice==1&&buttons[1][1].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][1].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[2][1].setIcon(inside[0]);
	                		 buttons[1][1].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[1][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][2].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[2][1].setIcon(inside[0]);
	                		 buttons[1][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3&&buttons[1][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][3].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[2][1].setIcon(inside[0]);
	                		 buttons[1][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==4&&buttons[2][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[2][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		 buttons[2][1].setIcon(inside[0]);
	                		 buttons[2][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons11B extends Attributes
{
    Buttons11B()
    {
                    int temp = kill2;
	                	 if(dice==1&&buttons[1][2].getIcon()!=inside[2])
	                	 {	bclick=false;
	                		 if(buttons[1][2].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][1].setIcon(inside[0]);
	                		 buttons[1][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[1][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][1].setIcon(inside[0]);
	                		 buttons[1][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3&&buttons[2][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[2][3].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][1].setIcon(inside[0]);
	                		 buttons[2][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==4&&buttons[3][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		 buttons[1][1].setIcon(inside[0]);
	                		 buttons[3][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons12B extends Attributes
{
    Buttons12B()
    {
                     int temp = kill2;
	                	 if(dice==1&&buttons[1][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[1][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][2].setIcon(inside[0]);
	                		 buttons[1][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[2][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[2][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][2].setIcon(inside[0]);
	                		 buttons[2][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3&&buttons[3][3].getIcon()!=inside[2])
	                	 {	bclick=false;
	                		 if(buttons[3][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][2].setIcon(inside[0]);
	                		 buttons[3][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==4&&buttons[3][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][2].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");
	                		 buttons[1][2].setIcon(inside[0]);
	                		 buttons[3][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons13B extends Attributes
{
    Buttons13B()
    {
                         int temp = kill2;
	                	 if(dice==1&&buttons[2][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[2][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][3].setIcon(inside[0]);
	                		 buttons[2][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[3][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][3].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][3].setIcon(inside[0]);
	                		 buttons[3][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3&&buttons[3][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][2].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[1][3].setIcon(inside[0]);
	                		 buttons[3][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==4&&goal2<3)
	                	 {		bclick=false;
	                		 actionLabel.setText(p2Name+"'s coin reached goal");
	                		 gp2[4]++;goal2++;labels[2][1].setText(""+goal2);
	                		 buttons[1][3].setIcon(inside[0]);
	                		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons23B extends Attributes
{
    Buttons23B()
    {
                        int temp = kill2;
	                	 if(dice==1&&buttons[3][3].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][3].getIcon()==inside1[1])                            		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[2][3].setIcon(inside[0]);
	                		 buttons[3][3].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2&&buttons[3][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][2].getIcon()==inside1[1])
	                		{	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[2][3].setIcon(inside[0]);
	                		 buttons[3][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==3)
	                	 {		bclick=false;
	                		 actionLabel.setText(p2Name+"'s coin reached goal");
	                		 gp2[4]++;goal2++;labels[2][1].setText(""+goal2);
	                		 buttons[2][3].setIcon(inside[0]);
	                		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons33B extends Attributes
{
    Buttons33B()
    {
                 int temp = kill2;
	                	 if(dice==1&&buttons[3][2].getIcon()!=inside[2])
	                	 {		bclick=false;
	                		 if(buttons[3][2].getIcon()==inside1[1])
	                		 {	
	                                        kill2++;actionLabel.setText(p2Name+" killed "+p1Name+"'s coin");choice.setText(p2Name+" You got another chance");labels[2][2].setText(""+kill2);roll=true;c1--;p1BaseButton.setIcon(p1BaseCoins[c1]);
	                                        actionLabel.setText(p1Name+"'s coin killed by "+p2Name);
	                             }
	                		 else {actionLabel.setText(p2Name+"'s coin moved");dieRoll.setText("");}
	                		 buttons[3][3].setIcon(inside[0]);
	                		 buttons[3][2].setIcon(inside[2]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
	                	 else if(dice==2)
	                	 {		bclick=false;
	                		 actionLabel.setText(p2Name+"'s coin reached goal");
	                		 gp2[4]++;goal2++;labels[2][1].setText(""+goal2);
	                		 buttons[3][3].setIcon(inside[0]);
	                		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers2(temp,kill2);new disHighlight2();
	                	 }
    }
}
class Buttons32B extends Attributes
{
    Buttons32B()
    {
       
	                	 if(dice==1)
	                	 {		bclick=false;
	                		 actionLabel.setText(p2Name+"'s coin reached goal");
	                		 gp2[4]++;goal2++;labels[2][1].setText(""+goal2);
	                		 buttons[3][2].setIcon(inside[0]);
	                		 buttons[2][2].setIcon(panta[gp1[4]][gp2[4]]);new setNumbers2(0,0);new disHighlight2();
	                	 }
    }
}
class Winner2 extends Attributes
{
	Winner2()
	{
		int count2=0;
		if(buttons[3][1].getIcon()==inside[2]) count2++;
		if(buttons[2][1].getIcon()==inside[2]) count2++;
		if(buttons[1][1].getIcon()==inside[2]) count2++;
		if(buttons[1][2].getIcon()==inside[2]) count2++;
		if(buttons[1][3].getIcon()==inside[2]) count2++;
		if(buttons[2][3].getIcon()==inside[2]) count2++;
		if(buttons[3][3].getIcon()==inside[2]) count2++;
		if(buttons[3][2].getIcon()==inside[2]) count2++;
		count2 = count2+goal2;
		
		if(count2==4&&kill1==0) goal2=4;
	}
}