### Optimize Solutions:
# Why Does "Best Time to Buy and Sell Stock" Fall Under the Sliding Window Approach?

## 🔍 Understanding Sliding Window Approach
The **Sliding Window** technique is used to optimize problems where a "window" moves over a data structure (like an array or a string) to track relevant information efficiently. The window can either be **fixed-size** or **variable-size**, depending on the problem requirements.

## 🛠 How This Problem Uses Sliding Window
In the **Best Time to Buy and Sell Stock** problem, we don't use an explicit window of fixed length, but rather an **expanding dynamic window**:
1. The **left boundary** of the window represents the "best buying price seen so far."
2. The **right boundary** iterates through the array, checking each price as a potential "selling price."
3. The "window" expands as we traverse, dynamically keeping track of the **minimum buying price** (left edge) and the **maximum profit** (difference between current price and min price).

## 📌 Key Observations:
- Unlike traditional fixed-size sliding windows, here the window adjusts dynamically.
- Instead of checking all pairs (`O(n^2)`), we only **move forward** in a single pass (`O(n)`).
- We maintain only two variables: `minPrice` (left edge) and `maxProfit`.

## ✅ Why It Fits Sliding Window:
| Sliding Window Characteristic | How It Applies Here |
|------------------------------|--------------------|
| Window processes elements **in a single pass** | We iterate once (`O(n)`) while keeping track of `minPrice` and `maxProfit`. |
| Window "slides" over the data to maintain optimal state | We update `minPrice` as we move, ensuring efficient profit calculation. |
| Optimized solution avoids brute force (`O(n^2)`) | We check the best `minPrice` dynamically instead of rechecking all pairs. |

## 🚀 Conclusion
While this problem doesn’t use a **fixed-size window**, it employs a **dynamic, expanding sliding window** approach to track the optimal **buying price** while iterating. This ensures an optimal and efficient solution in `O(n)`, making it a great example of an **optimized sliding window pattern.**
