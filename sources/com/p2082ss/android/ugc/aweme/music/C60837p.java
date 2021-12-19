package com.p2082ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.p */
public final class C60837p {

    /* renamed from: a */
    public final boolean f138251a;

    /* renamed from: b */
    public final EnumC60872q f138252b;

    /* renamed from: c */
    public final int f138253c;

    static {
        Covode.recordClassIndex(71423);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60837p)) {
            return false;
        }
        C60837p pVar = (C60837p) obj;
        return this.f138251a == pVar.f138251a && C89219l.m154714a(this.f138252b, pVar.f138252b) && this.f138253c == pVar.f138253c;
    }

    public final int hashCode() {
        boolean z = this.f138251a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        EnumC60872q qVar = this.f138252b;
        return ((i4 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.f138253c;
    }

    public final String toString() {
        return "PinEvent(isPin=" + this.f138251a + ", status=" + this.f138252b + ", capacity=" + this.f138253c + ")";
    }

    public /* synthetic */ C60837p(boolean z, EnumC60872q qVar) {
        this(z, qVar, 3);
    }

    public C60837p(boolean z, EnumC60872q qVar, int i) {
        C89219l.m154721d(qVar, "");
        this.f138251a = z;
        this.f138252b = qVar;
        this.f138253c = i;
    }
}
