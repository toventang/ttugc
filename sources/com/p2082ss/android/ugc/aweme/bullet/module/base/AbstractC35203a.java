package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.Space;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.p1159a.C16480d;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.web.AbstractC16680g;
import com.bytedance.ies.bullet.service.base.web.AbstractC16681h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16852d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16854f;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16722a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16729h;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.EnumC17270a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.p2082ss.android.ugc.aweme.bullet.business.WalletBusiness;
import com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a.C35216a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a.C35221c;
import com.p2082ss.android.ugc.aweme.bullet.module.base.p2421a.EnumC35220b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35180b;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35186c;
import com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a;
import com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40564c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33118a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33119b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a */
public abstract class AbstractC35203a extends AbstractC34964a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public static final C35204a f83138A = new C35204a((byte) 0);

    /* renamed from: B */
    private final C88411a f83139B = new C88411a();

    /* renamed from: a */
    private DmtStatusView f83140a;

    /* renamed from: b */
    private Callable<C35226e> f83141b;

    /* renamed from: c */
    private C35216a f83142c;

    /* renamed from: d */
    protected View f83143d;

    /* renamed from: e */
    public BulletCommonTitleBar f83144e;

    /* renamed from: f */
    public View f83145f;

    /* renamed from: g */
    public Space f83146g;

    /* renamed from: h */
    public OpenURLHintLayout f83147h;

    /* renamed from: i */
    public SSWebView f83148i;

    /* renamed from: j */
    public AbstractC16208i f83149j;

    /* renamed from: k */
    public C35226e f83150k;

    /* renamed from: l */
    public C16854f f83151l;

    /* renamed from: m */
    public C35186c f83152m;

    /* renamed from: n */
    public String f83153n;

    /* renamed from: o */
    public C35221c f83154o;

    /* renamed from: p */
    public View.OnClickListener f83155p;

    /* renamed from: q */
    public Runnable f83156q = new RunnableC35205b(this);

    /* renamed from: r */
    public Activity f83157r;

    /* renamed from: s */
    public boolean f83158s;

    /* renamed from: t */
    public List<String> f83159t;

    /* renamed from: u */
    public long f83160u;

    /* renamed from: v */
    public String f83161v;

    /* renamed from: w */
    public String f83162w = "";

    /* renamed from: x */
    public C16481e f83163x;

    /* renamed from: y */
    public final C16248b f83164y;

    /* renamed from: z */
    public final AbstractC35125b f83165z;

    static {
        Covode.recordClassIndex(42365);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62079a(C35226e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo62006e() {
        return R.layout.rn;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(40, new RunnableC90250g(AbstractC35203a.class, "onEvent", C40564c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(26, new RunnableC90250g(AbstractC35203a.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(41, new RunnableC90250g(AbstractC35203a.class, "onEvent", C33119b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(42, new RunnableC90250g(AbstractC35203a.class, "onJsBroadcast", C33118a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo62009h() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$a */
    public static final class C35204a {
        static {
            Covode.recordClassIndex(42366);
        }

        private C35204a() {
        }

        public /* synthetic */ C35204a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$c */
    static final class CallableC35206c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC16741q f83167a;

        static {
            Covode.recordClassIndex(42368);
        }

        CallableC35206c(AbstractC16741q qVar) {
            this.f83167a = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ Object call() {
            return this.f83167a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final void mo26897a(AbstractC16741q qVar) {
        C89219l.m154721d(qVar, "");
        if (qVar instanceof C35226e) {
            C35226e eVar = (C35226e) qVar;
            if (TextUtils.isEmpty(eVar.f39931g.mo26550b())) {
                eVar.f39931g.mo26549a(eVar.f83216aJ.mo26550b());
            }
            this.f83141b = new CallableC35206c(qVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        if (iVar instanceof AbstractC16494c) {
            AbstractC16494c cVar = (AbstractC16494c) iVar;
            WebView n = cVar.mo26210n();
            SSWebView sSWebView = this.f83148i;
            if ((sSWebView == null || (!C89219l.m154714a(sSWebView, n))) && (n instanceof SSWebView)) {
                boolean z2 = false;
                n.setBackgroundColor(0);
                SSWebView sSWebView2 = (SSWebView) n;
                this.f83148i = sSWebView2;
                if (sSWebView2 != null) {
                    sSWebView2.resumeTimers();
                }
                SSWebView sSWebView3 = this.f83148i;
                if (sSWebView3 != null) {
                    C35216a aVar = new C35216a(sSWebView3, (byte) 0);
                    this.f83142c = aVar;
                    sSWebView3.setWebViewEventDelegate(aVar);
                }
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a = C33113b.m67826a();
                if (a != null) {
                    a.mo58920a(this, this.f83148i);
                }
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a2 = C33113b.m67826a();
                if (a2 != null) {
                    a2.mo58952c(this, this.f83148i);
                }
                SSWebView sSWebView4 = this.f83148i;
                if (sSWebView4 != null) {
                    C33391a.m68475a(new C35210g(sSWebView4, this));
                    C35226e eVar = this.f83150k;
                    if (eVar != null) {
                        Boolean b = eVar.f39947w.mo26550b();
                        if (b != null && b.booleanValue()) {
                            sSWebView4.setLayerType(1, null);
                        }
                        Boolean bool = (Boolean) eVar.f83214aH.mo26550b();
                        if (bool != null && bool.booleanValue()) {
                            int i = Build.VERSION.SDK_INT;
                            try {
                                WebSettings settings = sSWebView4.getSettings();
                                C89219l.m154716b(settings, "");
                                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                                if (!C33113b.m67827b().mo58985o()) {
                                    z2 = true;
                                }
                                settings.setMediaPlaybackRequiresUserGesture(z2);
                            } catch (Exception unused) {
                                WebSettings settings2 = sSWebView4.getSettings();
                                C89219l.m154716b(settings2, "");
                                settings2.setMediaPlaybackRequiresUserGesture(true);
                            }
                        }
                    }
                }
            }
            this.f83165z.mo61974a(n);
            this.f83165z.mo61975a(cVar.mo26209m());
            this.f83165z.mo61976a((AbstractC16654o) iVar.mo25768b(AbstractC16654o.class));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$e */
    public static final class C35208e implements BulletCommonTitleBar.AbstractC35304a {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83169a;

        /* renamed from: b */
        final /* synthetic */ C16721b f83170b;

        static {
            Covode.recordClassIndex(42370);
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.AbstractC35304a
        /* renamed from: d */
        public final void mo62096d() {
            this.f83169a.f83156q.run();
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.AbstractC35304a
        /* renamed from: a */
        public final void mo62092a() {
            this.f83169a.f83161v = "click_button";
            AbstractC35203a aVar = this.f83169a;
            SSWebView sSWebView = aVar.f83148i;
            if (sSWebView == null || !sSWebView.mo26120b()) {
                C33744d dVar = new C33744d();
                dVar.mo59983a("method", aVar.f83161v);
                C39162r.m79460a("h5_leave_detail", dVar.f79943a);
                aVar.f83156q.run();
                return;
            }
            SSWebView sSWebView2 = aVar.f83148i;
            if (sSWebView2 != null) {
                sSWebView2.goBack();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.AbstractC35304a
        /* renamed from: b */
        public final void mo62094b() {
            if ((this.f83170b instanceof C35226e) && this.f83169a.f83165z.mo61972a(ReportBusiness.class) != null) {
                ReportBusiness.m71836a(this.f83169a.f83157r, ((C35226e) this.f83170b).mo62115f());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.AbstractC35304a
        /* renamed from: c */
        public final void mo62095c() {
            if (this.f83169a.f83158s) {
                C89219l.m154716b(C33113b.C33114a.f78704a, "");
                AbstractC33115c a = C33113b.m67826a();
                if (a != null) {
                    AbstractC35203a aVar = this.f83169a;
                    a.mo58940b(aVar, aVar.f83148i);
                    return;
                }
                return;
            }
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a2 = C33113b.m67826a();
            if (a2 != null) {
                a2.mo58939b(this.f83169a);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.views.BulletCommonTitleBar.AbstractC35304a
        /* renamed from: a */
        public final void mo62093a(View view) {
            PopupWindow a;
            boolean z;
            C89219l.m154721d(view, "");
            C35221c cVar = this.f83169a.f83154o;
            if (cVar != null) {
                if (cVar.f83203e == null || cVar.f83203e.isEmpty()) {
                    cVar.f83200b.setVisibility(0);
                    cVar.f83201c.setVisibility(0);
                    cVar.f83202d.setVisibility(0);
                } else {
                    if (cVar.f83203e.contains(Integer.valueOf(EnumC35220b.refresh.f83198id))) {
                        C34729o.m70955a(cVar.f83200b, 8);
                        z = false;
                    } else {
                        C34729o.m70955a(cVar.f83200b, 0);
                        z = true;
                    }
                    if (cVar.f83203e.contains(Integer.valueOf(EnumC35220b.copylink.f83198id))) {
                        cVar.f83201c.setVisibility(8);
                    } else {
                        cVar.f83201c.setVisibility(0);
                        z = true;
                    }
                    if (cVar.f83203e.contains(Integer.valueOf(EnumC35220b.openwithbrowser.f83198id))) {
                        cVar.f83202d.setVisibility(8);
                        if (!z) {
                            return;
                        }
                    } else {
                        cVar.f83202d.setVisibility(0);
                    }
                }
                C35221c cVar2 = this.f83169a.f83154o;
                if (cVar2 != null && (a = cVar2.mo62111a(this.f83169a.f83155p)) != null) {
                    a.showAsDropDown(view, 0, -12);
                }
            }
        }

        C35208e(AbstractC35203a aVar, C16721b bVar) {
            this.f83169a = aVar;
            this.f83170b = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: b */
    public final AbstractC17017a mo26899b() {
        return new BaseCommonBizRootContainer$provideActivityDelegate$1(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a
    /* renamed from: c */
    public final C16480d mo61862c() {
        return new C35214j(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a
    /* renamed from: d */
    public final C16481e mo61863d() {
        return new C35215k(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$b */
    static final class RunnableC35205b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83166a;

        static {
            Covode.recordClassIndex(42367);
        }

        RunnableC35205b(AbstractC35203a aVar) {
            this.f83166a = aVar;
        }

        public final void run() {
            Activity activity = this.f83166a.f83157r;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final View mo62082k() {
        View view = this.f83143d;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo62084n() {
        C13628n.m24510a(this.f83144e, 8);
        C13628n.m24510a(this.f83146g, 8);
    }

    /* renamed from: m */
    protected static boolean m72070m() {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b = C33113b.m67827b();
        if (b != null) {
            return b.mo58974d();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final ViewGroup mo26895a() {
        View view = this.f83143d;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        View findViewById = view.findViewById(R.id.zo);
        C89219l.m154716b(findViewById, "");
        return (ViewGroup) findViewById;
    }

    /* renamed from: f */
    public boolean mo62007f() {
        String str;
        mo62008g();
        C35226e eVar = this.f83150k;
        if (eVar != null) {
            str = eVar.mo62122m();
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: g */
    public void mo62008g() {
        C35226e eVar = this.f83150k;
        if (eVar != null) {
            Boolean bool = (Boolean) eVar.f83213aG.mo26550b();
            if (bool != null && bool.booleanValue()) {
                C39161q.m79447a(C17867d.m33078a(), "open_url", "push");
            }
            if (C89361p.m154876c(eVar.mo62122m(), "pay", false)) {
                this.f83165z.mo61972a(WalletBusiness.class);
            }
        }
    }

    /* renamed from: l */
    public final BulletContainerView mo62083l() {
        ViewGroup a = mo26895a();
        int childCount = a.getChildCount();
        BulletContainerView bulletContainerView = null;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = a.getChildAt(i);
                if ((childAt != null && (childAt instanceof BulletContainerView) && (bulletContainerView = (BulletContainerView) childAt) != null) || i == childCount) {
                    break;
                }
                i++;
            }
        }
        return bulletContainerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$j */
    public static final class C35214j extends C16480d {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83180a;

        /* renamed from: c */
        private View f83181c;

        static {
            Covode.recordClassIndex(42376);
        }

        public final void onHideCustomView() {
            Object obj;
            Integer num;
            AbstractC16725d<Boolean> dVar;
            C16729h hVar;
            C16722a aVar;
            MethodCollector.m26663i(5811);
            ((ViewGroup) this.f83180a.mo62082k().findViewById(R.id.zo)).removeView(this.f83181c);
            Boolean bool = null;
            this.f83181c = null;
            AbstractC35203a aVar2 = this.f83180a;
            C35226e eVar = aVar2.f83150k;
            if (eVar == null || (aVar = eVar.f39919J) == null) {
                obj = null;
            } else {
                obj = aVar.mo26550b();
            }
            if (!C89219l.m154714a(obj, (Object) true)) {
                aVar2.mo62011j();
                MethodCollector.m26664o(5811);
                return;
            }
            C35226e eVar2 = aVar2.f83150k;
            if (eVar2 == null || (hVar = eVar2.f39946v) == null) {
                num = null;
            } else {
                num = (Integer) hVar.mo26550b();
            }
            if (num != null && num.intValue() == 1) {
                aVar2.f83162w = "1";
                C13628n.m24510a(aVar2.f83146g, 8);
                C13628n.m24510a(aVar2.f83145f, 0);
                C13628n.m24510a(aVar2.f83144e, 0);
                BulletCommonTitleBar bulletCommonTitleBar = aVar2.f83144e;
                if (bulletCommonTitleBar != null) {
                    bulletCommonTitleBar.setBackgroundColor(0);
                    View a = bulletCommonTitleBar.mo62156a(R.id.rv);
                    C89219l.m154716b(a, "");
                    a.setVisibility(8);
                    TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.mo62156a(R.id.title);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.yv)).setImageResource(2131231530);
                    ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a71)).setImageResource(2131231520);
                    ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.dij)).setImageResource(2131231527);
                    MethodCollector.m26664o(5811);
                    return;
                }
                MethodCollector.m26664o(5811);
                return;
            }
            C35226e eVar3 = aVar2.f83150k;
            if (!(eVar3 == null || (dVar = eVar3.f39926b) == null)) {
                bool = dVar.mo26550b();
            }
            if (!C89219l.m154714a((Object) bool, (Object) true)) {
                C13628n.m24510a(aVar2.f83144e, 0);
                C13628n.m24510a(aVar2.f83146g, 0);
            }
            MethodCollector.m26664o(5811);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35214j(AbstractC35203a aVar) {
            this.f83180a = aVar;
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            MethodCollector.m26663i(5807);
            this.f83181c = view;
            ((ViewGroup) this.f83180a.mo62082k().findViewById(R.id.zo)).addView(this.f83181c);
            this.f83180a.mo62084n();
            MethodCollector.m26664o(5807);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            String str2;
            C35226e eVar;
            Boolean bool;
            BulletCommonTitleBar bulletCommonTitleBar;
            AbstractC35203a aVar = this.f83180a;
            if (str == null || (str2 = str.toString()) == null) {
                str2 = "";
            }
            if (!C89361p.m154874b(str2, "http", false) && !C89361p.m154874b(str2, "https", false) && !C89361p.m154874b(str2, "about:", false) && (eVar = aVar.f83150k) != null && (bool = (Boolean) eVar.f83215aI.mo26550b()) != null && bool.booleanValue() && !TextUtils.isEmpty(str) && (bulletCommonTitleBar = aVar.f83144e) != null) {
                if (str == null) {
                    C89219l.m154715b();
                }
                bulletCommonTitleBar.setTitle(str);
            }
        }
    }

    /* renamed from: j */
    public void mo62011j() {
        this.f83162w = "1";
        C13628n.m24510a(this.f83146g, 8);
        C13628n.m24510a(this.f83145f, 8);
        BulletCommonTitleBar bulletCommonTitleBar = this.f83144e;
        if (bulletCommonTitleBar != null) {
            bulletCommonTitleBar.setBackgroundColor(0);
            View a = bulletCommonTitleBar.mo62156a(R.id.rv);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) bulletCommonTitleBar.mo62156a(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a71)).setImageResource(2131231519);
            ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a6v)).setImageResource(2131231522);
            ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.yv)).setImageResource(2131231529);
            ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.dij)).setImageResource(2131231526);
            ((AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.dkd)).setImageResource(2131231524);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$k */
    public static final class C35215k extends C16481e {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83182a;

        static {
            Covode.recordClassIndex(42377);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35215k(AbstractC35203a aVar) {
            this.f83182a = aVar;
        }

        public final void onPageFinished(WebView webView, String str) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.onPageFinished(webView, str);
            }
            AbstractC35203a aVar = this.f83182a;
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58922a((AbstractC17019c) aVar, true);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final void mo26516a(WebView webView, AbstractC16681h hVar, WebResourceResponse webResourceResponse) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.mo26516a(webView, hVar, webResourceResponse);
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16694o
        /* renamed from: a */
        public final void mo26517a(WebView webView, AbstractC16681h hVar, AbstractC16680g gVar) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.mo26517a(webView, hVar, gVar);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.onPageStarted(webView, str, bitmap);
            }
            AbstractC35203a aVar = this.f83182a;
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58922a((AbstractC17019c) aVar, false);
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            C16481e eVar = this.f83182a.f83163x;
            if (eVar != null) {
                eVar.onReceivedError(webView, i, str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62080a(String str) {
        C89219l.m154721d(str, "");
        this.f83162w = str;
    }

    @AbstractC90264r
    public final void onJsBroadcast(C33118a aVar) {
        C89219l.m154721d(aVar, "");
        C35216a aVar2 = this.f83142c;
        if (aVar2 != null) {
            aVar2.mo62106a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$d */
    static final class View$OnClickListenerC35207d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83168a;

        static {
            Covode.recordClassIndex(42369);
        }

        View$OnClickListenerC35207d(AbstractC35203a aVar) {
            this.f83168a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BulletContainerView l = this.f83168a.mo62083l();
            if (l != null) {
                l.mo26842b();
                return;
            }
            SSWebView sSWebView = this.f83168a.f83148i;
            if (sSWebView != null) {
                sSWebView.reload();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$g */
    static final class C35210g extends AbstractC89220m implements AbstractC89172b<C33197a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SSWebView f83173a;

        /* renamed from: b */
        final /* synthetic */ AbstractC35203a f83174b;

        static {
            Covode.recordClassIndex(42372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35210g(SSWebView sSWebView, AbstractC35203a aVar) {
            super(1);
            this.f83173a = sSWebView;
            this.f83174b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C33197a aVar) {
            C33197a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f83173a.setTimeInterval(aVar2.getAutoJumpInterval());
            this.f83174b.f83159t = aVar2.getPauseList();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$h */
    static final class C35211h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC16208i f83175a;

        static {
            Covode.recordClassIndex(42373);
        }

        C35211h(AbstractC16208i iVar) {
            this.f83175a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                str = "appEnterBackgroundEvent";
            } else {
                str = "appEnterForegroundEvent";
            }
            this.f83175a.onEvent(new AbstractC16191p(str) {
                /* class com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a.C35211h.C352121 */

                /* renamed from: a */
                final /* synthetic */ String f83176a;

                /* renamed from: b */
                private final String f83177b;

                /* renamed from: c */
                private final Object f83178c;

                static {
                    Covode.recordClassIndex(42374);
                }

                @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                /* renamed from: a */
                public final String mo25699a() {
                    return this.f83177b;
                }

                @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
                /* renamed from: b */
                public final Object mo25700b() {
                    return this.f83178c;
                }

                {
                    this.f83176a = r1;
                    this.f83177b = r1;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo62004b(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58951c(this);
        }
    }

    /* renamed from: c */
    public void mo62005c(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58952c(this, this.f83148i);
        }
    }

    @AbstractC90264r
    public void onEvent(C40564c cVar) {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58960g();
        }
    }

    /* renamed from: a */
    private final void m72069a(C16721b bVar) {
        OpenURLHintLayout openURLHintLayout;
        C35186c cVar;
        BulletCommonTitleBar bulletCommonTitleBar = this.f83144e;
        if (bulletCommonTitleBar != null) {
            bulletCommonTitleBar.mo62157a(bVar);
        }
        BulletCommonTitleBar bulletCommonTitleBar2 = this.f83144e;
        if (bulletCommonTitleBar2 != null) {
            bulletCommonTitleBar2.setTitleWrap(new C35208e(this, bVar));
        }
        if (!(bVar instanceof C35226e)) {
            bVar = null;
        }
        C35226e eVar = (C35226e) bVar;
        if (((eVar != null && eVar.mo62123n()) || ((cVar = this.f83152m) != null && cVar.mo62021h())) && (openURLHintLayout = this.f83147h) != null) {
            openURLHintLayout.setPadding(0, C80534hh.m139609b(), 0, 0);
        }
    }

    @AbstractC90264r
    public final void onEvent(C33119b bVar) {
        EnumC16723b bVar2;
        SSWebView sSWebView;
        AbstractC16208i iVar;
        AbstractC16208i iVar2 = this.f83149j;
        if (iVar2 != null) {
            bVar2 = iVar2.mo25769b();
        } else {
            bVar2 = null;
        }
        if (bVar2 == EnumC16723b.LYNX) {
            if (bVar != null && bVar.f78707a != 0 && (iVar = this.f83149j) != null && iVar.hashCode() == bVar.f78707a) {
                this.f83156q.run();
            }
        } else if (bVar != null && bVar.f78707a != 0 && (sSWebView = this.f83148i) != null && sSWebView.hashCode() == bVar.f78707a) {
            this.f83156q.run();
        }
    }

    /* renamed from: a */
    public void mo62003a(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f83139B.mo142944a();
        C35226e eVar = this.f83150k;
        if (eVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", eVar.mo62122m());
            hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            C18494b.m34415a(new C18484a("ad_webview_close", System.currentTimeMillis(), C18822b.m34925a(hashMap)));
        }
    }

    /* renamed from: b */
    public final void mo62081b(String str) {
        String str2;
        String str3;
        AbstractC16725d<String> dVar;
        StringBuilder sb = new StringBuilder();
        String[] strArr = new String[2];
        strArr[0] = "platform = ";
        if (this.f83150k != null) {
            str2 = "webview";
        } else if (this.f83151l != null) {
            str2 = "react-native";
        } else {
            str2 = "unknown";
        }
        strArr[1] = str2;
        StringBuilder a = C89361p.m154860a(C89361p.m154860a(sb, strArr), "status = ", str);
        String[] strArr2 = new String[2];
        strArr2[0] = "module_name = ";
        C16854f fVar = this.f83151l;
        if (fVar == null || (dVar = fVar.f40058S) == null) {
            str3 = null;
        } else {
            str3 = dVar.mo26550b();
        }
        strArr2[1] = str3;
        C89361p.m154860a(C89361p.m154860a(a, strArr2), "url = ", this.f83153n);
    }

    @AbstractC90264r
    public final void onEvent(C56257j jVar) {
        String str;
        if (jVar != null) {
            str = jVar.f128321d;
        } else {
            str = null;
        }
        if (TextUtils.equals("web", str)) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58915a(this.f83157r, this.f83144e, jVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$f */
    static final class View$OnClickListenerC35209f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC35203a f83171a;

        /* renamed from: b */
        final /* synthetic */ Activity f83172b;

        static {
            Covode.recordClassIndex(42371);
        }

        View$OnClickListenerC35209f(AbstractC35203a aVar, Activity activity) {
            this.f83171a = aVar;
            this.f83172b = activity;
        }

        public final void onClick(View view) {
            Integer num;
            SSWebView sSWebView;
            ClickAgent.onClick(view);
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            C35221c cVar = this.f83171a.f83154o;
            if (!(cVar == null || cVar.f83199a == null)) {
                cVar.f83199a.dismiss();
            }
            if (!TextUtils.isEmpty(this.f83171a.f83153n) && num != null) {
                if (num.intValue() == R.id.cwu) {
                    Activity activity = this.f83172b;
                    String str = this.f83171a.f83153n;
                    if (!C13627m.m24498a(str)) {
                        try {
                            Intent intent = new Intent();
                            intent.setData(Uri.parse(str));
                            intent.setAction("android.intent.action.VIEW");
                            if (activity != null) {
                                C84349a.m145093a(intent, activity);
                                activity.startActivity(intent);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else if (num.intValue() == R.id.aeg) {
                    Activity activity2 = this.f83172b;
                    String str2 = this.f83171a.f83153n;
                    PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-215").usage("").tag("BaseCommonBizRootContainer_copyLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
                    if (!C13627m.m24498a(str2)) {
                        try {
                            C80228av.m139063a("", str2, activity2, build);
                        } catch (Exception e2) {
                            C51423a.m95786a(e2);
                        }
                        if (activity2 != null) {
                            new C23144b(activity2).mo37640e(R.string.gfg).mo37636b(2131231922).mo37637b();
                        }
                    }
                } else if (num.intValue() == R.id.dh9 && (sSWebView = this.f83171a.f83148i) != null) {
                    sSWebView.reload();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
        this.f83158s = false;
        this.f83153n = uri.toString();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58959f();
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a2 = C33113b.m67826a();
        if (a2 != null) {
            a2.mo58921a(this, this.f83153n);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public ViewGroup mo26896a(Context context) {
        C35226e eVar;
        C89219l.m154721d(context, "");
        Activity activity = (Activity) context;
        this.f83157r = activity;
        View inflate = View.inflate(context, mo62006e(), null);
        C89219l.m154716b(inflate, "");
        this.f83143d = inflate;
        if (inflate == null) {
            C89219l.m154710a("rootView");
        }
        this.f83140a = (DmtStatusView) inflate.findViewById(R.id.awv);
        C17273d dVar = new C17273d.C17274a(activity).mo27457a(2131232924).mo27462b(R.string.gzs).mo27464c(R.string.gzr).mo27459a(EnumC17270a.BORDER, R.string.gzy, new View$OnClickListenerC35207d(this)).f41365a;
        C17275e eVar2 = new C17275e(activity);
        eVar2.setStatus(dVar);
        if (C17175b.m31708b(activity)) {
            eVar2.setBackgroundColor(C0643b.m2378c(activity, R.color.t));
        } else {
            eVar2.setBackgroundColor(C0643b.m2378c(activity, R.color.c0));
        }
        DmtStatusView dmtStatusView = this.f83140a;
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(activity).mo27408c(eVar2));
        }
        View view = this.f83143d;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        this.f83144e = (BulletCommonTitleBar) view.findViewById(R.id.zt);
        View view2 = this.f83143d;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        this.f83145f = view2.findViewById(R.id.eji);
        View view3 = this.f83143d;
        if (view3 == null) {
            C89219l.m154710a("rootView");
        }
        this.f83146g = (Space) view3.findViewById(R.id.cpw);
        View view4 = this.f83143d;
        if (view4 == null) {
            C89219l.m154710a("rootView");
        }
        this.f83147h = (OpenURLHintLayout) view4.findViewById(R.id.zs);
        try {
            Callable<C35226e> callable = this.f83141b;
            if (callable != null) {
                eVar = callable.call();
            } else {
                eVar = null;
            }
            if (eVar == null) {
                C89219l.m154715b();
            }
            m72069a((C16721b) eVar);
            if (C89219l.m154714a((Object) eVar.f39926b.mo26550b(), (Object) true)) {
                C13628n.m24510a(this.f83144e, 8);
                C13628n.m24510a(this.f83146g, 8);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f83141b = null;
            throw th;
        }
        this.f83141b = null;
        View view5 = this.f83143d;
        if (view5 == null) {
            C89219l.m154710a("rootView");
        }
        Objects.requireNonNull(view5, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) view5;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.a$i */
    static final class DialogInterface$OnClickListenerC35213i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC35213i f83179a = new DialogInterface$OnClickListenerC35213i();

        static {
            Covode.recordClassIndex(42375);
        }

        DialogInterface$OnClickListenerC35213i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public AbstractC35203a(C16248b bVar, AbstractC35125b bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f83164y = bVar;
        this.f83165z = bVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        DmtStatusView dmtStatusView = this.f83140a;
        if (dmtStatusView != null) {
            dmtStatusView.mo27387h();
        }
        DmtStatusView dmtStatusView2 = this.f83140a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: a */
    public void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        this.f83158s = true;
        this.f83153n = uri.toString();
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a != null) {
            a.mo58959f();
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a2 = C33113b.m67826a();
        if (a2 != null) {
            a2.mo58941b(this, this.f83153n);
        }
        SSWebView sSWebView = this.f83148i;
        if (sSWebView == null || !sSWebView.canGoBack()) {
            BulletCommonTitleBar bulletCommonTitleBar = this.f83144e;
            if (bulletCommonTitleBar != null) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) bulletCommonTitleBar.mo62156a(R.id.a6v);
                C89219l.m154716b(autoRTLImageView, "");
                autoRTLImageView.setVisibility(8);
            }
        } else {
            BulletCommonTitleBar bulletCommonTitleBar2 = this.f83144e;
            if (bulletCommonTitleBar2 != null) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) bulletCommonTitleBar2.mo62156a(R.id.a6v);
                C89219l.m154716b(autoRTLImageView2, "");
                autoRTLImageView2.setVisibility(0);
            }
        }
        DmtStatusView dmtStatusView = this.f83140a;
        if (dmtStatusView != null) {
            dmtStatusView.mo27385g();
        }
        DmtStatusView dmtStatusView2 = this.f83140a;
        if (dmtStatusView2 != null) {
            dmtStatusView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        AbstractC16725d<Boolean> dVar;
        String str;
        AbstractC16725d<String> dVar2;
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
        this.f83149j = iVar;
        if (qVar instanceof C16721b) {
            if (qVar instanceof C16852d) {
                this.f83139B.mo142945a(C17873f.m33099g().mo143289d(new C35211h(iVar)));
            }
            if (qVar instanceof C35226e) {
                this.f83150k = (C35226e) qVar;
            } else if (qVar instanceof C16854f) {
                this.f83151l = (C16854f) qVar;
            }
            this.f83152m = (C35186c) iVar.mo25763a(C35186c.class);
            if (!(this instanceof C35180b) || this.f83150k == null || mo62007f()) {
                C16721b bVar = (C16721b) qVar;
                this.f83165z.mo61977a(bVar);
                this.f83165z.mo61978a(this.f83152m);
                Activity activity = this.f83157r;
                if (activity != null) {
                    if (this.f83155p == null) {
                        this.f83155p = new View$OnClickListenerC35209f(this, activity);
                    }
                    this.f83154o = new C35221c(activity, this.f83155p);
                }
                Boolean bool = null;
                if (TextUtils.isEmpty(bVar.f39931g.mo26550b())) {
                    AbstractC16725d<String> dVar3 = bVar.f39931g;
                    C35226e eVar = this.f83150k;
                    if (eVar == null || (dVar2 = eVar.f83216aJ) == null) {
                        str = null;
                    } else {
                        str = dVar2.mo26550b();
                    }
                    dVar3.mo26549a(str);
                }
                C35226e eVar2 = this.f83150k;
                if (!(eVar2 == null || (dVar = eVar2.f40064Q) == null)) {
                    bool = dVar.mo26550b();
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    bVar.f39919J.mo26549a((Object) false);
                }
                m72069a(bVar);
                C35226e eVar3 = this.f83150k;
                if (eVar3 != null) {
                    C89219l.m154716b(C33113b.C33114a.f78704a, "");
                    C33113b.m67826a();
                    if (!TextUtils.isEmpty(eVar3.mo62122m())) {
                        C89219l.m154716b(C33113b.C33114a.f78704a, "");
                        AbstractC33115c a = C33113b.m67826a();
                        if (a != null) {
                            a.mo58959f();
                        }
                    }
                    Boolean bool2 = (Boolean) eVar3.f83212aF.mo26550b();
                    if (bool2 != null && bool2.booleanValue()) {
                        C17197a.C17200a aVar = new C17197a.C17200a(this.f83157r);
                        aVar.mo27194b(R.string.dhm).mo27195b(R.string.as6, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC35213i.f83179a, false);
                        aVar.mo27193a().mo27184b();
                    }
                    mo62079a(eVar3);
                }
                if (C89219l.m154714a((Object) bVar.f39926b.mo26550b(), (Object) true)) {
                    C13628n.m24510a(this.f83144e, 8);
                    C13628n.m24510a(this.f83146g, 8);
                }
            }
        }
    }
}
