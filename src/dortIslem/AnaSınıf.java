package dortIslem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;



public class AnaSınıf {
	public static int dil=0;
	public static void main(String[] args) {
		JFrame f=new JFrame();
		
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton b1, b2 ,b3,b4;
		 String[] kelimeler= {"birinci sayı", "ikinci sayı" , "sonuç", "topla", "çıkar", "çarp", "böl"};
		 String[] kelimeler2= {"first number", "second number" , "result", "add", "Subtract", "multiply", "divide"};
		
		if(Locale.getDefault().getLanguage()== "en") {
			dil=1;
			
			kelimeler = kelimeler2;
		}else {
			dil=0;
			
		}
			
		TurkceDonustur turkceDonustur =new TurkceDonustur();
		EngDonustur engDonustur = new EngDonustur();
		
		l1= new JLabel(kelimeler[0]);
		l1.setBounds(30,10,100, 30);
		
		t1= new JTextField( );
		t1.setBounds(130,10,200, 30);
		
		l2= new JLabel(kelimeler[1]);
		l2.setBounds(30,50,100, 30);
		
		t2= new JTextField( );
		t2.setBounds(130,50,200, 30);
		          
		l3= new JLabel(kelimeler[2]);
		l3.setBounds(30,90,100, 30);
		
		t3= new JTextField( );
		t3.setBounds(130,90,200, 30);
		t3.setEditable(false);
		
		b1=new JButton(kelimeler[3]);
		b1.setBounds(30,130,80, 30);
		
		b2=new JButton(kelimeler[4]);
		b2.setBounds(110,130,80, 30);
		
		b3=new JButton(kelimeler[5]);
		b3.setBounds(190,130,80, 30);
		
		b4=new JButton(kelimeler[6]);
		b4.setBounds(270,130,80, 30);
		
	b1.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int toplam;
				if(dil==0) {
					if(turkceDonustur.donustur(t1.getText())==-1||turkceDonustur.donustur(t2.getText())==-1) {
						t3.setText("Tanımlı bir değer girilmedi");
					}else {
				 toplam = (turkceDonustur.donustur(t1.getText()))+(turkceDonustur.donustur(t2.getText()));
				
				t3.setText(turkceDonustur.sayiToText(toplam));}
			}else {
				if(engDonustur.donustur(t1.getText())==-1||engDonustur.donustur(t2.getText())==-1) {
					t3.setText("No defined value entered");
				}else {
			 toplam = (engDonustur.donustur(t1.getText()))+(engDonustur.donustur(t2.getText()));
			
			t3.setText(engDonustur.sayiToText(toplam));}
			}
			
			}

			
				
		});
		
		b2.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int toplam;
				if(dil==0) {
					if(turkceDonustur.donustur(t1.getText())==-1||turkceDonustur.donustur(t2.getText())==-1) {
						t3.setText("Tanımlı bir değer girilmedi");
					}else {
				 toplam = (turkceDonustur.donustur(t1.getText()))-(turkceDonustur.donustur(t2.getText()));
				if(toplam<0) {
					toplam*=-1;
					t3.setText("eksi " + turkceDonustur.sayiToText(toplam));
				}else {
				t3.setText(turkceDonustur.sayiToText(toplam));}
				}
			}else {
				if(engDonustur.donustur(t1.getText())==-1||engDonustur.donustur(t2.getText())==-1) {
					t3.setText("No defined value entered");
				}else {
			 toplam = (engDonustur.donustur(t1.getText()))-(engDonustur.donustur(t2.getText()));
			
			 if(toplam<0) {
					toplam*=-1;
					t3.setText("negative " + engDonustur.sayiToText(toplam));
				}else {
				t3.setText(engDonustur.sayiToText(toplam));}
			}
				
			}
			
			}
				
		});

		
		b3.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int toplam;
				if(dil==0) {
					if(turkceDonustur.donustur(t1.getText())==-1||turkceDonustur.donustur(t2.getText())==-1) {
						t3.setText("Tanımlı bir değer girilmedi");
					}else {
				 toplam = (turkceDonustur.donustur(t1.getText()))*(turkceDonustur.donustur(t2.getText()));
				
				t3.setText(turkceDonustur.sayiToText(toplam));}
			}else {
				if(engDonustur.donustur(t1.getText())==-1||engDonustur.donustur(t2.getText())==-1) {
					t3.setText("No defined value entered");
				}else {
			 toplam = (engDonustur.donustur(t1.getText()))*(engDonustur.donustur(t2.getText()));
			
			t3.setText(engDonustur.sayiToText(toplam));}
			}
			
			}
				
		});

		
		b4.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int toplam;
				if(dil==0) {
					if(turkceDonustur.donustur(t1.getText())==-1||turkceDonustur.donustur(t2.getText())==-1) {
						t3.setText("Tanımlı bir değer girilmedi");
					}else {
				 toplam = (turkceDonustur.donustur(t1.getText()))/(turkceDonustur.donustur(t2.getText()));
				
				t3.setText(turkceDonustur.sayiToText(toplam));}
			}else {
				if(engDonustur.donustur(t1.getText())==-1||engDonustur.donustur(t2.getText())==-1) {
					t3.setText("No defined value entered");
				}else {
			 toplam = (engDonustur.donustur(t1.getText()))/(engDonustur.donustur(t2.getText()));
			
			t3.setText(engDonustur.sayiToText(toplam));}
			}
				
			
			}
				
		});
		
		
		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,500); 
		f.setLayout(null);
		f.setVisible(true); 
		// TODO Auto-generated method stub
	    
	}

}
