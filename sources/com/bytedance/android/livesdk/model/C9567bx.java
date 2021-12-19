package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bx */
public final class C9567bx implements AbstractC2724b<Hashtag> {
    static {
        Covode.recordClassIndex(11106);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ Hashtag mo7304a(C2730f fVar) {
        return m17888b(fVar);
    }

    /* renamed from: b */
    public static Hashtag m17888b(C2730f fVar) {
        Hashtag hashtag = new Hashtag();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hashtag;
            } else if (b == 1) {
                hashtag.f23083id = Long.valueOf(fVar.mo7314f());
            } else if (b == 2) {
                hashtag.title = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                hashtag.image = C2977f.m8301b(fVar);
            }
        }
    }
}
