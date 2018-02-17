package musicaIInstuments;

class StringedInstruments
extends MusicalInstrument{
    private int numberOfStrings;
    public StringedInstruments(){

        super("I'm string instrument");
    }
    public StringedInstruments(int n){
        this();
        numberOfStrings = n;
    }
    @Override
    public void getProperties(){
        System.out.println(String.format("Properties: \nsound: %s \nnumber of strings: %d",
                (new StringedInstruments()).getSound(), numberOfStrings));
    }
    public int getNumberOfStrings(){
        return numberOfStrings;
    }
}
