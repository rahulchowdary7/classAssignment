package com.example;

class Book{
    private String title;
    private String author;
    private int copies;


    static int count;


    public Book(String title,String author,int copies){
        this.title=title;
        this.author=author;
        this.copies=copies;
        count++;


    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public void setCopies(int copies) {
        this.copies = copies;
    }
    
    


    
   
    
}


 


