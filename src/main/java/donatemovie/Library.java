package donatemovie;

import java.util.ArrayList;
import java.util.Collection;

public class Library {


    private Collection<Movie> cataloque = new ArrayList<>();

    public Collection<Movie> getCatalogue() {
        return cataloque;
    }

    public void donate(Movie movie) {
        cataloque.add(movie);
        movie.addCopy();
    }

    boolean isContains(Movie movie) {
        return cataloque.contains(movie);
    }

}
