package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d;
import com.p2082ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.C59037aw;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79646c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.f */
public abstract class AbstractC50300f<T extends C39101b> extends AbstractC50477z implements AbstractC48151ak, AbstractC49746c, AbstractC49747d, AbstractC50083at, LoadMoreFrameLayout.AbstractC50499b {

    /* renamed from: a */
    protected LoadMoreFrameLayout f116135a;

    /* renamed from: b */
    protected View f116136b;

    /* renamed from: c */
    protected FeedSwipeRefreshLayout f116137c;

    /* renamed from: d */
    protected SwipeRefreshLayout.AbstractC34635c f116138d;

    /* renamed from: e */
    DmtStatusView f116139e;

    /* renamed from: j */
    protected T f116140j;

    /* renamed from: k */
    protected AbstractC34638b f116141k;

    /* renamed from: l */
    protected VerticalViewPager f116142l;

    /* renamed from: m */
    private AtomicBoolean f116143m = new AtomicBoolean(false);

    /* renamed from: n */
    private List<ViewPager.AbstractC1579e> f116144n = new ArrayList();

    static {
        Covode.recordClassIndex(59426);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract DmtStatusView mo85153a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract T mo85163h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo85164i();

    /* renamed from: m */
    public void mo85166m() {
    }

    /* renamed from: b */
    private static boolean mo80042b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49746c
    /* renamed from: k */
    public boolean mo70693k() {
        if (!mo85165l()) {
            return false;
        }
        return mo85164i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo85165l() {
        if (!this.f116140j.mo67842j()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo85468j() {
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f116137c;
        if (feedSwipeRefreshLayout != null) {
            feedSwipeRefreshLayout.mo61104a((int) C13628n.m24520b(getActivity(), 49.0f), (int) C13628n.m24520b(getActivity(), 113.0f));
            this.f116141k = new C59037aw(this.f116137c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onDestroyView() {
        super.onDestroyView();
        T t = this.f116140j;
        if (t != null) {
            t.ck_();
        }
        for (ViewPager.AbstractC1579e eVar : this.f116144n) {
            VerticalViewPager verticalViewPager = this.f116142l;
            if (verticalViewPager.f92488e != null) {
                verticalViewPager.f92488e.remove(eVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d
    /* renamed from: a */
    public final boolean mo70687a(Aweme aweme) {
        return this.f116140j.mo67866a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49747d
    /* renamed from: a */
    public final boolean mo70688a(String str) {
        boolean a = this.f116140j.mo67866a(AwemeService.m70060b().mo60684b(str));
        C51423a.m95791b(4, "BaseFeedListFragment", str + " deleteItem :" + a);
        return a;
    }

    /* renamed from: b */
    public final DmtStatusView mo85467b(boolean z) {
        if (this.f116139e == null && z && this.f116143m.get() && getContext() != null) {
            DmtStatusView a = mo85153a(getContext());
            this.f116139e = a;
            a.setBackgroundColor(C0643b.m2378c(getContext(), R.color.c0));
            this.f116135a.addView(this.f116139e, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.f116139e;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    /* renamed from: a */
    public boolean mo85156a(boolean z) {
        if (!af_()) {
            return false;
        }
        getActivity();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = mo80042b();
        }
        if (!C58029j.f132256h) {
            new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
            this.f116141k.setRefreshing(false);
            AbstractC81915c.m141874a(new C49698y());
            return false;
        } else if (!this.f116140j.mo67842j()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50477z
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LoadMoreFrameLayout loadMoreFrameLayout = (LoadMoreFrameLayout) view.findViewById(R.id.cg7);
        this.f116135a = loadMoreFrameLayout;
        loadMoreFrameLayout.setOnLoadMoreUiListener(this);
        this.f116136b = view.findViewById(R.id.b11);
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = (FeedSwipeRefreshLayout) view.findViewById(R.id.dhb);
        this.f116137c = feedSwipeRefreshLayout;
        SwipeRefreshLayout.AbstractC34635c cVar = this.f116138d;
        if (cVar != null) {
            feedSwipeRefreshLayout.setOnSwipeChangeListener(cVar);
        }
        mo85468j();
        this.f116137c.setOnRefreshListener(new SwipeRefreshLayout.AbstractC34634b() {
            /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50300f.C503011 */

            static {
                Covode.recordClassIndex(59427);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout.AbstractC34634b
            /* renamed from: a */
            public final void mo59551a() {
                AbstractC50300f.this.mo85156a(false);
                AbstractC81915c.m141874a(new C79646c(0));
            }
        });
        this.f116140j = mo85163h();
        this.f116142l = (VerticalViewPager) this.f116136b.findViewById(R.id.fgn);
        this.f116143m.compareAndSet(false, true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C67261e.m119186d()) {
            return C1870c.m6045a((Activity) getActivity(), (int) R.layout.s6);
        }
        return C1870c.m6045a((Activity) getActivity(), (int) R.layout.s1);
    }
}
