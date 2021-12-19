package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.discover.helper.C41991ak;
import com.p2082ss.android.ugc.aweme.discover.helper.C41995al;
import com.p2082ss.android.ugc.aweme.discover.mob.C42447b;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73788q;
import com.p2082ss.android.ugc.aweme.utils.C80226at;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder */
public final class DiscoverBannerViewHolder extends JediSimpleViewHolder<DiscoverSectionItem> implements ViewPager.AbstractC1579e, AbstractC41729k, AbstractC42533a, AbstractC42533a {

    /* renamed from: j */
    public static final List<Banner> f96950j = C89070n.m154524c(new Banner());

    /* renamed from: k */
    public static final C41573b f96951k = new C41573b((byte) 0);

    /* renamed from: f */
    public final ViewPager f96952f;

    /* renamed from: g */
    public boolean f96953g;

    /* renamed from: l */
    private final TextView f96954l;

    /* renamed from: m */
    private final IndicatorView f96955m;

    /* renamed from: n */
    private final View f96956n;

    /* renamed from: o */
    private C41716d f96957o;

    /* renamed from: p */
    private final C41991ak f96958p;

    /* renamed from: q */
    private List<? extends Banner> f96959q = C89086z.INSTANCE;

    /* renamed from: r */
    private final Context f96960r;

    /* renamed from: s */
    private final AbstractC89244h f96961s;

    /* renamed from: t */
    private final AbstractC42533a f96962t;

