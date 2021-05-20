public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
                new Product("Nokia 3210", 150),
                new Product("Huawei", 570),
                new Product("Samsung S21 Ultra", 1050),
                new Product("iPhone 12 Pro", 1100),
        };

        Product searchingItem = new Product("Samsung S20 Ultra", 1050);

        boolean found = MySearch.linearSearch(products, searchingItem); // O(N)

        System.out.println((found ? "Found" : "Not found"));

        found = MySearch.binarySearch(products, searchingItem); // O(logN)

        System.out.println((found ? "Found" : "Not found"));

//
//
//        BST<String, Product> bst = new BST<>();
//        //                new Product("Nokia 3210", 150),
////                new Product("Huawei", 570),
////                new Product("Samsung S21 Ultra", 1050),
////                new Product("iPhone 12 Pro", 1100),
//        bst.put("QP", new Product("Huawei", 570));
//        bst.put("SM", new Product("Samsung S21 Ultra", 1050));
//        bst.put("NK", new Product("Nokia 3210", 150));
//        bst.put("IOS", new Product("iPhone 12 Pro", 1100));
////        bst.put("PS", new Product("iPhone 11 Pro", 1100));
////        bst.put("OS", new Product("iPhone XS", 1100));
////        bst.put("OT", new Product("iPhone 4", 1100));
//
//        bst.delete("NK");
//
//        System.out.println(bst.containsKey("NK"));

    }
}
