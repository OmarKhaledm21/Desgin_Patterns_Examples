import java.util.ArrayList;

public class Playlist implements IComponent{
    public ArrayList<IComponent> playlist;
    public String playlistName;

    public Playlist(String playlistName){
        playlist = new ArrayList<>();
        this.playlistName=playlistName;
    }


    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent com: playlist) {
            com.setPlaybackSpeed(speed);
        }
    }

    @Override
    public void play() {
        for(IComponent com : playlist){
            com.play();
        }
    }
    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }
}
