package com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50686a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50694b;
import com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50896j;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50814a;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.EnumC50815b;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.view.base.AbstractC84941d;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c */
public final class C50846c implements AbstractC50819f {

    /* renamed from: f */
    public static final C50847a f117308f = new C50847a((byte) 0);

    /* renamed from: a */
    FilterBoxListView f117309a;

    /* renamed from: b */
    public final AbstractC88969g<C89391z> f117310b;

    /* renamed from: c */
    final AbstractC88969g<C50814a> f117311c;

    /* renamed from: d */
    final FilterBoxListView.AbstractC50839c f117312d = new C50850d(this);

    /* renamed from: e */
    final AbstractC50854g f117313e;

    /* renamed from: g */
    private AbstractC84941d f117314g;

    /* renamed from: h */
    private final ViewGroup f117315h;

    /* renamed from: i */
    private final AbstractC1204m f117316i;

    /* renamed from: j */
    private final C50852e f117317j;

    static {
        Covode.recordClassIndex(60019);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c$a */
    public static final class C50847a {
        static {
            Covode.recordClassIndex(60020);
        }

        private C50847a() {
        }

        public /* synthetic */ C50847a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f
    /* renamed from: c */
    public final AbstractC88979t<C50814a> mo86175c() {
        AbstractC88979t<C50814a> c = this.f117311c.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f
    /* renamed from: d */
    public final AbstractC88979t<Boolean> mo86176d() {
        AbstractC84941d dVar = this.f117314g;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        return dVar.mo86261d();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f
    /* renamed from: e */
    public final AbstractC88979t<C89391z> mo86177e() {
        AbstractC88979t<C89391z> c = this.f117310b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f
    /* renamed from: a */
    public final void mo86173a() {
        AbstractC50854g gVar = this.f117313e;
        if (gVar != null) {
            gVar.mo86234b();
        }
        AbstractC84941d dVar = this.f117314g;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86258a();
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.p2989a.AbstractC50819f
    /* renamed from: b */
    public final void mo86174b() {
        AbstractC50854g gVar = this.f117313e;
        if (gVar != null) {
            gVar.mo86236c();
        }
        AbstractC84941d dVar = this.f117314g;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86260c();
        FilterBoxListView filterBoxListView = this.f117309a;
        if (filterBoxListView == null) {
            C89219l.m154710a("listView");
        }
        filterBoxListView.setCategoryMap(C89086z.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c$d */
    public static final class C50850d implements FilterBoxListView.AbstractC50839c {

        /* renamed from: a */
        final /* synthetic */ C50846c f117320a;

        static {
            Covode.recordClassIndex(60023);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50850d(C50846c cVar) {
            this.f117320a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.AbstractC50839c
        /* renamed from: a */
        public final void mo86229a(EffectCategoryModel effectCategoryModel, C50694b bVar) {
            C89219l.m154721d(effectCategoryModel, "");
            C89219l.m154721d(bVar, "");
            C50846c cVar = this.f117320a;
            AbstractC50854g gVar = cVar.f117313e;
            if (gVar != null) {
                gVar.mo86233a(bVar);
            }
            cVar.f117311c.onNext(new C50814a(EnumC50815b.BUILTIN_CLICK, bVar));
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.AbstractC50839c
        /* renamed from: b */
        public final void mo86230b(EffectCategoryModel effectCategoryModel, C50694b bVar) {
            C89219l.m154721d(effectCategoryModel, "");
            C89219l.m154721d(bVar, "");
            C50846c cVar = this.f117320a;
            AbstractC50854g gVar = cVar.f117313e;
            if (gVar != null) {
                gVar.mo86233a(bVar);
            }
            cVar.f117311c.onNext(new C50814a(EnumC50815b.INSERT, bVar));
        }

        @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.filterbox.FilterBoxListView.AbstractC50839c
        /* renamed from: c */
        public final void mo86231c(EffectCategoryModel effectCategoryModel, C50694b bVar) {
            C89219l.m154721d(effectCategoryModel, "");
            C89219l.m154721d(bVar, "");
            C50846c cVar = this.f117320a;
            AbstractC50854g gVar = cVar.f117313e;
            if (gVar != null) {
                gVar.mo86235b(bVar);
            }
            cVar.f117311c.onNext(new C50814a(EnumC50815b.REMOVE, bVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c$c */
    static final class View$OnClickListenerC50849c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50846c f117319a;

        static {
            Covode.recordClassIndex(60022);
        }

        View$OnClickListenerC50849c(C50846c cVar) {
            this.f117319a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117319a.f117310b.onNext(C89391z.f203057a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.filterbox.c$b */
    static final class C50848b<T> implements AbstractC1214u<C89378p<? extends AbstractC50819f.EnumC50820a, ? extends C50686a>> {

        /* renamed from: a */
        final /* synthetic */ C50846c f117318a;

        static {
            Covode.recordClassIndex(60021);
        }

        C50848b(C50846c cVar) {
            this.f117318a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C89378p<? extends AbstractC50819f.EnumC50820a, ? extends C50686a> pVar) {
            C89378p<? extends AbstractC50819f.EnumC50820a, ? extends C50686a> pVar2 = pVar;
            if (pVar2 != null) {
                C50846c cVar = this.f117318a;
                C50686a aVar = (C50686a) pVar2.getSecond();
                int i = C50851d.f117321a[((AbstractC50819f.EnumC50820a) pVar2.getFirst()).ordinal()];
                if (i == 1) {
                    FilterBoxListView filterBoxListView = cVar.f117309a;
                    if (filterBoxListView == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView.setState(1);
                } else if (i == 2) {
                    FilterBoxListView filterBoxListView2 = cVar.f117309a;
                    if (filterBoxListView2 == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView2.setState(3);
                } else if (i == 3) {
                    FilterBoxListView filterBoxListView3 = cVar.f117309a;
                    if (filterBoxListView3 == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView3.setState(2);
                } else if (i == 4 && aVar != null) {
                    FilterBoxListView filterBoxListView4 = cVar.f117309a;
                    if (filterBoxListView4 == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView4.setState(0);
                    FilterBoxListView filterBoxListView5 = cVar.f117309a;
                    if (filterBoxListView5 == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView5.setCategoryMap(aVar.f117026b);
                    FilterBoxListView filterBoxListView6 = cVar.f117309a;
                    if (filterBoxListView6 == null) {
                        C89219l.m154710a("listView");
                    }
                    filterBoxListView6.setCallback(cVar.f117312d);
                }
            }
        }
    }

    public C50846c(ViewGroup viewGroup, AbstractC1204m mVar, AbstractC50854g gVar, C50852e eVar) {
        LiveData<C89378p<AbstractC50819f.EnumC50820a, C50686a>> a;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(eVar, "");
        MethodCollector.m26663i(708);
        this.f117315h = viewGroup;
        this.f117316i = mVar;
        this.f117313e = gVar;
        this.f117317j = eVar;
        C88960c cVar = new C88960c();
        C89219l.m154716b(cVar, "");
        this.f117310b = cVar;
        C88960c cVar2 = new C88960c();
        C89219l.m154716b(cVar2, "");
        this.f117311c = cVar2;
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.d7, viewGroup, false);
        viewGroup.addView(a2);
        View findViewById = a2.findViewById(R.id.b1k);
        C89219l.m154716b(findViewById, "");
        FilterBoxListView filterBoxListView = (FilterBoxListView) findViewById;
        this.f117309a = filterBoxListView;
        if (filterBoxListView == null) {
            C89219l.m154710a("listView");
        }
        filterBoxListView.setFilterBoxViewConfigure(eVar);
        C89219l.m154716b(a2, "");
        this.f117314g = new C50896j(a2, a2.findViewById(R.id.e89));
        a2.findViewById(R.id.e9o).setOnClickListener(new View$OnClickListenerC50849c(this));
        AbstractC84941d dVar = this.f117314g;
        if (dVar == null) {
            C89219l.m154710a("transitionView");
        }
        dVar.mo86263f();
        if (gVar == null || (a = gVar.mo86232a()) == null) {
            MethodCollector.m26664o(708);
            return;
        }
        a.observe(mVar, new C50848b(this));
        MethodCollector.m26664o(708);
    }
}
