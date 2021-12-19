package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46267ac;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.ba */
public final /* synthetic */ class C46315ba implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107969a;

    static {
        Covode.recordClassIndex(54892);
    }

    public C46315ba(C46267ac acVar) {
        this.f107969a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107969a;
        C88296t tVar = (C88296t) obj;
        if (tVar == null) {
            return;
        }
        if (tVar.f200366a == 0) {
            acVar.mo78756c();
            C88292p value = acVar.f107876d.getValue();
            if (acVar.f107896x.getVisibility() == 0) {
                acVar.f107861V.post(acVar.f107872ag);
            } else if (value == null || value.f200341g != 0 || C89219l.m154714a((Object) "trans", (Object) value.f200348n)) {
                acVar.f107847H = new C46267ac.RunnableC46274a();
                acVar.f107880h.post(acVar.f107847H);
            } else {
                acVar.f107846G = new C46267ac.RunnableC46275b(value.f200335a[0]);
                acVar.f107880h.post(acVar.f107846G);
            }
        } else {
            acVar.mo78756c();
        }
    }
}
