package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.b.c */
public final class C41382c implements AbstractC41262aa, AbstractC41262aa.AbstractC41263a {

    /* renamed from: a */
    public List<? extends Aweme> f96546a;

    /* renamed from: b */
    public List<? extends Aweme> f96547b;

    /* renamed from: c */
    public boolean f96548c = true;

    /* renamed from: d */
    public boolean f96549d = true;

    /* renamed from: e */
    public MixFlowParam f96550e;

    /* renamed from: f */
    public MixFlowParam f96551f;

    /* renamed from: g */
    private int f96552g;

    /* renamed from: h */
    private final AbstractC41262aa f96553h;

    /* renamed from: i */
    private final AbstractC41262aa f96554i;

    /* renamed from: j */
    private final List<Aweme> f96555j;

    static {
        Covode.recordClassIndex(49277);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean deleteItem(String str) {
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean cannotLoadLatest() {
        return this.f96553h.cannotLoadLatest();
    }

    /* renamed from: c */
    private final boolean m83236c() {
        AbstractC41262aa aaVar = this.f96553h;
        if (!(aaVar instanceof AbstractC41262aa.AbstractC41263a) || aaVar.cannotLoadLatest()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo70650b() {
        if (this.f96549d || this.f96548c) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final Object getViewModel() {
        Object viewModel = this.f96553h.getViewModel();
        if (viewModel == null) {
            return new Object();
        }
        return viewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isDataEmpty() {
        if (!this.f96554i.isDataEmpty() || !this.f96553h.isDataEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean isLoading() {
        if (!this.f96554i.isLoading() || !this.f96553h.isLoading()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void unInit() {
        this.f96554i.unInit();
        this.f96553h.unInit();
        List<? extends Aweme> list = this.f96547b;
        if (list != null) {
            for (T t : list) {
                t.mixFlowParam = null;
                t.setSearchFeedType(null);
            }
        }
        List<? extends Aweme> list2 = this.f96546a;
        if (list2 != null) {
            for (T t2 : list2) {
                t2.mixFlowParam = null;
                t2.setSearchFeedType(null);
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* renamed from: a */
    public final List<Aweme> mo70648a() {
        List<? extends Aweme> list = this.f96546a;
        List<? extends Aweme> list2 = this.f96547b;
        if (this.f96552g < 0 || list2 == null || list2.isEmpty() || this.f96552g > list2.size()) {
            return this.f96546a;
        }
        if (list == null || list.isEmpty()) {
            return this.f96547b;
        }
        ArrayList arrayList = new ArrayList();
        if (m83236c() && !this.f96553h.cannotLoadMore()) {
            arrayList.addAll(list);
        } else if (m83236c() && this.f96553h.cannotLoadMore()) {
            arrayList.addAll(list);
            arrayList.addAll(list2.subList(this.f96552g + 1, list2.size()));
        } else if (m83236c() || this.f96553h.cannotLoadMore()) {
            arrayList.addAll(list2.subList(0, this.f96552g));
            arrayList.addAll(list);
            arrayList.addAll(list2.subList(this.f96552g + 1, list2.size()));
        } else {
            arrayList.addAll(list2.subList(0, this.f96552g));
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return this.f96553h.getPageType(i);
    }

    /* renamed from: a */
    public final boolean mo70649a(int i) {
        int i2;
        int i3;
        List<? extends Aweme> list = this.f96547b;
        if (list != null) {
            i2 = C41385d.m83274a(list, this.f96552g);
        } else {
            i2 = this.f96552g;
        }
        List<? extends Aweme> list2 = this.f96546a;
        if (list2 != null) {
            i3 = list2.size();
        } else {
            i3 = 0;
        }
        int i4 = i3 + i2;
        if (i < i2 || i >= i4) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void bindView(AbstractC41267ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f96553h.bindView(new C41383a(this, adVar));
        this.f96554i.bindView(new C41384b(this, adVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final boolean init(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (this.f96552g < 0) {
            this.f96552g = 0;
        }
        Object viewModel = this.f96554i.getViewModel();
        Objects.requireNonNull(viewModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.presenter.IAwemeListProvider");
        List<Aweme> a = ((AbstractC41238k) viewModel).mo70559a();
        this.f96547b = a;
        if (a != null) {
            for (T t : a) {
                t.mixFlowParam = this.f96551f;
                t.setSearchFeedType("SearchMixFeed");
            }
        }
        List<Aweme> list = this.f96555j;
        this.f96546a = list;
        if (list != null) {
            for (T t2 : list) {
                t2.mixFlowParam = this.f96550e;
                t2.setSearchFeedType("detailFeed");
            }
        }
        if (!this.f96553h.init(fragment) || !this.f96554i.init(fragment)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.c$a */
    public final class C41383a implements AbstractC41267ad {

        /* renamed from: a */
        final /* synthetic */ C41382c f96556a;

        /* renamed from: b */
        private final AbstractC41267ad f96557b;

        static {
            Covode.recordClassIndex(49278);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: a */
        public final void mo61907a(Aweme aweme) {
            this.f96557b.mo61907a(aweme);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: a */
        public final void mo59511a(Exception exc) {
            this.f96557b.mo59511a(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
        /* renamed from: a */
        public final void mo70473a(List<Aweme> list) {
            this.f96557b.mo70473a(list);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: a */
        public final void mo62668a(List<Aweme> list, int i) {
            this.f96557b.mo62668a(list, i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: a */
        public final boolean mo62670a(C39108i<Aweme> iVar) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad
        public final Fragment aH_() {
            return this.f96557b.aH_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        public final void aW_() {
            this.f96557b.aW_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59515b() {
            this.f96557b.mo59515b();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: b */
        public final void mo62671b(int i) {
            this.f96557b.mo62671b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59516b(Exception exc) {
            this.f96557b.mo59516b(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: b_ */
        public final void mo61908b_(Exception exc) {
            this.f96557b.mo61908b_(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        public final void bl_() {
            this.f96557b.bl_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: c */
        public final void mo59522c(Exception exc) {
            this.f96557b.mo59522c(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x
        /* renamed from: c */
        public final void mo70483c(boolean z) {
            this.f96557b.mo70483c(z);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
        /* renamed from: c_ */
        public final void mo70484c_(Exception exc) {
            this.f96557b.mo70484c_(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: f */
        public final void mo59525f() {
            this.f96557b.mo59525f();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad
        /* renamed from: l */
        public final void mo70501l() {
            this.f96557b.mo70501l();
        }

        public C41383a(C41382c cVar, AbstractC41267ad adVar) {
            C89219l.m154721d(adVar, "");
            this.f96556a = cVar;
            this.f96557b = adVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59517b(List<Aweme> list, boolean z) {
            this.f96556a.f96546a = list;
            List<? extends Aweme> list2 = this.f96556a.f96546a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f96556a.f96550e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f96556a.f96549d = z;
            this.f96557b.mo59517b(this.f96556a.mo70648a(), this.f96556a.mo70650b());
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: c */
        public final void mo59523c(List<Aweme> list, boolean z) {
            this.f96556a.f96546a = list;
            List<? extends Aweme> list2 = this.f96556a.f96546a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f96556a.f96550e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f96557b.mo59523c(this.f96556a.mo70648a(), z);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: a */
        public final void mo59512a(List<Aweme> list, boolean z) {
            this.f96556a.f96546a = list;
            List<? extends Aweme> list2 = this.f96556a.f96546a;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f96556a.f96550e;
                    t.setSearchFeedType("detailFeed");
                }
            }
            this.f96556a.f96549d = z;
            this.f96557b.mo59512a(this.f96556a.mo70648a(), this.f96556a.mo70650b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.c$b */
    public final class C41384b implements AbstractC41267ad {

        /* renamed from: a */
        final /* synthetic */ C41382c f96558a;

        /* renamed from: b */
        private final AbstractC41267ad f96559b;

        static {
            Covode.recordClassIndex(49279);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: a */
        public final void mo61907a(Aweme aweme) {
            this.f96559b.mo61907a(aweme);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: a */
        public final void mo59511a(Exception exc) {
            this.f96559b.mo59511a(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
        /* renamed from: a */
        public final void mo70473a(List<Aweme> list) {
            this.f96559b.mo70473a(list);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: a */
        public final void mo62668a(List<Aweme> list, int i) {
            this.f96559b.mo62668a(list, i);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: a */
        public final void mo59512a(List<Aweme> list, boolean z) {
            this.f96559b.mo59512a(list, z);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.e.i] */
        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: a */
        public final boolean mo62670a(C39108i<Aweme> iVar) {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad
        public final Fragment aH_() {
            return this.f96559b.aH_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        public final void aW_() {
            this.f96559b.aW_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59515b() {
            this.f96559b.mo59515b();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
        /* renamed from: b */
        public final void mo62671b(int i) {
            this.f96559b.mo62671b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59516b(Exception exc) {
            this.f96559b.mo59516b(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41240m
        /* renamed from: b_ */
        public final void mo61908b_(Exception exc) {
            this.f96559b.mo61908b_(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        public final void bl_() {
            this.f96559b.bl_();
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: c */
        public final void mo59522c(Exception exc) {
            this.f96559b.mo59522c(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: c */
        public final void mo59523c(List<Aweme> list, boolean z) {
            this.f96559b.mo59523c(list, z);
        }

        @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49992x
        /* renamed from: c */
        public final void mo70483c(boolean z) {
            this.f96559b.mo70483c(z);
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41239l
        /* renamed from: c_ */
        public final void mo70484c_(Exception exc) {
            this.f96559b.mo70484c_(exc);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: f */
        public final void mo59525f() {
            this.f96559b.mo59525f();
        }

        @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41267ad
        /* renamed from: l */
        public final void mo70501l() {
            this.f96559b.mo70501l();
        }

        public C41384b(C41382c cVar, AbstractC41267ad adVar) {
            C89219l.m154721d(adVar, "");
            this.f96558a = cVar;
            this.f96559b = adVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
        /* renamed from: b */
        public final void mo59517b(List<Aweme> list, boolean z) {
            this.f96558a.f96547b = list;
            List<? extends Aweme> list2 = this.f96558a.f96547b;
            if (list2 != null) {
                for (T t : list2) {
                    t.mixFlowParam = this.f96558a.f96551f;
                    t.setSearchFeedType("SearchMixFeed");
                }
            }
            this.f96558a.f96548c = z;
            this.f96559b.mo59517b(this.f96558a.mo70648a(), this.f96558a.mo70650b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        C89219l.m154721d(bVar, "");
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                if (this.f96553h.cannotLoadMore()) {
                    this.f96554i.request(i, bVar, i2, z);
                    return;
                }
            } else {
                return;
            }
        }
        this.f96553h.request(i, bVar, i2, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41382c(MixFlowParam mixFlowParam, MixFlowParam mixFlowParam2, int i, AbstractC41262aa aaVar, AbstractC41262aa aaVar2, List<? extends Aweme> list) {
        C89219l.m154721d(mixFlowParam, "");
        C89219l.m154721d(mixFlowParam2, "");
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(aaVar2, "");
        this.f96550e = mixFlowParam;
        this.f96551f = mixFlowParam2;
        this.f96552g = i;
        this.f96553h = aaVar;
        this.f96554i = aaVar2;
        this.f96555j = list;
    }
}
