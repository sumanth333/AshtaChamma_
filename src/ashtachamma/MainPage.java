package ashtachamma;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainPage {
	static JFrame frame=new JFrame("Ashta_Chamma");
	static JPanel panel0=new JPanel();
        static Color m;
	//JPanel sands=new JPanel();//For sands name
	static JButton buttons[][]=new JButton[5][5];
	static JPanel name=new JPanel();//For AshtaChamma name
	static JButton play=new JButton("Play");
	static JButton HPlay=new JButton("How to Play");
	static JButton quit=new JButton("Quit");
	static JPanel ash=new JPanel();
	static JPanel dup=new JPanel();
	static JLabel l1=new JLabel();

	static JPanel IP=new JPanel();
	//JLabel sandsL=new JLabel();
	static String p1name,p2name;
       /* public MainPage(JFrame frame)
        {
                this();
                
                frame.getContentPane().removeAll();
                frame.setVisible(false);
                this.frame=frame;
                new MainPage();
                frame.validate();
        }*/
	public MainPage(JFrame frame){
                this.frame=frame;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(2000,2000);
                m=Color.decode("#C0C0C0");
		frame.add(panel0);
		frame.setLayout(null);
		panel0.setSize(1500,750);
		panel0.setBackground(m);
		/*//Adding SANDS Panel
		sands.setBounds(80,100,130,550);
		sands.setBackground(m);
		ImageIcon ii=new ImageIcon(MainPage.class.getResource("newsands.gif"));
		sandsL=new JLabel();
		sandsL.setBounds(0,0,130,550);
		sandsL.setIcon(ii);
		sands.add(sandsL);
		sands.setLayout(null);
		panel0.add(sands);*/
		panel0.setLayout(null);
		//Adding name to panel;;;;ashtachamma
		ash.setBounds(320,42,578,58);
		ash.setBackground(Color.cyan);
		JLabel l=new JLabel();
		ImageIcon iii=new ImageIcon(MainPage.class.getResource("NameOfAshtaChammamama.gif"));
		l.setIcon(iii);
		l.setBounds(0,0,580,58);
		ash.add(l);
		ash.setLayout(null);
		panel0.add(ash);
	
		//	panel0.setLayout(new GridLayout(5,5));
		int x,y=140;
		for(int i=0;i<5;i++) {
			x=320;
			for(int j=0;j<5;j++){
					if(((i+j)%2==0) && (i==2||j==2))
					{
							if(i==2&&j==2){
							ImageIcon background = new ImageIcon(MainPage.class.getResource("panta.jpg"));
							buttons[i][j]=new JButton(background);
							buttons[i][j].setBounds(x,y,110,94);
							panel0.add(buttons[i][j]);
							x+=110;
							}
							else{
							
							ImageIcon background = new ImageIcon(MainPage.class.getResource("Ghadi.jpg"));
							buttons[i][j]=new JButton(background);
							buttons[i][j].setBounds(x,y,110,94);
							panel0.add(buttons[i][j]);
							x+=110;
							}}
			else if(i>0&&i<4&&j>0&&j<4)
					{
						 	ImageIcon background = new ImageIcon(MainPage.class.getResource("inside.jpg"));
							buttons[i][j]=new JButton(background);
							buttons[i][j].setBounds(x,y,110,94);
							panel0.add(buttons[i][j]);
							x+=110;						
					
				
					}				
						
						
						
						
			else{
					if(i==0&&j==3){
				
					ImageIcon background = new ImageIcon(MainPage.class.getResource("notkillwhite.jpg"));
					
					buttons[i][j]=new JButton(background);
					buttons[i][j].setBounds(x,y,110,94);
					panel0.add(buttons[i][j]);
					x+=110;}
					else if(i==4&&j==1){
					ImageIcon background= new ImageIcon(MainPage.class.getResource("notkillblack.jpg"));
					
					buttons[i][j]=new JButton(background);
					buttons[i][j].setBounds(x,y,110,94);
					panel0.add(buttons[i][j]);
					x+=110;}
					else{
		
					ImageIcon background = new ImageIcon(MainPage.class.getResource("Outside2.jpg"));
					buttons[i][j]=new JButton(background);
					buttons[i][j].setBounds(x,y,110,94);
					panel0.add(buttons[i][j]);
					x+=110;
					}}
					}y+=94;
				}
		//play.setText("Play");
		Method1();
		

			
	}
	public static void main(String args[]){
		new MainPage(frame);
	}
public void Method1(){
		IP.setVisible(true);
		IP.setBounds(900,140,400,500);
		IP.setBackground(m);
		IP.setLayout(null);
		panel0.add(IP);
		JButton play=new JButton("Play");
		JButton hplay=new JButton("How to play");
		JButton quit=new JButton("Quit");
                Color n=Color.decode("#FF0000");
		//Adding background colors and bounds to buttons
		play.setBackground(m);
		play.setBounds(150,130,80,30);
		//play.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.gray));
		play.setForeground(n);
		IP.add(play);
		hplay.setBounds(130,170,120,30);
                
		hplay.setBackground(m);
		//hplay.setBorder(BorderFactory.createMatteBorder(0,0,0,0,m));
		hplay.setForeground(n);
		IP.add(hplay);
		quit.setBounds(150,210,80,30);
		quit.setBackground(m);
		//quit.setBorder(BorderFactory.createMatteBorder(0,0,0,0,m));
		quit.setForeground(n);
		IP.add(quit);

		//Giving actions to buttons
		play.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				//panel0.remove(IP);
				playPanel();
			
				}});
		//Action for how to play
		hplay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					JOptionPane.showMessageDialog(null, "1.Two players can play this game . Each player has four coins.\n2.Each player has to roll dice to move their coins. \n3.All players should get either 8 or 4 to make  their first move.\n4.Players can roll dice again if they get 4 (Chamma) or 8 (Ashta)\n5.Player can kill other player's coin only in ghadi.\n6.Until and unless a player kills other player's coin he can't get inside.\n7.If a player can't kill other player's coin and all coins of other player gets inside he loses.\n8.Three consecutive 8's or 4's is considered zero and player loses his turn.\n9.The first player who gets all his coins into panta wins.\n");
											
			}});
		quit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.exit(0);
						}});
		
		}
