import java.util.Stack;
class Test {
    public static void main(String[] args) {
        String s = "great for interview preparation";
        System.out.println("Original: " + s);

        Stack<String> st = new Stack<>();
        for (String word : s.split(" ")) {
            st.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!st.isEmpty()) {
            reversed.append(st.pop()).append(st.isEmpty() ? "" : " ");
        }

        System.out.println("Reversed: " + reversed);
    }
}
