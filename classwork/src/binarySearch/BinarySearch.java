package binarySearch;

public class BinarySearch {
    int []sortedMas;

    public BinarySearch(int [] mass){
        sortedMas = mass;
    }

    public int recursiveBinarySearch(int searchInt, int left, int right){
        int a;
        if (left == right) {
            return  sortedMas[left] == searchInt ? left : -(left + 1);
        }
        int middle = (right + left) / 2;

        if (sortedMas[middle] == searchInt){
            return middle;
        }
        if (sortedMas[middle] > searchInt){
            right = middle - 1;
            a = recursiveBinarySearch(searchInt, left, right);
        }
        else {
            left = middle + 1;
            a = recursiveBinarySearch(searchInt, left, right);
        }
        return a;
    }

    public int iterativeBinarySearch(int searchInt, int left, int right){
        int a;
        while (left < right) {
            a = (left + right) >>> 1;
            if (sortedMas[a] == searchInt){
                return a;
            }
            if (sortedMas[a] > searchInt) {
                right = a - 1;
            } else {
                left = a + 1;
            }
        }
        return searchInt == sortedMas[left] ? left : -(left + 1);
    }
    public static void main(String[] args){
        int []mass = {1, 2, 3, 6, 7, 8, 9, 12, 14, 17, 19, 20, 43, 46, 278, 432};
        BinarySearch sortedMass = new BinarySearch(mass);
        int a = sortedMass.iterativeBinarySearch(20, 0, sortedMass.sortedMas.length - 1);
        System.out.println(a);
    }
}
