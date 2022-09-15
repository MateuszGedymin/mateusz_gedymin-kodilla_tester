public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else
            System.out.println("This notebook is expensive.");
    }
    public void checkWeight(){
        if (this.weight < 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1000) {
            System.out.println("The weight is good.");
        } else
            System.out.println("This notebook is heavy.");
    }
    public void checkYear(){
        if (this.year < 2021) {
            System.out.println("This notebook is old.");
        } else
            System.out.println("This notebook is new.");
    }
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2001);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2022);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
}
