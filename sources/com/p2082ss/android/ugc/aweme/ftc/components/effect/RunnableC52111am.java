package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.AbstractC46380u;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.ftc.components.effect.C52125f;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.am */
final /* synthetic */ class RunnableC52111am implements Runnable {

    /* renamed from: a */
    private final C52125f.C521316 f120034a;

    /* renamed from: b */
    private final List f120035b;

    static {
        Covode.recordClassIndex(61492);
    }

    RunnableC52111am(C52125f.C521316 r1, List list) {
        this.f120034a = r1;
        this.f120035b = list;
    }

    public final void run() {
        C52125f.C521316 r4 = this.f120034a;
        List list = this.f120035b;
        if (C52125f.this.f120071J.f120054a != null && (C52125f.this.f120071J.f120054a instanceof AbstractC46380u)) {
            List<EffectPointModel> d = ((AbstractC46380u) C52125f.this.f120071J.f120054a).mo78825d();
            C52125f.this.f120100j.mo78718a(d, C52125f.this.f120063B.mo78736c());
            if (C89219l.m154714a((Object) "sticker", (Object) ((EffectCategoryResponse) list.get(0)).getKey())) {
                C52125f.this.mo87845a(d, true, false);
            }
        }
    }
}
