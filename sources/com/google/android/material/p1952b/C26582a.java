package com.google.android.material.p1952b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.C0792v;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.C26685k;
import com.google.android.material.internal.C26686l;
import com.google.android.material.p1957f.C26630a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.b.a */
public final class C26582a extends AppCompatButton {

    /* renamed from: a */
    private final C26584c f62757a;

    /* renamed from: b */
    private int f62758b;

    /* renamed from: c */
    private PorterDuff.Mode f62759c;

    /* renamed from: e */
    private ColorStateList f62760e;

    /* renamed from: f */
    private Drawable f62761f;

    /* renamed from: g */
    private int f62762g;

    /* renamed from: h */
    private int f62763h;

    /* renamed from: i */
    private int f62764i;

    static {
        Covode.recordClassIndex(32019);
    }

    public final Drawable getIcon() {
        return this.f62761f;
    }

    public final int getIconGravity() {
        return this.f62764i;
    }

    public final int getIconPadding() {
        return this.f62758b;
    }

    public final int getIconSize() {
        return this.f62762g;
    }

    public final ColorStateList getIconTint() {
        return this.f62760e;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f62759c;
    }

    public final ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    /* renamed from: b */
    private boolean m52693b() {
        C26584c cVar = this.f62757a;
        if (cVar == null || cVar.f62787w) {
            return false;
        }
        return true;
    }

    public final int getCornerRadius() {
        if (m52693b()) {
            return this.f62757a.f62771g;
        }
        return 0;
    }

    public final ColorStateList getRippleColor() {
        if (m52693b()) {
            return this.f62757a.f62776l;
        }
        return null;
    }

    public final ColorStateList getStrokeColor() {
        if (m52693b()) {
            return this.f62757a.f62775k;
        }
        return null;
    }

    public final int getStrokeWidth() {
        if (m52693b()) {
            return this.f62757a.f62772h;
        }
        return 0;
    }

    @Override // androidx.core.p037h.AbstractC0791u, androidx.appcompat.widget.AppCompatButton
    public final ColorStateList getSupportBackgroundTintList() {
        if (m52693b()) {
            return this.f62757a.f62774j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.core.p037h.AbstractC0791u, androidx.appcompat.widget.AppCompatButton
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m52693b()) {
            return this.f62757a.f62773i;
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: a */
    private void m52692a() {
        Drawable drawable = this.f62761f;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f62761f = mutate;
            C0705a.m2496a(mutate, this.f62760e);
            PorterDuff.Mode mode = this.f62759c;
            if (mode != null) {
                C0705a.m2499a(this.f62761f, mode);
            }
            int i = this.f62762g;
            if (i == 0) {
                i = this.f62761f.getIntrinsicWidth();
            }
            int i2 = this.f62762g;
            if (i2 == 0) {
                i2 = this.f62761f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f62761f;
            int i3 = this.f62763h;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        C0823h.m2909a(this, this.f62761f);
    }

    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public final void setIconGravity(int i) {
        this.f62764i = i;
    }

    /* access modifiers changed from: package-private */
    public final void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0196a.m619b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public final void setIcon(Drawable drawable) {
        if (this.f62761f != drawable) {
            this.f62761f = drawable;
            m52692a();
        }
    }

    public final void setIconPadding(int i) {
        if (this.f62758b != i) {
            this.f62758b = i;
            setCompoundDrawablePadding(i);
        }
    }

    public final void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0196a.m619b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        if (this.f62760e != colorStateList) {
            this.f62760e = colorStateList;
            m52692a();
        }
    }

    public final void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f62759c != mode) {
            this.f62759c = mode;
            m52692a();
        }
    }

    public final void setIconTintResource(int i) {
        setIconTint(C0196a.m618a(getContext(), i));
    }

    public final void setCornerRadiusResource(int i) {
        if (m52693b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public final void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f62762g != i) {
            this.f62762g = i;
            m52692a();
        }
    }

    public final void setRippleColorResource(int i) {
        if (m52693b()) {
            setRippleColor(C0196a.m618a(getContext(), i));
        }
    }

    public final void setStrokeColorResource(int i) {
        if (m52693b()) {
            setStrokeColor(C0196a.m618a(getContext(), i));
        }
    }

