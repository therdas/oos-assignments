public class WrittenArticle extends WrittenShow {
    private String article;

    public WrittenArticle (String ar, String t, String a) {
        super(t, a);
        article = ar;
    }

    public void show() {
        super.show();
        System.out.println("================================================");
        System.out.println(article);
    }
}
