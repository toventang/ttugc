package com.p2082ss.android.ugc.aweme.donation.webpage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40740e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.webpage.a */
public final class C43160a implements AbstractC40547m {

    /* renamed from: h */
    public static final C43161a f100580h = new C43161a((byte) 0);

    /* renamed from: a */
    AbstractC40735a f100581a;

    /* renamed from: b */
    public boolean f100582b;

    /* renamed from: c */
    public TuxTextView f100583c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f100584d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f100585e;

    /* renamed from: f */
    public Activity f100586f;

    /* renamed from: g */
    public C40618a f100587g;

    /* renamed from: i */
    private AbstractC40691e f100588i;

    /* renamed from: j */
    private CrossPlatformTitleBar f100589j;

    /* renamed from: k */
    private ConstraintLayout f100590k;

    /* renamed from: l */
    private final AbstractC40591g f100591l;

    /* renamed from: m */
    private View f100592m;

    static {
        Covode.recordClassIndex(51337);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: c */
    public final void mo67255c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$a */
    public static final class C43161a {
        static {
            Covode.recordClassIndex(51338);
        }

        private C43161a() {
        }

        public /* synthetic */ C43161a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public final Context getContext() {
        return this.f100586f;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public final AbstractC40591g getCrossPlatformBusiness() {
        return this.f100591l;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public final C40618a getCrossPlatformParams() {
        return this.f100587g;
    }

    /* renamed from: i */
    private final void m86058i() {
        this.f100588i = new C43164d(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$c */
    public static final class C43163c implements CrossPlatformTitleBar.AbstractC40717a {

        /* renamed from: a */
        final /* synthetic */ C43160a f100594a;

        static {
            Covode.recordClassIndex(51340);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: a */
        public final void mo69656a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: c */
        public final void mo69658c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: d */
        public final void mo69659d() {
            AbstractC89171a<C89391z> aVar = this.f100594a.f100585e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: e */
        public final void mo69660e() {
            AbstractC89171a<C89391z> aVar = this.f100594a.f100585e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: a */
        public final void mo69655a() {
            AbstractC89171a<C89391z> aVar;
            C43160a aVar2 = this.f100594a;
            AbstractC40735a aVar3 = aVar2.f100581a;
            if (aVar3 == null) {
                C89219l.m154710a("mCrossPlatformWebView");
            }
            if (!aVar3.mo69922a() && (aVar = aVar2.f100585e) != null) {
                aVar.invoke();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
        /* renamed from: b */
        public final void mo69657b() {
            ((ReportBusinessProxy) this.f100594a.getCrossPlatformBusiness().mo69748a(ReportBusinessProxy.class)).mo69752a(this.f100594a.f100586f);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43163c(C43160a aVar) {
            this.f100594a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: d */
    public final void mo67256d() {
        CrossPlatformTitleBar crossPlatformTitleBar = this.f100589j;
        if (crossPlatformTitleBar == null) {
            C89219l.m154710a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: e */
    public final AbstractC40691e mo67257e() {
        AbstractC40691e eVar = this.f100588i;
        if (eVar == null) {
            C89219l.m154710a("mISingleWebViewStatus");
        }
        return eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: f */
    public final AbstractC40735a mo67258f() {
        AbstractC40735a aVar = this.f100581a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: g */
    public final void mo67259g() {
        AbstractC40735a aVar = this.f100581a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar.mo67259g();
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: h */
    public final boolean mo67263h() {
        AbstractC40735a aVar = this.f100581a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        return aVar.mo67263h();
    }

    /* renamed from: b */
    private final void m86057b() {
        m86058i();
        this.f100581a = (AbstractC40735a) m86056a(R.id.agg);
        this.f100590k = (ConstraintLayout) m86056a(R.id.a64);
        this.f100583c = (TuxTextView) m86056a(R.id.f0j);
        AbstractC40735a aVar = this.f100581a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar.setCrossPlatformActivityContainer(this);
        m86059j();
    }

    /* renamed from: a */
    public final void mo73391a() {
        m86057b();
        AbstractC40735a aVar = this.f100581a;
        if (aVar == null) {
            C89219l.m154710a("mCrossPlatformWebView");
        }
        aVar.mo69913a(this.f100586f);
        m86060k();
    }

    /* renamed from: k */
    private final void m86060k() {
        if (!this.f100587g.f95068a.f95062k) {
            Integer num = this.f100587g.f95068a.f95052a;
            if (num != null && num.intValue() == 2) {
                AbstractC40735a aVar = this.f100581a;
                if (aVar == null) {
                    C89219l.m154710a("mCrossPlatformWebView");
                }
                ((AbstractC40740e) aVar.mo69911a(AbstractC40740e.class)).mo69968a(getCrossPlatformParams());
                return;
            }
            String a = C40520b.m81728a(this.f100587g.f95068a.f95054c, C40520b.m81735b(this.f100586f));
            AbstractC40735a aVar2 = this.f100581a;
            if (aVar2 == null) {
                C89219l.m154710a("mCrossPlatformWebView");
            }
            ((AbstractC40746j) aVar2.mo69911a(AbstractC40746j.class)).mo69970a(a);
        }
    }

    /* renamed from: j */
    private final void m86059j() {
        CrossPlatformTitleBar crossPlatformTitleBar = (CrossPlatformTitleBar) m86056a(R.id.agk);
        this.f100589j = crossPlatformTitleBar;
        if (crossPlatformTitleBar == null) {
            C89219l.m154710a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar.setCrossPlatformParams(getCrossPlatformParams());
        CrossPlatformTitleBar crossPlatformTitleBar2 = this.f100589j;
        if (crossPlatformTitleBar2 == null) {
            C89219l.m154710a("mCrossPlatformTitleBar");
        }
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) crossPlatformTitleBar2.findViewById(R.id.yv);
        autoRTLImageView.setImageDrawable(C23005c.m43393a(C43162b.f100593a).mo37368a(getContext()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C34728n.m70946a(44.0d), C34728n.m70946a(44.0d));
        C89219l.m154716b(autoRTLImageView, "");
        autoRTLImageView.setLayoutParams(layoutParams);
        CrossPlatformTitleBar crossPlatformTitleBar3 = this.f100589j;
        if (crossPlatformTitleBar3 == null) {
            C89219l.m154710a("mCrossPlatformTitleBar");
        }
        crossPlatformTitleBar3.setTitleWrap(new C43163c(this));
        if (TextUtils.equals(this.f100587g.f95068a.f95057f, "donation_sticker_consume")) {
            ConstraintLayout constraintLayout = this.f100590k;
            if (constraintLayout == null) {
                C89219l.m154710a("mClRoot");
            }
            constraintLayout.setBackgroundResource(R.drawable.r8);
            CrossPlatformTitleBar crossPlatformTitleBar4 = this.f100589j;
            if (crossPlatformTitleBar4 == null) {
                C89219l.m154710a("mCrossPlatformTitleBar");
            }
            crossPlatformTitleBar4.setBackgroundResource(R.drawable.r8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$d */
    public static final class C43164d implements AbstractC40691e {

        /* renamed from: a */
        final /* synthetic */ C43160a f100595a;

        static {
            Covode.recordClassIndex(51341);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: b */
        public final boolean mo65796b(WebView webView, String str) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: c */
        public final void mo65797c(WebView webView, String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43164d(C43160a aVar) {
            this.f100595a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$d$a */
        static final class View$OnClickListenerC43165a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C43164d f100596a;

            static {
                Covode.recordClassIndex(51342);
            }

            View$OnClickListenerC43165a(C43164d dVar) {
                this.f100596a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89171a<C89391z> aVar = this.f100596a.f100595a.f100584d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo61846a(WebView webView, String str) {
            if (TextUtils.equals(this.f100595a.f100587g.f95068a.f95057f, "org_detail_page")) {
                C43160a aVar = this.f100595a;
                Uri parse = Uri.parse(aVar.f100587g.f95068a.f95054c);
                C89219l.m154716b(parse, "");
                String path = parse.getPath();
                AbstractC40735a aVar2 = aVar.f100581a;
                if (aVar2 == null) {
                    C89219l.m154710a("mCrossPlatformWebView");
                }
                Uri parse2 = Uri.parse(aVar2.getCurrentUrl());
                C89219l.m154716b(parse2, "");
                if (TextUtils.equals(path, parse2.getPath()) && !this.f100595a.f100582b) {
                    TuxTextView tuxTextView = this.f100595a.f100583c;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(0);
                    }
                    TuxTextView tuxTextView2 = this.f100595a.f100583c;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(33);
                    }
                    TuxTextView tuxTextView3 = this.f100595a.f100583c;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setOnClickListener(new View$OnClickListenerC43165a(this));
                    }
                    this.f100595a.f100582b = false;
                }
            }
            TuxTextView tuxTextView4 = this.f100595a.f100583c;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            this.f100595a.f100582b = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            this.f100595a.f100582b = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
        /* renamed from: a */
        public final void mo65791a(WebView webView, int i, String str, String str2) {
            this.f100595a.f100582b = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81545g
    /* renamed from: a */
    public final void mo67254a(String str) {
        mo67253a(str, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.a$b */
    public static final class C43162b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C43162b f100593a = new C43162b();

        static {
            Covode.recordClassIndex(51339);
        }

        C43162b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_x_mark;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final <T extends View> T m86056a(int i) {
        T t = (T) this.f100586f.findViewById(i);
        if (t == null) {
            View view = this.f100592m;
            t = view != null ? (T) view.findViewById(i) : null;
        }
        C89219l.m154716b(t, "");
        return t;
    }

    private C43160a(Activity activity, C40618a aVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        this.f100586f = activity;
        this.f100587g = aVar;
        this.f100592m = null;
        AbstractC40591g a = AbstractC40591g.C40592a.m81943a(this);
        C89219l.m154716b(a, "");
        this.f100591l = a;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: a */
    public final void mo67253a(CharSequence charSequence, boolean z) {
        Integer num;
        if (charSequence == null) {
            return;
        }
        if ((!TextUtils.isEmpty(charSequence) && C40520b.m81733a(charSequence)) || getCrossPlatformParams().f95068a.f95052a == null || (num = getCrossPlatformParams().f95068a.f95052a) == null || num.intValue() != 1) {
            return;
        }
        if (getCrossPlatformParams().f95071d.f95192y || z) {
            CrossPlatformTitleBar crossPlatformTitleBar = this.f100589j;
            if (crossPlatformTitleBar == null) {
                C89219l.m154710a("mCrossPlatformTitleBar");
            }
            crossPlatformTitleBar.setTitle(charSequence);
        }
    }

    public /* synthetic */ C43160a(Activity activity, C40618a aVar, byte b) {
        this(activity, aVar);
    }
}
