package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.matrix.net.C21419b;
import com.bytedance.mobsec.matrix.net.TTNetHttpClient;
import com.bytedance.mobsec.metasec.p1545ov.C21425d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4646ms.p4647bd.p4648o.C89868b;

/* renamed from: ms.bd.o.n1 */
public class C89915n1 {

    /* renamed from: a */
    private static volatile boolean f203794a;

    /* renamed from: b */
    private static Map<String, C89879e0> f203795b = new ConcurrentHashMap();

    /* renamed from: ms.bd.o.n1$a */
    public interface AbstractC89916a {
        static {
            Covode.recordClassIndex(106013);
        }

        /* renamed from: a */
        void mo35024a(int i);

        /* renamed from: a */
        void mo35025a(String str);

        /* renamed from: b */
        void mo35026b(String str);

        /* renamed from: c */
        void mo35027c(String str);

        /* renamed from: d */
        void mo35028d(String str);
    }

    static {
        Covode.recordClassIndex(106012);
    }

    protected C89915n1() {
    }

    /* renamed from: a */
    public static synchronized boolean m156012a(Context context, C89879e0 e0Var, String str) {
        synchronized (C89915n1.class) {
            MethodCollector.m26663i(3234);
            if (context == null) {
                NullPointerException nullPointerException = new NullPointerException("context could not be null");
                MethodCollector.m26664o(3234);
                throw nullPointerException;
            } else if (e0Var != null) {
                String str2 = e0Var.f203767b;
                String str3 = (str2 == null || str2.length() <= 0) ? e0Var.f203773h : e0Var.f203767b;
                if (str3 == null || str3.length() <= 0) {
                    NullPointerException nullPointerException2 = new NullPointerException("appID must be set");
                    MethodCollector.m26664o(3234);
                    throw nullPointerException2;
                }
                if (!f203794a) {
                    synchronized (C89915n1.class) {
                        try {
                            if (!f203794a) {
                                m156011a(context, str);
                                f203794a = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(3234);
                            throw th;
                        }
                    }
                }
                if (f203795b.containsKey(str3)) {
                    MethodCollector.m26664o(3234);
                    return false;
                } else if (((Boolean) C89868b.m155938a(67108865, e0Var.mo144450a())).booleanValue()) {
                    f203795b.put(str3, e0Var);
                    MethodCollector.m26664o(3234);
                    return true;
                } else {
                    MethodCollector.m26664o(3234);
                    return false;
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("config could not be null");
                MethodCollector.m26664o(3234);
                throw nullPointerException3;
            }
        }
    }

    /* renamed from: a */
    public static synchronized AbstractC89916a m156010a(String str) {
        synchronized (C89915n1.class) {
            MethodCollector.m26663i(3139);
            if (str == null) {
                NullPointerException nullPointerException = new NullPointerException("appID must be set");
                MethodCollector.m26664o(3139);
                throw nullPointerException;
            } else if (!f203794a) {
                MethodCollector.m26664o(3139);
                return null;
            } else {
                Object a = C89868b.m155938a(67108866, str);
                if (a == null) {
                    MethodCollector.m26664o(3139);
                    return null;
                }
                C89879e0 e0Var = f203795b.get(str);
                if (e0Var == null) {
                    MethodCollector.m26664o(3139);
                    return null;
                }
                C89909m1 m1Var = new C89909m1(e0Var, C89865a.f203764a.f203765b, ((Long) a).longValue());
                MethodCollector.m26664o(3139);
                return m1Var;
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m156011a(Context context, String str) {
        Context context2;
        C89868b.AbstractC89869a p1Var;
        C89868b.AbstractC89869a bVar;
        AbstractC89895j iVar;
        synchronized (C89915n1.class) {
            MethodCollector.m26663i(3007);
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            C89865a aVar = C89865a.f203764a;
            if (applicationContext != null) {
                context2 = applicationContext.getApplicationContext();
                if (C58003a.f132201c) {
                    if (context2 == null) {
                        context2 = C58003a.f132199a;
                    }
                }
            } else {
                context2 = null;
            }
            aVar.f203765b = context2;
            C89910n.m156007a(applicationContext, str);
            C89889h.m155966a(16777217, 0, 0, "1b9c4d", new byte[]{110, 109, 89});
            C89868b.m155939a(16777218, new C89922p0());
            C89868b.m155939a(16777217, new C89867a1());
            C89889h.m155966a(16777217, 0, 0, "744e24", new byte[]{104, 59, 67});
            C89868b.m155939a(16777219, new C89885f1());
            C89868b.m155939a(16777221, new C89888g1());
            C89868b.m155939a(16777222, new C89891h1());
            C89868b.m155939a(16777223, new C89894i1());
            C89868b.m155939a(16777224, new C89898j1());
            C89868b.m155939a(16777225, new C89902k1());
            C89868b.m155939a(16777226, new C89906l1());
            C89868b.m155939a(16777227, new C89884f0());
            C89868b.m155939a(16777228, new C89887g0());
            C89868b.m155939a(16777232, new C89890h0());
            C89868b.m155939a(16777233, new C89893i0());
            C89868b.m155939a(16777235, new C89897j0());
            C89868b.m155939a(16777238, new C89901k0());
            C89868b.m155939a(16777239, new C89905l0());
            C89868b.m155939a(16777241, new C89908m0());
            C89868b.m155939a(16777242, new C89914n0());
            C89868b.m155939a(16777243, new C89919o0());
            C89868b.m155939a(16777244, new C89925q0());
            C89868b.m155939a(16777245, new C89928r0());
            C89868b.m155939a(16777246, new C89932s0());
            C89868b.m155939a(16777247, new C89940t0());
            C89868b.m155939a(16777248, new C89943u0());
            C89868b.m155939a(16777249, new C89946v0());
            C89868b.m155939a(16777250, new C89949w0());
            C89868b.m155939a(16777251, new C89952x0());
            C89868b.m155939a(16777240, new C89955y0());
            C89868b.m155939a(16777252, new C89958z0());
            C89868b.m155939a(16777253, new C89871b1());
            C89868b.m155939a(16777254, new C89874c1());
            C89868b.m155939a(16777255, new C89877d1());
            C89868b.m155939a(16777256, new C89882e1());
            if (C89870b0.m155943a()) {
                p1Var = new C89929r1();
            } else {
                p1Var = new C89923p1();
            }
            C89868b.m155939a(33554433, p1Var);
            C89868b.m155939a(65537, new C89872c());
            C89868b.m155939a(65538, new C89875d());
            C89868b.m155939a(65539, new C89878e());
            C89868b.m155939a(65540, new C89883f());
            if (C89870b0.m155943a()) {
                bVar = new TTNetHttpClient();
            } else {
                bVar = new C21419b();
            }
            C89868b.m155939a(196609, bVar);
            C89868b.m155939a(196610, bVar);
            C89868b.m155939a(196611, bVar);
            if (C89870b0.m155944a((String) C89889h.m155966a(16777217, 0, 0, "34ba9d", new byte[]{33, 57, 28, 91, 4, 106, 36, 16, 55, 48, 44, 53, 20, 91, 0, 97, 49, 24, 36, 62, 48, 61, 95, 22, 9, 97, 53, 91, 32, 53, 41, 59, 30, 27, 15, 103, 63, 7, 125, 2, 6, 29, 60, 26, 8, 122, 36, 26, 33, 4, 54, 63, 29, 6}))) {
                iVar = new C89899k();
            } else {
                iVar = new C89892i();
            }
            AbstractC89895j.m155977a(iVar);
            C89868b.m155939a(131073, iVar);
            C89868b.m155939a(131074, iVar);
            C89868b.m155939a(268435457, new C21425d.C21426a());
            C89868b.m155939a(268435458, new C21425d.C21427b());
            C89868b.m155939a(268435459, new C21425d.C21428c());
            C89889h.m155966a(16777219, 0, 0, null, applicationContext);
            MethodCollector.m26664o(3007);
        }
    }
}
