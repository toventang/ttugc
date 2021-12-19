package com.p2082ss.android.ugc.aweme.tools.beauty.p4096h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41096a;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.h.a */
public final class C77976a {
    static {
        Covode.recordClassIndex(91065);
    }

    /* renamed from: a */
    public static final AbstractC89516am m136236a() {
        AbstractC89703z a = C89582cd.m155517a(null);
        return C89517an.m155448a(C41096a.f96058a.plus(a).plus(new C77977a(CoroutineExceptionHandler.f203145c)));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.h.a$a */
    public static final class C77977a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(91066);
        }

        public C77977a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C89219l.m154719c(fVar, "");
            C89219l.m154719c(th, "");
            C41093a.m82763a(th);
        }
    }
}
