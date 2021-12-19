package p4519d.p4520a.p4522b.p4526d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.d.a */
public final class C88004a implements AbstractC88012e {

    /* renamed from: a */
    public static final C88005a f199880a = new C88005a((byte) 0);

    /* renamed from: b */
    private final long f199881b;

    /* renamed from: c */
    private final ThreadFactory f199882c;

    static {
        Covode.recordClassIndex(104030);
    }

    /* renamed from: d.a.b.d.a$a */
    static final class C88005a {
        static {
            Covode.recordClassIndex(104031);
        }

        private C88005a() {
        }

        public /* synthetic */ C88005a(byte b) {
            this();
        }
    }

    @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88012e
    /* renamed from: a */
    public final ScheduledExecutorService mo142590a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(5).mo70027a(this.f199882c).mo70028a());
        C89219l.m154709a((Object) scheduledExecutorService, "");
        return scheduledExecutorService;
    }

    public C88004a(long j, ThreadFactory threadFactory) {
        C89219l.m154719c(threadFactory, "");
        this.f199881b = j;
        this.f199882c = threadFactory;
    }
}
