package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f1891e = {16842801};

    /* renamed from: f */
    private static final AbstractC0506e f1892f;

    /* renamed from: a */
    int f1893a;

    /* renamed from: b */
    int f1894b;

    /* renamed from: c */
    final Rect f1895c;

    /* renamed from: d */
    final Rect f1896d;

    /* renamed from: g */
    private boolean f1897g;

    /* renamed from: h */
    private boolean f1898h;

    /* renamed from: i */
    private final AbstractC0505d f1899i;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public boolean getPreventCornerOverlap() {
        return this.f1898h;
    }

    public boolean getUseCompatPadding() {
        return this.f1897g;
    }

    public int getContentPaddingBottom() {
        return this.f1895c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1895c.left;
    }

    public int getContentPaddingRight() {
        return this.f1895c.right;
    }

    public int getContentPaddingTop() {
        return this.f1895c.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return f1892f.mo2236h(this.f1899i);
    }

    public float getCardElevation() {
        return f1892f.mo2233e(this.f1899i);
    }

    public float getMaxCardElevation() {
        return f1892f.mo2224a(this.f1899i);
    }

    public float getRadius() {
        return f1892f.mo2232d(this.f1899i);
    }

    static {
        Covode.recordClassIndex(565);
        if (Build.VERSION.SDK_INT >= 21) {
            f1892f = new C0502b();
        } else {
            int i = Build.VERSION.SDK_INT;
            f1892f = new C0500a();
        }
        f1892f.mo2222a();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1892f.mo2227a(this.f1899i, colorStateList);
    }

    public void setCardElevation(float f) {
        f1892f.mo2231c(this.f1899i, f);
    }

    public void setMaxCardElevation(float f) {
        f1892f.mo2229b(this.f1899i, f);
    }

    public void setMinimumHeight(int i) {
        this.f1894b = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1893a = i;
        super.setMinimumWidth(i);
    }

    public void setRadius(float f) {
        f1892f.mo2225a(this.f1899i, f);
    }

    public void setCardBackgroundColor(int i) {
        f1892f.mo2227a(this.f1899i, ColorStateList.valueOf(i));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1898h) {
            this.f1898h = z;
            f1892f.mo2235g(this.f1899i);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1897g != z) {
            this.f1897g = z;
            f1892f.mo2234f(this.f1899i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mk);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC0506e eVar = f1892f;
        if (!(eVar instanceof C0502b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2228b(this.f1899i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.mo2230c(this.f1899i)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1895c = rect;
        this.f1896d = new Rect();
        C04991 r7 = new AbstractC0505d() {
            /* class androidx.cardview.widget.CardView.C04991 */

            /* renamed from: b */
            private Drawable f1901b;

            static {
                Covode.recordClassIndex(566);
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: c */
            public final Drawable mo2220c() {
                return this.f1901b;
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: d */
            public final View mo2221d() {
                return CardView.this;
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: b */
            public final boolean mo2219b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: a */
            public final boolean mo2218a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: a */
            public final void mo2217a(Drawable drawable) {
                this.f1901b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: a */
            public final void mo2215a(int i, int i2) {
                if (i > CardView.this.f1893a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f1894b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            @Override // androidx.cardview.widget.AbstractC0505d
            /* renamed from: a */
            public final void mo2216a(int i, int i2, int i3, int i4) {
                CardView.this.f1896d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.f1895c.left, i2 + CardView.this.f1895c.top, i3 + CardView.this.f1895c.right, i4 + CardView.this.f1895c.bottom);
            }
        };
        this.f1899i = r7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.me, R.attr.mf, R.attr.mg, R.attr.mh, R.attr.mi, R.attr.mj, R.attr.pp, R.attr.pq, R.attr.pr, R.attr.ps, R.attr.pt}, i, R.style.f7);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1891e);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.et);
            } else {
                color = getResources().getColor(R.color.es);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1897g = obtainStyledAttributes.getBoolean(7, false);
        this.f1898h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1893a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1894b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f1892f.mo2226a(r7, context, valueOf, dimension, dimension2, dimension3);
    }
}
