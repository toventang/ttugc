package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bq */
public final class C9560bq implements AbstractC2724b<GameTag> {
    static {
        Covode.recordClassIndex(11099);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ GameTag mo7304a(C2730f fVar) {
        return m17874b(fVar);
    }

    /* renamed from: b */
    public static GameTag m17874b(C2730f fVar) {
        GameTag gameTag = new GameTag();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gameTag;
            } else if (b == 1) {
                gameTag.f23082id = Long.valueOf(fVar.mo7314f());
            } else if (b == 2) {
                gameTag.showName = fVar.mo7312d();
            } else if (b == 3) {
                gameTag.shortName = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                gameTag.fullName = fVar.mo7312d();
            }
        }
    }
}
