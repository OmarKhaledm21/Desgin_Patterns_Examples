public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed=1;

    public Song(String songName,String artist){
        this.songName = songName;
        this.artist = artist;
        setPlaybackSpeed(this.speed);
    }

    @Override
    public void play() {
        System.out.println("Song "+songName+" is playing!");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed=speed;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getName() {
        return songName;
    }

    public String getArtist(){
        return artist;
    }
}
