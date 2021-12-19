package com.p2082ss.android.ugc.aweme.sticker.panel.p3971a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.e */
public final class C75477e implements AbstractC75473a {

    /* renamed from: a */
    private final int f169594a;

    /* renamed from: b */
    private final Effect f169595b;

    static {
        Covode.recordClassIndex(88399);
    }

    public C75477e(int i, Effect effect) {
        C89219l.m154721d(effect, "");
        this.f169594a = i;
        this.f169595b = effect;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75473a
    /* renamed from: a */
    public final boolean mo119149a(Effect effect, int i, int i2) {
        C89219l.m154721d(effect, "");
        if (i != this.f169594a) {
            return false;
        }
        if (C89219l.m154714a((Object) effect.getEffectId(), (Object) this.f169595b.getParentId())) {
            return true;
        }
        if (!C75466g.m132345a(effect) || !C89219l.m154714a((Object) effect.getEffectId(), (Object) this.f169595b.getEffectId())) {
            return false;
        }
        return true;
    }
}
