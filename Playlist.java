import java.util.*;

public class Playlist {
	
	
	
	public static int nombre_playlist;	//le nombre total de playlists créées
	public static LinkedList<Playlist> allPlaylists;
	public final int ID;
	public final String title;//titre de la playlist
	private LinkedList<Song> songs; // liste des musiques presents dans la playlist
	private int rating;//note moyenne de la playlist
	private int nbUsers;//nombre d'utilisateurs ayant ecoutes la playlist
	private LinkedList<User> users; //liste des utilisateurs qui ont ecoutes cette playlist
	private LinkedList<User> usersLiked; //liste des utilisateurs qui ont ecoutes et aimes cette playlist (ie ils ont votes et mis un "pouce en l'air")
	private LinkedList<User> usersDisliked; //liste des utilisateurs qui ont ecoutes mais n'ont pas aime cette playlist (ie ils ont votes et mis un "pouce en bas")
	private int duration; //duree totale de la playlist 
	public final Influencer influencer; //l'influenceur qui a cree la playlist
	
	
	
	public Playlist(String title, Influencer influencer) {
		this.title=title;
		songs=new LinkedList<Song>();
		users= new LinkedList<User>();
		usersLiked = new LinkedList<User>();
		usersDisliked = new LinkedList<User>();
		this.influencer= influencer;
		this.ID=allPlaylists.size()+1;
		allPlaylists.add(this);
	}
	
	int getRating() {
		return this.rating;
	}
	
	int getNbUsers() {
		return this.nbUsers;
	}
	
	LinkedList<Song> getSongs() {
		return this.songs;
	}
	
	LinkedList<User> getUsers(){
		return this.users;
	}
	
	LinkedList<User> getUsersLiked(){
		return this.usersLiked;
	}
	LinkedList<User> getUsersDisliked(){
		return this.usersDisliked;
	}
	
	int getDuration() {
		return this.duration;
	}
	
	public void addSong(Song s) {
		songs.add(s);
	}
	
	public void removeSong(Song s) {
		songs.remove(s);
	}
	
	public Genre getPlaylistGenre() {		//return le genre le plus frequent dela playlist
		 int[] occurence = new int[Genre.values().length];   // 24 egal nombre de genres en tout pour le moment
		 for (Song s : this.songs) {
			 for (int i=0; i <Genre.values().length; i++) {
				 if (s.genre.equals(Genre.values()[i])) {
					 occurence[i]++;
				 }
			 }
		 }
		 int indexMax=0;
		 for (int i=0;i<occurence.length;i++) {
			 if (occurence[i]>occurence[indexMax]) indexMax=i;
			 
		 }
		 return Genre.values()[indexMax];
		
	}
	
	public int hashCode() {
		Genre g=this.getPlaylistGenre();
		String nomGenre=g.toString();
		return nomGenre.hashCode();
		
	}
	
	public boolean equals(Object o) {
		Playlist p=(Playlist) o;
		return (this.ID==p.ID);
		
	}
	
	}
