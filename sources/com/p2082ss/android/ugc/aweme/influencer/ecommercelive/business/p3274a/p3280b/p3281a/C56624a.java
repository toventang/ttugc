package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3280b.p3281a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.a */
public final class C56624a implements IIconSlot {

    /* renamed from: a */
    public static final C56625a f129065a = new C56625a((byte) 0);

    /* renamed from: b */
    private final AbstractC6162ae f129066b;

    static {
        Covode.recordClassIndex(66468);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.a$a */
    public static final class C56625a {
        static {
            Covode.recordClassIndex(66469);
        }

        private C56625a() {
        }

        public /* synthetic */ C56625a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.b.a.a$b */
    public static final class C56626b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(66470);
        }

        C56626b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f129066b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C56626b();
    }

    public C56624a(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f129066b = aeVar;
    }
}
