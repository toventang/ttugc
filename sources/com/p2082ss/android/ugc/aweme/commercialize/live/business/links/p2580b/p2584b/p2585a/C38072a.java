package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2584b.p2585a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.a.a */
public final class C38072a implements IIconSlot {

    /* renamed from: a */
    private final AbstractC6162ae f89958a;

    static {
        Covode.recordClassIndex(45539);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.a.a$a */
    public static final class C38073a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45540);
        }

        C38073a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f89958a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C38073a();
    }

    public C38072a(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f89958a = aeVar;
    }
}
