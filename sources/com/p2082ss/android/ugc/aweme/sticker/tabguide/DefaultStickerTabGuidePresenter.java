package com.p2082ss.android.ugc.aweme.sticker.tabguide;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter */
public final class DefaultStickerTabGuidePresenter implements AbstractC75887a<C0692e<EffectCategoryModel, Object>>, AbstractC75887a {

    /* renamed from: a */
    public static final C75886a f170459a = new C75886a((byte) 0);

    static {
        Covode.recordClassIndex(88824);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
    /* renamed from: a */
    public final void mo87551a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75301e
    /* renamed from: a */
    public final void mo87552a(C75621d dVar) {
        C89219l.m154721d(dVar, "");
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.tabguide.DefaultStickerTabGuidePresenter$a */
    public static final class C75886a {
        static {
            Covode.recordClassIndex(88825);
        }

        private C75886a() {
        }

        public /* synthetic */ C75886a(byte b) {
            this();
        }
    }
}
