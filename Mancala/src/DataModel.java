import java.util.*;

public class DataModel {

	final int MAX_PER_PIT = 4;
	
	Map<String, Integer> pits;
	
	public DataModel()
	{
		pits = new HashMap<String, Integer>();
	}
	
	public void add(String pit, int amount)
	{
		String temp = pit.toUpperCase();
		
		if(temp.contains("AB"))
		{
			pits.put(temp, amount);
			return;
		}
		
		if(amount <= MAX_PER_PIT)
			pits.put(temp, amount);
			

	}
	
	public void remove(String pit, int amount)
	{
		if(amount < pits.get(pit.toUpperCase()))
			pits.put(pit.toUpperCase(), amount);
	}
}
