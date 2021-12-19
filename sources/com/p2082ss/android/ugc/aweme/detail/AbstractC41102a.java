package com.p2082ss.android.ugc.aweme.detail;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p2082ss.android.ugc.aweme.detail.p2742a.C41104b;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.detail.a */
public abstract class AbstractC41102a extends AbstractC34586a implements ViewPager.AbstractC1579e, ScrollableLayout.AbstractC39210b {

    /* renamed from: v */
    public static final String f96067v = new StringBuilder("android:switcher:2131370289:").toString();

    /* renamed from: A */
    protected View f96068A;

    /* renamed from: B */
    protected ViewPager f96069B;

    /* renamed from: C */
    protected DmtTabLayout f96070C;

    /* renamed from: D */
    ImageView f96071D;

    /* renamed from: E */
    protected ImageView f96072E;

    /* renamed from: F */
    public AbstractC0974l f96073F;

    /* renamed from: G */
    protected int f96074G;

    /* renamed from: H */
    protected boolean f96075H = true;

    /* renamed from: I */
    protected List<AbstractC41135h> f96076I;

    /* renamed from: J */
    protected List<AbstractC34586a> f96077J;

    /* renamed from: K */
    public String f96078K;

    /* renamed from: L */
    public AbstractC52856g f96079L;

    /* renamed from: M */
    protected long f96080M = -1;

    /* renamed from: a */
    private int f96081a;

    /* renamed from: b */
    private final AbstractC1214u<Boolean> f96082b = new C41110b(this);

    /* renamed from: w */
    protected DetailViewModel f96083w;

    /* renamed from: y */
    public ScrollableLayout f96084y;

    /* renamed from: z */
    protected TextView f96085z;

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo62627a(int i);

    /* renamed from: a */
    public void mo62629a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo70350a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62630a(Bundle bundle);

