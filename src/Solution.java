import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        int X = 10;
        int Y = 101;
        int D = 30;
        System.out.println(solution.solution3(X,Y,D));
    }


    public int solution(int X, int Y, int D) {
        if (X == Y)
            return 0;
        double absDistance = Y - X;
        double steps = absDistance / D;
        return (int)ceil(steps);
    }

    public int solution2(int X, int Y, int D) {
        if (X == Y)
            return 0;
        return (int)ceil((Y - X) / (double)D);
    }

    public int solution3(int X, int Y, int D) {
        int distance = Y - X;
        int steps = distance / D;
        if (distance % D > 0)
            steps++;
        return steps;
    }
}
