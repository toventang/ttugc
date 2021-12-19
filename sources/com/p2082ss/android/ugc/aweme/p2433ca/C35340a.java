package com.p2082ss.android.ugc.aweme.p2433ca;

import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.experiment.C46773bx;
import com.p2082ss.android.ugc.aweme.utils.C80304cm;
import java.util.HashSet;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.ca.a */
public final class C35340a {

    /* renamed from: a */
    public static final HashSet<Integer> f83370a = new HashSet<>();

    /* renamed from: b */
    public static boolean f83371b;

    /* renamed from: c */
    public static final C35340a f83372c = new C35340a();

    /* renamed from: d */
    private static int f83373d = -1;

    private C35340a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ca.a$b */
    static final class C35342b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f83375a;

        static {
            Covode.recordClassIndex(42510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35342b(int i) {
            super(0);
            this.f83375a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Jato.resetCoreBind(this.f83375a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    private static int m72332d() {
        return Keva.getRepo("ab_repo_cold_boot").getInt("key_big_core_count", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ca.a$a */
    public static final class C35341a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f83374a;

        static {
            Covode.recordClassIndex(42509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35341a(int i) {
            super(0);
            this.f83374a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Jato.bindBigCore(this.f83374a);
            C35340a.f83370a.add(Integer.valueOf(this.f83374a));
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(42508);
    }

    /* renamed from: a */
    public static boolean m72328a() {
        if (f83371b || m72331c() - 2 < 2 || !C46773bx.m90124a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m72330b() {
        return Keva.getRepo("ab_repo_cold_boot").getBoolean("key_has_fetched_big_core_count", false);
    }

    /* renamed from: c */
    private static int m72331c() {
        int i = f83373d;
        if (i != -1) {
            return i;
        }
        if (!m72330b()) {
            return 0;
        }
        int d = m72332d();
        f83373d = d;
        return d;
    }

    /* renamed from: a */
    public static void m72327a(int i) {
        C80304cm.f179829a.mo123693a("BigCoreBindManager#bindBigCore", new C35341a(i));
    }

    /* renamed from: b */
    public static void m72329b(int i) {
        C80304cm.f179829a.mo123693a("BigCoreBindManager#resetBigCore", new C35342b(i));
    }
}
