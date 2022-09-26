package petlaZWykorzystaniemOpiektow;

public class User {
    private String name;
    public int age;

    public double[] User;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User mariusz = new User("Mariusz", 12);
        User adam = new User("Adam", 15);
        User krzysztof = new User("Krzysztof", 19);
        User jacek = new User("Jacek", 25);
        User michal = new User("Michal", 30);
        User pawel = new User("Pawel", 50);
        User[] users =  {mariusz, adam, krzysztof, jacek, michal, pawel};

        int total = 0;
        int ave = 0;
        int usersAbove;
        for (int i = 0; i < users.length; i++) {
            total = total + users[i].getAge();
        }
        ave = total / users.length;
        System.out.println("wiek wszystkich " + total);
        //System.out.println(ave);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age > ave){
                System.out.println(users[i].name);
            }
        }

    }
    }