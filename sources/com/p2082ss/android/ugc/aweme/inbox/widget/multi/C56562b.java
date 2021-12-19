package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.b */
public final class C56562b extends AbstractC56585k {
    @AbstractC27891c(mo46611a = "data_type")

    /* renamed from: a */
    public final EnumC56565e f128963a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final List<String> f128964b;
    @AbstractC27891c(mo46611a = "small_avatar_url")

    /* renamed from: c */
    public final C56532a f128965c;
    @AbstractC27891c(mo46611a = "new_notice_content")

    /* renamed from: d */
    public final String f128966d;
    @AbstractC27891c(mo46611a = "read_point")

    /* renamed from: e */
    public final C56588n f128967e;
    @AbstractC27891c(mo46611a = "new_notice_time")

    /* renamed from: f */
    public final String f128968f;
    @AbstractC27891c(mo46611a = "icon_res_id")

    /* renamed from: g */
    public final int f128969g;
    @AbstractC27891c(mo46611a = "show_arrow")

    /* renamed from: h */
    public boolean f128970h;
    @AbstractC27891c(mo46611a = "cache_time")

    /* renamed from: i */
    public final long f128971i;

    static {
        Covode.recordClassIndex(66385);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56562b)) {
            return false;
        }
        C56562b bVar = (C56562b) obj;
        return C89219l.m154714a(this.f128963a, bVar.f128963a) && C89219l.m154714a(this.f128964b, bVar.f128964b) && C89219l.m154714a(this.f128965c, bVar.f128965c) && C89219l.m154714a(this.f128966d, bVar.f128966d) && C89219l.m154714a(this.f128967e, bVar.f128967e) && C89219l.m154714a(this.f128968f, bVar.f128968f) && this.f128969g == bVar.f128969g && this.f128970h == bVar.f128970h && this.f128971i == bVar.f128971i;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    public final int hashCode() {
        EnumC56565e eVar = this.f128963a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<String> list = this.f128964b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        C56532a aVar = this.f128965c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f128966d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        C56588n nVar = this.f128967e;
        int hashCode5 = (hashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str2 = this.f128968f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (((hashCode5 + i) * 31) + this.f128969g) * 31;
        boolean z = this.f128970h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j = this.f128971i;
        return ((i2 + i3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ActivityPod(dataType=" + this.f128963a + ", title=" + this.f128964b + ", smallAvatarUrl=" + this.f128965c + ", newNoticeContent=" + this.f128966d + ", readPoint=" + this.f128967e + ", newNoticeTime=" + this.f128968f + ", iconResId=" + this.f128969g + ", showArrow=" + this.f128970h + ", cacheTime=" + this.f128971i + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.multi.AbstractC56585k
    /* renamed from: a */
    public final boolean mo93492a() {
        if (this.f128967e.f129021b > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C56562b(EnumC56565e eVar, List<String> list, C56532a aVar, String str, C56588n nVar, String str2, int i, boolean z, long j) {
        super(0);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(str2, "");
        this.f128963a = eVar;
        this.f128964b = list;
        this.f128965c = aVar;
        this.f128966d = str;
        this.f128967e = nVar;
        this.f128968f = str2;
        this.f128969g = i;
        this.f128970h = z;
        this.f128971i = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C56562b(com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56565e r12, java.util.List r13, com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56532a r14, java.lang.String r15, com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56588n r16, java.lang.String r17, int r18, boolean r19, long r20, int r22) {
        /*
            r11 = this;
            r1 = r22
            r9 = r20
            r8 = r19
            r7 = r18
            r2 = r13
            r4 = r15
            r3 = r14
            r5 = r16
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0013
            h.a.z r2 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0013:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0018
            r3 = 0
        L_0x0018:
            r0 = r1 & 8
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x001f
            r4 = r6
        L_0x001f:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.inbox.widget.multi.n r5 = new com.ss.android.ugc.aweme.inbox.widget.multi.n
            com.ss.android.ugc.aweme.inbox.widget.multi.o r0 = com.p2082ss.android.ugc.aweme.inbox.widget.multi.EnumC56589o.NONE
            r5.<init>(r0)
        L_0x002a:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0048
        L_0x002e:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0034
            r0 = -1
            r7 = -1
        L_0x0034:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            r8 = 0
        L_0x003a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0042
            long r9 = android.os.SystemClock.uptimeMillis()
        L_0x0042:
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0048:
            r6 = r17
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.widget.multi.C56562b.<init>(com.ss.android.ugc.aweme.inbox.widget.multi.e, java.util.List, com.ss.android.ugc.aweme.inbox.widget.multi.a, java.lang.String, com.ss.android.ugc.aweme.inbox.widget.multi.n, java.lang.String, int, boolean, long, int):void");
    }
}
