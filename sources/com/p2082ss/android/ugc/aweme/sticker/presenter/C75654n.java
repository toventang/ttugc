package com.p2082ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.n */
public final class C75654n {

    /* renamed from: a */
    public final Effect f170067a;

    /* renamed from: b */
    public final Effect f170068b;

    static {
        Covode.recordClassIndex(88585);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75654n)) {
            return false;
        }
        C75654n nVar = (C75654n) obj;
        return C89219l.m154714a(this.f170067a, nVar.f170067a) && C89219l.m154714a(this.f170068b, nVar.f170068b);
    }

    public final int hashCode() {
        Effect effect = this.f170067a;
        int i = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        Effect effect2 = this.f170068b;
        if (effect2 != null) {
            i = effect2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "StickerChangeEvent(from=" + this.f170067a + ", to=" + this.f170068b + ")";
    }

    private /* synthetic */ C75654n() {
        this(null, null);
    }

    public C75654n(Effect effect, Effect effect2) {
        this.f170067a = effect;
        this.f170068b = effect2;
    }
}
