public class Application {

    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {
        Application person1 = new Application ("Adam", 40.5, 178);

        if (person1.name != null) {
            if (person1.age > 30 && person1.height > 160) {
                System.out.println("petlaZWykorzystaniemOpiektow.User is older than 30 and taller than 160cm");
            } else {
                System.out.println("petlaZWykorzystaniemOpiektow.User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}