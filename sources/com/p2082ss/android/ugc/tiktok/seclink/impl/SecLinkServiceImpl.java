package com.p2082ss.android.ugc.tiktok.seclink.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1769i.p1770a.AbstractC23637b;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30140d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a.C84346g;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl */
public final class SecLinkServiceImpl implements ISecLinkService {
    static {
        Covode.recordClassIndex(98287);
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final boolean mo129346a() {
        return true;
    }

    /* renamed from: b */
    public static ISecLinkService m145081b() {
        MethodCollector.m26663i(697);
        Object a = C81908b.m141854a(ISecLinkService.class, false);
        if (a != null) {
            ISecLinkService iSecLinkService = (ISecLinkService) a;
            MethodCollector.m26664o(697);
            return iSecLinkService;
        }
        if (C81908b.f183366eJ == null) {
            synchronized (ISecLinkService.class) {
                try {
                    if (C81908b.f183366eJ == null) {
                        C81908b.f183366eJ = new SecLinkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(697);
                    throw th;
                }
            }
        }
        SecLinkServiceImpl secLinkServiceImpl = (SecLinkServiceImpl) C81908b.f183366eJ;
        MethodCollector.m26664o(697);
        return secLinkServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final boolean mo129347a(WebView webView) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(webView, "");
        AbstractC23637b bVar = SecLinkManager.f188571a.get(webView);
        if (bVar != null) {
            return bVar.mo39052b();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: b */
    public final boolean mo129349b(WebView webView) {
        C89219l.m154721d(webView, "");
        C89219l.m154721d(webView, "");
        AbstractC23637b bVar = SecLinkManager.f188571a.get(webView);
        if (bVar != null) {
            return bVar.mo39054c();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final String mo129345a(String str, String str2) {
        return SecLinkManager.m145073a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final Boolean mo129344a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        return SecLinkManager.m145076b(webView, str);
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: b */
    public final String mo129348b(WebView webView, String str) {
        Context context;
        Intent intent;
        String a;
        C89219l.m154721d(webView, "");
        C89219l.m154721d(webView, "");
        if ((C84346g.m145091a().f188590a || (webView instanceof C30140d)) && str != null && C89361p.m154874b(str, "http", false) && SecLinkManager.f188571a.get(webView) == null) {
            if (webView.getContext() instanceof MutableContextWrapper) {
                Context context2 = webView.getContext();
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
                context = ((MutableContextWrapper) context2).getBaseContext();
            } else {
                context = webView.getContext();
            }
            if (!(!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (a = SecLinkManager.m145072a(intent, "sec_link_scene")) == null)) {
                SecLinkManager.m145074a(webView, a);
                return SecLinkManager.m145073a(str, a);
            }
        }
        return str;
    }
}
