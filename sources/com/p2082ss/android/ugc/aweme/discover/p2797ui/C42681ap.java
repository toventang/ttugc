package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.track.AbstractC22883b;
import com.bytedance.track.C22886c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractC41730l;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41635ak;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42465m;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.p2082ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41503ak;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41937p;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42619b;
import com.p2082ss.android.ugc.aweme.keyword.C57071b;
import com.p2082ss.android.ugc.aweme.keyword.SearchKeywordViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.model.SearchResultParamProvider;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67685a;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67686b;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67688c;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewController;
import com.p2082ss.android.ugc.aweme.search.survey.SurveyViewModel;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ap */
public class C42681ap extends AbstractC34586a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    protected C67678d f99536a;

    /* renamed from: b */
    public boolean f99537b = true;

    /* renamed from: c */
    ViewPager f99538c;

    /* renamed from: d */
    DmtTabLayout f99539d;

    /* renamed from: e */
    View f99540e;

    /* renamed from: j */
    ViewPager.AbstractC1579e f99541j;

    /* renamed from: k */
    public int f99542k;

    /* renamed from: l */
    boolean f99543l;

    /* renamed from: m */
    int f99544m;

    /* renamed from: n */
    int f99545n;

    /* renamed from: o */
    final ArgbEvaluator f99546o = new ArgbEvaluator();

    /* renamed from: p */
    public SurveyViewModel f99547p;

    /* renamed from: q */
    boolean f99548q = false;

    /* renamed from: r */
    public DmtTabLayout.AbstractC17289c f99549r;

    /* renamed from: s */
    private C41635ak<AbstractC42670am> f99550s;

    /* renamed from: t */
    private AnalysisStayTimeFragmentComponent f99551t;

    /* renamed from: u */
    private SearchIntermediateViewModel f99552u;

    /* renamed from: v */
    private SearchKeywordViewModel f99553v;

    /* renamed from: w */
    private ThemeViewModel f99554w;

    /* renamed from: y */
    private SurveyViewController f99555y;

    static {
        Covode.recordClassIndex(50785);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(294, new RunnableC90250g(C42681ap.class, "onSearchViewAllEvent", C41937p.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f99548q = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        return new Analysis().setLabelName("search");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo72892b() {
        if (this.f99543l) {
            return R.layout.av8;
        }
        return R.layout.av7;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C67592a.f151370c.mo106569a(2, "SearchContainerFragment#onDetach");
    }

    /* renamed from: c */
    public final void mo72895c() {
        C67688c a = C67688c.C67689a.m119840a();
        if (mo72897d() != null && a != null) {
            C42688at atVar = new C42688at(this, a);
            C89219l.m154721d(atVar, "");
            AbstractC22883b.C22884a.m43138a(a, atVar);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f99548q = false;
        SearchTabJumpCenter.INSTANCE.setSearchTabViewModel((SearchTabViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SearchTabViewModel.class));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventBus a = EventBus.m156962a();
        if (!a.mo145393a(this)) {
            EventBus.m156966a(a, this);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventBus a = EventBus.m156962a();
        if (a.mo145393a(this)) {
            a.mo145395b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo72888a() {
        int i;
        Context context = getContext();
        if (this.f99543l) {
            i = R.color.a_;
        } else {
            i = R.color.bx;
        }
        return C0643b.m2378c(context, i);
    }

    /* renamed from: d */
    public final AbstractC42670am mo72897d() {
        int i;
        if (this.f99552u.getSearchTabIndex() != null) {
            i = this.f99552u.getSearchTabIndex().getValue().intValue();
        } else {
            i = 0;
        }
        return (AbstractC42670am) this.f99550s.mo70916c(i);
    }

    /* renamed from: a */
    public final void mo72890a(int i) {
        ViewPager viewPager = this.f99538c;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo72889a(C67782c cVar) {
        if (this.f99543l) {
            return cVar.f151911b;
        }
        return R.color.b2;
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f99551t = new AnalysisStayTimeFragmentComponent(this, true);
    }

    /* renamed from: a */
    public static C42681ap m85223a(C67678d dVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_param", dVar);
        C42681ap apVar = new C42681ap();
        apVar.setArguments(bundle);
        return apVar;
    }

    /* renamed from: b */
    public final void mo72893b(int i) {
        if (mo72897d() != null) {
            C67686b bVar = new C67686b(i);
            C67685a aVar = mo72897d().f99505p;
            C89219l.m154721d(aVar, "");
            bVar.f151709a = aVar;
            ActivityC0945e activity = getActivity();
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bVar, "");
            C22886c.m43139a(activity).f54030c.mo35380a().mo35384a("Search", bVar, C67686b.class);
        }
    }

    @AbstractC90264r
    public void onSearchViewAllEvent(C41937p pVar) {
        if (this.f99538c != null) {
            C42452d.f98930b = true;
            C42452d.f98931c = true;
            C42452d.f98932d = true;
            if (pVar.f97817b != null) {
                this.f99536a.setIsFilterFromSchema(true);
                this.f99536a.setFilterOption(pVar.f97817b);
            }
            this.f99538c.setCurrentItem(pVar.f97816a);
        }
    }

    /* renamed from: a */
    public final void mo72891a(ViewPager.AbstractC1579e eVar) {
        this.f99541j = eVar;
        ViewPager viewPager = this.f99538c;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(eVar);
        }
    }

    /* renamed from: b */
    public final void mo72894b(C67678d dVar) {
        this.f99536a = dVar;
        if (af_()) {
            SearchResultParamProvider.C67672a.m119824a(getContext(), dVar);
            this.f99550s.f97109b = this.f99536a;
        }
        if (af_()) {
            for (AbstractC42670am amVar : new ArrayList(((AbstractC41730l) this.f99550s).f97351a.values())) {
                amVar.mo71343a(this.f99536a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f99536a == null && getArguments() != null) {
            this.f99536a = (C67678d) getArguments().getSerializable("search_param");
            SearchResultParamProvider.C67672a.m119824a(getActivity(), this.f99536a);
        }
        this.f99552u = (SearchIntermediateViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        this.f99553v = (SearchKeywordViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SearchKeywordViewModel.class);
        this.f99554w = (ThemeViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ThemeViewModel.class);
        this.f99547p = (SurveyViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class);
    }

    /* renamed from: c */
    public final void mo72896c(int i) {
        boolean z;
        C57071b value = this.f99553v.mo94221a().getValue();
        if (value != null && !TextUtils.isEmpty(value.f129938a)) {
            this.f99553v.mo94221a().setValue(new C57071b(value.f129938a, ""));
        }
        this.f99552u.getSearchTabIndex().setValue(Integer.valueOf(i));
        AbstractC67567q a = C67486am.m119564a();
        if (a != null) {
            a.mo106427a(i);
        }
        mo72893b(i);
        mo72895c();
        if (C41503ak.f96822a) {
            AbstractC42670am amVar = (AbstractC42670am) this.f99550s.mo70916c(i);
            C42618a a2 = C42619b.f99427b.mo72818a(C67458j.m119528a(i));
            boolean z2 = false;
            if (amVar != null) {
                C67437b bVar = amVar.f99499D;
                if (bVar != null) {
                    C33943c<Boolean> showSearchFilterDot = this.f99552u.getShowSearchFilterDot();
                    if (bVar.isDefaultOption() || bVar.isFromSchema()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    showSearchFilterDot.setValue(Boolean.valueOf(z));
                } else {
                    this.f99552u.getShowSearchFilterDot().setValue(false);
                }
                C33943c<Boolean> enableSearchFilter = this.f99552u.getEnableSearchFilter();
                if (C42619b.m85133a(a2) && amVar.mo71311r() && amVar.f99500E) {
                    z2 = true;
                }
                enableSearchFilter.setValue(Boolean.valueOf(z2));
            } else if (i == 0) {
                this.f99552u.getEnableSearchFilter().setValue(Boolean.valueOf(C42619b.m85133a(a2)));
            } else {
                this.f99552u.getShowSearchFilterDot().setValue(false);
                this.f99552u.getEnableSearchFilter().setValue(Boolean.valueOf(C42619b.m85133a(a2)));
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C41635ak<AbstractC42670am> akVar = new C41635ak<>(getChildFragmentManager(), getContext(), C67458j.m119526a());
        this.f99550s = akVar;
        akVar.f97109b = this.f99536a;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.fgq);
        this.f99538c = viewPager;
        viewPager.setOffscreenPageLimit(0);
        this.f99538c.setAdapter(this.f99550s);
        ViewPager.AbstractC1579e eVar = this.f99541j;
        if (eVar != null) {
            this.f99538c.addOnPageChangeListener(eVar);
        }
        this.f99539d = (DmtTabLayout) view.findViewById(R.id.ee7);
        this.f99540e = view.findViewById(R.id.dsc);
        this.f99539d.setCustomTabViewResId(R.layout.av7);
        this.f99539d.setupWithViewPager(this.f99538c);
        this.f99539d.setOnTabClickListener(new DmtTabLayout.AbstractC17288b() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42681ap.C426832 */

            static {
                Covode.recordClassIndex(50787);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
            /* renamed from: a */
            public final void mo27573a(DmtTabLayout.C17294f fVar) {
                fVar.mo27592a();
                C42681ap.this.mo72896c(fVar.f41524e);
            }
        });
        this.f99539d.mo27521a(new DmtTabLayout.AbstractC17289c() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42681ap.C426843 */

            static {
                Covode.recordClassIndex(50788);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: b */
            public final void mo27575b(DmtTabLayout.C17294f fVar) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: a */
            public final void mo27574a(DmtTabLayout.C17294f fVar) {
                int i = fVar.f41524e;
                C42681ap.this.f99536a.setIndex(i);
                if (C42681ap.this.f99542k != i && TextUtils.equals(C42465m.m84871c(C42681ap.this.f99542k), EnumC67453i.TOP.getTabName())) {
                    C67592a.f151370c.mo106569a(2, "select other tab.");
                }
                C42681ap.this.f99542k = i;
                C42681ap.this.f99547p.f151840c.postValue(true);
                C42681ap.this.mo72896c(i);
            }
        });
        mo72896c(this.f99538c.getCurrentItem());
        DmtTabLayout.AbstractC17289c cVar = this.f99549r;
        if (cVar != null) {
            this.f99539d.mo27521a(cVar);
        }
        this.f99539d.setTabMode(0);
        this.f99539d.setAutoFillWhenScrollable(true);
        this.f99539d.mo27519a(C34728n.m70946a(16.0d), C34728n.m70946a(16.0d));
        this.f99539d.post(new RunnableC42689au(this));
        mo72891a(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.C42681ap.C426821 */

            static {
                Covode.recordClassIndex(50786);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                if (C42681ap.this.f99537b && f == 0.0f && i2 == 0) {
                    C42681ap.this.mo72893b(i);
                    C42681ap.this.mo72895c();
                    C42681ap.this.f99537b = false;
                }
            }
        });
        SearchTabViewModel.addObserver(view, this, new C42685aq(this));
        C67678d dVar = this.f99536a;
        if (!(dVar == null || dVar.getIndex() == 0)) {
            mo72890a(this.f99536a.getIndex());
        }
        this.f99554w.mo106891d().observe(this, new C42686ar(this));
        this.f99554w.mo106889c().observe(this, new C42687as(this));
        this.f99555y = new SurveyViewController();
        if (getActivity() != null) {
            SurveyViewController surveyViewController = this.f99555y;
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.dsv);
            ActivityC0945e activity = getActivity();
            C89219l.m154721d(viewStub, "");
            C89219l.m154721d(activity, "");
            surveyViewController.f151794a = viewStub;
            surveyViewController.f151795b = activity;
            C80375ef.m139355a(surveyViewController.mo106825b().f151839b, activity, new SurveyViewController.C67733e(surveyViewController));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return EnumC67634k.INSTANCE.getView(getContext(), R.layout.au4, viewGroup);
    }
}
