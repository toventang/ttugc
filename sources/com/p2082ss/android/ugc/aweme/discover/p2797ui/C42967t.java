package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p2082ss.android.ugc.aweme.discover.helper.C41989ai;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42207e;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41928g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.t */
public final class C42967t extends AbstractC34586a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C42968a f100191c = new C42968a((byte) 0);

    /* renamed from: a */
    public C42207e f100192a;

    /* renamed from: b */
    public ViewGroup f100193b;

    /* renamed from: d */
    private String f100194d;

    /* renamed from: e */
    private SparseArray f100195e;

    static {
        Covode.recordClassIndex(51099);
    }

    /* renamed from: a */
    private View m85766a(int i) {
        if (this.f100195e == null) {
            this.f100195e = new SparseArray();
        }
        View view = (View) this.f100195e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f100195e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(291, new RunnableC90250g(C42967t.class, "hideLoading", C41928g.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.t$a */
    public static final class C42968a {
        static {
            Covode.recordClassIndex(51100);
        }

        private C42968a() {
        }

        public /* synthetic */ C42968a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f100195e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.t$c */
    static final class RunnableC42970c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42967t f100197a;

        static {
            Covode.recordClassIndex(51102);
        }

        RunnableC42970c(C42967t tVar) {
            this.f100197a = tVar;
        }

        public final void run() {
            C42207e eVar = this.f100197a.f100192a;
            if (eVar == null) {
                C89219l.m154710a("dynamicViewsContainer");
            }
            RecyclerView.ViewHolder a = eVar.getRecyclerView().mo4392a(0, false);
            if (a != null && (a instanceof View$OnAttachStateChangeListenerC42258a)) {
                View view = a.itemView;
                C89219l.m154716b(view, "");
                view.getLayoutParams().height = -1;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.t$b */
    static final class View$OnClickListenerC42969b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42967t f100196a;

        static {
            Covode.recordClassIndex(51101);
        }

        View$OnClickListenerC42969b(C42967t tVar) {
            this.f100196a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f100196a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("keyword")) == null) {
            str = "";
        }
        this.f100194d = str;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void hideLoading(C41928g gVar) {
        C89219l.m154721d(gVar, "");
        if (C89219l.m154714a((Object) gVar.f97807a, (Object) "singer-detail")) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m85766a(R.id.dh_);
            if (af_() && swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            ((DmtStatusView) m85766a(R.id.e77)).mo27382d();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(7847);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC17250a aVar = (AbstractC17250a) m85766a(R.id.eim);
        C89219l.m154716b(aVar, "");
        DmtTextView titleView = aVar.getTitleView();
        C89219l.m154716b(titleView, "");
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        Object[] objArr = new Object[1];
        String str = this.f100194d;
        if (str == null) {
            C89219l.m154710a("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(R.string.dar, objArr);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[0], 0));
        C89219l.m154716b(a, "");
        titleView.setText(a);
        NormalTitleBar normalTitleBar = (NormalTitleBar) m85766a(R.id.eim);
        C89219l.m154716b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setOnClickListener(new View$OnClickListenerC42969b(this));
        ((AbstractC17250a) m85766a(R.id.eim)).mo27298a(true);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m85766a(R.id.dh_);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        ((DmtStatusView) m85766a(R.id.e77)).setBuilder(DmtStatusView.C17269a.m31905a(getContext()));
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) m85766a(R.id.dgn);
        C89219l.m154716b(nestedScrollingRecyclerView, "");
        if (nestedScrollingRecyclerView.getChildCount() > 0) {
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) m85766a(R.id.dh_);
            C89219l.m154716b(swipeRefreshLayout2, "");
            swipeRefreshLayout2.setRefreshing(true);
        } else {
            ((DmtStatusView) m85766a(R.id.e77)).mo27384f();
        }
        ViewGroup viewGroup = this.f100193b;
        if (viewGroup == null) {
            C89219l.m154710a("dynamicFragment");
        }
        viewGroup.setVisibility(0);
        Context context2 = getContext();
        if (context2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context2, "");
        C42207e eVar = new C42207e(context2);
        this.f100192a = eVar;
        ViewParent parent = eVar.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        ViewGroup viewGroup3 = this.f100193b;
        if (viewGroup3 == null) {
            C89219l.m154710a("dynamicFragment");
        }
        C42207e eVar2 = this.f100192a;
        if (eVar2 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        viewGroup3.addView(eVar2, new ViewGroup.LayoutParams(-1, -1));
        C42207e eVar3 = this.f100192a;
        if (eVar3 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        String str2 = this.f100194d;
        if (str2 == null) {
            C89219l.m154710a("musicAuthor");
        }
        eVar3.mo71405a(C41989ai.m84053a(str2));
        C42207e eVar4 = this.f100192a;
        if (eVar4 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        RecyclerView recyclerView = eVar4.getRecyclerView();
        getContext();
        recyclerView.setLayoutManager(new DynamicMusicianMusicListFragment$loadDynamicViews$1(this));
        C42207e eVar5 = this.f100192a;
        if (eVar5 == null) {
            C89219l.m154710a("dynamicViewsContainer");
        }
        eVar5.post(new RunnableC42970c(this));
        MethodCollector.m26664o(7847);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.au2, viewGroup, false);
        View findViewById = a.findViewById(R.id.aqi);
        C89219l.m154716b(findViewById, "");
        this.f100193b = (ViewGroup) findViewById;
        return a;
    }
}
