package com.p2082ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.monitor.p */
public final class C61445p implements AbstractC90202u {
    static {
        Covode.recordClassIndex(72100);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        C89219l.m154721d(aVar, "");
        C61425e<Request, C90029ac> c = C61439n.f139485e.mo68799c(new C61425e<>(aVar.mo144856a(), null, 62));
        if (c.f139473f == EnumC61424d.INTERCEPT && c.f139469b != null) {
            R r = c.f139469b;
            if (r == null) {
                C89219l.m154715b();
            }
            return r;
        } else if (c.f139473f != EnumC61424d.EXCEPTION || c.f139472e == null) {
            Q q = c.f139468a;
            if (q == null) {
                C89219l.m154715b();
            }
            c.f139469b = (R) aVar.mo144857a(q);
            C61425e<Request, C90029ac> d = C61439n.f139485e.mo68800d(c);
            if (d.f139473f != EnumC61424d.EXCEPTION || d.f139472e == null) {
                R r2 = d.f139469b;
                if (r2 == null) {
                    C89219l.m154715b();
                }
                return r2;
            }
            RuntimeException runtimeException = d.f139472e;
            if (runtimeException == null) {
                C89219l.m154715b();
            }
            throw runtimeException;
        } else {
            RuntimeException runtimeException2 = c.f139472e;
            if (runtimeException2 == null) {
                C89219l.m154715b();
            }
            throw runtimeException2;
        }
    }
}
