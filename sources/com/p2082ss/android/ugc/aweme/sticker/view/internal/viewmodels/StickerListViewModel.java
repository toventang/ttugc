package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76192k;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel */
public class StickerListViewModel extends BaseStickerListViewModel implements AbstractC33974au {

    /* renamed from: a */
    private final AbstractC1214u<C35324a<CategoryEffectModel>> f171616a;

    /* renamed from: s */
    public final AbstractC1204m f171617s;

    static {
        Covode.recordClassIndex(89353);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel$a */
    static final class C76395a<T> implements AbstractC1214u<C35324a<CategoryEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ StickerListViewModel f171618a;

        static {
            Covode.recordClassIndex(89354);
        }

        C76395a(StickerListViewModel stickerListViewModel) {
            this.f171618a = stickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C35324a<CategoryEffectModel> aVar) {
            C35324a<CategoryEffectModel> aVar2 = aVar;
            if (aVar2 != null) {
                this.f171618a.mo119969a(aVar2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    /* renamed from: a */
    public Effect mo119825a(C76401f<Effect> fVar) {
        C89219l.m154721d(fVar, "");
        List<Effect> value = this.f171590l.getValue();
        if (value == null) {
            return null;
        }
        AbstractC75655o oVar = this.f171593o;
        C89219l.m154716b(value, "");
        return C75344c.m132146a(oVar, value, fVar.f171623b);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.AbstractC76397b
    /* renamed from: a */
    public void mo119126a(String str) {
        C89219l.m154721d(str, "");
        if (!C89361p.m154870a((CharSequence) str)) {
            this.f171593o.mo119291c().mo119464j().mo119465a(str, true).observe(this.f171617s, this.f171616a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo119969a(C35324a<CategoryEffectModel> aVar) {
        List<Effect> effects;
        C89219l.m154721d(aVar, "");
        C35324a.EnumC35325a aVar2 = aVar.f83351b;
        if (aVar2 != null) {
            int i = C76399d.f171621a[aVar2.ordinal()];
            if (i == 1) {
                this.f171591m.setValue(EnumC85026a.LOADING);
            } else if (i == 2) {
                this.f171591m.setValue(EnumC85026a.ERROR);
            } else if (i == 3) {
                M m = aVar.f83350a;
                if (m == null || (effects = m.getEffects()) == null || effects.isEmpty()) {
                    this.f171591m.setValue(EnumC85026a.EMPTY);
                    return;
                }
                this.f171591m.setValue(EnumC85026a.NONE);
                mo120112a((List<? extends Effect>) effects);
            }
        }
    }

    /* renamed from: a */
    public final void mo120112a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        mo120103o().mo120044a(list);
        this.f171590l.setValue(list);
    }

    public /* synthetic */ StickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar) {
        this(mVar, oVar, dVar, gVar, new C76192k(oVar.mo119291c().mo119459e()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar, AbstractC76150f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
        this.f171617s = mVar;
        this.f171616a = new C76395a(this);
    }
}
