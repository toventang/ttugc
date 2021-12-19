package com.p2082ss.android.ugc.tiktok.seclink;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.ISecLinkServiceDefault */
public final class ISecLinkServiceDefault implements ISecLinkService {
    static {
        Covode.recordClassIndex(98280);
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final String mo129345a(String str, String str2) {
        return str;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final boolean mo129346a() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final boolean mo129347a(WebView webView) {
        C89219l.m154721d(webView, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: b */
    public final String mo129348b(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: b */
    public final boolean mo129349b(WebView webView) {
        C89219l.m154721d(webView, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.tiktok.seclink.ISecLinkService
    /* renamed from: a */
    public final Boolean mo129344a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        return false;
    }
}
