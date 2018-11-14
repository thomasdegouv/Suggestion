import java.util.*;

public class Song {
	public final String title;
	public final Genre genre;
	public final Artiste artiste;
	public final Album album;
	public final int year;
	//private final Artiste artists_album;
	public final int BPM;
	private int rating;
	public final int duration;
	
	public Song(String title,Artiste artiste,Album album, Genre genre, int year, int BPM, int duration) {
		this.title=title;
		this.genre=genre;
		this.artiste=artiste;
		this.album=album;
		this.year=year;
		this.BPM=BPM;
		this.duration = duration;
	}
	
	int getRating() {
		return this.rating;
	}
	
}
