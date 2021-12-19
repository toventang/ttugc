package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.repository.c */
public final /* synthetic */ class C8662c implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f21410a = new C8662c();

    static {
        Covode.recordClassIndex(9528);
    }

    private C8662c() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && pair.second != null && ((AbstractC3838b.C3839a) pair.second).f10614a == 1) {
            List<V> list = ((AbstractC3838b.C3839a) pair.second).f10616c;
            Object obj2 = pair.first;
            C2695a aVar = C2695a.f8059g;
            C89219l.m154721d(list, "");
            aVar.mo7219b().addAll(list);
        }
    }
}
