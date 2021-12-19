package com.bytedance.android.livesdk.feed.feed;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.feed.h */
public final class C8589h implements AbstractC2724b<C8587f> {
    static {
        Covode.recordClassIndex(9446);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8587f mo7304a(C2730f fVar) {
        C8587f fVar2 = new C8587f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f21225a = fVar.mo7312d();
            }
        }
    }
}
