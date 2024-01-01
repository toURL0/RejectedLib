package de.tourl.lib.matter.particle.elementary.antifermion.antilepton;

public interface AntiChargedLepton extends AntiLepton {

    static AntiChargedLepton of(double mass, int generation) {

        return new AntiChargedLepton() {

            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return 1;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
