package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.feed.p2964r.C49905a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.AwemeSplashParamsCronetInterceptor */
public class AwemeSplashParamsCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72034);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    /* renamed from: a */
    public final C22099u mo98966a(AbstractC22021a.AbstractC22022a aVar) {
        if (!SplashSettingServiceImpl.m33419g().mo28723a()) {
            if (C46807cw.f109052d) {
                C58945a.C58947b.f134185a.mo96425a("feed_preload_awemesplashparams_interceptor", false);
                C58945a.C58947b.f134185a.mo96429b("feed_preload_awemesplashparams_interceptor", false);
            }
            return aVar.mo35810a(aVar.mo35809a());
        }
        long currentTimeMillis = System.currentTimeMillis();
        C49905a.m93683a();
        Request a = aVar.mo35809a();
        String str = C17975i.f42804d;
        Long l = C17975i.f42805e;
        if (!TextUtils.isEmpty(str) || l != null) {
            C90200t.C90201a j = C90200t.m156802f(a.getUrl()).mo145060j();
            if (!TextUtils.isEmpty(str)) {
                j.mo145070c("top_view_cid", str);
            }
            if (l != null) {
                j.mo145070c("top_view_aid", String.valueOf(l));
            }
            a = a.newBuilder().mo35838a(j.mo145068b().toString()).mo35840a();
        }
        C58945a.C58947b.f134185a.mo96423a("aweme_splash_params_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        System.currentTimeMillis();
        if (C46807cw.f109052d) {
            C58945a.C58947b.f134185a.mo96425a("feed_preload_awemesplashparams_interceptor", false);
            C58945a.C58947b.f134185a.mo96429b("feed_preload_awemesplashparams_interceptor", false);
        }
        return aVar.mo35810a(a);
    }
}
