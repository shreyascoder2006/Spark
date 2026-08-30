class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;

        while (target > 1 && maxDoubles > 0) {

            // If target is odd, make it even
            if (target % 2 == 1) {
                target--;
                moves++;
            }

            // Divide by 2 (reverse of doubling)
            target /= 2;
            maxDoubles--;
            moves++;
        }

        // No doubles left -> all remaining moves are -1
        return moves + target - 1;
    }
}