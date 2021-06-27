public class DSU {
    public int size;
    public int[] arr;
    DSU(int n) {
        this.size = n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        this.arr = arr;
    }
    public int find(int a) {
        int p = a;
        while (p != this.arr[p]) {
            p = this.arr[p];
        }
        return p;
    }

    public void merge(int a, int b) {
        int p = Math.min(this.find(a), this.find(b));
        int q = Math.max(this.find(a), this.find(b));
        this.arr[q] = p;
    }

    public int getSize() {
        return this.size;
    }
}
