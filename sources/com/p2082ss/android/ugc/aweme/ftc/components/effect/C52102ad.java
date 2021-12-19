package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.C52125f;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.ad */
final /* synthetic */ class C52102ad implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120022a;

    static {
        Covode.recordClassIndex(61483);
    }

    C52102ad(C52125f fVar) {
        this.f120022a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120022a;
        C88296t tVar = (C88296t) obj;
        if (tVar == null) {
            return;
        }
        if (tVar.f200366a == 0) {
            fVar.mo87850b();
            C88292p value = fVar.f120094d.getValue();
            if (fVar.f120114x.getVisibility() == 0) {
                fVar.f120083V.post(fVar.f120090ac);
            } else if (value == null || value.f200341g != 0 || C89219l.m154714a((Object) "trans", (Object) value.f200348n)) {
                fVar.f120069H = new C52125f.RunnableC52132a();
                fVar.f120098h.post(fVar.f120069H);
            } else {
                fVar.f120068G = new C52125f.RunnableC52133b(value.f200335a[0]);
                fVar.f120098h.post(fVar.f120068G);
            }
        } else {
            fVar.mo87850b();
        }
    }
}
