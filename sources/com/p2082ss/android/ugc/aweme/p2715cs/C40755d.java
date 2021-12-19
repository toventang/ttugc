package com.p2082ss.android.ugc.aweme.p2715cs;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2715cs.C40750c;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.cs.d */
public class C40755d {

    /* renamed from: a */
    private static volatile C40755d f95405a;

    /* renamed from: b */
    private List<RunnableC40756a> f95406b = new ArrayList();

    /* renamed from: c */
    private Handler f95407c = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(48607);
    }

    /* renamed from: com.ss.android.ugc.aweme.cs.d$a */
    public static class RunnableC40756a implements Runnable {

        /* renamed from: a */
        public C40758f f95408a;

        /* renamed from: b */
        private volatile boolean f95409b;

        static {
            Covode.recordClassIndex(48608);
        }

        public final void run() {
            C1731i.m5640b(new CallableC40757e(this), C1731i.f5562a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ Object mo69988a() {
            if (this.f95409b) {
                return null;
            }
            C40758f fVar = this.f95408a;
            try {
                fVar.mo69992a(1);
                fVar.f95414d.getPreloader().mo69984a(fVar.f95412b, fVar.f95413c);
                fVar.mo69992a(4);
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                fVar.mo69992a(3);
                return null;
            }
        }

        RunnableC40756a(C40758f fVar) {
            this.f95408a = fVar;
        }
    }

    private C40755d() {
    }

    /* renamed from: a */
    public static C40755d m82216a() {
        MethodCollector.m26663i(7459);
        if (f95405a == null) {
            synchronized (C40755d.class) {
                try {
                    if (f95405a == null) {
                        f95405a = new C40755d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7459);
                    throw th;
                }
            }
        }
        C40755d dVar = f95405a;
        MethodCollector.m26664o(7459);
        return dVar;
    }

    /* renamed from: a */
    public final void mo69987a(C40758f fVar) {
        if (fVar.f95412b != null && !TextUtils.isEmpty(fVar.f95412b.getAid()) && fVar.f95414d != null) {
            RunnableC40756a aVar = new RunnableC40756a(fVar);
            this.f95406b.add(aVar);
            this.f95407c.postDelayed(aVar, (long) fVar.f95411a);
        }
    }

    /* renamed from: a */
    public final RunnableC40756a mo69986a(String str, C40750c.EnumC40751a aVar) {
        for (RunnableC40756a aVar2 : this.f95406b) {
            if (!(aVar2 == null || aVar2.f95408a == null || aVar2.f95408a.f95412b == null || aVar2.f95408a.f95412b.getAid() == null || !aVar2.f95408a.f95412b.getAid().equals(str) || aVar2.f95408a.f95414d != aVar)) {
                return aVar2;
            }
        }
        return null;
    }
}
