public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        return grades[grades.length - 1];
    }

    public int average() {
        int sumUp = 0;
        for (int i = 0; i < grades.length; i++) {
            sumUp = sumUp + grades[i];
        }
        return sumUp / grades.length;
    }

    public void print(String[] args) {
        lastGrade();
        average();
    }

}