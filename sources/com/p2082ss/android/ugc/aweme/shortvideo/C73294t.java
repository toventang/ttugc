package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77808a;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77815f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.t */
public final /* synthetic */ class C73294t implements AbstractC77808a {

    /* renamed from: a */
    private final BaseShortVideoContext f164603a;

    static {
        Covode.recordClassIndex(86012);
    }

    C73294t(BaseShortVideoContext baseShortVideoContext) {
        this.f164603a = baseShortVideoContext;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.p4082b.AbstractC77808a
    /* renamed from: a */
    public final void mo114970a(EnumC77815f fVar, String str) {
        BaseShortVideoContext baseShortVideoContext = this.f164603a;
        switch (C72700q.C727033.f162996a[fVar.ordinal()]) {
            case 1:
                baseShortVideoContext.setMainBusinessData(str);
                return;
            case 2:
                baseShortVideoContext.socialData = str;
                return;
            case 3:
                baseShortVideoContext.commerceData = str;
                return;
            case 4:
                baseShortVideoContext.ugData = str;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                baseShortVideoContext.techData = str;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                baseShortVideoContext.globalData = str;
                return;
            default:
                return;
        }
    }
}
