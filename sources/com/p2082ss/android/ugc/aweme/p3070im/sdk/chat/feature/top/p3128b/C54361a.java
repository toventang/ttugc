package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3128b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a */
public final class C54361a {

    /* renamed from: a */
    public static final C54361a f124507a = new C54361a();

    /* renamed from: b */
    private static final AbstractC89244h f124508b = C89250i.m154773a((AbstractC89171a) C54362a.f124509a);

    /* renamed from: a */
    public static Keva m99669a() {
        return (Keva) f124508b.getValue();
    }

    private C54361a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a$a */
    static final class C54362a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C54362a f124509a = new C54362a();

        static {
            Covode.recordClassIndex(64064);
        }

        C54362a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("chat_top_notice_ack");
        }
    }

    static {
        Covode.recordClassIndex(64063);
    }
}
