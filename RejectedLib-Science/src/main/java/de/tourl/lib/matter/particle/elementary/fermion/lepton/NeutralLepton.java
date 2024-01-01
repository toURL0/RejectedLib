package de.tourl.lib.matter.particle.elementary.fermion.lepton;

public interface NeutralLepton extends Lepton {

    static NeutralLepton of(double mass, int generation) {

        return new NeutralLepton() {

            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return 0;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
