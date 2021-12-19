package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.p701n.C11840a;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.gyf.barlibrary.ImmersionBar;
import com.p2082ss.android.common.p2132c.C29823c;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.sdk.p2174a.C30222a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34474i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PassBackWebInfoBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40518a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40562a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40564c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.EnumC40623c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2712e.C40649c;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40690d;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40740e;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40741f;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40746j;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.p2082ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34344q;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p2929fe.method.CloseMethod;
import com.p2082ss.android.ugc.aweme.p2929fe.method.GetWebViewInfo;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.utils.C80416ez;
import com.p2082ss.android.ugc.aweme.utils.C80533hg;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer */
public class MixActivityContainer extends AbsActivityContainer implements AbstractC33974au, AbstractC40741f, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final Activity f94810a;

    /* renamed from: b */
    public C40618a f94811b;

    /* renamed from: c */
    Bundle f94812c;

    /* renamed from: d */
    protected final AbstractC40591g f94813d;

    /* renamed from: e */
    public AbstractC40735a f94814e;

    /* renamed from: f */
    public Runnable f94815f;

    /* renamed from: g */
    public AbstractC40691e f94816g;

    /* renamed from: h */
    long f94817h = -1;

    /* renamed from: i */
    AbstractC88412b f94818i = null;

    /* renamed from: j */
    AbstractC88922b f94819j = new AbstractC88922b<Boolean>() {
        /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.C405271 */

        static {
            Covode.recordClassIndex(48348);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C18494b.m34415a(new C18484a("appEnterBackgroundEvent", System.currentTimeMillis(), null));
            } else {
                C18494b.m34415a(new C18484a("appEnterForegroundEvent", System.currentTimeMillis(), null));
            }
        }
    };

    /* renamed from: k */
    OpenURLHintLayout f94820k;

    /* renamed from: l */
    public String f94821l;

    /* renamed from: m */
    public C40553s f94822m;

    /* renamed from: n */
    public CrossPlatformTitleBar f94823n;

    /* renamed from: o */
    public Space f94824o;

    /* renamed from: p */
    boolean f94825p = false;

    /* renamed from: q */
    private C40544k f94826q;

    /* renamed from: r */
    private AbstractC40691e f94827r;

    /* renamed from: s */
    private String f94828s;

    /* renamed from: t */
    private long f94829t;

    /* renamed from: u */
    private boolean f94830u;

    /* renamed from: v */
    private C88411a f94831v = new C88411a();

    /* renamed from: w */
    private ImmersionBar f94832w;

    /* renamed from: x */
    private GradualChangeLinearLayout f94833x;

    /* renamed from: y */
    private long f94834y;

    /* renamed from: z */
    private final Set<AbstractC34467b> f94835z = new HashSet();

    static {
        Covode.recordClassIndex(48347);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(40, new RunnableC90250g(MixActivityContainer.class, "onEvent", C40564c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(MixActivityContainer.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(199, new RunnableC90250g(MixActivityContainer.class, "onEvent", CloseMethod.C47821b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(200, new RunnableC90250g(MixActivityContainer.class, "onEvent", GetWebViewInfo.C47833b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(201, new RunnableC90250g(MixActivityContainer.class, "invokeRenderTimeEvent", C47959j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(27, new RunnableC90250g(MixActivityContainer.class, "onEvent", C11840a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(202, new RunnableC90250g(MixActivityContainer.class, "onEvent", C40562a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo69628m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo69629n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo69630o() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        this.f94830u = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo69631p() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40741f
    /* renamed from: q */
    public void mo69632q() {
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: e */
    public final AbstractC40691e mo67257e() {
        return this.f94827r;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: f */
    public final AbstractC40735a mo67258f() {
        return this.f94814e;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public /* bridge */ /* synthetic */ Context getContext() {
        return this.f94810a;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public final AbstractC40591g getCrossPlatformBusiness() {
        return this.f94813d;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    public final C40618a getCrossPlatformParams() {
        return this.f94811b;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: g */
    public final void mo67259g() {
        this.f94814e.mo67259g();
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c
    /* renamed from: h */
    public final boolean mo67263h() {
        return this.f94814e.mo67263h();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: i */
    public final void mo69621i() {
        this.f94814e.mo69925c();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: j */
    public final void mo69622j() {
        C65691a.m117584a(this.f94810a);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: l */
    public final void mo69624l() {
        this.f94810a.finish();
    }

    /* renamed from: E */
    private void m81772E() {
        this.f94826q = new C40544k(this.f94810a, this);
    }

    /* renamed from: I */
    private void m81776I() {
        this.f94814e.setFullScreen(new AbstractC40690d() {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.C405304 */

            /* renamed from: b */
            private int f94840b = 1;

            static {
                Covode.recordClassIndex(48351);
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40690d
            /* renamed from: a */
            public final void mo69661a() {
                MethodCollector.m26663i(5444);
                MixActivityContainer mixActivityContainer = MixActivityContainer.this;
                if (!mixActivityContainer.f94811b.f95071d.f95183p) {
                    mixActivityContainer.f94823n.setVisibility(0);
                    mixActivityContainer.mo69652x();
                } else if (!mixActivityContainer.getCrossPlatformParams().f95071d.f95187t) {
                    mixActivityContainer.f94823n.setVisibility(0);
                    mixActivityContainer.f94824o.setVisibility(0);
                }
                if (MixActivityContainer.this.f94810a != null) {
                    if (MixActivityContainer.this.f94810a.getRequestedOrientation() != this.f94840b) {
                        MixActivityContainer.this.f94810a.setRequestedOrientation(this.f94840b);
                        if (!AbstractC40518a.m81732a(MixActivityContainer.this.f94811b, MixActivityContainer.this.f94810a)) {
                            MixActivityContainer.this.f94810a.getWindow().clearFlags(1024);
                        } else {
                            MixActivityContainer.this.mo67255c();
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f94810a.findViewById(R.id.fik);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.setVisibility(8);
                    }
                }
                MethodCollector.m26664o(5444);
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40690d
            /* renamed from: a */
            public final boolean mo69662a(View view) {
                MethodCollector.m26663i(5442);
                MixActivityContainer.this.mo67256d();
                if (MixActivityContainer.this.f94810a == null || view == null || !MixActivityContainer.this.f94811b.f95071d.f95161F) {
                    MethodCollector.m26664o(5442);
                    return false;
                }
                this.f94840b = MixActivityContainer.this.f94810a.getRequestedOrientation();
                int i = Build.VERSION.SDK_INT;
                MixActivityContainer.this.f94810a.setRequestedOrientation(11);
                C80534hh.m139605a(MixActivityContainer.this.f94810a);
                ViewGroup viewGroup = (ViewGroup) MixActivityContainer.this.f94810a.findViewById(R.id.fik);
                if (viewGroup == null) {
                    viewGroup = new FrameLayout(MixActivityContainer.this.f94810a);
                    viewGroup.setId(R.id.fik);
                    MixActivityContainer.this.f94810a.addContentView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
                }
                viewGroup.setVisibility(0);
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                MethodCollector.m26664o(5442);
                return true;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: d */
    public final void mo67256d() {
        this.f94823n.setVisibility(8);
        this.f94824o.setVisibility(8);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        this.f94829t = System.currentTimeMillis();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: s */
    public final boolean mo69647s() {
        if (!TextUtils.isEmpty(this.f94811b.f95068a.f95066o)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final ReportBusinessProxy mo69648t() {
        return (ReportBusinessProxy) this.f94813d.mo69748a(ReportBusinessProxy.class);
    }

    /* renamed from: y */
    public final void mo69653y() {
        if (!this.f94814e.mo69922a()) {
            m81778K();
        }
    }

    /* renamed from: G */
    private void m81774G() {
        if (getCrossPlatformParams().f95071d.f95180m) {
            this.f94822m.mo69675a("copylink");
        }
    }

    /* renamed from: K */
    private void m81778K() {
        C33744d dVar = new C33744d();
        dVar.mo59983a("method", this.f94821l);
        C39162r.m79460a("h5_leave_detail", dVar.f79943a);
        Runnable runnable = this.f94815f;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: L */
    private static boolean m81779L() {
        try {
            return C52912c.f121688a.f121689b.getAdLandingPageConfig().getEnableDynamicNavbar().booleanValue();
        } catch (C16041a unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final int mo69646r() {
        WebBackForwardList copyBackForwardList;
        WebView w = mo69651w();
        if (w == null || (copyBackForwardList = w.copyBackForwardList()) == null) {
            return 1;
        }
        return 1 + copyBackForwardList.getCurrentIndex();
    }

    /* renamed from: w */
    public final WebView mo69651w() {
        AbstractC40746j jVar;
        AbstractC40735a aVar = this.f94814e;
        if (aVar == null || (jVar = (AbstractC40746j) aVar.mo69911a(AbstractC40746j.class)) == null) {
            return null;
        }
        return jVar.mo69969a();
    }

    /* renamed from: C */
    private void m81770C() {
        this.f94827r = new AbstractC40691e() {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.C405282 */

            static {
                Covode.recordClassIndex(48349);
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: c */
            public final void mo65797c(WebView webView, String str) {
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65797c(webView, str);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: b */
            public final boolean mo65796b(WebView webView, String str) {
                if (MixActivityContainer.this.f94816g != null) {
                    return MixActivityContainer.this.f94816g.mo65796b(webView, str);
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo61846a(WebView webView, String str) {
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo61846a(webView, str);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo65792a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65792a(webView, sslErrorHandler, sslError);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo65794a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65794a(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo65793a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame() && MixActivityContainer.this.getCrossPlatformParams().f95071d.f95187t) {
                    if (!MixActivityContainer.this.f94811b.f95071d.f95183p) {
                        MixActivityContainer.this.mo69652x();
                        return;
                    } else {
                        MixActivityContainer.this.f94823n.setVisibility(0);
                        MixActivityContainer.this.f94824o.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65793a(webView, webResourceRequest, webResourceError);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo65795a(WebView webView, String str, Bitmap bitmap) {
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65795a(webView, str, bitmap);
                }
                if (MixActivityContainer.this.mo69647s()) {
                    ReportBusinessProxy t = MixActivityContainer.this.mo69648t();
                    if (t.f95005b.longValue() == -1) {
                        t.f95005b = Long.valueOf(System.currentTimeMillis());
                    }
                    int i = MixActivityContainer.this.f94811b.f95068a.f95067p;
                    if (i <= 0) {
                        return;
                    }
                    if (MixActivityContainer.this.mo69646r() <= i) {
                        MixActivityContainer.this.f94823n.mo69894a(true);
                    } else {
                        MixActivityContainer.this.f94823n.mo69894a(false);
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.AbstractC40691e
            /* renamed from: a */
            public final void mo65791a(WebView webView, int i, String str, String str2) {
                if (MixActivityContainer.this.getCrossPlatformParams().f95071d.f95187t) {
                    if (!MixActivityContainer.this.f94811b.f95071d.f95183p) {
                        MixActivityContainer.this.mo69652x();
                        return;
                    } else {
                        MixActivityContainer.this.f94823n.setVisibility(0);
                        MixActivityContainer.this.f94824o.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f94816g != null) {
                    MixActivityContainer.this.f94816g.mo65791a(webView, i, str, str2);
                }
            }
        };
        if (TextUtils.equals("1", this.f94811b.f95072e.f95194a)) {
            ((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69969a().setLoadNoCache();
        }
    }

    /* renamed from: F */
    private void m81773F() {
        this.f94823n = (CrossPlatformTitleBar) m81780a(R.id.agk);
        this.f94824o = (Space) m81780a(R.id.cpw);
        this.f94823n.setCrossPlatformParams(getCrossPlatformParams());
        this.f94823n.setTitleWrap(new CrossPlatformTitleBar.AbstractC40717a() {
            /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.C405293 */

            static {
                Covode.recordClassIndex(48350);
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: d */
            public final void mo69659d() {
                MixActivityContainer.this.mo69629n();
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: a */
            public final void mo69655a() {
                MixActivityContainer.this.f94821l = "click_button";
                MixActivityContainer.this.mo69653y();
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: e */
            public final void mo69660e() {
                if (MixActivityContainer.this.f94815f != null) {
                    MixActivityContainer.this.f94815f.run();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: b */
            public final void mo69657b() {
                ((ReportBusinessProxy) MixActivityContainer.this.f94813d.mo69748a(ReportBusinessProxy.class)).mo69752a(MixActivityContainer.this.f94810a);
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: c */
            public final void mo69658c() {
                WebView w = MixActivityContainer.this.mo69651w();
                if (w != null) {
                    ((ReportBusinessProxy) MixActivityContainer.this.f94813d.mo69748a(ReportBusinessProxy.class)).mo69753a(MixActivityContainer.this.f94810a, w.getUrl(), MixActivityContainer.this.mo69646r());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar.AbstractC40717a
            /* renamed from: a */
            public final void mo69656a(View view) {
                boolean z;
                C40553s sVar = MixActivityContainer.this.f94822m;
                if (sVar.f94884d == null || sVar.f94884d.isEmpty()) {
                    sVar.f94881a.setVisibility(0);
                    sVar.f94882b.setVisibility(0);
                    sVar.f94883c.setVisibility(0);
                } else {
                    if (sVar.f94884d.contains(Integer.valueOf(EnumC40623c.refresh.f95081id))) {
                        C34729o.m70955a(sVar.f94881a, 8);
                        z = false;
                    } else {
                        C34729o.m70955a(sVar.f94881a, 0);
                        z = true;
                    }
                    if (sVar.f94884d.contains(Integer.valueOf(EnumC40623c.copylink.f95081id))) {
                        sVar.f94882b.setVisibility(8);
                    } else {
                        sVar.f94882b.setVisibility(0);
                        z = true;
                    }
                    if (sVar.f94884d.contains(Integer.valueOf(EnumC40623c.openwithbrowser.f95081id))) {
                        sVar.f94883c.setVisibility(8);
                        if (!z) {
                            return;
                        }
                    } else {
                        sVar.f94883c.setVisibility(0);
                    }
                }
                MixActivityContainer.this.f94822m.mo69674a().showAsDropDown(view, 0, -12);
            }
        });
        this.f94823n.post(new RunnableC40549o(this));
    }

    /* renamed from: J */
    private void m81777J() {
        this.f94828s = "3";
        if (getCrossPlatformParams().f95071d.f95187t) {
            mo67256d();
            return;
        }
        ((GradualChangeLinearLayout) m81780a(R.id.cdd)).setGradualChangeMode(false);
        this.f94824o.setVisibility(0);
        this.f94823n.mo69895b();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: b */
    public final void mo69619b() {
        Runnable runnable;
        if (getCrossPlatformParams().f95068a.f95052a.intValue() == 1) {
            this.f94821l = "phone_press";
            mo69653y();
        } else if (!this.f94814e.mo69922a() && (runnable = this.f94815f) != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: k */
    public final void mo69623k() {
        m81769B();
        this.f94814e.mo69913a(this.f94810a);
        m81775H();
        Bundle bundle = this.f94812c;
        if (bundle != null && bundle.getBoolean("bundle_from_referral")) {
            this.f94825p = true;
        }
        C17873f.m33099g().mo143062b(this.f94819j);
    }

    /* renamed from: u */
    public final void mo69649u() {
        if (mo69651w() != null) {
            mo69651w().onResume();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f94813d.mo69748a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f94965a = false;
            playableBusiness.mo69735a(false, true);
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C40581a.m81921a(this);
        if (a != null) {
            a.mo69738a(null);
        }
        Activity activity = this.f94810a;
        if (activity != null) {
            C34729o.m70958b(activity);
        }
    }

    /* renamed from: x */
    public final void mo69652x() {
        this.f94828s = "1";
        this.f94824o.setVisibility(8);
        ((GradualChangeLinearLayout) m81780a(R.id.cdd)).setGradualChangeMode(false);
        this.f94823n.mo69893a();
        this.f94823n.setVisibility(0);
    }

    /* renamed from: H */
    private void m81775H() {
        if (!getCrossPlatformParams().f95068a.f95062k) {
            if (getCrossPlatformParams().f95068a.f95052a.intValue() == 2) {
                ((AbstractC40740e) this.f94814e.mo69911a(AbstractC40740e.class)).mo69968a(getCrossPlatformParams());
                return;
            }
            String a = C40520b.m81728a(getCrossPlatformParams().f95068a.f95054c, C40520b.m81735b(this.f94810a));
            C40556v.m81851a();
            if (!C40556v.m81852b(getCrossPlatformParams())) {
                ((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69970a(a);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f94819j.dispose();
        ImmersionBar immersionBar = this.f94832w;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        AbstractC40735a aVar = this.f94814e;
        if (aVar != null) {
            aVar.mo69928d(this.f94810a);
        }
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f94813d.mo69748a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            if (passBackWebInfoBusiness.mo69728d()) {
                C1731i.m5640b(new PassBackWebInfoBusiness.CallableC40571a(passBackWebInfoBusiness), C1731i.f5562a);
            }
            passBackWebInfoBusiness.mo69722a().removeCallbacksAndMessages(null);
        }
        if (mo69647s()) {
            ReportBusinessProxy t = mo69648t();
            if (TextUtils.equals(t.f95004a, "bio_link")) {
                C39162r.m79460a("biolink_session_duration", new C33744d().mo59981a("duration", System.currentTimeMillis() - t.f95005b.longValue()).f79943a);
            }
        }
        C40584a.m81932b();
        EventBus.m156962a().mo145395b(this);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        this.f94814e.mo69923b(this.f94810a);
        this.f94813d.mo69749a();
        this.f94834y = System.currentTimeMillis();
        mo69631p();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f94813d.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69708b();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f94813d.mo69748a(PlayableBusiness.class);
        boolean z = false;
        if (playableBusiness != null && !playableBusiness.f94965a) {
            playableBusiness.mo69735a(false, true);
        }
        Bundle bundle = this.f94812c;
        if (bundle != null && bundle.getBoolean("skip_consent", false)) {
            z = true;
        }
        this.f94818i = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C40552r(this, z));
        this.f94830u = true;
    }

    /* renamed from: v */
    public final void mo69650v() {
        if (mo69651w() != null) {
            mo69651w().onPause();
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f94813d.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69707a(true);
        }
        C40584a.m81932b();
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f94813d.mo69748a(PlayableBusiness.class);
        if (playableBusiness != null) {
            playableBusiness.f94965a = true;
            playableBusiness.mo69735a(true, false);
        }
        PreRenderWebViewBusiness a = PreRenderWebViewBusiness.C40581a.m81921a(this);
        if (a != null) {
            a.mo69736a();
        }
        if (this.f94810a != null && Build.VERSION.SDK_INT >= 23) {
            this.f94810a.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40741f
    /* renamed from: z */
    public final void mo69654z() {
        if (!this.f94810a.isFinishing()) {
            this.f94833x.setBackgroundColor(this.f94811b.f95071d.f95157B);
            if (TextUtils.equals(this.f94811b.f95071d.f95178k, "1")) {
                this.f94823n.mo69896c();
            } else if (TextUtils.equals(this.f94811b.f95071d.f95178k, "0") || !((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69969a().canGoBack()) {
                this.f94823n.mo69897d();
            } else {
                this.f94823n.mo69896c();
            }
        }
    }

    /* renamed from: A */
    private boolean m81768A() {
        if (getCrossPlatformParams().f95068a.f95052a.intValue() == 1) {
            if (getCrossPlatformParams().f95068a.f95060i) {
                C29823c.m60080a(this.f94810a, "open_url", "push");
            }
            if (!C13627m.m24498a(getCrossPlatformParams().f95069b.f95115j)) {
                JSONObject jSONObject = null;
                if (!C13627m.m24498a(getCrossPlatformParams().f95069b.f95116k)) {
                    try {
                        jSONObject = new JSONObject(getCrossPlatformParams().f95069b.f95116k);
                    } catch (Exception unused) {
                    }
                }
                Context applicationContext = this.f94810a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C29823c.m60082a(applicationContext, "wap_stat", "wap_enter", getCrossPlatformParams().f95069b.f95115j, 0, 0, jSONObject);
            }
            if (TextUtils.isEmpty(getCrossPlatformParams().f95068a.f95054c)) {
                return false;
            }
            return C30128d.m60946a(getCrossPlatformParams().f95068a.f95054c);
        } else if (getCrossPlatformParams().f95070c.f95150j != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: B */
    private void m81769B() {
        boolean z;
        Activity activity;
        AbstractC40735a aVar = (AbstractC40735a) m81780a(R.id.agg);
        this.f94814e = aVar;
        aVar.setCrossPlatformActivityContainer(this);
        m81770C();
        m81771D();
        this.f94814e.getViewStatusRegistry().mo69982a(this);
        m81772E();
        if (getCrossPlatformParams().f95068a.f95054c.contains("terms-of-use") || getCrossPlatformParams().f95068a.f95054c.contains("privacy-policy") || getCrossPlatformParams().f95068a.f95054c.contains("cookie-policy-eu")) {
            z = true;
        } else {
            z = false;
        }
        Bundle bundle = this.f94812c;
        if ((bundle == null || !bundle.getBoolean("skip_consent", false)) && C39223a.m79604r().mo68637a((AbstractC39273a) null) && (activity = this.f94810a) != null && !activity.isFinishing() && !z) {
            C39223a.m79604r().mo68636a(this.f94810a, "deeplink");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: c */
    public final void mo67255c() {
        ImmersionBar immersionBar = this.f94832w;
        ImmersionBar immersionBar2 = null;
        if (immersionBar != null) {
            immersionBar.destroy();
            this.f94832w = null;
        }
        C40618a crossPlatformParams = getCrossPlatformParams();
        Activity activity = this.f94810a;
        if (C80534hh.m139608a()) {
            if (crossPlatformParams.f95068a.f95052a.intValue() != 2) {
                activity.findViewById(R.id.agj).setPadding(0, C80534hh.m139609b(), 0, 0);
            }
            Window window = activity.getWindow();
            boolean z = true;
            if (window != null && Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            immersionBar2 = ImmersionBar.with(activity).keyboardEnable(true, 32);
            immersionBar2.init();
            if (crossPlatformParams.f95071d.f95186s) {
                AbstractC40518a.m81729a(activity);
                if (!crossPlatformParams.f95071d.f95162G) {
                    crossPlatformParams.f95071d.f95187t = true;
                }
            } else {
                z = false;
            }
            if (crossPlatformParams.f95071d.f95187t) {
                C80534hh.m139606a(activity, 0);
            }
            C80533hg.m139603a(activity, activity.getWindow(), crossPlatformParams.f95071d.f95169b);
            if (AbstractC40518a.m81732a(crossPlatformParams, activity)) {
                if (!z) {
                    AbstractC40518a.m81729a(activity);
                }
                C80534hh.m139605a(activity);
                if (Build.VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f95071d.f95189v = activity.getWindow().getStatusBarColor();
                }
            } else if (!crossPlatformParams.f95071d.f95186s) {
                if (crossPlatformParams.f95071d.f95189v != -2) {
                    C80534hh.m139606a(activity, crossPlatformParams.f95071d.f95189v);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    crossPlatformParams.f95071d.f95189v = activity.getWindow().getStatusBarColor();
                }
            }
        }
        this.f94832w = immersionBar2;
        Activity activity2 = this.f94810a;
        C80416ez.m139401a(activity2, C0643b.m2378c(activity2, R.color.nv));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        PassBackWebInfoBusiness passBackWebInfoBusiness = (PassBackWebInfoBusiness) this.f94813d.mo69748a(PassBackWebInfoBusiness.class);
        if (passBackWebInfoBusiness != null) {
            passBackWebInfoBusiness.mo69723a((WebView) ((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69969a(), false);
        }
        this.f94814e.mo69926c(this.f94810a);
        this.f94817h = System.currentTimeMillis() - this.f94834y;
        this.f94834y = 0;
        C33744d dVar = new C33744d();
        dVar.mo59981a("duration", this.f94817h);
        C39162r.m79460a("h5_stay_time", dVar.f79943a);
        mo69630o();
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f94813d.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69707a(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f94813d.mo69748a(PlayableBusiness.class);
        if (playableBusiness != null && !playableBusiness.f94965a) {
            playableBusiness.mo69735a(true, false);
        }
        this.f94818i = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C40550p.f94877a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C40551q(this));
    }

    /* renamed from: D */
    private void m81771D() {
        this.f94820k = (OpenURLHintLayout) m81780a(R.id.agj);
        this.f94833x = (GradualChangeLinearLayout) m81780a(R.id.cdd);
        if (this.f94811b.f95071d.f95174g != -2) {
            this.f94833x.setBackgroundColor(this.f94811b.f95071d.f95174g);
        } else {
            this.f94833x.setBackgroundColor(C0643b.m2378c(this.f94810a, R.color.l));
        }
        if (this.f94811b.f95071d.f95182o != -2) {
            this.f94820k.setBackgroundColor(this.f94811b.f95071d.f95182o);
            this.f94810a.getWindow().setBackgroundDrawableResource(R.color.c9);
            C34474i.m70452a(this.f94810a);
        }
        m81773F();
        this.f94822m = new C40553s(this.f94810a, this);
        mo69628m();
        if (this.f94811b.f95071d.f95191x) {
            C17197a.C17200a aVar = new C17197a.C17200a(this.f94810a);
            aVar.mo27194b(R.string.dhm).mo27195b(R.string.as6, DialogInterface$OnClickListenerC40548n.f94875a, false);
            aVar.mo27193a().mo27184b();
        }
        m81774G();
        this.f94813d.mo69748a(OpenUrlHintBusiness.class);
        OpenUrlHintBusiness.m81900a(this.f94820k, this.f94811b.f95068a.f95061j);
        m81776I();
        if (getCrossPlatformParams().f95071d.f95187t) {
            mo67256d();
        }
        if (!this.f94811b.f95071d.f95183p) {
            mo69652x();
        } else {
            m81777J();
        }
        if (getCrossPlatformParams().f95071d.f95185r) {
            m81780a(R.id.agj).setPadding(0, C80534hh.m139609b(), 0, 0);
        }
        if (getCrossPlatformParams().f95071d.f95162G) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f94823n.getLayoutParams();
            int i = getCrossPlatformParams().f95071d.f95163H;
            if (i < 0) {
                i = C80534hh.m139609b();
            }
            layoutParams.setMargins(0, i, 0, 0);
            this.f94823n.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final boolean mo69617a() {
        if (TextUtils.isEmpty(this.f94811b.f95068a.f95054c)) {
            return false;
        }
        boolean A = m81768A();
        this.f94813d.mo69750a(this.f94811b);
        return A;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final void mo69614a(Bundle bundle) {
        this.f94812c = bundle;
    }

    /* renamed from: a */
    private <T extends View> T m81780a(int i) {
        return (T) this.f94810a.findViewById(i);
    }

    @AbstractC90264r
    public void onEvent(C40564c cVar) {
        C40544k kVar = this.f94826q;
        if (kVar != null) {
            kVar.mo69668a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final void mo69612a(Intent intent) {
        this.f94810a.setResult(50000, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final void mo69615a(AbstractC34467b bVar) {
        MethodCollector.m26663i(5611);
        synchronized (this.f94835z) {
            try {
                this.f94835z.add(bVar);
            } finally {
                MethodCollector.m26664o(5611);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: b */
    public final void mo69620b(AbstractC34467b bVar) {
        MethodCollector.m26663i(5613);
        synchronized (this.f94835z) {
            try {
                this.f94835z.remove(bVar);
            } finally {
                MethodCollector.m26664o(5613);
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (TextUtils.equals("web", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this.f94810a, this.f94823n, jVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final void mo69613a(Configuration configuration) {
        if (!this.f94811b.f95071d.f95161F) {
            this.f94820k.setLayoutParams(new FrameLayout.LayoutParams(Double.valueOf((double) C13628n.m24520b(this.f94810a, (float) configuration.screenWidthDp)).intValue(), Double.valueOf((double) C13628n.m24520b(this.f94810a, (float) configuration.screenHeightDp)).intValue()));
        }
    }

    @AbstractC90264r
    public void onEvent(final C11840a aVar) {
        Activity activity = this.f94810a;
        if (activity instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) activity;
            C11637d dVar = new C11637d();
            dVar.mo18421a(aVar.f28229c);
            LiveOuterService.m107269s().mo95830d().mo12973a(eVar, new AbstractC11635b() {
                /* class com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer.C405315 */

                static {
                    Covode.recordClassIndex(48352);
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
                /* renamed from: a */
                public final void mo18419a(long j) {
                    aVar.f28227a.mo18915a();
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
                /* renamed from: a */
                public final void mo18420a(Exception exc, String str) {
                    aVar.f28227a.mo18916b();
                }

                @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
                /* renamed from: a */
                public final void mo18418a(int i, int i2, String str) {
                    if (i == 1) {
                        C12290b.m22060a("promote_iap_charge_show", 0, (JSONObject) null);
                        C39162r.m79460a("promote_iap_recharge_panel_show", new C33744d().mo59980a("user_account_type", C31575b.m65865g().getCurUser().getAccountType()).f79943a);
                    } else if (i == 0) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("error_status_code ", i2);
                            jSONObject.put("error_message", str);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C12290b.m22060a("promote_iap_charge_show", 1, jSONObject);
                    }
                }
            }, aVar.f28228b, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
        }
    }

    /* renamed from: b */
    public final void mo69633b(String str) {
        Bundle bundle = this.f94812c;
        if (bundle != null && !TextUtils.equals(str, bundle.getString("url"))) {
            this.f94812c.putString("url", str);
            this.f94811b = C40620b.C40622b.m81989a(this.f94812c);
            m81771D();
        }
        ((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69970a(str);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f94813d.mo69748a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.mo69708b();
        }
    }

    @AbstractC90264r
    public final void onEvent(C40562a aVar) {
        if (aVar != null && aVar.f94909a != null && m81779L()) {
            String str = aVar.f94909a;
            str.hashCode();
            if (str.equals("3") && "1".equals(this.f94828s)) {
                m81777J();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final void mo69616a(Runnable runnable) {
        this.f94815f = runnable;
    }

    @AbstractC90264r
    public final void invokeRenderTimeEvent(C47959j jVar) {
        AbstractC34344q qVar;
        if (this.f94830u && jVar.f111077b != null) {
            if (TextUtils.equals("goods_rn_page_monitor", jVar.f111077b.optString("eventName"))) {
                try {
                    JSONObject jSONObject = jVar.f111077b.getJSONObject("data");
                    C37534a aVar = new C37534a();
                    aVar.f88692n = Long.valueOf(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.f94829t);
                    aVar.f88694p = jSONObject.optString("page_id");
                    aVar.f88691m = Long.valueOf(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.f94829t);
                    aVar.f88693o = jSONObject.optString("session_id");
                    C37533a.m75656a().logCommerceEvents("commerce_page_render_time", aVar);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (TextUtils.equals("hybrid_prefetch_duration_monitor", jVar.f111077b.optString("eventName"))) {
                C40649c cVar = new C40649c();
                try {
                    JSONObject jSONObject2 = jVar.f111077b.getJSONObject("data");
                    cVar.f95225b.put("duration", Long.valueOf(jSONObject2.optString("duration")).longValue());
                    cVar.f95224a.put("duration_type", jSONObject2.optString("duration_type"));
                    cVar.f95224a.put("is_cache", jSONObject2.optString("is_cache"));
                    cVar.f95224a.put("page_id", jSONObject2.optString("page_id"));
                    AbstractC40735a aVar2 = this.f94814e;
                    if (aVar2 != null) {
                        cVar.f95227d = aVar2.getMonitorSession();
                    }
                    C40603d.C40604a.m81964a();
                    C34337k kVar = cVar.f95227d;
                    if (kVar != null) {
                        qVar = (AbstractC34344q) kVar.mo60793a(AbstractC34344q.class);
                    } else {
                        qVar = null;
                    }
                    C40603d.m81957a(qVar, "hybrid_prefetch_duration_monitor", "invoke_render_event", cVar.f95224a, cVar.f95225b, cVar.f95226c);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @AbstractC90264r
    public void onEvent(CloseMethod.C47821b bVar) {
        AbstractC40735a aVar;
        AbstractC40746j jVar;
        SingleWebView a;
        if (bVar != null && bVar.f110775a != 0 && (aVar = this.f94814e) != null && (jVar = (AbstractC40746j) aVar.mo69911a(AbstractC40746j.class)) != null && (a = jVar.mo69969a()) != null && this.f94815f != null && a.hashCode() == bVar.f110775a) {
            this.f94815f.run();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.web.AbstractC81545g
    /* renamed from: a */
    public final void mo67254a(String str) {
        mo67253a((CharSequence) str, true);
    }

    @AbstractC90264r
    public void onEvent(GetWebViewInfo.C47833b bVar) {
        SingleWebView a;
        PreRenderWebViewBusiness a2 = PreRenderWebViewBusiness.C40581a.m81921a(this);
        if (a2 != null) {
            a2.mo69737a(this.f94814e, bVar);
        } else if (bVar != null && bVar.f110803b != null && bVar.f110802a != 0 && (a = ((AbstractC40746j) this.f94814e.mo69911a(AbstractC40746j.class)).mo69969a()) != null && a.hashCode() == bVar.f110802a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 0);
                String str = this.f94811b.f95069b.f95094H;
                if ("splash".equals(str)) {
                    jSONObject.put("scene", 2);
                } else if ("feedad".equals(str)) {
                    jSONObject.put("scene", 1);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            bVar.f110803b.mo79888a(jSONObject);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer$a */
    static class C40532a {

        /* renamed from: a */
        ITpcConsentService f94843a;

        /* renamed from: b */
        boolean f94844b;

        /* renamed from: c */
        WeakReference<Activity> f94845c;

        static {
            Covode.recordClassIndex(48353);
        }

        public C40532a(ITpcConsentService iTpcConsentService, Activity activity) {
            this.f94843a = iTpcConsentService;
            this.f94844b = iTpcConsentService.mo68637a((AbstractC39273a) null);
            this.f94845c = new WeakReference<>(activity);
        }
    }

    MixActivityContainer(Activity activity, C40618a aVar) {
        this.f94810a = activity;
        this.f94811b = aVar;
        this.f94813d = AbstractC40591g.C40592a.m81943a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbstractC40547m
    /* renamed from: a */
    public final void mo67253a(CharSequence charSequence, boolean z) {
        if (this.f94823n != null) {
            if ((!TextUtils.isEmpty(charSequence) && C40520b.m81733a(charSequence)) || this.f94811b.f95068a.f95052a == null || this.f94811b.f95068a.f95052a.intValue() != 1) {
                return;
            }
            if (this.f94811b.f95071d.f95192y || z) {
                this.f94823n.setTitle(charSequence);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer
    /* renamed from: a */
    public final boolean mo69618a(String str, int i) {
        return C36125t.m73597a(C36125t.m73591a(), this.f94810a, str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
    /* renamed from: a */
    public final boolean mo60905a(int i, int i2, Intent intent) {
        MethodCollector.m26663i(5646);
        this.f94813d.mo69748a(WalletBusiness.class);
        String currentUrl = this.f94814e.getCurrentUrl();
        if (currentUrl != null && currentUrl.contains("wallet/home")) {
            C30222a aVar = new C30222a();
            aVar.f72083a = i;
            aVar.f72084b = i2;
            aVar.f72085c = intent;
            AbstractC81915c.m141874a(aVar);
        }
        HashSet<AbstractC34467b> hashSet = new HashSet();
        synchronized (this.f94835z) {
            try {
                hashSet.addAll(this.f94835z);
            } catch (Throwable th) {
                MethodCollector.m26664o(5646);
                throw th;
            }
        }
        if (!hashSet.isEmpty()) {
            for (AbstractC34467b bVar : hashSet) {
                bVar.mo60905a(i, i2, intent);
            }
        }
        MethodCollector.m26664o(5646);
        return false;
    }
}
