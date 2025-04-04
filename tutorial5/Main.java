public class Main {
    public static void main(String[] args) {

        MusicLibrary myLibrary = new MusicLibrary("AFRO", "HENRY LEWIS");

        myLibrary.addTrack("Scotts Maphuma - Shayi'Moto ");
        myLibrary.addTrack("JOE DWET FILE - 4 Kampe");
        myLibrary.addTrack("ASAKE - WHY LOVE");
        myLibrary.addTrack("ASAKE - MMS");
        myLibrary.addTrack("Rema- Baby");

        myLibrary.displayTracks();

        myLibrary.createPlaylist("Chill");
        myLibrary.createPlaylist("Party");
        myLibrary.createPlaylist("VIBES");

        myLibrary.addTrackToPlaylist("JOE DWET FILE - 4 Kampe", "Chill");
        myLibrary.addTrackToPlaylist("ASAKE - WHY LOVE", "Chill");
        myLibrary.addTrackToPlaylist("Rema- Baby", "Party");
        myLibrary.addTrackToPlaylist("Scotts Maphuma - Shayi'Moto ", "Party");
        myLibrary.addTrackToPlaylist("ASAKE - MMS", "VIBES");

        myLibrary.displayAllPlaylists();


        myLibrary.displayPlaylist("Chill");


        myLibrary.searchTracks("ASAKE");


        myLibrary.removeTrack("AC/DC - Back in Black");

        myLibrary.displayPlaylist("Party");


        System.out.println("Total number of tracks in the library: " + myLibrary.getTrackCount());
        System.out.println("Total number of playlists: " + myLibrary.getPlaylistCount());
    }
}
