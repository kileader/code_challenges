class Week_2_14
{
    static void Main()
    {
        // Monday Challenge
        Smoothie s1 = new Smoothie(new string[] { "Banana" });
        foreach (string fruit in s1.Ingredients) Console.WriteLine(fruit);
        Console.WriteLine(s1.GetCost());
        Console.WriteLine(s1.GetPrice());
        Console.WriteLine(s1.GetName());
        Smoothie s2 = new Smoothie(new string[] { "Raspberries", "Strawberries", "Blueberries" });
        foreach (string fruit in s2.Ingredients) Console.WriteLine(fruit);
        Console.WriteLine(s2.GetCost());
        Console.WriteLine(s2.GetPrice());
        Console.WriteLine(s2.GetName());
    }
    
}

/*
 * Create a class Smoothie and do the following:
 * Create a property called Ingredients.
 * Create a GetCost method which calculates the total cost of the ingredients used to make the smoothie.
 * Create a GetPrice method which returns the number from GetCost plus the number from GetCost multiplied by 1.5. Round to two decimal places.
 * Create a GetName method which gets the ingredients and puts them in alphabetical order into a nice descriptive sentence. 
 * If there are multiple ingredients, add the word "Fusion" to the end but otherwise, 
 * add "Smoothie". Remember to change "-berries" to "-berry". See the examples below.
*/
class Smoothie
{
    public string[] _ingredients;

    public Dictionary<string, double> Costs;

    public Smoothie(string[] ingredients)
    {
        _ingredients = ingredients;
        Costs = new Dictionary<string, double>();
        Costs.Add("Strawberries", 1.50);
        Costs.Add("Banana", 0.50);
        Costs.Add("Mango", 2.50);
        Costs.Add("Blueberries", 1.00);
        Costs.Add("Raspberries", 1.00);
        Costs.Add("Apple", 1.75);
        Costs.Add("Pineapple", 3.50);
    }

    public string[] Ingredients
    {
        get => _ingredients;
        set => _ingredients = value;
    }

    public string GetCost()
    {
        double cost = 0;
        foreach (string fruit in _ingredients)
        {
            if (Costs.ContainsKey(fruit)) cost += Costs[fruit];
        }
        return "$" + String.Format("{0:0.00}", cost);
    }

    public string GetPrice()
    {
        double cost = 0;
        foreach (string fruit in _ingredients)
        {
            if (Costs.ContainsKey(fruit)) cost += Costs[fruit];
        }
        double price = cost * 2.5;
        return "$" + String.Format("{0:0.00}", price);
    }

    public string GetName()
    {
        Array.Sort(_ingredients);
        string[] fruits = _ingredients;
        string name = "";
        if (fruits[0].Contains("berries")) name += fruits[0].Replace("berries", "berry");
        else name += fruits[0];
        if (fruits.Length > 1)
        {
            for (int i = 1; i < fruits.Length; i++)
            {
                if (fruits[i].Contains("berries")) name += " " + fruits[i].Replace("berries", "berry");
                else name += " " + fruits[i];
            }
            return name + " Fusion";
        }
        return name + " Smoothie";
    }

}