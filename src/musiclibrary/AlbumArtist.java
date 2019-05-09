package musiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class AlbumArtist implements Comparator {
	
	// Variables
	private String name;
	private Album[] albumList;
	private static AlbumArtist[] albumArtistList;
	
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
	
	
//	public static AlbumArtist[] getAlbumArtistList() {
//		return albumArtistList;
//	}
//	public static void setAlbumArtistList(AlbumArtist[] a) {
//		albumArtistList = a;
//	}
	
	/*
	public static void addAlbumArtist(AlbumArtist newAlbumArtist) {
		if(albumArtistList != null) {
			// Store array in temporary array list
			ArrayList<AlbumArtist> tempList = new ArrayList<AlbumArtist>(Arrays.asList(getAlbumArtistList()));
			
			// Add new entry to list
			tempList.add(newAlbumArtist);
			
			// Rebuild array
			//Iterator i = tempList.iterator();
			//AlbumArtist[] tempArray = new AlbumArtist[(tempList.size())];
			
			AlbumArtist[] objArray = (AlbumArtist[]) tempList.toArray();
			
			
//			for (int j=0; i.hasNext(); j++) {
//				System.out.println(j);
//				tempArray[j] = tempList.get(j);
//			}
//			//tempArray[tempList.size()] = newAlbumArtist;
//			setAlbumArtistList(tempArray);
			
		}
		else {
			// Make a new array list
			ArrayList<AlbumArtist> tempList = new ArrayList<AlbumArtist>();
			
			// Add entry to list
			tempList.add(newAlbumArtist);
			
			// Rebuild array
			AlbumArtist[] objArray = (AlbumArtist[]) tempList.toArray();
		}
	}
	*/
	
	
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
	
	@Override
	public int compare(Object o1, Object o2) {
		AlbumArtist a1 = (AlbumArtist) o1;
		AlbumArtist a2 = (AlbumArtist) o2;
		
		return a1.getName().compareTo(a2.getName());
	}
}
