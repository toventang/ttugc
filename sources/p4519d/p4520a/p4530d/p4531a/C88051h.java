package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.h */
public final class C88051h {

    /* renamed from: a */
    public final String f199967a;

    /* renamed from: b */
    private final File f199968b;

    static {
        Covode.recordClassIndex(104077);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("[component=").append(this.f199967a).append(", canonicalPath=");
        File file = this.f199968b;
        String str2 = null;
        if (file != null) {
            str = file.getCanonicalPath();
        } else {
            str = null;
        }
        StringBuilder append2 = append.append(str).append(", absolutePath=");
        File file2 = this.f199968b;
        if (file2 != null) {
            str2 = file2.getAbsolutePath();
        }
        return append2.append(str2).append(']').toString();
    }

    public C88051h(String str) {
        File file;
        this.f199967a = str;
        if (str != null) {
            file = new File(str).getAbsoluteFile();
        } else {
            file = null;
        }
        this.f199968b = file;
    }

    /* renamed from: a */
    public final C88051h mo142616a(String str) {
        C89219l.m154719c(str, "");
        if (this.f199968b == null) {
            return null;
        }
        File absoluteFile = new File(this.f199968b.getAbsolutePath(), str).getAbsoluteFile();
        C89219l.m154709a((Object) absoluteFile, "");
        return new C88051h(absoluteFile.getAbsolutePath());
    }
}
