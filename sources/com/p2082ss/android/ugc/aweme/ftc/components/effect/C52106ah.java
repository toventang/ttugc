package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.effect.C46371s;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88297u;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.ah */
final /* synthetic */ class C52106ah implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120028a;

    static {
        Covode.recordClassIndex(61487);
    }

    C52106ah(C52125f fVar) {
        this.f120028a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120028a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            fVar.f120072K = booleanValue;
            if (!booleanValue) {
                fVar.f120109s.setVisibility(8);
                fVar.f120110t.setVisibility(8);
            }
            C46371s.m89467a(fVar.f120102l, booleanValue, fVar.mo87860g(), fVar.f120070I, new C52110al(fVar, booleanValue));
            if (booleanValue) {
                if (fVar.f120088aa != null) {
                    fVar.f120088aa.mo87533b(fVar.f120089ab);
                }
                if (fVar.f120100j != null) {
                    fVar.f120095e.setValue(C88296t.m153438b(0));
                    fVar.mo87843a(0, false);
                    fVar.mo87864k();
                }
                fVar.mo87865l();
                if (fVar.f120065D == null) {
                    fVar.f120065D = new C52151x(fVar);
                    fVar.f120062A.mo56344c(fVar.f120065D);
                }
            } else if (fVar.f120088aa != null) {
                fVar.f120088aa.mo87535c(fVar.f120089ab);
            }
            if (bool.booleanValue()) {
                fVar.f120085X.mo78860k().setValue(C88297u.m153440a(C77795c.m135910a(true, false, false, false), fVar.mo87859f() + C70636dh.m124833c(fVar.f120073L), fVar.mo87860g(), fVar.mo87866m(), C33398a.f79357a.mo59453d()));
                fVar.f120114x.mo111175o();
                return;
            }
            fVar.f120085X.mo78860k().setValue(C88297u.m153443b(C0643b.m2378c(fVar.f120073L, R.color.a2), fVar.mo87859f() + C70636dh.m124833c(fVar.f120073L), fVar.mo87860g(), fVar.mo87866m(), C33398a.f79357a.mo59453d()));
        }
    }
}
