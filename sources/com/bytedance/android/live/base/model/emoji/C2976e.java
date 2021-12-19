package com.bytedance.android.live.base.model.emoji;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.emoji.e */
public final class C2976e implements AbstractC2724b<EmoteModel> {
    static {
        Covode.recordClassIndex(3422);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ EmoteModel mo7304a(C2730f fVar) {
        return m8299b(fVar);
    }

    /* renamed from: b */
    public static EmoteModel m8299b(C2730f fVar) {
        EmoteModel emoteModel = new EmoteModel();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return emoteModel;
            } else if (b == 1) {
                emoteModel.f8727g = fVar.mo7312d();
            } else if (b == 2) {
                emoteModel.f8728h = C2977f.m8301b(fVar);
            } else if (b == 3) {
                emoteModel.f8729i = fVar.mo7313e();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                emoteModel.f8730j = fVar.mo7312d();
            }
        }
    }
}
