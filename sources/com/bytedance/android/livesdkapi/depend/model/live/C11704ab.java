package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ab */
public final class C11704ab implements AbstractC2724b<LiveCoreSDKData> {
    static {
        Covode.recordClassIndex(13392);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ LiveCoreSDKData mo7304a(C2730f fVar) {
        return m20658b(fVar);
    }

    /* renamed from: b */
    public static LiveCoreSDKData m20658b(C2730f fVar) {
        LiveCoreSDKData liveCoreSDKData = new LiveCoreSDKData();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return liveCoreSDKData;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                liveCoreSDKData.pullData = C11705ac.m20660b(fVar);
            }
        }
    }
}
