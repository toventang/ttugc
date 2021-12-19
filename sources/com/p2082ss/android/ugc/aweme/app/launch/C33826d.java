package com.p2082ss.android.ugc.aweme.app.launch;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.app.launch.d */
public final class C33826d {

    /* renamed from: a */
    static long f80072a;

    /* renamed from: b */
    static long f80073b;

    static {
        Covode.recordClassIndex(40726);
    }

    /* renamed from: a */
    public static final void m69188a() {
        C17873f.m33095c().mo143289d(C33827a.f80074a);
        C17873f.m33096d().mo143289d(C33828b.f80075a);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$b */
    static final class C33828b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C33828b f80075a = new C33828b();

        static {
            Covode.recordClassIndex(40728);
        }

        C33828b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C33826d.f80072a = System.currentTimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.d$a */
    static final class C33827a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C33827a f80074a = new C33827a();

        static {
            Covode.recordClassIndex(40727);
        }

        C33827a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C33826d.f80073b = System.currentTimeMillis();
            C58221f.C58224c cVar = new C58221f.C58224c();
            cVar.mo95703b((AbstractC58264w) new ResumeTask());
            cVar.mo95706a();
        }
    }
}
