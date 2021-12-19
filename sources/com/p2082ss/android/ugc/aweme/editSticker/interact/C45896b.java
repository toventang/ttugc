package com.p2082ss.android.ugc.aweme.editSticker.interact;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.b */
public final class C45896b {

    /* renamed from: a */
    public float f106884a;

    /* renamed from: b */
    public float f106885b;

    /* renamed from: c */
    public float f106886c;

    /* renamed from: d */
    public float f106887d;

    static {
        Covode.recordClassIndex(54420);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45896b)) {
            return false;
        }
        C45896b bVar = (C45896b) obj;
        return Float.compare(this.f106884a, bVar.f106884a) == 0 && Float.compare(this.f106885b, bVar.f106885b) == 0 && Float.compare(this.f106886c, bVar.f106886c) == 0 && Float.compare(this.f106887d, bVar.f106887d) == 0;
    }

    public final String toString() {
        return "EditStickerLocationData(rotate=" + this.f106884a + ", scale=" + this.f106885b + ", xLocation=" + this.f106886c + ", yLocation=" + this.f106887d + ")";
    }

    private /* synthetic */ C45896b() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.f106884a) * 31) + Float.floatToIntBits(this.f106885b)) * 31) + Float.floatToIntBits(this.f106886c)) * 31) + Float.floatToIntBits(this.f106887d);
    }

    public C45896b(float f, float f2, float f3, float f4) {
        this.f106884a = f;
        this.f106885b = f2;
        this.f106886c = f3;
        this.f106887d = f4;
    }
}
