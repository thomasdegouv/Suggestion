import java.util.Scanner;
public class QuestionsProfile {
	public static void main(String[] args) {
		User user = new User(27);
		for (Genre g : Genre.values()) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Aimez-vous ce genre ? "+g);//1 il aime 0 il aime pas
		    int answer = sc.nextInt();
		    if (answer==1){
		    	user.getFavoriteGenres().add(g);
		    }
		    else {
		    	user.getHatedGenres().add(g);
		    }
		}
		for (Genre g : user.getFavoriteGenres()) {
			System.out.println(g);
		}
	   
	    
	    
	}
	
	//Attention, la personne peut ne pas avoir d'avis
}
