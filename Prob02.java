class Prob02 {
	public static void main(String[] args) {
		long a = 1;
		long b = 2;
		long tot = 0;
		while (a < 4000000) {
			// Uncomment to print out each term in the fibbonachi sequence.
			// System.out.print(a + " :: ");
			if (a % 2 == 0) {
				// Uncomment to print out each even term.
				// System.out.print(a + " :: ");
				tot += a;
			}
			b = a + b;
			a = b - a;
		}
		System.out.println("\n==========\nSUM OF EVEN-VALUED TERMS: " + tot);
	}
}
