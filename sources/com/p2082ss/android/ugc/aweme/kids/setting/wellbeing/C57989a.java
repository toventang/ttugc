package com.p2082ss.android.ugc.aweme.kids.setting.wellbeing;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.a */
public final class C57989a {

    /* renamed from: a */
    public static final AbstractC89244h f132168a = C89250i.m154773a((AbstractC89171a) C57991b.f132171a);

    /* renamed from: b */
    public static final AbstractC89244h f132169b = C89250i.m154773a((AbstractC89171a) C57992c.f132172a);

    /* renamed from: c */
    public static final C57990a f132170c = new C57990a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.a$a */
    public static final class C57990a {
        static {
            Covode.recordClassIndex(68017);
        }

        /* renamed from: a */
        static Keva m104805a() {
            return (Keva) C57989a.f132169b.getValue();
        }

        private C57990a() {
        }

        public /* synthetic */ C57990a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m104806a(long j) {
            m104805a().storeLong("play_time", j);
        }

        /* renamed from: a */
        public static void m104807a(String str) {
            C89219l.m154721d(str, "");
            m104805a().storeString("last_update_date", str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.a$c */
    static final class C57992c extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C57992c f132172a = new C57992c();

        static {
            Covode.recordClassIndex(68019);
        }

        C57992c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo((String) C57989a.f132168a.getValue());
        }
    }

    static {
        Covode.recordClassIndex(68016);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.wellbeing.a$b */
    static final class C57991b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C57991b f132171a = new C57991b();

        static {
            Covode.recordClassIndex(68018);
        }

        C57991b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            StringBuilder sb = new StringBuilder("kids_wellbeing");
            AbstractC57153a b = KidsAccountServiceImpl.m104406h().mo94318b();
            if (b == null || (str = b.getUserId()) == null) {
                str = "";
            }
            return sb.append(str).toString();
        }
    }
}
