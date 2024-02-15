public class Main {


    public static void main(String[] args) {
        Book lotr = new Book("Lord of the Rings", "J.R.R. Tolkien", 12.95);
        Book bc = new Book("Black Clover", "Yuki Tabata", 19.99);
        Book ender = new Book("Ender's Game", "Orson Scott Card", 14.95);
        Book revenant = new Book("The Revenant", "Michael Punke", 7.95);

        AList booklist = new AList(4);
        booklist.listAdd(lotr);
        booklist.listAdd(bc);
        booklist.listAdd(ender);
        System.out.println(booklist.toString());
        //booklist.listRemove(1);
        //booklist.listRemove(0);

        SLList sllist = new SLList();
        sllist.listAdd(lotr);
        sllist.listAdd(bc);
        sllist.listAdd(ender);
        sllist.listAdd(revenant);
        System.out.println(sllist.toString());

        DLList dllist = new DLList();
        dllist.listAdd(lotr);
        dllist.listAdd(bc);
        dllist.listAdd(ender);
        dllist.listAdd(revenant);
        System.out.println(sllist.toString());

        // GENERICS (There is no to string function here, for the generic typing
        // I am unsure what data the inserted type will have.

        AListGeneric booklistG = new AListGeneric<Book>(4);
        booklistG.listAdd(lotr);
        booklistG.listAdd(bc);
        booklistG.listAdd(ender);

        SLListG sllistG = new SLListG();
        sllistG.listAdd(lotr);
        sllistG.listAdd(bc);
        sllistG.listAdd(ender);
        sllistG.listAdd(revenant);


        DLListG dllistG = new DLListG();
        dllistG.listAdd(lotr);
        dllistG.listAdd(bc);
        dllistG.listAdd(ender);
        dllistG.listAdd(revenant);

    }
}