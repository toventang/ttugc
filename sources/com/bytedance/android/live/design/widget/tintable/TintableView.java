package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p037h.AbstractC0791u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TintableView extends View implements AbstractC0791u {

    /* renamed from: a */
    private C4131a f11560a;

    static {
        Covode.recordClassIndex(4697);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4131a aVar = this.f11560a;
        if (aVar != null) {
            aVar.mo9810b();
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C4131a aVar = this.f11560a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9812c();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4131a aVar = this.f11560a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9813d();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4131a aVar = this.f11560a;
        if (aVar != null) {
            aVar.mo9807a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4131a aVar = this.f11560a;
        if (aVar != null) {
            aVar.mo9808a(mode);
        }
    }

    public TintableView(Context context) {
        super(context);
        MethodCollector.m26663i(10638);
        m10072a(null);
        MethodCollector.m26664o(10638);
    }

    /* renamed from: a */
    private void m10072a(AttributeSet attributeSet) {
        C4131a aVar = new C4131a(this);
        this.f11560a = aVar;
        aVar.mo9537a(attributeSet, 0, 0);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4131a aVar = this.f11560a;
        if (aVar != null) {
            aVar.mo9809a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C4131a aVar = this.f11560a;
        if ((aVar == null || !aVar.mo9811b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public TintableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10779);
        m10072a(attributeSet);
        MethodCollector.m26664o(10779);
    }
}
