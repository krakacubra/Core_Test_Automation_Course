package musicaIInstuments;

import java.util.Properties;

class MusicalInstrument {
    private String sound;
    {
        sound = "Im a musical instrument";
    }
    MusicalInstrument(){

    }
    MusicalInstrument(String sound){
        this.sound = sound;
    }


    public String getSound() {
        return sound;
    }

    protected void setSound(String sound) {
        this.sound = sound;
    }
    public void getProperties(){
        System.out.println(String.format("Properties: \nsound: %s", sound));
    }

}
