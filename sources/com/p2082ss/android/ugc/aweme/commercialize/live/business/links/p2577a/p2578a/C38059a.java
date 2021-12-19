package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2577a.p2578a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.a.a */
public final class C38059a implements IIconSlot {

    /* renamed from: a */
    private final AbstractC6162ae f89930a;

    static {
        Covode.recordClassIndex(45525);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.a.a$a */
    public static final class C38060a extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45526);
        }

        C38060a() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f89930a;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C38060a();
    }

    public C38059a(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f89930a = aeVar;
    }
}
