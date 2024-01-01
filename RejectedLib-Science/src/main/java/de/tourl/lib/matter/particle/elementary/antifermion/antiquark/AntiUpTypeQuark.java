package de.tourl.lib.matter.particle.elementary.antifermion.antiquark;

public interface AntiUpTypeQuark extends AntiQuark {

    static AntiUpTypeQuark of(double mass, int generation) {

        return new AntiUpTypeQuark() {
            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return -2. / 3;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
