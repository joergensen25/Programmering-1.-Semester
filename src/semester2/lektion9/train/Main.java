package semester2.lektion9.train;

public class Main {
    public static void main(String[] args) {
        LinkedListTrain list = new LinkedListTrain();
        list.addFirst(new WagonNode("Kunder"));

        System.out.println(list);
    }
}
