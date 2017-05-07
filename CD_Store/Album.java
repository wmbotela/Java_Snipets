

class Album{
  public String mArtist;
  public int mReleaseYear;
  public String mGenre;
  public String mLabel;
  public String mproducer;

  public Album (String artist,int releaseYear,String genre,String label,String producer){
    mArtist = artist;
    mReleaseYear = releaseYear;
    mGenre = genre;
    mLabel = label;
    mproducer = producer;
  }

  public boolean artist(String artist){
    return(artist.equals(artist));
  }

}
