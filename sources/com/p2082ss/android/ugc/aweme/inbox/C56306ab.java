package com.p2082ss.android.ugc.aweme.inbox;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.RecommendUserVM;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.AbstractC56447g;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56430a;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56433b;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56438c;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56440e;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56443f;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56451h;
import com.p2082ss.android.ugc.aweme.inbox.p3272g.C56461i;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.ab */
public final class C56306ab extends RecyclerView.AbstractC1350a<AbstractC56447g<?>> {

    /* renamed from: a */
    RecyclerView f128452a;

    /* renamed from: b */
    final SparseArray<C56520b> f128453b = new SparseArray<>();

    /* renamed from: c */
    public final Fragment f128454c;

    /* renamed from: d */
    private final List<AbstractC56310ad> f128455d = new ArrayList();

    /* renamed from: e */
    private final AbstractC89244h f128456e = C89250i.m154773a((AbstractC89171a) new C56307a(this));

    static {
        Covode.recordClassIndex(66124);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC56447g<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m102306a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.ab$b */
    static final class RunnableC56308b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56306ab f128458a;

        /* renamed from: b */
        final /* synthetic */ List f128459b;

        static {
            Covode.recordClassIndex(66126);
        }

        RunnableC56308b(C56306ab abVar, List list) {
            this.f128458a = abVar;
            this.f128459b = list;
        }

        public final void run() {
            this.f128458a.mo93337a(this.f128459b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f128455d.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.ab$a */
    static final class C56307a extends AbstractC89220m implements AbstractC89171a<RecommendUserVM> {

        /* renamed from: a */
        final /* synthetic */ C56306ab f128457a;

        static {
            Covode.recordClassIndex(66125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56307a(C56306ab abVar) {
            super(0);
            this.f128457a = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecommendUserVM invoke() {
            return RecommendUserVM.C56289a.m102295a(this.f128457a.f128454c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f128452a = recyclerView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(AbstractC56447g<?> gVar) {
        AbstractC56447g<?> gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        super.onViewAttachedToWindow(gVar2);
        gVar2.mo93405a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewDetachedFromWindow(AbstractC56447g<?> gVar) {
        AbstractC56447g<?> gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        super.onViewDetachedFromWindow(gVar2);
        gVar2.mo93407b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        if (C89219l.m154714a(this.f128452a, recyclerView)) {
            this.f128452a = null;
        }
    }

    public C56306ab(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f128454c = fragment;
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final void mo93337a(List<? extends AbstractC56310ad> list) {
        Boolean bool;
        StringBuilder sb = new StringBuilder("setDataInternal, rv isComputing: ");
        RecyclerView recyclerView = this.f128452a;
        if (recyclerView != null) {
            bool = Boolean.valueOf(recyclerView.mo4484l());
        } else {
            bool = null;
        }
        C39109f.m79403b("RecommendUserVM", sb.append(bool).append(", data size: ").append(list.size()).toString());
        this.f128455d.clear();
        this.f128455d.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        C39109f.m79403b("RecommendUserVM", "getItemId position: " + i + ", data size: " + this.f128455d.size());
        return this.f128455d.get(i).f128462c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        C39109f.m79403b("RecommendUserVM", "getItemId position: " + i + ", data size: " + this.f128455d.size());
        AbstractC56310ad adVar = this.f128455d.get(i);
        if (!(adVar instanceof AbstractC56312af)) {
            return (long) adVar.hashCode();
        }
        String uid = ((AbstractC56312af) adVar).f128464a.getUid();
        C89219l.m154716b(uid, "");
        return Long.parseLong(uid);
    }

    /* renamed from: a */
    private static View m102305a(int i, ViewGroup viewGroup) {
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), i, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC56447g<?> gVar, int i) {
        AbstractC56310ad adVar;
        AbstractC56447g<?> gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        AbstractC56310ad adVar2 = this.f128455d.get(i);
        C89219l.m154721d(adVar2, "");
        if (!(adVar2 instanceof AbstractC56310ad)) {
            adVar = null;
        } else {
            adVar = adVar2;
        }
        AbstractC56310ad adVar3 = adVar;
        if (adVar3 != null) {
            gVar2.f128722d = (T) adVar2;
            gVar2.mo93406a(adVar3);
            return;
        }
        View view = gVar2.itemView;
        C89219l.m154716b(view, "");
        view.setVisibility(8);
        C39109f.m79404c("RecommendUserBaseVH", "MultiBaseVH innerOnBind data type is not match!");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m102306a(C56306ab abVar, ViewGroup viewGroup, int i) {
        AbstractC56447g hVar;
        MethodCollector.m26663i(8171);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == -2) {
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            hVar = new C56451h(b.mo105667a(context, 9), 9);
        } else if (i == -1) {
            View a = m102305a(R.layout.ar6, viewGroup);
            if (a != null) {
                hVar = new C56438c((TuxStatusView) a);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
                MethodCollector.m26664o(8171);
                throw nullPointerException;
            }
        } else if (i == 1) {
            hVar = new C56443f(m102305a(R.layout.ar7, viewGroup));
        } else if (i == 2) {
            RecommendUserService b2 = RecommendUserServiceImpl.m118456b();
            Context context2 = viewGroup.getContext();
            C89219l.m154716b(context2, "");
            hVar = new C56451h(b2.mo105667a(context2, 10), 10);
        } else if (i == 3) {
            RecommendUserService b3 = RecommendUserServiceImpl.m118456b();
            Context context3 = viewGroup.getContext();
            C89219l.m154716b(context3, "");
            hVar = new C56440e(b3.mo105669b(context3));
        } else if (i == 4) {
            RecommendUserService b4 = RecommendUserServiceImpl.m118456b();
            Context context4 = viewGroup.getContext();
            C89219l.m154716b(context4, "");
            hVar = new C56430a(b4.mo105668a(context4));
        } else if (i != 5) {
            hVar = new C56461i(m102305a(R.layout.ar8, viewGroup));
        } else {
            hVar = new C56433b(m102305a(R.layout.ar5, viewGroup), abVar.f128454c);
        }
        RecommendUserVM recommendUserVM = (RecommendUserVM) abVar.f128456e.getValue();
        C89219l.m154721d(recommendUserVM, "");
        hVar.f128724f = recommendUserVM;
        Fragment fragment = abVar.f128454c;
        C89219l.m154721d(fragment, "");
        hVar.f128723e = fragment;
        C56520b bVar = abVar.f128453b.get(i);
        if (bVar != null) {
            hVar.mo87499a(bVar);
        }
        try {
            if (hVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(hVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) hVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(hVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = hVar.getClass().getName();
        MethodCollector.m26664o(8171);
        return hVar;
    }
}
