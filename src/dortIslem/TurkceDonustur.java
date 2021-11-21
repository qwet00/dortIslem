package dortIslem;

import java.util.ArrayList;

public class TurkceDonustur {

	public String[] b1 = {"sıfır", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
	public String[] b2 = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
	public String[] b3 = {"", "yüz", "bin"};

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
		 for(int i =0;i<b1.length;i++) {
			 list.add(b1[i]);
		 }
		 for(int i =0;i<b2.length;i++) {
			 list1.add(b2[i]);
		 }
		 for(int i =0;i<b3.length;i++) {
			 list2.add(b3[i]);
		 }
		if(list.indexOf(y)!=-1) {	 
		return list.indexOf(y);}
		else if(list1.indexOf(y)!=-1) {
		return list1.indexOf(y)*10;
		}
		else if(list2.indexOf(y)==1){
			return list2.indexOf(y)*100;
		}else if(list2.indexOf(y)==2) {
			return 1000;
		
		}else {
			return -1;
		}
	}
	
	public String sayiToText(int sayi) {
	String text="";	
	int counter=1;	
	if(sayi==0) {
		return "sıfır";
	}else {
	while(sayi>0) {
		if(counter==1 && sayi%10!=0) {
		text+=b1[sayi%10];
	}
		if(counter==2) {
		text = b2[sayi%10] + " "+ text;
		
		}
		if(counter==3 && sayi%10!=0) {
			if (sayi%10!=1)
			text = b1[sayi%10]+ " " + "yüz" + " "+ text;
			else
			text = "yüz" + " " + text;
			}
		if(counter==4 ) {
			
			if(sayi>=10)
				return "sayı çok büyük";
			
			
			if (sayi%10!=1)
			text = b1[sayi%10]+ " " + "bin" + " "+ text;
			else
			text = "bin" + " "+ text;
			}
		sayi=sayi/10;
		counter++;
	}
	return text;
	}
	}
}





