package com.p2082ss.android.ugc.aweme.story.record.p4064d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.d.a */
public final class C77497a {
    static {
        Covode.recordClassIndex(90532);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.record.d.a$a */
    public static final class C77498a extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ List f173839a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f173840b;

        static {
            Covode.recordClassIndex(90533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77498a(List list, CountDownLatch countDownLatch) {
            super(1);
            this.f173839a = list;
            this.f173840b = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            this.f173839a.addAll(list2);
            this.f173840b.countDown();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m135512a(AbstractC78554o oVar, List<String> list, AbstractC84089j jVar) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(jVar, "");
        if (jVar.mo128901I() != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            List<String> I = jVar.mo128901I();
            if (I == null) {
                C89219l.m154715b();
            }
            oVar.mo122469a(I, new C77498a(list, countDownLatch));
            countDownLatch.await(2, TimeUnit.SECONDS);
        }
    }
}
