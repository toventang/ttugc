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

/* renamed from: com.ss.android.ugc.aweme.experiment.em */
public final class C46890em {

    /* renamed from: a */
    public static final int f109270a = 0;

    /* renamed from: b */
    public static final int f109271b = 2;

    /* renamed from: c */
    public static final int f109272c = 3;

    /* renamed from: d */
    public static final AbstractC89244h<Integer> f109273d = C89250i.m154773a((AbstractC89171a) C46891a.f109278a);

    /* renamed from: e */
    public static final AbstractC89244h<Boolean> f109274e = C89250i.m154773a((AbstractC89171a) C46892b.f109279a);

    /* renamed from: f */
    public static final C46890em f109275f = new C46890em();

    /* renamed from: g */
    private static final int f109276g = 1;

    /* renamed from: h */
    private static final int f109277h = 4;

    private C46890em() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.em$b */
    static final class C46892b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46892b f109279a = new C46892b();

        static {
            Covode.recordClassIndex(55493);
        }

        C46892b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return C49907s.m93685a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.em$a */
    static final class C46891a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46891a f109278a = new C46891a();

        static {
            Covode.recordClassIndex(55492);
        }

        C46891a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(m90195a());
        }

        /* renamed from: a */
        private static int m90195a() {
            try {
                return C16048b.m29633a().mo25411a("backup_video_opt", ClientExpManager.backup_video_opt());
            } catch (Exception unused) {
                return C46890em.f109270a;
            }
        }
    }

    static {
        Covode.recordClassIndex(55491);
    }

    /* renamed from: a */
    public static boolean m90194a() {
        if (!C14853c.f36267d) {
            return false;
        }
        Boolean value = f109274e.getValue();
        C89219l.m154716b(value, "");
        if (!value.booleanValue() || f109273d.getValue().intValue() == f109270a) {
            return false;
        }
        return true;
    }
}
