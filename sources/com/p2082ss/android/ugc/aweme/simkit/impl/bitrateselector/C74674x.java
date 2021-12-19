package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.bitrateselector.impl.C34873c;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74665r;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81973c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81975d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81977e;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84257b;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.x */
public final class C74674x implements AbstractC84257b {

    /* renamed from: a */
    private AbstractC81981g f167836a;

    /* renamed from: b */
    private int f167837b = C74646b.f167790a;

    static {
        Covode.recordClassIndex(87497);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4327b.AbstractC84257b
    /* renamed from: a */
    public final synchronized AbstractC81981g mo117463a() {
        MethodCollector.m26663i(9509);
        if (C74665r.C74667a.f167829a.mo117469a() == null) {
            MethodCollector.m26664o(9509);
            return null;
        }
        if (this.f167836a == null || this.f167837b != C74646b.f167790a) {
            RateSettingsResponse a = C74665r.C74667a.f167829a.mo117469a();
            int i = C74646b.f167790a;
            if (i == 2) {
                m131139a(a.getHighBitrateCurve());
                a.getHighBitrateCurve();
            } else if (i == 3) {
                this.f167836a = new C81977e();
            } else if (i != 4) {
                m131139a(a.getAutoBitrateSet());
                a.getAutoBitrateSet();
            } else {
                this.f167836a = new C81973c(a.getLowQltyCurv(), a.getAdaptiveGearGroup());
            }
            this.f167837b = C74646b.f167790a;
        }
        AbstractC81981g gVar = this.f167836a;
        MethodCollector.m26664o(9509);
        return gVar;
    }

    /* renamed from: a */
    private void m131139a(AbstractC81962a aVar) {
        RateSettingsResponse a = C74665r.C74667a.f167829a.mo117469a();
        if (C84199c.f187979a.getBitrateModelThreshold() != -1.0d) {
            this.f167836a = new C81975d.C81976a(a.getAdaptiveGearGroup()).mo127143a(a.getGearSet()).mo127144b(a.getBandwidthSet()).mo127142a(aVar).mo61745a();
        } else {
            this.f167836a = new C34873c.C34874a(a.getAdaptiveGearGroup()).mo127143a(a.getGearSet()).mo127144b(a.getBandwidthSet()).mo127142a(aVar).mo61745a();
        }
    }
}
