package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h */
public final class C71862h {

    /* renamed from: a */
    public static final C71862h f161042a = new C71862h();

    /* renamed from: b */
    private static final AbstractC89244h f161043b = C89250i.m154773a((AbstractC89171a) C71863a.f161044a);

    private C71862h() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.h$a */
    static final class C71863a extends AbstractC89220m implements AbstractC89171a<AtomicInteger> {

        /* renamed from: a */
        public static final C71863a f161044a = new C71863a();

        static {
            Covode.recordClassIndex(84412);
        }

        C71863a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AtomicInteger invoke() {
            return new AtomicInteger(0);
        }
    }

    static {
        Covode.recordClassIndex(84411);
    }

    /* renamed from: a */
    public static final String m126882a(String str) {
        C89219l.m154721d(str, "");
        String b = C13607d.m24442b(str + '_' + ((AtomicInteger) f161043b.getValue()).incrementAndGet());
        C73991bj.m130128a("AVSessionIDGenerator:generateSessionId for creationId:" + str + ",result:" + b + '.');
        C89219l.m154716b(b, "");
        return b;
    }
}
