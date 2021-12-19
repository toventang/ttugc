package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.p693a.AbstractC11796a;
import com.bytedance.android.livesdkapi.p676d.C11621c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.sdk.webview.C30262h;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.ecommerce.service.C45376a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3067c.C53556a;
import com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.aj */
public final class C58675aj implements AbstractC11816k {

    /* renamed from: a */
    private volatile C30262h f133587a;

    static {
        Covode.recordClassIndex(68977);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: c */
    public final void mo18889c() {
        C53556a.m98767a();
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: b */
    public final String mo18887b() {
        m107815d();
        String str = this.f133587a.f72196b;
        if (!TextUtils.isEmpty(str)) {
            return C80333dc.m139272a("offlineX", str, "tiktok_live_lynx");
        }
        return null;
    }

    /* renamed from: d */
    private void m107815d() {
        if (this.f133587a == null) {
            this.f133587a = new C30262h(LiveHostOuterService.m107232p().mo95814f()).mo53717a(LiveHostOuterService.m107232p().mo95813e()).mo53716a(C11621c.m20436a());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final List<String> mo18884a() {
        return LiveHostOuterService.m107232p().mo95812d();
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: b */
    public final Map<String, String> mo18888b(String str) {
        return C30628d.m62921a(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final List<String> mo18885a(String str) {
        return NetworkUtils.getShareCookie(CookieManager.getInstance(), str);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final void mo18886a(String str, Context context) {
        C45376a.m87949a().prefetchSchema(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final WebResourceResponse mo18881a(WebView webView, String str) {
        m107815d();
        return this.f133587a.mo53715a(webView, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final Object mo18882a(Context context, Object obj) {
        ILiveHostOuterService p = LiveHostOuterService.m107232p();
        if (p instanceof AbstractC11796a) {
            return ((AbstractC11796a) p).mo18856a(context, obj);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11816k
    /* renamed from: a */
    public final Object mo18883a(Object obj, Context context, Object obj2, View view, Object obj3) {
        ILiveHostOuterService p = LiveHostOuterService.m107232p();
        if (p instanceof AbstractC11796a) {
            return ((AbstractC11796a) p).mo18857a(obj, context, obj2, view, obj3);
        }
        return null;
    }
}
