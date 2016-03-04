package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by matthieu.villard on 04.03.2016.
 */
public class Orchestra
{
    LinkedList<IInstrument> instruments;

    public Orchestra(){
        instruments = new LinkedList<IInstrument>();
    }

    public int getNumberOfInstruments(){
        return instruments.size();
    }

    public void addInstrument(IInstrument instrument){
        instruments.add(instrument);
    }

    public List<String> makeMusic(){
        List<String> sounds = new LinkedList<String>();
        for(IInstrument instrument : instruments){
            sounds.add(instrument.play());
        }
        return sounds;
    }
}
