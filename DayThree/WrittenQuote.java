public class WrittenQuote extends WrittenShow {
    private String quote;

    public WrittenQuote (String q, String t, String a) {
        super(t, a);
        quote = q;
    }

    public void show() {
        System.out.println(quote);
        System.out.println("================================================");
        System.out.print("Qouted from ");
        super.show();
    }
}
