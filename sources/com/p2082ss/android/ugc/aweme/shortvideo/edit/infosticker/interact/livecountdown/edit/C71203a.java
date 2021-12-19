package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.a */
public final class C71203a {

    /* renamed from: a */
    public float f159556a;

    /* renamed from: b */
    public float f159557b;

    /* renamed from: c */
    public float f159558c;

    /* renamed from: d */
    public float f159559d;

    /* renamed from: e */
    public float f159560e;

    /* renamed from: f */
    public int f159561f;

    static {
        Covode.recordClassIndex(83713);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71203a)) {
            return false;
        }
        C71203a aVar = (C71203a) obj;
        return Float.compare(this.f159556a, aVar.f159556a) == 0 && Float.compare(this.f159557b, aVar.f159557b) == 0 && Float.compare(this.f159558c, aVar.f159558c) == 0 && Float.compare(this.f159559d, aVar.f159559d) == 0 && Float.compare(this.f159560e, aVar.f159560e) == 0 && this.f159561f == aVar.f159561f;
    }

    public final String toString() {
        return "AnimatorInfo(scaleX=" + this.f159556a + ", scaleY=" + this.f159557b + ", rotation=" + this.f159558c + ", x=" + this.f159559d + ", y=" + this.f159560e + ", focusIndex=" + this.f159561f + ")";
    }

    private C71203a() {
        this.f159556a = 1.0f;
        this.f159557b = 1.0f;
        this.f159558c = 0.0f;
        this.f159559d = 0.0f;
        this.f159560e = 0.0f;
        this.f159561f = 0;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f159556a) * 31) + Float.floatToIntBits(this.f159557b)) * 31) + Float.floatToIntBits(this.f159558c)) * 31) + Float.floatToIntBits(this.f159559d)) * 31) + Float.floatToIntBits(this.f159560e)) * 31) + this.f159561f;
    }

    public /* synthetic */ C71203a(byte b) {
        this();
    }
}
