package com.bytedance.ies.bullet.kit.web;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.C16530m;
import com.bytedance.ies.bullet.kit.web.p1159a.C16480d;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16485a;
import com.bytedance.ies.bullet.kit.web.p1160b.AbstractC16486b;
import com.bytedance.ies.bullet.kit.web.p1160b.C16488c;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.C16257i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16194r;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16158a;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16165f;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16167g;
import com.bytedance.ies.bullet.p1129c.p1132c.p1134b.AbstractC16199b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17051k;
import com.bytedance.ies.bullet.p1184ui.common.C17022c;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17021e;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17039d;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16602ak;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.EnumC16626c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16643g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16674b;
import com.bytedance.ies.bullet.service.base.web.AbstractC16676d;
import com.bytedance.ies.bullet.service.base.web.AbstractC16682i;
import com.bytedance.ies.bullet.service.base.web.C16696q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16855g;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.web.jsbridge2.C18326ak;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.C18368x;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.webx.C23557c;
import com.bytedance.webx.monitor.p1776a.C23656a;
import com.bytedance.webx.p1764h.p1768d.C23627a;
import com.example.p1811a.C23833c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89216i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89278d;

/* renamed from: com.bytedance.ies.bullet.kit.web.j */
public final class C16501j extends AbstractC17026c<SSWebView> implements AbstractC16494c {

    /* renamed from: F */
    public static final C16502a f39562F = new C16502a((byte) 0);

    /* renamed from: A */
    boolean f39563A;

    /* renamed from: B */
    long f39564B;

    /* renamed from: C */
    public long f39565C;

    /* renamed from: D */
    final Map<Uri, Long> f39566D;

    /* renamed from: E */
    boolean f39567E;

    /* renamed from: L */
    private final AbstractC89244h f39568L = C89250i.m154773a((AbstractC89171a) new C16527s(this));

    /* renamed from: M */
    private final AbstractC12021c f39569M;

    /* renamed from: N */
    private final AbstractC89244h f39570N;

    /* renamed from: O */
    private Map<String, String> f39571O;

    /* renamed from: P */
    private final C16503b f39572P;

    /* renamed from: Q */
    private final Map<String, Object> f39573Q;

    /* renamed from: R */
    private long f39574R;

    /* renamed from: j */
    public C16476a f39575j;

    /* renamed from: k */
    public final List<AbstractC16484b> f39576k = new ArrayList();

    /* renamed from: l */
    public AbstractC16498g f39577l;

    /* renamed from: m */
    final AbstractC89244h f39578m;

    /* renamed from: n */
    public final List<String> f39579n;

    /* renamed from: o */
    public final List<String> f39580o;

    /* renamed from: p */
    public final List<String> f39581p;

    /* renamed from: q */
    public final List<String> f39582q;

    /* renamed from: r */
    public Boolean f39583r;

    /* renamed from: s */
    public String f39584s;

    /* renamed from: t */
    public String f39585t;

    /* renamed from: u */
    public Boolean f39586u;

    /* renamed from: v */
    public Uri f39587v;

    /* renamed from: w */
    public C16488c f39588w;

    /* renamed from: x */
    public AbstractC16486b.AbstractC16487a f39589x;

    /* renamed from: y */
    public SSWebView f39590y;

    /* renamed from: z */
    public final AtomicBoolean f39591z;

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$b */
    public static final class C16503b extends C17022c {

        /* renamed from: a */
        final /* synthetic */ C16501j f39592a;

        static {
            Covode.recordClassIndex(18934);
        }

        /* renamed from: com.bytedance.ies.bullet.kit.web.j$b$a */
        public static final class C16504a implements AbstractC16191p {

            /* renamed from: a */
            public final JSONObject f39593a;

            /* renamed from: b */
            private final String f39594b = "pageClosed";

