package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.q */
public final class C56873q {

    /* renamed from: a */
    static Set<String> f129518a = C89047am.m154438a((Object[]) new String[]{"BR", "ID", "IN", "TH", "US", "VN"});

    /* renamed from: b */
    static Set<String> f129519b = C89047am.m154438a((Object[]) new String[]{"BR", "GB", "US", "AU", "DE", "FR", "JP", "KR", "TH", "VN", "ID", "KR"});

    /* renamed from: c */
    static final Set<String> f129520c = C89047am.m154436a("IN");

    /* renamed from: d */
    static final Set<String> f129521d = C89047am.m154438a((Object[]) new String[]{"AE", "SA", "KW", "QA", "OM", "BH", "MA", "TN", "LB"});

    /* renamed from: e */
    static final Set<String> f129522e = C89047am.m154436a("RU");

    /* renamed from: f */
    static final Set<String> f129523f = C89047am.m154436a("MY");

    /* renamed from: g */
    public static final Set<String> f129524g = C89047am.m154436a("US");

    /* renamed from: h */
    public static final AbstractC89244h f129525h = C89250i.m154774a(EnumC89331m.NONE, C56876c.f129530a);

    /* renamed from: i */
    private static final AbstractC89244h f129526i = C89250i.m154773a((AbstractC89171a) C56875b.f129529a);

    /* renamed from: j */
    private static final AbstractC89244h f129527j = C89250i.m154773a((AbstractC89171a) C56874a.f129528a);

    /* renamed from: a */
    public static final String m103136a() {
        return (String) f129526i.getValue();
    }

    /* renamed from: b */
    public static final int m103137b() {
        return ((Number) f129527j.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.q$b */
    static final class C56875b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56875b f129529a = new C56875b();

        static {
            Covode.recordClassIndex(66761);
        }

        C56875b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = C58071d.m104907a();
            C89219l.m154716b(a, "");
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a.toUpperCase();
            C89219l.m154716b(upperCase, "");
            return upperCase;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.q$c */
    static final class C56876c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56876c f129530a = new C56876c();

        static {
            Covode.recordClassIndex(66762);
        }

        C56876c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (C56873q.f129518a.contains(C56873q.m103136a())) {
                return C56873q.m103136a();
            }
            return "US";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.q$a */
    static final class C56874a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56874a f129528a = new C56874a();

        static {
            Covode.recordClassIndex(66760);
        }

        C56874a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            String a = C56873q.m103136a();
            if (C56873q.f129520c.contains(a)) {
                i = 7;
            } else if (C56873q.f129521d.contains(a)) {
                i = 12;
            } else if (C56873q.f129522e.contains(a) || C56873q.f129523f.contains(a) || !C56873q.f129519b.contains(a)) {
                i = 11;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    }

    static {
        Covode.recordClassIndex(66759);
    }
}
