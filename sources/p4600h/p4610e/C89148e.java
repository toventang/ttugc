package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.e.e */
public final class C89148e {

    /* renamed from: a */
    public final File f202851a;

    /* renamed from: b */
    public final List<File> f202852b;

    static {
        Covode.recordClassIndex(105232);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89148e)) {
            return false;
        }
        C89148e eVar = (C89148e) obj;
        return C89219l.m154714a(this.f202851a, eVar.f202851a) && C89219l.m154714a(this.f202852b, eVar.f202852b);
    }

    public final int hashCode() {
        File file = this.f202851a;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f202852b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f202851a + ", segments=" + this.f202852b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89148e(File file, List<? extends File> list) {
        C89219l.m154721d(file, "");
        C89219l.m154721d(list, "");
        this.f202851a = file;
        this.f202852b = list;
    }
}
