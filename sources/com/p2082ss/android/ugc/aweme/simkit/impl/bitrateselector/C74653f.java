package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34849b;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.C34855f;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.EnumC34857g;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74630a;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74665r;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.f */
public final class C74653f {

    /* renamed from: a */
    private AbstractC34849b f167800a;

    /* renamed from: b */
    private C34855f f167801b;

    /* renamed from: c */
    private int f167802c = C74646b.f167790a;

    /* renamed from: d */
    private C74669t f167803d = new C74669t();

    static {
        Covode.recordClassIndex(87476);
    }

    /* renamed from: a */
    public final synchronized boolean mo117462a() {
        MethodCollector.m26663i(10663);
        if (this.f167801b == null || this.f167802c != C74646b.f167790a) {
            RateSettingsResponse a = C74665r.C74667a.f167829a.mo117469a();
            C34855f fVar = null;
            if (a != null) {
                int i = C74646b.f167790a;
                if (i == 2) {
                    a.getHighBitrateCurve();
                    C34855f.C34856a aVar = new C34855f.C34856a(C74630a.C74641f.m131091a(a.getAdaptiveGearGroup()));
                    aVar.f82314f = C74669t.m131130a();
                    aVar.f82312d = C74630a.C74631a.m131064a(a.getHighBitrateCurve());
                    aVar.f82311c = C74630a.C74633b.m131070a(a.getBandwidthSet());
                    aVar.f82310b = C74630a.C74645h.m131099a(a.getGearSet());
                    fVar = aVar.mo61719a();
                } else if (i != 3) {
                    a.getAutoBitrateSet();
                    C34855f.C34856a aVar2 = new C34855f.C34856a(C74630a.C74641f.m131091a(a.getAdaptiveGearGroup()));
                    aVar2.f82314f = C74669t.m131130a();
                    aVar2.f82312d = C74630a.C74631a.m131064a(a.getAutoBitrateSet());
                    aVar2.f82311c = C74630a.C74633b.m131070a(a.getBandwidthSet());
                    aVar2.f82310b = C74630a.C74645h.m131099a(a.getGearSet());
                    fVar = aVar2.mo61719a();
                } else {
                    C34855f.C34856a aVar3 = new C34855f.C34856a(null);
                    aVar3.f82314f = EnumC34857g.LOWEST;
                    fVar = aVar3.mo61719a();
                }
            }
            this.f167801b = fVar;
            if (fVar == null) {
                MethodCollector.m26664o(10663);
                return false;
            }
            this.f167800a.mo61715a(fVar);
            this.f167802c = C74646b.f167790a;
            MethodCollector.m26664o(10663);
            return true;
        }
        MethodCollector.m26664o(10663);
        return true;
    }

    public C74653f(AbstractC34849b bVar) {
        this.f167800a = bVar;
    }
}
