package ashtachamma;

import static ashtachamma.Attributes.buttons;

public class ADiceMoves1 extends Attributes
{
	ADiceMoves1(int n)
	{
		if(n==1)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][1]);count++;}
		else if(n==2)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][2]);count++;}
		else if(n==3)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][3]);count++;}
		else if(n==4)
		{dievalues[count].setVisible(true); dievalues[count].setIcon(numbers[0][4]);count++;}
		else if(n==8)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][5]);count++;}
	}
}
class highlight1 extends Attributes
{
	highlight1(int n)
	{
            new disHighlight1();
		loc=n;int count1=0;
		bclick=true;
		for(int i=0;i<6;i++)
		{
			for(int j=1;j<6;j++)
			{
				if(dievalues[i].getIcon()==numbers[1][j])
					dievalues[i].setIcon(numbers[0][j]);
				if(i==n&&dievalues[i].getIcon()==numbers[0][j])
				{	dievalues[n].setIcon(numbers[1][j]);
					if(j==5)dice=8;
					else dice=j;
				}
			}
		}
		dieRoll.setText(p1Name+" your dice is "+dice);
		actionLabel.setText("");
                if(dice==1)
                {
                    //02
                    if(gp1[0]>0&&buttons[0][1].getIcon()!=outside[1])
                    {
                        if(buttons[0][1].getIcon()==outside[2])buttons[0][1].setIcon(outside1[2]);
                        else buttons[0][1].setIcon(outside1[0]);count1++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[1]&&buttons[0][0].getIcon()!=outside[1])
                    {
                        if(buttons[0][0].getIcon()==outside[2])buttons[0][0].setIcon(outside1[2]);
                        else buttons[0][0].setIcon(outside1[0]);count1++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[1]&&buttons[1][0].getIcon()!=outside[1])
                    {
                        if(buttons[1][0].getIcon()==outside[2])buttons[1][0].setIcon(outside1[2]);
                        else buttons[1][0].setIcon(outside1[0]);count1++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//20
                    if(gp1[1]>0&&buttons[3][0].getIcon()!=outside[1])
                    {
                        if(buttons[3][0].getIcon()==outside[2])buttons[3][0].setIcon(outside1[2]);
                        else buttons[3][0].setIcon(outside1[0]);count1++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[1]&&buttons[4][0].getIcon()!=outside[1])
                    {
                        if(buttons[4][0].getIcon()==outside[2])buttons[4][0].setIcon(outside1[2]);
                        else buttons[4][0].setIcon(outside1[0]);count1++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[1]&&buttons[4][1].getIcon()!=blackEntry.get(1))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(2))buttons[4][1].setIcon(blackEntry_1.get(2));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count1++;
                    }//41
                    if(buttons[4][1].getIcon()==blackEntry.get(1))
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[4][2].getIcon()==ghadi[k][l])
                                {buttons[4][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//42
                    if(gp1[2]>0&&buttons[4][3].getIcon()!=outside[1])
                    {
                        if(buttons[4][3].getIcon()==outside[2])buttons[4][3].setIcon(outside1[2]);
                        else buttons[4][3].setIcon(outside1[0]);count1++;
                    }//43
                     if(buttons[4][3].getIcon()==outside[1]&&buttons[4][4].getIcon()!=outside[1])
                    {
                        if(buttons[4][4].getIcon()==outside[2])buttons[4][4].setIcon(outside1[2]);
                        else buttons[4][4].setIcon(outside1[0]);count1++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[1]&&buttons[3][4].getIcon()!=outside[1])
                    {
                        if(buttons[3][4].getIcon()==outside[2])buttons[3][4].setIcon(outside1[2]);
                        else buttons[3][4].setIcon(outside1[0]);count1++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[1])
                    {
                         for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//24
                    if(gp1[3]>0&&buttons[1][4].getIcon()!=outside[1])
                    {
                        if(buttons[1][4].getIcon()==outside[2])buttons[1][4].setIcon(outside1[2]);
                        else buttons[1][4].setIcon(outside1[0]);count1++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[1]&&buttons[0][4].getIcon()!=outside[1])
                    {
                        if(buttons[0][4].getIcon()==outside[2])buttons[0][4].setIcon(outside1[2]);
                        else buttons[0][4].setIcon(outside1[0]);count1++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[1]&&buttons[0][3].getIcon()!=whiteEntry.get(1))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(2))buttons[0][3].setIcon(whiteEntry_1.get(2));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count1++;
                    }
                    if(kill1>0)
                    {
                        //03
                        if(buttons[0][3].getIcon()==whiteEntry.get(1)&&buttons[1][3].getIcon()!=inside[1])
                        {
                            if(buttons[1][3].getIcon()==inside[2])buttons[1][3].setIcon(inside1[2]);
                            else buttons[1][3].setIcon(inside1[0]);count1++;
                        }//13
                        if(buttons[1][3].getIcon()==inside[1]&&buttons[2][3].getIcon()!=inside[1])
                        {
                            if(buttons[2][3].getIcon()==inside[2])buttons[2][3].setIcon(inside1[2]);
                            else buttons[2][3].setIcon(inside1[0]);count1++;
                        }//23 
                        if(buttons[2][3].getIcon()==inside[1]&&buttons[3][3].getIcon()!=inside[1])
                        {
                            if(buttons[3][3].getIcon()==inside[2])buttons[3][3].setIcon(inside1[2]);
                            else buttons[3][3].setIcon(inside1[0]);count1++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[1]&&buttons[3][2].getIcon()!=inside[1])
                        {
                            if(buttons[3][2].getIcon()==inside[2])buttons[3][2].setIcon(inside1[2]);
                            else buttons[3][2].setIcon(inside1[0]);count1++;
                        }//32
                        if(buttons[3][2].getIcon()==inside[1]&&buttons[3][1].getIcon()!=inside[1])
                        {
                            if(buttons[3][1].getIcon()==inside[2])buttons[3][1].setIcon(inside1[2]);
                            else buttons[3][1].setIcon(inside1[0]);count1++;
                        }//31
                        if(buttons[3][1].getIcon()==inside[1]&&buttons[2][1].getIcon()!=inside[1])
                        {
                            if(buttons[2][1].getIcon()==inside[2])buttons[2][1].setIcon(inside1[2]);
                            else buttons[2][1].setIcon(inside1[0]);count1++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[1]&&buttons[1][1].getIcon()!=inside[1])
                        {
                            if(buttons[1][1].getIcon()==inside[2])buttons[1][1].setIcon(inside1[2]);
                            else buttons[1][1].setIcon(inside1[0]);count1++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[1]&&buttons[1][2].getIcon()!=inside[1])
                        {
                            if(buttons[1][2].getIcon()==inside[2])buttons[1][2].setIcon(inside1[2]);
                            else buttons[1][2].setIcon(inside1[0]);count1++;
                        }
                        if(buttons[1][2].getIcon()==inside[1])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count1++;
                        }
                    }
                }
                else if(dice==2)
                {
                    //02
                    if(gp1[0]>0&&buttons[0][0].getIcon()!=outside[1])
                    {
                        if(buttons[0][0].getIcon()==outside[2])buttons[0][0].setIcon(outside1[2]);
                        else buttons[0][0].setIcon(outside1[0]);count1++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[1]&&buttons[1][0].getIcon()!=outside[1])
                    {
                        if(buttons[1][0].getIcon()==outside[2])buttons[1][0].setIcon(outside1[2]);
                        else buttons[1][0].setIcon(outside1[0]);count1++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[1]&&buttons[3][0].getIcon()!=outside[1])
                    {
                        if(buttons[3][0].getIcon()==outside[2])buttons[3][0].setIcon(outside1[2]);
                        else buttons[3][0].setIcon(outside1[0]);count1++;
                    }//20
                    if(gp1[1]>0&&buttons[4][0].getIcon()!=outside[1])
                    {
                        if(buttons[4][0].getIcon()==outside[2])buttons[4][0].setIcon(outside1[2]);
                        else buttons[4][0].setIcon(outside1[0]);count1++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[1]&&buttons[4][1].getIcon()!=blackEntry.get(1))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(2))buttons[4][1].setIcon(blackEntry_1.get(2));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count1++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[4][2].getIcon()==ghadi[k][l])
                                {buttons[4][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//41
                    if(buttons[4][1].getIcon()==blackEntry.get(1)&&buttons[4][3].getIcon()!=outside[1])
                    {
                        if(buttons[4][3].getIcon()==outside[2])buttons[4][3].setIcon(outside1[2]);
                        else buttons[4][3].setIcon(outside1[0]);count1++;
                    }//42
                    if(gp1[2]>0&&buttons[4][4].getIcon()!=outside[1])
                    {
                        if(buttons[4][4].getIcon()==outside[2])buttons[4][4].setIcon(outside1[2]);
                        else buttons[4][4].setIcon(outside1[0]);count1++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[1]&&buttons[3][4].getIcon()!=outside[1])
                    {
                       if(buttons[3][4].getIcon()==outside[2])buttons[3][4].setIcon(outside1[2]);
                       else buttons[3][4].setIcon(outside1[0]);count1++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[1]&&buttons[1][4].getIcon()!=outside[1])
                    {
                        if(buttons[1][4].getIcon()==outside[2])buttons[1][4].setIcon(outside1[2]);
                        else buttons[1][4].setIcon(outside1[0]);count1++;
                    }//24
                    if(gp1[3]>0&&buttons[0][4].getIcon()!=outside[1])
                    {
                        if(buttons[0][4].getIcon()==outside[2])buttons[0][4].setIcon(outside1[2]);
                        else buttons[0][4].setIcon(outside1[0]);count1++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[1]&&buttons[0][3].getIcon()!=whiteEntry.get(1))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(2))buttons[0][3].setIcon(whiteEntry_1.get(2));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count1++;
                    }

                    if(kill1>0)
                    {
                        //04
                        if(buttons[0][4].getIcon()==outside[1]&&buttons[1][3].getIcon()!=inside[1])
                        {
                            if(buttons[1][3].getIcon()==inside[2])buttons[1][3].setIcon(inside1[2]);
                            else buttons[1][3].setIcon(inside1[0]);count1++;
                        }//03
                        if(buttons[0][3].getIcon()==whiteEntry.get(1)&&buttons[2][3].getIcon()!=inside[1])
                        {
                            if(buttons[2][3].getIcon()==inside[2])buttons[2][3].setIcon(inside1[2]);
                            else buttons[2][3].setIcon(inside1[0]);count1++;
                        }//13
                        if(buttons[1][3].getIcon()==inside[1]&&buttons[3][3].getIcon()!=inside[1])
                        {
                            if(buttons[3][3].getIcon()==inside[2])buttons[3][3].setIcon(inside1[2]);
                            else buttons[3][3].setIcon(inside1[0]);count1++;
                        }//23 
                        if(buttons[2][3].getIcon()==inside[1]&&buttons[3][2].getIcon()!=inside[1])
                        {
                            if(buttons[3][2].getIcon()==inside[2])buttons[3][2].setIcon(inside1[2]);
                            else buttons[3][2].setIcon(inside1[0]);count1++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[1]&&buttons[3][1].getIcon()!=inside[1])
                        {
                            if(buttons[3][1].getIcon()==inside[2])buttons[3][1].setIcon(inside1[2]);
                            else buttons[3][1].setIcon(inside1[0]);count1++;
                        }//32
                        if(buttons[3][2].getIcon()==inside[1]&&buttons[2][1].getIcon()!=inside[1])
                        {
                            if(buttons[2][1].getIcon()==inside[2])buttons[2][1].setIcon(inside1[2]);
                            else buttons[2][1].setIcon(inside1[0]);count1++;
                        }//31
                        if(buttons[3][1].getIcon()==inside[1]&&buttons[1][1].getIcon()!=inside[1])
                        {
                            if(buttons[1][1].getIcon()==inside[2])buttons[1][1].setIcon(inside1[2]);
                            else buttons[1][1].setIcon(inside1[0]);count1++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[1]&&buttons[1][2].getIcon()!=inside[1])
                        {
                           if(buttons[1][2].getIcon()==inside[2])buttons[1][2].setIcon(inside1[2]);
                           else buttons[1][2].setIcon(inside1[0]);count1++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[1])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count1++;
                        }
                    }
                    
                }
                else if(dice==3)
                {
                    //02
                    if(gp1[0]>0&&buttons[1][0].getIcon()!=outside[1])
                    {
                        if(buttons[1][0].getIcon()==outside[2])buttons[1][0].setIcon(outside1[2]);
                        else buttons[1][0].setIcon(outside1[0]);count1++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[1]&&buttons[3][0].getIcon()!=outside[1])
                    {
                        if(buttons[3][0].getIcon()==outside[2])buttons[3][0].setIcon(outside1[2]);
                        else buttons[3][0].setIcon(outside1[0]);count1++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[1]&&buttons[4][0].getIcon()!=outside[1])
                    {
                         if(buttons[4][0].getIcon()==outside[2])buttons[4][0].setIcon(outside1[2]);
                        else buttons[4][0].setIcon(outside1[0]);count1++;
                    }//20
                    if(gp1[1]>0&&buttons[4][1].getIcon()!=blackEntry.get(1))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(2))buttons[4][1].setIcon(blackEntry_1.get(2));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count1++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[4][2].getIcon()==ghadi[k][l])
                                {buttons[4][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[1]&&buttons[4][3].getIcon()!=outside[1])
                    {
                        if(buttons[4][3].getIcon()==outside[2])buttons[4][3].setIcon(outside1[2]);
                        else buttons[4][3].setIcon(outside1[0]);count1++;
                    }//41
                    if(buttons[4][1].getIcon()==blackEntry.get(1)&&buttons[4][4].getIcon()!=outside[1])
                    {
                         if(buttons[4][4].getIcon()==outside[2])buttons[4][4].setIcon(outside1[2]);
                        else buttons[4][4].setIcon(outside1[0]);count1++;
                    }//42
                    if(gp1[2]>0&&buttons[3][4].getIcon()!=outside[1])
                    {
                       if(buttons[3][4].getIcon()==outside[2])buttons[3][4].setIcon(outside1[2]);
                       else buttons[3][4].setIcon(outside1[0]);count1++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[1])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[1]&&buttons[1][4].getIcon()!=outside[1])
                    {
                        if(buttons[1][4].getIcon()==outside[2])buttons[1][4].setIcon(outside1[2]);
                        else buttons[1][4].setIcon(outside1[0]);count1++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[1]&&buttons[0][4].getIcon()!=outside[1])
                    {
                        if(buttons[0][4].getIcon()==outside[2])buttons[0][4].setIcon(outside1[2]);
                        else buttons[0][4].setIcon(outside1[0]);count1++;
                    }//24
                    if(gp1[3]>0&&buttons[0][3].getIcon()!=whiteEntry.get(1))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(2))buttons[0][3].setIcon(whiteEntry_1.get(2));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count1++;
                    }

                    if(kill1>0)
                    {
                        //14
                        if(buttons[1][4].getIcon()==outside[1]&&buttons[1][3].getIcon()!=inside[1])
                        {
                            if(buttons[1][3].getIcon()==inside[2])buttons[1][3].setIcon(inside1[2]);
                            else buttons[1][3].setIcon(inside1[0]);count1++;
                        }//04
                        if(buttons[0][4].getIcon()==outside[1]&&buttons[2][3].getIcon()!=inside[1])
                        {
                            if(buttons[2][3].getIcon()==inside[2])buttons[2][3].setIcon(inside1[2]);
                            else buttons[2][3].setIcon(inside1[0]);count1++;
                        }//03
                        if(buttons[0][3].getIcon()==whiteEntry.get(1)&&buttons[3][3].getIcon()!=inside[1])
                        {
                            if(buttons[3][3].getIcon()==inside[2])buttons[3][3].setIcon(inside1[2]);
                            else buttons[3][3].setIcon(inside1[0]);count1++;
                        }//13
                        if(buttons[1][3].getIcon()==inside[1]&&buttons[3][2].getIcon()!=inside[1])
                        {
                             if(buttons[3][2].getIcon()==inside[2])buttons[3][2].setIcon(inside1[2]);
                            else buttons[3][2].setIcon(inside1[0]);count1++;
                        }//23 
                        if(buttons[2][3].getIcon()==inside[1]&&buttons[3][1].getIcon()!=inside[1])
                        {
                           if(buttons[3][1].getIcon()==inside[2])buttons[3][1].setIcon(inside1[2]);
                           else buttons[3][1].setIcon(inside1[0]);count1++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[1]&&buttons[2][1].getIcon()!=inside[1])
                        {
                            if(buttons[2][1].getIcon()==inside[2])buttons[2][1].setIcon(inside1[2]);
                            else buttons[2][1].setIcon(inside1[0]);count1++;
                        }//32
                        if(buttons[3][2].getIcon()==inside[1]&&buttons[1][1].getIcon()!=inside[1])
                        {
                            if(buttons[1][1].getIcon()==inside[2])buttons[1][1].setIcon(inside1[2]);
                            else buttons[1][1].setIcon(inside1[0]);count1++;
                        }//31
                        if(buttons[3][1].getIcon()==inside[1]&&buttons[1][2].getIcon()!=inside[1])
                        {
                            if(buttons[1][2].getIcon()==inside[2])buttons[1][2].setIcon(inside1[2]);
                            else buttons[1][2].setIcon(inside1[0]);count1++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[1])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count1++;
                        }
                    }
                                       
                }
                else if(dice==4&&c1==4)
                {
                    //02
                    if(gp1[0]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[1]&&buttons[3][0].getIcon()!=outside[1])
                    {
                        if(buttons[3][0].getIcon()==outside[2])buttons[3][0].setIcon(outside1[2]);
                        else buttons[3][0].setIcon(outside1[0]);count1++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[1]&&buttons[4][0].getIcon()!=outside[1])
                    {
                        if(buttons[4][0].getIcon()==outside[2])buttons[4][0].setIcon(outside1[2]);
                        else buttons[4][0].setIcon(outside1[0]);count1++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[1]&&buttons[4][1].getIcon()!=blackEntry.get(1))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(2))buttons[4][1].setIcon(blackEntry_1.get(2));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count1++;
                    }//20
                    if(gp1[1]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[4][2].getIcon()==ghadi[k][l])
                                {buttons[4][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[1]&&buttons[4][3].getIcon()!=outside[1])
                    {
                        if(buttons[4][3].getIcon()==outside[2])buttons[4][3].setIcon(outside1[2]);
                        else buttons[4][3].setIcon(outside1[0]);count1++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[1]&&buttons[4][4].getIcon()!=outside[1])
                    {
                        if(buttons[4][4].getIcon()==outside[2])buttons[4][4].setIcon(outside1[2]);
                        else buttons[4][4].setIcon(outside1[0]);count1++;
                    }//41
                    if(buttons[4][1].getIcon()==blackEntry.get(1)&&buttons[3][4].getIcon()!=outside[1])
                    {
                       if(buttons[3][4].getIcon()==outside[2])buttons[3][4].setIcon(outside1[2]);
                       else buttons[3][4].setIcon(outside1[0]);count1++;
                    }//42
                    if(gp1[2]>0)
                    {
                       for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[1]&&buttons[1][4].getIcon()!=outside[1])
                    {
                        if(buttons[1][4].getIcon()==outside[2])buttons[1][4].setIcon(outside1[2]);
                        else buttons[1][4].setIcon(outside1[0]);count1++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[1]&&buttons[0][4].getIcon()!=outside[1])
                    {
                        if(buttons[0][4].getIcon()==outside[2])buttons[0][4].setIcon(outside1[2]);
                        else buttons[0][4].setIcon(outside1[0]);count1++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[1]&&buttons[0][3].getIcon()!=whiteEntry.get(1))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(2))buttons[0][3].setIcon(whiteEntry_1.get(2));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count1++;
                    }

                    if(kill1>0)
                    {
                        //24
                        if(gp1[3]>0&&buttons[1][3].getIcon()!=inside[1])
                        {
                           if(buttons[1][3].getIcon()==inside[2])buttons[1][3].setIcon(inside1[2]);
                            else buttons[1][3].setIcon(inside1[0]);count1++;
                        }//14
                        if(buttons[1][4].getIcon()==outside[1]&&buttons[2][3].getIcon()!=inside[1])
                        {
                            if(buttons[2][3].getIcon()==inside[2])buttons[2][3].setIcon(inside1[2]);
                            else buttons[2][3].setIcon(inside1[0]);count1++;
                        }//04
                        if(buttons[0][4].getIcon()==outside[1]&&buttons[3][3].getIcon()!=inside[1])
                        {
                            if(buttons[3][3].getIcon()==inside[2])buttons[3][3].setIcon(inside1[2]);
                            else buttons[3][3].setIcon(inside1[0]);count1++;
                        }//03
                        if(buttons[0][3].getIcon()==whiteEntry.get(1)&&buttons[3][2].getIcon()!=inside[1])
                        {
                            if(buttons[3][2].getIcon()==inside[2])buttons[3][2].setIcon(inside1[2]);
                            else buttons[3][2].setIcon(inside1[0]);count1++;
                        }//13
                        if(buttons[1][3].getIcon()==inside[1]&&buttons[3][1].getIcon()!=inside[1])
                        {
                           if(buttons[3][1].getIcon()==inside[2])buttons[3][1].setIcon(inside1[2]);
                           else buttons[3][1].setIcon(inside1[0]);count1++;
                        }//23 
                        if(buttons[2][3].getIcon()==inside[1]&&buttons[2][1].getIcon()!=inside[1])
                        {
                            if(buttons[2][1].getIcon()==inside[2])buttons[2][1].setIcon(inside1[2]);
                            else buttons[2][1].setIcon(inside1[0]);count1++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[1]&&buttons[1][1].getIcon()!=inside[1])
                        {
                            if(buttons[1][1].getIcon()==inside[2])buttons[1][1].setIcon(inside1[2]);
                            else buttons[1][1].setIcon(inside1[0]);count1++;
                        }//32
                        if(buttons[3][2].getIcon()==inside[1]&&buttons[1][2].getIcon()!=inside[1])
                        {
                            if(buttons[1][2].getIcon()==inside[2])buttons[1][2].setIcon(inside1[2]);
                            else buttons[1][2].setIcon(inside1[0]);count1++;
                        }//31
                        if(buttons[3][1].getIcon()==inside[1]&&goal1<3)
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count1++;
                        }
                    }
                }
                else if(dice==8&&c1==4)
                {
                    //02
                    if(gp1[0]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[4][2].getIcon()==ghadi[k][l])
                                {buttons[4][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[1]&&buttons[4][3].getIcon()!=outside[1])
                    {
                        if(buttons[4][3].getIcon()==outside[2])buttons[4][3].setIcon(outside1[2]);
                        else buttons[4][3].setIcon(outside1[0]);count1++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[1]&&buttons[4][4].getIcon()!=outside[1])
                    {
                        if(buttons[4][4].getIcon()==outside[2])buttons[4][4].setIcon(outside1[2]);
                        else buttons[4][4].setIcon(outside1[0]);count1++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[1]&&buttons[3][4].getIcon()!=outside[1])
                    {
                       if(buttons[3][4].getIcon()==outside[2])buttons[3][4].setIcon(outside1[2]);
                       else buttons[3][4].setIcon(outside1[0]);count1++;
                    }//20
                   if(gp1[1]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count1++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[1]&&buttons[1][4].getIcon()!=outside[1])
                    {
                        if(buttons[1][4].getIcon()==outside[2])buttons[1][4].setIcon(outside1[2]);
                        else buttons[1][4].setIcon(outside1[0]);count1++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[1]&&buttons[0][4].getIcon()!=outside[1])
                    {
                        if(buttons[0][4].getIcon()==outside[2])buttons[0][4].setIcon(outside1[2]);
                        else buttons[0][4].setIcon(outside1[0]);count1++;
                    }//41
                    if(buttons[4][1].getIcon()==blackEntry.get(1)&&buttons[0][3].getIcon()!=whiteEntry.get(1))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(2))buttons[0][3].setIcon(whiteEntry_1.get(2));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count1++;
                    }
                    
                    if(kill1>0)
                    {
                        //42
                         if(gp1[2]>0&&buttons[1][3].getIcon()!=inside[1])
                         {
                            if(buttons[1][3].getIcon()==inside[2])buttons[1][3].setIcon(inside1[2]);
                            else buttons[1][3].setIcon(inside1[0]);count1++;
                         }//43
                         if(buttons[4][3].getIcon()==outside[1]&&buttons[2][3].getIcon()!=inside[1])
                         {
                            if(buttons[2][3].getIcon()==inside[2])buttons[2][3].setIcon(inside1[2]);
                            else buttons[2][3].setIcon(inside1[0]);   count1++;
                         }//44
                         if(buttons[4][4].getIcon()==outside[1]&&buttons[3][3].getIcon()!=inside[1])
                         {
                            if(buttons[3][3].getIcon()==inside[2])buttons[3][3].setIcon(inside1[2]);
                            else buttons[3][3].setIcon(inside1[0]);count1++;
                         }//34
                         if(buttons[3][4].getIcon()==outside[1]&&buttons[3][2].getIcon()!=inside[1])
                         {
                            if(buttons[3][2].getIcon()==inside[2])buttons[3][2].setIcon(inside1[2]);
                            else buttons[3][2].setIcon(inside1[0]);count1++;
                         }//24
                        if(gp1[3]>0&&buttons[3][1].getIcon()!=inside[1])
                        {
                           if(buttons[3][1].getIcon()==inside[2])buttons[3][1].setIcon(inside1[2]);
                           else buttons[3][1].setIcon(inside1[0]);count1++;
                        }//14
                        if(buttons[1][4].getIcon()==outside[1]&&buttons[2][1].getIcon()!=inside[1])
                        {
                            if(buttons[2][1].getIcon()==inside[2])buttons[2][1].setIcon(inside1[2]);
                            else buttons[2][1].setIcon(inside1[0]);count1++;
                        }//04
                        if(buttons[0][4].getIcon()==outside[1]&&buttons[1][1].getIcon()!=inside[1])
                        {
                            if(buttons[1][1].getIcon()==inside[2])buttons[1][1].setIcon(inside1[2]);
                            else buttons[1][1].setIcon(inside1[0]);count1++;
                        }//03
                        if(buttons[0][3].getIcon()==whiteEntry.get(1)&&buttons[1][2].getIcon()!=inside[1])
                        {
                            if(buttons[1][2].getIcon()==inside[2])buttons[1][2].setIcon(inside1[2]);
                            else buttons[1][2].setIcon(inside1[0]);count1++;
                        }//13
                        if(buttons[1][3].getIcon()==inside[1]&&goal1<3)
                        {
                           for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count1++;
                        }
                    }
                }
                if (count1==0&&(c1==4||(count==1&&diceValues.get(0)!=4&&diceValues.get(0)!=8)))
                {
                	int lngth = diceValues.size();
                	actionLabel.setText("oohh... You have no moves");count=0;
                	dieRoll.setText("");
        			for(int i=lngth-1;i>=0;i--)
        			{
        				diceValues.remove(i);dievalues[i].setIcon(numbers[0][0]);
        				dievalues[i].setVisible(false);
        			}
        			p1Turn=false;roll=true;p2Turn=true;
                }
		
	}
}
class disHighlight1 extends Attributes
{
    disHighlight1()
    {
        for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
						
				if(((i+j)%2==0) && (i==2||j==2))
				{
					if(buttons[i][j].getIcon()==ghadi1[0][0])
                                        {
                                            buttons[i][j].setIcon(ghadi[0][0]);
                                        }
                                        else if(!(i==2&&j==2))
                                        {
                                               for(int k=0;k<5;k++)
                                                   for(int l=0;l<5;l++)
                                                   {
                                                       if(buttons[i][j].getIcon()==ghadi1[k][l])
                                                       {buttons[i][j].setIcon(ghadi[k][l]);k=5;l=5;}
                                                   }
                                        }
                                        if(i==2&&j==2)
                                        {
                                             if(buttons[i][j].getIcon()==panta1[0][0])
                                            {
                                                buttons[i][j].setIcon(panta[0][0]);
                                            } 
                                             else 
                                             {
                                               for(int k=0;k<5;k++)
                                                   for(int l=0;l<5;l++)
                                                   {
                                                       if(buttons[i][j].getIcon()==panta1[k][l])
                                                       {buttons[i][j].setIcon(panta[k][l]);k=5;l=5;}
                                                   }
                                             }
                                        }
                                        
				}
				else if(i>0&&i<4&&j>0&&j<4)
				{
                                        for(int k=0;k<3;k++)
                                            if(buttons[i][j].getIcon()==inside1[k])
                                            {buttons[i][j].setIcon(inside[k]);k=3;}
									}
                                else
                                {
					
                                        if(i==0&&j==3)
                                        {
                                            for(int k=0;k<3;k++)
                                            if(buttons[i][j].getIcon()==whiteEntry_1.get(k))
                                            {buttons[i][j].setIcon(whiteEntry.get(k));k=3;}
                                        }
                                        else if(i==4&&j==1)
                                        {
                                             for(int k=0;k<3;k++)
                                            if(buttons[i][j].getIcon()==blackEntry_1.get(k))
                                            {buttons[i][j].setIcon(blackEntry.get(k));k=3;}
                                        }
                                        else
                                        {
                                            for(int k=0;k<3;k++)
                                                if(buttons[i][j].getIcon()==outside1[k])
                                                {buttons[i][j].setIcon(outside[k]);k=3;}
                                        }
                                }
					
			}
                }
    }
    
}
class ADiceMoves2 extends Attributes
{
	ADiceMoves2(int n)
	{
		if(n==1)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][1]);count++;}
		else if(n==2)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][2]);count++;}
		else if(n==3)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][3]);count++;}
		else if(n==4)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][4]);count++;}
		else if(n==8)
		{ dievalues[count].setVisible(true);dievalues[count].setIcon(numbers[0][5]);count++;}
	}
}
class highlight2 extends Attributes
{
	highlight2(int n)
	{
            new disHighlight2();
		loc=n;
		int count2=0;
		bclick=true;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(dievalues[i].getIcon()==numbers[1][j])
					dievalues[i].setIcon(numbers[0][j]);
				if(i==n&&dievalues[i].getIcon()==numbers[0][j])
				{	dievalues[n].setIcon(numbers[1][j]);
					if(j==5)dice=8;
					else dice=j;
				}
			}
		}
		actionLabel.setText("");
		dieRoll.setText(p2Name+" your dice is "+dice);
                
                if(dice==1)
                {
                    
                    //42
                    if(gp2[2]>0&&buttons[4][3].getIcon()!=outside[2])
                    {
                        if(buttons[4][3].getIcon()==outside[1])buttons[4][3].setIcon(outside1[1]);
                        else buttons[4][3].setIcon(outside1[0]);count2++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[2]&&buttons[4][4].getIcon()!=outside[2])
                    {
                        if(buttons[4][4].getIcon()==outside[1])buttons[4][4].setIcon(outside1[1]);
                        else buttons[4][4].setIcon(outside1[0]);count2++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[2]&&buttons[3][4].getIcon()!=outside[2])
                    {
                        if(buttons[3][4].getIcon()==outside[1])buttons[3][4].setIcon(outside1[1]);
                        else buttons[3][4].setIcon(outside1[0]);count2++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[2])
                    {
                         for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//24
                    if(gp2[3]>0&&buttons[1][4].getIcon()!=outside[2])
                    {
                        if(buttons[1][4].getIcon()==outside[1])buttons[1][4].setIcon(outside1[1]);
                        else buttons[1][4].setIcon(outside1[0]);count2++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[2]&&buttons[0][4].getIcon()!=outside[2])
                    {
                        if(buttons[0][4].getIcon()==outside[1])buttons[0][4].setIcon(outside1[1]);
                        else buttons[0][4].setIcon(outside1[0]);count2++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[2]&&buttons[0][3].getIcon()!=whiteEntry.get(2))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(1))buttons[0][3].setIcon(whiteEntry_1.get(1));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count2++;
                    }
                    if(buttons[0][3].getIcon()==whiteEntry.get(2))
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[0][2].getIcon()==ghadi[k][l])
                                {buttons[0][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }
                    if(gp2[0]>0&&buttons[0][1].getIcon()!=outside[2])
                    {
                        if(buttons[0][1].getIcon()==outside[1])buttons[0][1].setIcon(outside1[1]);
                        else buttons[0][1].setIcon(outside1[0]);count2++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[2]&&buttons[0][0].getIcon()!=outside[2])
                    {
                        if(buttons[0][0].getIcon()==outside[1])buttons[0][0].setIcon(outside1[1]);
                        else buttons[0][0].setIcon(outside1[0]);count2++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[2]&&buttons[1][0].getIcon()!=outside[2])
                    {
                        if(buttons[1][0].getIcon()==outside[1])buttons[1][0].setIcon(outside1[1]);
                        else buttons[1][0].setIcon(outside1[0]);count2++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//20
                    if(gp2[1]>0&&buttons[3][0].getIcon()!=outside[2])
                    {
                        if(buttons[3][0].getIcon()==outside[1])buttons[3][0].setIcon(outside1[1]);
                        else buttons[3][0].setIcon(outside1[0]);count2++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[2]&&buttons[4][0].getIcon()!=outside[2])
                    {
                        if(buttons[4][0].getIcon()==outside[1])buttons[4][0].setIcon(outside1[1]);
                        else buttons[4][0].setIcon(outside1[0]);count2++;
                    }//40
                    if(buttons[4][0].getIcon()==outside[2]&&buttons[4][1].getIcon()!=blackEntry.get(2))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(1))buttons[4][1].setIcon(blackEntry_1.get(1));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count2++;
                    }
                    
                    if(kill2>0)
                    {
                        //41
                        if(buttons[4][1].getIcon()==blackEntry.get(2)&&buttons[3][1].getIcon()!=inside[2])
                        {
                            if(buttons[3][1].getIcon()==inside[1])buttons[3][1].setIcon(inside1[1]);
                            else buttons[3][1].setIcon(inside1[0]);count2++;
                        } 
                        if(buttons[3][1].getIcon()==inside[2]&&buttons[2][1].getIcon()!=inside[2])
                        {
                            if(buttons[2][1].getIcon()==inside[1])buttons[2][1].setIcon(inside1[1]);
                            else buttons[2][1].setIcon(inside1[0]);count2++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[2]&&buttons[1][1].getIcon()!=inside[2])
                        {
                            if(buttons[1][1].getIcon()==inside[1])buttons[1][1].setIcon(inside1[1]);
                            else buttons[1][1].setIcon(inside1[0]);count2++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[2]&&buttons[1][2].getIcon()!=inside[2])
                        {
                            if(buttons[1][2].getIcon()==inside[1])buttons[1][2].setIcon(inside1[1]);
                            else buttons[1][2].setIcon(inside1[0]);count2++;
                        }//12
                        if(buttons[1][2].getIcon()==inside[2]&&buttons[1][3].getIcon()!=inside[2])
                        {
                            if(buttons[1][3].getIcon()==inside[1])buttons[1][3].setIcon(inside1[1]);
                            else buttons[1][3].setIcon(inside1[0]);count2++;
                        }
                        //13
                        if(buttons[1][3].getIcon()==inside[2]&&buttons[2][3].getIcon()!=inside[2])
                        {
                            if(buttons[2][3].getIcon()==inside[1])buttons[2][3].setIcon(inside1[1]);
                            else buttons[2][3].setIcon(inside1[0]);count2++;
                        }//23
                        if(buttons[2][3].getIcon()==inside[2]&&buttons[3][3].getIcon()!=inside[2])
                        {
                            if(buttons[3][3].getIcon()==inside[1])buttons[3][3].setIcon(inside1[1]);
                            else buttons[3][3].setIcon(inside1[0]);count2++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[2]&&buttons[3][2].getIcon()!=inside[2])
                        {
                            if(buttons[3][2].getIcon()==inside[1])buttons[3][2].setIcon(inside1[1]);
                            else buttons[3][2].setIcon(inside1[0]);count2++;
                        }//32
                        if(buttons[3][2].getIcon()==inside[2])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count2++;
                        }
                    }
           
                   
              }
                else if(dice==2)
                {
                    //42
                    if(gp2[2]>0&&buttons[4][4].getIcon()!=outside[2])
                    {
                        if(buttons[4][4].getIcon()==outside[1])buttons[4][4].setIcon(outside1[1]);
                        else buttons[4][4].setIcon(outside1[0]);count2++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[2]&&buttons[3][4].getIcon()!=outside[2])
                    {
                        if(buttons[3][4].getIcon()==outside[1])buttons[3][4].setIcon(outside1[1]);
                        else buttons[3][4].setIcon(outside1[0]);count2++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[2]&&buttons[1][4].getIcon()!=outside[2])
                    {
                         if(buttons[1][4].getIcon()==outside[1])buttons[1][4].setIcon(outside1[1]);
                        else buttons[1][4].setIcon(outside1[0]);count2++;
                    }//24
                    if(gp2[3]>0&&buttons[0][4].getIcon()!=outside[2])
                    {
                        if(buttons[0][4].getIcon()==outside[1])buttons[0][4].setIcon(outside1[1]);
                        else buttons[0][4].setIcon(outside1[0]);count2++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[2]&&buttons[0][3].getIcon()!=whiteEntry.get(2))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(1))buttons[0][3].setIcon(whiteEntry_1.get(1));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count2++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[0][2].getIcon()==ghadi[k][l])
                                {buttons[0][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }
                    if(buttons[0][3].getIcon()==whiteEntry.get(2)&&buttons[0][1].getIcon()!=outside[2])
                    {
                        if(buttons[0][1].getIcon()==outside[1])buttons[0][1].setIcon(outside1[1]);
                        else buttons[0][1].setIcon(outside1[0]);count2++;
                    }
                    if(gp2[0]>0&&buttons[0][0].getIcon()!=outside[2])
                    {
                        if(buttons[0][0].getIcon()==outside[1])buttons[0][0].setIcon(outside1[1]);
                        else buttons[0][0].setIcon(outside1[0]);count2++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[2]&&buttons[1][0].getIcon()!=outside[2])
                    {
                        if(buttons[1][0].getIcon()==outside[1])buttons[1][0].setIcon(outside1[1]);
                        else buttons[1][0].setIcon(outside1[0]);count2++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[2]&&buttons[3][0].getIcon()!=outside[2])
                    {
                        if(buttons[3][0].getIcon()==outside[1])buttons[3][0].setIcon(outside1[1]);
                        else buttons[3][0].setIcon(outside1[0]);count2++;
                    }//20
                    if(gp2[1]>0&&buttons[4][0].getIcon()!=outside[2])
                    {
                        if(buttons[4][0].getIcon()==outside[1])buttons[4][0].setIcon(outside1[1]);
                        else buttons[4][0].setIcon(outside1[0]);count2++;
                    }//30
                    if(buttons[3][0].getIcon()==outside[2]&&buttons[4][1].getIcon()!=blackEntry.get(2))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(1))buttons[4][1].setIcon(blackEntry_1.get(1));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count2++;
                    }
                    
                    if(kill2>0)
                    {
                        //40
                        if(buttons[4][0].getIcon()==outside[2]&&buttons[3][1].getIcon()!=inside[2])
                        {
                            if(buttons[3][1].getIcon()==inside[1])buttons[3][1].setIcon(inside1[1]);
                            else buttons[3][1].setIcon(inside1[0]);count2++;
                        }//41
                        if(buttons[4][1].getIcon()==blackEntry.get(2)&&buttons[2][1].getIcon()!=inside[2])
                        {
                            if(buttons[2][1].getIcon()==inside[1])buttons[2][1].setIcon(inside1[1]);
                            else buttons[2][1].setIcon(inside1[0]);count2++;
                        } 
                        if(buttons[3][1].getIcon()==inside[2]&&buttons[1][1].getIcon()!=inside[2])
                        {
                            if(buttons[1][1].getIcon()==inside[1])buttons[1][1].setIcon(inside1[1]);
                            else buttons[1][1].setIcon(inside1[0]);count2++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[2]&&buttons[1][2].getIcon()!=inside[2])
                        {
                            if(buttons[1][2].getIcon()==inside[1])buttons[1][2].setIcon(inside1[1]);
                            else buttons[1][2].setIcon(inside1[0]);count2++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[2]&&buttons[1][3].getIcon()!=inside[2])
                        {
                            if(buttons[1][3].getIcon()==inside[1])buttons[1][3].setIcon(inside1[1]);
                            else buttons[1][3].setIcon(inside1[0]);count2++;
                        }//12
                        if(buttons[1][2].getIcon()==inside[2]&&buttons[2][3].getIcon()!=inside[2])
                        {
                            if(buttons[2][3].getIcon()==inside[1])buttons[2][3].setIcon(inside1[1]);
                            else buttons[2][3].setIcon(inside1[0]);count2++;
                        }
                        //13
                        if(buttons[1][3].getIcon()==inside[2]&&buttons[3][3].getIcon()!=inside[2])
                        {
                            if(buttons[3][3].getIcon()==inside[1])buttons[3][3].setIcon(inside1[1]);
                            else buttons[3][3].setIcon(inside1[0]);count2++;
                        }//23
                        if(buttons[2][3].getIcon()==inside[2]&&buttons[3][2].getIcon()!=inside[2])
                        {
                            if(buttons[3][2].getIcon()==inside[1])buttons[3][2].setIcon(inside1[1]);
                            else buttons[3][2].setIcon(inside1[0]);count2++;
                        }//33
                        if(buttons[3][3].getIcon()==inside[2])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count2++;
                        }
                    }
                }
                else if(dice==3)
                {
                    //42
                    if(gp2[2]>0&&buttons[3][4].getIcon()!=outside[2])
                    {
                        if(buttons[3][4].getIcon()==outside[1])buttons[3][4].setIcon(outside1[1]);
                        else buttons[3][4].setIcon(outside1[0]);count2++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[2]&&buttons[1][4].getIcon()!=outside[2])
                    {
                        if(buttons[1][4].getIcon()==outside[1])buttons[1][4].setIcon(outside1[1]);
                        else buttons[1][4].setIcon(outside1[0]);count2++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[2]&&buttons[0][4].getIcon()!=outside[2])
                    {
                        if(buttons[0][4].getIcon()==outside[1])buttons[0][4].setIcon(outside1[1]);
                        else buttons[0][4].setIcon(outside1[0]);count2++;
                    }//24
                    if(gp2[3]>0&&buttons[0][3].getIcon()!=whiteEntry.get(2))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(1))buttons[0][3].setIcon(whiteEntry_1.get(1));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count2++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[0][2].getIcon()==ghadi[k][l])
                                {buttons[0][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[2]&&buttons[0][1].getIcon()!=outside[2])
                    {
                        if(buttons[0][1].getIcon()==outside[1])buttons[0][1].setIcon(outside1[1]);
                        else buttons[0][1].setIcon(outside1[0]);count2++;
                    }
                    if(buttons[0][3].getIcon()==whiteEntry.get(2)&&buttons[0][0].getIcon()!=outside[2])
                    {
                        if(buttons[0][0].getIcon()==outside[1])buttons[0][0].setIcon(outside1[1]);
                        else buttons[0][0].setIcon(outside1[0]);count2++;
                    }
                    if(gp2[0]>0&&buttons[1][0].getIcon()!=outside[2])
                    {
                        if(buttons[1][0].getIcon()==outside[1])buttons[1][0].setIcon(outside1[1]);
                        else buttons[1][0].setIcon(outside1[0]);count2++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[2])
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[2]&&buttons[3][0].getIcon()!=outside[2])
                    {
                        if(buttons[3][0].getIcon()==outside[1])buttons[3][0].setIcon(outside1[1]);
                        else buttons[3][0].setIcon(outside1[0]);count2++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[2]&&buttons[4][0].getIcon()!=outside[2])
                    {
                        if(buttons[4][0].getIcon()==outside[1])buttons[4][0].setIcon(outside1[1]);
                        else buttons[4][0].setIcon(outside1[0]);count2++;
                    }//20
                    if(gp2[1]>0&&buttons[4][1].getIcon()!=blackEntry.get(2))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(1))buttons[4][1].setIcon(blackEntry_1.get(1));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count2++;
                    }
                    
                    if(kill2>0)
                    {
                        //30
                        if(buttons[3][0].getIcon()==outside[2]&&buttons[3][1].getIcon()!=inside[2])
                        {
                            if(buttons[3][1].getIcon()==inside[1])buttons[3][1].setIcon(inside1[1]);
                            else buttons[3][1].setIcon(inside1[0]);count2++;
                        } //40
                        if(buttons[4][0].getIcon()==outside[2]&&buttons[2][1].getIcon()!=inside[2])
                        {
                            if(buttons[2][1].getIcon()==inside[1])buttons[2][1].setIcon(inside1[1]);
                            else buttons[2][1].setIcon(inside1[0]);count2++;
                        }//41
                        if(buttons[4][1].getIcon()==blackEntry.get(2)&&buttons[1][1].getIcon()!=inside[2])
                        {
                            if(buttons[1][1].getIcon()==inside[1])buttons[1][1].setIcon(inside1[1]);
                            else buttons[1][1].setIcon(inside1[0]);count2++;
                        } 
                        if(buttons[3][1].getIcon()==inside[2]&&buttons[1][2].getIcon()!=inside[2])
                        {
                            if(buttons[1][2].getIcon()==inside[1])buttons[1][2].setIcon(inside1[1]);
                            else buttons[1][2].setIcon(inside1[0]);count2++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[2]&&buttons[1][3].getIcon()!=inside[2])
                        {
                            if(buttons[1][3].getIcon()==inside[1])buttons[1][3].setIcon(inside1[1]);
                            else buttons[1][3].setIcon(inside1[0]);count2++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[2]&&buttons[2][3].getIcon()!=inside[2])
                        {
                            if(buttons[2][3].getIcon()==inside[1])buttons[2][3].setIcon(inside1[1]);
                            else buttons[2][3].setIcon(inside1[0]);count2++;
                        }//12
                        if(buttons[1][2].getIcon()==inside[2]&&buttons[3][3].getIcon()!=inside[2])
                        {
                            if(buttons[3][3].getIcon()==inside[1])buttons[3][3].setIcon(inside1[1]);
                            else buttons[3][3].setIcon(inside1[0]);count2++;
                        }
                        //13
                        if(buttons[1][3].getIcon()==inside[2]&&buttons[3][2].getIcon()!=inside[2])
                        {
                            if(buttons[3][2].getIcon()==inside[1])buttons[3][2].setIcon(inside1[1]);
                            else buttons[3][2].setIcon(inside1[0]);count2++;
                        }//23
                        if(buttons[2][3].getIcon()==inside[2])
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count2++;
                        }
                    }
                }
                else if(dice==4&&c2==4)
                {
                    //42
                    if(gp2[2]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][4].getIcon()==ghadi[k][l])
                                {buttons[2][4].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[2]&&buttons[1][4].getIcon()!=outside[2])
                    {
                        if(buttons[1][4].getIcon()==outside[1])buttons[1][4].setIcon(outside1[1]);
                        else buttons[1][4].setIcon(outside1[0]);count2++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[2]&&buttons[0][4].getIcon()!=outside[2])
                    {
                        if(buttons[0][4].getIcon()==outside[1])buttons[0][4].setIcon(outside1[1]);
                        else buttons[0][4].setIcon(outside1[0]);count2++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[2]&&buttons[0][3].getIcon()!=whiteEntry.get(2))
                    {
                        if(buttons[0][3].getIcon()==whiteEntry.get(1))buttons[0][3].setIcon(whiteEntry_1.get(1));
                        else buttons[0][3].setIcon(whiteEntry_1.get(0));count2++;
                    }//24
                    if(gp2[3]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[0][2].getIcon()==ghadi[k][l])
                                {buttons[0][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[2]&&buttons[0][1].getIcon()!=outside[2])
                    {
                        if(buttons[0][1].getIcon()==outside[1])buttons[0][1].setIcon(outside1[1]);
                        else buttons[0][1].setIcon(outside1[0]);count2++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[2]&&buttons[0][0].getIcon()!=outside[2])
                    {
                        if(buttons[0][0].getIcon()==outside[1])buttons[0][0].setIcon(outside1[1]);
                        else buttons[0][0].setIcon(outside1[0]);count2++;
                    }
                    if(buttons[0][3].getIcon()==whiteEntry.get(2)&&buttons[1][0].getIcon()!=outside[2])
                    {
                        if(buttons[1][0].getIcon()==outside[1])buttons[1][0].setIcon(outside1[1]);
                        else buttons[1][0].setIcon(outside1[0]);count2++;
                    }
                    if(gp2[0]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//01
                    if(buttons[0][1].getIcon()==outside[2]&&buttons[3][0].getIcon()!=outside[2])
                    {
                        if(buttons[3][0].getIcon()==outside[1])buttons[3][0].setIcon(outside1[1]);
                        else buttons[3][0].setIcon(outside1[0]);count2++;
                    }//00
                    if(buttons[0][0].getIcon()==outside[2]&&buttons[4][0].getIcon()!=outside[2])
                    {
                        if(buttons[4][0].getIcon()==outside[1])buttons[4][0].setIcon(outside1[1]);
                        else buttons[4][0].setIcon(outside1[0]);count2++;
                    }//10
                    if(buttons[1][0].getIcon()==outside[2]&&buttons[4][1].getIcon()!=blackEntry.get(2))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(1))buttons[4][1].setIcon(blackEntry_1.get(1));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count2++;
                    }
                                        
                    if(kill2>0)
                    {
                        //20
                        if(gp2[1]>0&&buttons[3][1].getIcon()!=inside[2])
                        {
                            if(buttons[3][1].getIcon()==inside[1])buttons[3][1].setIcon(inside1[1]);
                            else buttons[3][1].setIcon(inside1[0]);count2++;
                        }//30
                        if(buttons[3][0].getIcon()==outside[2]&&buttons[2][1].getIcon()!=inside[2])
                        {
                            if(buttons[2][1].getIcon()==inside[1])buttons[2][1].setIcon(inside1[1]);
                            else buttons[2][1].setIcon(inside1[0]);count2++;
                        } //40
                        if(buttons[4][0].getIcon()==outside[2]&&buttons[1][1].getIcon()!=inside[2])
                        {
                            if(buttons[1][1].getIcon()==inside[1])buttons[1][1].setIcon(inside1[1]);
                            else buttons[1][1].setIcon(inside1[0]);count2++;
                        }//41
                        if(buttons[4][1].getIcon()==blackEntry.get(2)&&buttons[1][2].getIcon()!=inside[2])
                        {
                            if(buttons[1][2].getIcon()==inside[1])buttons[1][2].setIcon(inside1[1]);
                            else buttons[1][2].setIcon(inside1[0]);count2++;
                        } 
                        if(buttons[3][1].getIcon()==inside[2]&&buttons[1][3].getIcon()!=inside[2])
                        {
                            if(buttons[1][3].getIcon()==inside[1])buttons[1][3].setIcon(inside1[1]);
                            else buttons[1][3].setIcon(inside1[0]);count2++;
                        }//21
                        if(buttons[2][1].getIcon()==inside[2]&&buttons[2][3].getIcon()!=inside[2])
                        {
                            if(buttons[2][3].getIcon()==inside[1])buttons[2][3].setIcon(inside1[1]);
                            else buttons[2][3].setIcon(inside1[0]);count2++;
                        }//11
                        if(buttons[1][1].getIcon()==inside[2]&&buttons[3][3].getIcon()!=inside[2])
                        {
                            if(buttons[3][3].getIcon()==inside[1])buttons[3][3].setIcon(inside1[1]);
                            else buttons[3][3].setIcon(inside1[0]);count2++;
                        }//12
                        if(buttons[1][2].getIcon()==inside[2]&&buttons[3][2].getIcon()!=inside[2])
                        {
                            if(buttons[3][2].getIcon()==inside[1])buttons[3][2].setIcon(inside1[1]);
                            else buttons[3][2].setIcon(inside1[0]);count2++;
                        }
                        //13
                        if(buttons[1][3].getIcon()==inside[2]&&goal2<3)
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count2++;
                        }
                    }
                }
                else if(dice==8&&c2==4)
                {
                    //42
                    if(gp2[2]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[0][2].getIcon()==ghadi[k][l])
                                {buttons[0][2].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//43
                    if(buttons[4][3].getIcon()==outside[2]&&buttons[0][1].getIcon()!=outside[2])
                    {
                        if(buttons[0][1].getIcon()==outside[1])buttons[0][1].setIcon(outside1[1]);
                        else buttons[0][1].setIcon(outside1[0]);count2++;
                    }//44
                    if(buttons[4][4].getIcon()==outside[2]&&buttons[0][0].getIcon()!=outside[2])
                    {
                        if(buttons[0][0].getIcon()==outside[1])buttons[0][0].setIcon(outside1[1]);
                        else buttons[0][0].setIcon(outside1[0]);count2++;
                    }//34
                    if(buttons[3][4].getIcon()==outside[2]&&buttons[1][0].getIcon()!=outside[2])
                    {
                        if(buttons[1][0].getIcon()==outside[1])buttons[1][0].setIcon(outside1[1]);
                        else buttons[1][0].setIcon(outside1[0]);count2++;
                    }//24
                    if(gp2[3]>0)
                    {
                        for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][0].getIcon()==ghadi[k][l])
                                {buttons[2][0].setIcon(ghadi1[k][l]);k=5;l=5;}
                            }count2++;
                    }//14
                    if(buttons[1][4].getIcon()==outside[2]&&buttons[3][0].getIcon()!=outside[2])
                    {
                        if(buttons[3][0].getIcon()==outside[1])buttons[3][0].setIcon(outside1[1]);
                        else buttons[3][0].setIcon(outside1[0]);count2++;
                    }//04
                    if(buttons[0][4].getIcon()==outside[2]&&buttons[4][0].getIcon()!=outside[2])
                    {
                        if(buttons[4][0].getIcon()==outside[1])buttons[4][0].setIcon(outside1[1]);
                        else buttons[4][0].setIcon(outside1[0]);count2++;
                    }//03
                    if(buttons[0][3].getIcon()==whiteEntry.get(2)&&buttons[4][1].getIcon()!=blackEntry.get(2))
                    {
                        if(buttons[4][1].getIcon()==blackEntry.get(1))buttons[4][1].setIcon(blackEntry_1.get(1));
                        else buttons[4][1].setIcon(blackEntry_1.get(0));count2++;
                    }
                                        
                    if(kill2>0)
                    {
                        //02
                        if(gp2[0]>0&&buttons[3][1].getIcon()!=inside[2])
                        {
                            if(buttons[3][1].getIcon()==inside[1])buttons[3][1].setIcon(inside1[1]);
                            else buttons[3][1].setIcon(inside1[0]);count2++;
                        }//01
                        if(buttons[0][1].getIcon()==outside[2]&&buttons[2][1].getIcon()!=inside[2])
                        {
                            if(buttons[2][1].getIcon()==inside[1])buttons[2][1].setIcon(inside1[1]);
                            else buttons[2][1].setIcon(inside1[0]);count2++;
                        }//00
                        if(buttons[0][0].getIcon()==outside[2]&&buttons[1][1].getIcon()!=inside[2])
                        {
                            if(buttons[1][1].getIcon()==inside[1])buttons[1][1].setIcon(inside1[1]);
                            else buttons[1][1].setIcon(inside1[0]);count2++;
                        }//10
                        if(buttons[1][0].getIcon()==outside[2]&&buttons[1][2].getIcon()!=inside[2])
                        {
                            if(buttons[1][2].getIcon()==inside[1])buttons[1][2].setIcon(inside1[1]);
                            else buttons[1][2].setIcon(inside1[0]);count2++;
                        }//20
                        if(gp2[1]>0&&buttons[1][3].getIcon()!=inside[2])
                        {
                            if(buttons[1][3].getIcon()==inside[1])buttons[1][3].setIcon(inside1[1]);
                            else buttons[1][3].setIcon(inside1[0]);count2++;
                        }//30
                        if(buttons[3][0].getIcon()==outside[2]&&buttons[2][3].getIcon()!=inside[2])
                        {
                            if(buttons[2][3].getIcon()==inside[1])buttons[2][3].setIcon(inside1[1]);
                            else buttons[2][3].setIcon(inside1[0]);count2++;
                        } //40
                        if(buttons[4][0].getIcon()==outside[2]&&buttons[3][3].getIcon()!=inside[2])
                        {
                            if(buttons[3][3].getIcon()==inside[1])buttons[3][3].setIcon(inside1[1]);
                            else buttons[3][3].setIcon(inside1[0]);count2++;
                        }//41
                        if(buttons[4][1].getIcon()==blackEntry.get(2)&&buttons[3][2].getIcon()!=inside[2])
                        {
                            if(buttons[3][2].getIcon()==inside[1])buttons[3][2].setIcon(inside1[1]);
                            else buttons[3][2].setIcon(inside1[0]);count2++;
                        }//31
                        if(buttons[3][1].getIcon()==inside[2]&&goal2<3)
                        {
                            for(int k=0;k<5;k++)
                            for(int l=0;l<5;l++)
                            {
                                if(buttons[2][2].getIcon()==panta[k][l])
                                {buttons[2][2].setIcon(panta1[k][l]);k=5;l=5;}
                            }count2++;
                        }
                    }
                }
                if (count2==0&&(c2==4||(count==1&&diceValues.get(0)!=4&&diceValues.get(0)!=8)))
                {
                	int lngth = diceValues.size();
                	actionLabel.setText("oohh..You have no moves");count=0;
                	
        			for(int i=lngth-1;i>=0;i--)
        			{
        				diceValues.remove(i);dievalues[i].setIcon(numbers[0][0]);
        				dievalues[i].setVisible(false);
        			}
        			p1Turn=true;roll=true;p2Turn=false;
                }
                
	}
}
class disHighlight2 extends Attributes
{
    disHighlight2()
    {
    	 for(int i=0;i<5;i++)
 		{
 			for(int j=0;j<5;j++)
 			{
 						
 				if(((i+j)%2==0) && (i==2||j==2))
 				{
 					if(buttons[i][j].getIcon()==ghadi1[0][0])
                                         {
                                             buttons[i][j].setIcon(ghadi[0][0]);
                                         }
                                         else if(!(i==2&&j==2))
                                         {
                                                for(int k=0;k<5;k++)
                                                    for(int l=0;l<5;l++)
                                                    {
                                                        if(buttons[i][j].getIcon()==ghadi1[k][l])
                                                        {buttons[i][j].setIcon(ghadi[k][l]);k=5;l=5;}
                                                    }
                                         }
                                         if(i==2&&j==2)
                                         {
                                              if(buttons[i][j].getIcon()==panta1[0][0])
                                             {
                                                 buttons[i][j].setIcon(panta[0][0]);
                                             } 
                                              else 
                                              {
                                                for(int k=0;k<5;k++)
                                                    for(int l=0;l<5;l++)
                                                    {
                                                        if(buttons[i][j].getIcon()==panta1[k][l])
                                                        {buttons[i][j].setIcon(panta[k][l]);k=5;l=5;}
                                                    }
                                              }
                                         }
                                         
 				}
 				else if(i>0&&i<4&&j>0&&j<4)
 				{
                                         for(int k=0;k<3;k++)
                                             if(buttons[i][j].getIcon()==inside1[k])
                                             {buttons[i][j].setIcon(inside[k]);k=3;}
 									}
                                 else
                                 {
 					
                                         if(i==0&&j==3)
                                         {
                                             for(int k=0;k<3;k++)
                                             if(buttons[i][j].getIcon()==whiteEntry_1.get(k))
                                             {buttons[i][j].setIcon(whiteEntry.get(k));k=3;}
                                         }
                                         else if(i==4&&j==1)
                                         {
                                              for(int k=0;k<3;k++)
                                             if(buttons[i][j].getIcon()==blackEntry_1.get(k))
                                             {buttons[i][j].setIcon(blackEntry.get(k));k=3;}
                                         }
                                         else
                                         {
                                             for(int k=0;k<3;k++)
                                                 if(buttons[i][j].getIcon()==outside1[k])
                                                 {buttons[i][j].setIcon(outside[k]);k=3;}
                                         }
                                 }
 					
 			}
                 }

    }
    
}

