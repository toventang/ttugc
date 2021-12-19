package com.lynx.tasm.p2055d;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.d.d */
public final class C28766d {

    /* renamed from: a */
    private Typeface f67844a;

    /* renamed from: b */
    private Typeface[] f67845b;

    static {
        Covode.recordClassIndex(34865);
    }

    C28766d(Typeface typeface) {
        Typeface[] typefaceArr = new Typeface[4];
        this.f67845b = typefaceArr;
        this.f67844a = typeface;
        typefaceArr[0] = typeface;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Typeface mo49887a(int i) {
        if (i < 0 || i > 3) {
            i = 0;
        }
        Typeface[] typefaceArr = this.f67845b;
        if (typefaceArr[i] == null) {
            typefaceArr[i] = Typeface.create(this.f67844a, i);
        }
        return this.f67845b[i];
    }
}
