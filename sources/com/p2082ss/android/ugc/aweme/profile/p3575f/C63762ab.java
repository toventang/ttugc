package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ab */
public final class C63762ab {

    /* renamed from: d */
    public static final C63763a f144535d = new C63763a((byte) 0);

    /* renamed from: a */
    public C63769ah f144536a;

    /* renamed from: b */
    public final String f144537b;

    /* renamed from: c */
    public final AbstractC63761aa f144538c;

    static {
        Covode.recordClassIndex(75090);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.f.ab$a */
    public static final class C63763a {
        static {
            Covode.recordClassIndex(75091);
        }

        private C63763a() {
        }

        public /* synthetic */ C63763a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private final long m115303e() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            return ahVar.mo102332d();
        }
        return -1;
    }

    /* renamed from: f */
    private final long m115304f() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            return ahVar.mo102329a();
        }
        return -1;
    }

    /* renamed from: g */
    private final long m115305g() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            return ahVar.mo102330b();
        }
        return -1;
    }

    /* renamed from: h */
    private final long m115306h() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            return ahVar.mo102331c();
        }
        return -1;
    }

    /* renamed from: i */
    private final long m115307i() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            return System.currentTimeMillis() - ahVar.f144548c;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo102326b() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            ahVar.f144550e = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo102324a() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            ahVar.f144549d = System.currentTimeMillis();
        }
        C63769ah ahVar2 = this.f144536a;
        if (ahVar2 != null) {
            ahVar2.f144552g = true;
        }
    }

    /* renamed from: c */
    public final void mo102327c() {
        C63769ah ahVar = this.f144536a;
        if (ahVar != null) {
            ahVar.f144550e = System.currentTimeMillis();
        }
        AbstractC63761aa aaVar = this.f144538c;
        C63769ah ahVar2 = this.f144536a;
        if (ahVar2 != null) {
            ahVar2.mo102332d();
        }
        aaVar.mo102323a(false);
        this.f144536a = null;
    }

    /* renamed from: d */
    public final void mo102328d() {
        C63769ah ahVar;
        C63769ah ahVar2;
        C63769ah ahVar3 = this.f144536a;
        if (ahVar3 != null) {
            ahVar3.f144551f = System.currentTimeMillis();
        }
        C63769ah ahVar4 = this.f144536a;
        if (ahVar4 != null && ahVar4.mo102330b() >= 0 && (ahVar = this.f144536a) != null && ahVar.mo102329a() >= 0 && (ahVar2 = this.f144536a) != null && ahVar2.mo102331c() >= 0) {
            AbstractC63761aa aaVar = this.f144538c;
            C63769ah ahVar5 = this.f144536a;
            if (ahVar5 != null) {
                ahVar5.mo102332d();
            }
            aaVar.mo102323a(true);
            this.f144536a = null;
        }
    }

    public C63762ab(C63769ah ahVar, String str, AbstractC63761aa aaVar) {
        C89219l.m154721d(aaVar, "");
        this.f144536a = ahVar;
        this.f144537b = str;
        this.f144538c = aaVar;
    }

    /* renamed from: a */
    public final void mo102325a(String str, int i, boolean z) {
        long i2;
        long j;
        C89219l.m154721d(str, "");
        C63769ah ahVar = this.f144536a;
        if (ahVar != null && ahVar.f144552g) {
            C63769ah ahVar2 = this.f144536a;
            if (ahVar2 != null) {
                ahVar2.f144552g = false;
            }
            C33744d a = new C33744d().mo59983a("page_type", str).mo59980a("result", i).mo59983a("enter_from", this.f144537b);
            if (!z) {
                i2 = m115303e();
            } else {
                i2 = m115307i();
            }
            C33744d a2 = a.mo59981a("duration", i2).mo59981a("duration_before_network", m115304f());
            long j2 = -1;
            if (!z) {
                j = m115305g();
            } else {
                j = -1;
            }
            C33744d a3 = a2.mo59981a("duration_network", j);
            if (!z) {
                j2 = m115306h();
            }
            C39162r.m79460a("page_load_time", a3.mo59981a("duration_after_network", j2).f79943a);
        }
    }
}
