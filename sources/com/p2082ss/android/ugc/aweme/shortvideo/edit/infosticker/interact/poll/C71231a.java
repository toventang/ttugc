package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poll.a */
public final class C71231a {

    /* renamed from: a */
    public float f159629a;

    /* renamed from: b */
    public float f159630b;

    /* renamed from: c */
    public float f159631c;

    /* renamed from: d */
    public float f159632d;

    /* renamed from: e */
    public float f159633e;

    /* renamed from: f */
    public int f159634f;

    static {
        Covode.recordClassIndex(83746);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71231a)) {
            return false;
        }
        C71231a aVar = (C71231a) obj;
        return Float.compare(this.f159629a, aVar.f159629a) == 0 && Float.compare(this.f159630b, aVar.f159630b) == 0 && Float.compare(this.f159631c, aVar.f159631c) == 0 && Float.compare(this.f159632d, aVar.f159632d) == 0 && Float.compare(this.f159633e, aVar.f159633e) == 0 && this.f159634f == aVar.f159634f;
    }

    public final String toString() {
        return "AnimatorInfo(scaleX=" + this.f159629a + ", scaleY=" + this.f159630b + ", rotation=" + this.f159631c + ", x=" + this.f159632d + ", y=" + this.f159633e + ", focusIndex=" + this.f159634f + ")";
    }

    private C71231a() {
        this.f159629a = 1.0f;
        this.f159630b = 1.0f;
        this.f159631c = 0.0f;
        this.f159632d = 0.0f;
        this.f159633e = 0.0f;
        this.f159634f = 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f159629a) * 31) + Float.floatToIntBits(this.f159630b)) * 31) + Float.floatToIntBits(this.f159631c)) * 31) + Float.floatToIntBits(this.f159632d)) * 31) + Float.floatToIntBits(this.f159633e)) * 31) + this.f159634f;
    }

    public /* synthetic */ C71231a(byte b) {
        this();
    }
}
