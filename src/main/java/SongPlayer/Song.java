package SongPlayer;
import java.util.*;

class Song {
    private String Artist_Name;
    private String Song_Name;
    // maintains the count of song played on each date
    Map<Dateedit,Integer> play = new HashMap<Dateedit,Integer>();
    int total = 0;
    Song(String Artist_Name,String Song_Name) {
        this.Artist_Name = Artist_Name;
        this.Song_Name = Song_Name;
    }

    String getartist(){
        return Artist_Name;
    }

    String getsong(){
        return Song_Name;
    }

    // Updates date with no of times song played.
    void song_played(Dateedit date){
        play.put(date, play.getOrDefault(date, 0)+1);
        total++;
    }
}


