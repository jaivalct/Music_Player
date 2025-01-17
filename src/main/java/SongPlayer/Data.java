package SongPlayer;
// implements adding song and searching song and playing song

import java.util.ArrayList;
import java.util.Random;

class Data{
    public ArrayList<Song> music = new ArrayList<Song>();

    void add_Song(String Artist_Name, String Song_Name){
        Song s = new Song(Artist_Name,Song_Name);
//        System.out.println("Adding "+ s.getsong());
        music.add(s);
    }

    // Returns object of song class which is sung by artist
    ArrayList<Song> search_artist(String artist){
        ArrayList<Song> findings = new ArrayList<Song>();
        for(var i:music ){
            if(i.getartist().equals(artist)){
                findings.add(i);
            }
        }
        return findings;
    }

    // Returns object of song class who have sung the song
    ArrayList<Song> search_song(String song) {
        ArrayList<Song> findings = new ArrayList<Song>();
        for (var i : music) {
            if (i.getsong().equals(song)) {
                findings.add(i);
            }
        }
        return findings;
    }

   // Play a random song if more than 1 song exists with same name
    void playbysong(String song_name, Dateedit date){
        ArrayList<Song> titles = search_song(song_name);
        Random random = new Random();
        int randomIndex = random.nextInt(titles.size());
        Song randomSong = titles.get(randomIndex);
        randomSong.song_played(date);
//        System.out.println("Playing "+randomSong.getsong()+"by artist" + randomSong.getartist() + "on: "+ date);
    }

    // Play a random song if more than 1 song exists with same artist
    void playbyartist(String artist_name, Dateedit date){
        ArrayList<Song> titles = search_artist(artist_name);
        Random random = new Random();
        int randomIndex = random.nextInt(titles.size());
        Song randomSong = titles.get(randomIndex);
        randomSong.song_played(date);
    }
}

