package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.p3813a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a */
public final class C71034a implements AbstractC75310e {

    /* renamed from: a */
    public int f159031a;

    /* renamed from: b */
    public int f159032b;

    /* renamed from: c */
    public float f159033c;

    /* renamed from: d */
    public float f159034d;

    /* renamed from: e */
    public float f159035e;

    /* renamed from: f */
    public float f159036f;

    static {
        Covode.recordClassIndex(83532);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71034a)) {
            return false;
        }
        C71034a aVar = (C71034a) obj;
        return this.f159031a == aVar.f159031a && this.f159032b == aVar.f159032b && Float.compare(this.f159033c, aVar.f159033c) == 0 && Float.compare(this.f159034d, aVar.f159034d) == 0 && Float.compare(this.f159035e, aVar.f159035e) == 0 && Float.compare(this.f159036f, aVar.f159036f) == 0;
    }

    public final String toString() {
        return "InfoStickerTimeEditData(startTime=" + this.f159031a + ", endTime=" + this.f159032b + ", rotate=" + this.f159033c + ", scale=" + this.f159034d + ", xPercent=" + this.f159035e + ", yPercent=" + this.f159036f + ")";
    }

    private /* synthetic */ C71034a() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((((((this.f159031a * 31) + this.f159032b) * 31) + Float.floatToIntBits(this.f159033c)) * 31) + Float.floatToIntBits(this.f159034d)) * 31) + Float.floatToIntBits(this.f159035e)) * 31) + Float.floatToIntBits(this.f159036f);
    }

    public C71034a(int i, int i2, float f, float f2, float f3, float f4) {
        this.f159031a = i;
        this.f159032b = i2;
        this.f159033c = f;
        this.f159034d = f2;
        this.f159035e = f3;
        this.f159036f = f4;
    }
}
