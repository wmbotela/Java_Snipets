import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args) {
    Console myConsole = System.console();

      Album marshallMathersLp = new Album("Eminem",2000,"Hip hop","Aftermath","Dr Dre");
      Album chronic2001 = new Album("Dr Dre",1999,"Hip hop","Aftermath","Dr Dre");
      Album doggystyle = new Album("Snoop Dogg",1993,"Hip hop","Deathrow","Dr Dre");

      List<Album>allAlbums = new ArrayList<Album>();
        allAlbums.add (marshallMathersLp);
        allAlbums.add (chronic2001);
        allAlbums.add (doggystyle);

      boolean programRunning = true;

      while (programRunning){
      System.out.println("Welcome to Mwas music shop, What are you looking for?: All Albums or Artist or Exit");

      String customersChoice = myConsole.readLine();

      if (customersChoice.equals("All Albums")){
        for (Album indvidualAlbum : allAlbums){

          System.out.println("---------------------------");
          System.out.println("indvidualAlbum.mArtist");
          System.out.println("indvidualAlbum.mReleaseYear");
          System.out.println("indvidualAlbum.mGenre");
          System.out.println("indvidualAlbum.mLabel");
          System.out.println("indvidualAlbum.mproducer");
        }

      }else if(customersChoice.equals("Artist")){
        System.out.println("The Artists available in our store");
        for (Album indvidualAlbum : allAlbums){
          if (indvidualAlbum.artist(customersChoice)){
            System.out.println("---------------------------");
            System.out.println("indvidualAlbum.mArtist");

          }
      }
    }else if (customersChoice.equals("Exit")){
        programRunning = false;
      }else {
      System.out.println("I'm sorry, we don't recognize your input");
  }
}
}
}
