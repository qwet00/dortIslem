package dortIslem;

import java.util.ArrayList;

public class EngDonustur {

	public String[] b1 = { "zero","one","two","three","four", "five","six", "seven",  "eight", "nine"};
	public String[] b2 = { "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; 
	public String[] b3 = {"", "", "twenty", "thirty", "forty",  "fifty","sixty", "seventy",  "eighty", "ninety"}; 
	public String[] b4 = {"hundred", "thousand", "million"}; 
	
	
	
	public int donustur(String yazi) {
		int sayi=0;
		int counter=yazi.length();
		int temp,temp2;
		
		
		while(counter>0) {
			if(yazi.contains(" ")){
				temp=tekliDonustur(yazi.substring(yazi.lastIndexOf(' ')+1));
				counter=yazi.lastIndexOf(' ');
				yazi=yazi.substring(0,counter);}
			else {
				
				temp=tekliDonustur(yazi);
				
				counter=0;
			}
			if(temp<100) {
				sayi+=temp;
				
			}else {
				if(counter>0){
					if(yazi.contains(" ")) {
						temp2=tekliDonustur(yazi.substring(yazi.lastIndexOf(' ')+1));
						if(temp2<10) {
							counter=yazi.lastIndexOf(' ');
							yazi=yazi.substring(0,counter);
							temp*=temp2;
						}
						
					}else {
						temp2=tekliDonustur(yazi);
						if(temp2<10) {
						
							temp*=temp2;
							counter=0;
						}
					}
					}
				
					sayi+=temp;
				
					
				
			}
			
		}
		
		return sayi;
	}
	
	public int tekliDonustur(String y) {
		
		 ArrayList<String> list = new ArrayList<String>();
		 ArrayList<String> list1 = new ArrayList<String>();
		 ArrayList<String> list2 = new ArrayList<String>();
		 ArrayList<String> list3 = new ArrayList<String>();
		 for(int i =0;i<b1.length;i++) {
			 list.add(b1[i]);
		 }
		 for(int i =0;i<b2.length;i++) {
			 list1.add(b2[i]);
		 }
		 for(int i =0;i<b3.length;i++) {
			 list2.add(b3[i]);
		 }
		 for(int i =0;i<b4.length;i++) {
			 list3.add(b4[i]);
		 }
		if(list.indexOf(y)!=-1) {	 
		return list.indexOf(y);}
		else if(list1.indexOf(y)!=-1) {
		return list1.indexOf(y)+10;
		}
		else if(list2.indexOf(y)!=-1){
			return list2.indexOf(y)*10;
		}else if(list3.indexOf(y)==0) {
			return 100;
		
		}else if(list3.indexOf(y)==1) {
			return 1000;
		
		}else {
			return -1;
		}
		
		
	}
	
	
	public String sayiToText(int sayi) {
		String text="";	
		int counter=1;
		int birler=0;
		if(sayi==0) {
			return "zero";
		}else {
			
			
		while(sayi>0) {
			if(counter==1 && sayi%10!=0) {
			text+=b1[sayi%10];
			birler=sayi%10;
		}
			if(counter==2) {
			if(sayi%10==1) {
				text=b2[birler];
			}else {
				text = b3[sayi%10] + " "+ text;
			}
			
			
			}
			if(counter==3 && sayi%10!=0) {
		
				text = b1[sayi%10]+ " " + b4[0] + " "+ text;
				
				}
			if(counter==4 ) {
				
				text = b1[sayi%10]+ " " + b4[1]  + " "+ text;
				if(sayi>=10)
					return "the number is too big";
				}
			sayi=sayi/10;
			counter++;
		}
		return text;
		}
		}
	
	
}
