package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16498g;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.g */
public final class C35284g implements AbstractC16498g {
    static {
        Covode.recordClassIndex(42449);
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16498g
    /* renamed from: a */
    public final AbstractC89188r<WebView, String, Map<String, String>, AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> mo26211a() {
        return C35285a.f83294a;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.g$a */
    static final class C35285a extends AbstractC89220m implements AbstractC89188r<WebView, String, Map<String, String>, AbstractC89183m<? super String, ? super Map<String, String>, ? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C35285a f83294a = new C35285a();

        static {
            Covode.recordClassIndex(42450);
        }

        C35285a() {
            super(4);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(WebView webView, String str, Map<String, String> map, AbstractC89183m<? super String, ? super Map<String, String>, ? extends C89391z> mVar) {
            AbstractC89183m<? super String, ? super Map<String, String>, ? extends C89391z> mVar2 = mVar;
            C89219l.m154721d(webView, "");
            C89219l.m154721d(mVar2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
                C89219l.m154716b(adLandingPageConfig, "");
                Boolean enableReferer = adLandingPageConfig.getEnableReferer();
                C89219l.m154716b(enableReferer, "");
                if (enableReferer.booleanValue()) {
                    linkedHashMap.put("referer", "https://www.tiktok.com");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            mVar2.invoke(str, linkedHashMap);
            return C89391z.f203057a;
        }
    }
}
