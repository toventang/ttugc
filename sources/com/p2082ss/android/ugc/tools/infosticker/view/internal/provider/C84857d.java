package com.p2082ss.android.ugc.tools.infosticker.view.internal.provider;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f;
import com.p2082ss.android.ugc.tools.p4340c.C84407b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85037b;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.d */
public final class C84857d extends AbstractC84686f<ProviderEffect> {
    static {
        Covode.recordClassIndex(98844);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.AbstractC84686f
    /* renamed from: a */
    public final /* synthetic */ void mo114483a(ProviderEffect providerEffect) {
        String url;
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(providerEffect2, "");
        ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
            C24246a aVar = (C24246a) this.f189208g.getImageView().getHierarchy();
            C89219l.m154716b(aVar, "");
            aVar.mo39958a(C24229q.AbstractC24231b.f57454d);
            C84407b.m145191a(this.f189208g.getImageView(), url, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84857d(View view, C85037b bVar, AbstractC89187q<? super com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect, ? super Integer, ? super EnumC84444c, C89391z> qVar) {
        super(view, bVar, qVar);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
    }
}
