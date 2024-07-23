class Solution {
    public int solution(int n) {
		int an = 0;
		int a = 1;
		for (int i = 2; i <= n; i++) {
			int temp = an + a;
			an = a;
			a = temp;
            a %= 1234567;
		}
		return a;
	}
}