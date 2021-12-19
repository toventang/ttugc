package com.p2082ss.android.ugc.aweme.crossplatform.p2710d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.c */
public final class C40629c {

    /* renamed from: a */
    public String f95132a;

    /* renamed from: b */
    public String f95133b;

    /* renamed from: c */
    public String f95134c;

    /* renamed from: d */
    public String f95135d;

    /* renamed from: e */
    public String f95136e;

    /* renamed from: f */
    public long f95137f;

    /* renamed from: g */
    public String f95138g;

    static {
        Covode.recordClassIndex(48469);
    }

    public C40629c(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40629c)) {
            return false;
        }
        C40629c cVar = (C40629c) obj;
        return C89219l.m154714a(this.f95132a, cVar.f95132a) && C89219l.m154714a(this.f95133b, cVar.f95133b) && C89219l.m154714a(this.f95134c, cVar.f95134c) && C89219l.m154714a(this.f95135d, cVar.f95135d) && C89219l.m154714a(this.f95136e, cVar.f95136e) && this.f95137f == cVar.f95137f && C89219l.m154714a(this.f95138g, cVar.f95138g);
    }

    public final String toString() {
        return "CommerceInfoFromAweme(creativeId=" + this.f95132a + ", adId=" + this.f95133b + ", itemId=" + this.f95134c + ", advId=" + this.f95135d + ", desc=" + this.f95136e + ", viewTime=" + this.f95137f + ", coverUrl=" + this.f95138g + ")";
    }

    private C40629c() {
        this.f95132a = null;
        this.f95133b = null;
        this.f95134c = null;
        this.f95135d = null;
        this.f95136e = null;
        this.f95137f = 0;
        this.f95138g = null;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f95132a;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f95133b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        String str3 = this.f95134c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str4 = this.f95135d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str5 = this.f95136e;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        long j = this.f95137f;
        int i11 = (((i10 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str6 = this.f95138g;
        if (str6 != null) {
            i6 = str6.hashCode();
        }
        return i11 + i6;
    }

    private /* synthetic */ C40629c(byte b) {
        this();
    }
}
