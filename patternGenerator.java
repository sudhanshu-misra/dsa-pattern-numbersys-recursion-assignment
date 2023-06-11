package assgn3;

public class patternGenerator {
        // Star Square Pattern
        public static void printStarSquarePattern(int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        
        // Hollow Square Pattern
        public static void printHollowSquarePattern(int size) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        
        // Left Pyramid Pattern
        public static void printLeftPyramidPattern(int rows) {
            printLeftPyramidPattern(rows, 0);
        }
        
        private static void printLeftPyramidPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i <= currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printLeftPyramidPattern(rows, currentRow + 1);
        }
        
        // Inverted Half Pyramid Pattern
        public static void printInvertedHalfPyramidPattern(int rows) {
            printInvertedHalfPyramidPattern(rows, 0);
        }
        
        private static void printInvertedHalfPyramidPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printInvertedHalfPyramidPattern(rows, currentRow + 1);
        }
        
        // Mirror Left Pyramid Pattern
        public static void printMirrorLeftPyramidPattern(int rows) {
            printMirrorLeftPyramidPattern(rows, 0);
        }
        
        private static void printMirrorLeftPyramidPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printMirrorLeftPyramidPattern(rows, currentRow + 1);
        }
        
        // Mirror Inverted Half Pyramid Pattern
        public static void printMirrorInvertedHalfPyramidPattern(int rows) {
            printMirrorInvertedHalfPyramidPattern(rows, 0);
        }
        
        private static void printMirrorInvertedHalfPyramidPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < rows - currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printMirrorInvertedHalfPyramidPattern(rows, currentRow + 1);
        }
        
        // Pyramid Pattern
        public static void printPyramidPattern(int rows) {
            printPyramidPattern(rows, 0);
        }
        
        private static void printPyramidPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printPyramidPattern(rows, currentRow + 1);
        }
        
        // Odd Star Pyramid Pattern
        public static void printOddStarPyramidPattern(int rows) {
            printOddStarPyramidPattern(rows, 1, 0);
        }
        
        private static void printOddStarPyramidPattern(int rows, int stars, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            printOddStarPyramidPattern(rows, stars + 2, currentRow + 1);
        }
        
        // Full Pyramid Pattern
        public static void printFullPyramidPattern(int rows) {
            printFullPyramidPattern(rows, 1, 0);
        }
        
        private static void printFullPyramidPattern(int rows, int stars, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            printFullPyramidPattern(rows, stars + 2, currentRow + 1);
        }
        
        // Diagonal Line Pattern
        public static void printDiagonalLinePattern(int size) {
            printDiagonalLinePattern(size, 0);
        }
        
        private static void printDiagonalLinePattern(int size, int currentRow) {
            if (currentRow == size) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            
            printDiagonalLinePattern(size, currentRow + 1);
        }
        
        // Cross Diagonal Line Pattern
        public static void printCrossDiagonalLinePattern(int size) {
            printCrossDiagonalLinePattern(size, 0);
        }
        
        private static void printCrossDiagonalLinePattern(int size, int currentRow) {
            if (currentRow == size) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                if (i == currentRow / 2 || currentRow == size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
            
            printCrossDiagonalLinePattern(size, currentRow + 1);
        }
        
        // Right Pascal Pattern
        public static void printRightPascalPattern(int rows) {
            printRightPascalPattern(rows, 0);
        }
        
        private static void printRightPascalPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            int coef = 1;
            for (int i = 0; i <= currentRow; i++) {
                System.out.print(coef + " ");
                coef = coef * (currentRow - i) / (i + 1);
            }
            System.out.println();
            
            printRightPascalPattern(rows, currentRow + 1);
        }
        
        // Left Pascal Pattern
        public static void printLeftPascalPattern(int rows) {
            printLeftPascalPattern(rows, 0);
        }
        
        private static void printLeftPascalPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                System.out.print("  ");
            }
            int coef = 1;
            for (int i = 0; i <= rows - currentRow - 1; i++) {
                System.out.print(coef + " ");
                coef = coef * (rows - currentRow - i) / (i + 1);
            }
            System.out.println();
            
            printLeftPascalPattern(rows, currentRow + 1);
        }
        
        // Number char Patterns
        public static void printNumberCharPatterns(int rows) {
            printNumberCharPatterns(rows, 1, 'A', 0);
        }
        
        private static void printNumberCharPatterns(int rows, int num, char ch, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i <= currentRow; i++) {
                System.out.print(num++ + " ");
            }
            for (int i = 0; i <= currentRow; i++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
            
            printNumberCharPatterns(rows, num, ch, currentRow + 1);
        }
        
        // Inverted Pyramid Star Pattern
        public static void printInvertedPyramidStarPattern(int rows) {
            printInvertedPyramidStarPattern(rows, 0);
        }
        
        private static void printInvertedPyramidStarPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i < 2 * (rows - currentRow) - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printInvertedPyramidStarPattern(rows, currentRow + 1);
        }
        
        // Hollow Inverted Pyramid Star Pattern
        public static void printHollowInvertedPyramidStarPattern(int rows) {
            printHollowInvertedPyramidStarPattern(rows, 0);
        }
        
        private static void printHollowInvertedPyramidStarPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < currentRow; i++) {
                System.out.print("  ");
            }
            if (currentRow == 0 || currentRow == rows - 1) {
                for (int i = 0; i < 2 * (rows - currentRow) - 1; i++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int i = 0; i < 2 * (rows - currentRow) - 3; i++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            
            printHollowInvertedPyramidStarPattern(rows, currentRow + 1);
        }
        
        // Hollow Diamond Star Pattern
        public static void printHollowDiamondStarPattern(int rows) {
            printHollowInvertedPyramidStarPattern(rows, 0);
            printHollowPyramidStarPattern(rows, 1);
        }
        
        private static void printHollowPyramidStarPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print("  ");
            }
            if (currentRow == 0 || currentRow == rows - 1) {
                for (int i = 0; i < 2 * currentRow + 1; i++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int i = 0; i < 2 * currentRow - 1; i++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
            
            printHollowPyramidStarPattern(rows, currentRow + 1);
        }
        
        // Left Arrow and Right Arrow Star Pattern
        public static void printLeftArrowRightArrowStarPattern(int rows) {
            printLeftArrowStarPattern(rows, 0);
            printRightArrowStarPattern(rows, 0);
        }
        
        private static void printLeftArrowStarPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i <= currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printLeftArrowStarPattern(rows, currentRow + 1);
        }
        
        private static void printRightArrowStarPattern(int rows, int currentRow) {
            if (currentRow == rows) {
                return;
            }
            
            for (int i = 0; i < rows - currentRow - 1; i++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= currentRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            printRightArrowStarPattern(rows, currentRow + 1);
        }
        
        // Heart Star Pattern
        public static void printHeartStarPattern(int rows) {
            printHeartStarPattern(rows, 0, 0);
        }
        
        private static void printHeartStarPattern(int rows, int currentRow, int currentColumn) {
            if (currentRow == rows) {
                return;
            }
            
            if (currentColumn <= rows / 2 - currentRow || currentColumn >= rows / 2 + currentRow) {
                System.out.print("  ");
            } else {
                System.out.print("* ");
            }
            
            if (currentColumn == rows - 1) {
                System.out.println();
                printHeartStarPattern(rows, currentRow + 1, 0);
            } else {
                printHeartStarPattern(rows, currentRow, currentColumn + 1);
            }
        }
        
        // Number Right and Left Triangle Pattern
        public static void printNumberRightLeftTrianglePattern(int rows) {
            printNumberRightLeftTrianglePattern(rows, 1, 1, 0);
        }
        
        private static void printNumberRightLeftTrianglePattern(int rows, int num, int currentRow, int currentColumn) {
            if (currentRow > rows) {
                return;
            }
            
            if (currentColumn <= currentRow) {
                System.out.print(num++ + " ");
            } else {
                System.out.print("  ");
            }
            
            if (currentColumn == rows * 2 - 1) {
                System.out.println();
                printNumberRightLeftTrianglePattern(rows, num, currentRow + 1, 1);
            } else {
                printNumberRightLeftTrianglePattern(rows, num, currentRow, currentColumn + 1);
            }
        }
        
        public static void main(String[] args) {
            int size = 5;
            int rows = 5;
            
            System.out.println("1. Star Square Pattern:");
            printStarSquarePattern(size);
            
            System.out.println("\n2. Hollow Square Pattern:");
            printHollowSquarePattern(size);
            
            System.out.println("\n3. Left Pyramid Pattern:");
            printLeftPyramidPattern(rows);
            
            System.out.println("\n4. Inverted Half Pyramid Pattern:");
            printInvertedHalfPyramidPattern(rows);
            
            System.out.println("\n5. Mirror Left Pyramid Pattern:");
            printMirrorLeftPyramidPattern(rows);
            
            System.out.println("\n6. Mirror Inverted Half Pyramid Pattern:");
            printMirrorInvertedHalfPyramidPattern(rows);
            
            System.out.println("\n7. Pyramid Pattern:");
            printPyramidPattern(rows);
            
            System.out.println("\n8. Odd Star Pyramid Pattern:");
            printOddStarPyramidPattern(rows);
            
            System.out.println("\n9. Full Pyramid Pattern:");
            printFullPyramidPattern(rows);
            
            System.out.println("\n10. Diagonal Line Pattern:");
            printDiagonalLinePattern(size);
            
            System.out.println("\n11. Cross Diagonal Line Pattern:");
            printCrossDiagonalLinePattern(size);
            
            System.out.println("\n12. Right Pascal Pattern:");
            printRightPascalPattern(rows);
            
            System.out.println("\n13. Left Pascal Pattern:");
            printLeftPascalPattern(rows);
            
            System.out.println("\n14. Number char Patterns:");
            printNumberCharPatterns(rows);
            
            System.out.println("\n15. Inverted Pyramid Star Pattern:");
            printInvertedPyramidStarPattern(rows);
            
            System.out.println("\n16. Hollow Inverted Pyramid Star Pattern:");
            printHollowInvertedPyramidStarPattern(rows);
            
            System.out.println("\n17. Hollow Diamond Star Pattern:");
            printHollowDiamondStarPattern(rows);
            
            System.out.println("\n18. Left Arrow and Right Arrow Star Pattern:");
            printLeftArrowRightArrowStarPattern(rows);
            
            System.out.println("\n19. Heart Star Pattern:");
            printHeartStarPattern(rows);
            
            System.out.println("\n20. Number Right and Left Triangle Pattern:");
            printNumberRightLeftTrianglePattern(rows);
        }
    }
