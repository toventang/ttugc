package com.p2082ss.android.ugc.aweme.miniapp.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;

/* renamed from: com.ss.android.ugc.aweme.miniapp.utils.a */
public final class C59286a {
    static {
        Covode.recordClassIndex(69663);
    }

    /* renamed from: a */
    public static int m108995a(String str) {
        if (C59308d.m109007b(str)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public static boolean m108996a(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!C59308d.m109008c(microAppUrl)) {
            return false;
        }
        C59315a.C59316a aVar = new C59315a.C59316a();
        aVar.f135537c = "025002";
        aVar.f135538d = "mp_url";
        C59320c.C59324a.f135560a.mo96989a().openMiniApp(context, microAppUrl, aVar.mo96936a());
        return true;
    }
}
