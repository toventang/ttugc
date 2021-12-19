package com.bytedance.creativex.recorder.filter.panel;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14214d;
import com.bytedance.creativex.recorder.filter.p942a.EnumC14221k;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.p1468k.C20674a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50814a;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class FilterPanelViewModel extends LifecycleAwareViewModel<FilterPanelState> implements AbstractC14214d {

    /* renamed from: a */
    final AbstractC14210a f34562a;

    /* renamed from: b */
    public final Handler f34563b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C1213t<EnumC14221k> f34564c = new C1213t<>();

    /* renamed from: d */
    final C88960c<C50816c> f34565d;

    /* renamed from: e */
    public final C21582f f34566e;

    /* renamed from: f */
    public final AbstractC50707o f34567f;

    /* renamed from: g */
    final AbstractC89172b<Activity, Boolean> f34568g;

    /* renamed from: l */
    private final AbstractC89244h f34569l = C89250i.m154773a((AbstractC89171a) new C14260a(this));

    /* renamed from: m */
    private final AbstractC88979t<C50816c> f34570m;

    /* renamed from: n */
    private final boolean f34571n;

    static {
        Covode.recordClassIndex(16330);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14214d
    /* renamed from: b */
    public final AbstractC88979t<C50816c> mo22965b() {
        return this.f34570m;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14214d
    /* renamed from: a */
    public final LiveData<EnumC14221k> mo22963a() {
        return C20674a.m38925a(this.f34564c);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$a */
    static final class C14260a extends AbstractC89220m implements AbstractC89171a<AbstractC14177d> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34572a;

        static {
            Covode.recordClassIndex(16331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14260a(FilterPanelViewModel filterPanelViewModel) {
            super(0);
            this.f34572a = filterPanelViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC14177d invoke() {
            Object a = this.f34572a.f34566e.mo35247a(AbstractC14177d.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FilterPanelState(new AbstractC23517a.C23518a(), null, this.f34571n, C89041ag.m154415a(), null, 0, 48, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        this.f34562a.getCurSelectedFilter().mo7036a(this, new C14261b(this));
        this.f34567f.mo86071f().mo86076c().observe(this, new C14263c(this));
        this.f34567f.mo86071f().mo86075b().observe(this, new C14265d(this));
        mo23024a(Integer.MIN_VALUE);
        this.f34567f.mo86064a();
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$b */
    static final class C14261b<T> implements AbstractC2565m<FilterBean> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34573a;

        static {
            Covode.recordClassIndex(16332);
        }

        C14261b(FilterPanelViewModel filterPanelViewModel) {
            this.f34573a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(FilterBean filterBean) {
            final FilterBean filterBean2 = filterBean;
            this.f34573a.mo33690d(new AbstractC89172b<FilterPanelState, FilterPanelState>() {
                /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.C14261b.C142621 */

                static {
                    Covode.recordClassIndex(16333);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
                    FilterPanelState filterPanelState2 = filterPanelState;
                    C89219l.m154721d(filterPanelState2, "");
                    return FilterPanelState.copy$default(filterPanelState2, null, filterBean2, false, null, null, 0, 61, null);
                }
            });
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$c */
    static final class C14263c<T> implements AbstractC2565m<List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>>> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34575a;

        static {
            Covode.recordClassIndex(16334);
        }

        C14263c(FilterPanelViewModel filterPanelViewModel) {
            this.f34575a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list) {
            final List<? extends C89378p<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list2 = list;
            this.f34575a.mo33690d(new AbstractC89172b<FilterPanelState, FilterPanelState>() {
                /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.C14263c.C142641 */

                static {
                    Covode.recordClassIndex(16335);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
                    FilterPanelState filterPanelState2 = filterPanelState;
                    C89219l.m154721d(filterPanelState2, "");
                    return FilterPanelState.copy$default(filterPanelState2, null, null, false, C50687a.m94982b(list2), null, 0, 55, null);
                }
            });
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$d */
    static final class C14265d<T> implements AbstractC2565m<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34577a;

        static {
            Covode.recordClassIndex(16336);
        }

        C14265d(FilterPanelViewModel filterPanelViewModel) {
            this.f34577a = filterPanelViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            List<? extends FilterBean> list2 = list;
            if (list2 != null) {
                FilterPanelViewModel filterPanelViewModel = this.f34577a;
                filterPanelViewModel.mo33687b_(new C14275m(filterPanelViewModel, list2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23024a(int i) {
        mo33689c(new C14271i(i));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$f */
    static final class C14268f extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C14268f f34582a = new C14268f();

        static {
            Covode.recordClassIndex(16339);
        }

        C14268f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, new C20526p(), 0, 47, null);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$g */
    static final class C14269g extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ boolean f34583a;

        static {
            Covode.recordClassIndex(16340);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14269g(boolean z) {
            super(1);
            this.f34583a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, this.f34583a, null, null, 0, 59, null);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$h */
    static final class C14270h extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C14270h f34584a = new C14270h();

        static {
            Covode.recordClassIndex(16341);
        }

        C14270h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, 0, 61, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$i */
    public static final class C14271i extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ int f34585a;

        static {
            Covode.recordClassIndex(16342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14271i(int i) {
            super(1);
            this.f34585a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, this.f34585a, 31, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$j */
    public static final class C14272j extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        public static final C14272j f34586a = new C14272j();

        static {
            Covode.recordClassIndex(16343);
        }

        C14272j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, null, false, null, null, 0, 59, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$k */
    public static final class C14273k extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ FilterBean f34587a;

        static {
            Covode.recordClassIndex(16344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14273k(FilterBean filterBean) {
            super(1);
            this.f34587a = filterBean;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            return FilterPanelState.copy$default(filterPanelState2, null, this.f34587a, false, null, null, 0, 61, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14214d
    /* renamed from: a */
    public final void mo22964a(boolean z) {
        mo33690d(new C14274l(this, z));
        ((AbstractC14177d) this.f34569l.getValue()).mo22779a(new C14171ac(!z, false, 6));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$l */
    public static final class C14274l extends AbstractC89220m implements AbstractC89172b<FilterPanelState, FilterPanelState> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34588a;

        /* renamed from: b */
        final /* synthetic */ boolean f34589b;

        static {
            Covode.recordClassIndex(16345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14274l(FilterPanelViewModel filterPanelViewModel, boolean z) {
            super(1);
            this.f34588a = filterPanelViewModel;
            this.f34589b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FilterPanelState invoke(FilterPanelState filterPanelState) {
            AbstractC23517a aVar;
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            if (this.f34589b) {
                aVar = new AbstractC23517a.C23519b();
                this.f34588a.f34564c.setValue(EnumC14221k.ON_SHOWN);
            } else {
                aVar = new AbstractC23517a.C23518a();
                this.f34588a.f34564c.setValue(EnumC14221k.ON_DISMISSED);
            }
            return FilterPanelState.copy$default(filterPanelState2, aVar, null, false, null, null, 0, 62, null);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$e */
    static final class C14266e extends AbstractC89220m implements AbstractC89172b<FilterPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34578a;

        /* renamed from: b */
        final /* synthetic */ C50814a f34579b;

        static {
            Covode.recordClassIndex(16337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14266e(FilterPanelViewModel filterPanelViewModel, C50814a aVar) {
            super(1);
            this.f34578a = filterPanelViewModel;
            this.f34579b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterPanelState filterPanelState) {
            final FilterBean filterBean;
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            FilterBean selectedFilter = filterPanelState2.getSelectedFilter();
            if (selectedFilter != null && selectedFilter.getId() == this.f34579b.f117262b.f117036a.f117047a) {
                List<FilterBean> value = this.f34578a.f34567f.mo86071f().mo86075b().getValue();
                if (value == null || value.isEmpty()) {
                    filterBean = C50687a.m94980b();
                } else {
                    filterBean = value.get(0);
                }
                this.f34578a.f34563b.post(new Runnable(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.C14266e.RunnableC142671 */

                    /* renamed from: a */
                    final /* synthetic */ C14266e f34580a;

                    static {
                        Covode.recordClassIndex(16338);
                    }

                    {
                        this.f34580a = r1;
                    }

                    public final void run() {
                        this.f34580a.f34578a.mo23025a(filterBean, true);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel$m */
    static final class C14275m extends AbstractC89220m implements AbstractC89172b<FilterPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FilterPanelViewModel f34590a;

        /* renamed from: b */
        final /* synthetic */ List f34591b;

        static {
            Covode.recordClassIndex(16346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14275m(FilterPanelViewModel filterPanelViewModel, List list) {
            super(1);
            this.f34590a = filterPanelViewModel;
            this.f34591b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FilterPanelState filterPanelState) {
            Object obj;
            FilterPanelState filterPanelState2 = filterPanelState;
            C89219l.m154721d(filterPanelState2, "");
            Iterator it = this.f34591b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((FilterBean) obj).getId() == filterPanelState2.getPendingSelected()) {
                    break;
                }
            }
            final FilterBean filterBean = (FilterBean) obj;
            if (!(filterPanelState2.getPendingSelected() == Integer.MIN_VALUE || filterBean == null)) {
                this.f34590a.mo23024a(Integer.MIN_VALUE);
                this.f34590a.f34563b.post(new Runnable(this) {
                    /* class com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel.C14275m.RunnableC142761 */

                    /* renamed from: a */
                    final /* synthetic */ C14275m f34592a;

                    static {
                        Covode.recordClassIndex(16347);
                    }

                    {
                        this.f34592a = r1;
                    }

                    public final void run() {
                        this.f34592a.f34590a.mo23025a(filterBean, true);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo23025a(FilterBean filterBean, boolean z) {
        String str;
        if (C50691c.m94989a(this.f34567f, filterBean)) {
            if (filterBean != null) {
                AbstractC14210a aVar = this.f34562a;
                if (z) {
                    str = "filter_box";
                } else {
                    str = null;
                }
                aVar.setFilterChosen(filterBean, str, true, true, false);
                this.f34562a.setFilterDisable(false, "build_in");
                mo33689c(C14272j.f34586a);
            }
            mo33690d(new C14273k(filterBean));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super android.app.Activity, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterPanelViewModel(C21582f fVar, AbstractC50707o oVar, boolean z, AbstractC89172b<? super Activity, Boolean> bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(oVar, "");
        this.f34566e = fVar;
        this.f34567f = oVar;
        this.f34571n = z;
        this.f34568g = bVar;
        Object a = fVar.mo35247a(AbstractC14210a.class);
        C89219l.m154716b(a, "");
        this.f34562a = (AbstractC14210a) a;
        C88960c<C50816c> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f34565d = cVar;
        AbstractC88979t<C50816c> c = cVar.mo143283c();
        C89219l.m154716b(c, "");
        this.f34570m = c;
    }
}
