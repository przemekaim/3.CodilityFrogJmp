import static java.lang.Math.*;

public class Solution {
    public static void main(String[] args) {
        var solution = new Solution();
        int X = 10;
        int Y = 100;
        int D = 30;
        System.out.println(solution.solution(X,Y,D));
    }


    public int solution(int X, int Y, int D) {
        if (X == Y)
            return 0;
        int absDistance = Y - X;
        double steps = (double)absDistance / (double)D;
        return (int)ceil(steps);
    }

    public int solution2(int X, int Y, int D) {
        if (X == Y)
            return 0;
        return (int)ceil((Y - X) / (double)D);
    }
}
