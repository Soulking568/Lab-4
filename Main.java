import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random random = new Random();

        // Add 1000 random elements to the hashtable
        for (int i = 0; i < 1000; i++) {
            String data = "Element" + i;
            MyTestingClass key = new MyTestingClass(data);
            Student value = new Student();
            table.put(key, value);
        }

        // Get the sizes of each bucket
        int[] bucketSizes = table.getBucketSizes();

        // Print the number of elements in each bucket
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i] + " elements");
        }
    }
}
