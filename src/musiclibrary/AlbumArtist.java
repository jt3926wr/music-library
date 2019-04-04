package musiclibrary;

import java.util.Arrays;

public class AlbumArtist {
	
	// Variables
	private String name;
	private Album[] albumList;
	
	// Accessors / Mutators
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Album[] getAlbumList() {
		return albumList;
	}
	public void setAlbumList(Album[] albumList) {
		this.albumList = albumList;
	}
	
	
	// Constructor
	public AlbumArtist(String name, Album[] albumList) {
		this.name = name;
		this.albumList = albumList;
	}
	
	
	// toString
	@Override
	public String toString() {
		return "\nAlbumArtist [name=" + name + ", albumList=" + Arrays.toString(albumList) + "]";
	}
	
}
