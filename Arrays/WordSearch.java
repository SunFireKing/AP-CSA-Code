import java.util.ArrayList;
public class WordSearch {
   private int rows;
   private int cols;
   String[][] grid;
   ArrayList<String> wordList = new ArrayList<String>();
   public WordSearch() {
      rows = 10;
      cols = 10;
      grid = new String[rows][cols];
      fillBlanks();
      
   }
   public WordSearch(int r, int c) {
      rows = r;
      cols = c;
      grid = new String[rows][cols];
      fillBlanks();

      
   }
   public ArrayList<String> getWordList() {
        return wordList;
      }
   public boolean setWordDiagonally(int srow, int scol, String word, boolean reverse) {
        if (!checkDuplicate(word)) {
            if (srow < 0 || srow + word.length() > rows || scol < 0 || scol + word.length() > cols) {
                System.out.println("Invalid Word");
                return false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (!grid[srow + i][scol + i].equals("*") && !grid[srow + i][scol + i].equals(word.substring(i, i + 1))) {
                        System.out.println("Conflict with existing letters");
                        return false;
                    }
                }

                for (int i = 0; i < word.length(); i++) {
                    if (reverse) {
                        grid[srow + i][scol + i] = word.substring(word.length() - 1 - i, word.length() - i);
                    } else {
                        grid[srow + i][scol + i] = word.substring(i, i + 1);
                    }
                }

                wordList.add(word);
                return true;
            }
        }
        return false;
    }
    
   public boolean setWordHorizontally(int srow, int scol, String word, boolean reverse) {
      if (!(checkDuplicate(word))) {
         if (srow < 0 || srow >= rows || scol < 0 || scol + word.length() > cols ) {
            System.out.println("Invalid Word");
            return false;
         } else {
            //check against existing words in the gird to prevent overlap
             for (int i = 0; i < word.length(); i++) {
                    if (!(grid[srow][scol + i].equals("*")) && !(grid[srow][scol + i].equals(word.substring(i, i + 1)))) {
                        System.out.println("Conflicts with existing letters");
                        return false;
                    }
                }
                for (int i = 0; i < word.length(); i++) {
                    if (reverse) {
                        grid[srow][scol + 1] = word.substring(word.length() - 1 - i, word.length() - i);
                    } else {
                        grid[srow][scol + 1] = word.substring(i, i + 1);
                    }
            }
                wordList.add(word);
                return true;
               }
         } else {
         return false;
      }
   }
   
   
   public boolean setWordVertically(int srow, int scol, String word, boolean reverse) {
      if (!(checkDuplicate(word))) {
         if (scol < 0 || scol >= cols || srow < 0 || srow + word.length() > rows ) {
            System.out.println("Invalid Word");
            return false;
         } else {
            for (int i = 0; i < word.length(); i++) {
             if (!(grid[srow + i][scol].equals("*")) && !(grid[srow + i][scol].equals(word.substring(i, i + 1)))) {
                        System.out.println("Conflicts with existing word");
                        return false;
                    }
                }
                for (int i = 0; i < word.length(); i++) {
                    if (reverse) {
                        grid[srow + i][scol] = word.substring(word.length() - 1 - i, word.length() - i);
                    } else {
                        grid[srow + i][scol] = word.substring(i, i + 1);
                    }
            }
                wordList.add(word);
                return true;
               }
      } else {
         return false;
      }
      
   } 
   //fillblanks
   public void fillBlanks() {
      for (int i = 0; i < grid.length; i++) {
         for (int k = 0; k < grid[0].length; k++) {
            grid[i][k] = "";
            grid[i][k] += "*"; 
         } 
      }
   }
   //spacing for toString
   public String toString() {
      String result = "";
      for (String k[] : grid) {
         for (String j : k) {
            result += j + " ";
         }
         result += "\n";
      }
      return result;
   }
   
   //iterate through to check if a full column is blank
   public ArrayList<Integer> blankColumns() {
        ArrayList<Integer> blankCols = new ArrayList<Integer>();
        for (int i = 0; i < grid[0].length; i++) {
            int count = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j].equals("*")) {
                    count++;
                }
            }
            if (count == rows) {
               blankCols.add(i);
            }
        }
        return blankCols;
    }
   //check against cols for count and only then enter into blankrows
    public ArrayList<Integer> blankRows() {
        ArrayList<Integer> blankRows = new ArrayList<Integer>();
        int rowIndex = 0;
        for (String[] i : grid) {
            int count = 0;
            for (String k : i) {
                if ((k.equals("*"))) {
                    count++;
                }
            }

            if (count == cols) {
                blankRows.add(rowIndex);
            }
            rowIndex++;
        }
        return blankRows;
    }
    //randomize letters and insert
     public void fillLetters() {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid[0].length; k++) {
                if (grid[i][k].equals("*")) {
                    int random = (int) (Math.random() * 26); // WIll be correct because with int casting it automatically truncates down to 25 max
                    grid[i][k] = alphabet[random];
                }
            }
        }
    }
    
    public boolean checkDuplicate(String word) {
        for (String i : wordList) {
         if (i.equals(word)) {
            return true;
         }
        }
        return false;
    }

}
