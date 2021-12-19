package com.p2082ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84533a;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerCategoryListNewViewModel */
public final class InfoStickerCategoryListNewViewModel extends BaseInfoStickerListViewModel<InfoStickerEffect> implements AbstractC33974au {

    /* renamed from: d */
    public final AbstractC89172b<InfoStickerEffect, Boolean> f189502d;

    /* renamed from: e */
    private AbstractC84451j<InfoStickerEffect, CategoryEffectModel> f189503e;

    /* renamed from: f */
    private final AbstractC84533a f189504f;

    static {
        Covode.recordClassIndex(98788);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: h */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129565h() {
        AbstractC84451j<InfoStickerEffect, CategoryEffectModel> c = this.f189504f.mo129477c();
        this.f189503e = c;
        AbstractC88403ab<List<InfoStickerEffect>> b = c.mo129433b();
        if (this.f189502d != C84825a.f189546a) {
            b.mo142925c(new C84812a(this));
        }
        return b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: i */
    public final AbstractC88403ab<List<InfoStickerEffect>> mo129566i() {
        AbstractC88403ab<List<InfoStickerEffect>> b;
        AbstractC84451j<InfoStickerEffect, CategoryEffectModel> jVar = this.f189503e;
        if (jVar == null || (b = jVar.mo129433b()) == null) {
            AbstractC88403ab<List<InfoStickerEffect>> a = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            C89219l.m154716b(a, "");
            return a;
        } else if (this.f189502d == C84825a.f189546a) {
            return b;
        } else {
            b.mo142925c(new C84813b(this));
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerCategoryListNewViewModel$a */
    static final class C84812a<T, R> implements AbstractC88434g<List<? extends InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerCategoryListNewViewModel f189505a;

        static {
            Covode.recordClassIndex(98789);
        }

        C84812a(InfoStickerCategoryListNewViewModel infoStickerCategoryListNewViewModel) {
            this.f189505a = infoStickerCategoryListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            C89219l.m154721d(list2, "");
            AbstractC89172b<InfoStickerEffect, Boolean> bVar = this.f189505a.f189502d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main1.InfoStickerCategoryListNewViewModel$b */
    static final class C84813b<T, R> implements AbstractC88434g<List<? extends InfoStickerEffect>, List<? extends InfoStickerEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerCategoryListNewViewModel f189506a;

        static {
            Covode.recordClassIndex(98790);
        }

        C84813b(InfoStickerCategoryListNewViewModel infoStickerCategoryListNewViewModel) {
            this.f189506a = infoStickerCategoryListNewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends InfoStickerEffect> apply(List<? extends InfoStickerEffect> list) {
            List<? extends InfoStickerEffect> list2 = list;
            C89219l.m154721d(list2, "");
            AbstractC89172b<InfoStickerEffect, Boolean> bVar = this.f189506a.f189502d;
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (bVar.invoke(t).booleanValue()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }
}
