abstract public class WrittenShow {
    private String title;
    private String author;

    public WrittenShow(String t, String a) {
        author = a; title = t;
    }

    public void show() {
        System.out.println(title + ", by " + author);
    }
}