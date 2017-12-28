package net.ameizi.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import net.ameizi.model.Author;
import net.ameizi.model.Book;
import net.ameizi.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {

    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}
