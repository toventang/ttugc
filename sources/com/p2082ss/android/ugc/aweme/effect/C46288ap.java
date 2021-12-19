package com.p2082ss.android.ugc.aweme.effect;

import androidx.core.p036g.AbstractC0688a;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.ap */
public final /* synthetic */ class C46288ap implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107923a;

    static {
        Covode.recordClassIndex(54865);
    }

    public C46288ap(C46267ac acVar) {
        this.f107923a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107923a;
        C88292p pVar = (C88292p) obj;
        if (pVar != null) {
            long j = pVar.f200337c;
            if (pVar.f200341g == 0) {
                try {
                    acVar.f107882j.mo78717a(pVar.f200335a[0], pVar.f200339e, pVar.f200343i, pVar.f200342h);
                } catch (NullPointerException e) {
                    throw new NullPointerException(e.getMessage() + " " + pVar.toString());
                }
            } else if (pVar.f200341g == 5) {
                acVar.mo78748a(C46344a.m89395a(pVar.f200339e, pVar.f200340f), true, true);
            } else if (pVar.f200341g == 7) {
                acVar.f107896x.mo111135a(false, true, (AbstractC0688a<Void>) null);
            } else if (pVar.f200341g == 8) {
                acVar.mo78757c(false);
                acVar.mo78755b(true);
                acVar.mo78744a((int) pVar.f200339e, (int) pVar.f200340f);
                acVar.f107896x.mo111135a(false, true, (AbstractC0688a<Void>) new C46318bd(acVar, pVar, j));
            } else {
                ArrayList<EffectPointModel> effectPointModels = acVar.f107882j.getEffectPointModels();
                if (pVar.f200341g == 1) {
                    if (!effectPointModels.isEmpty()) {
                        acVar.f107882j.mo78716a(effectPointModels.get(effectPointModels.size() - 1).getIndex(), pVar.f200340f);
                    }
                } else if (pVar.f200341g == 2) {
                    acVar.mo78743a(pVar.f200335a[0]);
                } else if (pVar.f200341g == 3) {
                    if (acVar.f107877e != null) {
                        acVar.f107877e.setValue(C88296t.m153438b(0));
                    }
                    acVar.mo78745a((int) acVar.f107841B.mo78733a(0), false);
                    acVar.f107882j.f107820b.clear();
                } else if (pVar.f200341g == 4 && acVar.f107857R != null) {
                    for (int length = pVar.f200335a.length - 1; length >= 0; length--) {
                        acVar.mo78743a(pVar.f200335a[length]);
                    }
                }
            }
        }
    }
}
