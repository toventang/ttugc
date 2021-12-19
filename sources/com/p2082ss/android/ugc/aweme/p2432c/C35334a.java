package com.p2082ss.android.ugc.aweme.p2432c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.c.a */
public final class C35334a {

    /* renamed from: a */
    public final AbstractC35338e f83358a;

    /* renamed from: b */
    public final long f83359b;

    /* renamed from: c */
    public final String f83360c;

    /* renamed from: d */
    public final String f83361d;

    /* renamed from: e */
    public final boolean f83362e;

    /* renamed from: f */
    public final boolean f83363f;

    /* renamed from: g */
    public final boolean f83364g;

    static {
        Covode.recordClassIndex(42502);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35334a)) {
            return false;
        }
        C35334a aVar = (C35334a) obj;
        return C89219l.m154714a(this.f83358a, aVar.f83358a) && this.f83359b == aVar.f83359b && C89219l.m154714a(this.f83360c, aVar.f83360c) && C89219l.m154714a(this.f83361d, aVar.f83361d) && this.f83362e == aVar.f83362e && this.f83363f == aVar.f83363f && this.f83364g == aVar.f83364g;
    }

    public final String toString() {
        return "AIMusicFetchTaskParam(uploadFrameTaskParam=" + this.f83358a + ", videoDuration=" + this.f83359b + ", creationId=" + this.f83360c + ", microAppId=" + this.f83361d + ", isPhotoMVMode=" + this.f83362e + ", requestAiMusicAdvance=" + this.f83363f + ", waitFrameUploaded=" + this.f83364g + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        AbstractC35338e eVar = this.f83358a;
        int i3 = 0;
        if (eVar != null) {
            i = eVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f83359b;
        int i4 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f83360c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.f83361d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        boolean z = this.f83362e;
        int i7 = 1;
        if (z) {
            z = true;
        }
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = (i6 + i8) * 31;
        boolean z2 = this.f83363f;
        if (z2) {
            z2 = true;
        }
        int i12 = z2 ? 1 : 0;
        int i13 = z2 ? 1 : 0;
        int i14 = z2 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        if (!this.f83364g) {
            i7 = 0;
        }
        return i15 + i7;
    }

    /* renamed from: a */
    public final boolean mo62212a(C35334a aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC35338e eVar = this.f83358a;
        if (eVar == null && aVar.f83358a == null) {
            return true;
        }
        AbstractC35338e eVar2 = aVar.f83358a;
        if (eVar2 == null || eVar == null) {
            return false;
        }
        return eVar.mo62216a(eVar2);
    }

    private C35334a(AbstractC35338e eVar, long j, String str, String str2, boolean z, boolean z2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f83358a = eVar;
        this.f83359b = j;
        this.f83360c = str;
        this.f83361d = str2;
        this.f83362e = false;
        this.f83363f = z;
        this.f83364g = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C35334a(com.p2082ss.android.ugc.aweme.p2432c.AbstractC35338e r9, long r10, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15, int r16) {
        /*
            r8 = this;
            r2 = r10
            r7 = r15
            r4 = r12
            r6 = r14
            r0 = r16 & 2
            if (r0 == 0) goto L_0x000c
            r0 = -1
            r2 = -1
        L_0x000c:
            r0 = r16 & 4
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0013
            r4 = r5
        L_0x0013:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x0029
        L_0x0017:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001d
            r0 = 0
            r6 = 0
        L_0x001d:
            r0 = r16 & 64
            if (r0 == 0) goto L_0x0023
            r0 = 1
            r7 = 1
        L_0x0023:
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        L_0x0029:
            r5 = r13
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2432c.C35334a.<init>(com.ss.android.ugc.aweme.c.e, long, java.lang.String, java.lang.String, boolean, boolean, int):void");
    }
}
