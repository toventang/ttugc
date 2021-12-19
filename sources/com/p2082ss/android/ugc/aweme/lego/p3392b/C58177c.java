package com.p2082ss.android.ugc.aweme.lego.p3392b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.lego.b.c */
public final class C58177c {

    /* renamed from: a */
    public static final boolean f132471a = false;

    /* renamed from: b */
    public static final C58177c f132472b = new C58177c();

    /* renamed from: c */
    private static final boolean f132473c = true;

    /* renamed from: d */
    private static final AbstractC89244h f132474d = C89250i.m154773a((AbstractC89171a) C58178a.f132475a);

    /* renamed from: a */
    public static boolean m105092a() {
        return ((Boolean) f132474d.getValue()).booleanValue();
    }

    private C58177c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.b.c$a */
    static final class C58178a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C58178a f132475a = new C58178a();

        static {
            Covode.recordClassIndex(68244);
        }

        C58178a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Keva.getRepo("ab_repo_cold_boot").getBoolean("grade_6_device", C58177c.f132471a));
        }
    }

    static {
        Covode.recordClassIndex(68243);
    }
}
