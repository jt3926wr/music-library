package musiclibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDate;
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

	private DefaultTableModel tblAlbumsMdl = new DefaultTableModel(new String[] {"Album Artist", "Album Name",
			"Year", "Track Number", "Song Title", "Song Artist", "Genre"}, 0);

	private AlbumArtist albumArtists[];

	// Stores all possible genres.
	private Set<String> genres = new HashSet<>();

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

			
