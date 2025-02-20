//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Walmart");
		story="I punched Walmart in a massive way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadAdjectives();
		loadNouns();
		loadVerbs();

		//read first from story.string
		//scanner
		// check if it is any simblas
		//#nouns , @verb, &adj, else, concatonate back to story
		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol
			while words are not #,&,@ print
				print the more words
				if there is # make random noun before putting out more words keep read
				else if there is @ make random verb before putting out more words keep read
				else if there is & make random adjective before putting put adjective then keep read
				else
				put words out
				//If what was read in is one of the symbols, find a random
				//word to replace it.
			


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner rader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext())
				nouns.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner rader = new Scanner(new File("verbs.dat"));

			while(reader.hasNext())
				verbs.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner rader = new Scanner(new File("adjectives.dat"));

			while(reader.hasNext())
				adjectives.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int rv = (int)(Math.random()*verbs.size());
		return "" +verbs.get(spot);
	}

	public String getRandomNoun()
	{
		Random rand = new Random();

		return "" + nouns.get(rand.nextInt(nouns.size()));
	}

	public String getRandomAdjective()
	{
		Random randa = new Random();
		return "" + adjectives.get(randa.nextInt((adjectives.size())));
	}

	public String toString()
	{
		return "" + story;
	}
}