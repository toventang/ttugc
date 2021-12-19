package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77811b;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77815f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.s */
public final /* synthetic */ class C72826s implements AbstractC77811b {

    /* renamed from: a */
    private final BaseShortVideoContext f163415a;

    static {
        Covode.recordClassIndex(85512);
    }

    C72826s(BaseShortVideoContext baseShortVideoContext) {
        this.f163415a = baseShortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77811b
    /* renamed from: a */
    public final String mo114971a(EnumC77815f fVar) {
        BaseShortVideoContext baseShortVideoContext = this.f163415a;
        switch (C72700q.C727033.f162996a[fVar.ordinal()]) {
            case 1:
                return baseShortVideoContext.getMainBusinessData();
            case 2:
                return baseShortVideoContext.socialData;
            case 3:
                return baseShortVideoContext.commerceData;
            case 4:
                return baseShortVideoContext.ugData;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return baseShortVideoContext.techData;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return baseShortVideoContext.globalData;
            default:
                return null;
        }
    }
}
