package com.p2082ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.k */
public final class C75651k {

    /* renamed from: a */
    public final Effect f170063a;

    /* renamed from: b */
    public final int f170064b;

    static {
        Covode.recordClassIndex(88582);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75651k)) {
            return false;
        }
        C75651k kVar = (C75651k) obj;
        return C89219l.m154714a(this.f170063a, kVar.f170063a) && this.f170064b == kVar.f170064b;
    }

    public final int hashCode() {
        Effect effect = this.f170063a;
        return ((effect != null ? effect.hashCode() : 0) * 31) + this.f170064b;
    }

    public final String toString() {
        return "MultiSticker(effect=" + this.f170063a + ", position=" + this.f170064b + ")";
    }

    public /* synthetic */ C75651k() {
        this(null, -1);
    }

    public C75651k(Effect effect, int i) {
        this.f170063a = effect;
        this.f170064b = i;
    }
}
