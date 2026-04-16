/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package isa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saniafarooq
 */
public class BookTest {
    
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}


    @Test
    public void testGetAuthor() {
        System.out.println("This is the getAuthor test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "French", "9782709636346");
        String pred_outcome = "Dan Brown";
        String real_outcome = info.getAuthor();
        assertEquals(pred_outcome, real_outcome);
    }


    @Test
    public void testSetAuthor() {
        System.out.println("This is the setAuthor testing.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "French", "9782709636346");
        String new_author = "Sally Bob";
        info.setAuthor(new_author);
        assertEquals(new_author, info.getAuthor());
    }


    @Test
    public void testGetIsbn() {
        System.out.println("This is the getIsbn test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String pred_outcome = "9782709636346";
        String real_outcome = info.getIsbn();
        assertEquals(pred_outcome, real_outcome);
    }

    @Test
    public void testSetIsbn() {
        System.out.println("This is the setIsbn testing.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "French", "9782709636346");
        String new_ISBN = "1234567891234";
        info.setIsbn(new_ISBN);
        assertEquals(new_ISBN, info.getIsbn());
    }


   @Test
    public void testToString() {
        System.out.println("This is the toString testing.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String pred_outcome = "Book(Title: Le Symbole Perdu, Author: Dan Brown, ISBN: 9782709636346, Language: French)";
        String real_outcome = info.toString();
        assertEquals(pred_outcome, real_outcome);
    }
}