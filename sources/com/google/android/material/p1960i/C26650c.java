package com.google.android.material.p1960i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.AbstractC0710e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.i.c */
public final class C26650c extends Drawable implements AbstractC0710e {

    /* renamed from: a */
    public C26655e f63052a;

    /* renamed from: b */
    public boolean f63053b;

    /* renamed from: c */
    public float f63054c;

    /* renamed from: d */
    public int f63055d;

    /* renamed from: e */
    public int f63056e;

    /* renamed from: f */
    public float f63057f;

    /* renamed from: g */
    public float f63058g;

    /* renamed from: h */
    public Paint.Style f63059h;

    /* renamed from: i */
    public ColorStateList f63060i;

    /* renamed from: j */
    private final Paint f63061j;

    /* renamed from: k */
    private final Matrix[] f63062k;

    /* renamed from: l */
    private final Matrix[] f63063l;

    /* renamed from: m */
    private final C26651d[] f63064m;

    /* renamed from: n */
    private final Matrix f63065n;

    /* renamed from: o */
    private final Path f63066o;

    /* renamed from: p */
    private final PointF f63067p;

    /* renamed from: q */
    private final C26651d f63068q;

    /* renamed from: r */
    private final Region f63069r;

    /* renamed from: s */
    private final Region f63070s;

    /* renamed from: t */
    private final float[] f63071t;

    /* renamed from: u */
    private final float[] f63072u;

    /* renamed from: v */
    private boolean f63073v;

    /* renamed from: w */
    private int f63074w;

    /* renamed from: x */
    private int f63075x;

    /* renamed from: y */
    private PorterDuffColorFilter f63076y;

    /* renamed from: z */
    private PorterDuff.Mode f63077z;

    static {
        Covode.recordClassIndex(32101);
    }

    public final int getOpacity() {
        return -3;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f63069r.set(bounds);
        m52905b(bounds.width(), bounds.height(), this.f63066o);
        this.f63070s.setPath(this.f63066o, this.f63069r);
        this.f63069r.op(this.f63070s, Region.Op.DIFFERENCE);
        return this.f63069r;
    }

