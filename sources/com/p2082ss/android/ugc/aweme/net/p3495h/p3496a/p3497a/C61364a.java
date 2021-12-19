package com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.p2082ss.android.ugc.aweme.feed.p2964r.C49905a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90200t;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.h.a.a.a */
public final class C61364a extends C61367d {
    static {
        Covode.recordClassIndex(71997);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61367d
    /* renamed from: a */
    public final C90029ac mo98960a(AbstractC90202u.AbstractC90203a aVar) {
        if (!SplashSettingServiceImpl.m33419g().mo28723a()) {
            return aVar.mo144857a(aVar.mo144856a());
        }
        long currentTimeMillis = System.currentTimeMillis();
        C49905a.m93683a();
        Request a = aVar.mo144856a();
        String str = C17975i.f42804d;
        Long l = C17975i.f42805e;
        if (!TextUtils.isEmpty(str) || l != null) {
            C90200t.C90201a j = a.url().mo145060j();
            if (!TextUtils.isEmpty(str)) {
                j.mo145070c("top_view_cid", str);
            }
            if (l != null) {
                j.mo145070c("top_view_aid", String.valueOf(l));
            }
            a = a.newBuilder().mo144697a(j.mo145068b()).mo144698a();
        }
        C58945a.C58947b.f134185a.mo96423a("aweme_splash_params_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        return aVar.mo144857a(a);
    }
}
