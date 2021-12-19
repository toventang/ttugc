package com.p2082ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.C84401c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.p */
public final class C84909p {

    /* renamed from: a */
    public static final AbstractC88433f<Throwable> f189747a = C84910a.f189748a;

    static {
        Covode.recordClassIndex(98903);
    }

    /* renamed from: com.ss.android.ugc.tools.utils.p$a */
    static final class C84910a<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        public static final C84910a f189748a = new C84910a();

        static {
            Covode.recordClassIndex(98904);
        }

        C84910a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            if (C84401c.f188718b) {
                Thread currentThread = Thread.currentThread();
                C89219l.m154716b(currentThread, "");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                return;
            }
            C88925a.m154178a(th2);
        }
    }
}
