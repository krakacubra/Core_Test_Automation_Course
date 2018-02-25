package musicaIInstuments;

public class Contrabass
        extends StringedInstruments{
    Contrabass(){
        super(4);
        setSound("I'm contrabas");
    }
    @Override
    public void getProperties(){
        System.out.println(String.format("Properties: \nsound: %s \nnumber of strings: %d",
                this.getSound(), this.getNumberOfStrings()));
    }
}
