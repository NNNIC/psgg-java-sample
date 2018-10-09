import java.io.*;
import java.util.function.Consumer;

public class TestControl extends StateManager {
	
	Boolean m_bYesNo;
	
	void br_YES(Consumer<Boolean> st)
	{
		if (!this.HasNextState())
		{
			if (this.m_bYesNo)
			{
				this.SetNextState(st);
			}
		}
	}

	void br_NO(Consumer<Boolean> st)
	{
		if (!this.HasNextState())
		{
			if (!this.m_bYesNo)
			{
				this.SetNextState(st);
			}
		}
	}
	
	// write your code 
	
	void ask_drink()
	{
		System.out.println("Would you like to have anything to drink?");
	}

	void get_input()
	{
		try {
			m_bYesNo = false;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String s = new String(in.readLine());
			if (s.length()>0)
			{
				m_bYesNo = (s.substring(0,1).equals("y"));
			}
		} catch (IOException e) {
			System.out.println("Unexpected!");
		}
	}

	void give_drink()
	{
		System.out.println("How about a coke? [y|n]");
	}

	void askanytime()
	{
		System.out.println("Ask me anytime, when you want.");
	}
}
