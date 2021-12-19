package com.p2082ss.android.ugc.aweme.story.base.p4021b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.story.base.b.a */
public final class C76613a {

    /* renamed from: a */
    public static final C76613a f171946a = new C76613a();

    /* renamed from: b */
    private static final AbstractC89244h f171947b = C89250i.m154773a((AbstractC89171a) C76614a.f171948a);

    /* renamed from: a */
    public static Keva m134197a() {
        return (Keva) f171947b.getValue();
    }

    private C76613a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.b.a$a */
    static final class C76614a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C76614a f171948a = new C76614a();

        static {
            Covode.recordClassIndex(89600);
        }

        C76614a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("studio_story_cache");
        }
    }

    static {
        Covode.recordClassIndex(89599);
    }
}
