import java.util.function.Consumer;

public class TestControl extends StateManager {
	
	// [SYN-G-GEN OUTPUT START] indent[4] $/./$
//  psggConverterLib.dll converted from TestControl.xlsx. 
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
        S_GET_NUM
    */
    int m_num = -1;
    Consumer<Boolean> S_GET_NUM=(bFirst)->{
        if (bFirst) {
            m_num = 11;
        }
        if (m_num==10) { this.SetNextState( this.S_GET_NUM1 ); }
        else if (m_num==1) { this.SetNextState( this.S_GET_NUM3 ); }
        else { this.SetNextState( this.S_GET_NUM2 ); }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_GET_NUM1
        new state
    */
    Consumer<Boolean> S_GET_NUM1=(bFirst)->{
        if (bFirst) {
            System.out.println("==10!!");
        }
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_END);
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_GET_NUM2
        new state
    */
    Consumer<Boolean> S_GET_NUM2=(bFirst)->{
        if (bFirst) {
            System.out.println("Nothing");
        }
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_END);
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_GET_NUM3
        new state
    */
    Consumer<Boolean> S_GET_NUM3=(bFirst)->{
        if (bFirst) {
            System.out.println("Nothing");
        }
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_END);
        }
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
            this.SetNextState(this.S_GET_NUM);
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
