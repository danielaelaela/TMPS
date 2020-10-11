package md.sdtmlab;

import md.sdtmlab.factory.BeginnerMusicalInstrumentFactory;
import md.sdtmlab.factory.MusicalInstrumentFactory;
import md.sdtmlab.factory.ProfessionalMusicalInstrumentFactory;
import md.sdtmlab.model.DrumKit;
import md.sdtmlab.model.Guitar;
import md.sdtmlab.model.Piano;

public class Main {

    public static void main(String[] args) {
        composeBand("BeginnersOnly", new BeginnerMusicalInstrumentFactory());
        composeBand("ProfessionalsOnly", new ProfessionalMusicalInstrumentFactory());
    }

    private static void composeBand(
            String bandName,
            MusicalInstrumentFactory instrumentFactory) {

        Guitar guitar = instrumentFactory.createGuitar();
        Piano piano = instrumentFactory.createPiano();
        DrumKit drums = instrumentFactory.createDrumKit();

        System.out.println("Welcome band '" + bandName + "'!");
        System.out.println("With guitar of model - " + guitar.getModel());
        System.out.println("With piano of model - " + piano.getModel());
        System.out.println("With drum kit of model - " + drums.getModel());
        System.out.println();
    }
}
