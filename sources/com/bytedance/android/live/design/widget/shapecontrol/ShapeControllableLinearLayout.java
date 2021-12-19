package com.bytedance.android.live.design.widget.shapecontrol;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.tintable.C4136e;
import com.bytedance.covode.number.Covode;

public class ShapeControllableLinearLayout extends C4136e {

    /* renamed from: a */
    private C4130a<ShapeControllableLinearLayout> f11534a;

    static {
        Covode.recordClassIndex(4693);
    }

    public float getBottomLeftRadius() {
        return this.f11534a.f11542f;
    }

    public float getBottomRightRadius() {
        return this.f11534a.f11543g;
    }

    public float getRadius() {
        return this.f11534a.f11539c;
    }

    public ColorStateList getStrokeColor() {
        return this.f11534a.f11538b;
    }

    public float getStrokeWidth() {
        return this.f11534a.f11537a;
    }

    public float getTopLeftRadius() {
        return this.f11534a.f11540d;
    }

    public float getTopRightRadius() {
        return this.f11534a.f11541e;
    }

    public void setBottomLeftCircular(boolean z) {
        this.f11534a.mo9798d(z);
    }

    public void setBottomLeftRadius(float f) {
        this.f11534a.mo9799e(f);
    }

    public void setBottomRightCircular(boolean z) {
        this.f11534a.mo9801e(z);
    }

    public void setBottomRightRadius(float f) {
        this.f11534a.mo9802f(f);
    }

    public void setCircular(boolean z) {
        this.f11534a.mo9784a(z);
    }

    public void setGradientColors(int i) {
        this.f11534a.mo9789b(i);
    }

    public void setGradientOrientation(int i) {
        this.f11534a.mo9797d(i);
    }

    public void setGradientPositions(int i) {
        this.f11534a.mo9793c(i);
    }

    public void setRadius(float f) {
        this.f11534a.mo9788b(f);
    }

    public void setStrokeColor(int i) {
        this.f11534a.mo9781a(i);
    }

    public void setStrokeWidth(float f) {
        this.f11534a.mo9780a(f);
    }

    public void setTopLeftCircular(boolean z) {
        this.f11534a.mo9791b(z);
    }

    public void setTopLeftRadius(float f) {
        this.f11534a.mo9792c(f);
    }

    public void setTopRightCircular(boolean z) {
        this.f11534a.mo9795c(z);
    }

    public void setTopRightRadius(float f) {
        this.f11534a.mo9796d(f);
    }

    public void draw(Canvas canvas) {
        this.f11534a.mo9790b(canvas);
        super.draw(canvas);
        this.f11534a.mo9794c(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11534a.mo9783a(canvas);
    }

    public void setGradientColors(int[] iArr) {
        this.f11534a.mo9786a(iArr);
    }

    public void setGradientPositions(float[] fArr) {
        this.f11534a.mo9785a(fArr);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f11534a.mo9782a(colorStateList);
    }

    public ShapeControllableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4130a<ShapeControllableLinearLayout> aVar = new C4130a<>(this);
        this.f11534a = aVar;
        aVar.mo9537a(attributeSet, 0, 0);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11534a.mo9787b();
    }
}
