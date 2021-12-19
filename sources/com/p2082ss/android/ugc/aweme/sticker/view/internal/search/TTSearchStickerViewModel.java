package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3986c.C75728c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel */
public final class TTSearchStickerViewModel extends SearchStickerViewModel implements AbstractC33974au {
    static {
        Covode.recordClassIndex(89283);
    }

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a
    /* renamed from: a */
    public final void mo120031a(C75728c cVar) {
        C89219l.m154721d(cVar, "");
        this.f171456j.setValue(cVar.f170142b);
        this.f171452f = cVar;
        this.f171453g = System.currentTimeMillis();
        this.f171593o.mo119291c().mo119456b(cVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTSearchStickerViewModel(AbstractC1204m mVar, AbstractC75655o oVar, AbstractC75300d dVar, AbstractC76151g gVar) {
        super(mVar, oVar, dVar, gVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(gVar, "");
    }
}
