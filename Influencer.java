import java.util.*;
public class Influencer { //les influenceurs sont ceux qui creent et partagent les playlists a differencier des utilisateurs 
	public final int id; //l'identifiant de l'influenceur 
	private LinkedList<Playlist> playlists;//liste des playlists partages par l'influenceur
	public Influencer(int id) {
		this.id=id;
		playlists=new LinkedList<Playlist>();
	}
}
