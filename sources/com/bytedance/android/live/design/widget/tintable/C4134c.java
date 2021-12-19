package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p037h.AbstractC0791u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.widget.tintable.c */
public class C4134c extends ConstraintLayout implements AbstractC0791u {

    /* renamed from: g */
    private C4131a f11570g;

    static {
        Covode.recordClassIndex(4701);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4131a aVar = this.f11570g;
        if (aVar != null) {
            aVar.mo9810b();
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C4131a aVar = this.f11570g;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9812c();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4131a aVar = this.f11570g;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9813d();
    }

    /* renamed from: d */
    public final void mo9815d(int i) {
        this.f11570g.mo9806a(i);
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4131a aVar = this.f11570g;
        if (aVar != null) {
            aVar.mo9807a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4131a aVar = this.f11570g;
        if (aVar != null) {
            aVar.mo9808a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4131a aVar = this.f11570g;
        if (aVar != null) {
            aVar.mo9809a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C4131a aVar = this.f11570g;
        if ((aVar == null || !aVar.mo9811b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public C4134c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10085a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m10085a(AttributeSet attributeSet, int i) {
        C4131a aVar = new C4131a(this);
        this.f11570g = aVar;
        aVar.mo9537a(attributeSet, i, 0);
    }

    public C4134c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        m10085a(attributeSet, 0);
    }
}
