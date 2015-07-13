public class CodingBAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40)
			if (cigars <= 60 || isWeekend)
				return true;
		return false;

	}

	public int dateFashion(int you, int date) {
		if (you < 3 || date < 3)
			return 0;
		if (you < 8 && date < 8)
			return 1;
		return 2;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer)
			return (temp <= 100 && temp >= 60);
		else
			return (temp <= 90 && temp >= 60);
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		int speedy = speed;
		if (isBirthday)
			speedy -= 5;
		if (speedy <= 60)
			return 0;
		else if (speedy <= 80)
			return 1;
		return 2;
	}

	public int sortaSum(int a, int b) {
		if (a + b > 9 && a + b < 20)
			return 20;
		else
			return (a + b);
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6)
				return "off";
			else
				return "10:00";
		}
		if (day == 0 || day == 6)
			return "10:00";
		else
			return "7:00";
	}

	public boolean love6(int a, int b) {
		return (a - b == 6 || b - a == 6 || a == 6 || b == 6 || a + b == 6);
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if (outsideMode)
			return (n <= 1 || n >= 10);

		return (n >= 1 && n <= 10);
	}

	public boolean specialEleven(int n) {
		return (n % 11 == 0 || n % 11 == 1);
	}

	public boolean more20(int n) {
		if (n % 20 == 1 && n % 20 == 2)
			return false;
		return (n % 20 == 1 || n % 20 == 2);
	}

	public boolean less20(int n) {
		return (n % 20 == 19 || n % 20 == 18);
	}

	public boolean nearTen(int num) {
		return ((num % 10 >= 0 && num % 10 < 3) || (num % 10 >= 8 && num % 10 <= 9));
	}

	public int teenSum(int a, int b) {
		if ((a > 12 && a < 20) || (b > 12 && b < 20))
			return 19;
		else
			return a + b;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep)
			return false;
		if (isMorning && !isMom)
			return false;
		return true;
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		if (tea * 2 <= candy || candy * 2 <= tea)
			return 2;
		else
			return 1;
	}

	public String fizzString(String str) {
		if (str.startsWith("f") && str.endsWith("b"))
			return "FizzBuzz";
		else if (str.startsWith("f"))
			return "Fizz";
		else if (str.endsWith("b"))
			return "Buzz";
		else
			return str;
	}

	public String fizzString2(int n) {
		boolean a = n % 3 == 0;
		boolean b = n % 5 == 0;

		if (a && b)
			return "FizzBuzz!";
		if (a)
			return "Fizz!";
		if (b)
			return "Buzz!";
		return (n + "!");

	}

	public boolean twoAsOne(int a, int b, int c) {
		return (a + b == c || b + c == a || a + c == b);
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk)
			return (c > b);
		else
			return (b > a && c > b);
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk)
			return (a <= b && b <= c);
		else
			return (a < b && b < c);
	}

	public boolean lastDigit(int a, int b, int c) {
		int A = a % 10;
		int B = b % 10;
		int C = c % 10;
		return (A == B || B == C || A == C);
	}

	public boolean lessBy10(int a, int b, int c) {
		boolean A = (a - b >= 10 || a - c >= 10);
		boolean B = (b - a >= 10 || b - c >= 10);
		boolean C = (c - a >= 10 || c - b >= 10);
		return (A || B || C);
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		int sum = die1 + die2;
		if (noDoubles && die1 == die2) {
			if (die1 == 6)
				return sum - 5;
			return sum + 1;
		}
		return sum;
	}

	public int maxMod5(int a, int b) {
		boolean lessThenA = a < b;
		if (a == b)
			return 0;
		if (a % 5 == b % 5) {
			if (lessThenA)
				return a;
			if (!lessThenA)
				return b;
		}
		if (lessThenA)
			return b;
		return a;
	}

	public int redTicket(int a, int b, int c) {
		if (a == b && a == c && a == 2)
			return 10;
		if (a == b && b == c)
			return 5;
		if (a != b && a != c)
			return 1;
		return 0;
	}

	public int greenTicket(int a, int b, int c) {
		if (a == b && a == c)
			return 20;
		if (a == b || a == c || b == c)
			return 10;
		return 0;
	}

	public int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int bc = b + c;
		int ac = a + c;
		if (ab == 10 || bc == 10 || ac == 10)
			return 10;
		if (ab - bc == 10 || ab - ac == 10)
			return 5;
		return 0;
	}

	public boolean shareDigit(int a, int b) {
		int sum = a % 10;
		int sum2 = a / 10;
		int sum3 = b % 10;
		int sum4 = b / 10;
		return (sum == sum3 || sum == sum4 || sum2 == sum3 || sum2 == sum4);
	}

	public int sumLimit(int a, int b) {
		int sum = a + b;
		String digitsSum = "" + sum;
		String digitsA = "" + a;
		int sumDigits = digitsSum.length();
		int aDigits = digitsA.length();
		if (sumDigits > aDigits)
			return a;
		return sum;
	}

}
