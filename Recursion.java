public class Recursion
{
    public int factorial(int n)
    {
        if (n == 1) return 1;
        return n*factorial(n-1);
    }
    public int bunnyEars(int bunnies)
    {
        return bunnies*2;
    }
    public int fibonacci(int n)
    {
        if (n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public int bunnyEars2(int bunnies)
    {
        if (bunnies == 0) return 0;
        if (bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
        return 2 + bunnyEars2(bunnies-1);
    }
    public int triangle(int rows)
    {
        if (rows == 0) return 0;
        return rows + triangle(rows-1);
    }
    public int sumDigits(int n)
    {
        if (n == 0) return 0;
        return n%10 + sumDigits(n/10);
    }
    public int strCopyCount(String str, String sub)
    {
        if (str.contains(sub)) return 1 + strCopyCount(str.substring(str.indexOf(sub)+1), sub);
        return 0;
    }
    public boolean strCopies(String str, String sub, int n)
    {
        return strCopyCount(str, sub) >= n;
    }
    public int strDist(String str, String sub)
    {
        if (str.indexOf(sub) == -1) return 0;
        int first = str.indexOf(sub);
        int last = str.lastIndexOf(sub) + sub.length() - 1;
        if (first == last) return sub.length();
        return last - first + 1;
    }
    public int strCount(String str, String sub)
    {
        if (str.contains(sub)) return 1 + strCount(str.substring(str.indexOf(sub)+sub.length()), sub);
        return 0;
    }
    public static void main(String[] args)
    {
    }
}
