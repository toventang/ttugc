package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.internal.C26687m;
import com.google.android.material.p1958g.C26645a;
import com.google.android.material.p1959h.AbstractC26647b;
import com.google.android.material.p1959h.C26646a;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
public final class C26644b extends C26634a {

    /* renamed from: D */
    private InsetDrawable f63024D;

    static {
        Covode.recordClassIndex(32095);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: b */
    public final void mo44090b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: e */
    public final boolean mo44094e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: c */
    public final void mo44092c() {
        mo44093d();
    }

    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: a */
    public final float mo44083a() {
        return this.f62981A.getElevation();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: a */
    public final void mo44087a(ColorStateList colorStateList) {
        if (this.f62998k instanceof RippleDrawable) {
            ((RippleDrawable) this.f62998k).setColor(C26645a.m52890a(colorStateList));
        } else {
            super.mo44087a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: b */
    public final void mo44091b(Rect rect) {
        if (this.f62982B.mo44082b()) {
            this.f63024D = new InsetDrawable(this.f62998k, rect.left, rect.top, rect.right, rect.bottom);
            this.f62982B.mo44081a(this.f63024D);
            return;
        }
        this.f62982B.mo44081a(this.f62998k);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: a */
    public final void mo44088a(Rect rect) {
        if (this.f62982B.mo44082b()) {
            float a = this.f62982B.mo44079a();
            float elevation = this.f62981A.getElevation() + this.f63003p;
            int ceil = (int) Math.ceil((double) C26646a.m52892b(elevation, a, false));
            int ceil2 = (int) Math.ceil((double) C26646a.m52891a(elevation, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: a */
    public final void mo44089a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f62981A.isEnabled()) {
            this.f62981A.setElevation(this.f63001n);
            if (this.f62981A.isPressed()) {
                this.f62981A.setTranslationZ(this.f63003p);
            } else if (this.f62981A.isFocused() || this.f62981A.isHovered()) {
                this.f62981A.setTranslationZ(this.f63002o);
            } else {
                this.f62981A.setTranslationZ(0.0f);
            }
        } else {
            this.f62981A.setElevation(0.0f);
            this.f62981A.setTranslationZ(0.0f);
        }
    }

    C26644b(C26687m mVar, AbstractC26647b bVar) {
        super(mVar, bVar);
    }

    /* renamed from: a */
    private Animator m52878a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f62981A, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f62981A, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(f62974a);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.C26634a
    /* renamed from: a */
    public final void mo44086a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f62981A.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f62975u, m52878a(f, f3));
            stateListAnimator.addState(f62976v, m52878a(f, f2));
            stateListAnimator.addState(f62977w, m52878a(f, f2));
            stateListAnimator.addState(f62978x, m52878a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f62981A, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f62981A, View.TRANSLATION_Z, this.f62981A.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f62981A, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f62974a);
            stateListAnimator.addState(f62979y, animatorSet);
            stateListAnimator.addState(f62980z, m52878a(0.0f, 0.0f));
            this.f62981A.setStateListAnimator(stateListAnimator);
        }
        if (this.f62982B.mo44082b()) {
            mo44093d();
        }
    }
}
