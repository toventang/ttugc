package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.tintable.C4134c;
import com.bytedance.covode.number.Covode;

public class ShapeControllableConstraintLayout extends C4134c {

    /* renamed from: g */
    private C4130a<ShapeControllableConstraintLayout> f11532g;

    static {
        Covode.recordClassIndex(4691);
    }

    public float getBottomLeftRadius() {
        return this.f11532g.f11542f;
    }

    public float getBottomRightRadius() {
        return this.f11532g.f11543g;
    }

    public float getRadius() {
        return this.f11532g.f11539c;
    }

    public ColorStateList getStrokeColor() {
        return this.f11532g.f11538b;
    }

    public float getStrokeWidth() {
        return this.f11532g.f11537a;
    }

    public float getTopLeftRadius() {
        return this.f11532g.f11540d;
    }

    public float getTopRightRadius() {
        return this.f11532g.f11541e;
    }

    /* renamed from: c */
    public final void mo9640c(int i) {
        this.f11532g.mo9800e(i);
    }

    public void setBottomLeftCircular(boolean z) {
        this.f11532g.mo9798d(z);
    }

    public void setBottomLeftRadius(float f) {
        this.f11532g.mo9799e(f);
    }

    public void setBottomRightCircular(boolean z) {
        this.f11532g.mo9801e(z);
    }

    public void setBottomRightRadius(float f) {
        this.f11532g.mo9802f(f);
    }

    public void setCircular(boolean z) {
        this.f11532g.mo9784a(z);
    }

    public void setGradientColors(int i) {
        this.f11532g.mo9789b(i);
    }

    public void setGradientOrientation(int i) {
        this.f11532g.mo9797d(i);
    }

    public void setGradientPositions(int i) {
        this.f11532g.mo9793c(i);
    }

    public void setRadius(float f) {
        this.f11532g.mo9788b(f);
    }

    public void setStrokeColor(int i) {
        this.f11532g.mo9781a(i);
    }

    public void setStrokeWidth(float f) {
        this.f11532g.mo9780a(f);
    }

    public void setTopLeftCircular(boolean z) {
        this.f11532g.mo9791b(z);
    }

    public void setTopLeftRadius(float f) {
        this.f11532g.mo9792c(f);
    }

    public void setTopRightCircular(boolean z) {
        this.f11532g.mo9795c(z);
    }

    public void setTopRightRadius(float f) {
        this.f11532g.mo9796d(f);
    }

    public void draw(Canvas canvas) {
        this.f11532g.mo9790b(canvas);
        super.draw(canvas);
        this.f11532g.mo9794c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11532g.mo9783a(canvas);
    }

    public void setGradientColors(int[] iArr) {
        this.f11532g.mo9786a(iArr);
    }

    public void setGradientPositions(float[] fArr) {
        this.f11532g.mo9785a(fArr);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f11532g.mo9782a(colorStateList);
    }

    public ShapeControllableConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10041a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m10041a(AttributeSet attributeSet, int i) {
        C4130a<ShapeControllableConstraintLayout> aVar = new C4130a<>(this);
        this.f11532g = aVar;
        aVar.mo9537a(attributeSet, 0, 0);
    }

    public ShapeControllableConstraintLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        m10041a(attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11532g.mo9787b();
    }
}
