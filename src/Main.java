public class Main
{
    public static void main(String[] args)
    {
        //Instantiation of Reference Class objects
        //Declaration = Initialization
        Song oldTownRoad = new Song("Old Town Road", "Lil Nas X", true, 136, 1.53);
        Song shutUp = new Song("Shut Up My Mom is Calling", "Hotel Ugly", true, 139, 2.45);
        Song goneAway = new Song("Gone Away", "The Offspring", true, 111, 4.30);
        Song blank = new Song();

        System.out.println(blank.toString());
        System.out.println("The length of Old Town Road is " + oldTownRoad.playTimeSeconds() + " seconds");

        /*
        System.out.println("First, Shut up has a tempo of " + shutUp.getTempo());
        shutUp.setTempo(200);
        System.out.println("After update, Shut up has a tempo of " + shutUp.getTempo());
        */

        System.out.print("The first title is " + oldTownRoad.getTitle());
        //System.out.println(" and is performed by " + oldTownRoad.getArtist());

        System.out.println("I have" + Song.getNumSongs());
        System.out.println(oldTownRoad.toString()); //use Java 7 version - toString()
        System.out.println("\n" + shutUp.toString());
        System.out.println("\n" + goneAway.toString());


    }
}
