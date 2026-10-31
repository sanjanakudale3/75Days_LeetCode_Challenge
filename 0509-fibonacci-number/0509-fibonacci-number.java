class Solution {
    public int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive relation
        return fib(n - 1) + fib(n - 2);
    }
}





