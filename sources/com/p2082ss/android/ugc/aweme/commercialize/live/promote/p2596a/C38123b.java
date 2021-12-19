package com.p2082ss.android.ugc.aweme.commercialize.live.promote.p2596a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.b */
public final class C38123b implements IIconSlot {

    /* renamed from: a */
    public static final C38124a f90085a = new C38124a((byte) 0);

    /* renamed from: b */
    private final AbstractC6162ae f90086b;

    static {
        Covode.recordClassIndex(45593);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.b$a */
    public static final class C38124a {
        static {
            Covode.recordClassIndex(45594);
        }

        private C38124a() {
        }

        public /* synthetic */ C38124a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.promote.a.b$b */
    public static final class C38125b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(45595);
        }

        C38125b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f90086b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C38125b();
    }

    public C38123b(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f90086b = aeVar;
    }
}
