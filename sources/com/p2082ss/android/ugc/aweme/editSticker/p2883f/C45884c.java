package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.c */
public final class C45884c {
    static {
        Covode.recordClassIndex(54408);
    }

    /* renamed from: a */
    public static final AbstractC89516am m88525a() {
        AbstractC89703z a = C89582cd.m155517a(null);
        return C89517an.m155448a(C31068c.f74429a.plus(a).plus(new C45885a(CoroutineExceptionHandler.f203145c)));
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.f.c$a */
    public static final class C45885a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(54409);
        }

        public C45885a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            AbstractC45891h d = C45866d.m88491d();
            if (d != null) {
                d.mo77252a(th);
            }
        }
    }
}
