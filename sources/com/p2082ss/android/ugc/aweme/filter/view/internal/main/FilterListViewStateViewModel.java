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
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel */
public final class FilterListViewStateViewModel extends HumbleViewModel implements AbstractC33974au, AbstractC50936s {

    /* renamed from: a */
    public final C1213t<Map<FilterBean, EnumC50699g>> f117332a = new C1213t<>();

    /* renamed from: b */
    public List<? extends FilterBean> f117333b;

    /* renamed from: c */
    private AbstractC88412b f117334c;

    /* renamed from: d */
    private final AbstractC88433f<C50697e> f117335d = new C50856a(this);

    /* renamed from: e */
    private final AbstractC50707o f117336e;

    static {
        Covode.recordClassIndex(60030);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.AbstractC50936s
    /* renamed from: a */
    public final LiveData<Map<FilterBean, EnumC50699g>> mo86241a() {
        return this.f117332a;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        AbstractC88412b bVar = this.f117334c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f117334c = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel$a */
    static final class C50856a<T> implements AbstractC88433f<C50697e> {

        /* renamed from: a */
        final /* synthetic */ FilterListViewStateViewModel f117337a;

        static {
            Covode.recordClassIndex(60031);
        }

        C50856a(FilterListViewStateViewModel filterListViewStateViewModel) {
            this.f117337a = filterListViewStateViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50697e eVar) {
            C50697e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            C50696d dVar = eVar2.f117046b;
            List<? extends FilterBean> list = this.f117337a.f117333b;
            if (list != null) {
                for (T t : list) {
                    if (t.getId() == dVar.f117041a) {
                        if (t != null) {
                            Map<FilterBean, EnumC50699g> value = this.f117337a.f117332a.getValue();
                            if (value == null) {
                                value = C89041ag.m154415a();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.putAll(value);
                            linkedHashMap.put(t, dVar.f117042b);
                            this.f117337a.f117332a.setValue(linkedHashMap);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.view.internal.main.AbstractC50936s
    /* renamed from: a */
    public final void mo86242a(List<? extends FilterBean> list) {
        C89219l.m154721d(list, "");
        this.f117333b = list;
        C1213t<Map<FilterBean, EnumC50699g>> tVar = this.f117332a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t, this.f117336e.mo86066b(t.getId()));
        }
        tVar.setValue(linkedHashMap);
        if ((!list.isEmpty()) && !isDestroyed() && this.f117334c == null) {
            this.f117334c = this.f117336e.mo86070e().mo143261a(C88392a.m153583a()).mo143254a(this.f117335d, C88446a.f200698d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterListViewStateViewModel(AbstractC1204m mVar, AbstractC50707o oVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        this.f117336e = oVar;
    }
}
