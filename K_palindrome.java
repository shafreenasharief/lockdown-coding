package palindrome;

public class K_Palindrome {

		public static int isKPalindrome(String X, int m, String Y, int n)		{

			

			if (m == 0 || n == 0) {

				return n + m;

			}

			if (X.charAt(m - 1) == Y.charAt(n - 1)) {

				return isKPalindrome(X, m - 1, Y, n - 1);

			}

			int x = isKPalindrome(X, m - 1, Y, n);

			int y = isKPalindrome(X, m, Y, n - 1);

			return 1 + Integer.min(x, y);

		}

		public static void main(String[] args)

		{

			String str = "abcdeca";

			int K = 2;

			String rev = new StringBuilder(str).reverse().toString();

			if (isKPalindrome(str, str.length(), rev, str.length()) <= 2 * K) {

				System.out.print("String is K-Palindrome");

			} else {

				System.out.print("String is not a K-Palindrome");

			}

		}

}
