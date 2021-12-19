package com.p2082ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15424v;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.p2082ss.android.sdk.webview.AbstractC30261g;
import com.p2082ss.android.sdk.webview.C30244b;
import com.p2082ss.android.sdk.webview.C30245c;
import com.p2082ss.android.sdk.webview.C30278q;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.C40517a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40522d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40611f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40632e;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2713f.C40659d;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40690d;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.CWebViewInterceptor;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.experiment.C46870e;
import com.p2082ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p2282ad.settings.C33383a;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.web.C81523a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView */
public class CrossPlatformWebView extends FrameLayout implements AbstractC40735a, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private long f95341A;

    /* renamed from: B */
    private final Set<AbstractC89172b<Boolean, C89391z>> f95342B;

    /* renamed from: C */
    private SparseArray f95343C;

    /* renamed from: a */
    public SingleWebView f95344a;

    /* renamed from: b */
    public final Set<AbstractC40739d> f95345b;

    /* renamed from: c */
    public int f95346c;

    /* renamed from: d */
    public boolean f95347d;

    /* renamed from: e */
    public AbstractC40547m f95348e;

    /* renamed from: f */
    public C34337k f95349f;

    /* renamed from: g */
    public C40618a f95350g;

    /* renamed from: h */
    public String f95351h;

    /* renamed from: i */
    boolean f95352i;

    /* renamed from: j */
    private final C40742g f95353j;

    /* renamed from: k */
    private C67674b f95354k;

    /* renamed from: l */
    private final C40517a f95355l;

    /* renamed from: m */
    private boolean f95356m;

    /* renamed from: n */
    private final AbstractC89244h f95357n;

    /* renamed from: o */
    private boolean f95358o;

    /* renamed from: p */
    private final AbstractC40740e f95359p;

    /* renamed from: q */
    private final AbstractC40746j f95360q;

    /* renamed from: r */
    private AbstractC40690d f95361r;

    /* renamed from: s */
    private AbstractC40691e f95362s;

    /* renamed from: t */
    private final String f95363t;

    /* renamed from: u */
    private final C30245c f95364u;

    /* renamed from: v */
    private Map<String, String> f95365v;

    /* renamed from: w */
    private AbstractC40591g f95366w;

    /* renamed from: x */
    private boolean f95367x;

    /* renamed from: y */
    private Throwable f95368y;

    /* renamed from: z */
    private long f95369z;

    static {
        Covode.recordClassIndex(48572);
    }

    public CrossPlatformWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public View mo69910a(int i) {
        if (this.f95343C == null) {
            this.f95343C = new SparseArray();
        }
        View view = (View) this.f95343C.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f95343C.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: c */
    public final void mo69925c() {
        this.f95367x = true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(179, new RunnableC90250g(CrossPlatformWebView.class, "onEvent", C30244b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(Integer.valueOf((int) LiveFeedRefreshTimeSetting.DEFAULT), new RunnableC90250g(CrossPlatformWebView.class, "onJsBroadcastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public final C40659d getTimeStatisticsUtils() {
        return (C40659d) this.f95357n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$c */
    public static final class C40726c implements AbstractC40745i {
        static {
            Covode.recordClassIndex(48575);
        }

        C40726c() {
        }
    }

    public final int getCurrentMode() {
        return this.f95346c;
    }

    public final AbstractC40691e getCustomWebViewStatus() {
        return this.f95362s;
    }

    public final boolean getDisplayed() {
        return this.f95356m;
    }

    public final Throwable getError() {
        return this.f95368y;
    }

    public final AbstractC40690d getIFullScreen() {
        return this.f95361r;
    }

    public final long getLoadRNViewCompleteTimestamp() {
        return this.f95369z;
    }

    public final String getLogTag() {
        return this.f95363t;
    }

    public final C40517a getMDidMountHandler() {
        return this.f95355l;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    public C34337k getMonitorSession() {
        return this.f95349f;
    }

    public final C40742g getRegistry() {
        return this.f95353j;
    }

    public final C67674b getSearchEnterParam() {
        return this.f95354k;
    }

    public final boolean getShouldShowProgressBarBg() {
        return this.f95358o;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    public C40742g getViewStatusRegistry() {
        return this.f95353j;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: a */
    public final boolean mo69922a() {
        if (this.f95346c == 2) {
            return false;
        }
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        if (!singleWebView.canGoBack()) {
            return false;
        }
        SingleWebView singleWebView2 = this.f95344a;
        if (singleWebView2 == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView2.goBack();
        return true;
    }

    /* renamed from: a */
    public final void mo69921a(boolean z) {
        if (z) {
            View a = mo69910a(R.id.a6j);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            ((DmtStatusView) mo69910a(R.id.cg3)).mo27384f();
            return;
        }
        View a2 = mo69910a(R.id.a6j);
        C89219l.m154716b(a2, "");
        a2.setVisibility(8);
        ((DmtStatusView) mo69910a(R.id.cg3)).mo27379a(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo69915a(Integer num, String str, String str2, boolean z) {
        C40628b bVar;
        C40628b bVar2;
        JSONObject jSONObject = new JSONObject();
        m82147a(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            m82147a(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str2);
            m82147a(jSONObject, "url", str2);
            C89219l.m154716b(parse, "");
            m82147a(jSONObject, "host", parse.getHost());
            m82147a(jSONObject, "path", parse.getPath());
            if (str2 != null && !C89361p.m154874b(str2, "about:blank", false)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (C89219l.m154714a((Object) parse.getQueryParameter("_enable_loading_duration_report"), (Object) "1")) {
                        if (!TextUtils.isEmpty(parse.getQueryParameter("_project_name"))) {
                            m82147a(jSONObject2, "project_name", parse.getQueryParameter("_project_name"));
                        }
                        if (!TextUtils.isEmpty(parse.getQueryParameter("_enter_from"))) {
                            m82147a(jSONObject2, "enter_from", parse.getQueryParameter("_enter_from"));
                        }
                        jSONObject2.put("duration", SystemClock.elapsedRealtime() - this.f95341A);
                        C39162r.m79461a("client_loading_duration", jSONObject2);
                    }
                } catch (Exception unused) {
                }
            }
        }
        C40618a crossPlatformParams = getCrossPlatformParams();
        if (((crossPlatformParams == null || (bVar2 = crossPlatformParams.f95069b) == null) ? 0 : bVar2.f95106a) > 0) {
            C40618a crossPlatformParams2 = getCrossPlatformParams();
            m82147a(jSONObject, "creativeId", (crossPlatformParams2 == null || (bVar = crossPlatformParams2.f95069b) == null) ? null : Long.valueOf(bVar.f95106a));
            if (z == 0) {
                C12290b.m22060a("aweme_ad_landingpage_open_error", 1, jSONObject);
            } else if (this.f95341A > 0) {
                m82147a(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f95341A));
            }
            C12290b.m22060a("aweme_ad_landingpage_open_error_rate", !z, jSONObject);
        }
        C12290b.m22060a("aweme_webview_open_error_rate", 1 ^ (z ? 1 : 0), jSONObject);
    }

    /* renamed from: a */
    public final void mo69918a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        if (singleWebView.getVisibility() == 0) {
            SingleWebView singleWebView2 = this.f95344a;
            if (singleWebView2 == null) {
                C89219l.m154710a("singleWebView");
            }
            singleWebView2.sendEventToWebView(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo69919a(String str, JSONObject jSONObject, String str2) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventName", str);
        if (!(str2 == null || str2.length() == 0)) {
            jSONObject2.put("reactId", str2);
        }
        jSONObject2.put("data", jSONObject);
        mo69918a("notification", jSONObject2);
    }

    /* renamed from: a */
    public void mo69920a(String str, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("rn_schema");
        if (queryParameter == null || queryParameter.length() == 0) {
            C89219l.m154716b(parse, "");
            if (C89219l.m154714a((Object) parse.getScheme(), (Object) "http") || C89219l.m154714a((Object) parse.getScheme(), (Object) "https")) {
                m82144a(this, str, z2, null, 4);
                return;
            }
            String queryParameter2 = parse.getQueryParameter("url");
            if (queryParameter2 != null && queryParameter2.length() != 0) {
                String queryParameter3 = parse.getQueryParameter("url");
                if (queryParameter3 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(queryParameter3, "");
                m82144a(this, queryParameter3, z2, null, 4);
                return;
            }
            return;
        }
        C89219l.m154721d(str, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013a, code lost:
        if (r2 == null) goto L_0x013c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo69917a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.mo69917a(java.lang.String, java.util.Map):void");
    }

    /* renamed from: a */
    public final void mo69916a(String str) {
        C40617a aVar;
        C40632e eVar;
        C40617a aVar2;
        Integer num;
        C89219l.m154721d(str, "");
        C40618a crossPlatformParams = getCrossPlatformParams();
        String str2 = null;
        String a = (crossPlatformParams == null || (aVar2 = crossPlatformParams.f95068a) == null || (num = aVar2.f95052a) == null) ? null : C40520b.m81726a(num.intValue());
        C40618a crossPlatformParams2 = getCrossPlatformParams();
        String str3 = (crossPlatformParams2 == null || (eVar = crossPlatformParams2.f95070c) == null) ? null : eVar.f95145e;
        String str4 = this.f95351h;
        if (str4 != null) {
            str2 = str4;
        } else {
            C40618a crossPlatformParams3 = getCrossPlatformParams();
            if (!(crossPlatformParams3 == null || (aVar = crossPlatformParams3.f95068a) == null)) {
                str2 = aVar.f95054c;
            }
        }
        m82145a(str, a, str3, str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$b */
    public static final class C40725b implements AbstractC30261g<C34337k> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95371a;

        static {
            Covode.recordClassIndex(48574);
        }

        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C34337k mo53714a() {
            return this.f95371a.f95349f;
        }

        C40725b(CrossPlatformWebView crossPlatformWebView) {
            this.f95371a = crossPlatformWebView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$h */
    public static final class C40731h extends AbstractC89220m implements AbstractC89171a<C40659d> {

        /* renamed from: a */
        public static final C40731h f95377a = new C40731h();

        static {
            Covode.recordClassIndex(48580);
        }

        C40731h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40659d invoke() {
            return new C40659d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$i */
    public static final class C40732i implements AbstractC40746j {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95378a;

        static {
            Covode.recordClassIndex(48581);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j
        /* renamed from: a */
        public final SingleWebView mo69969a() {
            return this.f95378a.getSingleWebView();
        }

        C40732i(CrossPlatformWebView crossPlatformWebView) {
            this.f95378a = crossPlatformWebView;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j
        /* renamed from: a */
        public final void mo69970a(String str) {
            if (str != null) {
                CrossPlatformWebView.m82144a(this.f95378a, str, false, null, 6);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public C40618a getCrossPlatformParams() {
        AbstractC40547m mVar = this.f95348e;
        if (mVar != null) {
            return mVar.getCrossPlatformParams();
        }
        return this.f95350g;
    }

    public LayoutInflater getLayoutInflater() {
        LayoutInflater from = LayoutInflater.from(getContext());
        C89219l.m154716b(from, "");
        return from;
    }

    public String getReactId() {
        C34337k kVar = this.f95349f;
        if (kVar != null) {
            return kVar.bF_();
        }
        return null;
    }

    public final SingleWebView getSingleWebView() {
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        return singleWebView;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: h */
    public final boolean mo67263h() {
        if (this.f95346c == 2) {
            return true;
        }
        return this.f95347d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f95353j.f95398a.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$a */
    public static final class C40724a implements AbstractC30261g<AbsActivityContainer> {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95370a;

        static {
            Covode.recordClassIndex(48573);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, java.lang.Object, com.ss.android.ugc.aweme.crossplatform.activity.m] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.p2082ss.android.sdk.webview.AbstractC30261g
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer mo53714a() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r3.f95370a
                com.ss.android.ugc.aweme.crossplatform.activity.m r2 = r0.f95348e
                r1 = 0
                if (r2 == 0) goto L_0x0011
                boolean r0 = r2 instanceof com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
                if (r0 == 0) goto L_0x0011
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer"
                java.util.Objects.requireNonNull(r2, r0)
                return r2
            L_0x0011:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.C40724a.mo53714a():java.lang.Object");
        }

        C40724a(CrossPlatformWebView crossPlatformWebView) {
            this.f95370a = crossPlatformWebView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$f */
    public static final class C40729f implements AbstractC40692f {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95374a;

        /* renamed from: b */
        private View f95375b;

        static {
            Covode.recordClassIndex(48578);
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69815a(WebView webView, String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69812a() {
            View view = this.f95375b;
            if (view != null) {
                this.f95374a.removeView(view);
                this.f95375b = null;
            }
            AbstractC40690d iFullScreen = this.f95374a.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.mo69661a();
            }
        }

        C40729f(CrossPlatformWebView crossPlatformWebView) {
            this.f95374a = crossPlatformWebView;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69813a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            AbstractC40690d iFullScreen = this.f95374a.getIFullScreen();
            if (iFullScreen == null || !iFullScreen.mo69662a(view)) {
                this.f95375b = view;
                if (view != null) {
                    this.f95374a.addView(view);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40692f
        /* renamed from: a */
        public final void mo69814a(WebView webView, int i) {
            if (!C89219l.m154714a((Object) this.f95374a.f95351h, (Object) "about:blank")) {
                if (i == 100) {
                    LineProgressBarView lineProgressBarView = (LineProgressBarView) this.f95374a.mo69910a(R.id.d02);
                    C89219l.m154716b(lineProgressBarView, "");
                    lineProgressBarView.setVisibility(8);
                    if (this.f95374a.getShouldShowProgressBarBg()) {
                        View a = this.f95374a.mo69910a(R.id.s8);
                        C89219l.m154716b(a, "");
                        a.setVisibility(8);
                        return;
                    }
                    return;
                }
                LineProgressBarView lineProgressBarView2 = (LineProgressBarView) this.f95374a.mo69910a(R.id.d02);
                C89219l.m154716b(lineProgressBarView2, "");
                lineProgressBarView2.setProgress(i);
            }
        }
    }

    private final View getCurrentContainer() {
        if (this.f95346c != 1) {
            return null;
        }
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        return singleWebView;
    }

    /* renamed from: b */
    public final boolean mo69924b() {
        if (this.f95346c != 1) {
            return false;
        }
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        if (singleWebView.canGoBack()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo69929e() {
        if (this.f95358o) {
            View a = mo69910a(R.id.s8);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
        }
    }

    public Activity getActivity() {
        Context context = getContext();
        C89219l.m154716b(context, "");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C89219l.m154716b(context, "");
        }
        return null;
    }

    public final AdWebStatBusiness getWebStatBusiness() {
        AbstractC40591g crossPlatformBusiness;
        AbstractC40547m mVar = this.f95348e;
        if (mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null) {
            return null;
        }
        return (AdWebStatBusiness) crossPlatformBusiness.mo69748a(AdWebStatBusiness.class);
    }

    /* renamed from: i */
    private final void m82150i() {
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.addOnSingleWebViewStatus(new CrossPlatformWebView$initWebView$1(this));
        SingleWebView singleWebView2 = this.f95344a;
        if (singleWebView2 == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView2.addOnWebChromeStatus(new C40729f(this));
        ((LineProgressBarView) mo69910a(R.id.d02)).setColor(C0643b.m2378c(getContext(), R.color.a2i));
    }

    /* renamed from: d */
    public final void mo69927d() {
        ((DmtStatusView) mo69910a(R.id.cg3)).mo27379a(false);
        ((DmtStatusView) mo69910a(R.id.awv)).mo27387h();
        DmtStatusView dmtStatusView = (DmtStatusView) mo69910a(R.id.awv);
        C89219l.m154716b(dmtStatusView, "");
        dmtStatusView.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: g */
    public final void mo67259g() {
        if (this.f95346c == 2) {
            String str = this.f95351h;
            if (str == null) {
                C40618a aVar = this.f95350g;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(aVar, "");
                C89219l.m154715b();
            }
            C89219l.m154721d(str, "");
            return;
        }
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.reload();
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public AbstractC40591g getCrossPlatformBusiness() {
        AbstractC40547m mVar = this.f95348e;
        if (mVar != null) {
            AbstractC40591g crossPlatformBusiness = mVar.getCrossPlatformBusiness();
            C89219l.m154716b(crossPlatformBusiness, "");
            return crossPlatformBusiness;
        }
        if (this.f95366w == null) {
            this.f95366w = AbstractC40591g.C40592a.m81943a(this);
        }
        AbstractC40591g gVar = this.f95366w;
        if (gVar == null) {
            C89219l.m154715b();
        }
        return gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    public String getCurrentUrl() {
        String str;
        C40618a crossPlatformParams;
        C40632e eVar;
        String str2 = this.f95351h;
        if (str2 == null) {
            str2 = "";
        }
        if (C89361p.m154908a((CharSequence) str2, (CharSequence) "wallet/home", false)) {
            return this.f95351h;
        }
        if (this.f95346c == 2) {
            str = this.f95351h;
            if (str == null && ((crossPlatformParams = getCrossPlatformParams()) == null || (eVar = crossPlatformParams.f95070c) == null || (str = eVar.f95150j) == null)) {
                return "";
            }
        } else {
            SingleWebView singleWebView = this.f95344a;
            if (singleWebView == null) {
                C89219l.m154710a("singleWebView");
            }
            str = singleWebView.getUrl();
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: f */
    private final void m82149f() {
        ((DmtStatusView) mo69910a(R.id.cg3)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
        C17273d dVar = new C17273d.C17274a(getContext()).mo27457a(2131233181).mo27462b(R.string.gzs).mo27464c(R.string.gzr).mo27459a(EnumC17270a.BORDER, R.string.gzy, new View$OnClickListenerC40728e(this)).f41365a;
        C17275e eVar = new C17275e(getContext());
        eVar.setStatus(dVar);
        if (C17175b.m31708b(getContext())) {
            eVar.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        } else {
            eVar.setBackgroundColor(C0643b.m2378c(getContext(), R.color.bx));
        }
        ((DmtStatusView) mo69910a(R.id.awv)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27408c(eVar));
    }

    public final void setAdditionalReportParams(Map<String, String> map) {
        this.f95365v = map;
    }

    public final void setCurrentMode(int i) {
        this.f95346c = i;
    }

    public final void setCustomWebViewStatus(AbstractC40691e eVar) {
        this.f95362s = eVar;
    }

    public final void setDisplayed(boolean z) {
        this.f95356m = z;
    }

    public final void setIFullScreen(AbstractC40690d dVar) {
        this.f95361r = dVar;
    }

    public final void setLoadRNViewCompleteTimestamp(long j) {
        this.f95369z = j;
    }

    public final void setSearchEnterParam(C67674b bVar) {
        this.f95354k = bVar;
    }

    public final void setShouldShowProgressBarBg(boolean z) {
        this.f95358o = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$g */
    public static final class C40730g implements AbstractC40740e {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95376a;

        static {
            Covode.recordClassIndex(48579);
        }

        C40730g(CrossPlatformWebView crossPlatformWebView) {
            this.f95376a = crossPlatformWebView;
        }

        @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40740e
        /* renamed from: a */
        public final void mo69968a(C40618a aVar) {
            if (aVar != null) {
                C89219l.m154721d(aVar, "");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    public void setFullScreen(AbstractC40690d dVar) {
        C89219l.m154721d(dVar, "");
        this.f95361r = dVar;
    }

    public final void setSingleWebView(SingleWebView singleWebView) {
        C89219l.m154721d(singleWebView, "");
        this.f95344a = singleWebView;
    }

    public final void onJsBroadcastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        String str = jVar.f111076a;
        JSONObject jSONObject = jVar.f111077b;
        C89219l.m154716b(str, "");
        mo69918a(str, jSONObject);
    }

    public final void setWebViewTouchListener(View.OnTouchListener onTouchListener) {
        SingleWebView a = this.f95360q.mo69969a();
        if (a != null) {
            a.setWebviewTouchListener(onTouchListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    public void setCrossPlatformActivityContainer(AbstractC40547m mVar) {
        C89219l.m154721d(mVar, "");
        this.f95348e = mVar;
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.setCrossPlatformActivityContainer(mVar);
    }

    public final void setShouldOverrideInterceptor(AbstractC89183m<? super WebView, ? super String, Boolean> mVar) {
        C89219l.m154721d(mVar, "");
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.setShouldOverrideInterceptor(mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$e */
    public static final class View$OnClickListenerC40728e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CrossPlatformWebView f95373a;

        static {
            Covode.recordClassIndex(48577);
        }

        View$OnClickListenerC40728e(CrossPlatformWebView crossPlatformWebView) {
            this.f95373a = crossPlatformWebView;
        }

        public final void onClick(View view) {
            C40633f fVar;
            AbstractC40547m mVar;
            ClickAgent.onClick(view);
            this.f95373a.getSingleWebView().reload();
            C40618a crossPlatformParams = this.f95373a.getCrossPlatformParams();
            if (crossPlatformParams != null && (fVar = crossPlatformParams.f95071d) != null && fVar.f95187t && (mVar = this.f95373a.f95348e) != null) {
                mVar.mo67256d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: c */
    public final void mo69926c(Activity activity) {
        C89219l.m154721d(activity, "");
        C40611f.C40612a.m81980a().mo69767b(getCurrentContainer(), this.f95351h, 1);
        mo69918a("viewDisappeared", (JSONObject) null);
        mo69918a("invisible", (JSONObject) null);
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.contextPause();
        mo69916a("onPause");
    }

    public final void onEvent(C30244b bVar) {
        String str;
        Activity activity;
        if (bVar != null && (str = bVar.f72160a) != null && str.length() != 0 && C89361p.m154872a(bVar.f72160a, getReactId(), true) && 1 != 0 && (activity = getActivity()) != null && (!activity.isFinishing())) {
            activity.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: b */
    public final void mo69923b(Activity activity) {
        int i;
        C89219l.m154721d(activity, "");
        C40611f.C40612a.m81980a().mo69766a(getCurrentContainer(), this.f95351h, 1);
        mo69918a("viewAppeared", (JSONObject) null);
        JSONObject jSONObject = new JSONObject();
        if (this.f95367x) {
            i = 2;
        } else {
            i = 0;
        }
        jSONObject.put("code", i);
        mo69918a("visible", jSONObject);
        this.f95367x = false;
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.contextResume();
        mo69916a("onResume");
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: d */
    public void mo69928d(Activity activity) {
        C40611f.C40612a.m81980a().mo69767b(getCurrentContainer(), this.f95351h, 2);
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.contextDestroy();
        mo69916a("onDestroy");
        C34337k kVar = this.f95349f;
        if (kVar != null && kVar.f81084c) {
            C40603d.C40604a.m81964a().mo69761b(kVar.bF_());
        }
        EventBus.m156962a().mo145395b(this);
        C40517a aVar = this.f95355l;
        CrossPlatformWebView crossPlatformWebView = aVar.f94792b;
        C89219l.m154721d(aVar, "");
        crossPlatformWebView.f95345b.remove(aVar);
        EventBus.m156962a().mo145395b(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: a */
    public final <T extends AbstractC40745i> T mo69911a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (C89219l.m154714a(cls, AbstractC40740e.class)) {
            AbstractC40740e eVar = this.f95359p;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type T");
            return eVar;
        } else if (!C89219l.m154714a(cls, AbstractC40746j.class)) {
            return new C40726c();
        } else {
            AbstractC40746j jVar = this.f95360q;
            Objects.requireNonNull(jVar, "null cannot be cast to non-null type T");
            return jVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a
    /* renamed from: a */
    public final void mo69913a(Activity activity) {
        C89219l.m154721d(activity, "");
        mo69916a("onCreate");
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$d */
    public static final class View$OnTouchListenerC40727d implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC40727d f95372a = new View$OnTouchListenerC40727d();

        static {
            Covode.recordClassIndex(48576);
        }

        View$OnTouchListenerC40727d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    private final Map<String, String> m82148b(String str, Map<String, String> map) {
        C40628b bVar;
        C40618a crossPlatformParams = getCrossPlatformParams();
        boolean z = true;
        if (!(crossPlatformParams == null || (bVar = crossPlatformParams.f95069b) == null || bVar.f95106a == 0 || !(!C89219l.m154714a((Object) str, (Object) "about:blank")))) {
            CWebViewInterceptor.f95240a = str;
            if (C33383a.m68467a() && bVar.f95105S) {
                SingleWebView singleWebView = this.f95344a;
                if (singleWebView == null) {
                    C89219l.m154710a("singleWebView");
                }
                WebSettings settings = singleWebView.getSettings();
                C89219l.m154716b(settings, "");
                String userAgentString = settings.getUserAgentString();
                C89219l.m154716b(userAgentString, "");
                String a = C89361p.m154869a(userAgentString, C15424v.f37657b, "", false);
                SingleWebView singleWebView2 = this.f95344a;
                if (singleWebView2 == null) {
                    C89219l.m154710a("singleWebView");
                }
                WebSettings settings2 = singleWebView2.getSettings();
                C89219l.m154716b(settings2, "");
                C1764a.m5930a(settings2, a);
            }
        }
        try {
            Boolean enableReferer = C52912c.f121688a.f121689b.getAdLandingPageConfig().getEnableReferer();
            C89219l.m154716b(enableReferer, "");
            z = enableReferer.booleanValue();
        } catch (Exception unused) {
        }
        if (!z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("referer", "https://www.tiktok.com");
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo69912a(int i, int i2) {
        DmtStatusView dmtStatusView = (DmtStatusView) mo69910a(R.id.cg3);
        C89219l.m154716b(dmtStatusView, "");
        ViewGroup.LayoutParams layoutParams = dmtStatusView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = 0;
        layoutParams2.rightMargin = 0;
        layoutParams2.topMargin = i2;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = i;
        DmtStatusView dmtStatusView2 = (DmtStatusView) mo69910a(R.id.cg3);
        C89219l.m154716b(dmtStatusView2, "");
        dmtStatusView2.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void mo69914a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        if (!C46870e.f109214b || !z) {
            this.f95344a = new SingleWebView(context, null, 0, 6, null);
        } else {
            C40556v a = C40556v.m81851a();
            C89219l.m154716b(a, "");
            SingleWebView b = a.mo69681b();
            if (b == null) {
                b = new SingleWebView(context, null, 0, 6, null);
            }
            this.f95344a = b;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SingleWebView singleWebView = this.f95344a;
        if (singleWebView == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView.setOverScrollMode(2);
        SingleWebView singleWebView2 = this.f95344a;
        if (singleWebView2 == null) {
            C89219l.m154710a("singleWebView");
        }
        singleWebView2.setVisibility(8);
        WebViewFrameLayout webViewFrameLayout = (WebViewFrameLayout) mo69910a(R.id.fil);
        SingleWebView singleWebView3 = this.f95344a;
        if (singleWebView3 == null) {
            C89219l.m154710a("singleWebView");
        }
        webViewFrameLayout.addView(singleWebView3, layoutParams);
        m82150i();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossPlatformWebView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private static void m82147a(JSONObject jSONObject, String str, Object obj) {
        if (!C13627m.m24498a(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m82146a(String str, boolean z, Map<String, String> map) {
        boolean a;
        boolean z2;
        AdWebStatBusiness webStatBusiness;
        C40618a crossPlatformParams;
        C40628b bVar;
        C40628b bVar2;
        C40628b bVar3;
        String str2;
        IAdLandPagePreloadService f;
        AbstractC33368e a2;
        C89219l.m154721d(str, "");
        this.f95351h = str;
        C40603d a3 = C40603d.C40604a.m81964a();
        boolean z3 = false;
        if (getParent() == null) {
            a = false;
        } else {
            a = a3.mo69760a(str);
        }
        this.f95349f = a3.mo69759a(a);
        C40618a crossPlatformParams2 = getCrossPlatformParams();
        if (!(crossPlatformParams2 == null || (bVar3 = crossPlatformParams2.f95069b) == null || (str2 = bVar3.f95126u) == null || (f = AdLandPagePreloadServiceImpl.m68380f()) == null || (a2 = f.mo59376a()) == null)) {
            a2.mo59415b(str2);
        }
        C40618a crossPlatformParams3 = getCrossPlatformParams();
        if (crossPlatformParams3 == null || (bVar2 = crossPlatformParams3.f95069b) == null || bVar2.f95106a != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C30278q.m61264a().mo53733a(z2, str);
        if (z2 && (crossPlatformParams = getCrossPlatformParams()) != null && (bVar = crossPlatformParams.f95069b) != null && bVar.f95128w == 4) {
            z3 = true;
        }
        C81523a.f182299l = z3;
        if (z2 && (webStatBusiness = getWebStatBusiness()) != null) {
            webStatBusiness.mo69711b(str);
        }
        if (z) {
            mo69917a(Uri.parse(str).buildUpon().appendQueryParameter("reactId", getReactId()).toString(), map);
        } else {
            mo69917a(str, map);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CrossPlatformWebView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5199);
        this.f95353j = new C40742g();
        this.f95357n = C89250i.m154773a((AbstractC89171a) C40731h.f95377a);
        this.f95345b = new HashSet();
        this.f95359p = new C40730g(this);
        this.f95360q = new C40732i(this);
        this.f95346c = 1;
        this.f95363t = "RN_VIEW";
        C30245c cVar = new C30245c();
        this.f95364u = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ql});
        C89219l.m154716b(obtainStyledAttributes, "");
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        cVar.mo53699a(AbsActivityContainer.class, new C40724a(this));
        cVar.mo53699a(C34337k.class, new C40725b(this));
        C40522d.C40523a.f94795a.mo69606a();
        C1764a.m5927a(getLayoutInflater(), R.layout.v8, this, true);
        EventBus.m156966a(EventBus.m156962a(), this);
        m82149f();
        this.f95355l = new C40517a(this);
        getTimeStatisticsUtils().f95238a = System.currentTimeMillis();
        WebViewFrameLayout webViewFrameLayout = (WebViewFrameLayout) mo69910a(R.id.fil);
        C89219l.m154716b(webViewFrameLayout, "");
        if (webViewFrameLayout.getChildCount() == 0) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            C89219l.m154716b(mainLooper, "");
            if (C89219l.m154714a(currentThread, mainLooper.getThread())) {
                mo69914a(context, z);
            }
        } else {
            View childAt = ((WebViewFrameLayout) mo69910a(R.id.fil)).getChildAt(0);
            if (childAt != null) {
                SingleWebView singleWebView = (SingleWebView) childAt;
                this.f95344a = singleWebView;
                if (singleWebView == null) {
                    C89219l.m154710a("singleWebView");
                }
                singleWebView.setOverScrollMode(2);
                SingleWebView singleWebView2 = this.f95344a;
                if (singleWebView2 == null) {
                    C89219l.m154710a("singleWebView");
                }
                singleWebView2.setVisibility(8);
                m82150i();
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView");
                MethodCollector.m26664o(5199);
                throw nullPointerException;
            }
        }
        this.f95369z = -1;
        this.f95341A = -1;
        this.f95342B = new HashSet();
        MethodCollector.m26664o(5199);
    }

    /* renamed from: a */
    private static void m82145a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C39162r.m79460a("crossplatform_view", new C33744d().mo59983a("platform", str2).mo59983a("status", str).mo59983a("module_name", str3).mo59983a("url", str4).f79943a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m82144a(CrossPlatformWebView crossPlatformWebView, String str, boolean z, Map map, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        crossPlatformWebView.m82146a(str, z, map);
    }
}
