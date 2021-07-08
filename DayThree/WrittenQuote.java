public class WrittenQuote extends WrittenShow {
    private String quote;                   //Stores the quote

    //Construct a Quote object
    public WrittenQuote (String q, String t, String a) {
        super(t, a);                        //Use Superclass's constructor
        quote = q;                          //Store quote
    }

    //Print quote using overriden show method
    public void show() {
        System.out.println(quote);
        System.out.println("================================================");
        System.out.print("Qouted from ");
        super.show();                       //Use Superclass's show method
                                            //to show name and title
    }
}
