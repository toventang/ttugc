package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.C9562bs;
import com.bytedance.android.livesdk.model.C9563bt;
import com.bytedance.android.livesdk.model.C9565bv;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.ak */
public final class C8823ak implements AbstractC2724b<GiftPage> {
    static {
        Covode.recordClassIndex(9704);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ GiftPage mo7304a(C2730f fVar) {
        return m17133b(fVar);
    }

    /* renamed from: b */
    public static GiftPage m17133b(C2730f fVar) {
        GiftPage giftPage = new GiftPage();
        giftPage.gifts = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        giftPage.pageType = fVar.mo7313e();
                        break;
                    case 2:
                        giftPage.pageName = fVar.mo7312d();
                        break;
                    case 3:
                        giftPage.gifts.add(C9565bv.m17884b(fVar));
                        break;
                    case 4:
                        giftPage.display = C2731g.m7901a(fVar);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        giftPage.operation = C9562bs.m17878b(fVar);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        giftPage.eventName = fVar.mo7312d();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        giftPage.pagePanelBanner = C9563bt.m17880b(fVar);
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return giftPage;
            }
        }
    }
}
