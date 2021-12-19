package com.bytedance.ies.ugc.statisticlogger.p1278b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.b.a */
public final class C18214a {

    /* renamed from: a */
    public static final C18214a f43395a = new C18214a();

    /* renamed from: b */
    private static final AbstractC89244h f43396b = C89250i.m154773a((AbstractC89171a) C18217c.f43401a);

    /* renamed from: c */
    private static final AbstractC89244h f43397c = C89250i.m154773a((AbstractC89171a) C18215a.f43399a);

    /* renamed from: d */
    private static final AbstractC89244h f43398d = C89250i.m154773a((AbstractC89171a) C18216b.f43400a);

    /* renamed from: a */
    public static int m33890a() {
        return ((Number) f43396b.getValue()).intValue();
    }

    /* renamed from: b */
    public static boolean m33891b() {
        return ((Boolean) f43397c.getValue()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m33892c() {
        return ((Boolean) f43398d.getValue()).booleanValue();
    }

    private C18214a() {
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.b.a$a */
    static final class C18215a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C18215a f43399a = new C18215a();

        static {
            Covode.recordClassIndex(20872);
        }

        C18215a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if ((C18214a.m33890a() & 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.b.a$b */
    static final class C18216b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C18216b f43400a = new C18216b();

        static {
            Covode.recordClassIndex(20873);
        }

        C18216b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if ((C18214a.m33890a() & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.b.a$c */
    static final class C18217c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C18217c f43401a = new C18217c();

        static {
            Covode.recordClassIndex(20874);
        }

        C18217c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("applog_cold_boot_downgrade", 0));
        }
    }

    static {
        Covode.recordClassIndex(20871);
    }
}
