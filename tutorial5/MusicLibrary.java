import java.util.ArrayList;

public class MusicLibrary {
    private String collectionName;
    private String owner;
    private ArrayList<String> tracks;
    private ArrayList<Playlist> playlists;

    public MusicLibrary(String

                                collectionName, String owner) {
        this.collectionName = collectionName;
        this.owner = owner;
        this.tracks = new ArrayList<>();
        this.playlists = new ArrayList<>();
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(String track) {
        tracks.remove(track);
        for (Playlist playlist : playlists) {
            playlist.removeTrack(track);
        }
    }

    public void displayTracks() {

        System.out.println("Music Library: " + collectionName);
        for (String track : tracks) {
            System.out.println(" - " + track);
        }
    }

    public void createPlaylist(String playlistName) {
        if (findPlaylist(playlistName) == null) {
            playlists.add(new Playlist(playlistName));
        }
    }

    private Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(playlistName)) {
                return playlist;

            }
        }
        return null;
    }

    public void addTrackToPlaylist(String track, String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist != null && tracks.contains(track)) {
            playlist.addTrack(track);
        }
    }

    public void displayPlaylist(String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist != null) {
            playlist.displayTracks();

        }
    }

    public void displayAllPlaylists() {
        System.out.println("All Playlists:");
        for (Playlist playlist : playlists) {
            System.out.println(" - " + playlist.getName());
        }
    }

    public void searchTracks(String phrase) {
        System.out.println("Tracks matching: " + phrase);
        for (String track : tracks) {
            if (track.contains(phrase)) {
                System.out.println(" - " + track);
            }
        }
    }

    public int getTrackCount() {
        return tracks.size();
    }

    public int getPlaylistCount() {
        return playlists.size();
    }
}
