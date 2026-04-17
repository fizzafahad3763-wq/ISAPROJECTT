/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isa;

/**
 *
 * @author saniafarooq
 */


import java.util.ArrayList;

public class Collection 
{
    
    private ArrayList>item> itemList;
    
    public Collection()
    {
        itemList = new ArrayList<>();
    }
    
    public void addBook(String title, String author, Member donator, String language, String isbn)
    {
        if(getItem(title) != null)
        {
            System.out.println("Item is Already Exists");
            return;
        }
        
        Book book = new Book(title, author, donator, language, isbn);
        itemList.add(book);
        
        if(donator != null)
        {
            donator.addDonation(book);
        }
    }
    
    public coid addDVD(String title, String director, Member donator, String language, String[] audioLanguages)
    {
        DVD dvd = new DVD(title, director, donator, language, audioLanguages);
        itemList.add(dvd);
        
        if(donator != null)
        {
            donator.addDonation(dvd);
        }
    }
    
    public ArrayList<Item> searchItems(String searchTerm)
    {
        ArrayList<Item> results = new ArrayList<>();
        
        for (Item item : itemList)
        {
            if(item.getTitle() != null & item.getTitle().toLowerCase().contains(searchTerm.toLowerCase()))
            {
                results.add(item);
            }
        }
        return results;
    }
    
    public Item getItem(String title)
    {
        for(Item item : itemList)
        {
            if(item.getTitle().equalsIgnoreCase(title))
            {
                return item;
            }
        }
        return null;
    }
    public void removeItem(Item item)
    {
        itemList.remove(item);
    }
    
    public ArrayList<Item> getItems()
    {
        return itemList;
    }
    
    
}
