package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.bs */
public final class C9562bs implements AbstractC2724b<GiftOperation> {
    static {
        Covode.recordClassIndex(11101);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ GiftOperation mo7304a(C2730f fVar) {
        return m17878b(fVar);
    }

    /* renamed from: b */
    public static GiftOperation m17878b(C2730f fVar) {
        GiftOperation giftOperation = new GiftOperation();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        giftOperation.leftImage = C2977f.m8301b(fVar);
                        break;
                    case 2:
                        giftOperation.rightImage = C2977f.m8301b(fVar);
                        break;
                    case 3:
                        giftOperation.title = fVar.mo7312d();
                        break;
                    case 4:
                        giftOperation.titleColor = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        giftOperation.titleSize = (int) fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        giftOperation.schemeUrl = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        giftOperation.eventName = fVar.mo7312d();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return giftOperation;
            }
        }
    }
}
