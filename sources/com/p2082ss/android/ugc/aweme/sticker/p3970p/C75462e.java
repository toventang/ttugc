package com.p2082ss.android.ugc.aweme.sticker.p3970p;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.p.e */
public final class C75462e {

    /* renamed from: a */
    public static final C75462e f169567a = new C75462e();

    /* renamed from: b */
    private static final AbstractC89244h f169568b = C89250i.m154773a((AbstractC89171a) C75463a.f169569a);

    /* renamed from: a */
    public static Keva m132330a() {
        return (Keva) f169568b.getValue();
    }

    private C75462e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.p.e$a */
    static final class C75463a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C75463a f169569a = new C75463a();

        static {
            Covode.recordClassIndex(88385);
        }

        C75463a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("sticker_bind_music");
        }
    }

    static {
        Covode.recordClassIndex(88384);
    }

    /* renamed from: a */
    public static final String m132331a(String str) {
        if (str == null) {
            return null;
        }
        return m132330a().getString(str, null);
    }

    /* renamed from: a */
    public static final void m132332a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m132330a().storeString(str, str2);
    }
}
