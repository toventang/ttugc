package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3881b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a */
public final class C73850a {

    /* renamed from: a */
    public static final C73850a f165779a = new C73850a();

    /* renamed from: b */
    private static final AbstractC89244h f165780b = C89250i.m154773a((AbstractC89171a) C73851a.f165781a);

    /* renamed from: a */
    public static Keva m129924a() {
        return (Keva) f165780b.getValue();
    }

    private C73850a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b.a$a */
    static final class C73851a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C73851a f165781a = new C73851a();

        static {
            Covode.recordClassIndex(86597);
        }

        C73851a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("upload_cached_log");
        }
    }

    /* renamed from: b */
    public static final long m129925b() {
        return m129924a().getLong("upload_speed", -1024);
    }

    /* renamed from: c */
    public static final long m129926c() {
        return m129924a().getLong("upload_finish_timestamp", -1);
    }

    static {
        Covode.recordClassIndex(86596);
    }
}
