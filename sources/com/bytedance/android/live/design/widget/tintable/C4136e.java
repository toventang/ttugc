package com.bytedance.android.live.design.widget.tintable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.p037h.AbstractC0791u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.widget.tintable.e */
public class C4136e extends LinearLayout implements AbstractC0791u {

    /* renamed from: a */
    private C4131a f11572a;

    static {
        Covode.recordClassIndex(4703);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4131a aVar = this.f11572a;
        if (aVar != null) {
            aVar.mo9810b();
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public ColorStateList getSupportBackgroundTintList() {
        C4131a aVar = this.f11572a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9812c();
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4131a aVar = this.f11572a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo9813d();
    }

    /* renamed from: b */
    public final void mo9821b(int i) {
        this.f11572a.mo9806a(i);
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4131a aVar = this.f11572a;
        if (aVar != null) {
            aVar.mo9807a(colorStateList);
        }
    }

    @Override // androidx.core.p037h.AbstractC0791u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4131a aVar = this.f11572a;
        if (aVar != null) {
            aVar.mo9808a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4131a aVar = this.f11572a;
        if (aVar != null) {
            aVar.mo9809a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C4131a aVar = this.f11572a;
        if ((aVar == null || !aVar.mo9811b(drawable)) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public C4136e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11981);
        m10088a(attributeSet, 0);
        MethodCollector.m26664o(11981);
    }

    /* renamed from: a */
    private void m10088a(AttributeSet attributeSet, int i) {
        C4131a aVar = new C4131a(this);
        this.f11572a = aVar;
        aVar.mo9537a(attributeSet, i, 0);
    }

    public C4136e(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a2y);
        MethodCollector.m26663i(11982);
        m10088a(attributeSet, R.attr.a2y);
        MethodCollector.m26664o(11982);
    }
}
