package musicaIInstuments;

public class Balalaika
        extends StringedInstruments {
    public Balalaika(){
        super(3);
        setSound("I'm balalaika");
    }
    @Override
    public void getProperties(){
        System.out.println(String.format("Properties: \nsound: %s \nnumber of strings: %d",
                this.getSound(), this.getNumberOfStrings()));
    }
}
