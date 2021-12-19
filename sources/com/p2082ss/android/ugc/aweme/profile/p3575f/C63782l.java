package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.l */
public final class C63782l {

    /* renamed from: a */
    public static C63762ab f144576a;

    /* renamed from: b */
    public static final C63782l f144577b = new C63782l();

    /* renamed from: com.ss.android.ugc.aweme.profile.f.l$a */
    public static final class C63783a implements AbstractC63761aa {
        static {
            Covode.recordClassIndex(75111);
        }

        C63783a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.AbstractC63761aa
        /* renamed from: a */
        public final void mo102323a(boolean z) {
            C63762ab abVar = C63782l.f144576a;
            if (abVar != null) {
                abVar.mo102325a("homepage_other_aweme_post", !z ? 1 : 0, false);
            }
        }
    }

    private C63782l() {
    }

    /* renamed from: a */
    public static void m115338a() {
        C63762ab abVar = f144576a;
        if (abVar != null) {
            abVar.mo102324a();
        }
    }

    /* renamed from: b */
    public static void m115340b() {
        C63762ab abVar = f144576a;
        if (abVar != null) {
            abVar.mo102326b();
        }
    }

    /* renamed from: c */
    public static void m115341c() {
        C63762ab abVar = f144576a;
        if (abVar != null) {
            abVar.mo102328d();
        }
    }

    /* renamed from: d */
    public static AbstractC63761aa m115342d() {
        return new C63783a();
    }

    static {
        Covode.recordClassIndex(75110);
    }

    /* renamed from: a */
    public static void m115339a(AbstractC63761aa aaVar, String str) {
        C89219l.m154721d(aaVar, "");
        f144576a = new C63762ab(new C63769ah(System.currentTimeMillis(), 123), str, aaVar);
    }
}
