package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b */
public final class C72161b {

    /* renamed from: a */
    static boolean f161770a = true;

    /* renamed from: b */
    public static final C72161b f161771b = new C72161b();

    /* renamed from: c */
    private static final AbstractC89244h f161772c = C89250i.m154773a((AbstractC89171a) C72162a.f161773a);

    /* renamed from: a */
    static Keva m127332a() {
        return (Keva) f161772c.getValue();
    }

    private C72161b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$a */
    static final class C72162a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C72162a f161773a = new C72162a();

        static {
            Covode.recordClassIndex(84827);
        }

        C72162a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("allow_long_video");
        }
    }

    static {
        Covode.recordClassIndex(84826);
    }
}
