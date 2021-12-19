package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.p036g.AbstractC0688a;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import dmt.p4542av.video.C88292p;
import dmt.p4542av.video.C88296t;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.s */
final /* synthetic */ class C52146s implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120140a;

    static {
        Covode.recordClassIndex(61527);
    }

    C52146s(C52125f fVar) {
        this.f120140a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120140a;
        C88292p pVar = (C88292p) obj;
        if (pVar != null) {
            long j = pVar.f200337c;
            if (pVar.f200341g == 0) {
                try {
                    fVar.f120100j.mo78717a(pVar.f200335a[0], pVar.f200339e, pVar.f200343i, pVar.f200342h);
                } catch (NullPointerException e) {
                    throw new NullPointerException(e.getMessage() + " " + pVar.toString());
                }
            } else if (pVar.f200341g == 5) {
                fVar.mo87845a(C46344a.m89395a(pVar.f200339e, pVar.f200340f), true, true);
            } else if (pVar.f200341g == 7) {
                fVar.f120114x.mo111135a(false, true, (AbstractC0688a<Void>) null);
            } else if (pVar.f200341g == 8) {
                fVar.mo87854c(false);
                fVar.mo87853b(true);
                fVar.mo87842a((int) pVar.f200339e, (int) pVar.f200340f);
                fVar.f120114x.mo111135a(false, true, (AbstractC0688a<Void>) new C52104af(fVar, pVar, j));
            } else {
                ArrayList<EffectPointModel> effectPointModels = fVar.f120100j.getEffectPointModels();
                if (pVar.f200341g == 1) {
                    if (!effectPointModels.isEmpty()) {
                        fVar.f120100j.mo78716a(effectPointModels.get(effectPointModels.size() - 1).getIndex(), pVar.f200340f);
                    }
                } else if (pVar.f200341g == 2) {
                    fVar.mo87841a(pVar.f200335a[0]);
                } else if (pVar.f200341g == 3) {
                    if (fVar.f120095e != null) {
                        fVar.f120095e.setValue(C88296t.m153438b(0));
                    }
                    fVar.mo87843a((int) fVar.f120063B.mo78733a(0), false);
                    fVar.f120100j.f107820b.clear();
                } else if (pVar.f200341g == 4 && fVar.f120079R != null) {
                    for (int length = pVar.f200335a.length - 1; length >= 0; length--) {
                        fVar.mo87841a(pVar.f200335a[length]);
                    }
                }
            }
        }
    }
}