    public final void setStrokeWidth(int i) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62772h != i) {
                cVar.f62772h = i;
                cVar.f62777m.setStrokeWidth((float) i);
                cVar.mo43863c();
            }
        }
    }

    public final void setStrokeWidthResource(int i) {
        if (m52693b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public final void setBackgroundColor(int i) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (C26584c.f62765a && cVar.f62784t != null) {
                cVar.f62784t.setColor(i);
            } else if (!C26584c.f62765a && cVar.f62780p != null) {
                cVar.f62780p.setColor(i);
            }
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void setBackgroundDrawable(Drawable drawable) {
        if (m52693b()) {
            if (drawable != getBackground()) {
                C26584c cVar = this.f62757a;
                cVar.f62787w = true;
                cVar.f62766b.setSupportBackgroundTintList(cVar.f62774j);
                cVar.f62766b.setSupportBackgroundTintMode(cVar.f62773i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62776l != colorStateList) {
                cVar.f62776l = colorStateList;
                if (C26584c.f62765a && (cVar.f62766b.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) cVar.f62766b.getBackground()).setColor(colorStateList);
                } else if (!C26584c.f62765a && cVar.f62783s != null) {
                    C0705a.m2496a(cVar.f62783s, colorStateList);
                }
            }
        }
    }

    public final void setStrokeColor(ColorStateList colorStateList) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62775k != colorStateList) {
                cVar.f62775k = colorStateList;
                Paint paint = cVar.f62777m;
                int i = 0;
                if (colorStateList != null) {
                    i = colorStateList.getColorForState(cVar.f62766b.getDrawableState(), 0);
                }
                paint.setColor(i);
                cVar.mo43863c();
            }
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u, androidx.appcompat.widget.AppCompatButton
    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62774j != colorStateList) {
                cVar.f62774j = colorStateList;
                if (C26584c.f62765a) {
                    cVar.mo43861a();
                } else if (cVar.f62781q != null) {
                    C0705a.m2496a(cVar.f62781q, cVar.f62774j);
                }
            }
        } else if (this.f62757a != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u, androidx.appcompat.widget.AppCompatButton
    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62773i != mode) {
                cVar.f62773i = mode;
                if (C26584c.f62765a) {
                    cVar.mo43861a();
                } else if (cVar.f62781q != null && cVar.f62773i != null) {
                    C0705a.m2499a(cVar.f62781q, cVar.f62773i);
                }
            }
        } else if (this.f62757a != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && m52693b()) {
            C26584c cVar = this.f62757a;
            if (canvas != null && cVar.f62775k != null && cVar.f62772h > 0) {
                cVar.f62778n.set(cVar.f62766b.getBackground().getBounds());
                cVar.f62779o.set(((float) cVar.f62778n.left) + (((float) cVar.f62772h) / 2.0f) + ((float) cVar.f62767c), ((float) cVar.f62778n.top) + (((float) cVar.f62772h) / 2.0f) + ((float) cVar.f62769e), (((float) cVar.f62778n.right) - (((float) cVar.f62772h) / 2.0f)) - ((float) cVar.f62768d), (((float) cVar.f62778n.bottom) - (((float) cVar.f62772h) / 2.0f)) - ((float) cVar.f62770f));
                float f = ((float) cVar.f62771g) - (((float) cVar.f62772h) / 2.0f);
                canvas.drawRoundRect(cVar.f62779o, f, f, cVar.f62777m);
            }
        }
    }

    public final void setCornerRadius(int i) {
        GradientDrawable gradientDrawable;
        if (m52693b()) {
            C26584c cVar = this.f62757a;
            if (cVar.f62771g != i) {
                cVar.f62771g = i;
                if (C26584c.f62765a && cVar.f62784t != null && cVar.f62785u != null && cVar.f62786v != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        GradientDrawable gradientDrawable2 = null;
                        if (!C26584c.f62765a || cVar.f62766b.getBackground() == null) {
                            gradientDrawable = null;
                        } else {
                            gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) cVar.f62766b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
                        }
                        float f = ((float) i) + 1.0E-5f;
                        gradientDrawable.setCornerRadius(f);
                        if (C26584c.f62765a && cVar.f62766b.getBackground() != null) {
                            gradientDrawable2 = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) cVar.f62766b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
                        }
                        gradientDrawable2.setCornerRadius(f);
                    }
                    float f2 = ((float) i) + 1.0E-5f;
                    cVar.f62784t.setCornerRadius(f2);
                    cVar.f62785u.setCornerRadius(f2);
                    cVar.f62786v.setCornerRadius(f2);
                } else if (!C26584c.f62765a && cVar.f62780p != null && cVar.f62782r != null) {
                    float f3 = ((float) i) + 1.0E-5f;
                    cVar.f62780p.setCornerRadius(f3);
                    cVar.f62782r.setCornerRadius(f3);
                    cVar.f62766b.invalidate();
                }
            }
        }
    }

    public C26582a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f62761f != null && this.f62764i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.f62762g;
            if (i3 == 0) {
                i3 = this.f62761f.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C0792v.m2772g(this)) - i3) - this.f62758b) - C0792v.m2770f(this)) / 2;
            if (C0792v.m2768e(this) == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.f62763h != measuredWidth) {
                this.f62763h = measuredWidth;
                m52692a();
            }
        }
    }

    private C26582a(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a4x);
        int i;
        Drawable a;
        TypedArray a2 = C26685k.m52976a(context, attributeSet, new int[]{16843191, 16843192, 16843193, 16843194, R.attr.jf, R.attr.jg, R.attr.pz, R.attr.vu, R.attr.vy, R.attr.w0, R.attr.w1, R.attr.w4, R.attr.w5, R.attr.a_9, R.attr.afl, R.attr.afm}, R.attr.a4x, R.style.rn, new int[0]);
        this.f62758b = a2.getDimensionPixelSize(9, 0);
        this.f62759c = C26686l.m52985a(a2.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.f62760e = C26630a.m52827a(getContext(), a2, 11);
        this.f62761f = C26630a.m52828b(getContext(), a2, 7);
        this.f62764i = a2.getInteger(8, 1);
        this.f62762g = a2.getDimensionPixelSize(10, 0);
        C26584c cVar = new C26584c(this);
        this.f62757a = cVar;
        cVar.f62767c = a2.getDimensionPixelOffset(0, 0);
        cVar.f62768d = a2.getDimensionPixelOffset(1, 0);
        cVar.f62769e = a2.getDimensionPixelOffset(2, 0);
        cVar.f62770f = a2.getDimensionPixelOffset(3, 0);
        cVar.f62771g = a2.getDimensionPixelSize(6, 0);
        cVar.f62772h = a2.getDimensionPixelSize(15, 0);
        cVar.f62773i = C26686l.m52985a(a2.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        cVar.f62774j = C26630a.m52827a(cVar.f62766b.getContext(), a2, 4);
        cVar.f62775k = C26630a.m52827a(cVar.f62766b.getContext(), a2, 14);
        cVar.f62776l = C26630a.m52827a(cVar.f62766b.getContext(), a2, 13);
        cVar.f62777m.setStyle(Paint.Style.STROKE);
        cVar.f62777m.setStrokeWidth((float) cVar.f62772h);
        Paint paint = cVar.f62777m;
        if (cVar.f62775k != null) {
            i = cVar.f62775k.getColorForState(cVar.f62766b.getDrawableState(), 0);
        } else {
            i = 0;
        }
        paint.setColor(i);
        int f = C0792v.m2770f(cVar.f62766b);
        int paddingTop = cVar.f62766b.getPaddingTop();
        int g = C0792v.m2772g(cVar.f62766b);
        int paddingBottom = cVar.f62766b.getPaddingBottom();
        C26582a aVar = cVar.f62766b;
        if (C26584c.f62765a) {
            a = cVar.mo43862b();
        } else {
            cVar.f62780p = new GradientDrawable();
            cVar.f62780p.setCornerRadius(((float) cVar.f62771g) + 1.0E-5f);
            cVar.f62780p.setColor(-1);
            cVar.f62781q = C0705a.m2506e(cVar.f62780p);
            C0705a.m2496a(cVar.f62781q, cVar.f62774j);
            if (cVar.f62773i != null) {
                C0705a.m2499a(cVar.f62781q, cVar.f62773i);
            }
            cVar.f62782r = new GradientDrawable();
            cVar.f62782r.setCornerRadius(((float) cVar.f62771g) + 1.0E-5f);
            cVar.f62782r.setColor(-1);
            cVar.f62783s = C0705a.m2506e(cVar.f62782r);
            C0705a.m2496a(cVar.f62783s, cVar.f62776l);
            a = cVar.mo43860a(new LayerDrawable(new Drawable[]{cVar.f62781q, cVar.f62783s}));
        }
        aVar.setInternalBackground(a);
        C0792v.m2741a(cVar.f62766b, f + cVar.f62767c, paddingTop + cVar.f62769e, g + cVar.f62768d, paddingBottom + cVar.f62770f);
        a2.recycle();
        setCompoundDrawablePadding(this.f62758b);
        m52692a();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C26584c cVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (cVar = this.f62757a) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            if (cVar.f62786v != null) {
                cVar.f62786v.setBounds(cVar.f62767c, cVar.f62769e, i6 - cVar.f62768d, i5 - cVar.f62770f);
            }
        }
    }
}
