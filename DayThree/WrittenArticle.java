public class WrittenArticle extends WrittenShow {
    private String article;                     //Stores the article

    //Construct a Article object
    public WrittenArticle (String ar, String t, String a) {
        super(t, a);                            //Use Superclass's constructor
        article = ar;                           //Store article
    }

    public void show() {
        super.show();                           //Use Superclass's show method
                                                //to show name and title
        System.out.println("================================================");
        System.out.println(article);
    }
}
