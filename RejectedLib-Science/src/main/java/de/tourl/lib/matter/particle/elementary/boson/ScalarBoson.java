package de.tourl.lib.matter.particle.elementary.boson;

public interface ScalarBoson extends Boson {

    static ScalarBoson of(double mass) {

        return new ScalarBoson() {
            @Override
            public double getCharge() {
                return 0;
            }

            @Override
            public double getMass() {
                return mass;
            }

            @Override
            public double getSpin() {
                return 0;
            }
        };
    }
}
