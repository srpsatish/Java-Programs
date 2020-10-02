class SortAlphaOrder {
    public static void main(String args[]) {
        String z;
        int n = args.length;
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = args[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    z = s[i];
                    s[i] = s[j];
                    s[j] = z;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i] + " ");
        }
    }
}
