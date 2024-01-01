package de.tourl.lib.matter.attributes;

public interface Mass {

    //TODO Value
    default double getRelativeMass(double velocity) {

        return getMass() / Math.sqrt(1 - Math.pow(velocity / 299792458, 2));//TODO
    }

    double getMass();
}
