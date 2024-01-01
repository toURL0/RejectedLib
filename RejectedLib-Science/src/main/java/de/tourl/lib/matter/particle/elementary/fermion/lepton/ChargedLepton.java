package de.tourl.lib.matter.particle.elementary.fermion.lepton;

public interface ChargedLepton extends Lepton {

    static ChargedLepton of(double mass, int generation) {

        return new ChargedLepton() {

            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return -1;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
