import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Initialize the row with 1s. 
        // For a given rowIndex, there are rowIndex + 1 elements.
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }
        
        // Build the triangle row by row up to rowIndex
        for (int i = 2; i <= rowIndex; i++) {
            // Update elements from right to left to prevent overwriting needed data
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}