/* A Naive recursive implementation
of 0-1 Knapsack problem */
class Knapsack {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) 
	{ 
	return (a > b) ? a : b; 
	}

	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	static int knapSack(int maxWeight, int weight[], int profit[], int profitLength)
	{
		// Base Case
		if (profitLength == 0 || maxWeight == 0)
			return 0;

		// If weight of the nth item is
		// more than Knapsack capacity W,
		// then this item cannot be included
		// in the optimal solution
		if (weight[profitLength - 1] > maxWeight)
			return knapSack(maxWeight, weight, profit, profitLength - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(profit[profitLength - 1]
					+ knapSack(maxWeight - weight[profitLength - 1], weight,
								profit, profitLength - 1),
					knapSack(maxWeight, weight, profit, profitLength - 1));
	}

	// Driver code
	public static void main(String args[])
	{
		int profit[] = new int[] { 60, 100, 120,20 };
		int weight[] = new int[] { 10, 20, 30 ,10};
		int maxWeight = 60;
		int profitLen = weight.length;
		System.out.println(knapSack(maxWeight, weight, profit, profitLen));
	}
}
/*This code is contributed by Rajat Mishra */

