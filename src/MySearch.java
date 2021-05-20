public class MySearch {

    private MySearch() {}

    public static <T> boolean linearSearch(T[] products, T searchingItem) {
        for (T product : products) {
            if (product.equals(searchingItem)) {
                return true;
            }
        }

        return false;
    }

    public static <T extends Comparable<T>> boolean binarySearch(T[] products, T searchingItem) {
        return binarySearch(products, searchingItem, 0, products.length - 1);
    }

    private static <T extends Comparable<T>> boolean binarySearch(T[] products, T searchingItem, int start, int end) {
        if (start > end) return false;
        int mid = (start + end) / 2;
        int cmp = searchingItem.compareTo(products[mid]);
        if (cmp == 0) {
            return true;
        } else if (cmp > 0) {
            return binarySearch(products, searchingItem, mid+1,end);
        } else {
            return binarySearch(products, searchingItem, start, mid-1);
        }
    }


}
