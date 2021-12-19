package dmt.p4542av.video.p4544a;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.a.b */
public final class C88158b {

    /* renamed from: a */
    public final List<String> f200111a;

    /* renamed from: b */
    public final List<String> f200112b;

    /* renamed from: c */
    public final String f200113c;

    static {
        Covode.recordClassIndex(104193);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88158b)) {
            return false;
        }
        C88158b bVar = (C88158b) obj;
        return C89219l.m154714a(this.f200111a, bVar.f200111a) && C89219l.m154714a(this.f200112b, bVar.f200112b) && C89219l.m154714a(this.f200113c, bVar.f200113c);
    }

    public final int hashCode() {
        List<String> list = this.f200111a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f200112b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f200113c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ConcatIntermediateProduct(concatIntermediateVideoPath=" + this.f200111a + ", concatIntermediateAudioPath=" + this.f200112b + ", dirName=" + this.f200113c + ")";
    }

    public C88158b(List<String> list, List<String> list2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(str, "");
        this.f200111a = list;
        this.f200112b = list2;
        this.f200113c = str;
    }
}
