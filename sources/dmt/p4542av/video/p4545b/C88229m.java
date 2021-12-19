package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68095g;
import java.util.concurrent.ScheduledExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.m */
public final class C88229m {

    /* renamed from: a */
    private static final AbstractC89244h f200252a = C89250i.m154773a((AbstractC89171a) C88230a.f200253a);

    /* renamed from: a */
    private static final boolean m153327a() {
        return ((Boolean) f200252a.getValue()).booleanValue();
    }

    static {
        Covode.recordClassIndex(104264);
    }

    /* renamed from: dmt.av.video.b.m$a */
    static final class C88230a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C88230a f200253a = new C88230a();

        static {
            Covode.recordClassIndex(104265);
        }

        C88230a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((Boolean) C68095g.f152495a.getValue()).booleanValue());
        }
    }

    /* renamed from: a */
    public static final AbstractC88181j m153326a(int i, C88238s sVar) {
        C89219l.m154721d(sVar, "");
        if (i == 2) {
            return new C88234p(sVar);
        }
        if (i == 3) {
            return new C88233o(sVar);
        }
        if (i == 4) {
            return new C88236q(sVar);
        }
        if (i == 6) {
            if (m153327a()) {
                sVar.f200277e = true;
            }
            return new C88231n(sVar);
        } else if (i == 7) {
            return new C88237r(sVar);
        } else {
            if (i == 10) {
                if (m153327a()) {
                    sVar.f200277e = true;
                }
                return new C88226k(sVar);
            } else if (i != 11) {
                if (m153327a()) {
                    sVar.f200277e = true;
                }
                ScheduledExecutorService d = C40780g.m82247d();
                C89219l.m154716b(d, "");
                return new C88178g(sVar, d);
            } else {
                if (m153327a()) {
                    sVar.f200277e = true;
                }
                return new C88170a(sVar);
            }
        }
    }
}
