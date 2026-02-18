public class Recursion11 {

    public static int countPaths(int i, int j, int n, int m) {

        // Boundary condition (grid ke bahar chale gaye)
        if (i == n || j == m) {
            return 0;
        }

        // Destination reached
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move down
        int downPaths = countPaths(i + 1, j, n, m);

        // Move right
        int rightPaths = countPaths(i, j + 1, n, m);

        // Total paths = sum (NOT multiply)
        return downPaths + rightPaths;
    }

    public static void main(String args[]) {

        int n = 3;
        int m = 3;

        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total Paths: " + totalPaths);
    }
}
