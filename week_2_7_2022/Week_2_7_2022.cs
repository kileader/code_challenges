class Week_2_7_2022
{
    static void Main()
    {
        // Monday Challenge
        Console.WriteLine("ReverseCase(\"Happy Birthday\") -> " + ReverseCase("Happy Birthday"));
        Console.WriteLine("ReverseCase(\"MANY THANKS\") -> " + ReverseCase("MANY THANKS"));
        Console.WriteLine("ReverseCase(\"sPoNtAnEoUs\") -> " + ReverseCase("sPoNtAnEoUs"));

        // Wednesday Challenge 1
        double[] arr1 = { 9, 17, 30, 1.5 };
        double[] arr2 = { 16, 18, 30, 1.8 };
        double[] arr3 = { 13.25, 15, 30, 1.5 };
        Console.WriteLine("OverTime([9, 17, 30, 1.5]) -> " + OverTime(arr1));
        Console.WriteLine("OverTime([16, 18, 30, 1.8]) -> " + OverTime(arr2));
        Console.WriteLine("OverTime([13.25, 15, 30, 1.5]) -> " + OverTime(arr3));

        // Wednesday Challenge 2
        Console.WriteLine("UniqueFract() -> " + UniqueFract());
    }

    /*
     * Given a string, create a function to reverse the case.
     * All lower-cased letters should be upper-cased, and vice versa.
     */
    static string ReverseCase(string given)
    {
        char[] chars = given.ToCharArray();
        string ans = "";
        for (int i = 0; i < chars.Length; i++)
        {
            if (Char.IsUpper(chars[i]))
            {
                ans += Char.ToLower(chars[i]);
            }
            else if (Char.IsLower(chars[i]))
            {
                ans += Char.ToUpper(chars[i]);
            }
            else
            {
                ans += chars[i];
            }
        }
        return ans;
    }

    /*
     * Write a function that calculates overtime and pay associated with overtime.
     * - Working 9 to 5: regular hours
     * - After 5pm is overtime
     * 
     * Your function gets an array with 4 values:
     * - Start of working day, in decimal format, (24-hour day notation)
     * - End of working day. (Same format)
     * - Hourly rate
     * - Overtime multiplier
     * 
     * Your function should spit out:
     * - $ + earned that day (rounded to the nearest hundreth)
     */
    static string OverTime(double[] arr)
    {
        double regEnd = 17;
        double start = arr[0];
        double end = arr[1];
        double rate = arr[2];
        double overMult = arr[3];
        double regHours = 0;
        double overHours = 0;
        if (end <= regEnd)
        {
            regHours = (end - start);
        }
        else if (start < regEnd && regEnd < end)
        {
            regHours = (regEnd - start);
            overHours = (end - regEnd);
        }
        else if (regEnd < start)
        {
            overHours = (end - start);
        }
        double pay = (rate * (regHours + overHours * overMult));
        string ans = "$" + String.Format("{0:0.00}", Math.Round(pay, 2));
        return ans;
    }

    /*
     * Create a function double UniqueFract(), which should sum all irreducible regular fractions between 0 and 1,
     * in the numerator and denominator of which there are only single-digit numbers: 1/2, 1/3, 1/4, ... 2/3, 2/4, ... 8/9.
     * 
     * Task
     * - UniqueFract() ➞ sum
     * 
     * Notes:
     * -Of the fractions 1/2 2/4 3/6 4/8, only 1/2 is included in the sum.
     * -Don't include any values >= 1.
     * -Both the numerator and denominator are single digit.
     */
    static double UniqueFract()
    {
        double ans = 0;
        List<double> fracts = new List<double>();
        for (int den = 2; den < 10; den++)
        {
            for (int num = 1; num < den; num++)
            {
                double fract = (double) num / den;
                if (!fracts.Contains(fract))
                {
                    fracts.Add(fract);
                }
            }
        }
        for (int i = 0; i < fracts.Count; i++)
        {
            ans += fracts[i];
        }
        return ans;
    }
}
