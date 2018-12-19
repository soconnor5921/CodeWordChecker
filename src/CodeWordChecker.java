public class CodeWordChecker implements StringChecker
{
    private int min;
    private int max;
    private String word;

    public CodeWordChecker(int min, int max, String word)
    {
        this.min = min;
        this.max = max;
        this.word = word;
    }

    public CodeWordChecker(String word)
    {
        min = 6;
        max = 20;
        this.word = word;
    }

    public boolean isValid(String str)
    {
        if(str.length() >= min && str.length() <= max && !str.contains(word))
        {
            return true;
        }
        return false;
    }
}
