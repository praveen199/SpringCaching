package com.spring.cache.book;

public interface BookRepository {
  Book getByIsbn(String isbn);
}
