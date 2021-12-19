package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2581a.p2582a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.a.a */
public final class C38063a implements IIconSlot {

    /* renamed from: a */
    private final AbstractC6162ae f89941a;

    static {
        Covode.recordClassIndex(45530);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.a.a$a */
    public static final class C38064a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45531);
        }

        C38064a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f89941a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C38064a();
    }

    public C38063a(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f89941a = aeVar;
    }
}
