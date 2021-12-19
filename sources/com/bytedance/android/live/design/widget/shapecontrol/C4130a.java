package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.design.widget.p235b.AbstractC4125c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.bytedance.android.live.design.widget.shapecontrol.a */
public final class C4130a<T extends View> extends AbstractC4125c<T> {

    /* renamed from: a */
    float f11537a;

    /* renamed from: b */
    ColorStateList f11538b;

    /* renamed from: c */
    float f11539c;

    /* renamed from: d */
    float f11540d;

    /* renamed from: e */
    float f11541e;

    /* renamed from: f */
    float f11542f;

    /* renamed from: g */
    float f11543g;

    /* renamed from: i */
    private boolean f11544i;

    /* renamed from: j */
    private boolean f11545j;

    /* renamed from: k */
    private boolean f11546k;

    /* renamed from: l */
    private boolean f11547l;

    /* renamed from: m */
    private boolean f11548m;

    /* renamed from: n */
    private final float[] f11549n = new float[8];

    /* renamed from: o */
    private final Path f11550o;

    /* renamed from: p */
    private final Path f11551p;

    /* renamed from: q */
    private final Paint f11552q;

    /* renamed from: r */
    private final Paint f11553r;

    /* renamed from: s */
    private final RectF f11554s;

    /* renamed from: t */
    private boolean f11555t;

    /* renamed from: u */
    private int[] f11556u;

    /* renamed from: v */
    private float[] f11557v;

    /* renamed from: w */
    private final Paint f11558w;

    /* renamed from: x */
    private int f11559x;

