package com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.d.a.k */
public final class C75741k extends AbstractC75730a {

    /* renamed from: a */
    public static final C75741k f170156a = new C75741k();

    private C75741k() {
    }

    static {
        Covode.recordClassIndex(88672);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a
    /* renamed from: a */
    public final boolean mo109792a(String str, Effect effect) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effect, "");
        if (C75466g.m132357i(effect) || C72847c.m128640f(effect)) {
            return true;
        }
        return false;
    }
}
