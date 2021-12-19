package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.types.game.AbstractC76080m;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.LegacyGameStickerHandler */
public final class LegacyGameStickerHandler extends AbstractC75614b implements AbstractC33974au, AbstractC75626f {

    /* renamed from: a */
    private final AbstractC89244h<AbstractC76080m> f169960a;

    /* renamed from: b */
    private final AbstractC89171a<C89391z> f169961b;

    static {
        Covode.recordClassIndex(88526);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestroy() {
        if (this.f169960a.isInitialized()) {
            this.f169960a.getValue().mo119807d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75626f
    /* renamed from: b */
    public final boolean mo119334b() {
        if (!this.f169960a.isInitialized() || !this.f169960a.getValue().mo119806c()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C72847c.m128638d(aVar.f170022a);
    }

    public /* synthetic */ LegacyGameStickerHandler(AbstractC1204m mVar, AbstractC89244h hVar) {
        this(mVar, hVar, C755991.f169962a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f169961b.invoke();
        this.f169960a.getValue().mo119800a(aVar.f170022a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.types.game.m> */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyGameStickerHandler(AbstractC1204m mVar, AbstractC89244h<? extends AbstractC76080m> hVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        this.f169960a = hVar;
        this.f169961b = aVar;
        mVar.getLifecycle().mo4012a(this);
    }
}
