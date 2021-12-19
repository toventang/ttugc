package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84533a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84435a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84457n;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel */
public final class InfoStickerListNewViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements AbstractC84640a<EffectCategoryModel, InfoStickerEffect>, AbstractC84640a {

    /* renamed from: d */
    public final C1213t<List<C89378p<EffectCategoryModel, List<InfoStickerEffect>>>> f189518d;

    /* renamed from: e */
    public final C1213t<List<C89378p<EffectCategoryModel, List<InfoStickerEffect>>>> f189519e;

    /* renamed from: f */
    public final C1213t<List<InfoStickerEffect>> f189520f;

    /* renamed from: g */
    public final AbstractC1204m f189521g;

    /* renamed from: h */
    public final AbstractC89172b<InfoStickerEffect, Boolean> f189522h;

    /* renamed from: i */
    public final boolean f189523i;

    /* renamed from: j */
    private C84457n f189524j;

    /* renamed from: k */
    private final AbstractC84533a f189525k;

    static {
        Covode.recordClassIndex(98795);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84640a
    /* renamed from: a */
    public final LiveData<List<C89378p<EffectCategoryModel, List<InfoStickerEffect>>>> mo129555a() {
        return this.f189518d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: i */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129566i() {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: h */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129565h() {
        if (this.f189523i) {
            C89233z.C89234a aVar = new C89233z.C89234a();
            aVar.element = false;
            this.f189120a.observe(this.f189521g, new C84816a(this, aVar));
        }
        AbstractC84533a aVar2 = this.f189525k;
        if (this.f189524j != null) {
            AbstractC88403ab<R> b = aVar2.mo129476b().mo143280b(new C84819b(this)).mo143292d(new C84820c(this)).mo143275b();
            C89219l.m154716b(b, "");
            return b;
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public final void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        if (mVar instanceof C84457n) {
            this.f189524j = (C84457n) mVar;
            mo129563f();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel$a */
    static final class C84816a<T> implements AbstractC1214u<List<? extends InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListNewViewModel f189526a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f189527b;

        static {
            Covode.recordClassIndex(98796);
        }

        C84816a(InfoStickerListNewViewModel infoStickerListNewViewModel, C89233z.C89234a aVar) {
            this.f189526a = infoStickerListNewViewModel;
            this.f189527b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            if (!this.f189527b.element) {
                C89219l.m154716b(list2, "");
                if (!list2.isEmpty()) {
                    this.f189526a.f189520f.observe(this.f189526a.f189521g, new AbstractC1214u<List<? extends InfoStickerEffect>>(this) {
                        /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel.C84816a.C848171 */

                        /* renamed from: a */
                        final /* synthetic */ C84816a f189528a;

                        static {
                            Covode.recordClassIndex(98797);
                        }

                        {
                            this.f189528a = r1;
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // androidx.lifecycle.AbstractC1214u
                        public final /* synthetic */ void onChanged(List<? extends InfoStickerEffect> list) {
                            final List<? extends InfoStickerEffect> list2 = list;
                            this.f189528a.f189526a.f189519e.observe(this.f189528a.f189526a.f189521g, new AbstractC1214u<List<? extends C89378p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>>>(this) {
                                /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel.C84816a.C848171.C848181 */

                                /* renamed from: a */
                                final /* synthetic */ C848171 f189529a;

                                static {
                                    Covode.recordClassIndex(98798);
                                }

                                {
                                    this.f189529a = r1;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // androidx.lifecycle.AbstractC1214u
                                public final /* synthetic */ void onChanged(List<? extends C89378p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>> list) {
                                    Object obj;
                                    List<? extends C89378p<? extends EffectCategoryModel, ? extends List<? extends InfoStickerEffect>>> list2 = list;
                                    InfoStickerListNewViewModel infoStickerListNewViewModel = this.f189529a.f189528a.f189526a;
                                    List list3 = list2;
                                    C89219l.m154716b(list3, "");
                                    int size = ((List) ((C89378p) list2.get(0)).getSecond()).size();
                                    C89219l.m154721d(list3, "");
                                    List g = C89070n.m154585g((Collection) list3);
                                    List<DATA> value = infoStickerListNewViewModel.f189120a.getValue();
                                    if (value == null || (obj = C89070n.m154566c((Iterable) value, size)) == null) {
                                        obj = C89086z.INSTANCE;
                                    }
                                    g.addAll(obj);
                                    infoStickerListNewViewModel.f189120a.setValue(C89070n.m154590j(g));
                                    C89219l.m154716b(list2, "");
                                    List g2 = C89070n.m154585g((Collection) list2);
                                    g2.set(0, new C89378p(((C89378p) g2.get(0)).getFirst(), list2));
                                    this.f189529a.f189528a.f189526a.f189518d.postValue(C89070n.m154590j(g2));
                                }
                            });
                        }
                    });
                    this.f189527b.element = true;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel$c */
    static final class C84820c<T, R> implements AbstractC88434g<C84435a<EffectCategoryModel, InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListNewViewModel f189532a;

        static {
            Covode.recordClassIndex(98800);
        }

        C84820c(InfoStickerListNewViewModel infoStickerListNewViewModel) {
            this.f189532a = infoStickerListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(C84435a<EffectCategoryModel, InfoStickerEffect> aVar) {
            C84435a<EffectCategoryModel, InfoStickerEffect> aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            List<V> list = aVar2.f188773a;
            if (this.f189532a.f189522h == C84825a.f189546a) {
                return list;
            }
            AbstractC89172b<InfoStickerEffect, Boolean> bVar = this.f189532a.f189522h;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerListNewViewModel$b */
    static final class C84819b<T> implements AbstractC88433f<C84435a<EffectCategoryModel, InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerListNewViewModel f189531a;

        static {
            Covode.recordClassIndex(98799);
        }

        C84819b(InfoStickerListNewViewModel infoStickerListNewViewModel) {
            this.f189531a = infoStickerListNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C84435a<EffectCategoryModel, InfoStickerEffect> aVar) {
            List<C89378p<K, List<V>>> list = aVar.f188774b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                Object component1 = t.component1();
                List list2 = (List) t.component2();
                if (this.f189531a.f189522h != C84825a.f189546a) {
                    AbstractC89172b<InfoStickerEffect, Boolean> bVar = this.f189531a.f189522h;
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : list2) {
                        if (bVar.invoke(t2).booleanValue()) {
                            arrayList2.add(t2);
                        }
                    }
                    list2 = arrayList2;
                }
                arrayList.add(C89387v.m154943a(component1, list2));
            }
            this.f189531a.f189518d.postValue(arrayList);
            if (this.f189531a.f189523i) {
                this.f189531a.f189519e.postValue(arrayList);
            }
        }
    }
}
