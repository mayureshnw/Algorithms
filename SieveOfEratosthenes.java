import java.util.Arrays;

class SieveOfEratosthenes {
	boolean[] primes;
	int val;

	public SieveOfEratosthenes(int max_val) {
		primes = new boolean[max_val+1];
		val = max_val;
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		setPrimes();
	}

	private void setPrimes() {
		int rootval = (int)Math.sqrt(val);

		for(int i=2;i<=rootval;i++) {
			if(primes[i]) {
				for(int j=1;j*i<=val;j++) {
					primes[i*j] = false;
				}
			}
		}
	}

	public boolean isPrime(int val) {
		return primes[val];
	}

	public static void main(String[] args) {
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(20);
		System.out.println(sieve.isPrime(18));
	}
}
