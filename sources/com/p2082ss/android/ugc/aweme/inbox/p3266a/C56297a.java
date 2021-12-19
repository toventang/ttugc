package com.p2082ss.android.ugc.aweme.inbox.p3266a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56301b;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.a.a */
public final class C56297a {

    /* renamed from: a */
    public static final C56297a f128434a = new C56297a();

    /* renamed from: b */
    private static final int f128435b = 1;

    /* renamed from: c */
    private static final int f128436c = 2;

    /* renamed from: d */
    private static final int f128437d = 3;

    /* renamed from: e */
    private static final int f128438e = 4;

    /* renamed from: f */
    private static final AbstractC89244h f128439f = C89250i.m154773a((AbstractC89171a) C56300c.f128442a);

    /* renamed from: a */
    public static int m102297a() {
        return ((Number) f128439f.getValue()).intValue();
    }

    private C56297a() {
    }

    /* renamed from: b */
    public static C56301b.C56302a m102300b() {
        C56301b.C56302a aVar = (C56301b.C56302a) C56301b.f128444b.getValue();
        C89219l.m154716b(aVar, "");
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.a.a$c */
    static final class C56300c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C56300c f128442a = new C56300c();

        static {
            Covode.recordClassIndex(66118);
        }

        C56300c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "inbox_reverse_notification", 0));
        }
    }

    /* renamed from: c */
    public static boolean m102301c() {
        if (m102297a() == f128435b || m102297a() == f128436c || m102297a() == f128438e) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m102302d() {
        if (m102297a() == f128435b || m102297a() == f128438e || m102297a() == f128437d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m102303e() {
        if (m102297a() == f128435b || m102297a() == f128436c) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(66115);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.a.a$a */
    public static final class C56298a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C56298a f128440a = new C56298a();

        static {
            Covode.recordClassIndex(66116);
        }

        C56298a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(C56301b.m102304a().contains(Integer.valueOf(num.intValue())));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.a.a$b */
    public static final class C56299b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C56299b f128441a = new C56299b();

        static {
            Covode.recordClassIndex(66117);
        }

        C56299b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(C56297a.m102300b().f128447a.contains(Integer.valueOf(num.intValue())));
        }
    }

    /* renamed from: a */
    public static void m102298a(List<Integer> list) {
        C89219l.m154721d(list, "");
        int a = m102297a();
        if (a == f128435b || a == f128438e) {
            list.clear();
        } else if (a == f128436c) {
            C89070n.m154537a((List) list, (AbstractC89172b) C56298a.f128440a);
        } else if (a == f128437d) {
            C89070n.m154537a((List) list, (AbstractC89172b) C56299b.f128441a);
        }
    }

    /* renamed from: a */
    public static boolean m102299a(int i) {
        if (m102297a() == f128435b || m102297a() == f128438e) {
            return true;
        }
        if (m102297a() == f128437d && m102300b().f128447a.contains(Integer.valueOf(i))) {
            return true;
        }
        if (m102297a() != f128436c || !C56301b.m102304a().contains(Integer.valueOf(i))) {
            return false;
        }
        return true;
    }
}
