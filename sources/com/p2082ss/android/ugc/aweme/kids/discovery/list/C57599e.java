package com.p2082ss.android.ugc.aweme.kids.discovery.list;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57347b;
import com.p2082ss.android.ugc.aweme.kids.discovery.list.DiscoverViewModel;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57539b;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57540c;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57543d;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57559a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e */
public final class C57599e extends Fragment implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C57600a f131485c = new C57600a((byte) 0);

    /* renamed from: a */
    DiscoverViewModel f131486a;

    /* renamed from: b */
    boolean f131487b;

    /* renamed from: d */
    private HashMap f131488d;

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$j */
    static final class View$OnTouchListenerC57609j implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC57609j f131497a = new View$OnTouchListenerC57609j();

        static {
            Covode.recordClassIndex(67567);
        }

        View$OnTouchListenerC57609j() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(67557);
    }

    /* renamed from: a */
    public final View mo94911a(int i) {
        if (this.f131488d == null) {
            this.f131488d = new HashMap();
        }
        View view = (View) this.f131488d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f131488d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(84, new RunnableC90250g(C57599e.class, "onReportEvent", C57347b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$a */
    public static final class C57600a {
        static {
            Covode.recordClassIndex(67558);
        }

        private C57600a() {
        }

        public /* synthetic */ C57600a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$g */
    static final /* synthetic */ class C57606g extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(67564);
        }

        C57606g(C57599e eVar) {
            super(0, eVar, C57599e.class, "refreshList", "refreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C57599e) this.receiver).mo94912a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$k */
    public static final /* synthetic */ class C57610k extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(67568);
        }

        C57610k(C57599e eVar) {
            super(0, eVar, C57599e.class, "refreshList", "refreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C57599e) this.receiver).mo94912a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static boolean m104315b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131488d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: c */
    private static boolean m104316c() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean b = m104315b();
        C58029j.f132253e = b;
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$b */
    static final class C57601b implements SwipeRefreshLayout.AbstractC1559b {

        /* renamed from: a */
        final /* synthetic */ C57599e f131489a;

        static {
            Covode.recordClassIndex(67559);
        }

        C57601b(C57599e eVar) {
            this.f131489a = eVar;
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AbstractC1559b
        public final void onRefresh() {
            if (this.f131489a.mo94911a(R.id.w9) != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f131489a.mo94911a(R.id.w9);
                C89219l.m154716b(swipeRefreshLayout, "");
                if (swipeRefreshLayout.isEnabled()) {
                    this.f131489a.mo94912a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$h */
    public static final class C57607h implements C57544e.AbstractC57548c {

        /* renamed from: a */
        final /* synthetic */ C57599e f131494a;

        static {
            Covode.recordClassIndex(67565);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e.AbstractC57548c
        /* renamed from: a */
        public final void mo94898a() {
            DiscoverViewModel discoverViewModel = this.f131494a.f131486a;
            if (discoverViewModel == null) {
                C89219l.m154710a("mDiscoverViewModel");
            }
            long currentTimeMillis = System.currentTimeMillis();
            discoverViewModel.f131448a.getCategoryV2List(discoverViewModel.f131453f, 10, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new DiscoverViewModel.C57586b(discoverViewModel, currentTimeMillis), new DiscoverViewModel.C57587c(discoverViewModel, currentTimeMillis));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57607h(C57599e eVar) {
            this.f131494a = eVar;
        }
    }

    /* renamed from: a */
    public final void mo94912a() {
        getContext();
        if (!m104316c()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo94911a(R.id.w9);
            C89219l.m154716b(swipeRefreshLayout, "");
            swipeRefreshLayout.setRefreshing(false);
            if (!this.f131487b) {
                ((TuxStatusView) mo94911a(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C57610k(this)));
                TuxStatusView tuxStatusView = (TuxStatusView) mo94911a(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
        } else if (this.f131487b) {
            DiscoverViewModel discoverViewModel = this.f131486a;
            if (discoverViewModel == null) {
                C89219l.m154710a("mDiscoverViewModel");
            }
            discoverViewModel.mo94907a();
        } else {
            ((TuxStatusView) mo94911a(R.id.e7i)).mo37867a();
            TuxStatusView tuxStatusView2 = (TuxStatusView) mo94911a(R.id.e7i);
            C89219l.m154716b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(0);
            DiscoverViewModel discoverViewModel2 = this.f131486a;
            if (discoverViewModel2 == null) {
                C89219l.m154710a("mDiscoverViewModel");
            }
            discoverViewModel2.mo94907a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$c */
    static final class C57602c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57599e f131490a;

        static {
            Covode.recordClassIndex(67560);
        }

        C57602c(C57599e eVar) {
            this.f131490a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            RecyclerView recyclerView = (RecyclerView) this.f131490a.mo94911a(R.id.c_f);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
            RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar = ((C57540c) adapter).f131360f;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.list.CategoryListAdapter");
            C57592b bVar = (C57592b) aVar;
            if (list != null) {
                bVar.f131476a.clear();
                bVar.f131476a.addAll(list);
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$d */
    static final class C57603d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57599e f131491a;

        static {
            Covode.recordClassIndex(67561);
        }

        C57603d(C57599e eVar) {
            this.f131491a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C57599e eVar = this.f131491a;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            RecyclerView recyclerView = (RecyclerView) eVar.mo94911a(R.id.c_f);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
            C57544e eVar2 = (C57544e) adapter;
            if (booleanValue) {
                eVar2.mo94895a(1);
            } else {
                eVar2.mo94895a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$f */
    static final class C57605f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57599e f131493a;

        static {
            Covode.recordClassIndex(67563);
        }

        C57605f(C57599e eVar) {
            this.f131493a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                RecyclerView recyclerView = (RecyclerView) this.f131493a.mo94911a(R.id.c_f);
                C89219l.m154716b(recyclerView, "");
                RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.discovery.base.LoadMoreAdapterWrapper");
                ((C57544e) adapter).mo94895a(3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C80298cg.m139204a(this);
        AbstractC1174ac a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(DiscoverViewModel.class);
        C89219l.m154716b(a, "");
        DiscoverViewModel discoverViewModel = (DiscoverViewModel) a;
        this.f131486a = discoverViewModel;
        if (discoverViewModel == null) {
            C89219l.m154710a("mDiscoverViewModel");
        }
        discoverViewModel.f131452e.observe(this, new C57602c(this));
        DiscoverViewModel discoverViewModel2 = this.f131486a;
        if (discoverViewModel2 == null) {
            C89219l.m154710a("mDiscoverViewModel");
        }
        discoverViewModel2.f131449b.observe(this, new C57603d(this));
        DiscoverViewModel discoverViewModel3 = this.f131486a;
        if (discoverViewModel3 == null) {
            C89219l.m154710a("mDiscoverViewModel");
        }
        discoverViewModel3.f131450c.observe(this, new C57604e(this));
        DiscoverViewModel discoverViewModel4 = this.f131486a;
        if (discoverViewModel4 == null) {
            C89219l.m154710a("mDiscoverViewModel");
        }
        discoverViewModel4.f131451d.observe(this, new C57605f(this));
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReportEvent(C57347b bVar) {
        C89219l.m154721d(bVar, "");
        DiscoverViewModel discoverViewModel = this.f131486a;
        if (discoverViewModel == null) {
            C89219l.m154710a("mDiscoverViewModel");
        }
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        List<C57559a> value = discoverViewModel.f131452e.getValue();
        if (value == null) {
            value = C89086z.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t : value) {
            if (!discoverViewModel.mo94908a(t)) {
                arrayList2.add(t);
            }
        }
        arrayList.addAll(arrayList2);
        discoverViewModel.f131452e.postValue(arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$e */
    static final class C57604e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C57599e f131492a;

        static {
            Covode.recordClassIndex(67562);
        }

        C57604e(C57599e eVar) {
            this.f131492a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C57599e eVar = this.f131492a;
            C89219l.m154716b(bool, "");
            boolean booleanValue = bool.booleanValue();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) eVar.mo94911a(R.id.w9);
            C89219l.m154716b(swipeRefreshLayout, "");
            if (swipeRefreshLayout.isEnabled()) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) eVar.mo94911a(R.id.w9);
                C89219l.m154716b(swipeRefreshLayout2, "");
                swipeRefreshLayout2.setRefreshing(false);
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) eVar.mo94911a(R.id.w9);
                C89219l.m154716b(swipeRefreshLayout3, "");
                swipeRefreshLayout3.setSelected(false);
            }
            if (eVar.mo94911a(R.id.e7i) == null) {
                return;
            }
            if (booleanValue) {
                eVar.f131487b = true;
                TuxStatusView tuxStatusView = (TuxStatusView) eVar.mo94911a(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(8);
                return;
            }
            new C23144b(eVar).mo37640e(R.string.dcq).mo37637b();
            if (eVar.f131487b) {
                TuxStatusView tuxStatusView2 = (TuxStatusView) eVar.mo94911a(R.id.e7i);
                C89219l.m154716b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(8);
                return;
            }
            TuxStatusView tuxStatusView3 = (TuxStatusView) eVar.mo94911a(R.id.e7i);
            C89219l.m154716b(tuxStatusView3, "");
            tuxStatusView3.setVisibility(0);
            ((TuxStatusView) eVar.mo94911a(R.id.e7i)).setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C57606g(eVar)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo94911a(R.id.c_f);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C57592b bVar = new C57592b();
        C57544e eVar = new C57544e(bVar);
        C57543d dVar = new C57543d(eVar);
        C89219l.m154721d(dVar, "");
        eVar.f131369g = dVar;
        C57607h hVar = new C57607h(this);
        C89219l.m154721d(hVar, "");
        eVar.f131370h = hVar;
        RecyclerView recyclerView2 = (RecyclerView) mo94911a(R.id.c_f);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(eVar);
        DiscoveryRecyclerView discoveryRecyclerView = (DiscoveryRecyclerView) mo94911a(R.id.c_f);
        C89219l.m154716b(discoveryRecyclerView, "");
        ((RecyclerView) mo94911a(R.id.c_f)).mo4402a(new C57608i(this, bVar, C0643b.m2378c(discoveryRecyclerView.getContext(), R.color.b6), (int) C13628n.m24520b(getContext(), 16.0f), (int) C13628n.m24520b(getContext(), 16.0f)));
        ((SwipeRefreshLayout) mo94911a(R.id.w9)).setProgressViewOffset(false, (int) C13628n.m24520b(getActivity(), 49.0f), (int) C13628n.m24520b(getActivity(), 113.0f));
        ((SwipeRefreshLayout) mo94911a(R.id.w9)).setOnRefreshListener(new C57601b(this));
        mo94912a();
        ((TuxStatusView) mo94911a(R.id.e7i)).setOnTouchListener(View$OnTouchListenerC57609j.f131497a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aci, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.list.e$i */
    public static final class C57608i extends C57539b {

        /* renamed from: a */
        final /* synthetic */ C57599e f131495a;

        /* renamed from: b */
        final /* synthetic */ C57592b f131496b;

        static {
            Covode.recordClassIndex(67566);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57539b, androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            int d = RecyclerView.m4277d(view);
            if (d >= 0 && d < this.f131496b.getItemCount() - 1 && this.f131496b.getItemViewType(d) == 2147483644) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57608i(C57599e eVar, C57592b bVar, int i, int i2, int i3) {
            super(i, 1, 1, i2, i3);
            this.f131495a = eVar;
            this.f131496b = bVar;
        }
    }
}
