/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Library {
    
    
    
    // Add a book to the library
    public Book addBook(String name, int num_of_copy){
        Book book = new Book(name, num_of_copy,this);
        return book ; 
    }
    
    
    // Add a user to this library
    public User addUser(String name){
        User user = new User(name,this);
        return user ; 
    }
    
    // Check if this book is available
    public Boolean isAvailable(Book book){
        return true ; 
    }
    
    
    // return the list of books in the library
    public Book [] get_book_list(){
        return null ; 
    }
    
}
