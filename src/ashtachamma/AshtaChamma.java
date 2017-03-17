package ashtachamma;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
class Attributes
{String s1,s2,s3;
   static JFrame frame= new JFrame();
    static JPanel panel0=new JPanel();
static JPanel panel1 = new JPanel(); 
static JPanel panel2 = new JPanel(); 
    static JPanel panel3 = new JPanel(); 
static JPanel panel4 = new JPanel(); 
    
    static String p1Name="",p2Name="";
      static int goal1=0,goal2=0,kill1=0,kill2=0;
     
     static JLabel labelP1=new JLabel();
     static JLabel labelP2=new JLabel();
     static JLabel labelTurn=new JLabel("Turn");
 static JButton buttons[][] = new JButton[5][5];
        static Icon diceValue[]= {new ImageIcon(AshtaChamma.class.getResource("RedDice.gif")),new ImageIcon(AshtaChamma.class.getResource("dice1.gif")),new ImageIcon(AshtaChamma.class.getResource("dice2.gif")),new ImageIcon(AshtaChamma.class.getResource("dice3.gif")),new ImageIcon(AshtaChamma.class.getResource("dice4.gif")),new ImageIcon(AshtaChamma.class.getResource("dice8.gif"))};
     //static Icon diceValue[]= {new ImageIcon("RedDice.gif"),new ImageIcon("dice1.gif"),new ImageIcon("dice2.gif"),new ImageIcon("dice3.gif"),new ImageIcon("dice4.gif"),new ImageIcon("dice8.gif")};
 static Icon ghadi[][] = {{new ImageIcon(AshtaChamma.class.getResource("Ghadi.jpg")),new ImageIcon(AshtaChamma.class.getResource("b1m.jpg")),new ImageIcon(AshtaChamma.class.getResource("b2m.jpg")),new ImageIcon(AshtaChamma.class.getResource("b3m.jpg")),new ImageIcon(AshtaChamma.class.getResource("b4m.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w1m.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w2m.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w3m.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w4m.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b4.jpg"))}};     
//static Icon ghadi[][] = {{new ImageIcon("Ghadi.jpg"),new ImageIcon("b1m.jpg"),new ImageIcon("b2m.jpg"),new ImageIcon("b3m.jpg"),new ImageIcon("b4m.jpg")},{new ImageIcon("w1m.jpg"),new ImageIcon("w1_b1.jpg"),new ImageIcon("w1_b2.jpg"),new ImageIcon("w1_b3.jpg"),new ImageIcon("w1_b4.jpg")},{new ImageIcon("w2m.jpg"),new ImageIcon("w2_b1.jpg"),new ImageIcon("w2_b2.jpg"),new ImageIcon("w2_b3.jpg"),new ImageIcon("w2_b4.jpg")},{new ImageIcon("w3m.jpg"),new ImageIcon("w3_b1.jpg"),new ImageIcon("w3_b2.jpg"),new ImageIcon("w3_b3.jpg"),new ImageIcon("w3_b4.jpg")},{new ImageIcon("w4m.jpg"),new ImageIcon("w4_b1.jpg"),new ImageIcon("w4_b2.jpg"),new ImageIcon("w4_b3.jpg"),new ImageIcon("w4_b4.jpg")}};
static Icon ghadi1[][] = {{new ImageIcon(AshtaChamma.class.getResource("Ghadi1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b1m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b2m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b3m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b4m1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w1m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w2m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w3m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w4m1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b4_1.jpg"))}};    
// static Icon ghadi1[][] = {{new ImageIcon("Ghadi1.jpg"),new ImageIcon("b1m1.jpg"),new ImageIcon("b2m1.jpg"),new ImageIcon("b3m1.jpg"),new ImageIcon("b4m1.jpg")},{new ImageIcon("w1m1.jpg"),new ImageIcon("w1_b1_1.jpg"),new ImageIcon("w1_b2_1.jpg"),new ImageIcon("w1_b3_1.jpg"),new ImageIcon("w1_b4_1.jpg")},{new ImageIcon("w2m1.jpg"),new ImageIcon("w2_b1_1.jpg"),new ImageIcon("w2_b2_1.jpg"),new ImageIcon("w2_b3_1.jpg"),new ImageIcon("w2_b4_1.jpg")},{new ImageIcon("w3m1.jpg"),new ImageIcon("w3_b1_1.jpg"),new ImageIcon("w3_b2_1.jpg"),new ImageIcon("w3_b3_1.jpg"),new ImageIcon("w3_b4_1.jpg")},{new ImageIcon("w4m1.jpg"),new ImageIcon("w4_b1_1.jpg"),new ImageIcon("w4_b2_1.jpg"),new ImageIcon("w4_b3_1.jpg"),new ImageIcon("w4_b4_1.jpg")}};
 static Icon panta1[][] = {{new ImageIcon(AshtaChamma.class.getResource("panta1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b1dd1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b2dd1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b3dd1.jpg")),new ImageIcon(AshtaChamma.class.getResource("b4dd1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w1uu1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w2uu1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w3uu1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b4_1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w4uu1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b2_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b3_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b4_1.jpg"))}};      
//static Icon panta1[][] = {{new ImageIcon("panta1.jpg"),new ImageIcon("b1dd1.jpg"),new ImageIcon("b2dd1.jpg"),new ImageIcon("b3dd1.jpg"),new ImageIcon("b4dd1.jpg")},{new ImageIcon("w1uu1.jpg"),new ImageIcon("w1_b1_1.jpg"),new ImageIcon("w1_b2_1.jpg"),new ImageIcon("w1_b3_1.jpg"),new ImageIcon("w1_b4_1.jpg")},{new ImageIcon("w2uu1.jpg"),new ImageIcon("w2_b1_1.jpg"),new ImageIcon("w2_b2_1.jpg"),new ImageIcon("w2_b3_1.jpg"),new ImageIcon("w2_b4_1.jpg")},{new ImageIcon("w3uu1.jpg"),new ImageIcon("w3_b1_1.jpg"),new ImageIcon("w3_b2_1.jpg"),new ImageIcon("w3_b3_1.jpg"),new ImageIcon("w3_b4_1.jpg")},{new ImageIcon("w4uu1.jpg"),new ImageIcon("w4_b1_1.jpg"),new ImageIcon("w4_b2_1.jpg"),new ImageIcon("w4_b3_1.jpg"),new ImageIcon("w4_b4_1.jpg")}};
static Icon panta[][] = {{new ImageIcon(AshtaChamma.class.getResource("panta.jpg")),new ImageIcon(AshtaChamma.class.getResource("b1dd.jpg")),new ImageIcon(AshtaChamma.class.getResource("b2dd.jpg")),new ImageIcon(AshtaChamma.class.getResource("b3dd.jpg")),new ImageIcon(AshtaChamma.class.getResource("b4dd.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w1uu.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w1_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w2uu.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w2_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w3uu.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w3_b4.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("w4uu.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b1.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b2.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b3.jpg")),new ImageIcon(AshtaChamma.class.getResource("w4_b4.jpg"))}};     
//static Icon panta[][] = {{new ImageIcon("panta.jpg"),new ImageIcon("b1dd.jpg"),new ImageIcon("b2dd.jpg"),new ImageIcon("b3dd.jpg"),new ImageIcon("b4dd.jpg")},{new ImageIcon("w1uu.jpg"),new ImageIcon("w1_b1.jpg"),new ImageIcon("w1_b2.jpg"),new ImageIcon("w1_b3.jpg"),new ImageIcon("w1_b4.jpg")},{new ImageIcon("w2uu.jpg"),new ImageIcon("w2_b1.jpg"),new ImageIcon("w2_b2.jpg"),new ImageIcon("w2_b3.jpg"),new ImageIcon("w2_b4.jpg")},{new ImageIcon("w3uu.jpg"),new ImageIcon("w3_b1.jpg"),new ImageIcon("w3_b2.jpg"),new ImageIcon("w3_b3.jpg"),new ImageIcon("w3_b4.jpg")},{new ImageIcon("w4uu.jpg"),new ImageIcon("w4_b1.jpg"),new ImageIcon("w4_b2.jpg"),new ImageIcon("w4_b3.jpg"),new ImageIcon("w4_b4.jpg")}};
     //static Icon numbers[][] = {{new ImageIcon("0.jpg"),new ImageIcon("1.jpg"),new ImageIcon("2.jpg"),new ImageIcon("3.jpg"),new ImageIcon("4.jpg"),new ImageIcon("8.jpg")},{new ImageIcon("0.jpg"),new ImageIcon("1_1.jpg"),new ImageIcon("2_2.jpg"),new ImageIcon("3_3.jpg"),new ImageIcon("4_4.jpg"),new ImageIcon("8_8.jpg")}};
    static Icon numbers[][] = {{new ImageIcon(AshtaChamma.class.getResource("0.jpg")),new ImageIcon(AshtaChamma.class.getResource("1.jpg")),new ImageIcon(AshtaChamma.class.getResource("2.jpg")),new ImageIcon(AshtaChamma.class.getResource("3.jpg")),new ImageIcon(AshtaChamma.class.getResource("4.jpg")),new ImageIcon(AshtaChamma.class.getResource("8.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("0.jpg")),new ImageIcon(AshtaChamma.class.getResource("1_1.jpg")),new ImageIcon(AshtaChamma.class.getResource("2_2.jpg")),new ImageIcon(AshtaChamma.class.getResource("3_3.jpg")),new ImageIcon(AshtaChamma.class.getResource("4_4.jpg")),new ImageIcon(AshtaChamma.class.getResource("8_8.jpg"))}};
 static Icon p1BaseCoins[]={new ImageIcon(AshtaChamma.class.getResource("basewhite4coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("basewhite3coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("basewhite2coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("basewhite1coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("basewhitenocoins.jpg"))};
//
     static Icon p2BaseCoins[]={new ImageIcon(AshtaChamma.class.getResource("baseblack4coins copy.jpg")),new ImageIcon(AshtaChamma.class.getResource("baseblack3coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("baseblack2coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("baseblack1coins.jpg")),new ImageIcon(AshtaChamma.class.getResource("baseblacknocoins.jpg"))};    
// static Icon p1BaseCoins[]={new ImageIcon("basewhite4coins.jpg"),new ImageIcon("basewhite3coins.jpg"),new ImageIcon("basewhite2coins.jpg"),new ImageIcon("basewhite1coins.jpg"),new ImageIcon("basewhitenocoins.jpg")};
     //static Icon p2BaseCoins[]={new ImageIcon("baseblack4coins copy.jpg"),new ImageIcon("baseblack3coins.jpg"),new ImageIcon("baseblack2coins.jpg"),new ImageIcon("baseblack1coins.jpg"),new ImageIcon("baseblacknocoins.jpg")};
     
     static JButton p1BaseButton=new JButton(p1BaseCoins[0]);
     static JButton p2BaseButton=new JButton(p2BaseCoins[0]);
     static Icon inside[] = {new ImageIcon(AshtaChamma.class.getResource("inside.jpg")),new ImageIcon(AshtaChamma.class.getResource("insideW.jpg")),new ImageIcon(AshtaChamma.class.getResource("insideB.jpg"))};
     static Icon inside1[] = {new ImageIcon(AshtaChamma.class.getResource("inside1.jpg")),new ImageIcon(AshtaChamma.class.getResource("insideW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("insideB1.jpg"))};
     static Icon outside[]= {new ImageIcon(AshtaChamma.class.getResource("outside.jpg")),new ImageIcon(AshtaChamma.class.getResource("outsideW.jpg")),new ImageIcon(AshtaChamma.class.getResource("outsideB.jpg"))};
     static Icon outside1[]= {new ImageIcon(AshtaChamma.class.getResource("outside1.jpg")),new ImageIcon(AshtaChamma.class.getResource("outsideW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("outsideB1.jpg"))};
    // static Icon inside[] = {new ImageIcon("inside.jpg"),new ImageIcon("insideW.jpg"),new ImageIcon("insideB.jpg")};
     //static Icon inside1[] = {new ImageIcon("inside1.jpg"),new ImageIcon("insideW1.jpg"),new ImageIcon("insideB1.jpg")};
     //static Icon outside[]= {new ImageIcon("outside.jpg"),new ImageIcon("outsideW.jpg"),new ImageIcon("outsideB.jpg")};
     //static Icon outside1[]= {new ImageIcon("outside1.jpg"),new ImageIcon("outsideW1.jpg"),new ImageIcon("outsideB1.jpg")};
      static Icon whiteEntry1[][] = {{new ImageIcon(AshtaChamma.class.getResource("notkillwhite.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillwhiteW.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillwhiteB.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("afterkillwhite.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillwhiteW.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillwhiteB.jpg"))}};
     static Icon blackEntry1[][] = {{new ImageIcon(AshtaChamma.class.getResource("notkillblack.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillblackW.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillblackB.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("afterkillblack.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillblackW.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillblackB.jpg"))}};
     static Icon whiteEntry2[][] = {{new ImageIcon(AshtaChamma.class.getResource("notkillwhite1.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillwhiteW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillwhiteB1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("afterkillwhite1.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillwhiteW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillwhiteB1.jpg"))}};
     static Icon blackEntry2[][] = {{new ImageIcon(AshtaChamma.class.getResource("notkillblack1.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillblackW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("notkillblackB1.jpg"))},{new ImageIcon(AshtaChamma.class.getResource("afterkillblack1.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillblackW1.jpg")),new ImageIcon(AshtaChamma.class.getResource("afterkillblackB1.jpg"))}};
    //n blackEntry2[][] = {{new ImageIcon("notkillblack1.jpg"),new ImageIcon("notkillblackW1.jpg"),new ImageIcon("notkillblackB1.jpg")},{new ImageIcon("afterkillblack1.jpg"),new ImageIcon("afterkillblackW1.jpg"),new ImageIcon("afterkillblackB1.jpg")}};
     static ArrayList<Icon>whiteEntry = new ArrayList<Icon>();
     static ArrayList<Icon>blackEntry = new ArrayList<Icon>();
      static ArrayList<Icon>whiteEntry_1 = new ArrayList<Icon>();
     static ArrayList<Icon>blackEntry_1 = new ArrayList<Icon>();
      static Icon flags[]={new ImageIcon(AshtaChamma.class.getResource("grayflag.jpg")),new ImageIcon(AshtaChamma.class.getResource("greenflag.jpg"))};
     //static Icon flags[]={new ImageIcon("grayflag.jpg"),new ImageIcon("greenflag.jpg")};
     //static Icon action[]={new ImageIcon("player1.gif"),new ImageIcon("player2.gif"),new ImageIcon("kill.gif")};
     
     static JButton pf1=new JButton(flags[1]);
     static JButton pf2=new JButton(flags[0]);
     
     static JLabel[][] labels=new JLabel[3][3];
    
    static JButton dieButton=new JButton("Roll");
    static JLabel dieImage=new JLabel(diceValue[1]);
    static JButton dievalues[] = new JButton[6];
    static JLabel dieRoll=new JLabel();
     static JButton actionButton=new JButton();
     static JLabel actionLabel=new JLabel();
     static JLabel choice=new JLabel("");
     static JMenuBar menu=new JMenuBar();
     static ArrayList<Integer> diceValues = new ArrayList<Integer>();
     
    static int dice=0; 
    static int pl1[][] = {{3,2,1,16,15},{4,23,24,17,14},{5,22,25,18,13},{6,21,20,19,12},{7,8,9,10,11}};
    static int pl2[][] = {{11,10,9,8,7},{12,19,20,21,6},{13,18,25,22,5},{14,17,24,23,4},{15,16,1,2,3}};
    static int A[] = {0,0,0,0};
    static int B[] = {0,0,0,0};
    static int i=0,j=0,k=0,l=0,w=0,h1=0,h=0,o1=0,o=0;
    static int cmpltdice=0,cmpltd2=0;
    static boolean p1Turn=true,p2Turn=false,roll=true;
    static int c1=0,c2=0,f1=0,f2=0;
    static int a=0,b=0,z=0;
    static int gp1[] = new int[5];
    static int gp2[] = new int[5];
    static int ch1=0,ch2=0;
    static int noMove1=0,noMove2=0;
    static int count=0,loc=0;
    static boolean bclick=false;

}
class Board extends Attributes 
{
	Board()
	{
		panel1.setLayout(new GridLayout(5,5));panel0.add(panel1);
		whiteEntry.add(whiteEntry1[0][0]);whiteEntry.add(whiteEntry1[0][1]);whiteEntry.add(whiteEntry1[0][2]);
		whiteEntry.add(whiteEntry1[1][0]);whiteEntry.add(whiteEntry1[1][1]);whiteEntry.add(whiteEntry1[1][2]);
                whiteEntry_1.add(whiteEntry2[0][0]);whiteEntry_1.add(whiteEntry2[0][1]);whiteEntry_1.add(whiteEntry2[0][2]);
		whiteEntry_1.add(whiteEntry2[1][0]);whiteEntry_1.add(whiteEntry2[1][1]);whiteEntry_1.add(whiteEntry2[1][2]);
		
		blackEntry.add(blackEntry1[0][0]);blackEntry.add(blackEntry1[0][1]);blackEntry.add(blackEntry1[0][2]);
		blackEntry.add(blackEntry1[1][0]);blackEntry.add(blackEntry1[1][1]);blackEntry.add(blackEntry1[1][2]);
                blackEntry_1.add(blackEntry2[0][0]);blackEntry_1.add(blackEntry2[0][1]);blackEntry_1.add(blackEntry2[0][2]);
		blackEntry_1.add(blackEntry2[1][0]);blackEntry_1.add(blackEntry2[1][1]);blackEntry_1.add(blackEntry2[1][2]);
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				buttons[i][j] = new JButton();
		
				if(((i+j)%2==0) && (i==2||j==2))
				{
					buttons[i][j] = new JButton(ghadi[0][0]);
                                        if(i==2&&j==2)
                                              buttons[i][j] = new JButton(panta[0][0]); 
                                        
				}
				else if(i>0&&i<4&&j>0&&j<4)
				{
                                        
					buttons[i][j]=new JButton(inside[0]);
				
				}
                                else
                                {
					buttons[i][j]=new JButton(outside[0]);
                                        if(i==0&&j==3)
                                            buttons[i][j]=new JButton(whiteEntry.get(0));
                                        else if(i==4&&j==1)
                                            buttons[i][j]=new JButton(blackEntry.get(0));
                                }
				panel1.add(buttons[i][j]);
				
			}
			dievalues[i] = new JButton();
			dievalues[i].setBounds(600,135+i*100,100,100);
			dievalues[i].setBackground(Color.cyan);
			dievalues[i].setIcon(numbers[0][0]);
			frame.add(dievalues[i]);
		}
		dievalues[5] = new JButton();
		dievalues[5].setBackground(Color.cyan);
		dievalues[5].setBounds(600,650,100,100);
		dievalues[5].setIcon(numbers[0][0]);
		frame.add(dievalues[5]);
                //dieButton.setBackground(Color.PINK);
                dieButton.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.pink));
                dieImage.setBounds(115,15,100,100);
                panel2.add(dieImage);
                panel0.setBackground(Color.CYAN);
                panel0.setBounds(0,0,1500,750);
		frame.add(panel0);
		panel1.setBounds(100,135,500,500);
		panel2.setBounds(700,135,500,500);
		panel2.setBackground(Color.PINK);
		panel2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.cyan));
                panel4.setBounds(100,635,500,100);
                panel3.setBounds(100,30,500,150);
                labelP1.setBounds(225,15,100,20);
                labelP2.setBounds(225,70,100,20);
                panel2.setLayout(null);
                panel3.setLayout(null);
                panel4.setLayout(null);
                panel3.add(labelP1);
                panel4.add(labelP2);
                panel3.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.cyan));
                panel4.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.cyan));
                pf1.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.pink));
                pf2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.pink));
		frame.setSize(1500,750);
                panel3.setBackground(Color.CYAN);
                panel4.setBackground(Color.CYAN);
                panel0.add(panel2);
                panel0.add(panel3);
                panel0.add(panel4);
//Adding menubar

JMenu menuItems=new JMenu("Menu");
	JMenu menu1=new JMenu("Help");
	JMenu menu2=new JMenu("Records");
	//JMenuItem hPlay=new JMenuItem("Restart");
	//hPlay.setActionCommand("restart");//ActionCommand
	JMenuItem New=new JMenuItem("Quit");
	New.setActionCommand("quit");//ActionCommand
	JMenuItem Instru=new JMenuItem("Instructions");
	Instru.setActionCommand("instruction");	//ActionCommand
	JMenuItem about=new JMenuItem("About");
	about.setActionCommand("about");//ActionCommand
//	JMenuItem about=new JMenuItem("About");
//	JMenuItem exit=new JMenuItem("Exit");
	//menuItems.add(hPlay);
	menuItems.add(New);
	menu1.add(Instru);
	menu1.add(about);
	JLabel array[]=new JLabel[10];
	for(int i=0;i<9;i++){
			String aa=""+i;
			array[i]=new JLabel("Record "+aa);
			menu2.add(array[i]);
		}
//	menuItems.add(about);
//	menuItems.add(exit);
        MenuItemListener menuItemListener = new MenuItemListener();
	//hPlay.addActionListener(menuItemListener);
	New.addActionListener(menuItemListener);
	Instru.addActionListener(menuItemListener);
	about.addActionListener(menuItemListener);
	menu.add(menuItems);
	menu.add(menu1);
	menu.add(menu2);
	//menu.setBounds(20,20,20,20);
	frame.add(menu);
	menu.setBackground(Color.cyan);
	frame.setJMenuBar(menu);	






           
                labels[0][0]=new JLabel("PlayerName");
                labels[0][1]=new JLabel("GoalsReached");
                labels[0][2]=new JLabel("Kills");
                labels[1][0]=new JLabel(p1Name);
                labels[1][1]=new JLabel(""+goal1);
                labels[1][2]=new JLabel(""+kill1);
                 labels[2][0]=new JLabel(p2Name);
                labels[2][1]=new JLabel(""+goal2);
                labels[2][2]=new JLabel(""+kill2);
                for(int i=0;i<3;i++)
                {int x=150;
                 int y=80;
                     for(int j=0;j<3;j++)
                     {
                         if(i==0){
                            
                         labels[i][j].setBounds(x,300,150,40); x=x+150;}
                         else if(i==1){
                             if(j==1)   labels[i][j].setBounds(x+20,340,150,80);
                             else   labels[i][j].setBounds(x,340,150,80);
                             x=x+150;
                         }
                         else
                         {
                             if(j==1)   labels[i][j].setBounds(x+20,420,150,80);
                             else
                                        labels[i][j].setBounds(x,420,150,80);
                             x=x+150;
                         }
                         panel2.add(labels[i][j]);
                     }
                }
                labelTurn.setBounds(65,300,100,40);
                panel2.add(labelTurn);
               pf2.setBounds(50,430,60,60);
                pf1.setBounds(50,350,60,60);
                panel2.add(pf1);
                panel2.add(pf2);
                 dieButton.setBounds(148,110,40,30);
              panel2.add(dieButton);
               dieRoll.setBounds(92,150,200,20);
               panel2.add(dieRoll);
               //actionButton.setBounds(340,200,135,180);
               //actionButton.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.pink));
               //actionButton.setBackground(Color.pink);
               //actionButton.setIcon(action[0]);
               //panel2.add(actionButton);
               actionLabel.setBounds(300,90,200,20);
               panel2.add(actionLabel);
               choice.setBounds(52,170,250,20);
               panel2.add(choice);
               p1BaseButton.setBounds(175,38,150,66);
               p1BaseButton.setBackground(Color.CYAN);
               p2BaseButton.setBounds(175,2,150,66);
               panel3.add(p1BaseButton);
                panel4.add(p2BaseButton);
               p1BaseButton.setLayout(null);
               p2BaseButton.setLayout(null);
        panel0.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);
	for(int i=0;i<6;i++)
	dievalues[i].setVisible(false);
	}
class MenuItemListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
String s=e.getActionCommand();
/*if(s.equalsIgnoreCase("restart")){
	System.out.println("Success");
      frame.getContentPane().removeAll();			
      frame.setVisible(false);
      MainPage aa=new MainPage(frame);
      
     // AshtaChamma  aa=new AshtaChamma(frame);
     //String a[]=new String[2];
     // a[0]="palyer1";
     // a[1]="player2";
     //aa.main(a);
}*/
if(s.equalsIgnoreCase("quit")){
	//statusLabel.setText("open");
	System.exit(0);	
}
else if(s.equalsIgnoreCase("instruction")){
       JOptionPane.showMessageDialog(null, "1.Two players can play this game . Each player has four coins.\n2.Each player has to roll dice to move their coins. \n3.All players should get either 8 or 4 to make  their first move.\n4.Players can roll dice again if they get 4 (Chamma) or 8 (Ashta)\n5.Player can kill other player's coin only in ghadi.\n6.Until and unless a player kills other player's coin he can't get inside.\n7.If a player can't kill other player's coin and all coins of other player gets inside he loses.\n8.Three consecutive 8's or 4's is considered zero and player loses his turn.\n9.The first player who gets all his coins into panta wins.");
}
}
		

}



}
public class AshtaChamma extends Attributes implements ActionListener
{
	public AshtaChamma(JFrame frame){
		this. frame=frame;
		}
	public static void main(String args[])
	{
		Board create = new Board();
		p1Name=args[0];
		p2Name=args[1];
		labelP1.setText(p1Name);
		labelP2.setText(p2Name);
		labels[1][0].setText(p1Name);
		labels[2][0].setText(p2Name);
		AshtaChamma start=new AshtaChamma(frame);
		start.play();
		
	}
	public void play()
	{
		buttons[0][0].addActionListener(this);buttons[0][1].addActionListener(this);buttons[0][2].addActionListener(this);buttons[0][3].addActionListener(this);buttons[0][4].addActionListener(this);
		buttons[1][0].addActionListener(this);buttons[1][1].addActionListener(this);buttons[1][2].addActionListener(this);buttons[1][3].addActionListener(this);buttons[1][4].addActionListener(this);
		buttons[2][0].addActionListener(this);buttons[2][1].addActionListener(this);dieButton.addActionListener(this);    buttons[2][3].addActionListener(this);buttons[2][4].addActionListener(this);
		buttons[3][0].addActionListener(this);buttons[3][1].addActionListener(this);buttons[3][2].addActionListener(this);buttons[3][3].addActionListener(this);buttons[3][4].addActionListener(this);
		buttons[4][0].addActionListener(this);buttons[4][1].addActionListener(this);buttons[4][2].addActionListener(this);buttons[4][3].addActionListener(this);buttons[4][4].addActionListener(this);
		p1BaseButton.addActionListener(this);p2BaseButton.addActionListener(this);
		dievalues[0].addActionListener(this);dievalues[1].addActionListener(this);dievalues[2].addActionListener(this);dievalues[3].addActionListener(this);dievalues[4].addActionListener(this);dievalues[5].addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
        if(e.getSource()==dieButton)
        {
        	if(p1Turn&&roll)
        	{
        		actionLabel.setText("");
        		choice.setText("");
        		dieImage.setIcon(diceValue[0]);
        		dice=(int)(Math.random()*5+1);
                         Gif g=new Gif();
                         g.hi();
        		dieImage.setIcon(diceValue[dice]);
        		if(dice==5)dice=8;
        		diceValues.add(dice);
        		dieRoll.setText(p1Name+" your dice is "+dice);
        		if(!(dice==4||dice==8))
        		{	roll = false;}
        		else choice.setText(p1Name+" You got another chance");
        		new ADiceMoves1(dice);
        		int lngth = diceValues.size();
        		if(lngth>2)
        		{
        			int temp1 = diceValues.get(lngth-1);
        			int temp2 = diceValues.get(lngth-2);
        			int temp3 = diceValues.get(lngth-3);
        			if((temp1==temp2&&temp1==temp3&&(temp1==4))||(temp1==temp2&&temp1==temp3&&(temp1==8)))
        			{
        				actionLabel.setText("ooohhh... Buddies..");count=0;
        				dieRoll.setText("");
	        			for(int i=lngth-1;i>=0;i--)
	        			{
	        				diceValues.remove(i);dievalues[i].setIcon(numbers[0][0]);
	        				dievalues[i].setVisible(false);
	        			}
        			}
        		}
        		if(c1==0&&lngth<2&&!roll)
        		{
        			roll=true;p2Turn=true;
                                        p1Turn=false;
        			pf1.setIcon(flags[0]);
	        		pf2.setIcon(flags[1]);
					choice.setText(" you have no Moves "+p2Name+" Turn");
					diceValues.remove(0);count=0;
        		}	
        	}
        	else if(p2Turn&&roll)
        	{
        		actionLabel.setText("");
        		choice.setText("");
        		dieImage.setIcon(diceValue[0]);
        		dice=(int)(Math.random()*5+1);
                       Gif g=new Gif();
                         g.hi();
        		dieImage.setIcon(diceValue[0]);
        		if(dice==5)dice=8;
        		diceValues.add(dice);
        		dieRoll.setText(p2Name+" your dice is "+dice);
        		if(!(dice==4||dice==8))
        			roll = false;
        		else choice.setText(p2Name+" You got another chance");
        		new ADiceMoves1(dice);
        		int lngth = diceValues.size();
        		if(lngth>2)
        		{
        			int temp1 = diceValues.get(lngth-1);
        			int temp2 = diceValues.get(lngth-2);
        			int temp3 = diceValues.get(lngth-3);
        			if((temp1==temp2&&temp1==temp3&&(temp1==4))||(temp1==temp2&&temp1==temp3&&(temp1==8)))
        			{
        				actionLabel.setText("ooohhh...  Buddies..");count=0;
        				dieRoll.setText("");
	        			for(int i=lngth-1;i>=0;i--)
	        			{
	        				diceValues.remove(i);dievalues[i].setIcon(numbers[0][0]);
	        				dievalues[i].setVisible(false);
	        			}
        			}
        		}
        		if(c2==0&&lngth<2&&!roll)
        		{
        			roll=true;p1Turn=true;p2Turn=false;
        			pf1.setIcon(flags[1]);
	        		pf2.setIcon(flags[0]);
				choice.setText(" you have no Moves "+p1Name+"'s Turn");
				diceValues.remove(0);count=0;
        		}
        	}
        }
       if(e.getSource()==dievalues[0]&&dievalues[0].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(0);
        else if(e.getSource()==dievalues[1]&&dievalues[1].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(1);
        else if(e.getSource()==dievalues[2]&&dievalues[2].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(2);
        else if(e.getSource()==dievalues[3]&&dievalues[3].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(3);
        else if(e.getSource()==dievalues[4]&&dievalues[4].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(4);
        else if(e.getSource()==dievalues[5]&&dievalues[5].getIcon()!=numbers[0][0]&&p1Turn==true&&!roll)
        	new highlight1(5);
        else if(e.getSource()==dievalues[0]&&dievalues[0].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(0);
        else if(e.getSource()==dievalues[1]&&dievalues[1].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(1);
        else if(e.getSource()==dievalues[2]&&dievalues[2].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(2);
        else if(e.getSource()==dievalues[3]&&dievalues[3].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(3);
        else if(e.getSource()==dievalues[4]&&dievalues[4].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(4);
        else if(e.getSource()==dievalues[5]&&dievalues[5].getIcon()!=numbers[0][0]&&p2Turn==true&&!roll)
        	new highlight2(5);
    	if(p1Turn==true&&bclick)
        {
        	if((dice==4||dice==8)&&c1<4)
        	{
			actionLabel.setText("Enter your coin");
        		if(e.getSource()==p1BaseButton)
        		{
        			dieRoll.setText("");
            		if(dice==4)
            		{
            			gp1[0]++;c1++;
            			buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
            			p1BaseButton.setIcon(p1BaseCoins[c1]);
            			actionLabel.setText("1 coin Entered the Game");bclick=false;
            			dievalues[loc].setIcon(numbers[0][0]);
            			new setNumbers1(loc,-1);
            		}
            		else
            		{
            			if(c1==3)
            			{
            				c1++;gp1[1]++;
            				buttons[2][0].setIcon(ghadi[gp1[1]][gp2[1]]);
            				p1BaseButton.setIcon(p1BaseCoins[c1]);
            				actionLabel.setText("1 coin Entered the Game");bclick=false;
            				dievalues[loc].setIcon(numbers[0][0]);
            				new setNumbers1(loc,-1);
            			}
            			else
            			{
            				c1+=2;gp1[0]+=2;
            				buttons[0][2].setIcon(ghadi[gp1[0]][gp2[0]]);
            				p1BaseButton.setIcon(p1BaseCoins[c1]);
            				actionLabel.setText("2 coins Entered the Game");bclick=false;
            				dievalues[loc].setIcon(numbers[0][0]);
            				new setNumbers1(loc,-1);
            			}
            		}
        		}
        	  }
        	else if(c1>0)
        	{
        		if(e.getSource()==buttons[0][2]&& gp1[0]>0&&bclick)
        			new Buttons02A();
                            else if(e.getSource()==buttons[0][1]&& buttons[0][1].getIcon()==outside[1]&&bclick)
        			 new Buttons01A();
        		 else if(e.getSource()==buttons[0][0]&& buttons[0][0].getIcon()==outside[1]&&bclick)
        			 new Buttons00A();
        		 else if((e.getSource()==buttons[1][0])&&buttons[1][0].getIcon()==outside[1]&&bclick)
        			 new Buttons10A();
        		 else if((e.getSource()==buttons[2][0]) && gp1[1]>0&&bclick)
        			 new Buttons20A();
        		 else if(e.getSource()==buttons[3][0]&& buttons[3][0].getIcon()==outside[1]&&bclick)
        			 new Buttons30A();
        		 else if((e.getSource()==buttons[4][0])&&(buttons[4][0].getIcon()==outside[1])&&bclick)
        			 new Buttons40A();
        		 else if((e.getSource()==buttons[4][1])&&buttons[4][1].getIcon()==blackEntry.get(1)&&bclick)
        			 new Buttons41A();
        		 else if((e.getSource()==buttons[4][2]) && gp1[2]>0&&bclick)
        			 new Buttons42A();
        		 else if(e.getSource()==buttons[4][3]&& buttons[4][3].getIcon()==outside[1]&&bclick)
        			 new Buttons43A();
        		 else if(e.getSource()==buttons[4][4]&& buttons[4][4].getIcon()==outside[1]&&bclick)
        			 new Buttons44A();
        		 else if(e.getSource()==buttons[3][4] && buttons[3][4].getIcon()==outside[1]&&bclick)
        			 new Buttons34A();
        		 else if(e.getSource()==buttons[2][4]&&gp1[3]>0&&bclick)
        			 new Buttons24A();
        		 else if(e.getSource()==buttons[1][4] && buttons[1][4].getIcon()==outside[1]&&bclick)
        			 new Buttons14A();
        		 else if(e.getSource()==buttons[0][4] && buttons[0][4].getIcon()==outside[1]&&bclick)
        			 new Buttons04A();
        		 else if(e.getSource()==buttons[0][3] && buttons[0][3].getIcon()==whiteEntry.get(1)&&bclick)
        			 new Buttons03A();
        		 else if(e.getSource()==buttons[1][3]&&buttons[1][3].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons13A();
        		 else if(e.getSource()==buttons[2][3]&&buttons[2][3].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons23A();
        		 else if(e.getSource()==buttons[3][3]&&buttons[3][3].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons33A();
        		 else if(e.getSource()==buttons[3][2]&&buttons[3][2].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons32A();
        		 else if(e.getSource()==buttons[3][1]&&buttons[3][1].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons31A();
        		 else if(e.getSource()==buttons[2][1]&&buttons[2][1].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons21A();
        		 else if(e.getSource()==buttons[1][1]&&buttons[1][1].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons11A();
        		 else if(e.getSource()==buttons[1][2]&&buttons[1][2].getIcon()==inside[1]&&kill1>0&&bclick)
        			 new Buttons12A();
        		
        		 if(noMove1==(c1-goal1))
        		 {
        			 choice.setText(" you have no Moves "+p2Name+" Turn");
        			 p1Turn=false;p2Turn=true;roll=true;
        		 }
        		if(p2Turn&&roll)
				{
	        		pf1.setIcon(flags[0]);
	        		pf2.setIcon(flags[1]);
	        		noMove1=0;
				}
	           if(kill1==1&&ch1==0)
	           {
	        	   for(int i=0;i<3;i++)
                           {	whiteEntry.remove(0);whiteEntry_1.remove(0);}
	        	   
	                if(buttons[0][3].getIcon()==whiteEntry1[0][0])  buttons[0][3].setIcon(whiteEntry.get(0));
	                else if(buttons[0][3].getIcon()==whiteEntry1[0][1])  buttons[0][3].setIcon(whiteEntry.get(1));
	                else if(buttons[0][3].getIcon()==whiteEntry1[0][2])  buttons[0][3].setIcon(whiteEntry.get(2));
	                ch1++;
	           }
	           if(goal1==4)
               {  
             	  int ans=JOptionPane.showConfirmDialog(null,p1Name+" !! You Won the game....Want to Close?");
             	  if(ans==JOptionPane.YES_OPTION)
             		  new Board();
              
               }
        	}
        	
        }
    	else if(p2Turn==true&&bclick)
        {
        	if((dice==4||dice==8)&&c2<4)
        	{
                    actionLabel.setText("Enter your coin");
        		if(e.getSource()==p2BaseButton)
        		{
        			dieRoll.setText("");
            		if(dice==4)
            		{
            			gp2[2]++;c2++;
            			buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
            			p2BaseButton.setIcon(p2BaseCoins[c2]);
            			actionLabel.setText("1 coin Entered the Game");bclick=false;
            			dievalues[loc].setIcon(numbers[0][0]);
            			new setNumbers2(loc,-1);
            		}
            		else
            		{
            			if(c2==3)
            			{
            				c2++;gp2[3]++;
            				buttons[2][4].setIcon(ghadi[gp1[3]][gp2[3]]);
            				p2BaseButton.setIcon(p2BaseCoins[c2]);
            				actionLabel.setText("1 coin Entered the Game");bclick=false;
            				dievalues[loc].setIcon(numbers[0][0]);
            				new setNumbers2(loc,-1);
            			}
            			else
            			{
            				c2+=2;gp2[2]+=2;
            				buttons[4][2].setIcon(ghadi[gp1[2]][gp2[2]]);
            				p2BaseButton.setIcon(p2BaseCoins[c2]);
            				actionLabel.setText("2 coins Entered the Game");bclick=false;
            				dievalues[loc].setIcon(numbers[0][0]);
            				new setNumbers2(loc,-1);
            			}
            		}
        		}
        	  }
        	else if(c2>0)
        	{
        		if((e.getSource()==buttons[4][2]) && gp2[2]>0&&bclick)
        			new Buttons42B();
        		else if(e.getSource()==buttons[4][3]&& buttons[4][3].getIcon()==outside[2]&&bclick)
        			new Buttons43B();
        		else if(e.getSource()==buttons[4][4]&& buttons[4][4].getIcon()==outside[2]&&bclick)
        			new Buttons44B();
        		 else if((e.getSource()==buttons[3][4])&&buttons[3][4].getIcon()==outside[2]&&bclick)
        			 new Buttons34B();
        		 else if((e.getSource()==buttons[2][4]) && gp2[3]>0&&bclick)
        			 new Buttons24B();
        		 else if(e.getSource()==buttons[1][4]&& buttons[1][4].getIcon()==outside[2]&&bclick)
        			 new Buttons14B();
        		 else if((e.getSource()==buttons[0][4])&&(buttons[0][4].getIcon()==outside[2])&&bclick)
        			 new Buttons04B();
        		 else if((e.getSource()==buttons[0][3])&&buttons[0][3].getIcon()==whiteEntry.get(2)&&bclick)
        			 new Buttons03B();
        		 else if((e.getSource()==buttons[0][2]) && gp2[0]>0&&bclick)
        			 new Buttons02B();
        		 else if(e.getSource()==buttons[0][1]&& buttons[0][1].getIcon()==outside[2]&&bclick)
        			 new Buttons01B();
        		 else if(e.getSource()==buttons[0][0]&& buttons[0][0].getIcon()==outside[2]&&bclick)
        			 new Buttons00B();
        		 else if(e.getSource()==buttons[1][0] && buttons[1][0].getIcon()==outside[2]&&bclick)
        			 new Buttons10B();
        		 else if(e.getSource()==buttons[2][0]&&gp2[1]>0&&bclick)
        			 new Buttons20B();
        		 else if(e.getSource()==buttons[3][0] && buttons[3][0].getIcon()==outside[2]&&bclick)
        			 new Buttons30B();
        		 else if(e.getSource()==buttons[4][0] && buttons[4][0].getIcon()==outside[2]&&bclick)
        			 new Buttons40B();
        		 else if(e.getSource()==buttons[4][1] && buttons[4][1].getIcon()==blackEntry.get(2)&&bclick)
        			 new Buttons41B();
        		 else if(e.getSource()==buttons[3][1]&&buttons[3][1].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons31B();
        		 else if(e.getSource()==buttons[2][1]&&buttons[2][1].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons21B();
        		 else if(e.getSource()==buttons[1][1]&&buttons[1][1].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons11B();
        		 else if(e.getSource()==buttons[1][2]&&buttons[1][2].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons12B();
        		 else if(e.getSource()==buttons[1][3]&&buttons[1][3].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons13B();
        		 else if(e.getSource()==buttons[2][3]&&buttons[2][3].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons23B();
        		 else if(e.getSource()==buttons[3][3]&&buttons[3][3].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons33B();
        		 else if(e.getSource()==buttons[3][2]&&buttons[3][2].getIcon()==inside[2]&&kill2>0&&bclick)
        			 new Buttons32B();
	       		 if(noMove2==(c2-goal2))
	       		 {
	       			 choice.setText(" you have no Moves "+p1Name+"'s Turn");
               			 p2Turn=false;p1Turn=true;roll=true;
                }
           		if(p1Turn&&roll)
   				{
   	        		pf1.setIcon(flags[1]);
   	        		pf2.setIcon(flags[0]);
   	        		noMove2=0;
   				}
                  if(kill2==1&&ch2==0)
                  {
               	   for(int i=0;i<3;i++)
                   {   	blackEntry.remove(0);blackEntry_1.remove(0);}
               	   
                       if(buttons[4][1].getIcon()==blackEntry1[0][0])  buttons[4][1].setIcon(blackEntry.get(0));
                       else if(buttons[4][1].getIcon()==blackEntry1[0][1])  buttons[4][1].setIcon(blackEntry.get(1));
                       else if(buttons[4][1].getIcon()==blackEntry1[0][2])  buttons[4][1].setIcon(blackEntry.get(2));
                       ch2++;
                  }
                  if(goal2==4)
                  {  
                	  int ans=JOptionPane.showConfirmDialog(null,p2Name+" !! You Won the game....Want to Close?");
                	  if(ans==JOptionPane.YES_OPTION)
                		  new Board();
                 
                  }
                  
        	}
        }
        /*s1=choice.getText();
        s2=actionLabel.getText();
        s3=dieRoll.getText();
        choice.setText("");
         actionLabel.setText("");
          dieRoll.setText("");*/
    }
}