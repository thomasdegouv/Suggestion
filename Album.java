import java.util.*;

public class Album {
	public final String title;
	public final Artiste artiste;
	private LinkedList<Song> songs;
	public final int dateAlbum;
	public final LinkedList<Genre> genres;
	private int rating;
	public final int duration;
	//je suis la ?
	public Album(String title, Artiste artiste, int dateAlbum, LinkedList<Genre> genres, int rating, int duration) {
		this.title = title;
		this.artiste = artiste;
		this.dateAlbum = dateAlbum;
		this.genres = genres;
		this.rating = rating;
		this.duration = duration;
	}
	
	int getRating() {
		return this.rating;
	}
}
