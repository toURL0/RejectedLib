package de.tourl.lib.matter.particle.atom;

import de.tourl.lib.matter.attributes.Charge;
import de.tourl.lib.matter.attributes.Mass;
import de.tourl.lib.matter.particle.Particle;
import de.tourl.lib.matter.particle.elementary.ElementaryParticle;
import de.tourl.lib.matter.particle.elementary.ParticleModle;
import de.tourl.lib.matter.particle.nucleus.Nucleus;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Atom implements Particle, Charge, Mass {

    private final Nucleus nucleus;
    private final ElementaryParticle chargedLepton;
    private int charge;

    public Atom(Nucleus nucleus, int electrons) {

        this(nucleus, ParticleModle.STANDARD.getElectron(), electrons);
    }

    @Override
    public double getCharge() {
        return nucleus.getCharge() + charge;
    }

    @Override
    public double getMass() {
        return 0;
    }
}
