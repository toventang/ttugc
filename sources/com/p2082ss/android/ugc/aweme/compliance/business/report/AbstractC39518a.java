package com.p2082ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40740e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.report.a */
public abstract class AbstractC39518a implements AbstractC40547m, AbstractC40691e {

    /* renamed from: a */
    protected AbstractC40735a f93212a;

    /* renamed from: b */
    private final AbstractC40591g f93213b;

    /* renamed from: c */
    private Activity f93214c;

    /* renamed from: d */
    private C40618a f93215d;

    /* renamed from: e */
    private View f93216e;

    static {
        Covode.recordClassIndex(47211);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65791a(WebView webView, int i, String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo61846a(WebView webView, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: a */
    public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: a */
    public final void mo67253a(CharSequence charSequence, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81545g
    /* renamed from: a */
    public final void mo67254a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: b */
    public final boolean mo65796b(WebView webView, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: c */
    public final void mo67255c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
    /* renamed from: c */
    public final void mo65797c(WebView webView, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: d */
    public final void mo67256d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: e */
    public final AbstractC40691e mo67257e() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public Context getContext() {
        return this.f93214c;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public AbstractC40591g getCrossPlatformBusiness() {
        return this.f93213b;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public C40618a getCrossPlatformParams() {
        return this.f93215d;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: f */
    public final AbstractC40735a mo67258f() {
        AbstractC40735a aVar = this.f93212a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: g */
    public final void mo67259g() {
        AbstractC40735a aVar = this.f93212a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar.mo67259g();
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: h */
    public final boolean mo67263h() {
        AbstractC40735a aVar = this.f93212a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        return aVar.mo67263h();
    }

    /* renamed from: a */
    public final void mo68953a() {
        View findViewById = this.f93214c.findViewById(R.id.agg);
        if (findViewById == null) {
            View view = this.f93216e;
            if (view != null) {
                findViewById = view.findViewById(R.id.agg);
            } else {
                findViewById = null;
            }
        }
        C89219l.m154716b(findViewById, "");
        AbstractC40735a aVar = (AbstractC40735a) findViewById;
        this.f93212a = aVar;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar.mo69913a(this.f93214c);
        AbstractC40735a aVar2 = this.f93212a;
        if (aVar2 == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar2.setCrossPlatformActivityContainer(this);
        if (!this.f93215d.f95068a.f95062k) {
            Integer num = this.f93215d.f95068a.f95052a;
            if (num != null && num.intValue() == 2) {
                AbstractC40735a aVar3 = this.f93212a;
                if (aVar3 == null) {
                    C89219l.m154710a("mCrossPlatformWebView");
                }
                ((AbstractC40740e) aVar3.mo69911a(AbstractC40740e.class)).mo69968a(getCrossPlatformParams());
                return;
            }
            String a = C40520b.m81728a(this.f93215d.f95068a.f95054c, C40520b.m81735b(this.f93214c));
            AbstractC40735a aVar4 = this.f93212a;
            if (aVar4 == null) {
                C89219l.m154710a("mCrossPlatformWebView");
            }
            ((AbstractC40746j) aVar4.mo69911a(AbstractC40746j.class)).mo69970a(a);
        }
    }

    private AbstractC39518a(Activity activity, C40618a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        this.f93214c = activity;
        this.f93215d = aVar;
        this.f93216e = null;
        AbstractC40591g a = AbstractC40591g.C40592a.m81943a(this);
        C89219l.m154716b(a, "");
        this.f93213b = a;
    }

    public /* synthetic */ AbstractC39518a(Activity activity, C40618a aVar, byte b) {
        this(activity, aVar);
    }
}
