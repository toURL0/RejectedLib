package de.tourl.lib.matter.particle.elementary;

import de.tourl.lib.matter.attributes.Charge;
import de.tourl.lib.matter.attributes.Mass;
import de.tourl.lib.matter.attributes.Spin;
import de.tourl.lib.matter.particle.Particle;

public interface ElementaryParticle extends Particle, Charge, Mass, Spin {

    @Override
    default double getSpin() {
        return 0.5;
    }
}
