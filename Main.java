public class Main
{
    public static void main(Strings[] args)
    {
        Reviews[] reviews =
        {
            new Review(4, "Good! Thx"),
            new Review(3, "Ok site"),
            new Review(5, "Great!"),
            new Review(2, "Poor! Bad"),
            new Review(3, ""),
        };
        ReviewAnalysis r = new ReviewAnalysis(reviews);
    }
}
