package musiclibrary;

import java.util.Arrays;

public class Album {

	// Variables
	private String name;
	private int year;
	private Song[] songList;
	
	
	// Accessors / Mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Song[] getSongList() {
		return songList;
	}
	public void setSongList(Song[] songList) {
		this.songList = songList;
	}
	
	
	// Constructor
	public Album(String name, int year, Song[] songList) {
		this.name = name;
		this.year = year;
		this.songList = songList;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "\n\tAlbum [name=" + name + ", year=" + year + ", songList=" + Arrays.toString(songList) + "]";
	}
}
