package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.d */
public final class C70939d {

    /* renamed from: a */
    public static final C70939d f158837a = new C70939d();

    /* renamed from: b */
    private static final AbstractC89244h f158838b = C89250i.m154773a((AbstractC89171a) C70940a.f158839a);

    /* renamed from: a */
    public static Keva m125236a() {
        return (Keva) f158838b.getValue();
    }

    private C70939d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.d$a */
    static final class C70940a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C70940a f158839a = new C70940a();

        static {
            Covode.recordClassIndex(83434);
        }

        C70940a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("auto_enhance_keva");
        }
    }

    /* renamed from: b */
    public static boolean m125237b() {
        return m125236a().getBoolean("key_show_toast", true);
    }

    static {
        Covode.recordClassIndex(83433);
    }
}