public void playPanel(){
				IP.setVisible(false);
				dup.setVisible(true);
				dup.setBounds(900,140,400,500);
				dup.setBackground(m);
				dup.setLayout(null);
				panel0.add(dup);
				play.setText("");
				play.setBackground(Color.BLUE);
				play.setEnabled(false);
				HPlay.setText("");
				HPlay.setBackground(Color.BLUE);
				HPlay.setEnabled(false);
				quit.setText("");
				quit.setBackground(Color.BLUE);
				quit.setEnabled(false);
				JButton start=new JButton("Start");
				JButton back=new JButton("Back");
				start.setBounds(300,450,100,30);
				back.setBounds(30,460,100,30);
                                Color cc=Color.decode("#008000");
				start.setBackground(m);
				back.setBackground(m);
				start.setForeground(cc);
				back.setForeground(cc);
				start.setBorder(BorderFactory.createMatteBorder(0,0,0,0,m));
				back.setBorder(BorderFactory.createMatteBorder(0,0,0,0,m));
				dup.add(start);
				dup.add(back);
				//creating text fields for taking player names
				JLabel p1=new JLabel();
				p1.setText("Enter the name of first player");
                                Color c=Color.decode("#B22222");
				p1.setForeground(c);
				p1.setBounds(40,140,220,50);
				dup.add(p1);
				JTextField pname1=new JTextField(20);
				JTextField pname2=new JTextField(20);
				pname1.setBounds(70,190,280,20);
				dup.add(pname1);
				pname1.setBackground(Color.white);
				JLabel p2=new JLabel();
				p2.setText("Enter the name of second player");
				p2.setForeground(c);
				p2.setBounds(40,240,250,50);
				dup.add(p2);
				pname2.setBounds(70,290,280,20);
				dup.add(pname2);
				pname2.setBackground(Color.white);
				//action for back button
				back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				dup.setVisible(false);
				Method1();
				}});
				//action for start button
				start.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						p1name=pname1.getText();
						p2name=pname2.getText();

						if(p1name.length()>0&&p2name.length()>0){
						//System.exit(0);
						frame.getContentPane().removeAll();
						frame.setVisible(false);
                                                frame.dispose();
                                                
						
						AshtaChamma  aa=new AshtaChamma(frame);
						String s[]=new String[2];
						s[0]=p1name;
						s[1]=p2name;
						//frame.pack();
						aa.main(s);
						}
						
				}});
		
				}
}