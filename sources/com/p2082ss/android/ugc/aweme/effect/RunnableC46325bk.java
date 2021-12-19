package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46267ac;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.bk */
final /* synthetic */ class RunnableC46325bk implements Runnable {

    /* renamed from: a */
    private final C46267ac.C462736 f107981a;

    /* renamed from: b */
    private final List f107982b;

    static {
        Covode.recordClassIndex(54902);
    }

    RunnableC46325bk(C46267ac.C462736 r1, List list) {
        this.f107981a = r1;
        this.f107982b = list;
    }

    public final void run() {
        C46267ac.C462736 r4 = this.f107981a;
        List list = this.f107982b;
        if (C46267ac.this.f107849J.f108067a != null && (C46267ac.this.f107849J.f108067a instanceof AbstractC46380u)) {
            List<EffectPointModel> d = ((AbstractC46380u) C46267ac.this.f107849J.f108067a).mo78825d();
            C46267ac.this.f107882j.mo78718a(d, C46267ac.this.f107841B.mo78736c());
            if (C89219l.m154714a((Object) "sticker", (Object) ((EffectCategoryResponse) list.get(0)).getKey())) {
                C46267ac.this.mo78748a(d, true, false);
            }
        }
    }
}
