package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.w */
public final class C89445w {

    /* renamed from: a */
    public static C89443v f203138a;

    /* renamed from: b */
    public static long f203139b;

    /* renamed from: c */
    public static final C89445w f203140c = new C89445w();

    private C89445w() {
    }

    static {
        Covode.recordClassIndex(105529);
    }

    /* renamed from: a */
    public static final C89443v m155222a() {
        MethodCollector.m26663i(3472);
        synchronized (f203140c) {
            try {
                C89443v vVar = f203138a;
                if (vVar != null) {
                    f203138a = vVar.f203136f;
                    vVar.f203136f = null;
                    f203139b -= 8192;
                    return vVar;
                }
                C89443v vVar2 = new C89443v();
                MethodCollector.m26664o(3472);
                return vVar2;
            } finally {
                MethodCollector.m26664o(3472);
            }
        }
    }

    /* renamed from: a */
    public static final void m155223a(C89443v vVar) {
        MethodCollector.m26663i(3478);
        C89219l.m154719c(vVar, "");
        if (vVar.f203136f != null || vVar.f203137g != null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed requirement.".toString());
            MethodCollector.m26664o(3478);
            throw illegalArgumentException;
        } else if (vVar.f203134d) {
            MethodCollector.m26664o(3478);
        } else {
            synchronized (f203140c) {
                try {
                    long j = f203139b;
                    if (j + 8192 <= 65536) {
                        f203139b = j + 8192;
                        vVar.f203136f = f203138a;
                        vVar.f203133c = 0;
                        vVar.f203132b = vVar.f203133c;
                        f203138a = vVar;
                        MethodCollector.m26664o(3478);
                    }
                } finally {
                    MethodCollector.m26664o(3478);
                }
            }
        }
    }
}
