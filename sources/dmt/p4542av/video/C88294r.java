package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.r */
public final class C88294r {

    /* renamed from: a */
    public int f200350a;

    /* renamed from: b */
    public int f200351b;

    /* renamed from: c */
    public int f200352c;

    /* renamed from: d */
    public int f200353d;

    /* renamed from: e */
    public int f200354e;

    /* renamed from: f */
    public int f200355f;

    /* renamed from: g */
    public boolean f200356g;

    /* renamed from: h */
    public double f200357h;

    /* renamed from: i */
    public String f200358i;

    /* renamed from: j */
    public boolean f200359j;

    /* renamed from: k */
    public double f200360k;

    /* renamed from: l */
    public double f200361l;

    static {
        Covode.recordClassIndex(104329);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88294r)) {
            return false;
        }
        C88294r rVar = (C88294r) obj;
        return this.f200350a == rVar.f200350a && this.f200351b == rVar.f200351b && this.f200352c == rVar.f200352c && this.f200353d == rVar.f200353d && this.f200354e == rVar.f200354e && this.f200355f == rVar.f200355f && this.f200356g == rVar.f200356g && Double.compare(this.f200357h, rVar.f200357h) == 0 && C89219l.m154714a(this.f200358i, rVar.f200358i) && this.f200359j == rVar.f200359j && Double.compare(this.f200360k, rVar.f200360k) == 0 && Double.compare(this.f200361l, rVar.f200361l) == 0;
    }

    public final int hashCode() {
        int i = ((((((((((this.f200350a * 31) + this.f200351b) * 31) + this.f200352c) * 31) + this.f200353d) * 31) + this.f200354e) * 31) + this.f200355f) * 31;
        boolean z = this.f200356g;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.f200357h);
        int i6 = (((i + i3) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str = this.f200358i;
        int hashCode = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f200359j) {
            i2 = 0;
        }
        long doubleToLongBits2 = Double.doubleToLongBits(this.f200360k);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f200361l);
        return ((((hashCode + i2) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "VEMusicParamCache(trackIndex=" + this.f200350a + ", trimIn=" + this.f200351b + ", trimOut=" + this.f200352c + ", seqIn=" + this.f200353d + ", seqOut=" + this.f200354e + ", bgmDelay=" + this.f200355f + ", isCycle=" + this.f200356g + ", BGMLoudness=" + this.f200357h + ", path=" + this.f200358i + ", isDuet=" + this.f200359j + ", peakLoudness=" + this.f200360k + ", avgLoudness=" + this.f200361l + ")";
    }

    public /* synthetic */ C88294r() {
        this("");
    }

    private C88294r(String str) {
        C89219l.m154721d(str, "");
        this.f200350a = -1;
        this.f200351b = 0;
        this.f200352c = 0;
        this.f200353d = 0;
        this.f200354e = 0;
        this.f200355f = 0;
        this.f200356g = false;
        this.f200357h = 0.0d;
        this.f200358i = str;
        this.f200359j = false;
        this.f200360k = 0.0d;
        this.f200361l = 0.0d;
    }
}
