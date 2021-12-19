package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.ac */
public final class C75691ac {

    /* renamed from: a */
    public final Effect f170122a;

    /* renamed from: b */
    public final boolean f170123b;

    static {
        Covode.recordClassIndex(88622);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75691ac)) {
            return false;
        }
        C75691ac acVar = (C75691ac) obj;
        return C89219l.m154714a(this.f170122a, acVar.f170122a) && this.f170123b == acVar.f170123b;
    }

    public final int hashCode() {
        Effect effect = this.f170122a;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        boolean z = this.f170123b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "StickerDownloadRequest(effect=" + this.f170122a + ", isAuto=" + this.f170123b + ")";
    }

    public /* synthetic */ C75691ac(Effect effect) {
        this(effect, false);
    }

    public C75691ac(Effect effect, boolean z) {
        C89219l.m154721d(effect, "");
        this.f170122a = effect;
        this.f170123b = z;
    }
}
