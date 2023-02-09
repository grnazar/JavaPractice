class Main {
    public static void main(String[] args) {
        String[] array1 = {"Apple", "Orange", "Banana"};
        String[] array2 = {"Red", "Orange", "Yellow"};
        String[] array3 = {"Left", "Right", "Forward", "Back"};

        List<String> list1 = list2Array(array1);
        List<String> list2 = list2Array(array2);
        List<String> list3 = list2Array(array3);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }

    public static String[] list2Array(List<String> stringList) {
        return stringList.toArray(new String[0]);
    }}