package com.p2082ss.android.ugc.asve.p2217f;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.f.f */
public final class C31098f {

    /* renamed from: a */
    private static final Handler f74517a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(37737);
    }

    /* renamed from: a */
    public static final void m64301a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (C89219l.m154714a(currentThread, mainLooper.getThread())) {
            aVar.invoke();
        } else {
            f74517a.post(new RunnableC31099g(aVar));
        }
    }
}
