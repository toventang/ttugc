package com.p2082ss.android.ugc.gamora.recorder.sticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.d */
public final class C84095d extends AbstractC75730a {

    /* renamed from: a */
    public static final C84095d f187673a = new C84095d();

    private C84095d() {
    }

    static {
        Covode.recordClassIndex(97988);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a
    /* renamed from: a */
    public final boolean mo109792a(String str, Effect effect) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effect, "");
        if (effect.isBusiness() || C72847c.m128642h(effect) || C72847c.m128629a(effect.getExtra(), "prop_block_story")) {
            return true;
        }
        return false;
    }
}
