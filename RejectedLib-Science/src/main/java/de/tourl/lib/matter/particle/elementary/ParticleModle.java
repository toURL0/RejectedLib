package de.tourl.lib.matter.particle.elementary;

import de.tourl.lib.matter.particle.elementary.antifermion.antilepton.AntiChargedLepton;
import de.tourl.lib.matter.particle.elementary.antifermion.antilepton.AntiNeutralLepton;
import de.tourl.lib.matter.particle.elementary.antifermion.antiquark.AntiDownTypeQuark;
import de.tourl.lib.matter.particle.elementary.antifermion.antiquark.AntiUpTypeQuark;
import de.tourl.lib.matter.particle.elementary.boson.GaugeBoson;
import de.tourl.lib.matter.particle.elementary.boson.ScalarBoson;
import de.tourl.lib.matter.particle.elementary.fermion.lepton.ChargedLepton;
import de.tourl.lib.matter.particle.elementary.fermion.lepton.NeutralLepton;
import de.tourl.lib.matter.particle.elementary.fermion.quack.DownTypeQuark;
import de.tourl.lib.matter.particle.elementary.fermion.quack.UpTypeQuark;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ParticleModle {

    STANDARD(
            2.2e6,
            1.28e9,
            173.1e9,
            4.7e6,
            96e6,
            4.18e9,
            0.511e6,
            105.66e6,
            1.7768e9,
            2.2,
            0.17e6,
            18.2e6,
            91.19e9,
            80.36e9,
            124.97e9
    );

    private final UpTypeQuark up, charm, top;
    private final AntiUpTypeQuark antiup, anticharm, antitop;
    private final DownTypeQuark down, strange, bottom;
    private final AntiDownTypeQuark antidown, antistrange, antibottom;
    private final ChargedLepton electron, muon, tau;
    private final AntiChargedLepton positron, antimuon, antitau;
    private final NeutralLepton electronNeutrino, muonNeutrino, tauNeutrino;
    private final AntiNeutralLepton electronAntiNeutrino, muonAntiNeutrino, tauAntiNeutrino;
    private final GaugeBoson gluon, photon, z, wPlus, wMinus;
    private final ScalarBoson higgs;

    ParticleModle(double massFirstUpTypeQuark,
                  double massSecondUpTypeQuark,
                  double massThirdUpTypeQuark,
                  double massFirstDownTypeQuark,
                  double massSecondDownTypeQuark,
                  double massThirdDownTypeQuark,
                  double massFirstChargedLepton,
                  double massSecondChargedLepton,
                  double massThirdChargedLepton,
                  double massFirstNeutralLepton,
                  double massSecondNeutralLepton,
                  double massThirdNeutralLepton,
                  double massZBoson,
                  double massWBoson,
                  double massHiggsBoson
    ) {

        this.up = UpTypeQuark.of(massFirstUpTypeQuark, 1);
        this.charm = UpTypeQuark.of(massSecondUpTypeQuark, 2);
        this.top = UpTypeQuark.of(massThirdUpTypeQuark, 3);
        //
        this.antiup = AntiUpTypeQuark.of(massFirstUpTypeQuark, 1);
        this.anticharm = AntiUpTypeQuark.of(massSecondUpTypeQuark, 2);
        this.antitop = AntiUpTypeQuark.of(massThirdUpTypeQuark, 3);
        //
        this.down = DownTypeQuark.of(massFirstDownTypeQuark, 1);
        this.strange = DownTypeQuark.of(massSecondDownTypeQuark, 2);
        this.bottom = DownTypeQuark.of(massThirdDownTypeQuark, 3);
        //
        this.antidown = AntiDownTypeQuark.of(massFirstDownTypeQuark, 1);
        this.antistrange = AntiDownTypeQuark.of(massSecondDownTypeQuark, 2);
        this.antibottom = AntiDownTypeQuark.of(massThirdDownTypeQuark, 3);
        //
        this.electron = ChargedLepton.of(massFirstChargedLepton, 1);
        this.muon = ChargedLepton.of(massSecondChargedLepton, 2);
        this.tau = ChargedLepton.of(massThirdChargedLepton, 3);
        //
        this.positron = AntiChargedLepton.of(massFirstChargedLepton, 1);
        this.antimuon = AntiChargedLepton.of(massSecondChargedLepton, 2);
        this.antitau = AntiChargedLepton.of(massThirdChargedLepton, 3);
        //
        this.electronNeutrino = NeutralLepton.of(massFirstNeutralLepton, 1);
        this.muonNeutrino = NeutralLepton.of(massSecondNeutralLepton, 2);
        this.tauNeutrino = NeutralLepton.of(massThirdNeutralLepton, 3);
        //
        this.electronAntiNeutrino = AntiNeutralLepton.of(massFirstNeutralLepton, 1);
        this.muonAntiNeutrino = AntiNeutralLepton.of(massSecondNeutralLepton, 2);
        this.tauAntiNeutrino = AntiNeutralLepton.of(massThirdNeutralLepton, 3);
        //
        this.gluon = GaugeBoson.of(0, 0);
        this.photon = GaugeBoson.of(0, 0);
        this.z = GaugeBoson.of(0, massZBoson);
        this.wPlus = GaugeBoson.of(1, massWBoson);
        this.wMinus = GaugeBoson.of(-1, massWBoson);
        //
        this.higgs = ScalarBoson.of(massHiggsBoson);
    }
}
