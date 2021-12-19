package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.a */
public final class C75439a implements Serializable {
    @AbstractC27891c(mo46611a = "videoPath")

    /* renamed from: a */
    private final String f169522a;
    @AbstractC27891c(mo46611a = "audioPath")

    /* renamed from: b */
    private final String f169523b;
    @AbstractC27891c(mo46611a = "maxDuration")

    /* renamed from: c */
    private final long f169524c;
    @AbstractC27891c(mo46611a = "isMultiBgVideo")

    /* renamed from: d */
    private final boolean f169525d;
    @AbstractC27891c(mo46611a = "endTime")

    /* renamed from: e */
    private long f169526e;
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: f */
    private final String f169527f;

    static {
        Covode.recordClassIndex(88360);
    }

    public final String getAudioPath() {
        return this.f169523b;
    }

    public final long getEndTime() {
        return this.f169526e;
    }

    public final long getMaxDuration() {
        return this.f169524c;
    }

    public final String getUid() {
        return this.f169527f;
    }

    public final String getVideoPath() {
        return this.f169522a;
    }

    public final boolean isMultiBgVideo() {
        return this.f169525d;
    }

    public final int hashCode() {
        return this.f169522a.hashCode();
    }

    public final void setEndTime(long j) {
        this.f169526e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C75439a) {
            C75439a aVar = (C75439a) obj;
            if (!C89219l.m154714a((Object) this.f169522a, (Object) aVar.f169522a) || !C89219l.m154714a((Object) this.f169523b, (Object) aVar.f169523b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C75439a(String str, String str2, long j, boolean z, long j2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f169522a = str;
        this.f169523b = str2;
        this.f169524c = j;
        this.f169525d = z;
        this.f169526e = j2;
        this.f169527f = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C75439a(java.lang.String r10, java.lang.String r11, long r12, boolean r14, long r15, java.lang.String r17, int r18, p4600h.p4611f.p4613b.C89214g r19) {
        /*
            r9 = this;
            r5 = r14
            r6 = r15
            r8 = r17
            r0 = r18 & 8
            if (r0 == 0) goto L_0x000a
            r0 = 0
            r5 = 0
        L_0x000a:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r6 = 0
        L_0x0012:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0023
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r8, r0)
        L_0x0023:
            r0 = r9
            r3 = r12
            r2 = r11
            r1 = r10
            r0.<init>(r1, r2, r3, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.sticker.model.C75439a.<init>(java.lang.String, java.lang.String, long, boolean, long, java.lang.String, int, h.f.b.g):void");
    }
}
