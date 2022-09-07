public class Film {
    private String title;
    private String production;
    private String rating;
    Film(String title, String production, String rating) {
        this.production = production;
        this.rating = rating;
        this.title = title;
    }
    Film(String title, String production) {
        this.title = title;
        this.production = production;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }
}
