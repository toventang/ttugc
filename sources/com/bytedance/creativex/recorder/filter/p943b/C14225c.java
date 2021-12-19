package com.bytedance.creativex.recorder.filter.p943b;

import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.bytedance.creativex.recorder.filter.p942a.C14212b;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.filter.p942a.C14218h;
import com.bytedance.creativex.recorder.filter.p942a.C14219i;
import com.bytedance.creativex.recorder.filter.p942a.EnumC14222l;
import com.bytedance.creativex.recorder.filter.p946e.C14258a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.filter.C50648c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.StrArray;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50800m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.creativex.recorder.filter.b.c */
public class C14225c<T extends AbstractC14210a> extends AbstractC2562j<T> implements AbstractC14210a, AbstractC21566a {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C14225c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C14225c.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0)};
    public static final int CHOOSE_NO_FILTER = -1;
    public static final C14227b Companion = new C14227b((byte) 0);
    private final C2564l<FilterBean> _curSelectedFilter;
    public final C1213t<C14215e> _currentFilterSource;
    public final C1213t<List<C14215e>> _filterSources;
    private final C2563k<C14218h> _filterSwitchEvent;
    private final C2563k<C14219i> _filterUpdateEvent;
    private final ActivityC0218d activity;
    public final T apiComponent;
    private final C14226a buildIn;
    private final AbstractC89248d cameraApiComponent$delegate;
    private final C14223a componentConfigure;
    public final C2564l<FilterBean> curSelectedFilter;
    public C89378p<? extends FilterBean, C14215e> currentFilter;
    public final C1213t<C14215e> currentFilterSource;
    private final C21582f diContainer;
    private final AbstractC89172b<C14212b, C14212b> filterApplyInterceptor;
    public final AbstractC89171a<Boolean> filterSetupInterceptor;
    public final C1213t<List<C14215e>> filterSources;
    public final C2563k<C14218h> filterSwitchEvent;
    public final C2563k<C14219i> filterUpdateEvent;
    private final AbstractC1214u<List<FilterBean>> pendingFilterResIdSetObserver;
    private final AbstractC1214u<List<FilterBean>> pendingFilterSetObserver;
    private final AbstractC89248d recordControlApi$delegate;

    private final AbstractC14193m getRecordControlApi() {
        return (AbstractC14193m) this.recordControlApi$delegate.mo23374a(this, $$delegatedProperties[1]);
    }

    public final AbstractC14177d getCameraApiComponent() {
        return (AbstractC14177d) this.cameraApiComponent$delegate.mo23374a(this, $$delegatedProperties[0]);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$b */
    public static final class C14227b {
        static {
            Covode.recordClassIndex(16296);
        }

        private C14227b() {
        }

        public /* synthetic */ C14227b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void clearFilterChosen() {
        cleanFilterChosen();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC2547b getApiComponent() {
        return this.apiComponent;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public /* bridge */ /* synthetic */ C2560h getCurSelectedFilter() {
        return this.curSelectedFilter;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public /* bridge */ /* synthetic */ LiveData getCurrentFilterSource() {
        return this.currentFilterSource;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public /* bridge */ /* synthetic */ LiveData getFilterSources() {
        return this.filterSources;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public /* bridge */ /* synthetic */ C2559g getFilterSwitchEvent() {
        return this.filterSwitchEvent;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public /* bridge */ /* synthetic */ C2559g getFilterUpdateEvent() {
        return this.filterUpdateEvent;
    }

    private final void initData() {
        setFilterSourceInternal("build_in");
    }

    public void cleanFilterChosen() {
        this.currentFilter = null;
        applyFilter2Camera$default(this, null, null, 2, null);
        this._curSelectedFilter.mo7019b(null);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        initData();
        initObserve();
    }

    private final boolean isCurrentFilterSourceDisable() {
        String str;
        C14215e value = this._currentFilterSource.getValue();
        if (value == null || (str = value.f34497a) == null) {
            return false;
        }
        return isFilterDisableInternal(str);
    }

    static {
        Covode.recordClassIndex(16294);
    }

    private final C14215e buildInFilterSource() {
        return new C14215e("build_in", this.buildIn.f34514a, C50800m.m95128a(this.buildIn.f34515b, C14258a.m26000a(getCameraApiComponent().mo22835w())), this.buildIn.f34516c);
    }

    private final void initObserve() {
        getCameraApiComponent().mo22818g().mo7036a(this.activity, new C14230e(this));
        getCameraApiComponent().mo22821i().mo6997a(this, new C14231f(this));
        getRecordControlApi().mo22905l().mo6997a(this, new C14232g(this));
        getRecordControlApi().mo22902i().mo6997a(this, new C14233h(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$i */
    static final class C14234i<T> implements AbstractC1214u<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34523a;

        static {
            Covode.recordClassIndex(16303);
        }

        C14234i(C14225c cVar) {
            this.f34523a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            C14225c.setChosenFilterFromStoreInternal$default(this.f34523a, true, false, false, 4, null);
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$j */
    static final class C14235j<T> implements AbstractC1214u<List<? extends FilterBean>> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34524a;

        static {
            Covode.recordClassIndex(16304);
        }

        C14235j(C14225c cVar) {
            this.f34524a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends FilterBean> list) {
            C14225c.setChosenFilterFromStoreInternal$default(this.f34524a, true, false, false, 4, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void addFilterSource(C14215e eVar) {
        C89219l.m154721d(eVar, "");
        addFilterSourceInternal(eVar);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public boolean isFilterDisable(String str) {
        C89219l.m154721d(str, "");
        return isFilterDisableInternal(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void removeFilterSource(String str) {
        C89219l.m154721d(str, "");
        removeFilterSourceInternal(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterFromStore(boolean z) {
        setChosenFilterFromStoreInternal$default(this, z, true, false, 4, null);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void useFilterSource(String str) {
        C89219l.m154721d(str, "");
        setFilterSourceInternal(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$f */
    public static final class C14231f<T> implements AbstractC2565m<Integer> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34520a;

        static {
            Covode.recordClassIndex(16300);
        }

        C14231f(C14225c cVar) {
            this.f34520a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Integer num) {
            AbstractC89171a<Boolean> aVar = this.f34520a.filterSetupInterceptor;
            if (aVar == null || !aVar.invoke().booleanValue()) {
                C14225c.setChosenFilterFromStoreInternal$default(this.f34520a, true, false, false, 6, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$d */
    public static final class C14229d extends AbstractC89220m implements AbstractC89172b<C89378p<? extends FilterBean, ? extends C14215e>, Integer> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34518a;

        static {
            Covode.recordClassIndex(16298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14229d(C14225c cVar) {
            super(1);
            this.f34518a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(C89378p<? extends FilterBean, ? extends C14215e> pVar) {
            C89378p<? extends FilterBean, ? extends C14215e> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            List<C14215e> value = this.f34518a._filterSources.getValue();
            int i = 0;
            if (value != null) {
                Iterator<C14215e> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C89219l.m154714a((Object) it.next().f34497a, (Object) ((C14215e) pVar2.getSecond()).f34497a)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    private final boolean isFilterDisableInternal(String str) {
        T t;
        AbstractC14220j jVar;
        List<C14215e> value = this._filterSources.getValue();
        if (value == null) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.f34497a, (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (jVar = t2.f34500d) == null) {
            return false;
        }
        return jVar.mo22980a();
    }

    public void actualApplyFilter2Camera(C14212b bVar) {
        if (bVar == null) {
            getCameraApiComponent().mo22785a("");
        } else if (bVar.f34496d == null) {
            getCameraApiComponent().mo22785a(bVar.f34495c);
        } else {
            getCameraApiComponent().mo22786a(bVar.f34495c, bVar.f34496d.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$c */
    public static final class C14228c extends AbstractC89220m implements AbstractC89172b<C89378p<? extends FilterBean, ? extends C14215e>, Integer> {

        /* renamed from: a */
        final /* synthetic */ C14215e f34517a;

        static {
            Covode.recordClassIndex(16297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14228c(C14215e eVar) {
            super(1);
            this.f34517a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(C89378p<? extends FilterBean, ? extends C14215e> pVar) {
            C89378p<? extends FilterBean, ? extends C14215e> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            List<FilterBean> value = this.f34517a.f34498b.mo86071f().mo86074a().getValue();
            int i = 0;
            if (value != null) {
                Iterator<FilterBean> it = value.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (it.next().getId() == ((FilterBean) pVar2.getFirst()).getId()) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$e */
    public static final class C14230e<T> implements AbstractC2565m<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34519a;

        static {
            Covode.recordClassIndex(16299);
        }

        C14230e(C14225c cVar) {
            this.f34519a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Boolean bool) {
            C89378p<? extends FilterBean, C14215e> pVar;
            AbstractC14220j jVar;
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                AbstractC89171a<Boolean> aVar = this.f34519a.filterSetupInterceptor;
                if (aVar == null || !aVar.invoke().booleanValue()) {
                    C14215e value = this.f34519a._currentFilterSource.getValue();
                    if ((value == null || (jVar = value.f34500d) == null || !jVar.mo22980a()) && (pVar = this.f34519a.currentFilter) != null) {
                        C14225c.applyFilter2Camera$default(this.f34519a, pVar, null, 2, null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$g */
    public static final class C14232g<T> implements AbstractC2565m<C14207x> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34521a;

        static {
            Covode.recordClassIndex(16301);
        }

        C14232g(C14225c cVar) {
            this.f34521a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14207x xVar) {
            FilterBean filterBean;
            C89378p<? extends FilterBean, C14215e> pVar = this.f34521a.currentFilter;
            if (pVar != null && (filterBean = (FilterBean) pVar.getFirst()) != null) {
                if (filterBean.getEnName() != null) {
                    this.f34521a.getCameraApiComponent().mo22803b().f155642G.f155724a.addIndex();
                    this.f34521a.getCameraApiComponent().mo22803b().f155642G.f155726c.addIndex();
                }
                if (filterBean != null && String.valueOf(filterBean.getId()) != null) {
                    this.f34521a.getCameraApiComponent().mo22803b().f155642G.f155725b.addIndex();
                }
            }
        }
    }

    private final void addFilterSourceInternal(C14215e eVar) {
        List<C14215e> arrayList;
        List<C14215e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.f34497a, (Object) eVar.f34497a)) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        C1213t<List<C14215e>> tVar = this._filterSources;
        List<C14215e> value2 = tVar.getValue();
        if (value2 != null) {
            arrayList = C89070n.m154585g((Collection) value2);
        } else {
            arrayList = new ArrayList<>();
        }
        arrayList.add(eVar);
        tVar.setValue(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: androidx.lifecycle.t<java.util.List<com.bytedance.creativex.recorder.filter.a.e>> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void removeFilterSourceInternal(String str) {
        List list;
        List<C14215e> value = this._filterSources.getValue();
        if (value != null) {
            for (T t : value) {
                if (C89219l.m154714a((Object) t.f34497a, (Object) str)) {
                    if (t != null) {
                        C1213t<List<C14215e>> tVar = this._filterSources;
                        List list2 = (List) tVar.getValue();
                        if (list2 != null) {
                            list = new ArrayList();
                            for (Object obj : list2) {
                                if (!C89219l.m154714a((Object) ((C14215e) obj).f34497a, (Object) str)) {
                                    list.add(obj);
                                }
                            }
                        } else {
                            list = C89086z.INSTANCE;
                        }
                        tVar.setValue(list);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final void syncDataOnFilterChosen(C89378p<? extends FilterBean, C14215e> pVar) {
        if (!getRecordControlApi().mo22891c().mo7034a().booleanValue()) {
            getCameraApiComponent().mo22803b().f155642G.f155724a.add(((FilterBean) pVar.getFirst()).getEnName());
            getCameraApiComponent().mo22803b().f155642G.f155725b.add(((FilterBean) pVar.getFirst()).getEnName());
            getCameraApiComponent().mo22803b().f155642G.f155726c.add(String.valueOf(C50691c.m94984a(pVar.getSecond().f34499c, (FilterBean) pVar.getFirst())));
        }
        actualSaveDefaultFilte((FilterBean) pVar.getFirst(), pVar.getSecond().f34500d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$h */
    public static final class C14233h<T> implements AbstractC2565m<C14206w> {

        /* renamed from: a */
        final /* synthetic */ C14225c f34522a;

        static {
            Covode.recordClassIndex(16302);
        }

        C14233h(C14225c cVar) {
            this.f34522a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(C14206w wVar) {
            FilterBean filterBean;
            String str;
            AbstractC14220j jVar;
            int i;
            C14215e second;
            AbstractC50705m mVar;
            C89378p<? extends FilterBean, C14215e> pVar = this.f34522a.currentFilter;
            String str2 = null;
            if (pVar != null) {
                filterBean = (FilterBean) pVar.getFirst();
                if (filterBean != null) {
                    str = filterBean.getEnName();
                }
                str = null;
            } else {
                filterBean = null;
                str = null;
            }
            if (str != null) {
                this.f34522a.getCameraApiComponent().mo22803b().f155642G.f155724a.add(str);
                C89378p<? extends FilterBean, C14215e> pVar2 = this.f34522a.currentFilter;
                if (pVar2 == null || (second = pVar2.getSecond()) == null || (mVar = second.f34499c) == null) {
                    i = 0;
                } else {
                    i = Float.valueOf(C50691c.m94984a(mVar, filterBean));
                }
                this.f34522a.getCameraApiComponent().mo22803b().f155642G.f155726c.add(i.toString());
            }
            StrArray strArray = this.f34522a.getCameraApiComponent().mo22803b().f155642G.f155725b;
            C14215e value = this.f34522a._currentFilterSource.getValue();
            C89219l.m154721d(strArray, "");
            if (value != null && (jVar = value.f34500d) != null && jVar.mo22980a()) {
                str2 = "";
            } else if (filterBean != null) {
                str2 = String.valueOf(filterBean.getId());
            }
            strArray.add(str2);
        }
    }

    private final void setFilterSourceInternal(String str) {
        String str2;
        List<C14215e> value;
        boolean z;
        AbstractC50707o oVar;
        AbstractC50709q f;
        LiveData<List<FilterBean>> b;
        AbstractC50707o oVar2;
        AbstractC50709q f2;
        LiveData<List<FilterBean>> b2;
        C14215e value2 = this._currentFilterSource.getValue();
        T t = null;
        if (value2 != null) {
            str2 = value2.f34497a;
        } else {
            str2 = null;
        }
        if (!C89219l.m154714a((Object) str2, (Object) str) && (value = this._filterSources.getValue()) != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.f34497a, (Object) str)) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                this._currentFilterSource.setValue(t2);
                if (!(value2 == null || (oVar2 = value2.f34498b) == null || (f2 = oVar2.mo86071f()) == null || (b2 = f2.mo86075b()) == null)) {
                    b2.removeObserver(this.pendingFilterSetObserver);
                }
                t2.f34498b.mo86071f().mo86075b().observe(this.activity, this.pendingFilterSetObserver);
                if (!(value2 == null || (oVar = value2.f34498b) == null || (f = oVar.mo86071f()) == null || (b = f.mo86075b()) == null)) {
                    b.removeObserver(this.pendingFilterResIdSetObserver);
                }
                t2.f34498b.mo86071f().mo86075b().observe(this.activity, this.pendingFilterResIdSetObserver);
                if (value2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                setChosenFilterFromStoreInternal$default(this, z, false, false, 6, null);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterDisable(boolean z, String str) {
        C89219l.m154721d(str, "");
        setFilterDisableInternal(z, str);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterIntensity(FilterBean filterBean, float f) {
        C89219l.m154721d(filterBean, "");
        setFilterIntensityInternal(filterBean, f);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterProgress(FilterBean filterBean, int i) {
        C89219l.m154721d(filterBean, "");
        setFilterProgressInternal(filterBean, i);
    }

    public void actualSaveDefaultFilte(FilterBean filterBean, AbstractC14220j jVar) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(jVar, "");
        jVar.mo22978a(getCameraApiComponent().mo22757K(), filterBean.getId());
    }

    private final void applyFilter2Camera(C89378p<? extends FilterBean, C14215e> pVar, Float f) {
        float a;
        C14212b invoke;
        if (pVar == null) {
            actualApplyFilter2Camera(null);
            return;
        }
        if (f != null) {
            a = f.floatValue();
        } else {
            a = pVar.getSecond().f34499c.mo86055a((FilterBean) pVar.getFirst());
        }
        C14212b bVar = new C14212b((FilterBean) pVar.getFirst(), pVar.getSecond(), C50687a.m94981b((FilterBean) pVar.getFirst()), Float.valueOf(a));
        AbstractC89172b<C14212b, C14212b> bVar2 = this.filterApplyInterceptor;
        if (!(bVar2 == null || (invoke = bVar2.invoke(bVar)) == null)) {
            bVar = invoke;
        }
        actualApplyFilter2Camera(bVar);
    }

    private final void dispatchSwitch(C89378p<? extends FilterBean, C14215e> pVar, C89378p<? extends FilterBean, C14215e> pVar2) {
        AbstractC89172b dVar;
        EnumC14222l lVar;
        C89378p pVar3 = null;
        if (!(pVar == null || pVar.getFirst() == null)) {
            pVar3 = C89387v.m154943a(pVar.getFirst(), pVar.getSecond());
        }
        C89378p a = C89387v.m154943a(pVar2.getFirst(), pVar2.getSecond());
        if (pVar3 == null) {
            lVar = EnumC14222l.RIGHT_TO_LEFT;
        } else {
            if (C89219l.m154714a((Object) ((C14215e) pVar3.getSecond()).f34497a, (Object) ((C14215e) a.getSecond()).f34497a)) {
                dVar = new C14228c((C14215e) pVar3.getSecond());
            } else {
                dVar = new C14229d(this);
            }
            if (((Number) dVar.invoke(pVar3)).intValue() <= ((Number) dVar.invoke(a)).intValue()) {
                lVar = EnumC14222l.RIGHT_TO_LEFT;
            } else {
                lVar = EnumC14222l.LEFT_TO_RIGHT;
            }
        }
        this._filterSwitchEvent.mo6999a(new C14218h(pVar3, a, lVar));
    }

    private final void setFilterDisableInternal(boolean z, String str) {
        String str2;
        AbstractC14220j jVar;
        C14215e value = this._currentFilterSource.getValue();
        T t = null;
        if (value != null) {
            str2 = value.f34497a;
        } else {
            str2 = null;
        }
        if (C89219l.m154714a((Object) str2, (Object) str) && z) {
            cleanFilterChosen();
        }
        List<C14215e> value2 = this._filterSources.getValue();
        if (value2 != null) {
            Iterator<T> it = value2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C89219l.m154714a((Object) next.f34497a, (Object) str)) {
                    t = next;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null && (jVar = t2.f34500d) != null) {
                jVar.mo22979a(z);
            }
        }
    }

    private final void setFilterIntensityInternal(FilterBean filterBean, float f) {
        T t;
        AbstractC50705m mVar;
        List<C14215e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f34498b.mo86061a(filterBean.getId()) != null) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (mVar = t2.f34499c) == null)) {
                mVar.mo86057a(filterBean, f);
            }
        }
        C89378p<? extends FilterBean, C14215e> pVar = this.currentFilter;
        if (pVar != null && C89219l.m154714a(pVar.getFirst(), filterBean)) {
            applyFilter2Camera(pVar, Float.valueOf(f));
        }
    }

    private final void setFilterProgressInternal(FilterBean filterBean, int i) {
        T t;
        AbstractC50705m mVar;
        List<C14215e> value = this._filterSources.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.f34498b.mo86061a(filterBean.getId()) != null) {
                    break;
                }
            }
            T t2 = t;
            if (!(t2 == null || (mVar = t2.f34499c) == null)) {
                mVar.mo86057a(filterBean, C50648c.m94907a(filterBean, i, mVar.mo86056a()));
            }
        }
        C89378p<? extends FilterBean, C14215e> pVar = this.currentFilter;
        if (pVar != null && C89219l.m154714a(pVar.getFirst(), filterBean)) {
            applyFilter2Camera$default(this, pVar, null, 2, null);
        }
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f) {
        C89219l.m154721d(filterBean, "");
        C89219l.m154721d(filterBean2, "");
        setFilterScrollInternal(filterBean, filterBean2, f);
    }

    /* renamed from: com.bytedance.creativex.recorder.filter.b.c$a */
    public static final class C14226a {

        /* renamed from: a */
        public final AbstractC50707o f34514a;

        /* renamed from: b */
        public final AbstractC50706n f34515b;

        /* renamed from: c */
        public final AbstractC14220j f34516c;

        static {
            Covode.recordClassIndex(16295);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14226a)) {
                return false;
            }
            C14226a aVar = (C14226a) obj;
            return C89219l.m154714a(this.f34514a, aVar.f34514a) && C89219l.m154714a(this.f34515b, aVar.f34515b) && C89219l.m154714a(this.f34516c, aVar.f34516c);
        }

        public final int hashCode() {
            AbstractC50707o oVar = this.f34514a;
            int i = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            AbstractC50706n nVar = this.f34515b;
            int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
            AbstractC14220j jVar = this.f34516c;
            if (jVar != null) {
                i = jVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "BuildInFilterSource(repository=" + this.f34514a + ", intensityStore=" + this.f34515b + ", logicStore=" + this.f34516c + ")";
        }

        public C14226a(AbstractC50707o oVar, AbstractC50706n nVar, AbstractC14220j jVar) {
            C89219l.m154721d(oVar, "");
            C89219l.m154721d(nVar, "");
            C89219l.m154721d(jVar, "");
            this.f34514a = oVar;
            this.f34515b = nVar;
            this.f34516c = jVar;
        }
    }

    public void actualSetFilterScroll(C14212b bVar, C14212b bVar2, float f) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        getCameraApiComponent().mo22784a(C89387v.m154943a(bVar.f34495c, bVar.f34496d), C89387v.m154943a(bVar2.f34495c, bVar2.f34496d), f);
    }

    private final void setFilterScrollInternal(FilterBean filterBean, FilterBean filterBean2, float f) {
        C14212b invoke;
        C14212b invoke2;
        C14215e value = this._currentFilterSource.getValue();
        if (value == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(value, "");
        C14215e eVar = value;
        C14212b bVar = new C14212b(filterBean, eVar, C50687a.m94981b(filterBean), Float.valueOf(eVar.f34499c.mo86055a(filterBean)));
        AbstractC89172b<C14212b, C14212b> bVar2 = this.filterApplyInterceptor;
        if (!(bVar2 == null || (invoke2 = bVar2.invoke(bVar)) == null)) {
            bVar = invoke2;
        }
        C14212b bVar3 = new C14212b(filterBean2, eVar, C50687a.m94981b(filterBean2), Float.valueOf(eVar.f34499c.mo86055a(filterBean2)));
        AbstractC89172b<C14212b, C14212b> bVar4 = this.filterApplyInterceptor;
        if (!(bVar4 == null || (invoke = bVar4.invoke(bVar3)) == null)) {
            bVar3 = invoke;
        }
        actualSetFilterScroll(bVar, bVar3, f);
    }

    /* access modifiers changed from: protected */
    public final void setChosenFilterFromStoreInternal(boolean z, boolean z2, boolean z3) {
        C14215e value;
        Integer valueOf;
        T t;
        if (!isCurrentFilterSourceDisable() && (value = this._currentFilterSource.getValue()) != null) {
            AbstractC14220j jVar = value.f34500d;
            T t2 = null;
            if (jVar instanceof AbstractC14236d) {
                String b = ((AbstractC14236d) jVar).mo22994b();
                List<FilterBean> value2 = value.f34498b.mo86071f().mo86075b().getValue();
                if (value2 != null) {
                    Iterator<T> it = value2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (C89219l.m154714a((Object) next.getResId(), (Object) b)) {
                            t2 = next;
                            break;
                        }
                    }
                    t = t2;
                }
                cleanFilterChosen();
            }
            C70650dt j = getCameraApiComponent().mo22803b().mo109898j();
            if ((j == null || j.isEmpty()) && this.componentConfigure.f34510a) {
                valueOf = Integer.valueOf(CHOOSE_NO_FILTER);
            } else {
                valueOf = Integer.valueOf(jVar.mo22977a(getCameraApiComponent().mo22757K()));
            }
            List<FilterBean> value3 = value.f34498b.mo86071f().mo86075b().getValue();
            if (value3 != null) {
                Iterator<T> it2 = value3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (next2.getId() == valueOf.intValue()) {
                        t2 = next2;
                        break;
                    }
                }
                t = t2;
            }
            cleanFilterChosen();
            if (t != null) {
                setFilterChosenInternal(t, null, z, false, z2, z3);
                return;
            }
            cleanFilterChosen();
        }
    }

    static /* synthetic */ void applyFilter2Camera$default(C14225c cVar, C89378p pVar, Float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                f = null;
            }
            cVar.applyFilter2Camera(pVar, f);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyFilter2Camera");
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a
    public void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3) {
        C89219l.m154721d(filterBean, "");
        setFilterChosenInternal$default(this, filterBean, str, z, z2, z3, false, 32, null);
    }

    public static /* synthetic */ void setChosenFilterFromStoreInternal$default(C14225c cVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = true;
            }
            if ((i & 4) != 0) {
                z3 = false;
            }
            cVar.setChosenFilterFromStoreInternal(z, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChosenFilterFromStoreInternal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: h.f.a.b<? super com.bytedance.creativex.recorder.filter.a.b, com.bytedance.creativex.recorder.filter.a.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14225c(C21582f fVar, ActivityC0218d dVar, C14226a aVar, AbstractC89172b<? super C14212b, C14212b> bVar, AbstractC89171a<Boolean> aVar2, AbstractC89172b<? super C14223a, C89391z> bVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.diContainer = fVar;
        this.activity = dVar;
        this.buildIn = aVar;
        this.filterApplyInterceptor = bVar;
        this.filterSetupInterceptor = aVar2;
        this.cameraApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.recordControlApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        C2564l<FilterBean> lVar = new C2564l<>(null);
        this._curSelectedFilter = lVar;
        C1213t<List<C14215e>> tVar = new C1213t<>();
        tVar.setValue(C89070n.m154516a(buildInFilterSource()));
        this._filterSources = tVar;
        C1213t<C14215e> tVar2 = new C1213t<>();
        this._currentFilterSource = tVar2;
        C2563k<C14219i> kVar = new C2563k<>();
        this._filterUpdateEvent = kVar;
        C2563k<C14218h> kVar2 = new C2563k<>();
        this._filterSwitchEvent = kVar2;
        this.pendingFilterSetObserver = new C14235j(this);
        this.pendingFilterResIdSetObserver = new C14234i(this);
        C14223a aVar3 = new C14223a((byte) 0);
        this.componentConfigure = aVar3;
        if (bVar2 != null) {
            bVar2.invoke(aVar3);
        }
        this.apiComponent = this;
        this.curSelectedFilter = lVar;
        this.currentFilterSource = tVar2;
        this.filterSources = tVar;
        this.filterSwitchEvent = kVar2;
        this.filterUpdateEvent = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.bytedance.als.l<com.ss.android.ugc.aweme.filter.FilterBean> */
    /* JADX WARN: Multi-variable type inference failed */
    private final void setFilterChosenInternal(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (isCurrentFilterSourceDisable()) {
            if (z2) {
                C14215e value = this._currentFilterSource.getValue();
                if (value != null) {
                    this.apiComponent.setFilterDisable(false, value.f34497a);
                }
            } else {
                return;
            }
        }
        C89378p<? extends FilterBean, C14215e> pVar = this.currentFilter;
        if (pVar != null) {
            if (C89219l.m154714a(pVar.getFirst(), filterBean) && !z3) {
                return;
            }
            if (C89219l.m154714a(pVar.getFirst(), filterBean) && z3) {
                z = false;
            }
        }
        C14215e value2 = this._currentFilterSource.getValue();
        if (value2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(value2, "");
        C14215e eVar = value2;
        if (C50691c.m94989a(eVar.f34498b, filterBean)) {
            C89378p<? extends FilterBean, C14215e> pVar2 = this.currentFilter;
            filterBean.setSaveFilter2BeautySequence(!z4);
            C89378p<? extends FilterBean, C14215e> a = C89387v.m154943a(filterBean, eVar);
            this.currentFilter = a;
            applyFilter2Camera$default(this, a, null, 2, null);
            syncDataOnFilterChosen(a);
            this._curSelectedFilter.mo7019b(a.getFirst());
            this._filterUpdateEvent.mo6999a(new C14219i((FilterBean) a.getFirst(), eVar, z2, str));
            if (z) {
                dispatchSwitch(pVar2, a);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14225c(C21582f fVar, ActivityC0218d dVar, C14226a aVar, AbstractC89172b bVar, AbstractC89171a aVar2, AbstractC89172b bVar2, int i, C89214g gVar) {
        this(fVar, dVar, aVar, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : aVar2, (i & 32) == 0 ? bVar2 : null);
    }

    static /* synthetic */ void setFilterChosenInternal$default(C14225c cVar, FilterBean filterBean, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                z3 = false;
            }
            if ((i & 32) != 0) {
                z4 = false;
            }
            cVar.setFilterChosenInternal(filterBean, str, z, z2, z3, z4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFilterChosenInternal");
    }
}