    /* renamed from: a */
    public void mo70351a(View view) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    public final boolean av_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo62639h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo62640i();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract AbstractC0974l mo62643l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo70352n() {
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrolled(int i, float f, int i2) {
    }

    static {
        Covode.recordClassIndex(48977);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onDestroyView() {
        super.onDestroyView();
        if (C41121e.m82820a()) {
            this.f96083w.f96066b.removeObserver(this.f96082b);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo70352n()) {
            mo70353o();
        }
        AbstractC52856g gVar = this.f96079L;
        if (gVar != null) {
            gVar.mo70356b();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f96080M = System.currentTimeMillis();
        if (this.f96079L != null) {
            new Handler().postDelayed(new RunnableC41115c(this), 500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo70353o() {
        if (this.f96080M != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f96080M;
            getContext();
            C39162r.m79457a("stay_time", mo62627a(this.f96074G), String.valueOf(currentTimeMillis), mo62640i());
            this.f96080M = -1;
        }
    }

    /* renamed from: k */
    public void mo62642k() {
        ScrollableLayout scrollableLayout = this.f96084y;
        if (scrollableLayout != null) {
            scrollableLayout.setOnScrollListener(this);
        }
        AbstractC0974l l = mo62643l();
        this.f96073F = l;
        this.f96069B.setAdapter(l);
        DmtTabLayout dmtTabLayout = this.f96070C;
        if (dmtTabLayout != null) {
            dmtTabLayout.setVisibility(0);
            this.f96070C.setCustomTabViewResId(R.layout.w4);
            this.f96070C.setBackgroundColor(C0643b.m2378c(getContext(), R.color.au));
            this.f96070C.mo27519a(C34728n.m70946a(16.0d), C34728n.m70946a(16.0d));
            DmtTabLayout dmtTabLayout2 = this.f96070C;
            LinearLayout linearLayout = (LinearLayout) dmtTabLayout2.getChildAt(0);
            linearLayout.setShowDividers(2);
            linearLayout.setDividerDrawable(C0643b.m2369a(dmtTabLayout2.getContext(), (int) R.drawable.a4k));
            linearLayout.setDividerPadding(C34728n.m70946a(16.0d));
            this.f96070C.setupWithViewPager(this.f96069B);
            this.f96070C.setOnTabClickListener(new C41118d(this));
            this.f96070C.setVisibility(8);
        }
        this.f96069B.addOnPageChangeListener(this);
        this.f96069B.setCurrentItem(this.f96074G);
        onPageSelected(this.f96074G);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo70354p() {
        List<AbstractC41135h> list;
        int i;
        RecyclerView recyclerView;
        if (af_() && (list = this.f96076I) != null && list.size() > (i = this.f96074G) && this.f96076I.get(i) != null && (recyclerView = (RecyclerView) this.f96076I.get(this.f96074G).mo62680m()) != null) {
            int childCount = recyclerView.getChildCount();
            ScrollableLayout scrollableLayout = this.f96084y;
            if (scrollableLayout != null) {
                if (childCount == 0) {
                    scrollableLayout.mo68079a();
                    List<AbstractC41135h> list2 = this.f96076I;
                    list2.get((this.f96074G + 1) % list2.size()).mo62681n();
                    this.f96084y.setMaxScrollHeight(0);
                    return;
                }
                View g = recyclerView.getLayoutManager().mo4717g(childCount - 1);
                int childCount2 = this.f96084y.getChildCount();
                if (childCount2 >= 2 && g != null) {
                    int bottom = (g.getBottom() + this.f96084y.getChildAt(childCount2 - 1).getTop()) - this.f96084y.getCurScrollY();
                    this.f96084y.setMaxScrollHeight(((bottom + this.f96084y.getCurScrollY()) + C13628n.m24525e(getContext())) - C13628n.m24521b(getContext()));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52856g mo70349a(ViewGroup viewGroup) {
        return new C41104b(getContext(), viewGroup);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("cur_pos", this.f96074G);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageSelected(int i) {
        boolean z;
        ViewPager viewPager;
        if (i < 0 || !((viewPager = this.f96069B) == null || viewPager.getAdapter() == null || i < this.f96069B.getAdapter().getCount())) {
            i = 0;
        }
        if (!(this.f96080M == -1 || this.f96074G == i)) {
            long currentTimeMillis = System.currentTimeMillis() - this.f96080M;
            getContext();
            C39162r.m79457a("stay_time", mo62627a(this.f96074G), String.valueOf(currentTimeMillis), mo62640i());
            this.f96080M = System.currentTimeMillis();
        }
        if (i != this.f96081a) {
            z = true;
        } else {
            z = false;
        }
        mo70350a(i, z);
        this.f96081a = i;
        this.f96074G = i;
        int currentItem = this.f96069B.getCurrentItem();
        int i2 = this.f96074G;
        if (currentItem != i2) {
            this.f96069B.setCurrentItem(i2);
        }
        ScrollableLayout scrollableLayout = this.f96084y;
        if (!(scrollableLayout == null || scrollableLayout.getHelper() == null || this.f96076I == null)) {
            this.f96084y.getHelper().f92631b = this.f96076I.get(this.f96074G);
        }
        AbstractC52856g gVar = this.f96079L;
        if (gVar != null) {
            gVar.mo70360f();
        }
        AbstractC0974l lVar = this.f96073F;
        if (!(lVar == null || this.f96069B == null)) {
            int count = lVar.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                Fragment a = this.f96073F.mo3639a(i3);
                if (!(a == null || a.getFragmentManager() == null)) {
                    if (i3 == i) {
                        a.setUserVisibleHint(true);
                        mo62629a(i, a.hashCode());
                    } else {
                        a.setUserVisibleHint(false);
                    }
                    ((AbstractC41135h) a).mo62678k();
                }
            }
        }
        mo70354p();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    /* renamed from: b */
    public void mo62635b(int i, int i2) {
        this.f96083w.f96065a.setValue(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b
    /* renamed from: a */
    public void mo62628a(float f, float f2) {
        AbstractC52856g gVar;
        mo70354p();
        if (Math.abs(f) >= Math.abs(f2) || !this.f96075H) {
            return;
        }
        if (f2 > 30.0f) {
            AbstractC52856g gVar2 = this.f96079L;
            if (gVar2 != null) {
                gVar2.mo70359e();
            }
        } else if (f2 < -30.0f && (gVar = this.f96079L) != null) {
            gVar.mo70358d();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f96084y = (ScrollableLayout) view.findViewById(R.id.dq9);
        this.f96085z = (TextView) view.findViewById(R.id.title);
        this.f96068A = view.findViewById(R.id.ej_);
        this.f96069B = (ViewPager) view.findViewById(R.id.fgn);
        this.f96070C = (DmtTabLayout) view.findViewById(R.id.ee7);
        this.f96071D = (ImageView) view.findViewById(R.id.dxf);
        this.f96072E = (ImageView) view.findViewById(R.id.pi);
        if (this.f96079L == null) {
            this.f96079L = mo70349a((ViewGroup) view);
        }
        if (bundle != null) {
            this.f96074G = bundle.getInt("cur_pos", 0);
        }
        this.f96083w = (DetailViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(DetailViewModel.class);
        if (C41121e.m82820a()) {
            this.f96083w.f96066b.observeForever(this.f96082b);
        }
        mo62642k();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo62630a(getArguments());
        View a = C1764a.m5927a(layoutInflater, mo62639h(), viewGroup, false);
        mo70351a(a);
        return a;
    }
}
