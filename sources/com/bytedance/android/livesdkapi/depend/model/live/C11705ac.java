package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ac */
public final class C11705ac implements AbstractC2724b<LiveCoreSDKData.PullData> {
    static {
        Covode.recordClassIndex(13393);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ LiveCoreSDKData.PullData mo7304a(C2730f fVar) {
        return m20660b(fVar);
    }

    /* renamed from: b */
    public static LiveCoreSDKData.PullData m20660b(C2730f fVar) {
        LiveCoreSDKData.PullData pullData = new LiveCoreSDKData.PullData();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return pullData;
            } else if (b == 1) {
                pullData.streamData = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                pullData.options = C11703aa.m20656b(fVar);
            }
        }
    }
}
