package com.p2082ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84536d;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerCategoryListViewModel */
public final class InfoStickerCategoryListViewModel extends BaseInfoStickerListViewModel<Effect> implements AbstractC33974au {

    /* renamed from: d */
    public final AbstractC89172b<Effect, Boolean> f189223d;

    /* renamed from: e */
    private AbstractC84451j<Effect, CategoryEffectModel> f189224e;

    /* renamed from: f */
    private final AbstractC84536d f189225f;

    /* renamed from: g */
    private final C84443b f189226g;

    static {
        Covode.recordClassIndex(98670);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: h */
    public final AbstractC88403ab<List<Effect>> mo129565h() {
        AbstractC84451j<Effect, CategoryEffectModel> a = this.f189225f.mo129420a(this.f189226g);
        this.f189224e = a;
        AbstractC88403ab<List<Effect>> b = a.mo129433b();
        if (this.f189223d == C84731e.f189327a) {
            return b;
        }
        AbstractC88403ab<R> c = b.mo142925c(new C84702a(this));
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: i */
    public final AbstractC88403ab<List<Effect>> mo129566i() {
        AbstractC88403ab<List<Effect>> b;
        AbstractC84451j<Effect, CategoryEffectModel> jVar = this.f189224e;
        if (!(jVar == null || (b = jVar.mo129433b()) == null)) {
            if (this.f189223d == C84731e.f189327a) {
                return b;
            }
            AbstractC88403ab<R> c = b.mo142925c(new C84703b(this));
            if (c != null) {
                return c;
            }
        }
        AbstractC88403ab<List<Effect>> a = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerCategoryListViewModel$a */
    static final class C84702a<T, R> implements AbstractC88434g<List<? extends Effect>, List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerCategoryListViewModel f189227a;

        static {
            Covode.recordClassIndex(98671);
        }

        C84702a(InfoStickerCategoryListViewModel infoStickerCategoryListViewModel) {
            this.f189227a = infoStickerCategoryListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends Effect> apply(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            C89219l.m154721d(list2, "");
            AbstractC89172b<Effect, Boolean> bVar = this.f189227a.f189223d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerCategoryListViewModel$b */
    static final class C84703b<T, R> implements AbstractC88434g<List<? extends Effect>, List<? extends Effect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerCategoryListViewModel f189228a;

        static {
            Covode.recordClassIndex(98672);
        }

        C84703b(InfoStickerCategoryListViewModel infoStickerCategoryListViewModel) {
            this.f189228a = infoStickerCategoryListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends Effect> apply(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            C89219l.m154721d(list2, "");
            AbstractC89172b<Effect, Boolean> bVar = this.f189228a.f189223d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    public /* synthetic */ InfoStickerCategoryListViewModel(AbstractC1204m mVar, AbstractC84536d dVar, C84443b bVar) {
        this(mVar, dVar, bVar, C84731e.f189327a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InfoStickerCategoryListViewModel(AbstractC1204m mVar, AbstractC84536d dVar, C84443b bVar, AbstractC89172b<? super Effect, Boolean> bVar2) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f189225f = dVar;
        this.f189226g = bVar;
        this.f189223d = bVar2;
    }
}
