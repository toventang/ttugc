package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.m */
public final class C76196m implements AbstractC76151g {

    /* renamed from: a */
    private final AbstractC84398d f171168a;

    static {
        Covode.recordClassIndex(89146);
    }

    public C76196m(AbstractC84398d dVar) {
        C89219l.m154721d(dVar, "");
        this.f171168a = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g
    /* renamed from: a */
    public final void mo119909a(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C89219l.m154721d(iIsTagNeedUpdatedListener, "");
        if (effect != null) {
            this.f171168a.mo78904a(effect.getId(), effect.getTags(), effect.getTagsUpdatedAt(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g
    /* renamed from: a */
    public final void mo119910a(Effect effect, IUpdateTagListener iUpdateTagListener) {
        C89219l.m154721d(iUpdateTagListener, "");
        if (effect != null) {
            this.f171168a.mo78897a(effect.getId(), effect.getTagsUpdatedAt(), iUpdateTagListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g
    /* renamed from: a */
    public final void mo119911a(EffectCategoryModel effectCategoryModel, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C89219l.m154721d(iIsTagNeedUpdatedListener, "");
        if (effectCategoryModel != null) {
            this.f171168a.mo78904a(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g
    /* renamed from: a */
    public final void mo119912a(EffectCategoryModel effectCategoryModel, IUpdateTagListener iUpdateTagListener) {
        C89219l.m154721d(iUpdateTagListener, "");
        if (effectCategoryModel != null) {
            this.f171168a.mo78897a(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), iUpdateTagListener);
        }
    }
}