class setNumbers1 extends Attributes
{
	setNumbers1(int n,int n1)
	{
            diceValues.remove(loc);
            dievalues[loc].setIcon(numbers[0][0]);
            while(loc+1<6&&dievalues[loc+1].getIcon()!=numbers[0][0])
            {dievalues[loc].setIcon(dievalues[loc+1].getIcon());loc++;}
            dievalues[loc].setIcon(numbers[0][0]);
            dievalues[loc].setVisible(false);count--;
            if(count>0)p1Turn=true;
            else if(n1>n) {p1Turn=true;roll=true;}
            else {p1Turn=false;roll=true;p2Turn=true;}
	}
}
class setNumbers2 extends Attributes
{
	setNumbers2(int n,int n1)
	{
            diceValues.remove(loc);
            dievalues[loc].setIcon(numbers[0][0]);
            while(loc+1<6&&dievalues[loc+1].getIcon()!=numbers[0][0])
            {dievalues[loc].setIcon(dievalues[loc+1].getIcon());loc++;}
            dievalues[loc].setIcon(numbers[0][0]);
            dievalues[loc].setVisible(false);count--;
            if(count>0)p2Turn=true;
            else if(n1>n) {p2Turn=true;roll=true;}
            else {p2Turn=false;roll=true;p1Turn=true;}
	}
}