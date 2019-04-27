package musiclibrary;

import javax.swing.SwingUtilities;

public class Driver {
	public static void main(String[] args) {
		// Songs for album 1
		Song s1 = new Song("Red Moon Rising", "Some cool person", "Rock", 1);
		Song s2 = new Song("Spherical", "A dude", "Electronic", 2);
		Song s3 = new Song("Amazement", "Another Cool Person feat. Bill Nye", "Rock", 3);
		Song s4 = new Song("Prograde Programming", "Some cool person", "Rock", 4);
		Song s5 = new Song("Java is not Coffee", "A dude", "RnB", 5);
		Song[] albumSongs1 = {s1, s2, s3, s4, s5}; // Place songs into array

		// Songs for album 2
		Song s6 = new Song("Plutonium", "Some cool person", "Metal", 1);
		Song s7 = new Song("Ascetic Rain", "A dude", "Atmospheric", 2);
		Song s8 = new Song("Brownouts", "Another cool person", "Rock", 3);
		Song[] albumSongs2 = {s6, s7, s8}; // Place songs into array

		// Starter albums
		Album album1 = new Album("Astrologic", 2018, albumSongs1);
		Album album2 = new Album("Solar Wave",  2017, albumSongs2);
		Album[] albumList1 = {album1, album2};// Put albums into an array


		// Album Artist (who made the album)
		AlbumArtist albumArtist1 = new AlbumArtist("The Spacers", albumList1);


		// Test output
		// Songs
		//System.out.println(s1.toString());
		//System.out.println(s4.toString());
		//System.out.println(s8.toString());

		// Albums
		//System.out.println(album1.toString());
		//System.out.println(album2.toString());

		// AlbumArtist
		System.out.println(albumArtist1.toString());
		SwingUtilities.invokeLater(() -> {
			GUI gui = new GUI("Music Library");
			gui.setVisible(true);
		    gui.updateTbl(new AlbumArtist[] {albumArtist1});
		});
	}
}
