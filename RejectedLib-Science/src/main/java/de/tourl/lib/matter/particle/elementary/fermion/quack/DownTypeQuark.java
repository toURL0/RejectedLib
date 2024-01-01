package de.tourl.lib.matter.particle.elementary.fermion.quack;

public interface DownTypeQuark extends Quark {

    static DownTypeQuark of(double mass, int generation) {

        return new DownTypeQuark() {

            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return -1. / 3;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
