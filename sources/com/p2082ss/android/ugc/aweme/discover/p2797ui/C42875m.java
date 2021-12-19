package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.p051h.p052a.C0998a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39133d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.activity.AbstractC41570a;
import com.p2082ss.android.ugc.aweme.discover.helper.C42027l;
import com.p2082ss.android.ugc.aweme.discover.helper.C42052u;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41539m;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41925d;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41935n;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41939a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchScanView;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42535c;
import com.p2082ss.android.ugc.aweme.discover.tooltip.C42536d;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SuggestWordsViewModel;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49692t;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.MainBottomTabView;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67350b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67463aa;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67472af;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67554j;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67556k;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67564o;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67579v;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67723c;
import com.p2082ss.android.ugc.aweme.utils.C80511gs;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.m */
public final class C42875m extends AbstractC42715b implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC41570a, AbstractC42533a, AbstractC42534b, AbstractC42535c {

    /* renamed from: Q */
    public static long f99976Q;

    /* renamed from: R */
    public static final C42880d f99977R = new C42880d((byte) 0);

    /* renamed from: A */
    public boolean f99978A;

    /* renamed from: B */
    public C42906r f99979B;

    /* renamed from: C */
    public C34499i f99980C = new C34499i();

    /* renamed from: D */
    public ViewGroup f99981D;

    /* renamed from: E */
    public FrameLayout f99982E;

    /* renamed from: F */
    public SearchScanView f99983F;

    /* renamed from: G */
    public SearchScanView f99984G;

    /* renamed from: H */
    public ImageView f99985H;

    /* renamed from: I */
    public View f99986I;

    /* renamed from: J */
    public RtlViewPager f99987J;

    /* renamed from: K */
    public TabLayout f99988K;

    /* renamed from: L */
    public View f99989L;

    /* renamed from: M */
    public View f99990M;

    /* renamed from: N */
    public View f99991N;

    /* renamed from: O */
    public C42027l f99992O;

    /* renamed from: P */
    public final LogPbBean f99993P;

    /* renamed from: S */
    private C42052u f99994S;

    /* renamed from: T */
    private long f99995T = -1;

    /* renamed from: U */
    private long f99996U = -1;

    /* renamed from: V */
    private MainBottomTabView f99997V;

    /* renamed from: W */
    private C23329a f99998W;

    /* renamed from: X */
    private AbstractC23317a f99999X;

    /* renamed from: Y */
    private final String f100000Y = "tap_anywhere";

    /* renamed from: Z */
    private final lifecycleAwareLazy f100001Z;

    /* renamed from: aa */
    private TuxIconView f100002aa;

    /* renamed from: ab */
    private String f100003ab;

    /* renamed from: ac */
    private BroadcastReceiver f100004ac;

    /* renamed from: ad */
    private SearchEnterViewModel f100005ad;

    /* renamed from: ae */
    private final AbstractC89244h f100006ae;

    /* renamed from: af */
    private final AbstractC89244h f100007af;

    /* renamed from: ag */
    private Context f100008ag;

    /* renamed from: ah */
    private SparseArray f100009ah;

    /* renamed from: y */
    public C42780bo f100010y;

    /* renamed from: z */
    public boolean f100011z;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$b */
    public static final class C42877b extends AbstractC89220m implements AbstractC89183m<TrendsTabState, Bundle, TrendsTabState> {
        public static final C42877b INSTANCE = new C42877b();

        static {
            Covode.recordClassIndex(50982);
        }

        public C42877b() {
            super(2);
        }

        public final TrendsTabState invoke(TrendsTabState trendsTabState, Bundle bundle) {
            C89219l.m154719c(trendsTabState, "");
            return trendsTabState;
        }
    }

    static {
        Covode.recordClassIndex(50980);
    }

    /* renamed from: J */
    private final TrendsTabViewModel m85609J() {
        return (TrendsTabViewModel) this.f100001Z.getValue();
    }

