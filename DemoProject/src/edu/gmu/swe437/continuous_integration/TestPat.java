package edu.gmu.swe437.continuous_integration;

/**
 * TestPat class searches for occurrence of String pattern within String subject 
 * 
 * Usage: java TestPat String-Subject String-Pattern
 * 
 * @author Professor Jeff Offutt
 * @version ISBN 978-0-521-88038-1
 *
 */
class TestPat {

	/**
	 * @param argv
	 */
	public static void main(String[] argv) {
		final int MAX = 100;
		char subject[] = new char[MAX];
		char pattern[] = new char[MAX];
		if (argv.length != 2) {
			System.out.println("java TestPat String-Subject String-Pattern");
			return;
		}
		subject = argv[0].toCharArray();
		pattern = argv[1].toCharArray();
		TestPat testPat = new TestPat();
		int n = 0;
		if ((n = testPat.pat(subject, pattern)) == -1)
			System.out
					.println("Pattern string is not a substring of the subject string");
		else
			System.out.println("Pattern string begins at the character " + n);
	}

	/**
	 * TestPat default constructor
	 */
	public TestPat() {
	}

	/**
	 * pat method returns position of first character of pattern within subject
	 * if pattern is not a substring of subject, return -1
	 * else return the zero-based index where first character of pattern occurs
	 * within subject
	 * 
	 * @param subject a char[]
	 * @param pattern a char[]
	 * @return int representing first character position of pattern within subject
	 */
	public int pat(char[] subject, char[] pattern) {
		// Post: if pattern is not a substring of subject, return -1
		// else return (zero-based) index where the pattern (first)
		// starts in subject

		final int NOTFOUND = -1;
		int iSub = 0, rtnIndex = NOTFOUND;
		boolean isPat = false;
		int subjectLen = subject.length;
		int patternLen = pattern.length;

		while (isPat == false && iSub + patternLen - 1 < subjectLen) {
			if (subject[iSub] == pattern[0]) {
				rtnIndex = iSub; // Starting at zero
				isPat = true;
				for (int iPat = 1; iPat < patternLen; iPat++) {
					if (subject[iSub + iPat] != pattern[iPat]) {
						rtnIndex = NOTFOUND;
						isPat = false;
						break; // out of for loop
					}
				}
			}
			iSub++;
		}
		return (rtnIndex);
	}

}