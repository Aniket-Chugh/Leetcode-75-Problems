class problem9 {
    public int compress(char[] chars) {
        int index = 0;  // index for placing characters in the compressed array
        int i = 0;      // index for traversing the input array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count the occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Place the character in the array
            chars[index++] = currentChar;

            // If the count is greater than 1, place the digits of the count in the array
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;  // Return the new length of the compressed array
    }
}
