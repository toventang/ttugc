package com.p2082ss.android.ugc.tiktok.security.p4334b;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.security.b.i */
public final class C84365i implements AbstractC84356g {

    /* renamed from: a */
    public static final C84365i f188614a = new C84365i();

    /* renamed from: b */
    private static final AbstractC84355f f188615b = null;

    private C84365i() {
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84355f
    /* renamed from: a */
    public final AbstractC84355f mo129373a() {
        return f188615b;
    }

    static {
        Covode.recordClassIndex(98317);
    }

    /* renamed from: a */
    public static boolean m145120a(WebView webView) {
        C89219l.m154721d(webView, "");
        return SecLinkServiceImpl.m145081b().mo129347a(webView);
    }

    /* renamed from: b */
    public static boolean m145121b(WebView webView) {
        C89219l.m154721d(webView, "");
        return SecLinkServiceImpl.m145081b().mo129349b(webView);
    }

    /* renamed from: b */
    public static boolean m145122b(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        Boolean a = SecLinkServiceImpl.m145081b().mo129344a(webView, str);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.tiktok.security.p4334b.AbstractC84353d
    /* renamed from: a */
    public final String mo129370a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        return SecLinkServiceImpl.m145081b().mo129348b(webView, str);
    }
}
