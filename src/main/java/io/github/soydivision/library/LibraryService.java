//package io.github.soydivision.library;
//
//import io.github.soydivision.author.Author;
//import io.github.soydivision.author.AuthorRepository;
//import io.github.soydivision.book.Book;
//import io.github.soydivision.book.BooksRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
//@Service
//public class LibraryService {
//    @Autowired
//    private AuthorRepository authorRepository;
//
//    @Autowired
//    private BooksRepository booksRepository;
//
//    public Author createAuthor(String name) {
//        Author author = new Author(name);
//        return authorRepository.save(author);
//    }
//
//    public Book createBook(String title, Set<Author> authors) {
//        Book book = new Book(title);
//        book.setAuthors(authors);
//        for (Author author : authors) {
//            author.getBooks().add(book);
//        }
//        authorRepository.saveAll(authors);
//        return booksRepository.save(book);
//    }
//}
//
