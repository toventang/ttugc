package com.p2082ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.c */
public final class C47142c implements IAVScreenAdaptService {
    static {
        Covode.recordClassIndex(55746);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.c$a */
    static final class CallableC47143a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f109766a;

        static {
            Covode.recordClassIndex(55747);
        }

        CallableC47143a(Context context) {
            this.f109766a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int d = C70636dh.m124835d(this.f109766a);
            if (d != C33398a.f79357a.mo59451b()) {
                C33398a.f79357a.mo59449a(d);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.IAVScreenAdaptService
    public final void calculateAdaptPlan(Context context) {
        C89219l.m154721d(context, "");
        C1731i.m5640b(new CallableC47143a(context), C1731i.f5562a);
    }
}
