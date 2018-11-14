import java.util.*;

public class Artiste {
	int rating;
	//int views;
	public final String name;
	private static LinkedList<Artiste> allArtists; //Liste de tous les artistes
	private LinkedList<Album> artistAlbums;  //Liste de tous les albums de l'artiste
	
	public Artiste(int rating, String name) {
		this.rating = rating;
		this.name = name;
		
	}
	
	static LinkedList<Artiste> getAllArtiste(){
		return allArtists;
	}
	
	LinkedList<Album> getArtistAlbums(){
		return this.artistAlbums;
	}
}
