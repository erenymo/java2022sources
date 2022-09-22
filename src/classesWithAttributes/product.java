package classesWithAttributes;

public class product {

    public product(int id, String name, String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı"); // parametreli kullanım.
        this.id =id;
        this.name =name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk =renk;
    }

    public product(){ // parametresiz kullanım

    }
    // overloading, aynı methoda ait parametreli ve parametresiz kullanım.

    
    // ürüne ait bilgiler tutulmuştur.
    // attribute | field denir
    private int id;
    private String name, description;
    private double price;
    private int stockAmount;
    private String renk;

    private String code; // private sadece bulunduğu süslü parantezde geçerli demektir.

    // getter
    public int getId() { // private olanları başka sekmelerde okumak için kullanılır.
        return id;
    }

    // setter
    public void setId(int id) {
        this.id = id; // this.id demek bu classtaki id demektir. parametrenin içindeki id ise sağdaki
                      // id'dir.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }

}