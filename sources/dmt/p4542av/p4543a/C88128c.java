package dmt.p4542av.p4543a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.a.c */
public final class C88128c {

    /* renamed from: a */
    public final String f200040a;

    /* renamed from: b */
    public final String f200041b;

    static {
        Covode.recordClassIndex(104156);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88128c)) {
            return false;
        }
        C88128c cVar = (C88128c) obj;
        return C89219l.m154714a(this.f200040a, cVar.f200040a) && C89219l.m154714a(this.f200041b, cVar.f200041b);
    }

    public final int hashCode() {
        String str = this.f200040a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f200041b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AVSeparatorConfig(audioRecordWorkSpace=" + this.f200040a + ", originSoundDir=" + this.f200041b + ")";
    }

    public C88128c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f200040a = str;
        this.f200041b = str2;
    }
}
