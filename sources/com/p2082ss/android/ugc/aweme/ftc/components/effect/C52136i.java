package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88300w;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.i */
public final /* synthetic */ class C52136i implements AbstractC1729g {

    /* renamed from: a */
    private final C52125f f120130a;

    static {
        Covode.recordClassIndex(61517);
    }

    C52136i(C52125f fVar) {
        this.f120130a = fVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C52125f fVar = this.f120130a;
        if (!iVar.mo5535a() || !((Boolean) iVar.mo5545d()).booleanValue()) {
            fVar.f120097g.setValue(false);
            return null;
        }
        fVar.f120097g.setValue(true);
        if (fVar.f120074M == null || !TextUtils.equals("1", fVar.f120074M.getKey()) || !fVar.f120072K) {
            return null;
        }
        C88292p value = fVar.f120094d.getValue();
        if (value != null && value.f200341g == 0) {
            C88292p a = C88292p.m153426a((long) fVar.f120062A.mo56370k());
            a.f200342h = fVar.f120063B.mo78736c();
            fVar.f120094d.setValue(a);
        }
        fVar.mo87863j();
        C88300w b = C88300w.m153453b();
        fVar.f120100j.setOverlayColor(fVar.f120066E);
        fVar.f120096f.setValue(b);
        fVar.mo87862i();
        return null;
    }
}
