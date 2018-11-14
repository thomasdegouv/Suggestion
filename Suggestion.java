import java.util.*;
public class Suggestion {
	
	Playlist suggestInitial(User u) {
		//Chercher dans playlist triée par genre qui ressort le plus (faire un HashSet) des playlists correspondant aux genres aimés par Use
		//Pour le genre préféré, prendre le premier cliqué (faire une pile)
		//Prendre playlists qui correspond à ce genre avec note sup à x
		//Sélectionner les artistes
		//boucle while qui tant que ca se recoupe, on continue à chercher l'ar
		//ressortir playlist
		
		//Si il like ou fait rien, on fait écouter les playlist reliées
		//Si il like pas, playlists likées par ceux qui ont pas aimé celle la
		
		//HashMap<Genre, Playlist> playlistsByGenre = new HashMap<Genre, Playlist>();
		//for (Playlist p : Playlist.allPlaylists) {
			//playlistsByGenre.put(p.getPlaylistGenre(), p);
		//}
		
		
		
		
		Vector<LinkedList<Playlist>> playlistByGenre=new Vector<LinkedList<Playlist>>(Genre.values().length);
		
		for (Playlist p : Playlist.allPlaylists) {
			
		}
		
		Genre genreFavori = u.getFavoriteGenres().get(0);
		LinkedList<Playlist> playlistFavGenres=new LinkedList<Playlist>();
		
		
		
	}
}


//algo entrainé pcq sur un meme genre y a des titres opposés. Algo capable d'anticiper des attracteeurs. Mood sur spotify ? Se documenter pour le rapport !