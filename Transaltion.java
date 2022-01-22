/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Translation;

/**
 *
 * @author hyperlink
 */
public class Translation {
    private String DNA;
private int length;
private String complement;
private String RNA;
public String Frame2;
public String Frame3;
public String Frame4;
public String Frame5;
public String Frame6;
public Translation(){
    
}
public Translation(String DNA){
    this.DNA= DNA;
    length = DNA.length();
}
public void setDNA(String DNA){
    this.DNA= DNA;
}
public void setLength(){
  length= this.DNA.length();
}
public void setComplement(){
    complement = DNA;
    complement = complement.replaceAll("A","X");
complement = complement.replaceAll("T","A");
complement = complement.replaceAll("X","T");

complement = complement.replaceAll("C","X");
complement = complement.replaceAll("G","C");
complement = complement.replaceAll("X","G");
}
public void setRNA(){
     RNA = DNA.replaceAll("T","U");
}
public String getDNA(){
    return DNA;
}
public String getRNA(){
    return RNA;
}
public String getComplement(){
    return complement;
}
public int getLength(){
    return length;
}
public String get1st(){
    return DNA;
}
public String get2nd(){
     Frame2 = this.DNA.substring(1,length);
    return Frame2;
}
public String get3rd(){
     Frame3 =DNA.substring(2,length);
    return Frame3;
}
public String get4th(){
     Frame4 =complement.replaceAll("T","U");;
        StringBuilder Frame41 = new StringBuilder();
    Frame41.append(Frame4);
    Frame41.reverse();
    Frame4 = Frame41.toString();
    return Frame4;
}
public String get5th(){
       Frame5 =Frame4;
    Frame5 =Frame4.substring(1,length);
    return Frame5;
}
public String get6th(){
    Frame6 =Frame4;
    Frame6 =Frame4.substring(2,length);
  return Frame6;
}
public void get1p(){
    translation(DNA.replaceAll("T", "U"));
}
public void get2p(){
    translation(Frame2.replaceAll("T", "U"));
}
public void get3p(){
    translation(Frame3.replaceAll("T", "U"));
}
public void get4p(){
    translation(Frame4);
}
public void get5p(){
    translation(Frame5);
}
public void get6p(){
       translation(Frame6);
}

public static void translation(String sequence){
char[] s = new char[sequence.length()];

for (int j= 0; j < sequence.length(); j++) {
            s[j] = sequence.charAt(j);
        }
for(int i=0;i<=sequence.length();i=i+3){
    if(i+3>sequence.length()){break;}
	//First Base U
	if(s[i]=='U'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
			System.out.printf("F");}
            else if(s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("L");}
		}

	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C' || s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("S");}
		}
		else if(s[i+1]=='A'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
	        System.out.printf("Y");}
	        else if(s[i+2]=='A' || s[i+2]=='G'){
	         System.out.printf("*");}	
			}
		else if(s[i+1]=='G'){
	        if(s[i+2]=='U'|| s[i+2]=='C'){
	        System.out.printf("C");}
	        else if(s[i+2]=='A' || s[i+2]=='G'){
	         System.out.printf("*");}
                
			}
               
		}
	//First Base C
	else if(s[i]=='C'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("L");}	
	    }
	    else if(s[i+1]=='C'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("P");}	
	    }
	    else if(s[i+1]=='A'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("H");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("Q");}
		}
		
		else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
			System.out.printf("R");}			

        }
    }
        //First Base A
	else if(s[i]=='A'){
	    if(s[i+1]=='U'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A' ){
			System.out.printf("I");}	
		    else if(s[i+2]=='G'){
			System.out.printf("M");}
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("T");}

		}
		
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("N");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("K");}		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("S");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("R");}		

        }
    }
        //First Base G
	else if(s[i]=='G'){
	    if(s[i+1]=='U'){
	    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("V");}
	    }
	    else if(s[i+1]=='C'){
	    	if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("A");}

		}
		else if(s[i+1]=='A'){
		    if(s[i+2]=='U'|| s[i+2]=='C'){
	    	System.out.printf("D");}
	    	else if(s[i+2]=='A' || s[i+2]=='G'){
	    	System.out.printf("E");}		

        }
        else if(s[i+1]=='G'){
		    if(s[i+2]=='U'|| s[i+2]=='C'||s[i+2]=='A'|| s[i+2]=='G'){
	    	System.out.printf("G");}	

        }
	}
	
	
	
}//FOR LOOP

}
    
}
