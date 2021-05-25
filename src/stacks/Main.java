package stacks;

public class Main {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("a");
        names.push("b");
        names.push("c");
        names.push("d");

        while (!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
