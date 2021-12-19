package com.p2082ss.android.ugc.aweme.specact.popup.calendar;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.calendar.b */
public final class C75194b {
    @AbstractC27891c(mo46611a = "identifier")

    /* renamed from: a */
    public final String f169068a;
    @AbstractC27891c(mo46611a = "repeatFrequency")

    /* renamed from: b */
    public final String f169069b;
    @AbstractC27891c(mo46611a = "repeatInterval")

    /* renamed from: c */
    public final int f169070c;
    @AbstractC27891c(mo46611a = "repeatCount")

    /* renamed from: d */
    public final int f169071d;
    @AbstractC27891c(mo46611a = "startDate")

    /* renamed from: e */
    public final long f169072e;
    @AbstractC27891c(mo46611a = "endDate")

    /* renamed from: f */
    public final long f169073f;
    @AbstractC27891c(mo46611a = "alarmOffset")

    /* renamed from: g */
    public final long f169074g;
    @AbstractC27891c(mo46611a = "allDay")

    /* renamed from: h */
    public final boolean f169075h;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: i */
    public final String f169076i;
    @AbstractC27891c(mo46611a = "notes")

    /* renamed from: j */
    public final String f169077j;
    @AbstractC27891c(mo46611a = "enterFrom")

    /* renamed from: k */
    public final String f169078k;

    static {
        Covode.recordClassIndex(88072);
    }

    public C75194b() {
        this(null, null, 0, 0, 0, null, null, null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75194b)) {
            return false;
        }
        C75194b bVar = (C75194b) obj;
        return C89219l.m154714a(this.f169068a, bVar.f169068a) && C89219l.m154714a(this.f169069b, bVar.f169069b) && this.f169070c == bVar.f169070c && this.f169071d == bVar.f169071d && this.f169072e == bVar.f169072e && this.f169073f == bVar.f169073f && this.f169074g == bVar.f169074g && this.f169075h == bVar.f169075h && C89219l.m154714a(this.f169076i, bVar.f169076i) && C89219l.m154714a(this.f169077j, bVar.f169077j) && C89219l.m154714a(this.f169078k, bVar.f169078k);
    }

    public final String toString() {
        return "CalendarParams(identifier=" + this.f169068a + ", repeatFrequency=" + this.f169069b + ", repeatInterval=" + this.f169070c + ", repeatCount=" + this.f169071d + ", startDate=" + this.f169072e + ", endDate=" + this.f169073f + ", alarmOffset=" + this.f169074g + ", allDay=" + this.f169075h + ", title=" + this.f169076i + ", notes=" + this.f169077j + ", enterFrom=" + this.f169078k + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f169068a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.f169069b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f169072e;
        long j2 = this.f169073f;
        long j3 = this.f169074g;
        int i7 = (((((((((((i6 + i2) * 31) + this.f169070c) * 31) + this.f169071d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z = this.f169075h;
        if (z) {
            z = true;
        }
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = z ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        String str3 = this.f169076i;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        String str4 = this.f169077j;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        String str5 = this.f169078k;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i13 + i5;
    }

    private C75194b(String str, String str2, long j, long j2, long j3, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f169068a = str;
        this.f169069b = str2;
        this.f169070c = 0;
        this.f169071d = 0;
        this.f169072e = j;
        this.f169073f = j2;
        this.f169074g = j3;
        this.f169075h = false;
        this.f169076i = str3;
        this.f169077j = str4;
        this.f169078k = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C75194b(java.lang.String r14, java.lang.String r15, long r16, long r18, long r20, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            r13 = this;
            r1 = r25
            r11 = r23
            r2 = r14
            r10 = r22
            r3 = r15
            r4 = r16
            r6 = r18
            r0 = r1 & 1
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0013
            r2 = r12
        L_0x0013:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0018
            r3 = r12
        L_0x0018:
            r0 = r1 & 16
            r8 = -1
            if (r0 == 0) goto L_0x0020
            r4 = -1
        L_0x0020:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0026
            r6 = -1
        L_0x0026:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0040
        L_0x002a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002f
            r10 = r12
        L_0x002f:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0034
            r11 = r12
        L_0x0034:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003d
        L_0x0038:
            r1 = r13
            r1.<init>(r2, r3, r4, r6, r8, r10, r11, r12)
            return
        L_0x003d:
            r12 = r24
            goto L_0x0038
        L_0x0040:
            r8 = r20
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.specact.popup.calendar.C75194b.<init>(java.lang.String, java.lang.String, long, long, long, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
