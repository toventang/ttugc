package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a.c */
public final class ThreadFactoryC45814c implements ThreadFactory {

    /* renamed from: a */
    public final String f106738a;

    /* renamed from: b */
    public final EnumC45817e f106739b;

    /* renamed from: c */
    private final AtomicInteger f106740c;

    static {
        Covode.recordClassIndex(54333);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a.c$a */
    public static final class C45815a extends Thread {

        /* renamed from: a */
        final /* synthetic */ ThreadFactoryC45814c f106741a;

        /* renamed from: b */
        final /* synthetic */ Runnable f106742b;

        /* renamed from: c */
        final /* synthetic */ String f106743c;

        static {
            Covode.recordClassIndex(54334);
        }

        public final void run() {
            if (this.f106741a.f106739b == EnumC45817e.LOW) {
                Process.setThreadPriority(10);
            } else if (this.f106741a.f106739b == EnumC45817e.HIGH) {
                Process.setThreadPriority(-4);
            }
            super.run();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45815a(ThreadFactoryC45814c cVar, Runnable runnable, String str, Runnable runnable2, String str2) {
            super(runnable2, str2);
            this.f106741a = cVar;
            this.f106742b = runnable;
            this.f106743c = str;
        }
    }

    public /* synthetic */ ThreadFactoryC45814c(String str) {
        this(str, EnumC45817e.NORMAL);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f106738a + "-" + this.f106740c.incrementAndGet();
        return new C45815a(this, runnable, str, runnable, str);
    }

    private ThreadFactoryC45814c(String str, EnumC45817e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        this.f106738a = str;
        this.f106739b = eVar;
        this.f106740c = new AtomicInteger(0);
    }
}
