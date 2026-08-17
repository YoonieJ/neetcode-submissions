class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> numChecker = new HashMap<>();

        // row check
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((Character) board[i][j] == '.') {
                    continue;
                } else if (numChecker.get((Character) board[i][j]) == null) {
                    numChecker.put((Character) board[i][j], 1);
                } else {
                    return false;
                }
            }
            numChecker.clear();
        }

        // column check
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((Character) board[j][i] == '.') {
                    continue;
                } else if (numChecker.get((Character) board[j][i]) == null) {
                    numChecker.put((Character) board[j][i], 1);
                } else {
                    return false;
                }
            }
            numChecker.clear();
        }

        // box check
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
                numChecker.clear();

                for (int i = rowStart; i < rowStart + 3; i++) {
                    for (int j = colStart; j < colStart + 3; j++) {
                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (numChecker.containsKey(board[i][j])) {
                            return false;
                        }

                        numChecker.put(board[i][j], 1);
                    }
                }
            }
        }

        return true;
    }
}
