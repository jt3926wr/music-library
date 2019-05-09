package musiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.SwingUtilities;

public class Driver {

	

	public static void main(String[] args) {
		/*
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
		//AlbumArtist.addAlbumArtist(albumArtist1);
		AlbumArtist[] albumArtistList = {albumArtist1};
		*/
		
		// Songs for Abbey Road (Disc 1)
		Song s1 = new Song("Come Together", "Lennon", "Rock", 1);
		Song s2 = new Song("Something", "Harrison", "Rock", 2);
		Song s3 = new Song("Maxwell's Silver Hammer", "McCartney", "Rock", 3);
		Song s4 = new Song("Oh! Darling", "McCartney", "Rock", 4);
		Song s5 = new Song("Octopus's Garden", "Starr", "Rock", 5);
		Song s6 = new Song("I Want You (She's So Heavy)", "Lennon", "Rock", 6);
		Song[] albumSongs1 = {s1, s2, s3, s4, s5, s6};
		
		// Songs for Abbey Road (Disc 2)
		Song s7 = new Song("Here Comes the Sun", "Harrison", "Rock", 1);
		Song s8 = new Song("Because", "Lennon, McCartney and Harrison", "Rock", 2);
		Song s9 = new Song("You Never Give Me Your Money", "McCartney", "Rock", 3);
		Song s10 = new Song("Sun King", "Lennon, with McCartney and Harrison", "Rock", 4);
		Song s11 = new Song("Mean Mr. Mustard", "Lennon", "Rock", 5);
		Song s12 = new Song("Polythene Pam", "Lennon", "Rock", 6);
		Song s13 = new Song("She Came in Through the Bathroom Window", "McCartney", "Rock", 7);
		Song s14 = new Song("Golden Slumbers", "McCartney", "Rock", 8);
		Song s15 = new Song("Carry That Weight", "McCartney, with Lennon, Harrison and Starr", "Rock", 9);
		Song s16 = new Song("The End", "McCartney", "Rock", 10);
		Song s17 = new Song("Her Majesty", "McCartney", "Rock", 11);
		Song[] albumSongs2 = {s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17};
		
		// Songs for Dark Side of the Moon (Disc 1)
		Song s18 = new Song("Speak to Me", "", "Rock", 1);
		Song s19 = new Song("Breathe", "David Gilmour", "Rock", 2);
		Song s20 = new Song("On the Run", "", "Rock", 3);
		Song s21 = new Song("Time", "Gilmour with Richard Wright", "Rock", 4);
		Song s22 = new Song("The Great Gig in the Sky", "Clare Torry", "Rock", 5);
		Song[] albumSongs3 = {s18, s19, s20, s21, s22};
		
		// Songs for Dark Side of the Moon (Disc 2)
		Song s23 = new Song("Money", "Gilmour", "Rock", 1);
		Song s24 = new Song("Us and Them", "Gilmour", "Rock", 2);
		Song s25 = new Song("Any Colour You Like", "", "Rock", 3);
		Song s26 = new Song("Brain Damage", "Roger Waters", "Rock", 4);
		Song s27 = new Song("Eclipse", "Waters", "Rock", 5);
		Song[] albumSongs4 = {s23, s24, s25, s26, s27};
		
		// Songs for Now #90
		Song s28 = new Song("Uptown Funk", "Mark Ronson FT Bruno Mars", "Contemporary R&B", 1);
		Song s29 = new Song("Thinking Out Loud", "Ed Sheeran", "Pop", 2);
		Song s30 = new Song("King", "Years & Years", "Pop", 3);
		Song s31 = new Song("Sugar", "Maroon 5", "Pop", 4);
		Song s32 = new Song("Hold Back the River", "James Bay", "Pop", 5);
		Song s33 = new Song("Like I Can", "Sam Smith", "Pop", 6);
		Song s34 = new Song("Up", "Olly Murs FT Demi Lovato", "Pop", 7);
		Song s35 = new Song("Lips Are Movin", "Meghan Trainor", "Pop", 8);
		Song s36 = new Song("Hold My Hand", "Jess Glynne", "Pop", 9);
		Song s37 = new Song("Elastic Heart", "Sia", "Pop", 10);
		Song s38 = new Song("Something I Need", "Ben Haenow", "Pop", 11);
		Song s39 = new Song("These Days", "Take That", "Electronic", 12);
		Song s40 = new Song("Night Changes", "One Direction", "Pop", 13);
		Song s41 = new Song("Heroes (We Could Be)", "Alesso FT Tove Lo", "Electronic", 14);
		Song s42 = new Song("Heartbeat Song", "Kelly Clarkson", "Synthpop", 15);
		Song[] albumSongs5 = {s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39, s40, s41, s42};
		
		// Albums
		Album album1 = new Album("Abbey Road (Disc 1)", 1969, albumSongs1);
		Album album2 = new Album("Abbey Road (Disc 2)", 1969, albumSongs2);
		Album[] albumList1 = {album1, album2}; // The Beatles
		
		Album album3 = new Album("Dark Side of the Moon (Disc 1)", 1973, albumSongs3);
		Album album4 = new Album("Dark Side of the Moon (Disc 1)", 1973, albumSongs4);
		Album[] albumList2 = {album3, album4}; // Pink Floyd
		
		Album album5 = new Album("Now That's What I Call Music #90", 2015, albumSongs5);
		Album[] albumList3 = {album5}; // Best Of Albums
		
		// Album artists (who made the albums)
		AlbumArtist albumArtist1 = new AlbumArtist("The Beatles", albumList1);
		AlbumArtist albumArtist2 = new AlbumArtist("Pink Floyd", albumList2);
		AlbumArtist albumArtist3 = new AlbumArtist("Now! Music", albumList3);
		
		// List of album artists
		AlbumArtist[] albumArtistList = {albumArtist1, albumArtist2, albumArtist3};
		


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
			GUI gui = new GUI();
			gui.setVisible(true);
		    gui.updateTbl(albumArtistList);
		});
	}
}
