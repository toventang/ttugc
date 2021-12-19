package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: h.e.f */
public class C89149f extends IOException {

    /* renamed from: a */
    private final File f202853a;

    /* renamed from: b */
    private final File f202854b;

    /* renamed from: c */
    private final String f202855c;

    static {
        Covode.recordClassIndex(105233);
    }

    public final File getFile() {
        return this.f202853a;
    }

    public final File getOther() {
        return this.f202854b;
    }

    public final String getReason() {
        return this.f202855c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89149f(java.io.File r5, java.io.File r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = r5.toString()
            r2.<init>(r0)
            if (r6 == 0) goto L_0x001d
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = " -> "
            java.lang.String r0 = r0.concat(r1)
            r2.append(r0)
        L_0x001d:
            if (r7 == 0) goto L_0x002c
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = ": "
            java.lang.String r0 = r0.concat(r1)
            r2.append(r0)
        L_0x002c:
            java.lang.String r0 = r2.toString()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f202853a = r5
            r4.f202854b = r6
            r4.f202855c = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4610e.C89149f.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C89149f(File file, File file2, String str, int i, C89214g gVar) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
