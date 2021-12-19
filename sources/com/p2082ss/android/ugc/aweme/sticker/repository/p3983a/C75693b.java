package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.b */
public final class C75693b {

    /* renamed from: a */
    public final boolean f170124a;

    /* renamed from: b */
    public final Effect f170125b;

    /* renamed from: c */
    public final EnumC75694c f170126c;

    static {
        Covode.recordClassIndex(88624);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75693b)) {
            return false;
        }
        C75693b bVar = (C75693b) obj;
        return this.f170124a == bVar.f170124a && C89219l.m154714a(this.f170125b, bVar.f170125b) && C89219l.m154714a(this.f170126c, bVar.f170126c);
    }

    public final int hashCode() {
        boolean z = this.f170124a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Effect effect = this.f170125b;
        int i5 = 0;
        int hashCode = (i4 + (effect != null ? effect.hashCode() : 0)) * 31;
        EnumC75694c cVar = this.f170126c;
        if (cVar != null) {
            i5 = cVar.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "FavoriteModifyEvent(isFavorite=" + this.f170124a + ", effect=" + this.f170125b + ", from=" + this.f170126c + ")";
    }

    public C75693b(boolean z, Effect effect, EnumC75694c cVar) {
        C89219l.m154721d(effect, "");
        C89219l.m154721d(cVar, "");
        this.f170124a = z;
        this.f170125b = effect;
        this.f170126c = cVar;
    }
}
