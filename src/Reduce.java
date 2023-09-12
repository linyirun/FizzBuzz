public class Reduce {
    public static void main(String[] args) {
        int curr_num = 100;
        int count_iterations = 0;
        while (curr_num != 0) {
            count_iterations++;
            if (curr_num % 2 == 1) {
                curr_num--;
            } else curr_num /= 2;
        }
        System.out.println(count_iterations);
    }
}
