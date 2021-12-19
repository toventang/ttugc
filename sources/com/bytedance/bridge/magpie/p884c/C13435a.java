package com.bytedance.bridge.magpie.p884c;

import android.os.Handler;
import com.bytedance.bridge.magpie.C13402a;
import com.bytedance.bridge.magpie.p883b.C13428a;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p885d.AbstractC13442a;
import com.bytedance.bridge.magpie.p886e.C13453e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bridge.magpie.c.a */
public final class C13435a {

    /* renamed from: c */
    public static final C13436a f32755c = new C13436a((byte) 0);

    /* renamed from: a */
    public C13438b f32756a = new C13438b();

    /* renamed from: b */
    public HashMap<String, C13438b> f32757b = new HashMap<>();

    static {
        Covode.recordClassIndex(15435);
    }

    /* renamed from: com.bytedance.bridge.magpie.c.a$a */
    public static final class C13436a {
        static {
            Covode.recordClassIndex(15436);
        }

        private C13436a() {
        }

        public /* synthetic */ C13436a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.bridge.magpie.c.a$b */
    static final class RunnableC13437b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C13435a f32758a;

        /* renamed from: b */
        final /* synthetic */ C13428a f32759b;

        /* renamed from: c */
        final /* synthetic */ AbstractC13442a f32760c;

        /* renamed from: d */
        final /* synthetic */ C13402a f32761d;

        static {
            Covode.recordClassIndex(15437);
        }

        RunnableC13437b(C13435a aVar, C13428a aVar2, AbstractC13442a aVar3, C13402a aVar4) {
            this.f32758a = aVar;
            this.f32759b = aVar2;
            this.f32760c = aVar3;
            this.f32761d = aVar4;
        }

        public final void run() {
            C13438b bVar;
            C13435a aVar = this.f32758a;
            C13428a aVar2 = this.f32759b;
            AbstractC13442a aVar3 = this.f32760c;
            C13402a aVar4 = this.f32761d;
            C13453e.m24178b("BridgeDispatcher", "realDispatchBridgeMethod: " + Thread.currentThread() + " and call is \n" + aVar2);
            if (aVar2.f32738g.length() <= 0 || (bVar = aVar.f32757b.get(aVar2.f32738g)) == null || !bVar.mo21664a(aVar4, aVar2, aVar3)) {
                aVar.f32756a.mo21664a(aVar4, aVar2, aVar3);
            }
        }
    }

    /* renamed from: a */
    public final C13431b mo21659a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (str.length() <= 0) {
            return this.f32756a.mo21662a(str2);
        }
        C13438b bVar = this.f32757b.get(str);
        if (bVar != null) {
            return bVar.mo21662a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo21660a(C13428a aVar, AbstractC13442a aVar2, C13402a aVar3) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(aVar3, "");
        int i = aVar.f32740i;
        RunnableC13437b bVar = new RunnableC13437b(this, aVar, aVar2, aVar3);
        int i2 = 1;
        if (i == 1) {
            C89219l.m154719c(bVar, "");
            if (C13440c.f32767b == null) {
                int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
                if (availableProcessors != 0) {
                    i2 = availableProcessors;
                }
                C13453e.m24178b("ThreadPool", "jsb thread pool size: ".concat(String.valueOf(i2)));
                ExecutorService a = C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(i2).mo70028a());
                C89219l.m154709a((Object) a, "");
                C13440c.f32767b = a;
            }
            ExecutorService executorService = C13440c.f32767b;
            if (executorService == null) {
                C89219l.m154707a();
            }
            executorService.submit(bVar);
            return;
        }
        C89219l.m154719c(bVar, "");
        ((Handler) C13440c.f32768c.getValue()).post(bVar);
    }
}
