//  psggConverterLib.dll converted from TestControl.xlsx. 
import java.util.function.Consumer;
public class TestControl_created extends TestControl {

    public void Start()
    {
        Goto(this.S_START);
    }
    public Boolean IsEnd()
    {
        return CheckState(this.S_END);
    }


    /*
        S_START
    */
    Consumer<Boolean> S_START=(bFirst)->{
        if (bFirst) {
        }
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_ASK);
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_END
    */
    Consumer<Boolean> S_END=(bFirst)->{
        if (bFirst) {
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_ASK
    */
    Consumer<Boolean> S_ASK=(bFirst)->{
        if (bFirst) {
            this.ask_drink();
        }
        if (!this.HasNextState())
        {
            this.SetNextState(this.S_INPUT);
        }
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_INPUT
    */
    Consumer<Boolean> S_INPUT=(bFirst)->{
        if (bFirst) {
            this.get_input();
        }
        this.br_YES(this.S_YES);
        this.br_NO(this.S_NO);
        if (this.HasNextState())
        {
            this.GoNextState();
        }
    };
    /*
        S_YES
    */
    Consumer<Boolean> S_YES=(bFirst)->{
        if (bFirst) {
            this.give_drink();
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
        S_NO
    */
    Consumer<Boolean> S_NO=(bFirst)->{
        if (bFirst) {
            this.askanytime();
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

}

