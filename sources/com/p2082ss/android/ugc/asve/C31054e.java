package com.p2082ss.android.ugc.asve;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.context.AbstractC31036e;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31132c;
import com.p2082ss.android.vesdk.AbstractC85314ak;
import com.p2082ss.android.vesdk.C85378ay;
import com.p2082ss.android.vesdk.C85568t;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.runtime.C85555d;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.e */
public final class C31054e {

    /* renamed from: a */
    public static final C31054e f74392a = new C31054e();

    /* renamed from: b */
    private static boolean f74393b;

    private C31054e() {
    }

    static {
        Covode.recordClassIndex(37684);
    }

    /* renamed from: a */
    public final synchronized void mo56237a() {
        MethodCollector.m26663i(4754);
        if (f74393b) {
            MethodCollector.m26664o(4754);
            return;
        }
        f74393b = true;
        AbstractC31036e a = C31012a.m63724a();
        AbstractC31048d a2 = C31012a.m63724a().mo56187a();
        a2.mo56123d("AVEnv initVESDK start");
        Map<String, Object> r = C31012a.m63724a().mo56204r();
        C85568t a3 = C85568t.m147473a();
        for (Map.Entry<String, Object> entry : r.entrySet()) {
            a3.mo131559b(entry.getKey(), entry.getValue());
        }
        C85555d b = C85555d.m147448b();
        C31012a.m63724a();
        b.f191695a = false;
        ResourceFinder d = a.mo56190d();
        if (d != null) {
            C85378ay.m146870a(d);
        }
        C89219l.m154721d(a, "");
        VEListener.AbstractC85235d c = a.mo56189c();
        if (c != null) {
            C85378ay.m146872a(c);
        }
        C85378ay.m146868a();
        C85378ay.m146869a(C31012a.m63726b(), a.mo56191e().getAbsolutePath());
        C85378ay.m146885d(a.mo56202p());
        C85378ay.m146883c(a.mo56203q());
        int f = a.mo56192f();
        if (f > 0) {
            C85581w.m147504c(f);
        }
        if (true ^ C89219l.m154714a((Object) a.mo56201o(), (Object) "")) {
            C85378ay.m146867a(a.mo56201o());
        }
        C85378ay.m146876a(false);
        C85378ay.m146877a(a.mo56193g(), a.mo56194h());
        C85378ay.m146880b(a.mo56193g());
        C85378ay.m146879b();
        C85378ay.m146881b(a.mo56195i(), a.mo56196j());
        C85378ay.m146878a(a.mo56195i(), a.mo56197k(), a.mo56198l());
        C85378ay.m146881b(a.mo56195i(), a.mo56196j());
        C85378ay.m146878a(a.mo56195i(), a.mo56197k(), a.mo56198l());
        C85378ay.m146882c();
        C85378ay.m146874a((AbstractC85314ak) new C31055a(a2), false);
        C85378ay.m146873a(new C31056b(a));
        a2.mo56123d("AVEnv initVESDK end");
        C85378ay.m146875a(a.mo56199m());
        C85378ay.m146871a(a.mo56188b());
        MethodCollector.m26664o(4754);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.asve.e$b */
    public static final class C31056b implements VEListener.AbstractC85252u {

        /* renamed from: a */
        final /* synthetic */ AbstractC31036e f74395a;

        static {
            Covode.recordClassIndex(37686);
        }

        C31056b(AbstractC31036e eVar) {
            this.f74395a = eVar;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85252u
        /* renamed from: a */
        public final void mo56239a(Throwable th) {
            AbstractC31132c b = this.f74395a.mo56188b();
            if (b != null) {
                C89219l.m154716b(th, "");
                b.mo56583a(th, "vesdk");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.asve.e$a */
    public static final class C31055a implements AbstractC85314ak {

        /* renamed from: a */
        final /* synthetic */ AbstractC31048d f74394a;

        static {
            Covode.recordClassIndex(37685);
        }

        C31055a(AbstractC31048d dVar) {
            this.f74394a = dVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85314ak
        /* renamed from: a */
        public final /* synthetic */ void mo56238a(int i, String str) {
            if (i == 0) {
                AbstractC31048d dVar = this.f74394a;
                C89219l.m154716b(str, "");
                dVar.mo56122c(str);
            } else if (i == 1) {
                AbstractC31048d dVar2 = this.f74394a;
                C89219l.m154716b(str, "");
                dVar2.mo56122c(str);
            } else if (i == 2) {
                AbstractC31048d dVar3 = this.f74394a;
                C89219l.m154716b(str, "");
                dVar3.mo56123d(str);
            } else if (i == 3) {
                AbstractC31048d dVar4 = this.f74394a;
                C89219l.m154716b(str, "");
                dVar4.mo56120a(str);
            } else if (i == 4) {
                AbstractC31048d dVar5 = this.f74394a;
                C89219l.m154716b(str, "");
                dVar5.mo56121b(str);
            }
        }
    }
}
