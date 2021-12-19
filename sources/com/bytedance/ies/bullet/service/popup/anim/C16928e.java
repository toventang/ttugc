package com.bytedance.ies.bullet.service.popup.anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.anim.e */
public final class C16928e implements AbstractC16927d {

    /* renamed from: a */
    public final View f40256a;

    /* renamed from: b */
    private final View f40257b;

    static {
        Covode.recordClassIndex(19370);
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.AbstractC16927d
    /* renamed from: a */
    public final void mo26752a() {
        this.f40256a.setAlpha(0.0f);
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.AbstractC16927d
    /* renamed from: c */
    public final Animator mo26754c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f40257b, "alpha", 1.0f, 0.0f);
        C89219l.m154709a((Object) ofFloat, "");
        return ofFloat;
    }

    @Override // com.bytedance.ies.bullet.service.popup.anim.AbstractC16927d
    /* renamed from: b */
    public final void mo26753b() {
        View view = this.f40257b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
        C89219l.m154709a((Object) ofFloat, "");
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public C16928e(View view) {
        C89219l.m154719c(view, "");
        this.f40256a = view;
        this.f40257b = view;
    }
}
