package com.p2082ss.android.ugc.aweme.tools.live.sticker;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.favorite.C75366d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.live.sticker.b */
public final class C78627b extends C75366d {
    static {
        Covode.recordClassIndex(91767);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b, com.p2082ss.android.ugc.aweme.sticker.favorite.C75366d
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.f170026e == null) {
            return true;
        }
        Bundle bundle = aVar.f170026e;
        if (bundle == null) {
            C89219l.m154715b();
        }
        if (!bundle.getBoolean("is_video_used_sticker")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78627b(ActivityC0218d dVar, AbstractC75655o oVar, AbstractC75429h hVar, AbstractC75361b bVar, StickerPreferences stickerPreferences, AbstractC89171a<C75574j> aVar) {
        super(dVar, bVar, oVar, hVar, stickerPreferences, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(stickerPreferences, "");
        C89219l.m154721d(aVar, "");
    }
}
