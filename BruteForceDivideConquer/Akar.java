public class Akar {

    public int bruteForce(int x) {
        if (x == 0 || x == 1)
            return x;
        int i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
    public int divideConquer(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2; // Jika x adalah kuadrat dari mid
            if (mid * mid == x)
                return mid;
            if (mid * mid < x) { // Jika kuadrat dari lebih kecil dari x, pencarian ke kanan
                start = mid + 1;
                ans = mid;
            } else { // Jika kuadrat dari lebih besar dari x, pencarian ke kiri
                end = mid - 1;
            }
        }
         return ans;
    }
}
