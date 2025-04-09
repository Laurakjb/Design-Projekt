package model;
import java.util.ArrayList;

/**
 * Lav en beskrivelse af klassen LP her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class LP
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler

    private String artist;
    private String title;
    private int barcode;
    private String publicationDate;
    private ArrayList<Copy> copies;
    

    /**
     * Konstruktør for objekter af klassen LP
     */
    public LP(String artist, String title, int barcode, String publicationDate)
    {
        this.artist = artist;
        this.title = title;
        this.barcode = barcode;
        this.publicationDate = publicationDate;
        this.copies = new ArrayList <Copy>();


    }
    
    public boolean addCopy (Copy copy) {
        return copies.add(copy);
    }
    
    public Copy findCopyBySerialNumber (int serialNumber) {
        for (Copy copy : copies) {
            if (copy.getSerialNumber() ==serialNumber) {
                return copy;
            }
        }
        return null;
    }
    
    public String getArtist(){
        return artist;
    }
    public String getTitle(){
        return title;
    }
    public int getBarcode(){
        return barcode;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public ArrayList<Copy> getCopies() {
        return copies;
    }
}