package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.journey.ab */
public final class C56841ab extends AbstractC56869p {

    /* renamed from: k */
    private final AbstractC89244h f129435k = C89250i.m154773a((AbstractC89171a) C56842a.f129436a);

    static {
        Covode.recordClassIndex(66726);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: c */
    public final int mo63252c() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: e */
    public final int mo63254e() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: f */
    public final int mo63255f() {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: g */
    public final String mo63256g() {
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.ab$a */
    static final class C56842a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56842a f129436a = new C56842a();

        static {
            Covode.recordClassIndex(66727);
        }

        C56842a() {
            super(0);
        }

        /* renamed from: a */
        private static boolean m103093a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean a;
            C17867d.m33078a();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m103093a();
            }
            if (!C58029j.f132253e) {
                a = false;
            } else {
                a = C51648a.f118980a.mo87311a(true);
            }
            return Boolean.valueOf(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.AbstractC56869p
    /* renamed from: d */
    public final int mo63253d() {
        if (((Boolean) this.f129435k.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }
}
