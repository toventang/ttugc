package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84435a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel */
public final class InfoStickerListRecommendViewModel extends HumbleViewModel implements AbstractC84640a<EffectCategoryResponse, Effect>, AbstractC84693e<Effect>, AbstractC84693e {

    /* renamed from: a */
    public final C1213t<List<Effect>> f189240a;

    /* renamed from: b */
    public final C1213t<List<C89378p<EffectCategoryResponse, List<Effect>>>> f189241b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<EnumC85026a> f189242c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<EnumC85026a> f189243d;

    /* renamed from: e */
    public C1213t<AbstractC88403ab<List<Effect>>> f189244e;

    /* renamed from: f */
    final AbstractC1204m f189245f;

    /* renamed from: g */
    public final AbstractC84538f f189246g;

    /* renamed from: h */
    public final AbstractC89172b<Effect, Boolean> f189247h;

    /* renamed from: i */
    public final AbstractC89172b<EffectCategoryResponse, Boolean> f189248i;

    /* renamed from: j */
    private C88411a f189249j;

    /* renamed from: k */
    private C84457n f189250k;

    /* renamed from: l */
    private final AbstractC84536d f189251l;

    static {
        Covode.recordClassIndex(98677);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: e */
    public final LiveData<Object> mo129562e() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a
    /* renamed from: a */
    public final LiveData<List<C89378p<EffectCategoryResponse, List<Effect>>>> mo129555a() {
        return this.f189241b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: b */
    public final LiveData<List<Effect>> mo129559b() {
        return this.f189240a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: c */
    public final LiveData<EnumC85026a> mo129560c() {
        return this.f189242c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: d */
    public final LiveData<EnumC85026a> mo129561d() {
        return this.f189243d;
    }

    /* renamed from: h */
    public final C88411a mo129635h() {
        C88411a aVar = this.f189249j;
        if (aVar != null) {
            return aVar;
        }
        C88411a aVar2 = new C88411a();
        this.f189249j = aVar2;
        return aVar2;
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        C88411a aVar = this.f189249j;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f189249j = null;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: g */
    public final void mo129564g() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189242c.getValue();
            if (value == null || value == EnumC85026a.NONE) {
                List<Effect> value2 = this.f189240a.getValue();
                if (value2 == null || !value2.isEmpty()) {
                    EnumC85026a value3 = this.f189243d.getValue();
                    if (value3 == null || !(value3 == EnumC85026a.EMPTY || value3 == EnumC85026a.LOADING)) {
                        this.f189243d.setValue(EnumC85026a.LOADING);
                        throw new NoSuchMethodException("Category sticker list does not support load more action.");
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: f */
    public final void mo129563f() {
        if (!isDestroyed()) {
            EnumC85026a value = this.f189242c.getValue();
            if (value == null || !(value == EnumC85026a.EMPTY || value == EnumC85026a.LOADING)) {
                List<Effect> value2 = this.f189240a.getValue();
                if (value2 != null) {
                    C89219l.m154716b(value2, "");
                    if (true ^ value2.isEmpty()) {
                        return;
                    }
                }
                this.f189242c.setValue(EnumC85026a.LOADING);
                AbstractC84536d dVar = this.f189251l;
                C84457n nVar = this.f189250k;
                if (nVar != null) {
                    AbstractC88403ab b = dVar.mo129423a(nVar).mo143280b((AbstractC88433f) new C84708c(this)).mo143292d(new C84709d(this)).mo143275b();
                    C89219l.m154716b(b, "");
                    mo129635h().mo142945a(b.mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88392a.m153583a()).mo142915a(new C84706a(this), new C84707b(this)));
                    return;
                }
                throw new IllegalArgumentException("ListMeta not fetched yet".toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$b */
    public static final class C84707b<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListRecommendViewModel f189253a;

        static {
            Covode.recordClassIndex(98679);
        }

        C84707b(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f189253a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f189253a.f189242c.setValue(EnumC85026a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$a */
    public static final class C84706a<T> implements AbstractC88433f<List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListRecommendViewModel f189252a;

        static {
            Covode.recordClassIndex(98678);
        }

        C84706a(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f189252a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = this.f189252a;
            C89219l.m154716b(list2, "");
            infoStickerListRecommendViewModel.f189244e.observe(infoStickerListRecommendViewModel.f189245f, new C84711f(infoStickerListRecommendViewModel, list2));
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public final void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        if (mVar instanceof C84457n) {
            this.f189250k = (C84457n) mVar;
            mo129563f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$d */
    public static final class C84709d<T, R> implements AbstractC88434g<C84435a<EffectCategoryResponse, Effect>, List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListRecommendViewModel f189255a;

        static {
            Covode.recordClassIndex(98681);
        }

        C84709d(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f189255a = infoStickerListRecommendViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends Effect> apply(C84435a<EffectCategoryResponse, Effect> aVar) {
            C84435a<EffectCategoryResponse, Effect> aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            List<V> list = aVar2.f188773a;
            if (this.f189255a.f189247h == C84731e.f189327a) {
                return list;
            }
            AbstractC89172b<Effect, Boolean> bVar = this.f189255a.f189247h;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$e */
    public static final class C84710e<T, R> implements AbstractC88434g<C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel>, List<? extends Effect>> {

        /* renamed from: a */
        public static final C84710e f189256a = new C84710e();

        static {
            Covode.recordClassIndex(98682);
        }

        C84710e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends Effect> apply(C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar) {
            C89378p<? extends List<? extends InfoStickerEffect>, ? extends InfoStickerListModel> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            List<T> list = (List) pVar2.component1();
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                arrayList.add(new Effect(t.getLoki_effect()));
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$f */
    static final class C84711f<T> implements AbstractC1214u<AbstractC88403ab<List<? extends Effect>>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListRecommendViewModel f189257a;

        /* renamed from: b */
        final /* synthetic */ List f189258b;

        static {
            Covode.recordClassIndex(98683);
        }

        C84711f(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel, List list) {
            this.f189257a = infoStickerListRecommendViewModel;
            this.f189258b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(AbstractC88403ab<List<? extends Effect>> abVar) {
            AbstractC88403ab<List<? extends Effect>> abVar2 = abVar;
            if (abVar2 == null) {
                this.f189257a.mo129634a(this.f189258b);
                return;
            }
            AbstractC88403ab<List<? extends Effect>> a = abVar2.mo142909a(C88392a.m153583a());
            if (a != null) {
                this.f189257a.mo129635h().mo142945a(a.mo142915a(new AbstractC88433f<List<? extends Effect>>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel.C84711f.C847121 */

                    /* renamed from: a */
                    final /* synthetic */ C84711f f189259a;

                    static {
                        Covode.recordClassIndex(98684);
                    }

                    {
                        this.f189259a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(List<? extends Effect> list) {
                        List<? extends Effect> list2 = list;
                        if (list2 == null || list2.size() == 0) {
                            this.f189259a.f189257a.mo129634a(this.f189259a.f189258b);
                            return;
                        }
                        InfoStickerListRecommendViewModel infoStickerListRecommendViewModel = this.f189259a.f189257a;
                        List list3 = this.f189259a.f189258b;
                        List<C89378p<EffectCategoryResponse, List<Effect>>> value = infoStickerListRecommendViewModel.f189241b.getValue();
                        if (value != null && !value.isEmpty()) {
                            List g = C89070n.m154585g((Collection) list2);
                            g.addAll(C89070n.m154566c((Iterable) list3, value.get(0).getSecond().size()));
                            infoStickerListRecommendViewModel.mo129634a(C89070n.m154590j(g));
                            List g2 = C89070n.m154585g((Collection) value);
                            g2.set(0, new C89378p(((C89378p) g2.get(0)).getFirst(), list2));
                            infoStickerListRecommendViewModel.f189241b.postValue(C89070n.m154590j(g2));
                        }
                    }
                }, new AbstractC88433f<Throwable>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel.C84711f.C847132 */

                    /* renamed from: a */
                    final /* synthetic */ C84711f f189260a;

                    static {
                        Covode.recordClassIndex(98685);
                    }

                    {
                        this.f189260a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Throwable th) {
                        this.f189260a.f189257a.mo129634a(this.f189260a.f189258b);
                    }
                }));
            }
        }
    }

    /* renamed from: a */
    public final void mo129634a(List<? extends Effect> list) {
        EnumC85026a aVar;
        C89219l.m154721d(list, "");
        this.f189240a.setValue(list);
        C1213t<EnumC85026a> tVar = this.f189242c;
        if (list.isEmpty()) {
            aVar = EnumC85026a.EMPTY;
        } else {
            aVar = EnumC85026a.NONE;
        }
        tVar.setValue(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerListRecommendViewModel$c */
    public static final class C84708c<T> implements AbstractC88433f<C84435a<EffectCategoryResponse, Effect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListRecommendViewModel f189254a;

        static {
            Covode.recordClassIndex(98680);
        }

        C84708c(InfoStickerListRecommendViewModel infoStickerListRecommendViewModel) {
            this.f189254a = infoStickerListRecommendViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: h.f.a.b<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C84435a<EffectCategoryResponse, Effect> aVar) {
            List<C89378p<K, List<V>>> list = aVar.f188774b;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (((Boolean) this.f189254a.f189248i.invoke(t.getFirst())).booleanValue()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (T t2 : arrayList2) {
                Object component1 = t2.component1();
                List list2 = (List) t2.component2();
                if (this.f189254a.f189247h != C84731e.f189327a) {
                    AbstractC89172b<Effect, Boolean> bVar = this.f189254a.f189247h;
                    ArrayList arrayList4 = new ArrayList();
                    for (T t3 : list2) {
                        if (bVar.invoke(t3).booleanValue()) {
                            arrayList4.add(t3);
                        }
                    }
                    list2 = arrayList4;
                }
                arrayList3.add(C89387v.m154943a(component1, list2));
            }
            this.f189254a.f189241b.postValue(arrayList3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerListRecommendViewModel(AbstractC1204m mVar, AbstractC84536d dVar, AbstractC84538f fVar, AbstractC89172b<? super Effect, Boolean> bVar, AbstractC89172b<? super EffectCategoryResponse, Boolean> bVar2) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f189245f = mVar;
        this.f189251l = dVar;
        this.f189246g = fVar;
        this.f189247h = bVar;
        this.f189248i = bVar2;
        C1213t<List<Effect>> tVar = new C1213t<>();
        this.f189240a = tVar;
        C1213t<EnumC85026a> tVar2 = new C1213t<>();
        this.f189243d = tVar2;
        this.f189244e = new C1213t<>();
        tVar.setValue(C89086z.INSTANCE);
        tVar2.setValue(EnumC85026a.NONE);
    }
}
