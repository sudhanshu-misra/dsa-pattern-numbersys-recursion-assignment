package assgn3;

class NumberSystemConverter{
    
    // Decimal to Binary
    private static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        if (decimal == 1) {
            return "1";
        }
        
        int rem = decimal % 2;
        return decimalToBinary(decimal / 2) + rem;
    }
    
    // Binary to Decimal
    private static int binaryToDecimal(String binary) {
        if (binary.length() == 0) {
            return 0;
        }
        
        char bit = binary.charAt(binary.length() - 1);
        int digit = Character.getNumericValue(bit);
        
        return binaryToDecimal(binary.substring(0, binary.length() - 1)) * 2 + digit;
    }
    
    // Decimal to Octal
    private static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        int rem = decimal % 8;
        return decimalToOctal(decimal / 8) + rem;
    }
    
    // Decimal to Hexadecimal
    private static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        
        int rem = decimal % 16;
        
        if (rem < 10) {
            return decimalToHexadecimal(decimal / 16) + rem;
        } else {
            char hexDigit = (char) (rem - 10 + 'A');
            return decimalToHexadecimal(decimal / 16) + hexDigit;
        }
    }
    
    // Hexadecimal to Binary
    private static String hexadecimalToBinary(String hex) {
        StringBuilder binary = new StringBuilder();
        
        for (int i = 0; i < hex.length(); i++) {
            char hexDigit = hex.charAt(i);
            
            if (Character.isDigit(hexDigit)) {
                int decimal = Integer.parseInt(String.valueOf(hexDigit));
                binary.append(decimalToBinary(decimal));
            } else {
                int decimal = hexDigit - 'A' + 10;
                binary.append(decimalToBinary(decimal));
            }
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        int decimal = 42;
        String binary = "101010";
        int octal = 52;
        String hex = "2A";
        
        // Decimal to Binary
        System.out.println("Decimal: " + decimal);
        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println();
        
        // Binary to Decimal
        System.out.println("Binary: " + binary);
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
        System.out.println();
        
        // Decimal to Octal
        System.out.println("Octal: " + octal);
        System.out.println("Decimal to Octal: " + decimalToOctal(decimal));
        System.out.println();
        
        // Decimal to Hexadecimal
        System.out.println("Decimal: " + decimal);
        System.out.println("Decimal to Hexadecimal: " + decimalToHexadecimal(decimal));
        System.out.println();
        
        // Hexadecimal to Binary
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Hexadecimal to Binary: " + hexadecimalToBinary(hex));
    }
}
