import java.util.*;

public class DataModel {

	final int MAX_PER_PIT = 4;
	
	ArrayList<Integer> pits;
	
	int pitNumber;
	int pitState;
	
	/**
	 * Constructor
	 */
	public DataModel()
	{
		pits = new ArrayList<Integer>(Collections.nCopies(14, 0));
		pitState = 0;
		pitNumber = 0;
	}
	
	/**
	 * Return number of stone in pit
	 * @param pitNum
	 * @return
	 */
	public int getVal(int pitNum)
	{
		return pits.get(pitNum);
	}
	
	/**
	 * adds to a specific pit
	 * @param index
	 * @param amount
	 */
	public void Add(int index, int amount)
	{
		//0 & 7 refers to side pits with no limit
		if(index == 0 || index == 7)
		{
			pits.set(index, amount + pits.get(index));
			return;
		}
		
		if(amount + pits.get(index) <= MAX_PER_PIT)
		{
			pits.set(index, pits.get(index) + amount);
		}
			
	}
	
	/**
	 * Remove from specific pit
	 * @param pit
	 * @param amount
	 */
	public void Remove(int pit, int amount)
	{
		if(amount <= pits.get(pit))
			pits.set(pit, pits.get(pit) - amount);
		
	}
	
	public void Increment(int pitNum)
	{
		pits.set(pitNum, pits.get(pitNum) + 1);
	}
	
	public void Decrement(int pitNum)
	{
		pits.set(pitNum, pits.get(pitNum) - 1);
	}
	
	/**
	 * Save the state of a pit, call before making move
	 * @param pitNum
	 */
	public void SaveState(int pitNum)
	{
		pitState = pits.get(pitNum);
		pitNumber = pitNum;
	}
	
	/**
	 * Select a pit and increment subsequent pits
	 * @param pitNum
	 */
	public void Select(int pitNum)
	{
		SaveState(pitNum);
		
		pits.set(pitNum, 0);
		
		int index = pitNum + 1;
		
		//revert states of subsequence pits
		for(int i = 0; i < pitState; i++)
		{
			if(index > 13)
				index = 0;
			
			Increment(index);
			index++;
		}
		
	}
	
	
	/**
	 * Revert to previous state
	 */
	public void Undo()
	{
		pits.set(pitNumber, pitState); //set back to previous state
		
		int index = pitNumber + 1;
		
		//revert states of subsequence pits
		for(int i = 0; i < pitState; i++)
		{
			if(index > 13)
				index = 0;
			
			Decrement(index);
			index++;
		}
		
	}
}
