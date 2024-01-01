package de.tourl.lib.matter.particle.nucleus;

import de.tourl.lib.matter.attributes.Charge;
import de.tourl.lib.matter.attributes.Mass;
import de.tourl.lib.matter.attributes.Spin;
import de.tourl.lib.matter.particle.Particle;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Nucleus implements Particle, Charge, Mass {

    private final int chargedNucleons, neutralNucleons;
    private final Nucleon chargedNucleon;
    private final Nucleon neutralNucleon;

    public Nucleus(int protons, int mass) {

        this(protons, mass - protons, Nucleon.PROTON, Nucleon.NEUTRON);
    }

    @Override
    public double getCharge() {

        return chargedNucleon.getCharge() * chargedNucleons;
    }

    @Override
    public double getMass() {
        return 0;
    }//TODO
}
