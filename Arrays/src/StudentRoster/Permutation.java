package StudentRoster;

public class Permutation {

    public static void text(){
        System.out.println("\n*Permutation*");
        System.out.println("\nIn mathematics, the permutation is a method or technique in which we can determine the possible arrangements in a set. \n" +
                "The number of ways of selection and arrangement of items in which orders matters. In short, the permutation is the number of arrangements. \n" +
                "While determining the permutation, keep order in mind. It is denoted by the letter P.\n" +
                "\n" +
                "In other words, it is a technique by which we can arrange (or select) r objects out of given n objects in a particular order.\n" +
                "Mathematically, we can find the permutation of the numbers by using the following formula: P(n, r) = n! / (n - r)!");
        System.out.println("Where,");
        System.out.println("P: P is the number of permutations.");
        System.out.println("n: n is the total number of objects in the set.");
        System.out.println("r: r is the number of choosing objects from the set.");
        System.out.println("!: The symbol denotes the factorial.\n");

        System.out.println("Now, let's try Permutation using Recursive Algorithm.");
    }

    public static void text2(){
        System.out.println("\nThe recursive algorithm uses backtracking. \nIt demines the permutation of numbers by swapping one element per iteration.");
    }


//  Printing the arrays in
    static void printArray(int[] arr){
        System.out.println("\t ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

//  Swapping the first element to other element
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//   Permuting arrays depends on how many arrays to be input
    static void permuteArray(int[] arr, int currID){

//      Print the permutation
        if(currID == arr.length - 1){
            printArray(arr);
            return;
        }
//      Swapping array elements to permute
        for(int i = currID; i < arr.length; i++){
            swap(arr, i, currID);
            permuteArray(arr, currID+1);
            swap(arr, i, currID);
        }
    }
}
