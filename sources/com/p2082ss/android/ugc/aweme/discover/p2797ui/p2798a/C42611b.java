package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.C42557d;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2799a.p2800a.C42607a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.p3691g.AbstractC67440e;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67436a;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67438c;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67441f;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67442g;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67443h;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67546f;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b */
public final class C42611b extends AbstractC34586a implements AbstractC42621b {

    /* renamed from: a */
    public AbstractC67440e f99404a;

    /* renamed from: b */
    public C42557d f99405b;

    /* renamed from: c */
    public C67437b f99406c;

    /* renamed from: d */
    public Map<String, String> f99407d;

    /* renamed from: e */
    public RecyclerView f99408e;

    /* renamed from: j */
    public C42604a f99409j;

    /* renamed from: k */
    public boolean f99410k;

    /* renamed from: l */
    public SearchStateViewModel f99411l;

    /* renamed from: m */
    private final AbstractC89244h f99412m = C89250i.m154773a((AbstractC89171a) C42612a.f99414a);

    /* renamed from: n */
    private SparseArray f99413n;

    static {
        Covode.recordClassIndex(50715);
    }

    /* renamed from: a */
    public final C42607a mo72808a() {
        return (C42607a) this.f99412m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.b$a */
    static final class C42612a extends AbstractC89220m implements AbstractC89171a<C42607a> {

        /* renamed from: a */
        public static final C42612a f99414a = new C42612a();

        static {
            Covode.recordClassIndex(50716);
        }

        C42612a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42607a invoke() {
            return new C42607a();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        mo72811c();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f99413n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: d */
    public final void mo72812d() {
        C42604a aVar = this.f99409j;
        if (aVar != null) {
            aVar.mo72805a(mo72808a().mo72806a(), this.f99407d);
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final void mo72811c() {
        C67438c cVar;
        C67438c cVar2;
        C67436a aVar;
        RecyclerView.AbstractC1362i layoutManager;
        C42604a aVar2 = this.f99409j;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.f99408e;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.mo4363e(0);
        }
        C42557d dVar = this.f99405b;
        if (dVar != null) {
            dVar.mo72729a(false);
        }
        C42618a aVar3 = mo72808a().f99396a;
        if (!(aVar3 == null || (aVar = aVar3.f99425d) == null)) {
            aVar.reset();
        }
        C42618a aVar4 = mo72808a().f99396a;
        if (!(aVar4 == null || (cVar2 = aVar4.f99424c) == null)) {
            cVar2.reset();
        }
        C42618a aVar5 = mo72808a().f99396a;
        if (!(aVar5 == null || (cVar = aVar5.f99423b) == null)) {
            cVar.reset();
        }
        this.f99406c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72810b() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.C42611b.mo72810b():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.AbstractC42621b
    /* renamed from: a */
    public final void mo72809a(C67441f fVar) {
        C67469ad adVar;
        int i;
        String str;
        C67438c cVar;
        C89219l.m154721d(fVar, "");
        C42607a a = mo72808a();
        C89219l.m154721d(fVar, "");
        C42618a aVar = a.f99396a;
        String str2 = null;
        if (!(aVar == null || (cVar = aVar.f99423b) == null)) {
            cVar.setCollapsed(null);
        }
        a.f99398c = true;
        String str3 = C67546f.f151278e;
        C89219l.m154721d(str3, "");
        AbstractC67567q a2 = C67486am.m119564a();
        if (a2 != null) {
            adVar = a2.mo106431c();
        } else {
            adVar = null;
        }
        C67546f fVar2 = new C67546f();
        AbstractC67567q a3 = C67486am.m119564a();
        if (a3 != null) {
            i = a3.mo106426a();
        } else {
            i = 0;
        }
        C67540c f = fVar2.mo106486f(C67458j.m119528a(i));
        if (adVar != null) {
            str = adVar.f151152b;
        } else {
            str = null;
        }
        C67540c b = f.mo106482b(str);
        if (adVar != null) {
            str2 = adVar.f151151a;
        }
        ((C67546f) b.mo106480a(str2)).mo106500r("by_all").mo96786a("button_type", str3).mo96792f();
        this.f99410k = true;
        mo72812d();
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            C42557d b2 = C42557d.C42558a.m85062b(activity);
            if (b2 != null) {
                C42557d.C42559b bVar = b2.f99270o;
                if (bVar != null) {
                    double b3 = (double) C17234b.m31808b(b2.getActivity());
                    Double.isNaN(b3);
                    bVar.f99278b = (int) (b3 * 0.9d);
                }
                b2.mo72731c();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        RecyclerView.AbstractC1362i layoutManager;
        WeakReference<AbstractC34186b.AbstractC34192d> weakReference;
        AbstractC34186b.AbstractC34192d dVar;
        C67436a aVar;
        WeakReference<AbstractC34186b.AbstractC34192d> weakReference2;
        AbstractC34186b.AbstractC34192d dVar2;
        C67436a aVar2;
        C67438c cVar;
        C67442g gVar;
        C67438c cVar2;
        C67438c cVar3;
        C67442g gVar2;
        C67438c cVar4;
        AbstractC67440e eVar;
        super.onHiddenChanged(z);
        C42557d dVar3 = this.f99405b;
        if (dVar3 != null) {
            dVar3.mo72729a(false);
        }
        List<C67443h> list = null;
        if (z) {
            C67437b bVar = this.f99406c;
            if (!(bVar == null || (eVar = this.f99404a) == null)) {
                eVar.mo63121a(bVar);
            }
            C42618a aVar3 = mo72808a().f99396a;
            if (!(aVar3 == null || (cVar3 = aVar3.f99424c) == null)) {
                C67437b bVar2 = this.f99406c;
                if (bVar2 == null || (gVar2 = bVar2.getSortTypeStruct()) == null) {
                    C42618a aVar4 = mo72808a().f99396a;
                    if (aVar4 == null || (cVar4 = aVar4.f99424c) == null) {
                        gVar2 = null;
                    } else {
                        gVar2 = cVar4.getDefaultOption();
                    }
                }
                cVar3.selectOption(gVar2);
            }
            C42618a aVar5 = mo72808a().f99396a;
            if (!(aVar5 == null || (cVar = aVar5.f99423b) == null)) {
                C67437b bVar3 = this.f99406c;
                if (bVar3 == null || (gVar = bVar3.getFilterByStruct()) == null) {
                    C42618a aVar6 = mo72808a().f99396a;
                    if (aVar6 == null || (cVar2 = aVar6.f99423b) == null) {
                        gVar = null;
                    } else {
                        gVar = cVar2.getDefaultOption();
                    }
                }
                cVar.selectOption(gVar);
            }
            if (this.f99406c == null) {
                C42618a aVar7 = mo72808a().f99396a;
                if (!(aVar7 == null || (aVar2 = aVar7.f99425d) == null)) {
                    aVar2.reset();
                }
            } else {
                C42618a aVar8 = mo72808a().f99396a;
                if (!(aVar8 == null || (aVar = aVar8.f99425d) == null)) {
                    C67437b bVar4 = this.f99406c;
                    if (bVar4 != null) {
                        list = bVar4.getActivitySwitchOption();
                    }
                    aVar.setLastOptionData(list);
                }
            }
            if (!(this.f99411l != null || (weakReference2 = C34181a.f80833a) == null || (dVar2 = weakReference2.get()) == null)) {
                dVar2.mo60424A();
            }
            SearchStateViewModel searchStateViewModel = this.f99411l;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingFilters(false);
                return;
            }
            return;
        }
        if (!(this.f99411l != null || (weakReference = C34181a.f80833a) == null || (dVar = weakReference.get()) == null)) {
            dVar.bi_();
        }
        SearchStateViewModel searchStateViewModel2 = this.f99411l;
        if (searchStateViewModel2 != null) {
            searchStateViewModel2.setShowingFilters(true);
        }
        RecyclerView recyclerView = this.f99408e;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            layoutManager.mo4363e(0);
        }
        C42604a aVar9 = this.f99409j;
        if (aVar9 != null) {
            aVar9.mo72805a(mo72808a().mo72806a(), this.f99407d);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f99408e = (RecyclerView) view.findViewById(R.id.dgn);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(1);
        RecyclerView recyclerView = this.f99408e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        C42604a aVar = new C42604a(this);
        this.f99409j = aVar;
        RecyclerView recyclerView2 = this.f99408e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(aVar);
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            SearchStateViewModel searchStateViewModel = (SearchStateViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
            this.f99411l = searchStateViewModel;
            if (searchStateViewModel != null) {
                searchStateViewModel.setShowingFilters(true);
            }
        }
        C42604a aVar2 = this.f99409j;
        if (aVar2 != null) {
            aVar2.mo72805a(mo72808a().mo72806a(), this.f99407d);
        }
        mo72811c();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.au1, viewGroup, false);
    }
}
