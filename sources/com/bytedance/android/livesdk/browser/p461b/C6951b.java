package com.bytedance.android.livesdk.browser.p461b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.webkit.WebView;
import com.C1764a;
import com.bytedance.android.live.core.p212b.C3853a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.livesetting.hybrid.WebviewDestroyModeSetting;
import com.bytedance.android.livesdk.util.C11120d;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.browser.b.b */
public class C6951b implements AbstractC6950a {

    /* renamed from: a */
    private static volatile C6951b f17373a;

    static {
        Covode.recordClassIndex(7690);
    }

    private C6951b() {
    }

    @Override // com.bytedance.android.livesdk.browser.p461b.AbstractC6950a
    /* renamed from: a */
    public final int mo13234a() {
        int value = WebviewDestroyModeSetting.INSTANCE.getValue();
        if (value == 1 || value == 0 || value == 2) {
            return value;
        }
        return 2;
    }

    /* renamed from: b */
    public static AbstractC6950a m14834b() {
        MethodCollector.m26663i(7203);
        if (f17373a == null) {
            synchronized (C6951b.class) {
                try {
                    if (f17373a == null) {
                        f17373a = new C6951b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7203);
                    throw th;
                }
            }
        }
        C6951b bVar = f17373a;
        MethodCollector.m26664o(7203);
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.browser.p461b.AbstractC6950a
    /* renamed from: a */
    public final void mo13235a(WebView webView) {
        String country;
        Context context = webView.getContext();
        String a = C6935a.m14798a(context, webView);
        if (a == null) {
            a = "";
        }
        Locale locale = Resources.getSystem().getConfiguration().locale;
        if (context != null) {
            locale = context.getResources().getConfiguration().locale;
        }
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        if (!TextUtils.isEmpty(a) && iHostContext != null) {
            StringBuilder append = new StringBuilder().append(a).append(" ").append(iHostContext.appName()).append("_").append(iHostContext.getVersionCode()).append(" AppVersion/").append(iHostContext.getVersionCode()).append(" JsSdk/2.0 NetType/");
            Context context2 = iHostContext.context();
            if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132254f = NetworkUtils.getNetworkAccessType(context2);
            }
            StringBuilder append2 = append.append(C58029j.f132254f.toUpperCase()).append(" Channel/").append(iHostContext.getChannel()).append(" ByteLocale/").append(locale.toString()).append(" Webcast_ByteLocale/").append(C11120d.m19751a(((IHostContext) C6193a.m13435a(IHostContext.class)).currentLocale())).append(" Region/");
            if (!TextUtils.isEmpty(C3853a.m9451b())) {
                country = C3853a.m9451b();
            } else {
                country = Locale.getDefault().getCountry();
                if (TextUtils.isEmpty(country)) {
                    country = "US";
                }
            }
            a = append2.append(country).append(" App/").append(iHostContext.appName()).append(" WebcastSDK/2150").toString();
        }
        if (!TextUtils.isEmpty(a)) {
            C1764a.m5930a(webView.getSettings(), a);
        }
    }
}
