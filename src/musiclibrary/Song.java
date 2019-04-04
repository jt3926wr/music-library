package musiclibrary;

public class Song {
	
	// Variables
	private String title;
	private String artist;
	private String genre;
	private int track;
	
	
	// Accessors / Mutators
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	
	// Constructor
	public Song(String title, String artist, String genre, int track) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.track = track;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "\n\t\tSong [title=" + title + ", artist=" + artist + ", genre=" + genre + ", track=" + track + "]";
	}
}
