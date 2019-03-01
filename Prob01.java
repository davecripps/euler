class Prob01 {
	public static void main(String[] args) {
		int tot = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				// Uncomment to print out each hit
				// System.out.print(i + " :: ");
				tot += i;
			}
		}
		System.out.println("\n======\nTOTAL: " + tot);
	}
}
