package SongPlayer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


public class MP {

    public static void main(String[] args) {
        Data data = new Data();
        AddData ad = new AddData();
        ad.add_data(data);
        ad.play_data(data);
        Tops tp = new Tops();
        tp.topxsongs(data,10);
        tp.bottomxsongs(data,10);
        tp.topxsongbyArtist(data,"Shreya Ghoshal",10);
        tp.topxsongbydate(data,new Dateedit("03-01-25"),10);

//        Data data = new Data();
//        data.add_Song("Artist1", "Song1");
//        data.add_Song("Artist2", "Song2");
//        Dateedit date1 = new Dateedit("15-01-25");
//        Dateedit date2 = new Dateedit("16-01-25");
//        Tops tp = new Tops();
//        data.playbysong("Song1",date1);
//        data.playbysong("Song1", date1);
//        data.playbysong("Song2", date2);
//
//        tp.topxsongbydate(data, new Dateedit("15-01-25"), 3); // Should print Song1 as top song

    }


}
