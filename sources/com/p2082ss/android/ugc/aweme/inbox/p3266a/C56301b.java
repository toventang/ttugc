package com.p2082ss.android.ugc.aweme.inbox.p3266a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.a.b */
public final class C56301b {

    /* renamed from: a */
    public static final C56302a f128443a = new C56302a();

    /* renamed from: b */
    static final AbstractC89244h f128444b = C89250i.m154773a((AbstractC89171a) C56304c.f128450a);

    /* renamed from: c */
    public static final C56301b f128445c = new C56301b();

    /* renamed from: d */
    private static final AbstractC89244h f128446d = C89250i.m154773a((AbstractC89171a) C56303b.f128449a);

    /* renamed from: a */
    public static List<Integer> m102304a() {
        return (List) f128446d.getValue();
    }

    private C56301b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.a.b$c */
    static final class C56304c extends AbstractC89220m implements AbstractC89171a<C56302a> {

        /* renamed from: a */
        public static final C56304c f128450a = new C56304c();

        static {
            Covode.recordClassIndex(66122);
        }

        C56304c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56302a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("inbox_reverse_notification_meta", C56302a.class, C56301b.f128443a);
            if (a == null) {
                return C56301b.f128443a;
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.a.b$b */
    static final class C56303b extends AbstractC89220m implements AbstractC89171a<List<? extends Integer>> {

        /* renamed from: a */
        public static final C56303b f128449a = new C56303b();

        static {
            Covode.recordClassIndex(66121);
        }

        C56303b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends Integer> invoke() {
            return C89070n.m154522b(99, 101, 997, 998);
        }
    }

    static {
        Covode.recordClassIndex(66119);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.a.b$a */
    public static final class C56302a {
        @AbstractC27891c(mo46611a = "interact_group")

        /* renamed from: a */
        public final List<Integer> f128447a;
        @AbstractC27891c(mo46611a = "interact_type")

        /* renamed from: b */
        public final List<Integer> f128448b;

        static {
            Covode.recordClassIndex(66120);
        }

        public /* synthetic */ C56302a() {
            this(C89070n.m154522b(7, 233, 12, 13, 2, 231, 3, 241, 6), C89070n.m154522b(33, 233, 13, 23, 31, 231, 1003, 41, 241, 45));
        }

        private C56302a(List<Integer> list, List<Integer> list2) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            this.f128447a = list;
            this.f128448b = list2;
        }
    }
}
