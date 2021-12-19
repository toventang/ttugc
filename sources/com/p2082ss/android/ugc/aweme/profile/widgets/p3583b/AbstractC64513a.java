package com.p2082ss.android.ugc.aweme.profile.widgets.p3583b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33595ak;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2636h.C39122a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.metrics.C59219an;
import com.p2082ss.android.ugc.aweme.music.C60797g;
import com.p2082ss.android.ugc.aweme.music.assem.C60395c;
import com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.p2082ss.android.ugc.aweme.profile.effect.C63713e;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63753j;
import com.p2082ss.android.ugc.aweme.profile.model.PrivateTab;
import com.p2082ss.android.ugc.aweme.profile.model.TabSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64119cp;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64120cq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.SwipableViewPager;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.p2082ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68570bv;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a */
public abstract class AbstractC64513a extends AbstractC12769a implements MusProfileNavigator.AbstractC63898a, AbstractC64522c, AbstractC90252i, AbstractC90253j {

    /* renamed from: w */
    public static final C64514a f146180w = new C64514a((byte) 0);

    /* renamed from: A */
    private AbstractC63985aq.AbstractC63986a f146181A = new C64517d(this);

    /* renamed from: B */
    private long f146182B = -1;

    /* renamed from: j */
    public final String f146183j = new StringBuilder("android:switcher:2131367907:").toString();

    /* renamed from: k */
    public List<AbstractC64118co> f146184k;

    /* renamed from: l */
    public List<Integer> f146185l;

    /* renamed from: m */
    public DampScrollableLayout f146186m;

    /* renamed from: n */
    public C64117cn<AbstractC64118co> f146187n;

    /* renamed from: o */
    public int f146188o;

    /* renamed from: p */
    int f146189p;

    /* renamed from: q */
    public boolean f146190q;

    /* renamed from: r */
    public View f146191r;

    /* renamed from: s */
    protected MusProfileNavigator f146192s;

    /* renamed from: t */
    protected SwipableViewPager f146193t;

    /* renamed from: u */
    protected ProfileViewModel f146194u;

    /* renamed from: v */
    public float f146195v;

    /* renamed from: x */
    private final User f146196x;

    /* renamed from: y */
    private final String f146197y;

    /* renamed from: z */
    private final String f146198z;

    static {
        Covode.recordClassIndex(75977);
    }

