//package io.github.soydivision.library;
//
//
//import io.github.soydivision.author.Author;
//import io.github.soydivision.book.Book;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@RestController
//@RequestMapping("/library")
//public class LibraryController {
//    @Autowired
//    private LibraryService libraryService;
//
//    @PostMapping("/authors")
//    public Author createAuthor(@RequestParam String name) {
//        return libraryService.createAuthor(name);
//    }
//
//    @PostMapping("/books")
//    public Book createBook(@RequestParam String title, @RequestParam Set<Long> authorIds) {
//        Set<Author> authors = new HashSet<>();
////        for (Long id : authorIds) {
////            authors.add(libraryService.getAuthorById(id));
////        }
//        return libraryService.createBook(title, authors);
//    }
//}
