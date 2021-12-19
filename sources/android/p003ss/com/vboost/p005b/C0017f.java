package android.p003ss.com.vboost.p005b;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.b.f */
public class C0017f implements AbstractC0012c {

    /* renamed from: a */
    public static C0018g f53a = null;

    /* renamed from: b */
    private static final String f54b = C0017f.class.getSimpleName();

    /* renamed from: c */
    private static int f55c = 1000;

    /* renamed from: d */
    private static int f56d = 10;

    /* renamed from: e */
    private static int f57e = -1;

    /* renamed from: f */
    private static boolean f58f = false;

    /* renamed from: g */
    private static int f59g = 8;

    /* renamed from: h */
    private static int f60h = 1500000;

    /* renamed from: i */
    private static int f61i = 2000000;

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo13b() {
        m33c();
    }

    /* renamed from: c */
    private static void m33c() {
        int i = f57e;
        if (i != -1) {
            f53a.mo20b(i);
        }
    }

    static {
        Covode.recordClassIndex(20);
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo10a() {
        m33c();
        C0018g gVar = f53a;
        if (gVar != null) {
            int a = gVar.mo16a();
            f57e = a;
            if (-1 != a) {
                f53a.mo19a(a, 10, 3, -1);
                f53a.mo19a(f57e, 1, f59g, -1);
                f53a.mo19a(f57e, 4, f61i, -1);
                f53a.mo19a(f57e, 6, f61i, f60h);
                f53a.mo19a(f57e, 23, 1000, -1);
                f53a.mo18a(f57e, 30000);
            }
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: b */
    public final void mo14b(long j) {
        m33c();
        C0018g gVar = f53a;
        if (gVar != null) {
            int a = gVar.mo16a();
            f57e = a;
            if (-1 != a) {
                f53a.mo19a(a, 10, 3, -1);
                f53a.mo18a(f57e, (int) j);
            }
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: c */
    public final void mo15c(long j) {
        m33c();
        C0018g gVar = f53a;
        if (gVar != null) {
            int a = gVar.mo16a();
            f57e = a;
            if (-1 != a) {
                f53a.mo19a(a, 10, 3, -1);
                f53a.mo19a(f57e, 8, f56d, -1);
                f53a.mo18a(f57e, (int) j);
            }
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final void mo11a(long j) {
        m33c();
        C0018g gVar = f53a;
        if (gVar != null) {
            int a = gVar.mo16a();
            f57e = a;
            if (-1 != a) {
                f53a.mo19a(a, 10, 3, -1);
                f53a.mo19a(f57e, 1, f59g, -1);
                f53a.mo19a(f57e, 4, f61i, -1);
                f53a.mo19a(f57e, 6, f61i, f60h);
                f53a.mo19a(f57e, 23, 1000, -1);
                f53a.mo18a(f57e, (int) j);
            }
        }
    }

    @Override // android.p003ss.com.vboost.p005b.AbstractC0012c
    /* renamed from: a */
    public final boolean mo12a(Context context) {
        if (f53a == null) {
            f53a = new C0018g(context);
            if (C0018g.f62a) {
                f55c = f53a.mo17a(0);
                f56d = f53a.mo17a(3);
                int a = f53a.mo16a();
                f57e = a;
                if (a == -1) {
                    return false;
                }
                f59g = C0015e.m32b();
                f60h = C0015e.m29a(0);
                f61i = C0015e.m29a(6);
                return true;
            }
        }
        return false;
    }
}
