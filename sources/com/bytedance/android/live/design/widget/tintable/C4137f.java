package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.p037h.AbstractC0791u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.live.design.widget.tintable.f */
public class C4137f extends RelativeLayout implements AbstractC0791u {

    /* renamed from: a */
    private C4131a f11573a;

    static {
        Covode.recordClassIndex(4704);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4131a aVar = this.f11573a;
        if (aVar != null) {
            aVar.mo9810b();
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C4131a aVar = this.f11573a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9812c();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4131a aVar = this.f11573a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9813d();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4131a aVar = this.f11573a;
        if (aVar != null) {
            aVar.mo9807a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4131a aVar = this.f11573a;
        if (aVar != null) {
            aVar.mo9808a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4131a aVar = this.f11573a;
        if (aVar != null) {
            aVar.mo9809a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C4131a aVar = this.f11573a;
        if ((aVar == null || !aVar.mo9811b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public C4137f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10636);
        C4131a aVar = new C4131a(this);
        this.f11573a = aVar;
        aVar.mo9537a(attributeSet, 0, 0);
        MethodCollector.m26664o(10636);
    }
}