    /* renamed from: m */
    private final TrendsTabViewModel m83504m() {
        return (TrendsTabViewModel) this.f96961s.getValue();
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$b */
    public static final class C41573b {
        static {
            Covode.recordClassIndex(49485);
        }

        private C41573b() {
        }

        public /* synthetic */ C41573b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a
    public final void bd_() {
        this.f96962t.bd_();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: h */
    public final void mo33830h() {
        super.mo33830h();
        mo70798a(false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
        withState(m83504m(), new C41577f(this));
    }

    static {
        Covode.recordClassIndex(49483);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$a */
    public static final class C41572a extends AbstractC89220m implements AbstractC89171a<TrendsTabViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f96963a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f96964b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f96965c;

        static {
            Covode.recordClassIndex(49484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41572a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f96963a = jediViewHolder;
            this.f96964b = cVar;
            this.f96965c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder.C41572a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_discover_adapter_DiscoverBannerViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m83512x96167c06(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$d */
    public static final class CallableC41575d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f96967a;

        /* renamed from: b */
        final /* synthetic */ Banner f96968b;

        /* renamed from: c */
        final /* synthetic */ String f96969c;

        static {
            Covode.recordClassIndex(49487);
        }

        CallableC41575d(int i, Banner banner, String str) {
            this.f96967a = i;
            this.f96968b = banner;
            this.f96969c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C39162r.onEvent(MobClick.obtain().setEventName("banner_show").setLabelName("discovery").setExtValueLong((long) this.f96967a).setValue(String.valueOf(this.f96968b.getCreativeId())));
            C39162r.m79460a("banner_show", new C42447b().setBannerId(this.f96968b.getBid()).setTagId(this.f96969c).setClientOrder(this.f96967a).buildParams());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$c */
    static final class C41574c extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DiscoverBannerViewHolder f96966a;

        static {
            Covode.recordClassIndex(49486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41574c(DiscoverBannerViewHolder discoverBannerViewHolder) {
            super(1);
            this.f96966a = discoverBannerViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden()) {
                this.f96966a.mo70798a(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo70798a(boolean z) {
        if (z) {
            this.f96958p.mo71161a();
            return;
        }
        this.f96958p.mo71162b();
        this.f96952f.setOnTouchListener(null);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageSelected(int i) {
        mo70797a(this.f96952f.getCurrentItem(), 4);
        withState(m83504m(), new C41576e(this, i));
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$e */
    static final class C41576e extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DiscoverBannerViewHolder f96970a;

        /* renamed from: b */
        final /* synthetic */ int f96971b;

        static {
            Covode.recordClassIndex(49488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41576e(DiscoverBannerViewHolder discoverBannerViewHolder, int i) {
            super(1);
            this.f96970a = discoverBannerViewHolder;
            this.f96971b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden() && this.f96970a.f96953g) {
                this.f96970a.mo70796a(this.f96971b);
                DiscoverBannerViewHolder discoverBannerViewHolder = this.f96970a;
                discoverBannerViewHolder.mo70797a(discoverBannerViewHolder.f96952f.getCurrentItem(), 3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder$f */
    static final class C41577f extends AbstractC89220m implements AbstractC89172b<TrendsTabState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DiscoverBannerViewHolder f96972a;

        static {
            Covode.recordClassIndex(49489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41577f(DiscoverBannerViewHolder discoverBannerViewHolder) {
            super(1);
            this.f96972a = discoverBannerViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TrendsTabState trendsTabState) {
            TrendsTabState trendsTabState2 = trendsTabState;
            C89219l.m154721d(trendsTabState2, "");
            if (!trendsTabState2.isTabHidden() && this.f96972a.f96953g) {
                DiscoverBannerViewHolder discoverBannerViewHolder = this.f96972a;
                discoverBannerViewHolder.mo70796a(discoverBannerViewHolder.f96952f.getCurrentItem());
                this.f96972a.mo70798a(true);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41729k
    /* renamed from: b */
    public final void mo70799b(boolean z) {
        this.f96953g = z;
        if (z && getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) >= 0) {
            mo70796a(this.f96952f.getCurrentItem());
            mo70798a(true);
        }
    }

    /* renamed from: a */
    public final void mo70796a(int i) {
        if (!this.f96959q.isEmpty()) {
            List<? extends Banner> list = this.f96959q;
            Banner banner = (Banner) list.get(i % list.size());
            List<? extends Banner> list2 = this.f96959q;
            C1731i.m5640b(new CallableC41575d((i % this.f96959q.size()) + 1, banner, C80226at.m139056a(((Banner) list2.get(i % list2.size())).getSchema())), C39162r.m79452a());
            if (banner.isAd()) {
                C38000g.m77050a().mo65876a(this.f96960r, banner, (i % this.f96959q.size()) + 1);
                if (C80580in.m139687c()) {
                    C33830n.m69192a("ftc_show_banner_ad", "", (JSONObject) null);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(DiscoverSectionItem discoverSectionItem) {
        int i;
        List<Banner> list;
        DiscoverSectionItem discoverSectionItem2 = discoverSectionItem;
        C89219l.m154721d(discoverSectionItem2, "");
        List<Banner> list2 = ((DiscoverSectionItem.BannerSection) discoverSectionItem2).bannerList;
        if (!C89219l.m154714a(list2, f96950j)) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            if (this.f96957o == null) {
                this.f96957o = new C41716d(this, context, LayoutInflater.from(context));
                this.f96952f.setAdapter(new C73788q(this.f96957o));
            }
            boolean a = C80471gb.m139483a(context);
            this.f96958p.f97928b = list2.size();
            C41716d dVar = this.f96957o;
            if (dVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(list2, "");
            if (dVar.f97322d != list2) {
                dVar.f97322d = list2;
                dVar.notifyDataSetChanged();
            }
            this.f96955m.setUpViewPager(this.f96952f);
            IndicatorView indicatorView = this.f96955m;
            if (list2.size() < 2) {
                i = 8;
            } else {
                i = 0;
            }
            indicatorView.setVisibility(i);
            if (a) {
                list = C89070n.m154584g((Iterable) list2);
            } else {
                list = list2;
            }
            this.f96959q = list;
            if (a) {
                this.f96952f.setCurrentItem((list2.size() * 10000) - 1);
            } else {
                this.f96952f.setCurrentItem(list2.size() * 10000);
            }
            withState(m83504m(), new C41574c(this));
        }
    }

    /* renamed from: a */
    public final void mo70797a(int i, int i2) {
        if (!this.f96959q.isEmpty()) {
            C39162r.m79460a("ads_banner_show_test", new C33744d().mo59980a("position", (i % this.f96959q.size()) + 1).mo59980a(StringSet.type, i2).f79943a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiscoverBannerViewHolder(AbstractC42533a aVar, View view) {
        super(view);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.evb);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f96954l = textView;
        View findViewById2 = view.findViewById(R.id.fgn);
        C89219l.m154716b(findViewById2, "");
        ViewPager viewPager = (ViewPager) findViewById2;
        this.f96952f = viewPager;
        View findViewById3 = view.findViewById(R.id.anu);
        C89219l.m154716b(findViewById3, "");
        IndicatorView indicatorView = (IndicatorView) findViewById3;
        this.f96955m = indicatorView;
        View findViewById4 = view.findViewById(R.id.e7_);
        C89219l.m154716b(findViewById4, "");
        this.f96956n = findViewById4;
        Context context = view.getContext();
        this.f96960r = context;
        this.f96953g = true;
        AbstractC89277c a = C89204ab.m154669a(TrendsTabViewModel.class);
        this.f96961s = C89250i.m154773a((AbstractC89171a) new C41572a(this, a, a));
        this.f96962t = aVar;
        if (C67446h.f151111a.mo106228q()) {
            C41995al.m84058a(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            RecyclerView.C1367j jVar = (RecyclerView.C1367j) (!(layoutParams instanceof RecyclerView.C1367j) ? null : layoutParams);
            if (jVar != null) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                jVar.leftMargin = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                jVar.rightMargin = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            }
        }
        C89219l.m154721d(textView, "");
        C89219l.m154721d(viewPager, "");
        int a2 = C13628n.m24504a(context);
        if (C67446h.f151111a.mo106228q()) {
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            a2 -= C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system3.getDisplayMetrics()));
        }
        a2 = MSAdaptionService.m97895c().mo89375b(context) ? (a2 >> 1) - 42 : a2;
        textView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = viewPager.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
        aVar2.height = (int) (((float) a2) * 0.48104957f);
        viewPager.setLayoutParams(aVar2);
        this.f96958p = new C41991ak(viewPager);
        int i = Build.VERSION.SDK_INT;
        findViewById4.getLayoutParams().height = C13628n.m24525e(view.getContext());
        viewPager.addOnPageChangeListener(this);
        C0792v.m2759b((View) indicatorView, 0);
    }
}
