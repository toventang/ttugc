package com.p2082ss.android.ugc.aweme.video.preload.p4213a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.a.e */
public final class C80826e {

    /* renamed from: a */
    public static final C80825d f180771a = new C80825d((byte) 0);

    /* renamed from: b */
    public static final C80826e f180772b = new C80826e();

    /* renamed from: c */
    private static final AbstractC89244h f180773c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C80827a.f180774a);

    /* renamed from: a */
    public static C80825d m140220a() {
        return (C80825d) f180773c.getValue();
    }

    private C80826e() {
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.a.e$a */
    static final class C80827a extends AbstractC89220m implements AbstractC89171a<C80825d> {

        /* renamed from: a */
        public static final C80827a f180774a = new C80827a();

        static {
            Covode.recordClassIndex(94124);
        }

        C80827a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C80825d invoke() {
            return m140221a();
        }

        /* renamed from: a */
        private static C80825d m140221a() {
            C80825d dVar;
            try {
                dVar = (C80825d) C16048b.m29633a().mo25416a(true, "video_cover_preload_config", C80825d.class, C80826e.f180771a);
                if (dVar == null) {
                    dVar = new C80825d((byte) 0);
                }
            } catch (Throwable unused) {
            }
            C89219l.m154716b(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(94123);
    }
}
