package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.d */
public final class C75774d {

    /* renamed from: a */
    public final Effect f170215a;

    /* renamed from: b */
    public final boolean f170216b;

    static {
        Covode.recordClassIndex(88708);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75774d)) {
            return false;
        }
        C75774d dVar = (C75774d) obj;
        return C89219l.m154714a(this.f170215a, dVar.f170215a) && this.f170216b == dVar.f170216b;
    }

    public final int hashCode() {
        Effect effect = this.f170215a;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        boolean z = this.f170216b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "FavoriteModifyFetcherRequest(favorite=" + this.f170215a + ", isFavorite=" + this.f170216b + ")";
    }

    public C75774d(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        this.f170215a = effect;
        this.f170216b = z;
    }
}