    /* renamed from: K */
    private final boolean m85610K() {
        return ((Boolean) this.f100006ae.getValue()).booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(44, new RunnableC90250g(C42875m.class, "onSearchResultOpenedEvent", C41935n.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: h */
    public final int mo72968h() {
        return R.layout.xx;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: i */
    public final int mo72969i() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: r */
    public final String mo72977r() {
        return "discovery";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$d */
    public static final class C42880d {
        static {
            Covode.recordClassIndex(50985);
        }

        private C42880d() {
        }

        public /* synthetic */ C42880d(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a
    public final void bd_() {
        mo73112D();
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f99980C;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b
    /* renamed from: l */
    public final void mo70806l() {
        mo73112D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$g */
    public static final class CallableC42883g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC42883g f100020a = new CallableC42883g();

        static {
            Covode.recordClassIndex(50988);
        }

        CallableC42883g() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C42619b.f99427b.mo72819a();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$u */
    static final class RunnableC42898u implements Runnable {

        /* renamed from: a */
        public static final RunnableC42898u f100038a = new RunnableC42898u();

        static {
            Covode.recordClassIndex(51003);
        }

        RunnableC42898u() {
        }

        public final void run() {
            C67446h.f151111a.mo106224m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$a */
    public static final class C42876a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f100012a;

        static {
            Covode.recordClassIndex(50981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42876a(AbstractC89277c cVar) {
            super(0);
            this.f100012a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f100012a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$s */
    static final class RunnableC42896s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42875m f100036a;

        static {
            Covode.recordClassIndex(51001);
        }

        RunnableC42896s(C42875m mVar) {
            this.f100036a = mVar;
        }

        public final void run() {
            if (this.f100036a.af_()) {
                this.f100036a.mo73114I();
            }
        }
    }

    /* renamed from: L */
    private final boolean m85611L() {
        if (!m85610K()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = this.f100008ag;
        if (context != null) {
            return context;
        }
        return super.getContext();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: k */
    public final void mo72971k() {
        super.mo72945C();
        KeyboardUtils.m70897c(this.f99631b);
        mo73113E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$v */
    public static final class CallableC42899v<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f100039a;

        static {
            Covode.recordClassIndex(51004);
        }

        CallableC42899v(long j) {
            this.f100039a = j;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C59218am a = new C59218am().mo96758a("discovery");
            a.f134899a = String.valueOf(this.f100039a);
            a.mo96792f();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$w */
    public static final class CallableC42900w<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f100040a;

        static {
            Covode.recordClassIndex(51005);
        }

        CallableC42900w(long j) {
            this.f100040a = j;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C59218am a = new C59218am().mo96758a("search_empty_page");
            a.f134899a = String.valueOf(this.f100040a);
            a.mo96792f();
            return null;
        }
    }

    /* renamed from: D */
    public final void mo73112D() {
        if (C42536d.f99177b) {
            mo72669b();
            C42536d.C42537a.m85033a(this.f100000Y);
            C42536d.f99179d = false;
            C42536d.f99181f = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42535c
    /* renamed from: b */
    public final void mo72669b() {
        AbstractC23317a aVar;
        if (C16048b.m29633a().mo25411a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0 && (aVar = this.f99999X) != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$c */
    public static final class C42878c extends AbstractC89220m implements AbstractC89171a<TrendsTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f100013a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f100014b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f100015c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f100016d;

        static {
            Covode.recordClassIndex(50983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42878c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f100013a = fragment;
            this.f100014b = aVar;
            this.f100015c = cVar;
            this.f100016d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f100013a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f100014b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f100015c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m85637x87c40655(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel> r0 = com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.discover.ui.m$c$1 r0 = new com.ss.android.ugc.aweme.discover.ui.m$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42875m.C42878c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_discover_ui_DiscoverAndSearchFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m85637x87c40655(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: M */
    private final void m85612M() {
        if (this.f99631b == null) {
            return;
        }
        if (C39223a.m79602p().mo68656e()) {
            EditText editText = this.f99631b;
            C89219l.m154716b(editText, "");
            editText.setCursorVisible(false);
            EditText editText2 = this.f99631b;
            C89219l.m154716b(editText2, "");
            editText2.setFocusable(false);
            EditText editText3 = this.f99631b;
            C89219l.m154716b(editText3, "");
            editText3.setFocusableInTouchMode(false);
            return;
        }
        EditText editText4 = this.f99631b;
        C89219l.m154716b(editText4, "");
        editText4.setFocusable(true);
        EditText editText5 = this.f99631b;
        C89219l.m154716b(editText5, "");
        editText5.setFocusableInTouchMode(true);
    }

    /* renamed from: O */
    private final void m85614O() {
        if (this.f99995T > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f99995T;
            if (elapsedRealtime > 0) {
                C1731i.m5640b(new CallableC42899v(elapsedRealtime), C39162r.m79452a());
            }
            this.f99995T = -1;
        }
    }

    /* renamed from: P */
    private final void m85615P() {
        if (this.f99996U > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f99996U;
            if (elapsedRealtime > 0) {
                C1731i.m5640b(new CallableC42900w(elapsedRealtime), C39162r.m79452a());
            }
            this.f99996U = -1;
        }
    }

    /* renamed from: E */
    public final void mo73113E() {
        if (!mo70779a()) {
            if (getActivity() instanceof AbstractC59103j) {
                ActivityC0945e activity = getActivity();
                if (!(activity instanceof AbstractC59103j)) {
                    activity = null;
                }
                AbstractC59103j jVar = (AbstractC59103j) activity;
                if (jVar != null) {
                    jVar.onKeyBack();
                    return;
                }
                return;
            }
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            activity2.onBackPressed();
        }
    }

    /* renamed from: I */
    public final void mo73114I() {
        C42052u uVar = this.f99994S;
        if (uVar == null) {
            C89219l.m154715b();
        }
        uVar.mo71171b();
        mo72955b(1);
        this.f99631b.setText("");
        EditText editText = this.f99631b;
        C89219l.m154716b(editText, "");
        editText.setCursorVisible(false);
        mo72953a(false);
        C42780bo boVar = this.f100010y;
        if (boVar == null) {
            C89219l.m154715b();
        }
        boVar.f99791c = mo72982w();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onPause() {
        AbstractC42874l a;
        super.onPause();
        this.f43437f = false;
        if (this.f100011z) {
            if (mo72982w() == 1) {
                m85614O();
                C42906r rVar = this.f99979B;
                if (!(rVar == null || (a = rVar.mo73129a()) == null)) {
                    a.mo73058a(true, true);
                }
            } else if (mo72982w() == 3) {
                m85615P();
            }
        }
        this.f99978A = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: t */
    public final void mo72979t() {
        if (mo72982w() == 1) {
            C42052u uVar = this.f99994S;
            if (uVar == null) {
                C89219l.m154715b();
            }
            uVar.mo71167a();
        }
        this.f99637l.mo72756a(false);
        mo72955b(3);
        C42780bo boVar = this.f100010y;
        if (boVar == null) {
            C89219l.m154715b();
        }
        boVar.f99791c = mo72982w();
        C42780bo boVar2 = this.f100010y;
        if (boVar2 == null) {
            C89219l.m154715b();
        }
        boVar2.mo73058a(true, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$o */
    static final class C42892o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC53316a f100032a;

        static {
            Covode.recordClassIndex(50997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42892o(AbstractC53316a aVar) {
            super(0);
            this.f100032a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C42536d.f99183h = System.currentTimeMillis();
            if (C16048b.m29633a().mo25411a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) == 1) {
                C42536d.C42537a.m85036b("tooltip");
            }
            if (C16048b.m29633a().mo25411a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) == 2) {
                this.f100032a.mo89765k();
                C42536d.f99178c = true;
                C42536d.C42537a.m85036b("tooltip_reddot");
            }
            C42536d.C42537a.m85034a(true);
            NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.m43072d().mo37164b();
            C42536d.f99180e = true;
            C39162r.m79460a("show_fyp_tooltip", new C33744d().mo59983a("enter_from", C42536d.f99182g).mo59983a(StringSet.type, C42536d.f99185j).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$p */
    static final class C42893p extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C42893p f100033a = new C42893p();

        static {
            Covode.recordClassIndex(50998);
        }

        C42893p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C42536d.f99184i = System.currentTimeMillis();
            if (C42536d.f99179d) {
                NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.m43072d().mo37163a();
                C42536d.f99179d = false;
            } else {
                NotificationCountViewManager.Companion.NotificationCountViewServiceImpl.m43072d().mo37165c();
            }
            C42536d.C42537a.m85034a(false);
            if (C42536d.f99183h > -1 && C42536d.f99184i > -1) {
                C39162r.m79460a("dismiss_fyp_tooltip", new C33744d().mo59983a(StringSet.type, C42536d.f99185j).mo59981a("duration", C42536d.f99184i - C42536d.f99183h).mo59983a("dismiss_method", C42536d.f99186k).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    public C42875m() {
        AbstractC89277c a = C89204ab.m154669a(TrendsTabViewModel.class);
        C42876a aVar = new C42876a(a);
        this.f100001Z = new lifecycleAwareLazy(this, aVar, new C42878c(this, aVar, a, C42877b.INSTANCE));
        this.f100006ae = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C42894q.f100034a, "i18n_tab_mode", Boolean.class);
        this.f100007af = RouteArgExtension.INSTANCE.optionalArg(this, C42895r.f100035a, "search_enter_param", C67674b.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p2082ss.android.ugc.aweme.search.model.C67674b m85613N() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x000c
            androidx.fragment.app.e r0 = r4.getActivity()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            com.ss.android.ugc.aweme.search.model.b r0 = new com.ss.android.ugc.aweme.search.model.b
            r0.<init>()
            return r0
        L_0x0012:
            androidx.fragment.app.e r0 = r4.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.m108593a(r0)
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0024
            java.lang.String r2 = r0.getAid()
            if (r2 != 0) goto L_0x0027
        L_0x0024:
            r2 = r3
            if (r0 == 0) goto L_0x002d
        L_0x0027:
            java.lang.String r0 = r0.getAuthorUid()
            if (r0 != 0) goto L_0x0040
        L_0x002d:
            com.ss.android.ugc.aweme.search.model.b$b r0 = com.p2082ss.android.ugc.aweme.search.model.C67674b.Companion
            com.ss.android.ugc.aweme.search.model.b$a r1 = r0.newBuilder()
            java.lang.String r0 = "discovery"
            r1.f151625a = r0
            r1.f151627c = r2
            r1.f151628d = r3
            com.ss.android.ugc.aweme.search.model.b r0 = r1.mo106686a()
            return r0
        L_0x0040:
            r3 = r0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.C42875m.m85613N():com.ss.android.ugc.aweme.search.model.b");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C0998a a = C0998a.m3454a(context);
        BroadcastReceiver broadcastReceiver = this.f100004ac;
        if (broadcastReceiver == null) {
            C89219l.m154715b();
        }
        a.mo3692a(broadcastReceiver);
        if (DiscoveryServiceImpl.m83414g().mo70767f()) {
            C1870c.m6047a((int) R.layout.xx);
            C1870c.m6047a((int) R.layout.xm);
        }
        AbstractC23317a aVar = this.f99999X;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f99999X = null;
        this.f99998W = null;
        C42536d.f99176a = null;
        SparseArray sparseArray = this.f100009ah;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.activity.AbstractC41570a
    /* renamed from: a */
    public final boolean mo70779a() {
        if (!af_()) {
            return false;
        }
        mo72983x();
        int w = mo72982w();
        if (w != 1) {
            if (w == 3) {
                m85615P();
            }
            EditText editText = this.f99631b;
            if (editText != null) {
                editText.setText("");
                editText.setCursorVisible(false);
                editText.clearFocus();
            }
            C42052u uVar = this.f99994S;
            if (uVar != null) {
                uVar.mo71171b();
            }
            mo72955b(1);
            this.f99995T = SystemClock.elapsedRealtime();
            mo72953a(true);
            C42780bo boVar = this.f100010y;
            if (boVar != null) {
                boVar.f99791c = mo72982w();
                boVar.mo73058a(false, false);
            }
            AbstractC81915c.m141874a(new C41925d(false));
            m85609J().mo73216m();
            return true;
        }
        m85614O();
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: j */
    public final void mo72970j() {
        mo72955b(1);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        this.f99979B = new C42906r(context, childFragmentManager);
        RtlViewPager rtlViewPager = this.f99987J;
        if (rtlViewPager == null) {
            C89219l.m154715b();
        }
        rtlViewPager.setAdapter(this.f99979B);
        C42906r rVar = this.f99979B;
        if (rVar == null) {
            C89219l.m154715b();
        }
        rVar.notifyDataSetChanged();
        RtlViewPager rtlViewPager2 = this.f99987J;
        if (rtlViewPager2 == null) {
            C89219l.m154715b();
        }
        C42906r rVar2 = this.f99979B;
        if (rVar2 == null) {
            C89219l.m154715b();
        }
        rtlViewPager2.setOnPageChangeListener(new C42905q(rVar2));
        RtlViewPager rtlViewPager3 = this.f99987J;
        if (rtlViewPager3 == null) {
            C89219l.m154715b();
        }
        rtlViewPager3.setOffscreenPageLimit(4);
        C89219l.m154721d(this, "");
        C89219l.m154721d(this, "");
        C42780bo boVar = new C42780bo(this, this);
        boVar.setArguments(new Bundle(1));
        this.f100010y = boVar;
        C42906r rVar3 = this.f99979B;
        if (rVar3 == null) {
            C89219l.m154715b();
        }
        C42780bo boVar2 = this.f100010y;
        if (boVar2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154721d(boVar2, "");
        rVar3.f100051a.add(boVar2);
        rVar3.notifyDataSetChanged();
        AbstractC88412b unused = selectSubscribe(m85609J(), C42901n.f100041a, new C20370ah(), new C42887k(this));
        C42906r rVar4 = this.f99979B;
        if (rVar4 != null) {
            rVar4.mo73132b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onResume() {
        Window window;
        View decorView;
        Window window2;
        AbstractC42874l a;
        super.onResume();
        if (this.f100011z) {
            if (mo72982w() == 1) {
                this.f99995T = SystemClock.elapsedRealtime();
                C42906r rVar = this.f99979B;
                if (!(rVar == null || (a = rVar.mo73129a()) == null)) {
                    a.mo73058a(false, true);
                }
            } else if (mo72982w() == 3) {
                this.f99996U = SystemClock.elapsedRealtime();
            }
        }
        if (getUserVisibleHint() && !C80511gs.m139551a() && this.f100011z) {
            EditText editText = this.f99631b;
            C89219l.m154716b(editText, "");
            String obj = editText.getHint().toString();
            if (!TextUtils.isEmpty(obj) && !TextUtils.equals(obj, m85327m()) && this.f99993P != null) {
                new C67472af().mo106488q("show").mo106482b(obj).mo106483c(new C27910f().mo46674b(this.f99993P)).mo96792f();
            }
            this.f99978A = true;
        }
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (window2 = activity.getWindow()) == null)) {
            window2.setBackgroundDrawable(null);
        }
        int i = Build.VERSION.SDK_INT;
        ActivityC0945e activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackground(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$i */
    public static final class C42885i implements C42052u.AbstractC42053a {

        /* renamed from: a */
        final /* synthetic */ C42875m f100023a;

        static {
            Covode.recordClassIndex(50990);
        }

        C42885i(C42875m mVar) {
            this.f100023a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42052u.AbstractC42053a
        /* renamed from: a */
        public final void mo71222a(boolean z) {
            C42027l.AbstractC42029b l;
            C42027l lVar = this.f100023a.f99992O;
            if (lVar != null && (l = lVar.mo71208l()) != null) {
                l.mo71189b(z);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42052u.AbstractC42053a
        /* renamed from: b */
        public final void mo71223b(boolean z) {
            C42027l.AbstractC42029b l;
            if (this.f100023a.f99992O != null) {
                C42027l lVar = this.f100023a.f99992O;
                if (!(lVar == null || (l = lVar.mo71208l()) == null)) {
                    l.mo71191c(z);
                }
                if (!z) {
                    if (this.f100023a.f99637l.mo72758b()) {
                        EditText editText = this.f100023a.f99631b;
                        C89219l.m154716b(editText, "");
                        editText.setVisibility(0);
                        this.f100023a.f99631b.requestFocus();
                        EditText editText2 = this.f100023a.f99631b;
                        C89219l.m154716b(editText2, "");
                        editText2.setCursorVisible(true);
                        KeyboardUtils.m70896b(this.f100023a.f99631b);
                        return;
                    }
                    return;
                }
            } else if (!z) {
                return;
            }
            KeyboardUtils.m70897c(this.f100023a.f99631b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$m */
    public static final class C42890m implements C42027l.AbstractC42028a {

        /* renamed from: a */
        final /* synthetic */ C42875m f100030a;

        static {
            Covode.recordClassIndex(50995);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42890m(C42875m mVar) {
            this.f100030a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42028a
        /* renamed from: a */
        public final void mo71210a(int i) {
            EditText editText = this.f100030a.f99631b;
            if (editText != null) {
                editText.setVisibility(i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42028a
        /* renamed from: a */
        public final void mo71211a(View view) {
            C89219l.m154721d(view, "");
            C42875m mVar = this.f100030a;
            EditText editText = mVar.f99631b;
            C89219l.m154716b(editText, "");
            mVar.mo72956b(editText);
            this.f100030a.mo73112D();
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42028a
        /* renamed from: a */
        public final void mo71212a(Word word) {
            C89219l.m154721d(word, "");
            this.f100030a.mo72957b(new AbstractC42715b.C42720a(word.getWord(), word.getId()));
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42027l.AbstractC42028a
        /* renamed from: a */
        public final void mo71213a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f100030a.mo72949a(new C67678d().setKeyword(str2).setRealSearchWord(str2).setSearchFrom("default_search_keyword").setOpenNewSearchContainer(false).setEnterMethod("default_search_keyword"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$n */
    public static final class C42891n implements SearchScanView.AbstractC42582a {

        /* renamed from: a */
        final /* synthetic */ C42875m f100031a;

        static {
            Covode.recordClassIndex(50996);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42891n(C42875m mVar) {
            this.f100031a = mVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchScanView.AbstractC42582a
        /* renamed from: a */
        public final void mo72776a(View view) {
            C89219l.m154721d(view, "");
            C67678d searchFrom = new C67678d().setSearchFrom("normal_search");
            C42875m mVar = this.f100031a;
            C89219l.m154716b(searchFrom, "");
            mVar.mo72960c(searchFrom);
            this.f100031a.mo73112D();
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.SearchScanView.AbstractC42582a
        /* renamed from: b */
        public final void mo72777b(View view) {
            C89219l.m154721d(view, "");
            if (this.f100031a.getActivity() == null || !MSAdaptionService.m97895c().mo89377c((Context) this.f100031a.getActivity())) {
                new C67463aa().mo106459o("discovery").mo96792f();
                Context context = this.f100031a.getContext();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - C42875m.f99976Q >= 1000) {
                    C42875m.f99976Q = elapsedRealtime;
                    SmartRouter.buildRoute(context, "//aweme/scan").withParam("finishAfterScan", false).open();
                }
                this.f100031a.mo73112D();
                return;
            }
            new C23144b(this.f100031a).mo37635a(this.f100031a.getString(R.string.bed)).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$r */
    static final class C42895r extends AbstractC89220m implements AbstractC89172b<Boolean, C67674b> {

        /* renamed from: a */
        public static final C42895r f100035a = new C42895r();

        static {
            Covode.recordClassIndex(51000);
        }

        C42895r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C67674b invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$t */
    public static final class C42897t extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C42875m f100037a;

        static {
            Covode.recordClassIndex(51002);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42897t(C42875m mVar) {
            this.f100037a = mVar;
        }

        public final void onReceive(Context context, Intent intent) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(intent, "");
            if (!(!C89219l.m154714a((Object) "android.intent.action.USER_PRESENT", (Object) intent.getAction())) && this.f100037a.getUserVisibleHint() && this.f100037a.f43437f && !this.f100037a.f99978A && this.f100037a.f100011z) {
                EditText editText = this.f100037a.f99631b;
                C89219l.m154716b(editText, "");
                String obj = editText.getHint().toString();
                if (!TextUtils.isEmpty(obj) && !TextUtils.equals(obj, C67350b.f150919a.mo106246a(-1)) && this.f100037a.f99993P != null) {
                    new C67472af().mo106488q("show").mo106482b(obj).mo106483c(new C27910f().mo46674b(this.f100037a.f99993P)).mo96792f();
                }
                this.f100037a.f99978A = true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$e */
    static final class View$OnClickListenerC42881e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchScanView.AbstractC42582a f100018a;

        static {
            Covode.recordClassIndex(50986);
        }

        View$OnClickListenerC42881e(SearchScanView.AbstractC42582a aVar) {
            this.f100018a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100018a.mo72777b(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$j */
    static final class View$OnClickListenerC42886j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42875m f100024a;

        static {
            Covode.recordClassIndex(50991);
        }

        View$OnClickListenerC42886j(C42875m mVar) {
            this.f100024a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f100024a.f99637l);
            this.f100024a.mo73113E();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$q */
    static final class C42894q extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        public static final C42894q f100034a = new C42894q();

        static {
            Covode.recordClassIndex(50999);
        }

        C42894q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C89219l.m154721d(context, "");
        super.onAttach(context);
        this.f100008ag = context;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$l */
    static final class View$OnClickListenerC42889l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42875m f100029a;

        static {
            Covode.recordClassIndex(50994);
        }

        View$OnClickListenerC42889l(C42875m mVar) {
            this.f100029a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C23144b(this.f100029a).mo37640e(R.string.acx).mo37637b();
            this.f100029a.mo73112D();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: a */
    public final void mo72948a(AbstractC42715b.C42720a aVar) {
        C89219l.m154721d(aVar, "");
        if (C41539m.m83475a()) {
            mo72957b(aVar);
        } else {
            super.mo72948a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: e */
    public final boolean mo72965e(String str) {
        C89219l.m154721d(str, "");
        C42027l lVar = this.f99992O;
        if (lVar != null) {
            return lVar.mo71204a(str);
        }
        return super.mo72965e(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$h */
    static final class View$OnClickListenerC42884h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f100021a;

        /* renamed from: b */
        final /* synthetic */ C42875m f100022b;

        static {
            Covode.recordClassIndex(50989);
        }

        View$OnClickListenerC42884h(View view, C42875m mVar) {
            this.f100021a = view;
            this.f100022b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f100021a.getContext(), "//friends/find").withParam("previous_page", "discover").open();
            C39162r.m79462a("click_add_friends", C89387v.m154943a("discover", "enter_from"));
            this.f100022b.mo73112D();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: b */
    public final void mo72955b(int i) {
        super.mo72955b(i);
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            AbstractC81915c.m141874a(new C49692t(8));
        } else {
            AbstractC81915c.m141874a(new C49692t(0));
        }
    }

    @AbstractC90264r
    public final void onSearchResultOpenedEvent(C41935n nVar) {
        if (mo72982w() != 1) {
            RunnableC42896s sVar = new RunnableC42896s(this);
            if (C67446h.f151111a.mo106219h()) {
                View view = getView();
                if (view == null) {
                    C89219l.m154715b();
                }
                view.postDelayed(sVar, 1000);
                return;
            }
            sVar.run();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$f */
    static final class C42882f extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C42882f f100019a = new C42882f();

        static {
            Covode.recordClassIndex(50987);
        }

        C42882f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_scan;
            aVar2.f54434d = Integer.valueOf((int) R.attr.bi);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: a */
    public final void mo72946a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            SearchEnterViewModel a = SearchEnterViewModel.C42997a.m85830a(activity);
            this.f100005ad = a;
            if (a == null) {
                C89219l.m154715b();
            }
            a.mo73183a(activity, (C67674b) this.f100007af.getValue());
            SearchEnterViewModel searchEnterViewModel = this.f100005ad;
            if (searchEnterViewModel == null) {
                C89219l.m154715b();
            }
            if (searchEnterViewModel.f100248a == null) {
                SearchEnterViewModel searchEnterViewModel2 = this.f100005ad;
                if (searchEnterViewModel2 == null) {
                    C89219l.m154715b();
                }
                searchEnterViewModel2.f100248a = m85613N();
            }
            SearchEnterViewModel searchEnterViewModel3 = this.f100005ad;
            if (searchEnterViewModel3 == null) {
                C89219l.m154715b();
            }
            C67674b bVar = searchEnterViewModel3.f100248a;
            if (bVar == null) {
                C89219l.m154715b();
            }
            bVar.setEnterSearchFrom("discovery");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: b */
    public final void mo72958b(String str) {
        new C67554j().mo106460p("cancel").mo106459o("discovery").mo96792f();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: c */
    public final void mo72960c(C67678d dVar) {
        String str;
        Word m;
        C89219l.m154721d(dVar, "");
        if (!C67723c.m119890a(dVar.getKeyword()) && getContext() != null && getActivity() != null) {
            C67674b N = m85613N();
            C42027l lVar = this.f99992O;
            Word word = null;
            if (lVar == null || (m = lVar.mo71209m()) == null) {
                str = null;
            } else {
                str = m.getShowWord();
            }
            N.setSearchHint(str);
            C42027l lVar2 = this.f99992O;
            if (lVar2 != null) {
                word = lVar2.mo71209m();
            }
            N.setInboxWord(word);
            C67446h.f151111a.mo106201a(new C67677c(getActivity(), dVar, N));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: d */
    public final void mo72963d(String str) {
        C89219l.m154721d(str, "");
        boolean z = true;
        if (TextUtils.isEmpty(str)) {
            EditText editText = this.f99631b;
            C89219l.m154716b(editText, "");
            CharSequence hint = editText.getHint();
            if (hint != null && mo72965e(hint.toString())) {
                return;
            }
            if (mo72982w() == 1 || SearchStateViewModel.isSearchIntermediate(mo72982w())) {
                EditText editText2 = this.f99631b;
                C89219l.m154716b(editText2, "");
                String obj = editText2.getHint().toString();
                if (!TextUtils.isEmpty(obj) && !m85325a(obj)) {
                    ((C67564o) new C67564o().mo106488q("click").mo106459o("default_search_keyword")).mo106505r(obj).mo106506s("general_word").mo96792f();
                    str = obj;
                    super.mo72952a(str, z);
                }
            }
        }
        z = false;
        super.mo72952a(str, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b
    /* renamed from: b */
    public final void mo72956b(View view) {
        C89219l.m154721d(view, "");
        if (!C80580in.m139687c()) {
            if (C39223a.m79602p().mo68656e()) {
                new C23144b(this).mo37640e(R.string.br3).mo37637b();
            } else if (this.f99631b != null) {
                if (mo72982w() == 1) {
                    new C67554j().mo106459o("discovery").mo106460p("enter").mo96792f();
                    new C67556k().mo106459o("discovery").mo106460p("enter").mo96792f();
                    AbstractC81915c.m141874a(new C41925d(true));
                    new C67579v("search_sign").mo96792f();
                    C39133d.f92337a = System.currentTimeMillis();
                    m85614O();
                    this.f99996U = SystemClock.elapsedRealtime();
                }
                this.f99631b.requestFocus();
                EditText editText = this.f99631b;
                C89219l.m154716b(editText, "");
                editText.setCursorVisible(true);
                KeyboardUtils.m70896b(this.f99631b);
                EditText editText2 = this.f99631b;
                C89219l.m154716b(editText2, "");
                if (TextUtils.isEmpty(editText2.getText().toString())) {
                    mo72979t();
                } else {
                    mo72980u();
                }
                if (C41503ak.f96822a) {
                    C1731i.m5640b(CallableC42883g.f100020a, C1731i.f5562a);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        SuggestWordsViewModel j;
        String str;
        AbstractC42874l a;
        super.setUserVisibleHint(z);
        boolean z2 = !z;
        this.f100011z = !z2;
        if (!(getActivity() == null || this.f100010y == null)) {
            int w = mo72982w();
            if (w == 1) {
                C42906r rVar = this.f99979B;
                if (!(rVar == null || (a = rVar.mo73129a()) == null)) {
                    a.mo73058a(z2, false);
                }
                if (this.f100011z) {
                    this.f99995T = SystemClock.elapsedRealtime();
                } else {
                    m85614O();
                }
            } else if (w == 3) {
                if (this.f100011z) {
                    this.f99996U = SystemClock.elapsedRealtime();
                } else {
                    m85615P();
                }
            }
        }
        if (this.f100011z) {
            if (!C80580in.m139687c()) {
                m85612M();
            }
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                SearchEnterViewModel a2 = SearchEnterViewModel.C42997a.m85830a(activity);
                this.f100005ad = a2;
                if (a2 != null) {
                    C67674b bVar = a2.f100248a;
                    if (bVar == null) {
                        bVar = m85613N();
                        SearchEnterViewModel searchEnterViewModel = this.f100005ad;
                        if (searchEnterViewModel == null) {
                            C89219l.m154715b();
                        }
                        searchEnterViewModel.f100248a = bVar;
                    }
                    Aweme a3 = AwemeChangeCallBack.m108593a(getActivity());
                    String str2 = "";
                    if (a3 != null) {
                        String aid = a3.getAid();
                        C89219l.m154716b(aid, str2);
                        String authorUid = a3.getAuthorUid();
                        if (authorUid != null) {
                            str2 = authorUid;
                        }
                        str = str2;
                        str2 = aid;
                    } else {
                        str = str2;
                    }
                    bVar.setGroupId(str2);
                    bVar.setAuthorId(str);
                }
                SearchEnterViewModel searchEnterViewModel2 = this.f100005ad;
                if (searchEnterViewModel2 == null) {
                    C89219l.m154715b();
                }
                C67674b bVar2 = searchEnterViewModel2.f100248a;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                bVar2.setEnterSearchFrom("discovery");
            }
        }
        C42027l lVar = this.f99992O;
        if (lVar != null) {
            if (z && !C67446h.f151111a.mo106228q() && (j = lVar.mo71206j()) != null) {
                j.mo73196a(lVar.mo71207k());
            }
            lVar.f97982a = z;
            C42027l.AbstractC42029b l = lVar.mo71208l();
            if (l != null) {
                l.mo71186a(z);
            }
        }
        if (z) {
            if (isAdded()) {
                m85609J().mo73216m();
            }
            C42906r rVar2 = this.f99979B;
            if (rVar2 != null) {
                rVar2.mo73132b();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.m$k */
    static final class C42887k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42875m f100025a;

        static {
            Covode.recordClassIndex(50992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42887k(C42875m mVar) {
            super(2);
            this.f100025a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            int i;
            View view;
            int i2;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            C42906r rVar = this.f100025a.f99979B;
            if (rVar != null) {
                i = rVar.getCount();
            } else {
                i = 0;
            }
            if (1 == i && (view = this.f100025a.f99991N) != null) {
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                view.setVisibility(i2);
            }
            C42780bo boVar = this.f100025a.f100010y;
            if (boVar == null) {
                C89219l.m154715b();
            }
            boVar.f99791c = this.f100025a.mo72982w();
            C42906r rVar2 = this.f100025a.f99979B;
            if (rVar2 == null) {
                C89219l.m154715b();
            }
            if (rVar2.getCount() > 1) {
                TabLayout tabLayout = this.f100025a.f99988K;
                if (tabLayout == null) {
                    C89219l.m154715b();
                }
                tabLayout.setupWithViewPager(this.f100025a.f99987J);
                C42906r rVar3 = this.f100025a.f99979B;
                if (rVar3 == null) {
                    C89219l.m154715b();
                }
                int count = rVar3.getCount();
                for (final int i3 = 0; i3 < count; i3++) {
                    TabLayout tabLayout2 = this.f100025a.f99988K;
                    if (tabLayout2 == null) {
                        C89219l.m154715b();
                    }
                    final TabLayout.C26722f tabAt = tabLayout2.getTabAt(i3);
                    if (tabAt != null) {
                        tabAt.mo44367a(R.layout.xl);
                        View view2 = tabAt.f63312f;
                        if (view2 != null) {
                            view2.setOnClickListener(new View.OnClickListener(this) {
                                /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42875m.C42887k.View$OnClickListenerC428881 */

                                /* renamed from: a */
                                final /* synthetic */ C42887k f100026a;

                                static {
                                    Covode.recordClassIndex(50993);
                                }

                                {
                                    this.f100026a = r1;
                                }

                                public final void onClick(View view) {
                                    ClickAgent.onClick(view);
                                    C42906r rVar = this.f100026a.f100025a.f99979B;
                                    if (rVar != null) {
                                        rVar.f100052b = i3;
                                    }
                                    tabAt.mo44370a();
                                    this.f100026a.f100025a.mo73112D();
                                }
                            });
                        }
                    }
                }
            } else {
                TabLayout tabLayout3 = this.f100025a.f99988K;
                if (tabLayout3 != null) {
                    tabLayout3.setVisibility(8);
                }
                View view3 = this.f100025a.f99989L;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        FrameLayout frameLayout;
        View findViewById;
        View findViewById2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f100004ac = new C42897t(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C0998a a = C0998a.m3454a(context);
        BroadcastReceiver broadcastReceiver = this.f100004ac;
        if (broadcastReceiver == null) {
            C89219l.m154715b();
        }
        a.mo3693a(broadcastReceiver, intentFilter);
        String str = this.f100003ab;
        if (!TextUtils.isEmpty(str)) {
            mo72952a(str, true);
        }
        ViewGroup viewGroup = this.f99981D;
        if (C80580in.m139687c() || !C41539m.m83475a() || C67350b.m119403a()) {
            z = false;
        } else {
            z = true;
        }
        if (viewGroup != null && z) {
            this.f99992O = new C42027l(new C42027l.C42033e(viewGroup, new C42890m(this)), m85609J().f100271a);
            FrameLayout frameLayout2 = this.f99982E;
            if (!(frameLayout2 == null || (findViewById2 = frameLayout2.findViewById(R.id.eo_)) == null)) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C23163i.m43660a(findViewById2, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()))), (Integer) null, (Integer) 0, (Integer) null, false, 26);
            }
            TuxIconView tuxIconView = this.f100002aa;
            if (!(tuxIconView == null || (frameLayout = this.f99982E) == null || (findViewById = frameLayout.findViewById(R.id.cdp)) == null)) {
                C23163i.m43660a(findViewById, (Integer) null, (Integer) null, Integer.valueOf(tuxIconView.getLayoutParams().width), (Integer) null, false, 27);
            }
        }
        if (C67446h.f151111a.mo106226o()) {
            view.post(RunnableC42898u.f100038a);
        }
        if (C42536d.C42537a.m85032a().booleanValue() && C42536d.f99187l.getBoolean("first_time", true) && C16048b.m29633a().mo25411a("return_fyp_tooltip", ClientExpManager.return_fyp_tooltip()) != 0) {
            C89219l.m154721d(this, "");
            C42536d.f99176a = this;
            AbstractC23317a aVar = this.f99999X;
            if (aVar != null) {
                aVar.mo38001a();
            }
        }
        C42536d.f99187l.storeBoolean("first_time", false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42715b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        ImageView imageView;
        MainBottomTabView mainBottomTabView;
        Context context;
        View view2;
        MethodCollector.m26663i(4532);
        C89219l.m154721d(layoutInflater, "");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            this.f99981D = (ViewGroup) onCreateView.findViewById(R.id.em2);
            this.f99982E = (FrameLayout) onCreateView.findViewById(R.id.dl4);
            this.f99983F = (SearchScanView) onCreateView.findViewById(R.id.dsg);
            this.f99984G = (SearchScanView) onCreateView.findViewById(R.id.dsh);
            this.f99985H = (ImageView) onCreateView.findViewById(R.id.pl);
            this.f99986I = onCreateView.findViewById(R.id.dk8);
            this.f99987J = (RtlViewPager) onCreateView.findViewById(R.id.ffo);
            this.f99988K = (TabLayout) onCreateView.findViewById(R.id.ee7);
            this.f99989L = onCreateView.findViewById(R.id.edz);
            this.f99990M = onCreateView.findViewById(R.id.gs);
            this.f99991N = onCreateView.findViewById(R.id.c9f);
        }
        if (m85610K()) {
            SearchScanView searchScanView = this.f99983F;
            if (searchScanView == null) {
                C89219l.m154715b();
            }
            searchScanView.setVisibility(8);
            SearchScanView searchScanView2 = this.f99984G;
            if (searchScanView2 == null) {
                C89219l.m154715b();
            }
            searchScanView2.setVisibility(0);
            SearchScanView searchScanView3 = this.f99984G;
            if (searchScanView3 == null) {
                C89219l.m154715b();
            }
            searchScanView3.mo72773a();
        } else {
            SearchScanView searchScanView4 = this.f99984G;
            if (searchScanView4 == null) {
                C89219l.m154715b();
            }
            searchScanView4.setVisibility(8);
            SearchScanView searchScanView5 = this.f99983F;
            if (searchScanView5 == null) {
                C89219l.m154715b();
            }
            searchScanView5.setVisibility(0);
            SearchScanView searchScanView6 = this.f99983F;
            if (searchScanView6 == null) {
                C89219l.m154715b();
            }
            searchScanView6.mo72773a();
        }
        C42891n nVar = new C42891n(this);
        AbstractC23317a aVar = null;
        if (C41939a.f97819a.mo71095b()) {
            SearchScanView searchScanView7 = this.f99983F;
            if (searchScanView7 != null) {
                searchScanView7.setVisibility(8);
            }
            SearchScanView searchScanView8 = this.f99984G;
            if (searchScanView8 != null) {
                searchScanView8.setVisibility(8);
            }
            Context context2 = getContext();
            if (context2 != null) {
                C22999a a = C23005c.m43393a(C42882f.f100019a);
                TuxIconView tuxIconView = new TuxIconView(context2, null, 0, 6);
                tuxIconView.setTuxIcon(a);
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                tuxIconView.setLayoutParams(new FrameLayout.LayoutParams(a2, C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics())), 8388613));
                C17235c.m31810a(tuxIconView, 0.5f);
                tuxIconView.setOnClickListener(new View$OnClickListenerC42881e(nVar));
                FrameLayout frameLayout = this.f99982E;
                if (frameLayout != null) {
                    frameLayout.addView(tuxIconView);
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    C23163i.m43668b(frameLayout, null, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system3.getDisplayMetrics()))), null, false, 27);
                    this.f100002aa = tuxIconView;
                }
            }
        } else {
            SearchScanView searchScanView9 = this.f99983F;
            if (searchScanView9 == null) {
                C89219l.m154715b();
            }
            searchScanView9.setOnInternalClickListener(nVar);
            SearchScanView searchScanView10 = this.f99984G;
            if (searchScanView10 == null) {
                C89219l.m154715b();
            }
            searchScanView10.setOnInternalClickListener(nVar);
        }
        ImageView imageView2 = this.f99985H;
        if (imageView2 == null) {
            C89219l.m154715b();
        }
        imageView2.setOnClickListener(new View$OnClickListenerC42886j(this));
        if (m85610K()) {
            ImageView imageView3 = this.f99985H;
            if (imageView3 == null) {
                C89219l.m154715b();
            }
            imageView3.setVisibility(8);
            ImageView imageView4 = this.f99635j;
            C89219l.m154716b(imageView4, "");
            imageView4.setVisibility(8);
        } else if (m85611L()) {
            ImageView imageView5 = this.f99985H;
            if (imageView5 == null) {
                C89219l.m154715b();
            }
            imageView5.setVisibility(0);
            ImageView imageView6 = this.f99635j;
            C89219l.m154716b(imageView6, "");
            imageView6.setVisibility(8);
        } else {
            ImageView imageView7 = this.f99985H;
            if (imageView7 == null) {
                C89219l.m154715b();
            }
            imageView7.setVisibility(8);
            ImageView imageView8 = this.f99635j;
            C89219l.m154716b(imageView8, "");
            imageView8.setVisibility(0);
        }
        boolean a3 = C41939a.m83976a();
        if (m85610K() && !a3) {
            FrameLayout frameLayout2 = this.f99982E;
            if (frameLayout2 == null) {
                C89219l.m154715b();
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int b = (int) C13628n.m24520b(getContext(), 16.0f);
                marginLayoutParams.leftMargin = b;
                int i = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(b);
                marginLayoutParams.setMarginEnd(0);
                FrameLayout frameLayout3 = this.f99982E;
                if (frameLayout3 == null) {
                    C89219l.m154715b();
                }
                frameLayout3.setLayoutParams(marginLayoutParams);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(4532);
                throw nullPointerException;
            }
        }
        if (C41939a.m83976a() && (view2 = this.f99990M) != null) {
            view2.setVisibility(0);
            C17235c.m31810a(view2, 0.5f);
            view2.setOnClickListener(new View$OnClickListenerC42884h(view2, this));
        }
        if (!C41939a.m83976a()) {
            view = null;
        } else {
            view = this.f99990M;
        }
        View view3 = this.f100002aa;
        if (view3 == null) {
            if (m85610K()) {
                view3 = this.f99984G;
                if (view3 == null) {
                    C89219l.m154715b();
                }
            } else {
                view3 = this.f99983F;
                if (view3 == null) {
                    C89219l.m154715b();
                }
            }
        }
        Context context3 = getContext();
        ViewGroup viewGroup2 = this.f99981D;
        if (viewGroup2 == null) {
            C89219l.m154715b();
        }
        ImageView imageView9 = this.f99635j;
        C89219l.m154716b(imageView9, "");
        if (m85611L()) {
            imageView = this.f99985H;
            if (imageView == null) {
                C89219l.m154715b();
            }
        } else {
            imageView = this.f99635j;
        }
        C89219l.m154716b(imageView, "");
        TextView textView = this.f99634e;
        C89219l.m154716b(textView, "");
        FrameLayout frameLayout4 = this.f99982E;
        if (frameLayout4 == null) {
            C89219l.m154715b();
        }
        C42052u uVar = new C42052u(context3, viewGroup2, view3, imageView9, imageView, textView, frameLayout4);
        uVar.f98035d = !m85610K();
        uVar.f98036e = m85611L();
        uVar.f98037f = true;
        uVar.f98038g = m85610K();
        uVar.f98040i = view;
        C42885i iVar = new C42885i(this);
        C89219l.m154721d(iVar, "");
        uVar.f98039h.add(iVar);
        this.f99994S = uVar;
        if (C80580in.m139687c()) {
            C34729o.m70955a(this.f99986I, 8);
            if (this.f99631b != null) {
                EditText editText = this.f99631b;
                C89219l.m154716b(editText, "");
                editText.setCursorVisible(false);
                EditText editText2 = this.f99631b;
                C89219l.m154716b(editText2, "");
                editText2.setFocusable(false);
                EditText editText3 = this.f99631b;
                C89219l.m154716b(editText3, "");
                editText3.setFocusableInTouchMode(false);
                this.f99631b.setOnClickListener(new View$OnClickListenerC42889l(this));
            }
            if (!(this.f99982E == null || getContext() == null)) {
                FrameLayout frameLayout5 = this.f99982E;
                if (frameLayout5 == null) {
                    C89219l.m154715b();
                }
                ViewGroup.LayoutParams layoutParams2 = frameLayout5.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.rightMargin = (int) C13628n.m24520b(getContext(), 16.0f);
                    layoutParams3.leftMargin = (int) C13628n.m24520b(getContext(), 16.0f);
                    int i2 = Build.VERSION.SDK_INT;
                    int b2 = (int) C13628n.m24520b(getContext(), 16.0f);
                    layoutParams3.setMarginEnd(b2);
                    layoutParams3.setMarginStart(b2);
                    FrameLayout frameLayout6 = this.f99982E;
                    if (frameLayout6 == null) {
                        C89219l.m154715b();
                    }
                    frameLayout6.setLayoutParams(layoutParams2);
                }
            }
        } else {
            m85612M();
        }
        if (onCreateView != null) {
            onCreateView.setBackground(null);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (this.f100009ah == null) {
            this.f100009ah = new SparseArray();
        }
        View view4 = (View) this.f100009ah.get(R.id.fgn);
        if (view4 == null) {
            View view5 = getView();
            if (view5 == null) {
                view4 = null;
            } else {
                view4 = view5.findViewById(R.id.fgn);
                this.f100009ah.put(R.id.fgn, view4);
            }
        }
        BannerViewPager bannerViewPager = (BannerViewPager) view4;
        if (bannerViewPager != null) {
            bannerViewPager.setBackground(null);
        }
        TabLayout tabLayout = this.f99988K;
        if (tabLayout != null) {
            tabLayout.setBackground(null);
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            mainBottomTabView = (MainBottomTabView) activity.findViewById(R.id.ci0);
        } else {
            mainBottomTabView = null;
        }
        this.f99997V = mainBottomTabView;
        if (mainBottomTabView == null || (context = mainBottomTabView.getContext()) == null) {
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            MethodCollector.m26664o(4532);
            throw nullPointerException2;
        }
        AbstractC53316a aVar2 = (AbstractC53316a) HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context).mo89739b("HOME");
        if (!(this.f100008ag == null || aVar2 == null)) {
            Context context4 = this.f100008ag;
            if (context4 == null) {
                C89219l.m154715b();
            }
            C23329a aVar3 = (C23329a) new C23329a(context4).mo38041b(aVar2);
            Context context5 = this.f100008ag;
            if (context5 == null) {
                C89219l.m154715b();
            }
            String string = context5.getResources().getString(R.string.b7n);
            C89219l.m154716b(string, "");
            AbstractC23332b a4 = aVar3.mo38022a(string).mo38027a().mo38034a(EnumC23352h.TOP).mo38030a(5000L).mo38036a(false).mo38037a(true, (View.OnClickListener) null);
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            C23329a aVar4 = (C23329a) a4.mo38039b(C89241a.m154730a(TypedValue.applyDimension(1, 3.0f, system4.getDisplayMetrics()))).mo38042b(new C42892o(aVar2)).mo38035a(C42893p.f100033a);
            this.f99998W = aVar4;
            if (aVar4 != null) {
                aVar = aVar4.mo38012d();
            }
            this.f99999X = aVar;
        }
        MethodCollector.m26664o(4532);
        return onCreateView;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
