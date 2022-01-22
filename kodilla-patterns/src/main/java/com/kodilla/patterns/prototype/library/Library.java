package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype <Library> {

    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Book> getBooks() {
        return books;
    }

  public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
  }

  public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            deepClonedLibrary.getBooks().add(book);
        }
        return deepClonedLibrary;
  }
    /*public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for (Book book : books) {
            deepClonedLibrary.getBooks().add(book);
        }
        return deepClonedLibrary;
    }*/
}
