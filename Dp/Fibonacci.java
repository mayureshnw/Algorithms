class Fibonacci {

	public long memoization(long val){
		int[] memo = new int[val+1];
		memo[0] = 0;
		memo[1] = 1;
		return recur_fib(memo, val);
	}

	private recur_memoize(int[] memo, val) {

	}

	public long bottomup(long val) {

	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		long value = 20L;
		fib.memoization(value);
		fib.bottomup(value);
	}
}
