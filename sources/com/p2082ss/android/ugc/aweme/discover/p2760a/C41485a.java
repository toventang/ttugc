package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.a.a */
public final class C41485a {

    /* renamed from: a */
    public static final C41524b f96789a = new C41524b((byte) 0);

    /* renamed from: b */
    public static final C41485a f96790b = new C41485a();

    /* renamed from: c */
    private static final AbstractC89244h f96791c = C89250i.m154773a((AbstractC89171a) C41486a.f96793a);

    /* renamed from: d */
    private static final AbstractC89244h f96792d = C89250i.m154773a((AbstractC89171a) C41487b.f96794a);

    /* renamed from: a */
    public static C41524b m83437a() {
        return (C41524b) f96792d.getValue();
    }

    private C41485a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.a$a */
    static final class C41486a extends AbstractC89220m implements AbstractC89171a<Set<? extends String>> {

        /* renamed from: a */
        public static final C41486a f96793a = new C41486a();

        static {
            Covode.recordClassIndex(49393);
        }

        C41486a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<? extends String> invoke() {
            return C89047am.m154438a((Object[]) new String[]{"general", "discover"});
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.a$b */
    static final class C41487b extends AbstractC89220m implements AbstractC89171a<C41524b> {

        /* renamed from: a */
        public static final C41487b f96794a = new C41487b();

        static {
            Covode.recordClassIndex(49394);
        }

        C41487b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41524b invoke() {
            return C16048b.m29633a().mo25416a(true, "search_direct_account_sug", C41524b.class, C41485a.f96789a);
        }
    }

    static {
        Covode.recordClassIndex(49392);
    }

    /* renamed from: a */
    public static final boolean m83438a(String str) {
        if (str == null) {
            str = "";
        }
        if (((Set) f96791c.getValue()).contains(str) && C41527d.m83465a() > 0 && C41527d.m83466b() > 0) {
            return true;
        }
        return false;
    }
}
