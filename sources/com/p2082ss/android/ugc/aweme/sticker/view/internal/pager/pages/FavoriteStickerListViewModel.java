package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.p2082ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.FavoriteStickerListViewModel */
public final class FavoriteStickerListViewModel extends StickerListViewModel implements AbstractC33974au {
    static {
        Covode.recordClassIndex(89205);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    /* renamed from: a */
    public final void mo119969a(C35324a<CategoryEffectModel> aVar) {
        List<Effect> effects;
        C89219l.m154721d(aVar, "");
        C35324a.EnumC35325a aVar2 = aVar.f83351b;
        if (aVar2 != null) {
            int i = C76267c.f171325a[aVar2.ordinal()];
            if (i == 1) {
                this.f171591m.setValue(EnumC85026a.LOADING);
            } else if (i == 2) {
                Throwable th = aVar.f83352c;
                if (!(th instanceof StatusCodeException) || ((StatusCodeException) th).getStatusCode() != 8) {
                    this.f171591m.setValue(EnumC85026a.ERROR);
                } else {
                    this.f171591m.setValue(EnumC85026a.EMPTY);
                }
            } else if (i == 3) {
                M m = aVar.f83350a;
                if (m == null || (effects = m.getEffects()) == null || effects.isEmpty()) {
                    this.f171591m.setValue(EnumC85026a.EMPTY);
                    this.f171590l.setValue(C89086z.INSTANCE);
                    return;
                }
                this.f171591m.setValue(EnumC85026a.NONE);
                mo120112a((List<? extends Effect>) effects);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar) {
        super(mVar, oVar, dVar, gVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
    }
}
