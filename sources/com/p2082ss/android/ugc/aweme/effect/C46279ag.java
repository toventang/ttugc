package com.p2082ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88300w;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.effect.ag */
final /* synthetic */ class C46279ag implements AbstractC1729g {

    /* renamed from: a */
    private final C46267ac f107914a;

    static {
        Covode.recordClassIndex(54856);
    }

    C46279ag(C46267ac acVar) {
        this.f107914a = acVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C46267ac acVar = this.f107914a;
        if (!iVar.mo5535a() || !((Boolean) iVar.mo5545d()).booleanValue()) {
            acVar.f107879g.setValue(false);
            return null;
        }
        acVar.f107879g.setValue(true);
        if (acVar.f107852M == null || !TextUtils.equals("1", acVar.f107852M.getKey()) || !acVar.f107850K) {
            return null;
        }
        C88292p value = acVar.f107876d.getValue();
        if (value != null && value.f200341g == 0) {
            C88292p a = C88292p.m153426a((long) acVar.f107840A.mo56370k());
            a.f200342h = acVar.f107841B.mo78736c();
            acVar.f107876d.setValue(a);
        }
        acVar.mo78768l();
        C88300w b = C88300w.m153453b();
        acVar.f107882j.setOverlayColor(acVar.f107844E);
        acVar.f107878f.setValue(b);
        acVar.mo78767k();
        return null;
    }
}
