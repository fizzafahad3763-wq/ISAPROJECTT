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
public class ItemTest {
    
    public ItemTest() {
    }
    
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

    /**
     * Test of getTitle method, of class Item.
     */
    @Test
    public void testGetTitle() {
        System.out.println("This is the getTitle test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String pred_outcome = "Le Symbole Perdu";
        String real_outcome = info.getTitle();
        assertEquals(pred_outcome, real_outcome);
    }

    @Test
    public void testSetTitle() {
        System.out.println("This is the setTitle test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String new_title = "Java101";
        info.setTitle(new_title);
        assertEquals(new_title, info.getTitle());
    }

    @Test
    public void testGetLanguage() {
        System.out.println("This is the getLanguage test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String pred_outcome = "French";
        String real_outcome = info.getLanguage();
        assertEquals(pred_outcome, real_outcome);
    }

    @Test
    public void testSetLanguage() {
        System.out.println("This is the setLanguage test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        String new_language = "English";
        info.setLanguage(new_language); 
        assertEquals(new_language, info.getLanguage());
    }

    @Test
    public void testGetDonator() {
        System.out.println("This is the getDonator test.");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        Member real_outcome = info.getDonator(); 
        assertEquals(member, real_outcome);
    }

    @Test
    public void testClearDonator() {
        System.out.println("clearDonator");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        info.clearDonator();
        assertNull(info.getDonator()); 
    }

    @Test
    public void testLoanTo() {
        System.out.println("This is the loanTo test");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Member borrower = new Member("Amy Smigh", "74 Main Street, Hertford, SG13 7AB", "a.smith@yahoo.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        info.loanTo(borrower);
        assertFalse(info.isAvailable()); 
    }

    @Test
    public void testIsAvailable() {
        System.out.println("This is the isAvailable test");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        boolean result = info.isAvailable();
        assertTrue(result); 
    }

    @Test
    public void testReturnLoan() {
        System.out.println("This is the returnLoan test");
        Member member = new Member("John Wong", "1 Church Lane Hatfield, AL10 OAG", "wong.j@aol.com", 3);
        Member borrower = new Member("Amy Smigh", "74 Main Street, Hertford, SG13 7AB", "a.smith@yahoo.com", 3);
        Book info = new Book("Le Symbole Perdu", "Dan Brown", member, "9782709636346", "French");
        info.loanTo(borrower);
        info.returnLoan();
        assertTrue(info.isAvailable()); 
    }

    public class ItemImpl extends Item {
        public ItemImpl() {
            super("", "", null);
        }
    }
}