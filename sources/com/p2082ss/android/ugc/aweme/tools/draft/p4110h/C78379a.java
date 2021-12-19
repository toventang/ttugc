package com.p2082ss.android.ugc.aweme.tools.draft.p4110h;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h.a */
public final class C78379a {
    @AbstractC27891c(mo46611a = "event_name")

    /* renamed from: a */
    public final String f176114a;
    @AbstractC27891c(mo46611a = "old_db_version")

    /* renamed from: b */
    public final int f176115b;
    @AbstractC27891c(mo46611a = "new_db_version")

    /* renamed from: c */
    public final int f176116c;
    @AbstractC27891c(mo46611a = "update_version_code")

    /* renamed from: d */
    public final int f176117d;
    @AbstractC27891c(mo46611a = "timestamp")

    /* renamed from: e */
    public final long f176118e;
    @AbstractC27891c(mo46611a = "utc_time")

    /* renamed from: f */
    public final String f176119f;

    static {
        Covode.recordClassIndex(91505);
    }

    public C78379a() {
        this(null, 0, 0, 0, 0, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78379a)) {
            return false;
        }
        C78379a aVar = (C78379a) obj;
        return C89219l.m154714a(this.f176114a, aVar.f176114a) && this.f176115b == aVar.f176115b && this.f176116c == aVar.f176116c && this.f176117d == aVar.f176117d && this.f176118e == aVar.f176118e && C89219l.m154714a(this.f176119f, aVar.f176119f);
    }

    public final String toString() {
        return "DBEvent(eventName=" + this.f176114a + ", oldDBVersion=" + this.f176115b + ", newDBVersion=" + this.f176116c + ", versionCode=" + this.f176117d + ", timestamp=" + this.f176118e + ", utcTime=" + this.f176119f + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f176114a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f176118e;
        int i3 = ((((((((i * 31) + this.f176115b) * 31) + this.f176116c) * 31) + this.f176117d) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f176119f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public C78379a(String str, int i, int i2, int i3, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f176114a = str;
        this.f176115b = i;
        this.f176116c = i2;
        this.f176117d = i3;
        this.f176118e = j;
        this.f176119f = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C78379a(java.lang.String r9, int r10, int r11, int r12, long r13, java.lang.String r15, int r16) {
        /*
            r8 = this;
            r5 = r13
            r2 = r10
            r3 = r11
            r1 = r9
            r0 = r16 & 1
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r7
        L_0x000b:
            r0 = r16 & 2
            r4 = -1
            if (r0 == 0) goto L_0x0011
            r2 = -1
        L_0x0011:
            r0 = r16 & 4
            if (r0 == 0) goto L_0x0016
            r3 = -1
        L_0x0016:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x002b
        L_0x001a:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0020
            r5 = 0
        L_0x0020:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x0029
        L_0x0024:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
        L_0x0029:
            r7 = r15
            goto L_0x0024
        L_0x002b:
            r4 = r12
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4110h.C78379a.<init>(java.lang.String, int, int, int, long, java.lang.String, int):void");
    }
}
