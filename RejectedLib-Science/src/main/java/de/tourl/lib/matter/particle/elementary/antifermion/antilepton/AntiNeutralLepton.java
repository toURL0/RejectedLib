package de.tourl.lib.matter.particle.elementary.antifermion.antilepton;

public interface AntiNeutralLepton extends AntiLepton {

    static AntiNeutralLepton of(double mass, int generation) {

        return new AntiNeutralLepton() {

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
