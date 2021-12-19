package com.facebook.drawee.p1854e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.drawee.e.a */
public class C24210a extends Drawable implements Drawable.Callback, AbstractC24242r, AbstractC24243s {

    /* renamed from: a */
    public final Drawable[] f57344a;

    /* renamed from: b */
    public final AbstractC24213c[] f57345b;

    /* renamed from: c */
    private AbstractC24243s f57346c;

    /* renamed from: d */
    private final C24214d f57347d = new C24214d();

    /* renamed from: e */
    private final Rect f57348e = new Rect();

    /* renamed from: f */
    private boolean f57349f;

    /* renamed from: g */
    private boolean f57350g;

    /* renamed from: h */
    private boolean f57351h;

    static {
        Covode.recordClassIndex(28341);
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f57344a.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f57351h = true;
                return this;
            }
        }
    }

    public boolean isStateful() {
        if (!this.f57350g) {
            this.f57349f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f57344a;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f57349f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f57349f = z2 | z;
                i++;
            }
            this.f57350g = true;
        }
        return this.f57349f;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24242r
    public void setTransformCallback(AbstractC24243s sVar) {
        this.f57346c = sVar;
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24243s
    public void getRootBounds(RectF rectF) {
        AbstractC24243s sVar = this.f57346c;
        if (sVar != null) {
            sVar.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.p1854e.AbstractC24243s
    public void getTransform(Matrix matrix) {
        AbstractC24243s sVar = this.f57346c;
        if (sVar != null) {
            sVar.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: a */
    public final Drawable mo39842a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i >= this.f57344a.length) {
            z2 = false;
        }
        C24091i.m45620a(z2);
        return this.f57344a[i];
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void setAlpha(int i) {
        this.f57347d.f57358a = i;
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f57347d.mo39870a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f57347d.mo39872a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f57347d.mo39873b(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public C24210a(Drawable[] drawableArr) {
        int i = 0;
        this.f57349f = false;
        this.f57350g = false;
        this.f57351h = false;
        C24091i.m45617a(drawableArr);
        this.f57344a = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f57344a;
            if (i < drawableArr2.length) {
                C24215e.m45946a(drawableArr2[i], this, this);
                i++;
            } else {
                this.f57345b = new AbstractC24213c[drawableArr2.length];
                return;
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f57348e;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f57344a;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    /* renamed from: a */
    public final Drawable mo39843a(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i >= this.f57344a.length) {
            z2 = false;
        }
        C24091i.m45620a(z2);
        Drawable drawable2 = this.f57344a[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f57351h) {
                drawable.mutate();
            }
            C24215e.m45946a(this.f57344a[i], null, null);
            C24215e.m45946a(drawable, null, null);
            C24215e.m45948a(drawable, this.f57347d);
            C24215e.m45947a(drawable, this);
            C24215e.m45946a(drawable, this, this);
            this.f57350g = false;
            this.f57344a[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
