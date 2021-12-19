package com.bytedance.android.livesdk.container.p505c;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.p461b.AbstractC6950a;
import com.bytedance.android.livesdk.browser.p461b.C6951b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.C6964f;
import com.bytedance.android.livesdk.browser.p462c.C6966g;
import com.bytedance.android.livesdk.browser.view.C7244b;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.p504b.C8215b;
import com.bytedance.android.livesdk.container.p504b.C8217c;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.c.c */
public final class C8232c extends AbstractC8221a implements AbstractC7033a {

    /* renamed from: f */
    public WebView f20443f;

    /* renamed from: g */
    public final AbstractC6956d f20444g = C6966g.m14875b();

    /* renamed from: h */
    public final boolean f20445h = false;

    /* renamed from: i */
    private C8217c f20446i;

    /* renamed from: j */
    private C8215b f20447j;

    /* renamed from: k */
    private AbstractC6950a f20448k;

    static {
        Covode.recordClassIndex(9057);
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14489a(C7038b bVar) {
        C89219l.m154721d(bVar, "");
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ View mo14496f() {
        return this.f20443f;
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: g */
    public final boolean mo14497g() {
        WebView webView = this.f20443f;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: h */
    public final void mo14498h() {
        WebView webView = this.f20443f;
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: b */
    public final C7038b mo14492b() {
        this.f20446i = new C8217c(this);
        this.f20447j = new C8215b(this);
        C7038b a = C7038b.m14991a(this.f20420b, this.f20443f, this.f20446i, this.f20447j);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: c */
    public final void mo14493c() {
        this.f20448k = C6951b.m14834b();
        C6966g.m14875b().mo13253a(this);
        C6964f.m14873a();
        CookieManager.getInstance().setAcceptCookie(true);
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: d */
    public final void mo14494d() {
        WebView a = this.f20444g.mo13244a(this.f20420b);
        this.f20443f = a;
        if (a != null) {
            a.setVerticalScrollBarEnabled(false);
        }
        C7244b a2 = C7244b.m15159a(this.f20420b);
        a2.f18028a = !this.f20445h;
        a2.mo13449a(this.f20443f);
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14490a(String str) {
        C89219l.m154721d(str, "");
        C6935a.m14802a(str, this.f20443f, (String) null);
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
    /* renamed from: a */
    public final <T> void mo13267a(String str, T t) {
        C7038b bVar = this.f20419a;
        if (bVar != null) {
            bVar.mo13332a(str, t);
        }
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14488a(int i, int i2, Intent intent) {
        C89219l.m154721d(intent, "");
        C8215b bVar = this.f20447j;
        if (bVar != null) {
            bVar.mo13223a(i, i2, intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8232c(Activity activity, HybridConfig hybridConfig, String str, AbstractC8249a aVar) {
        super(activity, hybridConfig, str, aVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(hybridConfig, "");
        C89219l.m154721d(str, "");
    }
}
