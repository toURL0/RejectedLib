package de.tourl.lib.matter.particle.nucleus;

import de.tourl.lib.matter.attributes.Charge;
import de.tourl.lib.matter.attributes.Mass;
import de.tourl.lib.matter.attributes.Spin;
import de.tourl.lib.matter.particle.Particle;
import de.tourl.lib.matter.particle.elementary.ElementaryParticle;
import de.tourl.lib.matter.particle.elementary.ParticleModle;

import java.util.Arrays;

public interface Nucleon extends Particle, Mass, Spin, Charge {

    static final Nucleon PROTON = new Nucleon() {
        @Override
        public String name() {

            return "proton";
        }

        @Override
        public ElementaryParticle[] getQuarks() {

            return new ElementaryParticle[]{ParticleModle.STANDARD.getUp(), ParticleModle.STANDARD.getUp(), ParticleModle.STANDARD.getDown()};
        }

        @Override
        public double getMass() {
            return 938.2720813e6;
        }
    };
    static final Nucleon NEUTRON = new Nucleon() {
        @Override
        public String name() {

            return "neutron";
        }

        @Override
        public ElementaryParticle[] getQuarks() {

            return new ElementaryParticle[]{ParticleModle.STANDARD.getUp(), ParticleModle.STANDARD.getDown(), ParticleModle.STANDARD.getDown()};
        }

        @Override
        public double getMass() {
            return 939.5654133e6;
        }
    };

    String name();

    @Override
    default double getSpin() {

        return Arrays.stream(getQuarks()).mapToDouble(Spin::getSpin).sum() % 1;
    }

    ElementaryParticle[] getQuarks();

    @Override
    default double getCharge() {

        return Arrays.stream(getQuarks()).mapToDouble(Charge::getCharge).sum();
    }
}
