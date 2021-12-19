package com.bytedance.helios.sdk.p1097d;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.C15482d;
import com.bytedance.helios.sdk.utils.C15487h;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.d.i */
public final class C15404i extends AbstractC15395b {

    /* renamed from: c */
    public static final C15405a f37611c = new C15405a((byte) 0);

    /* renamed from: b */
    boolean f37612b;

    /* renamed from: d */
    private final AtomicInteger f37613d;

    static {
        Covode.recordClassIndex(17656);
    }

    /* renamed from: com.bytedance.helios.sdk.d.i$a */
    public static final class C15405a {
        static {
            Covode.recordClassIndex(17657);
        }

        private C15405a() {
        }

        public /* synthetic */ C15405a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final int[] mo25138a() {
        return C15403h.f37608c;
    }

    /* renamed from: c */
    private final void m28318c() {
        int myPid = Process.myPid();
        this.f37613d.set(myPid);
        C15482d.m28487a("helios_pid", myPid);
    }

    /* renamed from: com.bytedance.helios.sdk.d.i$b */
    static final class RunnableC15406b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15404i f37614a;

        /* renamed from: b */
        final /* synthetic */ C15397d f37615b;

        /* renamed from: c */
        final /* synthetic */ Throwable f37616c;

        static {
            Covode.recordClassIndex(17658);
        }

        RunnableC15406b(C15404i iVar, C15397d dVar, Throwable th) {
            this.f37614a = iVar;
            this.f37615b = dVar;
            this.f37616c = th;
        }

        public final void run() {
            C15404i iVar = this.f37614a;
            C15397d dVar = this.f37615b;
            Throwable th = this.f37616c;
            if (iVar.f37612b && iVar.mo25148b()) {
                C15318n a = dVar.mo25140a(th);
                a.f37374t = 6;
                a.mo24858i("AppAutoStartException");
                a.f37368n.put("ClassName", dVar.f37591h);
                C15320o.m28228a(a, false);
            }
            iVar.f37612b = false;
        }
    }

    public C15404i() {
        String str = C15403h.f37606a;
        String str2 = C15403h.f37607b;
        int[] iArr = C15403h.f37608c;
        String[] strArr = C15403h.f37609d;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            mo25134a(iArr[i], new C15400e(str, str2, iArr[i], strArr[i]));
        }
        this.f37613d = new AtomicInteger(-1);
        this.f37612b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo25148b() {
        Context baseContext;
        MethodCollector.m26663i(5264);
        synchronized (this) {
            try {
                if (this.f37613d.get() == -1) {
                    AtomicInteger atomicInteger = this.f37613d;
                    C89219l.m154719c("helios_pid", "");
                    atomicInteger.set(C15482d.f37729a.getInt("helios_pid", -1));
                }
                int i = this.f37613d.get();
                Application application = HeliosEnvImpl.INSTANCE.getApplication();
                if (!(application == null || (baseContext = application.getBaseContext()) == null)) {
                    if (C15487h.m28504a(baseContext)) {
                        if (i == -1) {
                            m28318c();
                        } else if (i != Process.myPid()) {
                            m28318c();
                            C15434f a = C15434f.m28386a();
                            C89219l.m154709a((Object) a, "");
                            boolean z = !a.mo25169c();
                            MethodCollector.m26664o(5264);
                            return z;
                        }
                        MethodCollector.m26664o(5264);
                        return false;
                    }
                }
                return false;
            } finally {
                MethodCollector.m26664o(5264);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.helios.sdk.p1097d.AbstractC15395b
    /* renamed from: a */
    public final void mo25135a(C15397d dVar, Throwable th) {
        C89219l.m154719c(dVar, "");
        HandlerThreadC15486g.m28499b().post(new RunnableC15406b(this, dVar, th));
    }
}
