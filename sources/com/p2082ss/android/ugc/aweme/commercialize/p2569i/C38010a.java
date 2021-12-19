package com.p2082ss.android.ugc.aweme.commercialize.p2569i;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.gecko.C80480a;
import com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.i.a */
public final class C38010a extends AbstractC81535a {

    /* renamed from: a */
    public static final C38011a f89818a = new C38011a((byte) 0);

    /* renamed from: b */
    private final SimpleDateFormat f89819b;

    /* renamed from: c */
    private final String f89820c;

    /* renamed from: d */
    private final String f89821d;

    /* renamed from: e */
    private final String f89822e;

    static {
        Covode.recordClassIndex(45471);
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: a */
    public final String mo66293a() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: b */
    public final InputStream mo66294b(String str) {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.i.a$a */
    public static final class C38011a {
        static {
            Covode.recordClassIndex(45472);
        }

        private C38011a() {
        }

        public /* synthetic */ C38011a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a
    /* renamed from: c */
    public final String mo66295c(String str) {
        if (str != null && (C89361p.m154876c(str, ".shtml", false) || C89361p.m154876c(str, ".do", false))) {
            return "text/html";
        }
        String c = super.mo66295c(str);
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.web.p4238b.AbstractC81535a, com.p2082ss.android.sdk.webview.C30262h.AbstractC30264a
    /* renamed from: a */
    public final WebResourceResponse mo53719a(String str) {
        boolean z;
        String b;
        JSONObject b2;
        int a;
        String str2;
        Map a2;
        MethodCollector.m26663i(3318);
        String str3 = this.f89821d;
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str3 == null || str3.length() == 0) {
            MethodCollector.m26664o(3318);
            return null;
        }
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f == null || (b = C80333dc.m139277b(f.mo59391g(this.f89822e), str3)) == null || b.length() == 0) {
            MethodCollector.m26664o(3318);
            return null;
        }
        IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
        if (f2 == null || (b2 = f2.mo59383b(b)) == null) {
            MethodCollector.m26664o(3318);
            return null;
        }
        JSONObject optJSONObject = b2.optJSONObject(C80480a.m139506a(str4));
        if (optJSONObject == null) {
            MethodCollector.m26664o(3318);
            return null;
        }
        File file = new File(b, optJSONObject.optString("fileName"));
        if (!file.exists() || file.isFile()) {
            MethodCollector.m26664o(3318);
            return null;
        }
        if (!TextUtils.isEmpty(str4) && (a = C89361p.m154882a((CharSequence) str4, '?', 0, false, 6)) != -1) {
            if (str4 != null) {
                str4 = str4.substring(0, a);
                C89219l.m154716b(str4, "");
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                MethodCollector.m26664o(3318);
                throw nullPointerException;
            }
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("respHeader");
        if (optJSONObject2 == null || (str2 = optJSONObject2.optString("content-type")) == null) {
            str2 = mo66295c(str4);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        AdLandingPageConfig adLandingPageConfig = iESSettingsProxy.getAdLandingPageConfig();
        C89219l.m154716b(adLandingPageConfig, "");
        int prememCacheMaxAgeInDays = adLandingPageConfig.getPrememCacheMaxAgeInDays();
        if (prememCacheMaxAgeInDays <= 0) {
            a2 = C89041ag.m154415a();
        } else {
            long j = ((long) prememCacheMaxAgeInDays) * 86400;
            long currentTimeMillis = System.currentTimeMillis();
            a2 = C89041ag.m154421a(C89387v.m154943a("access-control-allow-credentials", "true"), C89387v.m154943a("access-control-allow-headers", "Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Credentials"), C89387v.m154943a("access-control-allow-methods", "GET"), C89387v.m154943a("access-control-allow-origin", "*"), C89387v.m154943a("access-control-max-age", String.valueOf(j)), C89387v.m154943a("x-content-type-options", "nosniff"), C89387v.m154943a("x-xss-protection", "0"), C89387v.m154943a("timing-allow-origin", "*"), C89387v.m154943a("age", "0"), C89387v.m154943a("cache-control", "public, max-age=".concat(String.valueOf(j))), C89387v.m154943a("date", this.f89819b.format(new Date(currentTimeMillis)) + " GMT"), C89387v.m154943a("expires", this.f89819b.format(new Date(currentTimeMillis + (1000 * j))) + " GMT"));
        }
        WebResourceResponse a3 = m141395a(str2, "", fileInputStream, a2);
        MethodCollector.m26664o(3318);
        return a3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38010a(String str, String str2, String str3) {
        super(true);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        this.f89820c = str;
        this.f89821d = str2;
        this.f89822e = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f89819b = simpleDateFormat;
    }
}
