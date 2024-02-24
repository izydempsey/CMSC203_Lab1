import java.util.Scanner;

public class MovieDriver
{
	public static void main (String[] args)
	{
		
		Scanner stdin = new Scanner(System.in);
		Movie movie = new Movie();
		
		String answer;
		
		do 
		{
			System.out.println("Enter a movie title: ");
			String title = stdin.nextLine();
			
			System.out.println("Enter the movie rating: ");
			String rating = stdin.nextLine();
			
			System.out.println("Enter the number of tickets sold at theater: ");
			int soldTickets = stdin.nextInt();
			
			Movie userMovie = new Movie(title, rating, soldTickets);
			
			System.out.println(userMovie.toString());
			
			System.out.println("Do you want to enter another? Enter y/n: ");
			stdin.nextLine();
			answer = stdin.nextLine();
			
		} while (answer.equals("y") || answer.equals("Y"));
	}	
}
