package com.p2082ss.android.ugc.aweme.shortvideo.p3889w;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.j */
public final class C74224j {

    /* renamed from: a */
    public final int f166729a;

    /* renamed from: b */
    public final float f166730b;

    /* renamed from: c */
    public final int f166731c;

    /* renamed from: d */
    public final int f166732d;

    static {
        Covode.recordClassIndex(86983);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74224j)) {
            return false;
        }
        C74224j jVar = (C74224j) obj;
        return this.f166729a == jVar.f166729a && Float.compare(this.f166730b, jVar.f166730b) == 0 && this.f166731c == jVar.f166731c && this.f166732d == jVar.f166732d;
    }

    public final int hashCode() {
        return (((((this.f166729a * 31) + Float.floatToIntBits(this.f166730b)) * 31) + this.f166731c) * 31) + this.f166732d;
    }

    public final String toString() {
        return "RecordControlSetting(recordQuality=" + this.f166729a + ", recordBitrate=" + this.f166730b + ", bitrateMode=" + this.f166731c + ", hardwareProfileLevel=" + this.f166732d + ")";
    }

    public /* synthetic */ C74224j() {
        this(18, 2.25f, 1, 1);
    }

    public C74224j(int i, float f, int i2, int i3) {
        this.f166729a = i;
        this.f166730b = f;
        this.f166731c = i2;
        this.f166732d = i3;
    }
}
