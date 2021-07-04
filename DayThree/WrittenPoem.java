public class WrittenPoem extends WrittenShow {
    private String poem;

    public WrittenPoem (String p, String t, String a) {
        super(t, a);
        poem = p;
    }

    public void show() {
        super.show();
        System.out.println("================================================");
        System.out.println(poem);
    }
}
