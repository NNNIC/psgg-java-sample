import java.util.function.Consumer;

public class TestControl extends StateManager {
	
	// [SYN-G-GEN OUTPUT START] indent[4] $/./$
//  psggConverterLib.dll converted from TestControl.xlsx. 
    /*
        S_0001
        new state
    */
    Consumer<Boolean> S_0001=(bFirst)->{
        int x = 1;
        if (x==1) { this.SetNextState( this.S_END ); }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_END
    */
    Consumer<Boolean> S_END=(bFirst)->{
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_START
    */
    Consumer<Boolean> S_START=(bFirst)->{
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_0001);
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };


	// [SYN-G-GEN OUTPUT END]

	public void Start()
    {
        this.Goto(S_START);
    }
    public Boolean IsEnd()     
    { 
        return this.CheckState(this.S_END);
	}

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
    
}