    /* renamed from: g */
    private static int m116401g(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 6;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return 7;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            default:
                return -1;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 10;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 13;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 12;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return 14;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return 16;
        }
    }

    /* renamed from: h */
    private static boolean m116402h(int i) {
        return i == 0 || i == 2;
    }

    /* renamed from: D */
    public abstract boolean mo104084D();

    /* renamed from: G */
    public boolean mo104087G() {
        return false;
    }

    /* renamed from: K */
    public boolean mo104091K() {
        return true;
    }

    /* renamed from: e */
    public abstract void mo104103e(int i);

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(69, new RunnableC90250g(AbstractC64513a.class, "onNeedScrollToTop", C64120cq.class, ThreadMode.POSTING, 0, false));
        hashMap.put(70, new RunnableC90250g(AbstractC64513a.class, "onProfilePageScrollToPosition", C64119cp.class, ThreadMode.POSTING, 0, false));
        hashMap.put(71, new RunnableC90250g(AbstractC64513a.class, "onUpdateWhoCanSeeMyLikeListModeEvent", C68570bv.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public abstract String mo104108v();

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$a */
    public static final class C64514a {
        static {
            Covode.recordClassIndex(75978);
        }

        private C64514a() {
        }

        public /* synthetic */ C64514a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public AbstractC63985aq.AbstractC63986a mo104086F() {
        return this.f146181A;
    }

    /* renamed from: w */
    public User mo104109w() {
        return this.f146196x;
    }

    /* renamed from: x */
    public String mo104110x() {
        return this.f146197y;
    }

    /* renamed from: y */
    public String mo104111y() {
        return this.f146198z;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$e */
    public static final class C64518e implements ScrollableLayout.AbstractC39210b {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146203a;

        static {
            Covode.recordClassIndex(75982);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        public final boolean av_() {
            return this.f146203a.mo104084D();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64518e(AbstractC64513a aVar) {
            this.f146203a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: a */
        public final void mo62628a(float f, float f2) {
            List<AbstractC64118co> list;
            if (this.f146203a.f31048h && (list = this.f146203a.f146184k) != null && !list.isEmpty() && this.f146203a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout = this.f146203a.f146186m;
                if (dampScrollableLayout == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
        /* renamed from: b */
        public final void mo62635b(int i, int i2) {
            float f;
            float f2;
            if (this.f146203a.f146195v == 0.0f) {
                AbstractC64513a aVar = this.f146203a;
                View view = aVar.f146191r;
                if (view != null) {
                    f2 = (float) view.getBottom();
                } else {
                    DampScrollableLayout dampScrollableLayout = this.f146203a.f146186m;
                    if (dampScrollableLayout != null) {
                        f = (float) dampScrollableLayout.getTabsMarginTop();
                    } else {
                        f = 0.0f;
                    }
                    f2 = 0.0f - f;
                }
                aVar.f146195v = f2;
            }
            List<AbstractC64118co> list = this.f146203a.f146184k;
            if (list != null && !list.isEmpty() && this.f146203a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout2 = this.f146203a.f146186m;
                if (dampScrollableLayout2 == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout2.setCanScrollUp(true);
            }
        }
    }

    /* renamed from: L */
    public final void mo104092L() {
        m116404j(0);
    }

    /* renamed from: M */
    public final void mo104093M() {
        m116404j(1);
    }

    /* renamed from: P */
    private int mo104115P() {
        List<Integer> list = this.f146185l;
        if (list == null) {
            return -1;
        }
        return list.indexOf(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final SwipableViewPager mo104081A() {
        SwipableViewPager swipableViewPager = this.f146193t;
        if (swipableViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        return swipableViewPager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final ProfileViewModel mo104082B() {
        ProfileViewModel profileViewModel = this.f146194u;
        if (profileViewModel == null) {
            C89219l.m154710a("mProfileViewModel");
        }
        return profileViewModel;
    }

    /* renamed from: C */
    public final void mo104083C() {
        DampScrollableLayout dampScrollableLayout = this.f146186m;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.setMinY(0);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final MusProfileNavigator mo104112z() {
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        return musProfileNavigator;
    }

    /* renamed from: I */
    public final void mo104089I() {
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        if (musProfileNavigator.getTabCount() <= 1) {
            mo104130c(false);
        } else {
            mo104130c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo104090J() {
        if (mo104109w() == null) {
            return false;
        }
        User w = mo104109w();
        if (w == null) {
            C89219l.m154715b();
        }
        if (w.getShowArtistPlaylist() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64522c
    /* renamed from: O */
    public final void mo104095O() {
        AbstractC64118co coVar;
        List<AbstractC64118co> list = this.f146184k;
        if (list != null) {
            coVar = list.get(this.f146188o);
        } else {
            coVar = null;
        }
        if (coVar instanceof AbstractC63990as) {
            ((AbstractC63990as) coVar).mo98052k();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            this.f146194u = ProfileViewModel.C64397a.m116300a(a);
        }
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$b */
    static final class RunnableC64515b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146199a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f146200b;

        static {
            Covode.recordClassIndex(75979);
        }

        RunnableC64515b(AbstractC64513a aVar, C89233z.C89236c cVar) {
            this.f146199a = aVar;
            this.f146200b = cVar;
        }

        public final void run() {
            boolean z;
            C64117cn<AbstractC64118co> cnVar = this.f146199a.f146187n;
            if (cnVar == null) {
                C89219l.m154715b();
            }
            int count = cnVar.getCount();
            for (int i = 0; i < count; i++) {
                View a = this.f146199a.mo104112z().mo103435a(i);
                if (a != null) {
                    if (i == this.f146200b.element) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a.setSelected(z);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$g */
    public static final class CallableC64520g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146205a;

        /* renamed from: b */
        final /* synthetic */ String f146206b;

        /* renamed from: c */
        final /* synthetic */ long f146207c;

        /* renamed from: d */
        final /* synthetic */ int f146208d;

        static {
            Covode.recordClassIndex(75984);
        }

        CallableC64520g(AbstractC64513a aVar, String str, long j, int i) {
            this.f146205a = aVar;
            this.f146206b = str;
            this.f146207c = j;
            this.f146208d = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C59219an a = new C59219an().mo96761a(this.f146206b);
            a.f134910a = String.valueOf(this.f146207c);
            a.mo96801c(this.f146205a.mo104102d(this.f146208d)).mo96792f();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo104085E() {
        SwipableViewPager swipableViewPager = this.f146193t;
        if (swipableViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        if (swipableViewPager.getCurrentItem() != mo104115P() && mo104115P() != -1) {
            SwipableViewPager swipableViewPager2 = this.f146193t;
            if (swipableViewPager2 == null) {
                C89219l.m154710a("viewPager");
            }
            swipableViewPager2.setCurrentItem(mo104115P(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo104088H() {
        boolean z;
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        C33594aj<Integer> c = sVar.mo60059c();
        C89219l.m154716b(c, "");
        Integer c2 = c.mo59941c();
        if ((c2 != null && c2.intValue() == 0) || !C80580in.m139694g(mo104109w())) {
            z = true;
        } else {
            z = false;
        }
        mo104100b(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final C63713e mo104094N() {
        Fragment fragment;
        AbstractC0952i childFragmentManager;
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a == null || (childFragmentManager = a.getChildFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = childFragmentManager.mo3551a(this.f146183j + 4);
        }
        if (fragment instanceof C63713e) {
            return (C63713e) fragment;
        }
        String x = mo104110x();
        String y = mo104111y();
        boolean G = mo104087G();
        C63713e eVar = new C63713e();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", x);
        bundle.putString("sec_user_id", y);
        bundle.putBoolean("is_me", G);
        eVar.setArguments(bundle);
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$c */
    public static final class C64516c implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146201a;

        static {
            Covode.recordClassIndex(75980);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64516c(AbstractC64513a aVar) {
            this.f146201a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f146201a.mo104101c(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            AbstractC64513a aVar = this.f146201a;
            if (f != 0.0f) {
                aVar.f146189p = C13628n.m24504a(aVar.az_()) / 3;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$d */
    public static final class C64517d implements AbstractC63985aq.AbstractC63986a {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146202a;

        static {
            Covode.recordClassIndex(75981);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64517d(AbstractC64513a aVar) {
            this.f146202a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63986a
        /* renamed from: a */
        public final void mo103567a(int i) {
            if (this.f146202a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout = this.f146202a.f146186m;
                if (dampScrollableLayout == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0) {
                this.f146202a.mo104082B().mo104033c(false);
                this.f146202a.mo104082B().mo104030a(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq.AbstractC63986a
        /* renamed from: a */
        public final void mo103568a(boolean z, int i) {
            if (this.f146202a.f146186m != null) {
                DampScrollableLayout dampScrollableLayout = this.f146202a.f146186m;
                if (dampScrollableLayout == null) {
                    C89219l.m154715b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i == 0) {
                this.f146202a.mo104082B().mo104033c(true);
                this.f146202a.mo104082B().mo104030a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$f */
    static final class C64519f extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC64513a f146204a;

        static {
            Covode.recordClassIndex(75983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64519f(AbstractC64513a aVar) {
            super(1);
            this.f146204a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                AbstractC64513a aVar3 = this.f146204a;
                t.getAwemeCount();
                aVar3.mo104092L();
                AbstractC64513a aVar4 = this.f146204a;
                t.getFavoritingCount();
                aVar4.mo104093M();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void mo104130c(boolean z) {
        int i;
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        musProfileNavigator.setVisibility(i);
    }

    /* renamed from: j */
    private final void m116404j(int i) {
        if (this.f31048h && C80580in.m139685b(mo104109w(), C80580in.m139694g(mo104109w()))) {
            m116403i(i);
        }
    }

    /* renamed from: a */
    private static List<Integer> m116396a(List<Integer> list) {
        C89219l.m154721d(list, "");
        List<Integer> g = C89070n.m154585g((Collection) list);
        if (g.contains(12) && g.size() >= 2) {
            g.remove(list.indexOf(12));
            g.add(1, 12);
        }
        return g;
    }

    /* renamed from: b */
    private static List<Integer> mo104129b(String str) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (TextUtils.equals(str, g.getCurUserId())) {
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33595ak<Integer> w = sVar.mo60079w();
            C89219l.m154716b(w, "");
            return w.mo59941c();
        }
        C33842s sVar2 = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar2, "");
        C33595ak<Integer> x = sVar2.mo60080x();
        C89219l.m154716b(x, "");
        return x.mo59941c();
    }

    /* renamed from: c */
    private static int m116399c(User user) {
        int i;
        if (!(user == null || user.getTabSetting() == null)) {
            TabSetting tabSetting = user.getTabSetting();
            C89219l.m154716b(tabSetting, "");
            if (tabSetting.getPrivateTab() != null) {
                TabSetting tabSetting2 = user.getTabSetting();
                C89219l.m154716b(tabSetting2, "");
                PrivateTab privateTab = tabSetting2.getPrivateTab();
                C89219l.m154716b(privateTab, "");
                i = privateTab.getPrivateTabStyle();
                if (i <= 0 || i > 3) {
                    return 1;
                }
                return i;
            }
        }
        i = 1;
        return i;
    }

    /* renamed from: i */
    private final void m116403i(int i) {
        int i2;
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        List<Integer> list = this.f146185l;
        if (list != null) {
            i2 = list.indexOf(Integer.valueOf(i));
        } else {
            i2 = 0;
        }
        View a = musProfileNavigator.mo103435a(i2);
        if (a != null) {
            a.setClickable(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo104102d(int i) {
        List<Integer> list = this.f146185l;
        if (list == null || list.isEmpty()) {
            return "";
        }
        List<Integer> list2 = this.f146185l;
        if (list2 == null) {
            C89219l.m154715b();
        }
        if (i >= list2.size()) {
            return "";
        }
        List<Integer> list3 = this.f146185l;
        if (list3 == null) {
            C89219l.m154715b();
        }
        return C80541ho.m139617a(list3.get(i).intValue());
    }

    @AbstractC90264r
    public void onProfilePageScrollToPosition(C64119cp cpVar) {
        boolean z;
        C89219l.m154721d(cpVar, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || !C80580in.m139694g(mo104109w())) {
            z = false;
        } else {
            z = true;
        }
        DampScrollableLayout dampScrollableLayout = this.f146186m;
        if (dampScrollableLayout != null && z == cpVar.f145461a) {
            dampScrollableLayout.mo68058a(cpVar.f145462b);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(C68570bv bvVar) {
        User w = mo104109w();
        if (w == null) {
            C89219l.m154715b();
        }
        String uid = w.getUid();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (TextUtils.equals(uid, g.getCurUserId())) {
            mo104088H();
        }
    }

    /* renamed from: a */
    private final void mo104116a(String str) {
        List g;
        List<Integer> b = mo104129b(str);
        if (!(b == null || (g = C89070n.m154585g((Collection) b)) == null)) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                if (!m116402h(((Number) it.next()).intValue())) {
                    it.remove();
                }
            }
            List<Integer> a = m116396a(g);
            if (a != null) {
                this.f146184k = new ArrayList(a.size());
                this.f146185l = new ArrayList(a.size());
                for (Integer num : a) {
                    mo104103e(num.intValue());
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator.AbstractC63898a
    /* renamed from: b */
    public void mo103446b(int i) {
        String str;
        String a = C80541ho.m139617a(i);
        if (mo104087G()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C39162r.m79460a("change_profile_tab", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "click").mo59983a("tab_name", a).f79943a);
        this.f146190q = true;
    }

    @AbstractC90264r
    public void onNeedScrollToTop(C64120cq cqVar) {
        boolean z;
        C89219l.m154721d(cqVar, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || !C80580in.m139694g(mo104109w())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f146186m != null && z == cqVar.f145463a) {
            DampScrollableLayout dampScrollableLayout = this.f146186m;
            if (dampScrollableLayout == null) {
                C89219l.m154715b();
            }
            C39122a.m79418a(dampScrollableLayout, new C89378p(Float.valueOf(1.0f), Float.valueOf(1.0f)), new C89378p(Float.valueOf(1.0f), Float.valueOf(-3000.0f)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tab.MusProfileNavigator.AbstractC63898a
    /* renamed from: a */
    public final void mo103445a(int i) {
        String str;
        String a = C80541ho.m139617a(i);
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        C63786o.f144581a = a;
        if (this.f146190q) {
            this.f146190q = false;
            return;
        }
        if (mo104087G()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C39162r.m79460a("change_profile_tab", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "slide").mo59983a("tab_name", a).f79943a);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public void mo20630b(View view) {
        AbstractC0952i iVar;
        View view2;
        C89219l.m154721d(view, "");
        this.f146186m = (DampScrollableLayout) view.findViewById(R.id.dq9);
        this.f146191r = view.findViewById(R.id.d7p);
        if (C80580in.m139687c() && (view2 = this.f146191r) != null) {
            view2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        DampScrollableLayout dampScrollableLayout = this.f146186m;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.setLayoutParams(layoutParams);
        }
        DampScrollableLayout dampScrollableLayout2 = this.f146186m;
        if (dampScrollableLayout2 != null) {
            dampScrollableLayout2.setOnScrollListener(new C64518e(this));
        }
        View findViewById = view.findViewById(R.id.d9d);
        C89219l.m154716b(findViewById, "");
        this.f146192s = (MusProfileNavigator) findViewById;
        View findViewById2 = view.findViewById(R.id.dqe);
        C89219l.m154716b(findViewById2, "");
        SwipableViewPager swipableViewPager = (SwipableViewPager) findViewById2;
        this.f146193t = swipableViewPager;
        if (swipableViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        swipableViewPager.setOffscreenPageLimit(2);
        if (mo104109w() == null) {
            mo104116a(mo104110x());
        } else {
            mo104096a(mo104109w());
        }
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            iVar = a.getChildFragmentManager();
        } else {
            iVar = null;
        }
        this.f146187n = new C64117cn<>(iVar, this.f146184k, this.f146185l);
        SwipableViewPager swipableViewPager2 = this.f146193t;
        if (swipableViewPager2 == null) {
            C89219l.m154710a("viewPager");
        }
        swipableViewPager2.setAdapter(this.f146187n);
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        SwipableViewPager swipableViewPager3 = this.f146193t;
        if (swipableViewPager3 == null) {
            C89219l.m154710a("viewPager");
        }
        mo104090J();
        musProfileNavigator.mo103437a(swipableViewPager3, mo104087G(), this);
        mo104101c(this.f146188o);
        SwipableViewPager swipableViewPager4 = this.f146193t;
        if (swipableViewPager4 == null) {
            C89219l.m154710a("viewPager");
        }
        swipableViewPager4.setCurrentItem(this.f146188o);
        SwipableViewPager swipableViewPager5 = this.f146193t;
        if (swipableViewPager5 == null) {
            C89219l.m154710a("viewPager");
        }
        swipableViewPager5.addOnPageChangeListener(new C64516c(this));
        mo104088H();
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64521b.f146209a, new C64519f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final AbstractC64118co mo104104f(int i) {
        AbstractC0952i childFragmentManager;
        Fragment a;
        Fragment a2 = C12777b.m22999a((AbstractC1204m) this);
        if (a2 != null && (childFragmentManager = a2.getChildFragmentManager()) != null && (a = childFragmentManager.mo3551a(this.f146183j + 0)) != null && ((a instanceof C60797g) || (a instanceof C60395c))) {
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileListFragment");
            return (AbstractC64118co) a;
        } else if (C16048b.m29633a().mo25421a(true, "enable_refactor_origin_music", true)) {
            C60395c cVar = new C60395c();
            RouteArgExtension.INSTANCE.withNavArg(cVar, new OriginMusicArg(mo104087G(), mo104110x(), mo104111y(), i, mo104108v()));
            return cVar;
        } else {
            String x = mo104110x();
            String y = mo104111y();
            boolean G = mo104087G();
            C60797g gVar = new C60797g();
            Bundle bundle = new Bundle();
            bundle.putString("user_id", x);
            bundle.putString("sec_user_id", y);
            bundle.putBoolean("is_me", G);
            gVar.setArguments(bundle);
            C89219l.m154716b(gVar, "");
            return gVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo104096a(User user) {
        int privateTabStyle;
        boolean isShowEffectList;
        String str = null;
        if (user != null) {
            str = user.getUid();
        }
        List<Integer> b = mo104129b(str);
        if (b != null) {
            List g = C89070n.m154585g((Collection) b);
            Iterator it = g.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 10) {
                                if (intValue != 12) {
                                    if (user != null) {
                                        user.getUid();
                                    }
                                    isShowEffectList = m116402h(intValue);
                                } else if (!(user == null || user.getTabSetting() == null || user.getTabSetting().shopTab == null || !user.getTabSetting().shopTab.showShopTab)) {
                                }
                            } else if (m116399c(user) != 2) {
                                if (m116399c(user) == 3) {
                                }
                            }
                        } else if (user != null) {
                            isShowEffectList = user.isShowEffectList();
                        }
                        if (isShowEffectList) {
                        }
                    } else if (user != null && user.getShowArtistPlaylist() == 1) {
                    }
                } else if (!C80580in.m139694g(user)) {
                    if (!C68432f.f153189a.mo108870f()) {
                    }
                } else if (!(user == null || user.getTabSetting() == null)) {
                    TabSetting tabSetting = user.getTabSetting();
                    C89219l.m154716b(tabSetting, "");
                    if (!tabSetting.isHideLikeTab()) {
                    }
                }
                it.remove();
            }
            List<Integer> a = m116396a(g);
            if (a != null) {
                if (C80580in.m139694g(user)) {
                    boolean contains = a.contains(10);
                    if (contains && user != null && user.getTabSetting() != null && user.getTabSetting().getPrivateTab() != null && (privateTabStyle = user.getTabSetting().getPrivateTab().getPrivateTabStyle()) > 0 && privateTabStyle <= 3 && privateTabStyle == 3) {
                        int lastIndexOf = a.lastIndexOf(2);
                        int lastIndexOf2 = a.lastIndexOf(10);
                        if (!(lastIndexOf == -1 || lastIndexOf2 == -1)) {
                            a.set(lastIndexOf, 10);
                            a.set(lastIndexOf2, 2);
                        }
                    }
                    C63753j.f144516a = contains;
                }
                ArrayList arrayList = new ArrayList();
                List<AbstractC64118co> list = this.f146184k;
                if (list == null) {
                    this.f146184k = new ArrayList(a.size());
                } else {
                    arrayList.addAll(list);
                    List<AbstractC64118co> list2 = this.f146184k;
                    if (list2 != null) {
                        list2.clear();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List<Integer> list3 = this.f146185l;
                if (list3 == null) {
                    this.f146185l = new ArrayList(a.size());
                } else {
                    arrayList2.addAll(list3);
                    List<Integer> list4 = this.f146185l;
                    if (list4 != null) {
                        list4.clear();
                    }
                }
                for (Integer num : a) {
                    int intValue2 = num.intValue();
                    if (arrayList2.contains(Integer.valueOf(m116401g(intValue2)))) {
                        int indexOf = arrayList2.indexOf(Integer.valueOf(m116401g(intValue2)));
                        mo104097a((AbstractC64118co) arrayList.get(indexOf), (Integer) arrayList2.get(indexOf));
                    } else {
                        mo104103e(intValue2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo104099b(User user) {
        int tabType;
        if (user != null) {
            C89233z.C89236c cVar = new C89233z.C89236c();
            List<Integer> list = this.f146185l;
            if (list == null) {
                C89219l.m154715b();
            }
            if (C80580in.m139685b(user, TextUtils.equals(user.getUid(), C31575b.m65865g().getCurUserId()))) {
                tabType = 0;
            } else {
                tabType = user.getTabType();
            }
            cVar.element = list.indexOf(Integer.valueOf(m116401g(tabType)));
            if (cVar.element < 0) {
                cVar.element = 0;
            }
            C64117cn<AbstractC64118co> cnVar = this.f146187n;
            if (cnVar == null) {
                C89219l.m154715b();
            }
            cVar.element = Math.min(cnVar.getCount() - 1, cVar.element);
            SwipableViewPager swipableViewPager = this.f146193t;
            if (swipableViewPager == null) {
                C89219l.m154710a("viewPager");
            }
            if (swipableViewPager.getCurrentItem() != cVar.element) {
                SwipableViewPager swipableViewPager2 = this.f146193t;
                if (swipableViewPager2 == null) {
                    C89219l.m154710a("viewPager");
                }
                swipableViewPager2.setCurrentItem(cVar.element, false);
            }
            mo104101c(cVar.element);
            MusProfileNavigator musProfileNavigator = this.f146192s;
            if (musProfileNavigator == null) {
                C89219l.m154710a("navigator");
            }
            musProfileNavigator.post(new RunnableC64515b(this, cVar));
        }
    }

    /* renamed from: c */
    public void mo104101c(int i) {
        boolean z;
        C39211a helper;
        String str;
        List<AbstractC64118co> list = this.f146184k;
        if (list != null && i >= 0 && i < list.size() && this.f146186m != null) {
            int i2 = this.f146188o;
            if (i != i2 && i2 >= 0) {
                List<AbstractC64118co> list2 = this.f146184k;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                if (i2 < list2.size()) {
                    List<AbstractC64118co> list3 = this.f146184k;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    list3.get(this.f146188o).setUserVisibleHint(false);
                }
            }
            if (this.f146182B > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f146182B;
                if (currentTimeMillis > 0) {
                    if (mo104087G()) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    C1731i.m5640b(new CallableC64520g(this, str, currentTimeMillis, this.f146188o), C39162r.m79452a());
                }
                this.f146182B = -1;
            }
            this.f146188o = i;
            ProfileViewModel profileViewModel = this.f146194u;
            if (profileViewModel == null) {
                C89219l.m154710a("mProfileViewModel");
            }
            List<Integer> list4 = this.f146185l;
            if (list4 == null) {
                C89219l.m154715b();
            }
            profileViewModel.mo33689c(new ProfileViewModel.C64400b(list4.get(this.f146188o).intValue()));
            this.f146182B = System.currentTimeMillis();
            DampScrollableLayout dampScrollableLayout = this.f146186m;
            if (!(dampScrollableLayout == null || (helper = dampScrollableLayout.getHelper()) == null)) {
                List<AbstractC64118co> list5 = this.f146184k;
                if (list5 == null) {
                    C89219l.m154715b();
                }
                helper.f92631b = list5.get(i);
            }
            DampScrollableLayout dampScrollableLayout2 = this.f146186m;
            if (dampScrollableLayout2 != null) {
                dampScrollableLayout2.setCanScrollUp(true);
            }
            if (i == 0) {
                if (mo104091K()) {
                    az_();
                    C39162r.m79454a("slide_left", "personal_homepage", 0);
                }
            } else if (i == 1) {
                if (mo104091K()) {
                    az_();
                    C39162r.m79454a("slide_right", "personal_homepage", 0);
                }
            } else if (i == 2 && mo104091K()) {
                az_();
                C39162r.m79454a("slide_right", "personal_homepage", 0);
            }
            C64117cn<AbstractC64118co> cnVar = this.f146187n;
            if (cnVar != null) {
                int count = cnVar.getCount();
                for (int i3 = 0; i3 < count; i3++) {
                    C64117cn<AbstractC64118co> cnVar2 = this.f146187n;
                    Fragment a = cnVar2 != null ? cnVar2.mo3639a(i3) : null;
                    if (!(a instanceof AbstractC64118co)) {
                        a = null;
                    }
                    AbstractC64118co coVar = (AbstractC64118co) a;
                    if (!(coVar == null || coVar.getFragmentManager() == null)) {
                        if (i3 == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        coVar.setUserVisibleHint(z);
                        coVar.mo65254g();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo104100b(boolean z) {
        int i;
        int i2;
        MusProfileNavigator musProfileNavigator = this.f146192s;
        if (musProfileNavigator == null) {
            C89219l.m154710a("navigator");
        }
        List<Integer> list = this.f146185l;
        if (list != null) {
            i = list.indexOf(1);
        } else {
            i = 0;
        }
        View a = musProfileNavigator.mo103435a(i);
        if (a instanceof MusProfileTabImageView) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) a;
            if (z) {
                i2 = R.raw.icon_3pt_heart;
            } else {
                i2 = R.raw.icon_3pt_heart_eye_slash;
            }
            musProfileTabImageView.setImageResource(i2);
        }
    }

    /* renamed from: a */
    public final void mo104098a(boolean z) {
        int i;
        List<AbstractC64118co> list;
        AbstractC64118co coVar;
        List<AbstractC64118co> list2 = this.f146184k;
        if (list2 != null && (i = this.f146188o) >= 0 && i < list2.size() && (list = this.f146184k) != null && (coVar = list.get(this.f146188o)) != null) {
            coVar.setUserVisibleHint(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo104097a(AbstractC64118co coVar, Integer num) {
        List<Integer> list = this.f146185l;
        if (list == null) {
            C89219l.m154715b();
        }
        if (C89070n.m154556a((Iterable) list, (Object) num)) {
            List<Integer> list2 = this.f146185l;
            if (list2 == null) {
                C89219l.m154715b();
            }
            int a = C89070n.m154546a((List) list2, (Object) num);
            List<AbstractC64118co> list3 = this.f146184k;
            if (list3 == null) {
                C89219l.m154715b();
            }
            list3.remove(a);
            List<Integer> list4 = this.f146185l;
            if (list4 == null) {
                C89219l.m154715b();
            }
            list4.remove(a);
        }
        List<AbstractC64118co> list5 = this.f146184k;
        if (list5 == null) {
            C89219l.m154715b();
        }
        if (coVar == null) {
            C89219l.m154715b();
        }
        list5.add(coVar);
        List<Integer> list6 = this.f146185l;
        if (list6 == null) {
            C89219l.m154715b();
        }
        if (num == null) {
            C89219l.m154715b();
        }
        list6.add(num);
    }
}
