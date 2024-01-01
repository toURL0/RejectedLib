package de.tourl.lib.matter.particle.elementary.fermion.quack;

public interface UpTypeQuark extends Quark {

    static UpTypeQuark of(double mass, int generation) {

        return new UpTypeQuark() {
            @Override
            public int getGeneration() {
                return generation;
            }

            @Override
            public double getCharge() {
                return 2. / 3;
            }

            @Override
            public double getMass() {
                return mass;
            }
        };
    }
}
