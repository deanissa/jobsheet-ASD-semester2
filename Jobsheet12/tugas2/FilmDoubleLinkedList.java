package tugas2;

public class FilmDoubleLinkedList {
    Film head, tail;
    int size;
    public FilmDoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int id, String title, double rating) {
        Film newFilm = new Film(id, title, rating);
        if (isEmpty()) {
            tail = newFilm;
        } else {
            head.prev = newFilm;
            newFilm.next = head;
        }
        head = newFilm;
        size++;
    }

    public void addLast(int id, String title, double rating) {
        if (isEmpty()) {
            addFirst(id, title, rating);
        } else {
            Film newFilm = new Film(id, title, rating);
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
            size++;
        }
    }
    public void add(int id, String title, double rating, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks diluar batas.");
            return;
        }
        if (index == 0) {
            addFirst(id, title, rating);
        } else if (index == size) {
            addLast(id, title, rating);
        } else {
            Film current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Film newFilm = new Film(id, title, rating);
            newFilm.next = current.next;
            current.next.prev = newFilm;
            current.next = newFilm;
            newFilm.prev = current;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks diluar batas.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Film current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void sortDescending() {
        for (Film i = head; i != null; i = i.next) {
            for (Film j = head; j != null; j = j.next) {
                if (j.rating < i.rating) {
                    int tempId = j.id;
                    String tempTitle = j.title;
                    double tempRating = j.rating;
                    j.id = i.id;
                    j.title = i.title;
                    j.rating = i.rating;
                    i.id = tempId;
                    i.title = tempTitle;
                    i.rating = tempRating;
                }
            }
        }
    }

    public void displayFilms() {
        if (isEmpty()) {
            System.out.println("Cetak Data");
            return;
        }
        System.out.println("Daftar Film:");
        System.out.println("| ID  |          Judul         | Rating |");
        System.out.println("|-----|------------------------|--------|");
        Film current = head;
        while (current != null) {
            System.out.printf("| %-4d| %-23s| %.1f    |\n", current.id, current.title, current.rating);
            current = current.next;
        }
    }
    public Film searchFilm(int id) {
        Film current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}
