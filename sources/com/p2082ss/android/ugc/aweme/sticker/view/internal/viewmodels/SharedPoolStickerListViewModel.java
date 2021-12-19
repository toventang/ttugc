package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75344c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.C75723b;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75720y;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76150f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel */
public final class SharedPoolStickerListViewModel extends StickerListViewModel implements AbstractC33974au {
    static {
        Covode.recordClassIndex(89350);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel
    /* renamed from: a */
    public final Effect mo119825a(C76401f<Effect> fVar) {
        String key;
        C35324a<CategoryEffectModel> value;
        M m;
        List<Effect> effects;
        C89219l.m154721d(fVar, "");
        int i = fVar.f171623b;
        int i2 = fVar.f171624c;
        AbstractC75720y j = this.f171593o.mo119291c().mo119464j();
        List<EffectCategoryModel> a = C75723b.m132877a(j);
        if (i2 <= 0 || a.size() <= i2 || (key = a.get(i2).getKey()) == null || (value = j.mo119465a(key, false).getValue()) == null || (m = value.f83350a) == null || (effects = m.getEffects()) == null || effects.isEmpty()) {
            return null;
        }
        return C75344c.m132146a(this.f171593o, effects, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPoolStickerListViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar, AbstractC76150f fVar) {
        super(mVar, oVar, dVar, gVar, fVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(fVar, "");
    }
}
