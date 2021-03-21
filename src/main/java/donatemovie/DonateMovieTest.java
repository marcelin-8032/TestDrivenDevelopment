package donatemovie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonateMovieTest {

    private Library library;
    private Movie movie;

    @BeforeEach
    public void setUp() {
        library = new Library();
        movie = new Movie();
    }

    @Test
    public void movieAddedToCataloque() {
        library.donate(movie);
        Assertions.assertTrue(library.isContains(movie));
    }


    @Test
    public void rentalCopyAdded() {
        library.donate(movie);
        Assertions.assertEquals(1, movie.getCopies());
    }


}