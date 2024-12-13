package pkg;

public class Movie{
    // Global Variables
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
    // Constructors
    public Movie(){
        this.movieName = "Avengers";
        this.rating = 8.0;
        this.numRatings = 33;
        this.revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    // Get and Set Methods
    public String getMovieName(){
        return movieName;
    }
    
    public double getRating(){
        return rating;
    }
    
    public int getNumRatings(){
        return numRatings;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
    
    public void setNumRatings(int numRatings){
        this.numRatings = numRatings;
    }
    
    public void setRevenue(int revenue){
        this.revenue = revenue;
    }
    
    // Methods
    public void movieToString(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    
    public void addRating(double rating){
        this.rating = ((this.rating * numRatings) + rating) / (numRatings + 1);
        this.numRatings++;
    }
    
    public boolean compareRatings(Movie movie){
        return this.rating > movie.rating;
    }
    
    public String revenueToString(){
        String numString = "";
        int idx = 1;
        int commaIdx = 1;
        while (this.revenue / idx > 1){
            numString = (this.revenue / idx) % 10 + numString;
            
            if (commaIdx % 3 == 0 && this.revenue / (idx * 10) > 1){
                numString = "," + numString;
            }
            
            commaIdx++;
            idx = idx * 10;
        }
        return numString;
    }
    
    public Movie pirateMovie(){
        return this;
    }
}
