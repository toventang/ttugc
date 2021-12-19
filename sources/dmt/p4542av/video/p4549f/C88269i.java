package dmt.p4542av.video.p4549f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40984s;
import com.p2082ss.android.ugc.aweme.p2730de.RunnableC40986t;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.f.i */
public final class C88269i implements AbstractC73799a {
    static {
        Covode.recordClassIndex(104304);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    /* renamed from: dmt.av.video.f.i$a */
    static final class C88270a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C88270a f200303a = new C88270a();

        static {
            Covode.recordClassIndex(104305);
        }

        C88270a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C63238c.f143576c.mo93782k();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        C88270a aVar = C88270a.f200303a;
        C89219l.m154721d(aVar, "");
        C40984s.f95824a.execute(new RunnableC40986t(aVar));
    }
}
