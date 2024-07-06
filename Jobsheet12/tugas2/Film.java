package tugas2;

public class Film {
    int id;
    String title;
    double rating;
    Film prev, next;

    public Film(int id, String title, double rating) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
