package woo;

public class Film extends Product{
    private String _title;
    private String _author;
    private String _IMBD;

    /**
    * @param keyProd,keySupp,price,valCrit,title,author,IMBD
    */
    public Film(String keyProd, String keySupp, int price, int valCrit, String title,String author,String IMBD){
        super(keyProd, keySupp, price, valCrit);

        super.setN(3);
        _title = title;
        _author = author;
        _IMBD = IMBD;
    }

    /**
    * @param keyProd,keySupp,price,valCrit,title,author,IMBD,stock
    */
    public Film(String keyProd, String keySupp, int price, int valCrit, String title,String author,String IMBD,int stock){
        this(keyProd, keySupp, price, valCrit, title, author,IMBD);
        super.setStock(stock);
    }

    /**
    * @return the title of the book
    */
    public String getTitle(){
        return _title;
    }

    /**
    * @return the author of the book
    */
    public String getAuthor(){
        return _author;
    }

    /**
    * @return the IMBD of the book
    */
    public String getIMBD(){
        return _IMBD;
    }

    /**
    * @param title
    */
    public void setTitle(String title){
        _title = title;
    }

    /**
    * @param author
    */
    public void setAuthor(String author){
        _author = author;
    }

    /**
    * @param IMBD
    */
    public void setIMBD(String IMBD){
        _IMBD = IMBD;
    }

    @Override
    @SuppressWarnings("nls")
    /**
    * @return the string format of the book
    */
    public String toString(){
        String str = String.format("FILM");
        String str1 = String.format("%s|%s|%s",_title,_author,_IMBD);
        return str + super.toString() + str1;
    }
}