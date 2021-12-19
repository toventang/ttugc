package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.f */
public final class C88049f {

    /* renamed from: a */
    public final String f199959a;

    /* renamed from: b */
    public final C88051h f199960b;

    /* renamed from: c */
    public final C88051h f199961c;

    /* renamed from: d */
    public final Double f199962d;

    /* renamed from: e */
    public final Double f199963e;

    /* renamed from: f */
    public final Long f199964f;

    /* renamed from: g */
    public final EnumC88052i f199965g;

    static {
        Covode.recordClassIndex(104075);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88049f)) {
            return false;
        }
        C88049f fVar = (C88049f) obj;
        return C89219l.m154714a(this.f199959a, fVar.f199959a) && C89219l.m154714a(this.f199960b, fVar.f199960b) && C89219l.m154714a(this.f199961c, fVar.f199961c) && C89219l.m154714a(this.f199962d, fVar.f199962d) && C89219l.m154714a(this.f199963e, fVar.f199963e) && C89219l.m154714a(this.f199964f, fVar.f199964f) && C89219l.m154714a(this.f199965g, fVar.f199965g);
    }

    public final int hashCode() {
        String str = this.f199959a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C88051h hVar = this.f199960b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        C88051h hVar2 = this.f199961c;
        int hashCode3 = (hashCode2 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        Double d = this.f199962d;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.f199963e;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Long l = this.f199964f;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        EnumC88052i iVar = this.f199965g;
        if (iVar != null) {
            i = iVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "FileMeta(name=" + this.f199959a + ", absolutePath=" + this.f199960b + ", canonicalPath=" + this.f199961c + ", createdAt=" + this.f199962d + ", modifiedAt=" + this.f199963e + ", size=" + this.f199964f + ", type=" + this.f199965g + ")";
    }

    public C88049f(String str, C88051h hVar, C88051h hVar2, Double d, Double d2, Long l, EnumC88052i iVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar2, "");
        C89219l.m154719c(iVar, "");
        this.f199959a = str;
        this.f199960b = hVar;
        this.f199961c = hVar2;
        this.f199962d = d;
        this.f199963e = d2;
        this.f199964f = l;
        this.f199965g = iVar;
    }
}
