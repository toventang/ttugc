package com.bytedance.android.livesdk.util.rxutils;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88655aj;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.g */
public final class C11192g {

    /* renamed from: a */
    public static final C11192g f26818a = new C11192g();

    private C11192g() {
    }

    static {
        Covode.recordClassIndex(12819);
    }

    /* renamed from: a */
    public static AbstractC88979t<Long> m19836a(TimeUnit timeUnit) {
        AbstractC88398aa a;
        C89219l.m154721d(timeUnit, "");
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a = C88946a.m154209a(C40780g.m82245b());
        } else {
            a = C88925a.m154160a(C88946a.f201990b);
        }
        C89219l.m154716b(a, "");
        C89219l.m154721d(timeUnit, "");
        C89219l.m154721d(a, "");
        C88466b.m153697a((Object) timeUnit, "unit is null");
        C88466b.m153697a((Object) a, "scheduler is null");
        AbstractC88979t<Long> a2 = C88925a.m154171a(new C88655aj(Math.max(0L, 300L), Math.max(0L, 300L), timeUnit, a));
        C89219l.m154716b(a2, "");
        return a2;
    }
}
