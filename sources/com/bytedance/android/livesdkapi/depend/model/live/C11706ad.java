package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ad */
public final class C11706ad implements AbstractC2724b<LiveCoreSDKData.Quality> {
    static {
        Covode.recordClassIndex(13394);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ LiveCoreSDKData.Quality mo7304a(C2730f fVar) {
        return m20662b(fVar);
    }

    /* renamed from: b */
    public static LiveCoreSDKData.Quality m20662b(C2730f fVar) {
        LiveCoreSDKData.Quality quality = new LiveCoreSDKData.Quality();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return quality;
            } else if (b == 1) {
                quality.name = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                quality.sdkKey = fVar.mo7312d();
            }
        }
    }
}