            static {
                Covode.recordClassIndex(18935);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return this.f39594b;
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final /* bridge */ /* synthetic */ Object mo25700b() {
                return this.f39593a;
            }

            C16504a() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16503b(C16501j jVar) {
            this.f39592a = jVar;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: a */
        public final boolean mo26064a(Activity activity) {
            C89219l.m154719c(activity, "");
            Iterator<T> it = this.f39592a.f40544H.iterator();
            while (it.hasNext()) {
                SSWebView sSWebView = (SSWebView) it.next().f40551a;
                if (sSWebView.canGoBack()) {
                    if (!sSWebView.canGoBack()) {
                        return false;
                    }
                    sSWebView.goBack();
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: b */
        public final void mo26222b(Activity activity) {
            C89219l.m154719c(activity, "");
            Iterator<T> it = this.f39592a.f40544H.iterator();
            while (it.hasNext()) {
                ((SSWebView) it.next().f40551a).onResume();
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: c */
        public final void mo26223c(Activity activity) {
            C89219l.m154719c(activity, "");
            Iterator<T> it = this.f39592a.f40544H.iterator();
            while (it.hasNext()) {
                ((SSWebView) it.next().f40551a).onPause();
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: d */
        public final void mo26224d(Activity activity) {
            C89219l.m154719c(activity, "");
            if (this.f39592a.mo26221x()) {
                AbstractC16576j.C16578b.m30778a(this.f39592a, "send pageClosed event for reused view", null, null, 6);
                this.f39592a.f39591z.getAndSet(false);
                this.f39592a.onEvent(new C16504a());
            }
        }
    }

    static {
        Covode.recordClassIndex(18932);
    }

    /* renamed from: a */
    public static int m30653a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: a */
    public final boolean mo25794a(Uri uri, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        return true;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: c */
    public final void mo25800c(List<String> list, AbstractC16253f fVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c, com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b
    /* renamed from: u */
    public final String mo26062u() {
        return "BulletWeb";
    }

    /* renamed from: v */
    public final AbstractC16682i mo26219v() {
        return (AbstractC16682i) this.f39568L.getValue();
    }

    /* renamed from: w */
    public final AbstractC17021e mo26220w() {
        return (AbstractC17021e) this.f39570N.getValue();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$a */
    public static final class C16502a {
        static {
            Covode.recordClassIndex(18933);
        }

        private C16502a() {
        }

        public /* synthetic */ C16502a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$e */
    public static final class C16507e implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f39596a;

        /* renamed from: b */
        private final String f39597b = "viewDisappeared";

        static {
            Covode.recordClassIndex(18938);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f39597b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f39596a;
        }

        C16507e() {
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$f */
    public static final class C16508f implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f39598a;

        /* renamed from: b */
        final /* synthetic */ C16501j f39599b;

        /* renamed from: c */
        private final String f39600c = "pageReused";

        static {
            Covode.recordClassIndex(18939);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f39600c;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f39598a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16508f(C16501j jVar) {
            this.f39599b = jVar;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Uri uri = jVar.f39587v;
            if (uri != null) {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                C89219l.m154709a((Object) queryParameterNames, "");
                for (T t : queryParameterNames) {
                    jSONObject2.put(t, uri.getQueryParameter(t));
                }
            }
            jSONObject.put("queryItems", jSONObject2);
            this.f39598a = jSONObject;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$g */
    public static final class C16509g implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f39601a;

        /* renamed from: b */
        private final String f39602b = "viewAppeared";

        static {
            Covode.recordClassIndex(18940);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f39602b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f39601a;
        }

        C16509g() {
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16494c
    /* renamed from: m */
    public final AbstractC16485a mo26209m() {
        return this.f39588w;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: p_ */
    public final Uri mo25780p_() {
        return this.f39587v;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$d */
    static final /* synthetic */ class C16506d extends C89216i implements AbstractC89183m<String, C16167g, C89391z> {
        static {
            Covode.recordClassIndex(18937);
        }

        C16506d(C16501j jVar) {
            super(2, jVar);
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b
        public final String getName() {
            return "onPerfDataReady";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final String getSignature() {
            return "onPerfDataReady(Ljava/lang/String;Lcom/bytedance/ies/bullet/core/kit/bridge/BridgePerfData;)V";
        }

        @Override // p4600h.p4611f.p4613b.AbstractC89208c
        public final AbstractC89278d getOwner() {
            return C89204ab.m154669a(C16501j.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, C16167g gVar) {
            String str2 = str;
            C16167g gVar2 = gVar;
            C89219l.m154719c(str2, "");
            C89219l.m154719c(gVar2, "");
            C1731i.m5635a((Callable) new CallableC16513k((C16501j) this.receiver, gVar2, str2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$o */
    public static final class C16522o extends C16480d {

        /* renamed from: a */
        final /* synthetic */ C16501j f39631a;

        static {
            Covode.recordClassIndex(18953);
        }

        public final void onHideCustomView() {
            super.onHideCustomView();
            AbstractC17021e w = this.f39631a.mo26220w();
            if (w != null) {
                w.mo26885r();
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16684k
        public final Bitmap getDefaultVideoPoster() {
            MethodCollector.m26663i(2593);
            if (C89219l.m154714a((Object) this.f39631a.mo26061t().f40069V.mo26550b(), (Object) true)) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                MethodCollector.m26664o(2593);
                return createBitmap;
            }
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.m26664o(2593);
            return defaultVideoPoster;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16522o(C16501j jVar) {
            this.f39631a = jVar;
        }

        public final void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            AbstractC17021e w;
            super.onShowCustomView(view, customViewCallback);
            if (view != null && (w = this.f39631a.mo26220w()) != null) {
                w.enterFullScreen(view);
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if ((!C89219l.m154714a((Object) this.f39631a.mo26061t().f40065R.mo26550b(), (Object) false)) && str != null) {
                AbstractC16576j.C16578b.m30778a(this.f39631a, "onReceivedTitle [" + str + "] useWebTitle " + this.f39631a.mo26061t().f40065R.mo26550b(), null, null, 6);
                AbstractC17051k.AbstractC17053b bVar = (AbstractC17051k.AbstractC17053b) this.f39631a.f38994i.mo25832c(AbstractC17051k.AbstractC17053b.class);
                if (bVar != null) {
                    bVar.mo26929a(str);
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: l */
    public final void mo25777l() {
        super.mo25777l();
        Uri uri = this.f39587v;
        if (uri != null) {
            mo25793a(uri, true);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: r */
    public final void mo25804r() {
        super.mo25804r();
        AbstractC17045g z = mo26902z();
        if (z != null) {
            z.mo26824a(this.f39572P);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$c */
    static final class C16505c extends AbstractC89220m implements AbstractC89171a<AssetManager> {

        /* renamed from: a */
        final /* synthetic */ C16248b f39595a;

        static {
            Covode.recordClassIndex(18936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16505c(C16248b bVar) {
            super(0);
            this.f39595a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AssetManager invoke() {
            Context context = (Context) this.f39595a.mo25832c(Context.class);
            if (context != null) {
                return context.getAssets();
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$s */
    static final class C16527s extends AbstractC89220m implements AbstractC89171a<AbstractC16682i> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39641a;

        static {
            Covode.recordClassIndex(18958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16527s(C16501j jVar) {
            super(0);
            this.f39641a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16682i invoke() {
            AbstractC16568c b_ = this.f39641a.mo25790b_(AbstractC16676d.class);
            if (b_ == null) {
                C89219l.m154707a();
            }
            return ((AbstractC16676d) b_).mo26487a(new C16696q());
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16494c
    /* renamed from: n */
    public final WebView mo26210n() {
        T t;
        C17029d<? extends View> q_ = mo26900q_();
        WebView webView = null;
        if (q_ != null) {
            t = q_.f40551a;
        } else {
            t = null;
        }
        if (t instanceof WebView) {
            webView = t;
        }
        return webView;
    }

    /* renamed from: t */
    public final C16855g mo26061t() {
        AbstractC16741q o_ = mo25778o_();
        if (o_ != null) {
            return (C16855g) o_;
        }
        C89219l.m154707a();
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: x */
    public final boolean mo26221x() {
        Object c = this.f38994i.mo25832c(EnumC16626c.class);
        if (c == null || c == EnumC16626c.NONE) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$h */
    static final class C16510h extends AbstractC89220m implements AbstractC89171a<AbstractC17021e> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39603a;

        /* renamed from: b */
        final /* synthetic */ C16248b f39604b;

        static {
            Covode.recordClassIndex(18941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16510h(C16501j jVar, C16248b bVar) {
            super(0);
            this.f39603a = jVar;
            this.f39604b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC17021e invoke() {
            if (C89219l.m154714a((Object) this.f39603a.mo26061t().f40067T.mo26550b(), (Object) true)) {
                return this.f39604b.mo25832c(AbstractC17021e.class);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$k */
    static final class CallableC16513k<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39613a;

        /* renamed from: b */
        final /* synthetic */ C16167g f39614b;

        /* renamed from: c */
        final /* synthetic */ String f39615c;

        static {
            Covode.recordClassIndex(18944);
        }

        CallableC16513k(C16501j jVar, C16167g gVar, String str) {
            this.f39613a = jVar;
            this.f39614b = gVar;
            this.f39615c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AbstractC16654o call() {
            AbstractC16654o oVar = (AbstractC16654o) this.f39613a.mo25790b_(AbstractC16654o.class);
            if (oVar == null) {
                return null;
            }
            C16607an anVar = new C16607an("bdx_monitor_bridge_duration", null, null, 254);
            anVar.f39738c = this.f39613a.f38991f;
            anVar.f39743h = this.f39614b.mo25727b();
            JSONObject jSONObject = new JSONObject();
            try {
                C89379q.m157068constructorimpl(jSONObject.put("method_name", this.f39615c));
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            anVar.f39742g = jSONObject;
            anVar.f39741f = "web";
            anVar.f39744i = true;
            oVar.mo26319a(anVar);
            return oVar;
        }
    }

    /* renamed from: A */
    private final void m30652A() {
        String str;
        Map<String, Object> a;
        if (!this.f39573Q.isEmpty()) {
            this.f39573Q.clear();
        }
        Map<String, Object> map = this.f39573Q;
        map.put("bullet_version", "2.1.4-rc.8-tiktok");
        map.put("containerID", this.f38993h.f39033a);
        for (T t : mo25801o()) {
            if (t != null) {
                Map<String, Object> a2 = t.mo26182a(this, this.f38994i);
                if (a2 != null) {
                    map.putAll(a2);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        AbstractC16214m r_ = mo25805r_();
        if (!(r_ instanceof AbstractC16497f)) {
            r_ = null;
        }
        AbstractC16497f fVar = (AbstractC16497f) r_;
        if (!(fVar == null || (a = fVar.mo26182a(this, this.f38994i)) == null)) {
            map.putAll(a);
        }
        AbstractC16640d dVar = this.f38991f;
        if (dVar == null || (str = dVar.mo26400a()) == null) {
            str = "";
        }
        map.put("resolvedUrl", str);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$p */
    public static final class C16523p extends C16481e {

        /* renamed from: a */
        public boolean f39632a;

        /* renamed from: b */
        final /* synthetic */ C16501j f39633b;

        /* renamed from: c */
        final /* synthetic */ C17029d f39634c;

        static {
            Covode.recordClassIndex(18954);
        }

        /* renamed from: com.bytedance.ies.bullet.kit.web.j$p$a */
        static final class CallableC16524a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ C16523p f39635a;

            /* renamed from: b */
            final /* synthetic */ String f39636b;

            /* renamed from: c */
            final /* synthetic */ long f39637c;

            /* renamed from: d */
            final /* synthetic */ long f39638d;

            static {
                Covode.recordClassIndex(18955);
            }

            CallableC16524a(C16523p pVar, String str, long j, long j2) {
                this.f39635a = pVar;
                this.f39636b = str;
                this.f39637c = j;
                this.f39638d = j2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Uri parse;
                Long remove;
                String str = this.f39636b;
                if (str == null || (parse = Uri.parse(str)) == null) {
                    return null;
                }
                C16501j jVar = this.f39635a.f39633b;
                long j = this.f39637c;
                long j2 = this.f39638d;
                C89219l.m154719c(parse, "");
                if ((C89219l.m154714a((Object) parse.getScheme(), (Object) "http") || C89219l.m154714a((Object) parse.getScheme(), (Object) "https")) && (remove = jVar.f39566D.remove(parse)) != null) {
                    remove.longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (jVar.f39563A) {
                        jVar.f39564B = currentTimeMillis;
                    }
                    jVar.f39563A = false;
                }
                if (!jVar.f39567E) {
                    C16257i iVar = (C16257i) jVar.f38994i.mo25832c(C16257i.class);
                    if (iVar != null && !iVar.mo25845a()) {
                        AbstractC16654o oVar = (AbstractC16654o) jVar.mo25790b_(AbstractC16654o.class);
                        if (oVar != null) {
                            C16607an anVar = new C16607an("bdx_monitor_web_first_screen_duration", null, null, 254);
                            anVar.f39738c = jVar.f38991f;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", j);
                            anVar.f39743h = jSONObject;
                            oVar.mo26319a(anVar);
                        }
                        AbstractC16654o oVar2 = (AbstractC16654o) jVar.mo25790b_(AbstractC16654o.class);
                        if (oVar2 != null) {
                            C16607an anVar2 = new C16607an("bdx_monitor_web_timeline", null, null, 254);
                            anVar2.f39738c = jVar.f38991f;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("precreate", iVar.f39052e);
                            anVar2.f39742g = jSONObject2;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("init_to_start_render", iVar.f39051d);
                            jSONObject3.put("webview_create", iVar.f39053f);
                            jSONObject3.put("webview_render", j2);
                            anVar2.f39743h = jSONObject3;
                            oVar2.mo26319a(anVar2);
                        }
                    }
                    jVar.f39567E = true;
                }
                return C89391z.f203057a;
            }
        }

        C16523p(C16501j jVar, C17029d dVar) {
            this.f39633b = jVar;
            this.f39634c = dVar;
        }

        public final void onLoadResource(WebView webView, String str) {
            C18288a aVar;
            super.onLoadResource(webView, str);
            C16488c cVar = this.f39633b.f39588w;
            if (cVar != null && (aVar = cVar.f39546j) != null) {
                aVar.mo29255c(str);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onRenderProcessGone, detail:".concat(String.valueOf(renderProcessGoneDetail)), null, null, 6);
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            webResourceRequest.getUrl();
            C61425e<WebResourceRequest, WebResourceResponse> o = C61439n.f139485e.mo68814o(new C61425e<>(webResourceRequest, webView, null, EnumC61424d.CONTINUE));
            if (o.f139473f == EnumC61424d.INTERCEPT && o.f139469b != null) {
                return o.f139469b;
            }
            if (o.f139473f != EnumC61424d.EXCEPTION || o.f139472e == null) {
                return super.shouldInterceptRequest(o.f139470c, (WebResourceRequest) o.f139468a);
            }
            throw o.f139472e;
        }

        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C18288a aVar;
            C16488c cVar = this.f39633b.f39588w;
            if (!(cVar == null || (aVar = cVar.f39546j) == null)) {
                Boolean valueOf = Boolean.valueOf(aVar.mo29253b(str));
                if (valueOf.booleanValue()) {
                    return valueOf.booleanValue();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            long j;
            Long l;
            Uri parse;
            MethodCollector.m26663i(2473);
            super.onPageFinished(webView, str);
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onPageFinished on url:".concat(String.valueOf(str)), null, null, 6);
            this.f39633b.mo26901y();
            if (webView != null) {
                String str2 = this.f39633b.f38993h.f39033a;
                C89219l.m154719c(webView, "");
                if (str2 != null) {
                    String str3 = "javascript:(function () {    window.reactId = '" + str2 + "';})();";
                    String a = C84357h.f188595a.mo129370a(webView, str3);
                    if (!TextUtils.isEmpty(a)) {
                        str3 = a;
                    }
                    webView.loadUrl(str3);
                }
            }
            if (!this.f39632a) {
                if (!(str == null || (parse = Uri.parse(str)) == null)) {
                    this.f39634c.mo26906b(parse);
                }
                C16257i iVar = (C16257i) this.f39633b.f38994i.mo25832c(C16257i.class);
                if (iVar == null || (l = iVar.f39049b) == null) {
                    j = 0;
                } else {
                    l.longValue();
                    j = System.currentTimeMillis() - l.longValue();
                }
                C1731i.m5635a((Callable) new CallableC16524a(this, str, j, System.currentTimeMillis() - this.f39633b.f39565C));
            }
            this.f39632a = false;
            MethodCollector.m26664o(2473);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
            if (r5 != null) goto L_0x00d8;
         */
        @Override // android.webkit.WebViewClient, com.bytedance.ies.bullet.service.base.web.C16694o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r13, java.lang.String r14) {
            /*
            // Method dump skipped, instructions count: 238
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.web.C16501j.C16523p.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (this.f39633b.f39590y != null) {
                SSWebView sSWebView = this.f39633b.f39590y;
                if (sSWebView == null) {
                    C89219l.m154710a("mWebView");
                }
                sSWebView.setPageStartUrl(str);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f39632a = true;
            }
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onReceivedHttpError, request:" + webResourceRequest + ", errorResponse:" + webResourceResponse, null, null, 6);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            this.f39632a = true;
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String str = null;
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onReceivedSslError, error:".concat(String.valueOf(sslError)), null, null, 6);
            if (webView != null && (url = webView.getUrl()) != null) {
                C17029d dVar = this.f39634c;
                Uri parse = Uri.parse(url);
                C89219l.m154709a((Object) parse, "");
                if (sslError != null) {
                    str = sslError.toString();
                }
                dVar.mo26904a(parse, new C16529l(-100, str, url));
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Boolean bool;
            CharSequence charSequence;
            Uri url;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f39632a = true;
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            C16501j jVar = this.f39633b;
            StringBuilder append = new StringBuilder("onReceivedError, request:").append(webResourceRequest).append(", isForMainFrame:");
            String str = null;
            if (webResourceRequest != null) {
                bool = Boolean.valueOf(webResourceRequest.isForMainFrame());
            } else {
                bool = null;
            }
            AbstractC16576j.C16578b.m30778a(jVar, append.append(bool).append(" error:").append(webResourceError).toString(), null, null, 6);
            Uri uri = this.f39633b.f39587v;
            if (uri != null) {
                int i = 0;
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    C17029d dVar = this.f39634c;
                    if (webResourceError != null) {
                        i = webResourceError.getErrorCode();
                        charSequence = webResourceError.getDescription();
                    } else {
                        charSequence = null;
                    }
                    if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
                        str = url.toString();
                    }
                    dVar.mo26904a(uri, new C16529l(i, charSequence, str));
                }
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Uri uri;
            this.f39632a = true;
            super.onReceivedError(webView, i, str, str2);
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onReceivedError, errorCode:" + i + ", description:" + str, null, null, 6);
            if (Build.VERSION.SDK_INT < 23 && (uri = this.f39633b.f39587v) != null) {
                this.f39634c.mo26904a(uri, new C16529l(i, str, str2));
            }
        }

        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            AbstractC16576j.C16578b.m30778a(this.f39633b, "onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2, null, null, 6);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: q */
    public final void mo25803q() {
        Context context;
        SSWebView a;
        boolean z;
        C16602ak b;
        JSONObject jSONObject;
        Iterator<String> keys;
        AbstractC12021c monitorHelper;
        this.f39575j = null;
        this.f39583r = null;
        this.f39584s = null;
        this.f39585t = null;
        this.f39581p.clear();
        this.f39582q.clear();
        this.f39579n.clear();
        this.f39580o.clear();
        C16511i iVar = new C16511i(this);
        for (T t : mo25801o()) {
            if ((t instanceof AbstractC16497f) && t != null) {
                iVar.invoke(t);
            }
        }
        AbstractC16214m r_ = mo25805r_();
        if ((r_ instanceof AbstractC16497f) && r_ != null) {
            iVar.invoke(r_);
        }
        if (this.f38989d && (context = (Context) this.f38994i.mo25832c(Context.class)) != null) {
            C16643g gVar = new C16643g("webviewcreate");
            WebView a2 = mo26219v().mo26498a(context).mo26497a();
            if (a2 instanceof SSWebView) {
                a = (SSWebView) a2;
            } else if (mo25806s() != null) {
                a = WebKitApi.m30568a(context);
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
            AbstractC16654o oVar = (AbstractC16654o) mo25790b_(AbstractC16654o.class);
            a.setMonitorHelper(this.f39569M);
            if (!(oVar == null || (b = oVar.mo26321b()) == null || (jSONObject = b.f39726d) == null || (keys = jSONObject.keys()) == null)) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!(opt == null || (monitorHelper = a.getMonitorHelper()) == null)) {
                        monitorHelper.mo19220a(a, next, opt);
                    }
                }
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - gVar.f39808a);
            C16257i iVar2 = (C16257i) this.f38994i.mo25832c(C16257i.class);
            if (iVar2 != null) {
                iVar2.f39053f = Long.valueOf(millis);
                iVar2.f39052e = C23627a.m44672a(a);
            }
            this.f39590y = a;
            C16248b bVar = this.f38994i;
            SSWebView sSWebView = this.f39590y;
            if (sSWebView == null) {
                C89219l.m154710a("mWebView");
            }
            bVar.mo25828a(WebView.class, sSWebView);
            SSWebView sSWebView2 = this.f39590y;
            if (sSWebView2 == null) {
                C89219l.m154710a("mWebView");
            }
            C16488c a3 = C16488c.C16489a.m30630a(sSWebView2);
            Boolean bool = this.f39583r;
            boolean z2 = false;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            a3.f39542f = z;
            String str = this.f39584s;
            if (str == null) {
                str = "ToutiaoJSBridge";
            }
            C16488c c = a3.mo26202c(str);
            String str2 = this.f39585t;
            if (str2 == null) {
                str2 = "bytedance";
            }
            C16488c d = c.mo26204d(str2).mo26196a(this.f39581p).mo26201b(this.f39582q).mo26203c(this.f39579n).mo26205d(this.f39580o);
            AbstractC16486b.AbstractC16487a aVar = this.f39589x;
            if (aVar != null) {
                C89219l.m154719c(aVar, "");
                d.f39545i = aVar;
            }
            Boolean bool2 = this.f39586u;
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            d.f39544h = z2;
            SSWebView sSWebView3 = this.f39590y;
            if (sSWebView3 == null) {
                C89219l.m154710a("mWebView");
            }
            C16488c b2 = d.mo26195a(m30656a(sSWebView3)).mo26200b();
            this.f38994i.mo25831b(C18288a.class, b2.f39546j);
            this.f38994i.mo25831b(C18368x.class, b2.f39547k);
            this.f39588w = b2;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.web.AbstractC16494c
    /* renamed from: a */
    public final void mo26208a(Map<String, String> map) {
        this.f39571O = map;
    }

    /* renamed from: a */
    private final C23656a m30656a(SSWebView sSWebView) {
        return new C16514l(this, sSWebView, sSWebView);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: b */
    public final void mo26059b(Activity activity) {
        onEvent(new C16507e());
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    public final void onEvent(AbstractC16191p pVar) {
        C89219l.m154719c(pVar, "");
        Object b = pVar.mo25700b();
        JSONObject jSONObject = null;
        if (b != null && (b instanceof JSONObject)) {
            jSONObject = (JSONObject) b;
        }
        C16488c cVar = this.f39588w;
        if (cVar != null) {
            cVar.mo26191a(pVar.mo25699a(), jSONObject);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: a */
    public final void mo26053a(Activity activity) {
        if (mo26221x() && this.f39591z.compareAndSet(false, true)) {
            AbstractC16576j.C16578b.m30778a(this, "send pageReused event for reused view", null, null, 6);
            onEvent(new C16508f(this));
        }
        onEvent(new C16509g());
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$r */
    static final class C16526r extends AbstractC89220m implements AbstractC89172b<AbstractC16495d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39640a;

        static {
            Covode.recordClassIndex(18957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16526r(C16501j jVar) {
            super(1);
            this.f39640a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC16495d dVar) {
            AbstractC16495d dVar2 = dVar;
            C89219l.m154719c(dVar2, "");
            C16481e a = dVar2.mo26177a();
            if (a != null) {
                a.mo26186a(this.f39640a);
                this.f39640a.mo26219v().mo26499b().mo26522a(a);
            }
            C16480d b = dVar2.mo26178b();
            if (b != null) {
                b.mo26185a(this.f39640a);
                this.f39640a.mo26219v().mo26500c().mo26464a(b);
            }
            AbstractC16484b c = dVar2.mo26179c();
            if (c != null) {
                this.f39640a.f39576k.add(c);
            }
            AbstractC16498g d = dVar2.mo26180d();
            if (d != null) {
                this.f39640a.f39577l = d;
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: b */
    public final void mo25796b(Throwable th) {
        super.mo25796b(th);
        AbstractC17045g z = mo26902z();
        if (z != null) {
            z.mo26827b(this.f39572P);
        }
        this.f38994i.mo25826a(C18288a.class);
        this.f38994i.mo25826a(C18368x.class);
        C16488c cVar = this.f39588w;
        if (cVar != null) {
            C18288a aVar = cVar.f39546j;
            if (aVar != null) {
                aVar.mo29247a();
            }
            C18364w wVar = cVar.f39548l;
            if (wVar != null) {
                wVar.mo29403a();
            }
        }
        this.f39588w = null;
        Iterator<T> it = this.f40544H.iterator();
        while (it.hasNext()) {
            SSWebView sSWebView = (SSWebView) it.next().f40551a;
            sSWebView.setWebChromeClient(null);
            C84367b.m145126a();
            sSWebView.setWebViewClient(C23833c.m45038a(null));
            try {
                sSWebView.destroy();
            } catch (Throwable unused) {
            }
        }
        mo26219v().mo26502e();
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$i */
    static final class C16511i extends AbstractC89220m implements AbstractC89172b<AbstractC16497f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39605a;

        static {
            Covode.recordClassIndex(18942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16511i(C16501j jVar) {
            super(1);
            this.f39605a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC16497f fVar) {
            AbstractC16199b<?> value;
            AbstractC16497f fVar2 = fVar;
            C89219l.m154719c(fVar2, "");
            if (this.f39605a.f39575j == null) {
                this.f39605a.f39575j = fVar2.mo26181a();
            } else {
                C16476a a = fVar2.mo26181a();
                C16476a aVar = this.f39605a.f39575j;
                if (aVar != null) {
                    C89219l.m154719c(a, "");
                    for (Map.Entry<String, AbstractC16199b<?>> entry : a.mo25754a().entrySet()) {
                        AbstractC16199b<?> bVar = aVar.mo25754a().get(entry.getKey());
                        if (!(bVar == null || (value = entry.getValue()) == null)) {
                            bVar.mo25755a(value);
                        }
                    }
                }
            }
            AbstractC16486b b = fVar2.mo26184b();
            if (b != null) {
                Boolean a2 = b.mo26170a();
                if (a2 != null) {
                    this.f39605a.f39583r = Boolean.valueOf(a2.booleanValue());
                }
                String b2 = b.mo26171b();
                if (b2 != null) {
                    this.f39605a.f39584s = b2;
                }
                List<String> c = b.mo26172c();
                if (c != null) {
                    this.f39605a.f39581p.addAll(c);
                }
                List<String> d = b.mo26173d();
                if (d != null) {
                    this.f39605a.f39582q.addAll(d);
                }
                List<String> e = b.mo26174e();
                if (e != null) {
                    this.f39605a.f39579n.addAll(e);
                }
                List<String> f = b.mo26175f();
                if (f != null) {
                    this.f39605a.f39580o.addAll(f);
                }
                Boolean g = b.mo26176g();
                if (g != null) {
                    this.f39605a.f39586u = Boolean.valueOf(g.booleanValue());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0229  */
    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26054a(com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d<com.bytedance.ies.bullet.kit.web.SSWebView> r10) {
        /*
        // Method dump skipped, instructions count: 698
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.web.C16501j.mo26054a(com.bytedance.ies.bullet.ui.common.c.d):void");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: a */
    public final void mo26058a(AbstractC89172b<? super List<C17029d<SSWebView>>, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        if (this.f38994i.mo25832c(Context.class) != null) {
            SSWebView sSWebView = this.f39590y;
            if (sSWebView == null) {
                C89219l.m154710a("mWebView");
            }
            bVar.invoke(C89070n.m154516a(new C17029d(sSWebView)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.web.j$m */
    public static final class C16515m extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f39618a;

        static {
            Covode.recordClassIndex(18946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16515m(C89233z.C89238e eVar) {
            super(2);
            this.f39618a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C89233z.C89238e eVar = this.f39618a;
            T t = (T) Uri.parse(str);
            C89219l.m154709a((Object) t, "");
            eVar.element = t;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static int m30654a(Context context, float f) {
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return (int) ((f / resources.getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$j */
    static final class C16512j extends AbstractC89220m implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SSWebView f39606a;

        /* renamed from: b */
        final /* synthetic */ C17029d f39607b;

        /* renamed from: c */
        final /* synthetic */ C16501j f39608c;

        /* renamed from: d */
        final /* synthetic */ Uri f39609d;

        /* renamed from: e */
        final /* synthetic */ boolean f39610e;

        /* renamed from: f */
        final /* synthetic */ boolean f39611f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89238e f39612g;

        static {
            Covode.recordClassIndex(18943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16512j(SSWebView sSWebView, C17029d dVar, C16501j jVar, Uri uri, boolean z, boolean z2, C89233z.C89238e eVar) {
            super(2);
            this.f39606a = sSWebView;
            this.f39607b = dVar;
            this.f39608c = jVar;
            this.f39609d = uri;
            this.f39610e = z;
            this.f39611f = z2;
            this.f39612g = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            C89233z.C89238e eVar = this.f39612g;
            T t = (T) Uri.parse(str2);
            C89219l.m154709a((Object) t, "");
            eVar.element = t;
            if (map2 == null || map2.isEmpty()) {
                this.f39606a.mo38818a(str2, new C23557c[0]);
            } else {
                this.f39606a.mo38815a(str2, map2, new C23557c[0]);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$n */
    static final class C16516n extends AbstractC89220m implements AbstractC89183m<String, AbstractC16192q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39619a;

        static {
            Covode.recordClassIndex(18947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16516n(C16501j jVar) {
            super(2);
            this.f39619a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, AbstractC16192q qVar) {
            String str2 = str;
            final AbstractC16192q qVar2 = qVar;
            C89219l.m154719c(str2, "");
            C89219l.m154719c(qVar2, "");
            C16488c cVar = this.f39619a.f39588w;
            if (cVar != null) {
                C165171 r1 = new AbstractC18293d(this) {
                    /* class com.bytedance.ies.bullet.kit.web.C16501j.C16516n.C165171 */

                    /* renamed from: a */
                    final /* synthetic */ C16516n f39620a;

                    static {
                        Covode.recordClassIndex(18948);
                    }

                    {
                        this.f39620a = r1;
                    }

                    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
                    public final void call(final C18297h hVar, JSONObject jSONObject) {
                        String str;
                        JSONObject jSONObject2;
                        C16488c cVar;
                        C16501j jVar = this.f39620a.f39619a;
                        StringBuilder sb = new StringBuilder("bullet web func: ");
                        AbstractC16183k kVar = null;
                        if (hVar != null) {
                            str = hVar.f43670c;
                        } else {
                            str = null;
                        }
                        AbstractC16576j.C16578b.m30778a(jVar, sb.append(str).toString(), null, null, 6);
                        SystemClock.elapsedRealtime();
                        if (hVar == null || hVar.f43671d == null) {
                            jSONObject2 = new JSONObject();
                        } else {
                            jSONObject2 = hVar.f43671d;
                        }
                        this.f39620a.f39619a.printLog("call web bridge method named " + hVar.f43670c + " with params " + jSONObject2, EnumC16586p.D, "BridgeRegistry");
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(StringSet.type, hVar.f43668a);
                            jSONObject3.put("func", hVar.f43670c);
                            jSONObject3.put("callback_id", hVar.f43669b);
                            jSONObject3.put("version", Integer.valueOf(hVar.f43672e));
                            jSONObject3.put("needCallback", Boolean.valueOf(hVar.f43676i));
                            jSONObject3.put("permissionGroup", hVar.f43675h);
                            jSONObject2.put("jsMsg", jSONObject3);
                            jSONObject2.put("func", hVar.f43670c);
                            jSONObject2.put("permissionGroup", hVar.f43675h);
                            jSONObject2.put("res", jSONObject);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        AbstractC16192q qVar = qVar2;
                        if (qVar == null || (qVar instanceof AbstractC16183k)) {
                            if (qVar instanceof AbstractC16183k) {
                                kVar = qVar;
                            }
                            AbstractC16183k kVar2 = kVar;
                            if (kVar2 != null) {
                                C89219l.m154709a((Object) jSONObject2, "");
                                kVar2.mo25748a(jSONObject2, new AbstractC16183k.AbstractC16185b(this) {
                                    /* class com.bytedance.ies.bullet.kit.web.C16501j.C16516n.C165171.C165181 */

                                    /* renamed from: a */
                                    final /* synthetic */ C165171 f39622a;

                                    static {
                                        Covode.recordClassIndex(18949);
                                    }

                                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                                    /* renamed from: a */
                                    public final void mo25704a(JSONObject jSONObject) {
                                        C89219l.m154719c(jSONObject, "");
                                        AbstractC16192q qVar = qVar2;
                                        if (qVar != null) {
                                            AbstractC16183k kVar = (AbstractC16183k) qVar;
                                            C16488c cVar = this.f39622a.f39620a.f39619a.f39588w;
                                            if (cVar != null) {
                                                cVar.mo26198a(kVar, hVar.f43669b, jSONObject);
                                            }
                                            this.f39622a.f39620a.f39619a.printLog("complete web bridge named " + hVar.f43670c + " success with result " + jSONObject, EnumC16586p.D, "BridgeRegistry");
                                            return;
                                        }
                                        throw new C89388w("null cannot be cast to non-null type");
                                    }

                                    {
                                        this.f39622a = r1;
                                    }

                                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                                    /* renamed from: a */
                                    public final void mo25702a(int i, String str) {
                                        C16488c cVar;
                                        C89219l.m154719c(str, "");
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("code", i);
                                            jSONObject.put("msg", str);
                                            AbstractC16192q qVar = qVar2;
                                            if (qVar != null) {
                                                AbstractC16183k kVar = (AbstractC16183k) qVar;
                                                if (!(kVar == null || (cVar = this.f39622a.f39620a.f39619a.f39588w) == null)) {
                                                    cVar.mo26198a(kVar, hVar.f43669b, jSONObject);
                                                }
                                                this.f39622a.f39620a.f39619a.printLog("complete web bridge named " + hVar.f43670c + " failure with status[" + i + ", " + str + ']', EnumC16586p.D, "BridgeRegistry");
                                                return;
                                            }
                                            throw new C89388w("null cannot be cast to non-null type");
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    }

                                    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
                                    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k.AbstractC16185b
                                    /* renamed from: a */
                                    public final void mo25703a(int i, String str, JSONObject jSONObject) {
                                        String str2;
                                        String str3;
                                        C16488c cVar;
                                        C89219l.m154719c(str, "");
                                        C89219l.m154719c(jSONObject, "");
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("code", i);
                                            jSONObject2.put("msg", str);
                                            jSONObject2.put("data", jSONObject);
                                            AbstractC16192q qVar = qVar2;
                                            if (qVar != null) {
                                                AbstractC16183k kVar = (AbstractC16183k) qVar;
                                                if (!(kVar == null || (cVar = this.f39622a.f39620a.f39619a.f39588w) == null)) {
                                                    cVar.mo26198a(kVar, hVar.f43669b, jSONObject2);
                                                }
                                                try {
                                                    if (str.length() <= 0 || str == null || (str + " with [" + jSONObject + ']') == null) {
                                                        str3 = jSONObject.toString();
                                                        C89219l.m154709a((Object) str3, "");
                                                    }
                                                    str2 = C89379q.m157068constructorimpl(str3);
                                                } catch (Throwable th) {
                                                    str2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                                                }
                                                if (!C89379q.m157073isFailureimpl(str2)) {
                                                    str = str2;
                                                }
                                                this.f39622a.f39620a.f39619a.printLog("complete web bridge named " + hVar.f43670c + " failure with status[" + i + ", " + str + ']', EnumC16586p.D, "BridgeRegistry");
                                                return;
                                            }
                                            throw new C89388w("null cannot be cast to non-null type");
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                            }
                        } else {
                            final AbstractC16194r rVar = (AbstractC16194r) qVar;
                            final AbstractC89183m<Object, Class<?>, Object> a = C16158a.m30009a(JSONObject.class, Map.class);
                            final AbstractC89183m<Object, Class<?>, Object> a2 = C16158a.m30009a(Map.class, JSONObject.class);
                            if (rVar != null) {
                                new AbstractC89172b<Object, Object>() {
                                    /* class com.bytedance.ies.bullet.kit.web.C16501j.C16516n.C165171.C165192 */

                                    static {
                                        Covode.recordClassIndex(18950);
                                    }

                                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                    public final Object invoke(Object obj) {
                                        C89219l.m154719c(obj, "");
                                        AbstractC89183m mVar = a;
                                        if (mVar != null) {
                                            Class<?> e = rVar.mo25753e();
                                            if (e == null) {
                                                e = Object.class;
                                            }
                                            Object invoke = mVar.invoke(obj, e);
                                            if (invoke != null) {
                                                return invoke;
                                            }
                                        }
                                        return C89041ag.m154415a();
                                    }
                                };
                                new AbstractC89172b<Object, Object>() {
                                    /* class com.bytedance.ies.bullet.kit.web.C16501j.C16516n.C165171.C165203 */

                                    static {
                                        Covode.recordClassIndex(18951);
                                    }

                                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                    public final Object invoke(Object obj) {
                                        C89219l.m154719c(obj, "");
                                        AbstractC89183m mVar = a2;
                                        if (mVar != null) {
                                            Class<?> e = rVar.mo25753e();
                                            if (e == null) {
                                                e = Object.class;
                                            }
                                            Object invoke = mVar.invoke(obj, e);
                                            if (invoke != null) {
                                                return invoke;
                                            }
                                        }
                                        return C89041ag.m154415a();
                                    }
                                };
                            }
                            try {
                                C89219l.m154709a((Object) jSONObject2, "");
                                C16165f.m30014a(rVar, jSONObject2, new AbstractC16194r.AbstractC16195a<JSONObject>(this) {
                                    /* class com.bytedance.ies.bullet.kit.web.C16501j.C16516n.C165171.C165214 */

                                    /* renamed from: a */
                                    final /* synthetic */ C165171 f39628a;

                                    static {
                                        Covode.recordClassIndex(18952);
                                    }

                                    {
                                        this.f39628a = r1;
                                    }
                                });
                            } catch (Throwable th) {
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("code", 0);
                                    jSONObject4.put("msg", th.toString());
                                    if (!(rVar == null || (cVar = this.f39620a.f39619a.f39588w) == null)) {
                                        cVar.mo26198a(rVar, hVar.f43669b, jSONObject4);
                                    }
                                    this.f39620a.f39619a.printLog("complete web bridge named " + hVar.f43670c + " failure with status[0, " + th.toString() + ']', EnumC16586p.D, "BridgeRegistry");
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                        hVar.f43676i = qVar2.bh_();
                    }
                };
                if (cVar.f39547k != null) {
                    C18368x xVar = cVar.f39547k;
                    if (xVar == null) {
                        C89219l.m154707a();
                    }
                    xVar.mo29410a(str2, r1);
                } else {
                    C18288a aVar = cVar.f39546j;
                    if (aVar != null) {
                        aVar.mo29245a(str2, r1);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$q */
    static final class C16525q extends AbstractC89220m implements AbstractC89183m<String, AbstractC16192q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16501j f39639a;

        static {
            Covode.recordClassIndex(18956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16525q(C16501j jVar) {
            super(2);
            this.f39639a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, AbstractC16192q qVar) {
            AbstractC16192q qVar2 = qVar;
            C89219l.m154719c(str, "");
            C89219l.m154719c(qVar2, "");
            int i = C16528k.f39642a[qVar2.mo25723b().ordinal()];
            if (i == 1) {
                List<String> list = this.f39639a.f39579n;
                if ((true ^ this.f39639a.f39579n.contains(str)) && list != null) {
                    list.add(str);
                }
            } else if (i == 2) {
                List<String> list2 = this.f39639a.f39580o;
                if ((true ^ this.f39639a.f39580o.contains(str)) && list2 != null) {
                    list2.add(str);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: a */
    public final void mo26218a(C17029d<SSWebView> dVar, Uri uri) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(uri, "");
        this.f39563A = true;
        this.f39574R = System.currentTimeMillis();
        super.mo26218a(dVar, uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: java.util.List<com.bytedance.ies.bullet.kit.web.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: b */
    public final void mo25797b(List<String> list, AbstractC16253f fVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        super.mo25797b(list, fVar);
        mo26219v().mo26499b().f39872a.clear();
        mo26219v().mo26500c().f39859a.clear();
        this.f39576k.clear();
        C16526r rVar = new C16526r(this);
        Object c = this.f38994i.mo25832c(AbstractC16484b.class);
        if (c != null) {
            this.f39576k.add(c);
        }
        C16481e eVar = (C16481e) this.f38994i.mo25832c(C16481e.class);
        if (eVar != null) {
            eVar.mo26186a(this);
            mo26219v().mo26499b().mo26522a(eVar);
        }
        mo26219v().mo26499b().mo26522a(new C16500i(this.f39569M));
        mo26219v().mo26500c().mo26464a(new C16499h(this.f39569M));
        for (T t : mo25802p()) {
            if ((t instanceof AbstractC16495d) && t != null) {
                rVar.invoke(t);
            }
        }
        AbstractC16204e s_ = mo25807s_();
        if ((s_ instanceof AbstractC16495d) && s_ != null) {
            rVar.invoke(s_);
        }
        AbstractC16187m mVar = this.f38988c;
        if (mVar != null) {
            mVar.mo25734a(new C16525q(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: android.net.Uri */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: a */
    public final void mo25793a(Uri uri, boolean z) {
        AbstractC89188r<WebView, String, Map<String, String>, AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> a;
        Long b;
        Context context;
        boolean z2 = z;
        MethodCollector.m26663i(914);
        C89219l.m154719c(uri, "");
        Map<String, String> map = null;
        AbstractC16576j.C16578b.m30778a(this, "start to load url: ".concat(String.valueOf(uri)), null, null, 6);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = uri;
        if (C89219l.m154714a((Object) mo26061t().f39948x.mo26550b(), (Object) true)) {
            T t = (T) uri.buildUpon().appendQueryParameter("container_id", this.f38993h.f39033a).build();
            C89219l.m154709a((Object) t, "");
            eVar.element = t;
        }
        if (C89219l.m154714a((Object) mo26061t().f40071X.mo26550b(), (Object) "true") && (context = (Context) this.f38994i.mo25832c(Context.class)) != null) {
            T t2 = (T) eVar.element.buildUpon().appendQueryParameter("status_bar_height", String.valueOf(m30654a(context, ((float) C17039d.m31496a(context)) + 0.0f))).build();
            C89219l.m154709a((Object) t2, "");
            eVar.element = t2;
        }
        Uri uri2 = this.f39587v;
        if (uri2 == null || (!C89219l.m154714a(uri2, uri))) {
            m30652A();
            if (!this.f39573Q.isEmpty()) {
                AbstractC16674b d = mo26219v().mo26501d();
                d.mo26486a(this.f39573Q);
                if (this.f39590y != null) {
                    SSWebView sSWebView = this.f39590y;
                    if (sSWebView == null) {
                        C89219l.m154710a("mWebView");
                    }
                    d.mo26485a(sSWebView);
                }
            }
        }
        C16257i iVar = (C16257i) this.f38994i.mo25832c(C16257i.class);
        if (!(iVar == null || iVar.f39051d != null || iVar.f39049b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = iVar.f39049b;
            if (l == null) {
                C89219l.m154707a();
            }
            iVar.f39051d = Long.valueOf(currentTimeMillis - l.longValue());
        }
        this.f39565C = System.currentTimeMillis();
        if (C89219l.m154714a((Object) mo26061t().f39917H.mo26550b(), (Object) true) && (b = mo26061t().f39918I.mo26550b()) != null) {
            long longValue = b.longValue();
            if (longValue > 0) {
                Thread.sleep(longValue);
            }
        }
        boolean x = mo26221x();
        for (T t3 : this.f40544H) {
            t3.mo26903a(uri);
            SSWebView sSWebView2 = (SSWebView) t3.f40551a;
            if (z2 || x) {
                eVar.element = (T) m30655a(t3, eVar.element, z, x);
            } else {
                AbstractC16498g gVar = this.f39577l;
                if (gVar != null && (a = gVar.mo26211a()) != null) {
                    Map<String, String> map2 = this.f39571O;
                    if (map2 != null) {
                        map = C89041ag.m154431d(map2);
                    }
                    a.mo8774a(sSWebView2, String.valueOf(eVar.element), map, new C16512j(sSWebView2, t3, this, uri, z, false, eVar));
                } else if (this.f39571O != null) {
                    String valueOf = String.valueOf(eVar.element);
                    Map<String, String> map3 = this.f39571O;
                    if (map3 == null) {
                        C89219l.m154707a();
                    }
                    sSWebView2.loadUrl(valueOf, map3);
                } else {
                    sSWebView2.loadUrl(String.valueOf(eVar.element));
                }
            }
            z2 = z;
            map = null;
        }
        this.f39587v = eVar.element;
        MethodCollector.m26664o(914);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.j$l */
    public static final class C16514l extends C23656a {

        /* renamed from: a */
        final /* synthetic */ C16501j f39616a;

        /* renamed from: b */
        final /* synthetic */ SSWebView f39617b;

        static {
            Covode.recordClassIndex(18945);
        }

        @Override // com.bytedance.webx.monitor.p1776a.C23656a, com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13317a(String str) {
        }

        @Override // com.bytedance.webx.monitor.p1776a.C23656a, com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13318a(String str, C18326ak akVar) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16514l(C16501j jVar, SSWebView sSWebView, WebView webView) {
            super(webView);
            this.f39616a = jVar;
            this.f39617b = sSWebView;
        }

        @Override // com.bytedance.webx.monitor.p1776a.C23656a, com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: b */
        public final void mo13321b(String str, String str2, int i) {
            this.f39616a.printLog("complete web bridge named " + str2 + " failure with status [" + C16501j.m30653a(i) + ']', EnumC16586p.D, "BridgeRegistry");
            super.mo13321b(str, str2, i);
        }

        @Override // com.bytedance.webx.monitor.p1776a.C23656a, com.bytedance.ies.web.jsbridge2.AbstractC18356p
        /* renamed from: a */
        public final void mo13320a(String str, String str2, int i, String str3, C18326ak akVar) {
            this.f39616a.printLog("complete web bridge named " + str2 + " failure with status [" + C16501j.m30653a(i) + ", " + str3 + ']', EnumC16586p.D, "BridgeRegistry");
            super.mo13320a(str, str2, i, str3, akVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: c */
    public final void mo25798c(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        bVar.invoke(uri);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.net.Uri */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final Uri m30655a(C17029d<SSWebView> dVar, Uri uri, boolean z, boolean z2) {
        T t;
        AbstractC89188r<WebView, String, Map<String, String>, AbstractC89183m<? super String, ? super Map<String, String>, C89391z>, C89391z> rVar;
        if (z) {
            AbstractC16576j.C16578b.m30778a(this, "start to reload webview", null, null, 6);
            mo25777l();
            return uri;
        }
        if (z2) {
            AbstractC16576j.C16578b.m30778a(this, "start to reload cached view", null, null, 6);
            AbstractC16498g gVar = this.f39577l;
            if (gVar != null) {
                rVar = gVar.mo26211a();
            } else {
                rVar = null;
            }
            if (rVar == null) {
                t = uri;
            } else {
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = uri;
                SSWebView sSWebView = this.f39590y;
                if (sSWebView == null) {
                    C89219l.m154710a("mWebView");
                }
                rVar.mo8774a(sSWebView, String.valueOf(uri), null, new C16515m(eVar));
                t = eVar.element;
            }
            this.f39587v = t;
            mo25804r();
            SSWebView sSWebView2 = this.f39590y;
            if (sSWebView2 == null) {
                C89219l.m154710a("mWebView");
            }
            sSWebView2.onResume();
            mo26901y();
        } else {
            t = uri;
        }
        dVar.mo26906b(uri);
        return t;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16501j(WebKitApi webKitApi, C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        super(webKitApi, zVar, list, fVar, bVar);
        String str;
        C89219l.m154719c(webKitApi, "");
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        AbstractC16654o oVar = (AbstractC16654o) mo25790b_(AbstractC16654o.class);
        AbstractC12021c cVar = null;
        String str2 = null;
        if (oVar != null) {
            AbstractC12021c a = C12044i.m21365a();
            AbstractC12021c.C12022a d = a.mo19228d();
            d.mo19254a(new C16530m.C16531a(oVar));
            C16602ak b = oVar.mo26321b();
            if (b != null) {
                str = b.f39724b;
            } else {
                str = null;
            }
            d.mo19258b(str);
            C16602ak b2 = oVar.mo26321b();
            d.mo19255a(b2 != null ? b2.f39723a : str2);
            d.mo19257b();
            d.mo19253a();
            d.mo19256a(SSWebView.class.getName());
            d.mo19260d();
            d.mo19259c();
            a.mo19227a(d);
            cVar = a;
        }
        this.f39569M = cVar;
        this.f39578m = C89250i.m154773a((AbstractC89171a) new C16505c(bVar));
        this.f39579n = new ArrayList();
        this.f39580o = new ArrayList();
        this.f39581p = new ArrayList();
        this.f39582q = new ArrayList();
        this.f39591z = new AtomicBoolean(false);
        this.f39570N = C89250i.m154773a((AbstractC89171a) new C16510h(this, bVar));
        this.f39572P = new C16503b(this);
        this.f39573Q = new LinkedHashMap();
        this.f39563A = true;
        this.f39566D = new LinkedHashMap();
    }
}
