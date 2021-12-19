package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.model.b */
public final class C4312b {

    /* renamed from: a */
    public final String f11857a;

    /* renamed from: b */
    public final String f11858b;

    /* renamed from: c */
    public final String f11859c;

    static {
        Covode.recordClassIndex(4884);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4312b)) {
            return false;
        }
        C4312b bVar = (C4312b) obj;
        return C89219l.m154714a(this.f11857a, bVar.f11857a) && C89219l.m154714a(this.f11858b, bVar.f11858b) && C89219l.m154714a(this.f11859c, bVar.f11859c);
    }

    public final int hashCode() {
        String str = this.f11857a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f11858b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11859c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EffectLogData(roomId=" + this.f11857a + ", anchorId=" + this.f11858b + ", logPage=" + this.f11859c + ")";
    }

    public C4312b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f11857a = str;
        this.f11858b = str2;
        this.f11859c = str3;
    }
}