    /* renamed from: a */
    private void m52902a() {
        ColorStateList colorStateList = this.f63060i;
        if (colorStateList == null || this.f63077z == null) {
            this.f63076y = null;
            return;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        this.f63076y = new PorterDuffColorFilter(colorForState, this.f63077z);
        if (this.f63073v) {
            this.f63074w = colorForState;
        }
    }

    /* renamed from: a */
    public final void mo44108a(float f) {
        this.f63054c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f63075x = i;
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f63061j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintList(ColorStateList colorStateList) {
        this.f63060i = colorStateList;
        m52902a();
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f63077z = mode;
        m52902a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f63061j.setColorFilter(this.f63076y);
        int alpha = this.f63061j.getAlpha();
        Paint paint = this.f63061j;
        int i = this.f63075x;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f63061j.setStrokeWidth(this.f63058g);
        this.f63061j.setStyle(this.f63059h);
        int i2 = this.f63055d;
        if (i2 > 0 && this.f63053b) {
            this.f63061j.setShadowLayer((float) this.f63056e, 0.0f, (float) i2, this.f63074w);
        }
        if (this.f63052a != null) {
            m52905b(canvas.getWidth(), canvas.getHeight(), this.f63066o);
            canvas.drawPath(this.f63066o, this.f63061j);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f63061j);
        }
        this.f63061j.setAlpha(alpha);
    }

    /* renamed from: a */
    private float m52901a(int i, int i2, int i3) {
        m52903a(i, i2, i3, this.f63067p);
        float f = this.f63067p.x;
        float f2 = this.f63067p.y;
        m52903a((i + 1) % 4, i2, i3, this.f63067p);
        return (float) Math.atan2((double) (this.f63067p.y - f2), (double) (this.f63067p.x - f));
    }

    /* renamed from: b */
    private void m52905b(int i, int i2, Path path) {
        m52904a(i, i2, path);
        if (this.f63057f != 1.0f) {
            this.f63065n.reset();
            Matrix matrix = this.f63065n;
            float f = this.f63057f;
            matrix.setScale(f, f, (float) (i / 2), (float) (i2 / 2));
            path.transform(this.f63065n);
        }
    }

    /* renamed from: a */
    private void m52904a(int i, int i2, Path path) {
        C26649b bVar;
        path.rewind();
        if (this.f63052a != null) {
            int i3 = 0;
            while (i3 < 4) {
                m52903a(i3, i, i2, this.f63067p);
                int i4 = ((i3 - 1) + 4) % 4;
                m52903a(i4, i, i2, this.f63067p);
                float f = this.f63067p.x;
                float f2 = this.f63067p.y;
                int i5 = i3 + 1;
                m52903a(i5 % 4, i, i2, this.f63067p);
                float f3 = this.f63067p.x;
                float f4 = this.f63067p.y;
                m52903a(i3, i, i2, this.f63067p);
                float f5 = this.f63067p.x;
                float f6 = this.f63067p.y;
                Math.atan2((double) (f2 - f6), (double) (f - f5));
                Math.atan2((double) (f4 - f6), (double) (f3 - f5));
                this.f63062k[i3].reset();
                this.f63062k[i3].setTranslate(this.f63067p.x, this.f63067p.y);
                this.f63062k[i3].preRotate((float) Math.toDegrees((double) (m52901a(i4, i, i2) + 1.5707964f)));
                this.f63071t[0] = this.f63064m[i3].f63080c;
                this.f63071t[1] = this.f63064m[i3].f63081d;
                this.f63062k[i3].mapPoints(this.f63071t);
                float a = m52901a(i3, i, i2);
                this.f63063l[i3].reset();
                Matrix matrix = this.f63063l[i3];
                float[] fArr = this.f63071t;
                matrix.setTranslate(fArr[0], fArr[1]);
                this.f63063l[i3].preRotate((float) Math.toDegrees((double) a));
                i3 = i5;
            }
            int i6 = 0;
            do {
                this.f63071t[0] = this.f63064m[i6].f63078a;
                this.f63071t[1] = this.f63064m[i6].f63079b;
                this.f63062k[i6].mapPoints(this.f63071t);
                if (i6 == 0) {
                    float[] fArr2 = this.f63071t;
                    path.moveTo(fArr2[0], fArr2[1]);
                } else {
                    float[] fArr3 = this.f63071t;
                    path.lineTo(fArr3[0], fArr3[1]);
                }
                this.f63064m[i6].mo44116a(this.f63062k[i6], path);
                int i7 = i6 + 1;
                int i8 = i7 % 4;
                this.f63071t[0] = this.f63064m[i6].f63080c;
                this.f63071t[1] = this.f63064m[i6].f63081d;
                this.f63062k[i6].mapPoints(this.f63071t);
                this.f63072u[0] = this.f63064m[i8].f63078a;
                this.f63072u[1] = this.f63064m[i8].f63079b;
                this.f63062k[i8].mapPoints(this.f63072u);
                float[] fArr4 = this.f63071t;
                float f7 = fArr4[0];
                float[] fArr5 = this.f63072u;
                float hypot = (float) Math.hypot((double) (f7 - fArr5[0]), (double) (fArr4[1] - fArr5[1]));
                C26651d dVar = this.f63068q;
                dVar.f63078a = 0.0f;
                dVar.f63079b = 0.0f;
                dVar.f63080c = 0.0f;
                dVar.f63081d = 0.0f;
                dVar.f63082e.clear();
                if (i6 == 1) {
                    bVar = this.f63052a.f63096b;
                } else if (i6 == 2) {
                    bVar = this.f63052a.f63097c;
                } else if (i6 != 3) {
                    bVar = this.f63052a.f63095a;
                } else {
                    bVar = this.f63052a.f63098d;
                }
                bVar.mo43896a(hypot, this.f63054c, this.f63068q);
                this.f63068q.mo44116a(this.f63063l[i6], path);
                i6 = i7;
            } while (i6 < 4);
            path.close();
        }
    }

    /* renamed from: a */
    private static void m52903a(int i, int i2, int i3, PointF pointF) {
        if (i == 1) {
            pointF.set((float) i2, 0.0f);
        } else if (i == 2) {
            pointF.set((float) i2, (float) i3);
        } else if (i != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, (float) i3);
        }
    }
}
