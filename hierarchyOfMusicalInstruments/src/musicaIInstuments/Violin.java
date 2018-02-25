package musicaIInstuments;

public class Violin
        extends StringedInstruments{

    public Violin(){
        super(4);
        setSound("I'm violin");
    }
    @Override
    public void getProperties(){
        System.out.println(String.format("Properties: \nsound: %s \nnumber of strings: %d",
                this.getSound(), this.getNumberOfStrings()));
    }

}
