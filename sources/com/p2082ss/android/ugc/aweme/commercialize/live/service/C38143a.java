package com.p2082ss.android.ugc.aweme.commercialize.live.service;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38048a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.service.a */
public final class C38143a {

    /* renamed from: a */
    public static final C38143a f90107a = new C38143a();

    private C38143a() {
    }

    static {
        Covode.recordClassIndex(45618);
    }

    /* renamed from: a */
    public static final boolean m77302a(Aweme aweme) {
        return CommercializeLiveServiceImpl.m77282a().mo66428b(aweme);
    }

    /* renamed from: a */
    public static final C38048a m77300a(AwemeRawAd awemeRawAd, String str) {
        C89219l.m154721d(awemeRawAd, "");
        C89219l.m154721d(str, "");
        return CommercializeLiveServiceImpl.m77282a().mo66422a(awemeRawAd, str);
    }

    /* renamed from: a */
    public static void m77301a(Aweme aweme, EnterRoomConfig enterRoomConfig, int i) {
        C89219l.m154721d(enterRoomConfig, "");
        if (aweme != null) {
            CommercializeLiveServiceImpl.m77282a().mo66426a(aweme, enterRoomConfig, i);
        }
    }
}
