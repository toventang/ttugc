package com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.d.a.a */
public abstract class AbstractC75730a {
    static {
        Covode.recordClassIndex(88661);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo109792a(String str, Effect effect);

    /* renamed from: b */
    public final boolean mo119485b(String str, Effect effect) {
        C89219l.m154721d(str, "");
        if (effect == null) {
            return true;
        }
        return mo109792a(str, effect);
    }
}
