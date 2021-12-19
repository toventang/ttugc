package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.a */
public final class C56615a implements IIconSlot {

    /* renamed from: a */
    public static final C56616a f129048a = new C56616a((byte) 0);

    /* renamed from: b */
    private final AbstractC6162ae f129049b;

    static {
        Covode.recordClassIndex(66459);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.a$a */
    public static final class C56616a {
        static {
            Covode.recordClassIndex(66460);
        }

        private C56616a() {
        }

        public /* synthetic */ C56616a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.a$b */
    public static final class C56617b extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(66461);
        }

        C56617b() {
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: a */
    public final AbstractC6162ae mo12055a() {
        return this.f129049b;
    }

    @Override // com.bytedance.android.live.slot.IIconSlot
    /* renamed from: b */
    public final Animator.AnimatorListener mo12056b() {
        return new C56617b();
    }

    public C56615a(AbstractC6162ae aeVar) {
        C89219l.m154721d(aeVar, "");
        this.f129049b = aeVar;
    }
}
