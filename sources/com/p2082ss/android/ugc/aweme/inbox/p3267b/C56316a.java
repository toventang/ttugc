package com.p2082ss.android.ugc.aweme.inbox.p3267b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.inbox.b.a */
public final class C56316a {

    /* renamed from: a */
    public static final C56316a f128471a = new C56316a();

    /* renamed from: b */
    private static final AbstractC89244h f128472b = C89250i.m154773a((AbstractC89171a) C56317a.f128473a);

    private C56316a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.b.a$a */
    static final class C56317a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C56317a f128473a = new C56317a();

        static {
            Covode.recordClassIndex(66137);
        }

        C56317a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "inbox_redesign_contact_request_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(66136);
    }

    /* renamed from: a */
    public static boolean m102309a() {
        if (((Boolean) f128472b.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
