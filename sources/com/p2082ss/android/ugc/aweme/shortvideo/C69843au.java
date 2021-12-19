package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.au */
public final class C69843au {

    /* renamed from: a */
    public final AbstractC27242j<C70625d> f156072a;

    /* renamed from: b */
    public final AbstractC27242j<MultiEditVideoStatusRecordData> f156073b;

    /* renamed from: c */
    public final Object f156074c;

    static {
        Covode.recordClassIndex(82251);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69843au)) {
            return false;
        }
        C69843au auVar = (C69843au) obj;
        return C89219l.m154714a(this.f156072a, auVar.f156072a) && C89219l.m154714a(this.f156073b, auVar.f156073b) && C89219l.m154714a(this.f156074c, auVar.f156074c);
    }

    public final int hashCode() {
        AbstractC27242j<C70625d> jVar = this.f156072a;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        AbstractC27242j<MultiEditVideoStatusRecordData> jVar2 = this.f156073b;
        int hashCode2 = (hashCode + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        Object obj = this.f156074c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "GoNextData(avMusicWaveBean=" + this.f156072a + ", multiEditVideoStatusRecordData=" + this.f156073b + ", concatFinishedEvent=" + this.f156074c + ")";
    }

    /* renamed from: a */
    public final C70625d mo110193a() {
        if (this.f156072a.isPresent()) {
            return this.f156072a.get();
        }
        return null;
    }

    /* renamed from: b */
    public final MultiEditVideoStatusRecordData mo110194b() {
        if (this.f156073b.isPresent()) {
            return this.f156073b.get();
        }
        return null;
    }

    public C69843au(AbstractC27242j<C70625d> jVar, AbstractC27242j<MultiEditVideoStatusRecordData> jVar2, Object obj) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(jVar2, "");
        C89219l.m154721d(obj, "");
        this.f156072a = jVar;
        this.f156073b = jVar2;
        this.f156074c = obj;
    }
}
