public class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> result = new ArrayList<>(); // list to store the indices which contain char x
        for (int i = 0; i < words.length; i++) 
        {
            if (words[i].indexOf(x) != -1) // checking if the character is present in the word. -1 determines if not present
            {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Solution sol = new Solution(); // creating an object of the class to call the functions of the class outside the scope of main
        String[] words = {"hello","banana"};
        char x = 'b';
        
        List<Integer> indices = sol.findWordsContaining(words, x);
        System.out.println("Indices of words containing the character'" + x + "': " + indices);
    }
}
