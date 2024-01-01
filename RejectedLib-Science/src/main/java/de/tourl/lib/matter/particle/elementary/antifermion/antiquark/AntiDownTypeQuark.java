package de.tourl.lib.matter.particle.elementary.antifermion.antiquark;

public interface AntiDownTypeQuark extends AntiQuark {

    static AntiDownTypeQuark of(double mass, int generation) {

        return new AntiDownTypeQuark() {

            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return 1. / 3;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
