package music;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Track> pl = new ArrayList<>();

    //Methoden der klassischen ArrayList umschreiben
    public void addTrack(Track track){
        pl.add(track);
    }

    public int getNumberofTracks(){
        return pl.size();
    }
    public void listAllTracks(){
        for(Track t : pl){
            System.out.println(t);
        }
    }
    public void listTrack(int i){
        
    }

    public void removeTrack(int index){
        pl.remove(index);
    }
}
