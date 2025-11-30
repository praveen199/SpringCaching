package com.spring.cache;

public interface BookRepository {
  Book getByIsbn(String isbn);
}
