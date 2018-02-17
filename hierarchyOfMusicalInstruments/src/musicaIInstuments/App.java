package musicaIInstuments;

public class App {
    public static void main(String[] args){
        Violin violin = new Violin();
        StringedInstruments contrabass = new Contrabass();  // наследование
        MusicalInstrument balalaika = new Balalaika();     // наследование
        StringedInstruments stringedInstrument1 = new StringedInstruments(3);
        MusicalInstrument stringedInstrument2 = new StringedInstruments();
        MusicalInstrument musicalInstrument = new MusicalInstrument("tu-tu-tu");
        violin.getProperties();                 // полиморфизм
        contrabass.getProperties();             // полиморфизм
        balalaika.getProperties();              // полиморфизм
        stringedInstrument1.getProperties();    // полиморфизм
        stringedInstrument2.getProperties();
        musicalInstrument.getProperties();
       // balalaika.sound = "dryn", // ошибка, sound - private поле - инкапсуляция
    }
}
