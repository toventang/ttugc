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

/* renamed from: com.ss.android.ugc.aweme.experiment.eq */
public final class C46902eq {

    /* renamed from: a */
    public static final int f109305a = 0;

    /* renamed from: b */
    public static final C46902eq f109306b = new C46902eq();

    /* renamed from: c */
    private static final int f109307c = 1;

    /* renamed from: d */
    private static final int f109308d = 2;

    /* renamed from: e */
    private static final int f109309e = 3;

    /* renamed from: f */
    private static final AbstractC89244h<Integer> f109310f = C89250i.m154773a((AbstractC89171a) C46903a.f109312a);

    /* renamed from: g */
    private static final AbstractC89244h<Boolean> f109311g = C89250i.m154773a((AbstractC89171a) C46904b.f109313a);

    private C46902eq() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.eq$b */
    static final class C46904b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46904b f109313a = new C46904b();

        static {
            Covode.recordClassIndex(55505);
        }

        C46904b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return C49907s.m93685a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.eq$a */
    static final class C46903a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46903a f109312a = new C46903a();

        static {
            Covode.recordClassIndex(55504);
        }

        C46903a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("new_user_guide_animation", ClientExpManager.new_user_guide_animation()));
        }
    }

    static {
        Covode.recordClassIndex(55503);
    }

    /* renamed from: a */
    public static boolean m90200a() {
        if (!C14853c.f36267d) {
            return false;
        }
        Boolean value = f109311g.getValue();
        C89219l.m154716b(value, "");
        if (!value.booleanValue() || f109310f.getValue().intValue() == f109305a) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m90201b() {
        if (C14853c.f36267d && f109311g.getValue().booleanValue()) {
            int intValue = f109310f.getValue().intValue();
            if (intValue == f109308d) {
                return 1;
            }
            if (intValue == f109309e) {
                return 2;
            }
        }
        return 0;
    }
}
