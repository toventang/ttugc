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

/* renamed from: com.ss.android.ugc.aweme.experiment.en */
public final class C46893en {

    /* renamed from: a */
    public static final int f109280a = 2;

    /* renamed from: b */
    public static final int f109281b = 3;

    /* renamed from: c */
    public static final AbstractC89244h<Integer> f109282c = C89250i.m154773a((AbstractC89171a) C46894a.f109287a);

    /* renamed from: d */
    public static final AbstractC89244h<Boolean> f109283d = C89250i.m154773a((AbstractC89171a) C46895b.f109288a);

    /* renamed from: e */
    public static boolean f109284e;

    /* renamed from: f */
    public static final C46893en f109285f = new C46893en();

    /* renamed from: g */
    private static final int f109286g = 1;

    private C46893en() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.en$b */
    static final class C46895b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C46895b f109288a = new C46895b();

        static {
            Covode.recordClassIndex(55496);
        }

        C46895b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return C49907s.m93685a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.en$a */
    static final class C46894a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C46894a f109287a = new C46894a();

        static {
            Covode.recordClassIndex(55495);
        }

        C46894a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25411a("is_opt_new_user_boot", ClientExpManager.is_opt_new_user_boot()));
        }
    }

    static {
        Covode.recordClassIndex(55494);
    }

    /* renamed from: a */
    public static boolean m90196a() {
        if (!C14853c.f36267d) {
            return false;
        }
        Boolean value = f109283d.getValue();
        C89219l.m154716b(value, "");
        if (value.booleanValue() && f109284e) {
            AbstractC89244h<Integer> hVar = f109282c;
            if (hVar.getValue().intValue() == f109286g || hVar.getValue().intValue() == f109281b) {
                return true;
            }
        }
        return false;
    }
}
