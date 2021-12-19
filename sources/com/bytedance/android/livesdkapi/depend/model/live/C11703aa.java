package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.aa */
public final class C11703aa implements AbstractC2724b<LiveCoreSDKData.Options> {
    static {
        Covode.recordClassIndex(13391);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ LiveCoreSDKData.Options mo7304a(C2730f fVar) {
        return m20656b(fVar);
    }

    /* renamed from: b */
    public static LiveCoreSDKData.Options m20656b(C2730f fVar) {
        LiveCoreSDKData.Options options = new LiveCoreSDKData.Options();
        options.qualityList = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return options;
            } else if (b == 1) {
                options.defaultQuality = C11706ad.m20662b(fVar);
            } else if (b == 2) {
                options.qualityList.add(C11706ad.m20662b(fVar));
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                options.defaultPreviewQuality = C11706ad.m20662b(fVar);
            }
        }
    }
}
