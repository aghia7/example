public class MySearch {

    private MySearch() {}

    public static <T> boolean linearSearch(T[] data, T searchingItem) {
        for (T item : data) {
            if (item.equals(searchingItem)) {
                return true;
            }
        }

        return false;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] data, T searchingItem) {
        return binarySearch(data, searchingItem, 0, data.length - 1);
    }

    private static <T extends Comparable<T>> int binarySearch(T[] data, T searchingItem, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        int cmp = searchingItem.compareTo(data[mid]);
        if (cmp == 0) {
            int k = binarySearch(data, searchingItem, mid+1,end);
            if (k != -1) {
                return k;
            }
            return mid;
        } else if (cmp > 0) {
            return binarySearch(data, searchingItem, mid+1,end);
        } else {
            return binarySearch(data, searchingItem, start, mid-1);
        }
    }


}
