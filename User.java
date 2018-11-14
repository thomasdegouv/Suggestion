import java.util.*;
public class User {
	public final int id;
	private LinkedList<Artiste> favoriteArtists;
	private LinkedList<Genre> favoriteGenres;
	private LinkedList<Genre> hatedGenres;
	private LinkedList<Playlist> playlistliked;
	private LinkedList<Playlist> playlistdisliked;
	
	public User(int id) {
		this.id = id;
		favoriteArtists = new LinkedList<Artiste>();
		favoriteGenres =new LinkedList<Genre>();
		hatedGenres = new LinkedList<Genre>();
		playlistliked = new LinkedList<Playlist>();
		playlistdisliked = new LinkedList<Playlist>();
	}
	
	LinkedList<Artiste> getFavoriteArtists(){
		return this.favoriteArtists;
	}
	
	LinkedList<Genre> getFavoriteGenres(){
		return this.favoriteGenres;
	}
	
	LinkedList<Genre> getHatedGenres(){
		return this.hatedGenres;
	}
	
	LinkedList<Playlist> getPlaylistliked(){
		return this.playlistliked;
	}
	
	LinkedList<Playlist> getPlaylistdisliked(){
		return this.playlistdisliked;
	}
}
