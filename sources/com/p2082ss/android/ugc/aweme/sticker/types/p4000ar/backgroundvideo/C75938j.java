package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.j */
public final class C75938j {

    /* renamed from: a */
    public String f170563a;

    /* renamed from: b */
    public final String f170564b;

    /* renamed from: c */
    public final long f170565c;

    /* renamed from: d */
    public final int f170566d;

    /* renamed from: e */
    public final String f170567e;

    /* renamed from: f */
    public final String f170568f;

    /* renamed from: g */
    public final String f170569g;

    static {
        Covode.recordClassIndex(88879);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75938j)) {
            return false;
        }
        C75938j jVar = (C75938j) obj;
        return C89219l.m154714a(this.f170564b, jVar.f170564b) && this.f170565c == jVar.f170565c && this.f170566d == jVar.f170566d && C89219l.m154714a(this.f170567e, jVar.f170567e) && C89219l.m154714a(this.f170568f, jVar.f170568f) && C89219l.m154714a(this.f170569g, jVar.f170569g);
    }

    public final int hashCode() {
        String str = this.f170564b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f170565c;
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f170566d) * 31;
        String str2 = this.f170567e;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f170568f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f170569g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MediaData(filePath=" + this.f170564b + ", duration=" + this.f170565c + ", mediaType=" + this.f170566d + ", mediaId=" + this.f170567e + ", userName=" + this.f170568f + ", source=" + this.f170569g + ")";
    }

    public C75938j(String str, long j, int i, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f170564b = str;
        this.f170565c = j;
        this.f170566d = i;
        this.f170567e = str2;
        this.f170568f = str3;
        this.f170569g = str4;
        this.f170563a = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C75938j(java.lang.String r9, long r10, int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r4 = r12
            r5 = r13
            r7 = r15
            r0 = r16 & 4
            if (r0 == 0) goto L_0x0009
            r0 = 1
            r4 = 1
        L_0x0009:
            r0 = r16 & 8
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0010
            r5 = r6
        L_0x0010:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0021
        L_0x0014:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001a
            java.lang.String r7 = "unknown"
        L_0x001a:
            r0 = r8
            r2 = r10
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        L_0x0021:
            r6 = r14
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j.<init>(java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
