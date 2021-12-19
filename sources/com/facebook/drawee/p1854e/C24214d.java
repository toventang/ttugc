package com.facebook.drawee.p1854e;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.e.d */
public class C24214d {

    /* renamed from: a */
    public int f57358a = -1;

    /* renamed from: b */
    private boolean f57359b;

    /* renamed from: c */
    private ColorFilter f57360c;

    /* renamed from: d */
    private int f57361d = -1;

    /* renamed from: e */
    private int f57362e = -1;

    static {
        Covode.recordClassIndex(28345);
    }

    /* renamed from: a */
    public final void mo39872a(boolean z) {
        this.f57361d = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo39873b(boolean z) {
        this.f57362e = z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo39870a(ColorFilter colorFilter) {
        this.f57360c = colorFilter;
        this.f57359b = true;
    }

    /* renamed from: a */
    public final void mo39871a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            int i = this.f57358a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f57359b) {
                drawable.setColorFilter(this.f57360c);
            }
            int i2 = this.f57361d;
            boolean z2 = true;
            if (i2 != -1) {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            int i3 = this.f57362e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z2 = false;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }
}
