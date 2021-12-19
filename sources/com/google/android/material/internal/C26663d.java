package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.internal.d */
public class C26663d extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f63178a;

    /* renamed from: b */
    boolean f63179b;

    /* renamed from: c */
    private Drawable f63180c;

    /* renamed from: d */
    private final Rect f63181d;

    /* renamed from: e */
    private final Rect f63182e;

    /* renamed from: h */
    private int f63183h;

    static {
        Covode.recordClassIndex(32119);
    }

    public Drawable getForeground() {
        return this.f63180c;
    }

    public int getForegroundGravity() {
        return this.f63183h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f63180c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f63180c;
        if (drawable != null && drawable.isStateful()) {
            this.f63180c.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f63180c) {
            return true;
        }
        return false;
    }

    public void setForegroundGravity(int i) {
        if (this.f63183h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f63183h = i;
            if (i == 119 && this.f63180c != null) {
                this.f63180c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f63180c;
        if (drawable != null) {
            if (this.f63179b) {
                this.f63179b = false;
                Rect rect = this.f63181d;
                Rect rect2 = this.f63182e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f63178a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f63183h, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f63180c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f63180c);
            }
            this.f63180c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f63183h == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public C26663d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f63180c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public C26663d(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f63181d = new Rect();
        this.f63182e = new Rect();
        this.f63183h = 119;
        this.f63178a = true;
        this.f63179b = false;
        TypedArray a = C26685k.m52976a(context, attributeSet, new int[]{16843017, 16843264, R.attr.uv}, 0, 0, new int[0]);
        this.f63183h = a.getInt(1, this.f63183h);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f63178a = a.getBoolean(2, true);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f63179b = true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f63179b = z | this.f63179b;
    }
}
