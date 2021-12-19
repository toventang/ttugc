package com.bytedance.bpea.core.p870c;

import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13345f;
import com.bytedance.bpea.basics.C13351l;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.c.a */
public final class C13361a {

    /* renamed from: a */
    public C13351l f32650a = new C13351l();

    /* renamed from: b */
    public EnumC13366d f32651b = EnumC13366d.INFO;

    /* renamed from: c */
    public final AbstractC13343d f32652c;

    /* renamed from: d */
    public final C13345f f32653d;

    /* renamed from: e */
    public final EnumC13368f f32654e;

    /* renamed from: f */
    public final int f32655f;

    /* renamed from: g */
    public final String f32656g;

    static {
        Covode.recordClassIndex(15357);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13361a)) {
            return false;
        }
        C13361a aVar = (C13361a) obj;
        return C89219l.m154714a(this.f32652c, aVar.f32652c) && C89219l.m154714a(this.f32653d, aVar.f32653d) && C89219l.m154714a(this.f32654e, aVar.f32654e) && this.f32655f == aVar.f32655f && C89219l.m154714a(this.f32656g, aVar.f32656g);
    }

    public final int hashCode() {
        AbstractC13343d dVar = this.f32652c;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        C13345f fVar = this.f32653d;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        EnumC13368f fVar2 = this.f32654e;
        int hashCode3 = (((hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31) + this.f32655f) * 31;
        String str = this.f32656g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "Event(cert=" + this.f32652c + ", context=" + this.f32653d + ", eventType=" + this.f32654e + ", status=" + this.f32655f + ", msg=" + this.f32656g + ")";
    }

    /* renamed from: a */
    public final void mo21606a(C13351l lVar) {
        C89219l.m154719c(lVar, "");
        this.f32650a = lVar;
    }

    /* renamed from: a */
    public final void mo21607a(EnumC13366d dVar) {
        C89219l.m154719c(dVar, "");
        this.f32651b = dVar;
    }

    public C13361a(AbstractC13343d dVar, C13345f fVar, EnumC13368f fVar2, int i, String str) {
        C89219l.m154719c(fVar2, "");
        this.f32652c = dVar;
        this.f32653d = fVar;
        this.f32654e = fVar2;
        this.f32655f = i;
        this.f32656g = str;
    }
}
