package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ah */
final /* synthetic */ class C11462ah implements AbstractC89172b {

    /* renamed from: a */
    private final C11455ag f27503a;

    static {
        Covode.recordClassIndex(13121);
    }

    C11462ah(C11455ag agVar) {
        this.f27503a = agVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C11455ag agVar = this.f27503a;
        C10700d dVar = (C10700d) obj;
        if (!agVar.f27479a.isEmpty() && !dVar.f25769k) {
            C10700d pollLast = agVar.f27479a.pollLast();
            if (pollLast != null) {
                if (pollLast.f25767i.getId() == dVar.f25767i.getId() && pollLast.f25760b == dVar.f25760b) {
                    pollLast.f25765g++;
                    agVar.f27479a.addLast(pollLast);
                } else {
                    agVar.f27479a.addLast(pollLast);
                }
            }
            return C89391z.f203057a;
        }
        agVar.f27479a.addLast(dVar);
        if (!agVar.f27480b) {
            agVar.mo18302a();
        }
        return C89391z.f203057a;
    }
}
