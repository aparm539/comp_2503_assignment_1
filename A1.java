import java.util.ArrayList;
import java.util.Scanner;

/**
 * COMP 2503 Fall 2023 Assignment 1
 * 
 * This program reads a input stream and keeps track of the statistics for avengers
 * mentioned by name, alias, or performer's last name.
 *
 * @author Maryam Elahi
 * @date Fall 2023
 */

public class A1 {

	public String[][] avengerRoster = { { "captainamerica", "rogers", "evans" }, { "ironman", "stark", "downey" },
			{ "blackwidow", "romanoff", "johansson" }, { "hulk", "banner", "ruffalo" },
			{ "blackpanther", "tchalla", "boseman" }, { "thor", "odinson", "hemsworth" },
			{ "hawkeye", "barton", "renner" }, { "warmachine", "rhodes", "cheadle" },
			{ "spiderman", "parker", "holland" }, { "wintersoldier", "barnes", "stan" } };

	private int topN = 4;
	private Scanner input = new Scanner(System.in);
	private int totalwordcount = 0;
	private ArrayList<Avenger> avengersArrayList = new ArrayList<>();

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.run();
	}

	public void run() {
		readInput();
		printResults();
	}

	/**
	 * read the input stream and keep track  
	 * how many times avengers are mentioned by alias or last name or performer's last name.
	 */
	private void readInput() {
		while (input.hasNext()){
			String current = input.next();
			current = formatString(current);
			if (current.length() > 0){
				totalwordcount+=1;
				if (isAvenger(current)){
					wasMentioned(current);
				}
			}
		}
	}
	private Boolean isAvenger(String val){
		for (String [] alias:avengerRoster) {
			for (String name : alias) {
				if (val.contains(name)) {
					return true;
				}
			}
		}
		return false;
	}
	private Boolean wasMentioned(String name){
		try {
			for (Avenger avenger : avengersArrayList) {
				if (avenger.getHeroAlias().equals(name)) {
					avenger.setAliasFreq(avenger.getAliasFreq() + 1);
					return true;
				} else if (avenger.getHeroName().equals(name)) {
					avenger.setNameFreq(avenger.getNameFreq() + 1);
					return true;
				} else if (avenger.getPerformer().equals(name)) {
					avenger.setPerformerFreq(avenger.getPerformerFreq() + 1);
					return true;
				}
			}
		}
		catch (Exception e){
			//avengersArrayList.add(new Avenger(name));
			return false;
		}
		return null;
	}
	private String formatString(String avenger){
		if (isAvenger(avenger)){
			if (avenger.contains("'")){
				String[] arrOfStr = avenger.split("'");
				avenger = arrOfStr[0];
			}
			avenger = avenger.replaceAll("[^a-zA-Z]","")
					.toLowerCase()
					.trim();
		}
		return avenger;
	}

	/**
	 * print the results
	 */
	private void printResults() {
		/*
		 * Make sure your format matches the sample output exactly. 
		 * No extra empty lines, or text. Use the diff command to check if your output matches the sample outputs.
		 */
		System.out.println("Total number of words: " + totalwordcount);
		System.out.println("Number of Avengers Mentioned: " + avengersArrayList.size());
		System.out.println();

		// Print all ordered by appearance
		System.out.println("All avengers in the order they appeared in the input stream:");
		// Todo: Print the list of avengers in the order they appeared in the input
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		// Print all ordered by AvengerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular avengers:");
		// Todo: Print the topN most popular avengers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output
		System.out.println();

		// Print top n ordered by AvengerPerformerComparatorFreqDesc
		System.out.println("Top " + topN + " most popular performers:");
		// Todo: Print the topN most popular performers, see the instructions for tie breaking
		// Make sure you follow the formatting example in the sample output	
		System.out.println();

		// Print all ordered by alias alphabetically
		System.out.println("All mentioned avengers in alphabetical order:");
		// Todo: Print the list of avengers in alphabetical order
		// Make sure you follow the formatting example in the sample output
		System.out.println();
	}
}
