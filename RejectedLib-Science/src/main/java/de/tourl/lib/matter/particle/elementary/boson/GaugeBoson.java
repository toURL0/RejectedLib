package de.tourl.lib.matter.particle.elementary.boson;

public interface GaugeBoson extends Boson {

    static GaugeBoson of(double charge, double mass) {

        return new GaugeBoson() {
            @Override
            public double getCharge() {
                return charge;
            }

            @Override
            public double getMass() {
                return mass;
            }

            @Override
            public double getSpin() {
                return 1;
            }
        };
    }
}
