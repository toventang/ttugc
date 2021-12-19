package com.p2082ss.android.ugc.aweme.filter.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50697e;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.filter.view.internal.AbstractC50828d;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel */
public class FilterListViewSelectionViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC50935r {

    /* renamed from: a */
    public FilterBean f117326a;

    /* renamed from: b */
    private final C1213t<FilterBean> f117327b = new C1213t<>();

    /* renamed from: c */
    private AbstractC88412b f117328c;

    /* renamed from: d */
    private final AbstractC50707o f117329d;

    /* renamed from: e */
    private final AbstractC50828d f117330e;

    static {
        Covode.recordClassIndex(60028);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.AbstractC50935r
    /* renamed from: a */
    public final LiveData<FilterBean> mo86238a() {
        return this.f117327b;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        AbstractC88412b bVar = this.f117328c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f117328c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86240b(FilterBean filterBean) {
        AbstractC50828d dVar;
        this.f117326a = null;
        this.f117327b.setValue(filterBean);
        if (filterBean != null && (dVar = this.f117330e) != null) {
            dVar.mo86211a(filterBean);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel$a */
    static final class C50855a<T> implements AbstractC88433f<List<C50697e>> {

        /* renamed from: a */
        final /* synthetic */ FilterListViewSelectionViewModel f117331a;

        static {
            Covode.recordClassIndex(60029);
        }

        C50855a(FilterListViewSelectionViewModel filterListViewSelectionViewModel) {
            this.f117331a = filterListViewSelectionViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<C50697e> list) {
            FilterBean filterBean;
            List<C50697e> list2 = list;
            C89219l.m154721d(list2, "");
            for (T t : list2) {
                C50696d dVar = t.f117046b;
                if (dVar.f117042b == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS && (filterBean = this.f117331a.f117326a) != null && filterBean.getId() == dVar.f117041a) {
                    if (t != null) {
                        FilterListViewSelectionViewModel filterListViewSelectionViewModel = this.f117331a;
                        filterListViewSelectionViewModel.mo86240b(filterListViewSelectionViewModel.f117326a);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.AbstractC50935r
    /* renamed from: a */
    public final void mo86239a(FilterBean filterBean) {
        if (filterBean == null) {
            mo86240b(null);
        } else if (C50691c.m94989a(this.f117329d, filterBean)) {
            mo86240b(filterBean);
        } else {
            this.f117326a = filterBean;
            this.f117329d.mo86062a(filterBean);
        }
        if (this.f117326a != null && !isDestroyed() && this.f117328c == null) {
            this.f117328c = this.f117329d.mo86070e().mo143284c(1000, TimeUnit.MILLISECONDS).mo143261a(C88392a.m153583a()).mo143254a(new C50855a(this), C88446a.f200698d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterListViewSelectionViewModel(AbstractC1204m mVar, AbstractC50707o oVar, AbstractC50828d dVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        this.f117329d = oVar;
        this.f117330e = dVar;
    }
}
