package com.p2082ss.android.ugc.aweme.player.sdk.p3553b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.b.a */
public final class C63055a {

    /* renamed from: a */
    public final int f143224a;

    /* renamed from: b */
    public final String f143225b;

    /* renamed from: c */
    public final Integer f143226c;

    /* renamed from: d */
    public final int f143227d;

    /* renamed from: e */
    public final Float f143228e;

    /* renamed from: f */
    public final Float f143229f;

    /* renamed from: g */
    public final String f143230g;

    static {
        Covode.recordClassIndex(73894);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63055a)) {
            return false;
        }
        C63055a aVar = (C63055a) obj;
        return this.f143224a == aVar.f143224a && C89219l.m154714a(this.f143225b, aVar.f143225b) && C89219l.m154714a(this.f143226c, aVar.f143226c) && this.f143227d == aVar.f143227d && C89219l.m154714a(this.f143228e, aVar.f143228e) && C89219l.m154714a(this.f143229f, aVar.f143229f) && C89219l.m154714a(this.f143230g, aVar.f143230g);
    }

    public final int hashCode() {
        int i = this.f143224a * 31;
        String str = this.f143225b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f143226c;
        int hashCode2 = (((hashCode + (num != null ? num.hashCode() : 0)) * 31) + this.f143227d) * 31;
        Float f = this.f143228e;
        int hashCode3 = (hashCode2 + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.f143229f;
        int hashCode4 = (hashCode3 + (f2 != null ? f2.hashCode() : 0)) * 31;
        String str2 = this.f143230g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "DubbedInfoModel{mediaType=" + this.f143224a + ", url=" + this.f143225b + ", bitrate=" + this.f143226c + ", infoId=" + this.f143227d + ", loudness=" + this.f143228e + ", peak=" + this.f143229f + ", fileKey=" + this.f143230g + "}";
    }

    public C63055a(int i, String str, Integer num, int i2, Float f, Float f2, String str2) {
        C89219l.m154719c(str, "");
        this.f143224a = i;
        this.f143225b = str;
        this.f143226c = num;
        this.f143227d = i2;
        this.f143228e = f;
        this.f143229f = f2;
        this.f143230g = str2;
    }
}
