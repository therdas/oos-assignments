public class WrittenPoem extends WrittenShow {
    private String poem;                   //Stores the poem

    public WrittenPoem (String p, String t, String a) {
        super(t, a);                        //Use Superclass's constructor
        poem = p;                           //Store poem
    }

    //Print quote using overriden show method
    public void show() {
        super.show();                       //Use Superclass's show method
                                            //To show name and title
        System.out.println("================================================");
        System.out.println(poem);
    }
}
