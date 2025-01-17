package SongPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Tops {


    void topxsongs(Data list, int value){
        System.out.println("###############################################\n");
        Map<Integer,String> globaltops = new TreeMap<>((a, b) -> b - a);
        for(Song song : list.music){
            globaltops.put(song.total, song.getsong());
        }

        System.out.println("Top "+value+" songs are: ");
        int count = 0;
        for (Map.Entry<Integer, String> entry : globaltops.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
            count++;
            if (count == value) {
                break;
            }
        }
        System.out.println("###############################################\n");
    }

    void topxsongbyArtist(Data list,String artist, int value){
        System.out.println("###############################################\n");
        Map<Integer,String> tops = new TreeMap<>((a, b) -> b - a);
        for(Song song : list.search_artist(artist)){
            tops.put(song.total, song.getsong());
        }
        System.out.println("Top "+value+" songs by"+artist +"are: ");
        int count = 0;
        for (Map.Entry<Integer, String> entry : tops.entrySet()) {
            System.out.println(entry.getValue() + " "+ entry.getKey());
            count++;
            if (count == value) {
                break;
            }
        }
        System.out.println("###############################################\n");
    }

    void topxsongbydate(Data list,Dateedit date, int value){
        System.out.println("###############################################\n");
        Map<Integer, List<String>> tops = new TreeMap<>((a, b) -> b - a);

        Dateedit currdate = date;
        for(Song song : list.music){
            if (song.play.containsKey(currdate)) {
                int count = song.play.get(currdate);
                tops.putIfAbsent(count, new ArrayList<>());
                tops.get(count).add(song.getsong());
            }

        }
        System.out.println("Top "+value+" songs played on "+date +" are: ");
        int count = 0;
        for (Map.Entry<Integer, List<String>> entry : tops.entrySet()) {
            for (String songName : entry.getValue()) {
                System.out.println(songName);
                count++;
                if (count == value) {
                    return;
                }
            }
        }
        System.out.println("###############################################\n");
    }


    void bottomxsongs(Data list, int value){
        System.out.println("###############################################\n");
        Map<Integer,String> globalbottoms =  new TreeMap<>();
        for(Song song : list.music){
            globalbottoms.put(song.total, song.getsong());
        }
        System.out.println("Bottom "+value+" songs are: ");
        int count = 0;
        for (Map.Entry<Integer, String> entry : globalbottoms.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
            count++;
            if (count == value) {
                break;
            }
        }
        System.out.println("###############################################\n");
    }

}
