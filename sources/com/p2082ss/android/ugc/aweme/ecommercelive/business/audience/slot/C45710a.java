package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot;

import android.animation.Animator;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.a */
public final class C45710a implements IIconSlot {

    /* renamed from: a */
    private final AbstractC6162ae f106448a;

    /* renamed from: b */
    private final Animator.AnimatorListener f106449b;

    static {
        Covode.recordClassIndex(54227);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f106448a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return this.f106449b;
    }

    public C45710a(AbstractC6162ae aeVar, Animator.AnimatorListener animatorListener) {
        C89219l.m154721d(aeVar, "");
        C89219l.m154721d(animatorListener, "");
        this.f106448a = aeVar;
        this.f106449b = animatorListener;
    }
}
