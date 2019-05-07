package musiclibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;

	/*
	private DefaultTableModel tblAlbumsMdl = new DefaultTableModel(new String[] {"Album Artist", "Album Name",
		"Year", "Track Number", "Song Title", "Song Artist", "Genre"}, 0);
	*/
	private DefaultTableModel tblAlbumsMdl = new DefaultTableModel(new String[] {"Track", "Title",
		"Song Artist", "Album", "Year", "Album Artist", "Genre"}, 0);

	private AlbumArtist albumArtists[];
	
	// Basic Genre list
	private String genreArr[] = {
		"Blues",
		"Classical",
		"Country",
		"Electronic",
		"Folk",
		"Jazz",
		"New Age",
		"Reggae",
		"Rock"
	};

	// Stores additional genres from supplied songs.
	private ArrayList<String> genres = new ArrayList<String>();

	private JTable tblAlbums = new JTable(tblAlbumsMdl);

	public GUI(String title) {
		super(title);

		initGUIComponents();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
	}

	private void initGUIComponents() {

		JPanel pnlMain = new JPanel(new BorderLayout(10, 10));
		pnlMain.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlMain.setPreferredSize(new Dimension(650, 400));
		pnlMain.add(new JScrollPane(tblAlbums), BorderLayout.CENTER);
		tblAlbums.setAutoCreateRowSorter(true);		

		JButton btnAddAlbum = new JButton("Add New Album");	
		btnAddAlbum.addActionListener(e -> { // Add listener to the button.

			JComboBox<String> comboAlbumArtists = new JComboBox<>();
			for (AlbumArtist albArt: albumArtists) {
				comboAlbumArtists.addItem(albArt.getName());
			}

			// Add existing genres.
			JComboBox<String> comboGenres = new JComboBox<>();
			for (String genre: genres) {
				comboGenres.addItem(genre);
			}

			JTextField tfAlbName = new JTextField();
			int curYear = LocalDate.now().getYear();
			JSpinner spinnerAlbYear = new JSpinner(new SpinnerNumberModel(curYear, 1900, curYear, 1));
			JTextField tfSongTitle = new JTextField();
			JTextField tfSongArtist = new JTextField();

			JPanel pnl = new JPanel(new GridLayout(7, 2, 5, 5));
			pnl.add(new JLabel("Select album artist:"));
			pnl.add(comboAlbumArtists);
			pnl.add(new JLabel("Select genre:"));
			pnl.add(comboGenres);
			pnl.add(new JLabel("Select year: "));
			pnl.add(spinnerAlbYear);
			pnl.add(new JLabel("Enter album name: "));
			pnl.add(tfAlbName);
			pnl.add(new JLabel("Enter song title: "));
			pnl.add(tfSongTitle);
			pnl.add(new JLabel("Enter song artist:"));
			pnl.add(tfSongArtist);

			JOptionPane.showMessageDialog(this, pnl, "Add New Album/Song", JOptionPane.INFORMATION_MESSAGE); // This line of code shows jdialog window to allow
			// the user adding new album (or song into existing album).

			int albArtIndex = comboAlbumArtists.getSelectedIndex();
			if (albArtIndex < 0) {
				JOptionPane.showMessageDialog(this, "Album artist was not selected!", "Failed", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String genre = (String) comboGenres.getSelectedItem();
			if (genre.trim().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Genre was not selected!", "Failed", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String albName = tfAlbName.getText().trim();
			if (albName.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Album name was not entered!", "Failed", JOptionPane.ERROR_MESSAGE);
				return;
			}
			int year = (int) spinnerAlbYear.getValue();
			String songTitle = tfSongTitle.getText().trim();
			if (songTitle.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Song title was not entered!", "Failed", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String songArtist = tfSongArtist.getText().trim();
			if (songArtist.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Song artist was not entered!", "Failed", JOptionPane.ERROR_MESSAGE);
				return;
			}

			Album newAlbum = null;

			// First, check whether this album already exists.
			outer:for (AlbumArtist alArt: albumArtists) { // Loop through the album artist list.
				for (Album alb: alArt.getAlbumList()) { // Loop through the albums in album artist.
					if (alb.getName().equals(albName) && alb.getYear() == year) { // If name and year are equal, that
						// means album already exists and it needs to add only song.
						
						newAlbum = alb;
						break outer;
					}
				}
			}
			
			Song newSong = new Song(songTitle, songArtist, genre, 1); // So far, we have track number 1. If album
			// already exists, then it means we need to find last track number and +1 to avoid duplication.
			
			if (newAlbum == null) { // If not found among existing albums.
				newAlbum = new Album(albName, year, new Song[] {newSong});
				AlbumArtist albArt = albumArtists[albArtIndex];

				Album[] albList = new Album[albArt.getAlbumList().length + 1];
				System.arraycopy(albArt.getAlbumList(), 0, albList, 0, albArt.getAlbumList().length);
				albList[albList.length - 1] = newAlbum;
				albArt.setAlbumList(albList);
			} else { // If album already exists.
				
				// Define last track number and add 1 to assign next one.
				int lastTrackNum = newAlbum.getSongList()[newAlbum.getSongList().length - 1].getTrack();
				newSong.setTrack(lastTrackNum + 1);
				
				Song [] songList = new Song[newAlbum.getSongList().length + 1];

				System.arraycopy(newAlbum.getSongList(), 0, songList, 0, newAlbum.getSongList().length);
				songList[songList.length - 1] = newSong;
				newAlbum.setSongList(songList); // Set new song list (this is old song list with 1 new song).
			}


			updateTbl(albumArtists);
		});
		pnlMain.add(btnAddAlbum, BorderLayout.SOUTH);

		add(pnlMain);
	}

	// Updates album table.
	public void updateTbl(AlbumArtist albumArtists[]) {
		this.albumArtists = albumArtists;
		
		Collections.addAll(genres, genreArr);
		
		tblAlbumsMdl.setRowCount(0); // Clear table before update to avoid appending rows.
		for (AlbumArtist alArt: albumArtists) { // Loop through the album artist list.
			for (Album alb: alArt.getAlbumList()) { // Loop through the albums in album artist.
				for (Song song: alb.getSongList()) { // Loop through the songs.
					// Place data in order to match table columns
					tblAlbumsMdl.addRow(new String[] {song.getTrack() + "", song.getTitle(), 
							song.getArtist(), alb.getName(), alb.getYear() + "", 
							alArt.getName(), song.getGenre()});
					// If song has genre not already in list, add it
					if(!genres.contains(song.getGenre())) {
						genres.add(song.getGenre());
					}
				}
			}
		}
		// Sort genres
		Collections.sort(genres);
	}

}
