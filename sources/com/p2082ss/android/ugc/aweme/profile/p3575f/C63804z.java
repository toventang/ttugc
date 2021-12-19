package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.z */
public final class C63804z {

    /* renamed from: a */
    public static C63762ab f144626a;

    /* renamed from: b */
    public static final C63804z f144627b = new C63804z();

    /* renamed from: com.ss.android.ugc.aweme.profile.f.z$a */
    public static final class C63805a implements AbstractC63761aa {
        static {
            Covode.recordClassIndex(75133);
        }

        C63805a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.AbstractC63761aa
        /* renamed from: a */
        public final void mo102323a(boolean z) {
            C63762ab abVar = C63804z.f144626a;
            if (abVar != null) {
                abVar.mo102325a("homepage_other_profile_info", !z ? 1 : 0, false);
            }
        }
    }

    private C63804z() {
    }

    /* renamed from: a */
    public static AbstractC63761aa m115399a() {
        return new C63805a();
    }

    static {
        Covode.recordClassIndex(75132);
    }

    /* renamed from: a */
    public static void m115400a(AbstractC63761aa aaVar, String str) {
        C89219l.m154721d(aaVar, "");
        f144626a = new C63762ab(new C63769ah(System.currentTimeMillis(), 123), str, aaVar);
    }
}
