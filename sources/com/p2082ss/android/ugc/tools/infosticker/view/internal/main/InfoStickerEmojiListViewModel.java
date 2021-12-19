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
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerEmojiListViewModel */
public final class InfoStickerEmojiListViewModel extends BaseInfoStickerListViewModel<Effect> implements AbstractC33974au {

    /* renamed from: d */
    private C84443b f189229d;

    /* renamed from: e */
    private AbstractC84451j<Effect, CategoryEffectModel> f189230e;

    /* renamed from: f */
    private final AbstractC84536d f189231f;

    static {
        Covode.recordClassIndex(98673);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: h */
    public final AbstractC88403ab<List<Effect>> mo129565h() {
        AbstractC84536d dVar = this.f189231f;
        C84443b bVar = this.f189229d;
        if (bVar != null) {
            AbstractC84451j<Effect, CategoryEffectModel> a = dVar.mo129420a(bVar);
            this.f189230e = a;
            return a.mo129433b();
        }
        throw new IllegalArgumentException("ListMeta not fetched yet".toString());
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    /* renamed from: i */
    public final AbstractC88403ab<List<Effect>> mo129566i() {
        AbstractC88403ab<List<Effect>> b;
        AbstractC84451j<Effect, CategoryEffectModel> jVar = this.f189230e;
        if (jVar != null && (b = jVar.mo129433b()) != null) {
            return b;
        }
        AbstractC88403ab<List<Effect>> a = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public final void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        if (mVar instanceof C84443b) {
            this.f189229d = (C84443b) mVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerEmojiListViewModel(AbstractC1204m mVar, AbstractC84536d dVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(dVar, "");
        this.f189231f = dVar;
    }
}
