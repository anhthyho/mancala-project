
public class ModelTest {

	public static void main(String[] args)
	{
		DataModel model = new DataModel();
		
		
		model.Add(1, 4);
		model.Add(2, 4);
		model.Add(3, 4);
		model.Add(4, 4);
		model.Add(5, 4);
		model.Add(6, 4);
		model.Add(8, 4);
		model.Add(9, 4);
		model.Add(10, 4);
		model.Add(11, 4);
		model.Add(12, 4);
		model.Add(13, 4);
		
		for(int i = 0; i < 14; i++)
		{
			System.out.println("Pit: " + i + " Stones: " + model.getVal(i));
		}
		
		model.Select(5);
		
		for(int i = 0; i < 14; i++)
		{
			System.out.println("Pit: " + i + " Stones: " + model.getVal(i));
		}
		
		model.Undo();
		
		for(int i = 0; i < 14; i++)
		{
			System.out.println("Pit: " + i + " Stones: " + model.getVal(i));
		}

	}

}
