
public class Collatz {

	public static void main(String[] args) {
			long Startzahl = 322248745;
			while(Startzahl >1) {
		    if(Startzahl%2==0){
		    	Startzahl = Startzahl/2;
			}
			else{Startzahl=(Startzahl*3)+1;}
			System.out.print(Startzahl+",");}
	}

}