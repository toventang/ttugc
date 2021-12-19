package com.bytedance.android.live.base.model;

import com.bytedance.android.livesdk.model.C9560bq;
import com.bytedance.android.livesdk.model.C9567bx;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.d */
public final class C2969d implements AbstractC2724b<HashtagResponse> {
    static {
        Covode.recordClassIndex(3414);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ HashtagResponse mo7304a(C2730f fVar) {
        HashtagResponse hashtagResponse = new HashtagResponse();
        hashtagResponse.gameTagList = new ArrayList();
        hashtagResponse.hashtags = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hashtagResponse;
            } else if (b == 1) {
                hashtagResponse.hashtags.add(C9567bx.m17888b(fVar));
            } else if (b == 2) {
                hashtagResponse.gameTagList.add(C9560bq.m17874b(fVar));
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                hashtagResponse.gameHashTag = C9567bx.m17888b(fVar);
            }
        }
    }
}
