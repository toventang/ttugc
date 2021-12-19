package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.f */
public class C24216f extends C24210a {

    /* renamed from: c */
    public int f57363c;

    /* renamed from: d */
    public int f57364d;

    /* renamed from: e */
    long f57365e;

    /* renamed from: f */
    int[] f57366f;

    /* renamed from: g */
    int[] f57367g;

    /* renamed from: h */
    int f57368h;

    /* renamed from: i */
    boolean[] f57369i;

    /* renamed from: j */
    int f57370j;

    /* renamed from: k */
    private final Drawable[] f57371k;

    static {
        Covode.recordClassIndex(28347);
    }

    public int getAlpha() {
        return this.f57368h;
    }

    /* renamed from: a */
    public final void mo39874a() {
        this.f57370j++;
    }

    public void invalidateSelf() {
        if (this.f57370j == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo39875b() {
        this.f57370j--;
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo39877c() {
        this.f57363c = 0;
        Arrays.fill(this.f57369i, true);
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo39879d() {
        int i;
        this.f57363c = 2;
        for (int i2 = 0; i2 < this.f57371k.length; i2++) {
            int[] iArr = this.f57367g;
            if (this.f57369i[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo39880d(int i) {
        this.f57363c = 0;
        this.f57369i[i] = false;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.C24210a
    public void setAlpha(int i) {
        if (this.f57368h != i) {
            this.f57368h = i;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo39876b(int i) {
        this.f57364d = i;
        if (this.f57363c == 1) {
            this.f57363c = 0;
        }
    }

    /* renamed from: c */
    public final void mo39878c(int i) {
        this.f57363c = 0;
        this.f57369i[i] = true;
        invalidateSelf();
    }

    public C24216f(Drawable[] drawableArr) {
        super(drawableArr);
        boolean z;
        if (drawableArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45623b(z, "At least one layer required!");
        this.f57371k = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f57366f = iArr;
        this.f57367g = new int[drawableArr.length];
        this.f57368h = 255;
        this.f57369i = new boolean[drawableArr.length];
        this.f57370j = 0;
        this.f57363c = 2;
        Arrays.fill(iArr, 0);
        this.f57366f[0] = 255;
        Arrays.fill(this.f57367g, 0);
        this.f57367g[0] = 255;
        Arrays.fill(this.f57369i, false);
        this.f57369i[0] = true;
    }

    /* renamed from: a */
    private boolean m45949a(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f57371k.length; i2++) {
            boolean[] zArr = this.f57369i;
            if (zArr[i2]) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.f57367g;
            iArr[i2] = (int) (((float) this.f57366f[i2]) + (((float) (i * 255)) * f));
            if (iArr[i2] < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (zArr[i2] && iArr[i2] < 255) {
                z = false;
            }
            if (!zArr[i2] && iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.facebook.drawee.p1854e.C24210a
    public void draw(Canvas canvas) {
        boolean z;
        float f;
        boolean z2;
        int i = this.f57363c;
        int i2 = 2;
        int i3 = 0;
        if (i == 0) {
            System.arraycopy(this.f57367g, 0, this.f57366f, 0, this.f57371k.length);
            this.f57365e = SystemClock.uptimeMillis();
            if (this.f57364d == 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            z = m45949a(f);
            if (!z) {
                i2 = 1;
            }
            this.f57363c = i2;
        } else if (i != 1) {
            z = true;
        } else {
            if (this.f57364d > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C24091i.m45622b(z2);
            z = m45949a(((float) (SystemClock.uptimeMillis() - this.f57365e)) / ((float) this.f57364d));
            if (!z) {
                i2 = 1;
            }
            this.f57363c = i2;
        }
        while (true) {
            Drawable[] drawableArr = this.f57371k;
            if (i3 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i3];
            int i4 = (this.f57367g[i3] * this.f57368h) / 255;
            if (drawable != null && i4 > 0) {
                this.f57370j++;
                drawable.mutate().setAlpha(i4);
                this.f57370j--;
                drawable.draw(canvas);
            }
            i3++;
        }
        if (!z) {
            invalidateSelf();
        }
    }
}