    static {
        Covode.recordClassIndex(4696);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9787b() {
        m10046d();
        m10045c();
        this.f11526h.invalidate();
    }

    /* renamed from: c */
    private void m10045c() {
        float f;
        float width;
        if (this.f11526h.getWidth() > 0 && this.f11526h.getHeight() > 0) {
            boolean z = true;
            if (C0792v.m2768e(this.f11526h) != 1) {
                z = false;
            }
            if (this.f11556u == null) {
                this.f11558w.setShader(null);
            } else if (this.f11559x == 0) {
                Paint paint = this.f11558w;
                if (z) {
                    f = (float) this.f11526h.getWidth();
                } else {
                    f = 0.0f;
                }
                if (z) {
                    width = 0.0f;
                } else {
                    width = (float) this.f11526h.getWidth();
                }
                paint.setShader(new LinearGradient(f, 0.0f, width, 0.0f, this.f11556u, this.f11557v, Shader.TileMode.CLAMP));
            } else {
                this.f11558w.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f11526h.getHeight(), this.f11556u, this.f11557v, Shader.TileMode.CLAMP));
            }
        }
    }

    /* renamed from: d */
    private void m10046d() {
        boolean z;
        if (this.f11526h.getWidth() > 0 && this.f11526h.getHeight() > 0) {
            if (C0792v.m2768e(this.f11526h) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f11550o.reset();
            this.f11551p.reset();
            this.f11555t = false;
            float width = (float) this.f11526h.getWidth();
            float height = (float) this.f11526h.getHeight();
            this.f11554s.set(0.0f, 0.0f, width, height);
            Arrays.fill(this.f11549n, 0.0f);
            float min = Math.min(width, height) / 2.0f;
            float f = this.f11539c;
            if (f > 0.0f) {
                float[] fArr = this.f11549n;
                fArr[7] = f;
                fArr[6] = f;
                fArr[5] = f;
                fArr[4] = f;
                fArr[3] = f;
                fArr[2] = f;
                fArr[1] = f;
                fArr[0] = f;
                this.f11555t = true;
            }
            float f2 = this.f11540d;
            if (f2 > 0.0f) {
                if (!z) {
                    float[] fArr2 = this.f11549n;
                    fArr2[1] = f2;
                    fArr2[0] = f2;
                } else {
                    float[] fArr3 = this.f11549n;
                    fArr3[3] = f2;
                    fArr3[2] = f2;
                }
                this.f11555t = true;
            }
            float f3 = this.f11541e;
            if (f3 > 0.0f) {
                if (!z) {
                    float[] fArr4 = this.f11549n;
                    fArr4[3] = f3;
                    fArr4[2] = f3;
                } else {
                    float[] fArr5 = this.f11549n;
                    fArr5[1] = f3;
                    fArr5[0] = f3;
                }
                this.f11555t = true;
            }
            float f4 = this.f11542f;
            if (f4 > 0.0f) {
                if (!z) {
                    float[] fArr6 = this.f11549n;
                    fArr6[7] = f4;
                    fArr6[6] = f4;
                } else {
                    float[] fArr7 = this.f11549n;
                    fArr7[5] = f4;
                    fArr7[4] = f4;
                }
                this.f11555t = true;
            }
            float f5 = this.f11543g;
            if (f5 > 0.0f) {
                if (!z) {
                    float[] fArr8 = this.f11549n;
                    fArr8[5] = f5;
                    fArr8[4] = f5;
                } else {
                    float[] fArr9 = this.f11549n;
                    fArr9[7] = f5;
                    fArr9[6] = f5;
                }
                this.f11555t = true;
            }
            if (this.f11544i) {
                Arrays.fill(this.f11549n, min);
                this.f11555t = true;
            }
            if (this.f11545j) {
                if (!z) {
                    float[] fArr10 = this.f11549n;
                    fArr10[1] = min;
                    fArr10[0] = min;
                } else {
                    float[] fArr11 = this.f11549n;
                    fArr11[3] = min;
                    fArr11[2] = min;
                }
                this.f11555t = true;
            }
            if (this.f11546k) {
                if (!z) {
                    float[] fArr12 = this.f11549n;
                    fArr12[3] = min;
                    fArr12[2] = min;
                } else {
                    float[] fArr13 = this.f11549n;
                    fArr13[1] = min;
                    fArr13[0] = min;
                }
                this.f11555t = true;
            }
            if (this.f11547l) {
                if (!z) {
                    float[] fArr14 = this.f11549n;
                    fArr14[7] = min;
                    fArr14[6] = min;
                } else {
                    float[] fArr15 = this.f11549n;
                    fArr15[5] = min;
                    fArr15[4] = min;
                }
                this.f11555t = true;
            }
            if (this.f11548m) {
                if (!z) {
                    float[] fArr16 = this.f11549n;
                    fArr16[5] = min;
                    fArr16[4] = min;
                } else {
                    float[] fArr17 = this.f11549n;
                    fArr17[7] = min;
                    fArr17[6] = min;
                }
                this.f11555t = true;
            }
            if (this.f11555t) {
                this.f11550o.addRoundRect(this.f11554s, this.f11549n, Path.Direction.CW);
            }
            this.f11551p.addRoundRect(this.f11554s, this.f11549n, Path.Direction.CW);
        }
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final int[] mo9513a() {
        return new int[]{16843165, 16843166, 16843275, R.attr.kq, R.attr.kr, R.attr.ku, R.attr.kv, R.attr.nn, R.attr.v3, R.attr.v4, R.attr.v5, R.attr.a8n, R.attr.afl, R.attr.afm, R.attr.ajq, R.attr.ajr, R.attr.aju, R.attr.ajv};
    }

    /* renamed from: e */
    public final void mo9800e(int i) {
        mo9631f(i);
    }

    /* renamed from: a */
    public final void mo9780a(float f) {
        this.f11537a = f;
        this.f11526h.invalidate();
    }

    /* renamed from: a */
    public final void mo9781a(int i) {
        this.f11538b = ColorStateList.valueOf(i);
        this.f11526h.invalidate();
    }

    /* renamed from: c */
    public final void mo9792c(float f) {
        this.f11540d = f;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: d */
    public final void mo9796d(float f) {
        this.f11541e = f;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: e */
    public final void mo9799e(float f) {
        this.f11542f = f;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: f */
    public final void mo9802f(float f) {
        this.f11543g = f;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: a */
    public final void mo9782a(ColorStateList colorStateList) {
        this.f11538b = colorStateList;
        this.f11526h.invalidate();
    }

    /* renamed from: b */
    public final void mo9788b(float f) {
        this.f11539c = f;
        m10046d();
        this.f11526h.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9794c(Canvas canvas) {
        if (this.f11555t) {
            canvas.drawPath(this.f11550o, this.f11552q);
            canvas.restore();
        }
    }

    /* renamed from: d */
    public final void mo9797d(int i) {
        this.f11559x = i;
        m10045c();
        this.f11526h.invalidate();
    }

    /* renamed from: e */
    public final void mo9801e(boolean z) {
        this.f11548m = z;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: a */
    public final void mo9784a(boolean z) {
        this.f11544i = z;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: b */
    public final void mo9789b(int i) {
        if (i != 0) {
            TypedArray obtainTypedArray = this.f11526h.getContext().getResources().obtainTypedArray(i);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = obtainTypedArray.getColor(i2, -16777216);
            }
            mo9786a(iArr);
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: c */
    public final void mo9793c(int i) {
        if (i != 0) {
            TypedArray obtainTypedArray = this.f11526h.getContext().getResources().obtainTypedArray(i);
            int length = obtainTypedArray.length();
            float[] fArr = new float[length];
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = obtainTypedArray.getFloat(i2, 0.0f);
            }
            mo9785a(fArr);
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public final void mo9798d(boolean z) {
        this.f11547l = z;
        m10046d();
        this.f11526h.invalidate();
    }

    public C4130a(T t) {
        super(t);
        Path path = new Path();
        this.f11550o = path;
        Path path2 = new Path();
        this.f11551p = path2;
        Paint paint = new Paint(1);
        this.f11552q = paint;
        Paint paint2 = new Paint(1);
        this.f11553r = paint2;
        this.f11554s = new RectF();
        this.f11558w = new Paint(1);
        this.f11559x = 0;
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        path2.setFillType(Path.FillType.WINDING);
        paint2.setStyle(Paint.Style.STROKE);
        t.setWillNotDraw(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9783a(Canvas canvas) {
        ColorStateList colorStateList;
        int colorForState;
        if (this.f11556u != null) {
            canvas.drawRect(0.0f, 0.0f, (float) this.f11526h.getWidth(), (float) this.f11526h.getHeight(), this.f11558w);
        }
        if (this.f11537a > 0.0f && (colorStateList = this.f11538b) != null && (colorForState = colorStateList.getColorForState(this.f11526h.getDrawableState(), 0)) != 0) {
            this.f11553r.setStrokeWidth(this.f11537a * 2.0f);
            this.f11553r.setColor(colorForState);
            canvas.drawPath(this.f11551p, this.f11553r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9790b(Canvas canvas) {
        if (!this.f11555t) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.saveLayer(0.0f, 0.0f, (float) this.f11526h.getWidth(), (float) this.f11526h.getHeight(), null);
        } else {
            canvas.saveLayer(0.0f, 0.0f, (float) this.f11526h.getWidth(), (float) this.f11526h.getHeight(), null, 31);
        }
    }

    @Override // com.bytedance.android.live.design.widget.p235b.AbstractC4125c
    /* renamed from: a */
    public final void mo9512a(TypedArray typedArray) {
        this.f11544i = typedArray.getBoolean(7, this.f11544i);
        this.f11545j = typedArray.getBoolean(14, this.f11545j);
        this.f11546k = typedArray.getBoolean(16, this.f11546k);
        this.f11547l = typedArray.getBoolean(3, this.f11547l);
        this.f11548m = typedArray.getBoolean(5, this.f11548m);
        this.f11539c = typedArray.getDimension(11, this.f11539c);
        this.f11540d = typedArray.getDimension(15, this.f11540d);
        this.f11541e = typedArray.getDimension(17, this.f11541e);
        this.f11542f = typedArray.getDimension(4, this.f11542f);
        this.f11543g = typedArray.getDimension(6, this.f11543g);
        int resourceId = typedArray.getResourceId(12, 0);
        if (resourceId != 0) {
            this.f11538b = C0196a.m618a(this.f11526h.getContext(), resourceId);
        } else if (typedArray.hasValue(12)) {
            this.f11538b = typedArray.getColorStateList(12);
        }
        this.f11537a = typedArray.getDimension(13, this.f11537a);
        this.f11556u = null;
        this.f11557v = null;
        if (typedArray.hasValue(0) && typedArray.hasValue(1)) {
            int color = typedArray.getColor(0, 0);
            int color2 = typedArray.getColor(1, 0);
            if (typedArray.hasValue(2)) {
                this.f11556u = new int[]{color, typedArray.getColor(2, 0), color2};
            } else {
                this.f11556u = new int[]{color, color2};
            }
        } else if (typedArray.hasValue(8)) {
            mo9789b(typedArray.getResourceId(8, 0));
        }
        if (typedArray.hasValue(10)) {
            mo9793c(typedArray.getResourceId(10, 0));
        }
        this.f11559x = typedArray.getInt(9, this.f11559x);
        m10046d();
        m10045c();
    }

    /* renamed from: b */
    public final void mo9791b(boolean z) {
        this.f11545j = z;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: c */
    public final void mo9795c(boolean z) {
        this.f11546k = z;
        m10046d();
        this.f11526h.invalidate();
    }

    /* renamed from: a */
    public final void mo9785a(float[] fArr) {
        this.f11557v = fArr;
        m10045c();
        this.f11526h.invalidate();
    }

    /* renamed from: a */
    public final void mo9786a(int[] iArr) {
        if (iArr == null || iArr.length >= 2) {
            this.f11556u = iArr;
            m10045c();
            this.f11526h.invalidate();
        }
    }
}
