package com.p2082ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.video.local.f */
public final class C80771f {

    /* renamed from: a */
    public static boolean f180597a = m140087a().getBoolean("useSurfaceView", false);

    /* renamed from: b */
    public static final C80771f f180598b = new C80771f();

    /* renamed from: c */
    private static final AbstractC89244h f180599c = C89250i.m154773a((AbstractC89171a) C80772a.f180600a);

    /* renamed from: a */
    public static Keva m140087a() {
        return (Keva) f180599c.getValue();
    }

    private C80771f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.f$a */
    static final class C80772a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80772a f180600a = new C80772a();

        static {
            Covode.recordClassIndex(94063);
        }

        C80772a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("player_setting", 0);
        }
    }

    static {
        Covode.recordClassIndex(94062);
    }
}
