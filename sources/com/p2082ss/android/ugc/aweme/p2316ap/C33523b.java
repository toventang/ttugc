package com.p2082ss.android.ugc.aweme.p2316ap;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ap.b */
public final class C33523b {
    static {
        Covode.recordClassIndex(40386);
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$a */
    public static final class C33524a extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f79623a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f79624b;

        static {
            Covode.recordClassIndex(40387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33524a(List list, CountDownLatch countDownLatch) {
            super(1);
            this.f79623a = list;
            this.f79624b = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            this.f79623a.addAll(list2);
            this.f79624b.countDown();
            return C89391z.f203057a;
        }
    }
}
