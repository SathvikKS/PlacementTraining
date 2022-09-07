public class FilmProgram {
    public static Film[] getPGRating(Film[] films) {
        int i = 0;
        Film[] PGRatedFilms = new Film[films.length];
        for (Film film: films) {
            if (film.getRating().contains("PG"))
                PGRatedFilms[i++] = film;
        }
        return PGRatedFilms;
    }

    public static void main(String[] args) {
        Film f1 = new Film("Valmai", "Zee Studios", "PG-13");
        Film f2 = new Film("KGF", "Hombale Films");
        Film f3 = new Film("Sonic", "N/A", "UA");

    }
}
