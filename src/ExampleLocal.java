/*

class Example {
    public static void main(String[] args) {
        int x = 4;

        System.out.println("Java drives the Web.");
        System.out.println();

        switch (x) {
            case 1 -> System.out.printf("This is one.");
            case 2 -> System.out.printf("This is two.");
            case 3, 4, 5 -> System.out.printf("This is three or four or five.");
            case 6 -> System.out.printf("This is six.");
            default -> System.out.printf("This is default.");
        }

    }
}


class Example {
    public static void main(String[] args) {
        double[] myArray = new double[10];
        double avg=0;

        System.out.print("myArray values: ");
        for (int i=0; i < myArray.length; i++) {
            myArray[i] = i+1;
            System.out.print(myArray[i] + " ");
            avg += myArray[i];
        }
        avg = avg / myArray.length;
        System.out.println("\n");
        System.out.printf("Average of myArray is %s.\n", avg);

    }
}


class Example {
    public static void main(String[] args) {
        double[] myArray = {3, 2, 9, 4, 22, 6, 5, 0, 9, 10};
        double avg = 0;

        System.out.println("Array values");
        for(int i=0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            avg += myArray[i];
        }
        System.out.println();

        avg = avg / myArray.length;
        System.out.println("Average of myArray is " + avg);



    }
}


// Try this 5-1. Demonstrate the bubble sort.
class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10; //number of elements to sort

        // display original array
        System.out.print("Original array is: ");
        for(int i=0; i < size; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        // This is the Bubble sort.
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(nums[b-1] > nums[b]) { // if out of order
                // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

        // display the sorted array
        System.out.print("The sorted array is: ");
        for(int i=0; i < size; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}



// Chapter 5 Self Test. Change Try 5-1 to sort an array of string.
class CharBubble {
    public static void main(String[] args) {
        char[] letters = {'x', 'z', 't', 'z', 'b', 'c', 'n', 'a'};
        int a, b;
        char t;

        // display original array
        System.out.print("Original array is: ");
        for(int i=0; i < letters.length; i++)
            System.out.print(letters[i] + " ");
        System.out.println();

        // This is the Bubble sort.
        for(a=1; a < letters.length; a++)
            for(b= letters.length-1; b >= a; b--) {
                if((int) letters[b-1] > (int) letters[b]) { // if out of order
                    // exchange elements
                    t = letters[b-1];
                    letters[b-1] = letters[b];
                    letters[b] = t;
                }
            }

        // display the sorted array
        System.out.print("The sorted array is: ");
        for(int i=0; i < letters.length; i++)
            System.out.print(letters[i] + " ");
        System.out.println();
    }
}



// Use XOR to encode and decode a message.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        char key = '8';

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        for(int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        for(int i=0; i < encmsg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);

    }
}

// Find the minimum and maximum values in an array. Rewrite for Chapter 5 Self Test with for each loop.
class MinMax3 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for(int x : nums) {
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.printf("min and max: %s %s", min, max);
    }
}



// Chapter 5 Self Test. Demonstrate bubble sort with strings.
class StrBubble {
    public static void main(String[] args) {
        String[] strs = {"this", "is", "a", "test", "of", "a", "string", "sort"};
        int a, b;
        String t, str;
        int size;

        size = strs.length; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(String x : strs)
            System.out.print(" " + x);
        System.out.println();

        // This is the bubble sort for strings.
        for(a=1; a < size; a++)
            for(b=size-1; b>= a; b--) {
                if(strs[b-1].compareTo(strs[b]) > 0) {  // if out of order
                    // exchange elements
                    t = strs[b-1];
                    strs[b-1] = strs[b];
                    strs[b] = t;
                }
            }

        // display sorted string
        System.out.print("Sorted array is:");
        for(String x : strs)
            System.out.print(" " + x);
        System.out.println();
        System.out.println();

        str = "Planeeeenttt";
        System.out.println(str.indexOf("n"));


    }
}

 */


// Use XOR to encode and decode a message.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        j = 0;
        for(int i=0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        j = 0;
        for(int i=0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==8) j = 0;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);

    }
}