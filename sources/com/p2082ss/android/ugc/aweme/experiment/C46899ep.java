package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.p1007g.C14853c;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.ep */
public final class C46899ep {

    /* renamed from: a */
    public static final int f109296a = 0;

    /* renamed from: b */
    public static final C46899ep f109297b = new C46899ep();

    /* renamed from: c */
    private static final int f109298c = 1;

    /* renamed from: d */
    private static final int f109299d = 2;

    /* renamed from: e */
    private static final int f109300e = 3;

    /* renamed from: f */
    private static final AbstractC89244h<Integer> f109301f = C89250i.m154773a((AbstractC89171a) C46900a.f109303a);

    /* renamed from: g */
    private static final AbstractC89244h<Boolean> f109302g = C89250i.m154773a((AbstractC89171a) C46901b.f109304a);

    private C46899ep() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ep$b */
    static final class C46901b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46901b f109304a = new C46901b();

        static {
            Covode.recordClassIndex(55502);
        }

        C46901b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return C49907s.m93685a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.ep$a */
    static final class C46900a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46900a f109303a = new C46900a();

        static {
            Covode.recordClassIndex(55501);
        }

        C46900a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m90199a());
        }

        /* renamed from: a */
        private static int m90199a() {
            try {
                return C16048b.m29633a().mo25411a("new_user_feed_total_opt", ClientExpManager.new_user_feed_total_opt());
            } catch (Exception unused) {
                return C46899ep.f109296a;
            }
        }
    }

    static {
        Covode.recordClassIndex(55500);
    }

    /* renamed from: a */
    public static boolean m90197a() {
        if (!C14853c.f36267d) {
            return false;
        }
        Boolean value = f109302g.getValue();
        C89219l.m154716b(value, "");
        if (value.booleanValue()) {
            AbstractC89244h<Integer> hVar = f109301f;
            if (hVar.getValue().intValue() == f109298c || hVar.getValue().intValue() == f109299d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m90198b() {
        if (!C14853c.f36267d) {
            return false;
        }
        Boolean value = f109302g.getValue();
        C89219l.m154716b(value, "");
        if (!value.booleanValue() || f109301f.getValue().intValue() != f109299d) {
            return false;
        }
        return true;
    }
}
