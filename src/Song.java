public class Song
{
    //Class or Instance variables
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;
    private static int numSongs;

    //Constructors

    public Song(String title, String artist, boolean hasChorus, int tempo, double playTime)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = playTime;
        numSongs++;
    }//end full constructor

    public Song()
    {
        //title = ""; //empty string, mostly used as a default value
        title = "poopy";
        artist = "pooper"; //String types can be null or empty
        hasChorus = false; //Typical default for a boolean type
        tempo = 0; //typical default for a number type
        playTime = 0.0;
        numSongs++;
    }//end default constructor
    // usually used to test things without ruining initial values

    //Getter = allow the client to access instance variables
    public String getTitle()
    {
        return title;
    }//end title getter

    public String getArtist()
    {
        return artist;
    }//end artist getter

    public int getTempo()
    {
        return tempo;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }


    //Setters change a value

    public void setTempo(int myTempo)
    {
        tempo = myTempo;
    }

    //Brain Methods
    //Convert the playTime into seconds
    public int playTimeSeconds()
    {
        int something = (int) (playTime % 1) * 100;
        int seconds = (int)(60 * (playTime/1)) + something;

        return seconds;
    }

    //ToString

    public String toString()
    {
        String output = "Title: " + title +
                        "\nArtist: " + artist +
                        "\nHas a Chorus: " + hasChorus +
                        "\nTempo: " + tempo +
                        "\nPlay Time: " + playTime;
        return output;
    }

}//end Song Class

/*







 */