package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.j */
public final class C81499j {

    /* renamed from: a */
    public static final C81499j f182204a = new C81499j();

    /* renamed from: b */
    private static final AbstractC89244h f182205b = C89250i.m154773a((AbstractC89171a) C81500a.f182206a);

    /* renamed from: a */
    static Keva m141325a() {
        return (Keva) f182205b.getValue();
    }

    private C81499j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.j$a */
    static final class C81500a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C81500a f182206a = new C81500a();

        static {
            Covode.recordClassIndex(94873);
        }

        C81500a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_watermark_resource");
        }
    }

    static {
        Covode.recordClassIndex(94872);
    }

    /* renamed from: a */
    public static void m141328a(boolean z) {
        m141325a().storeBoolean("key_ending_audio_ready", z);
    }

    /* renamed from: a */
    public static void m141326a(int i, int i2) {
        m141325a().storeString("key_ending_frame_ready", m141329b(i, i2));
    }

    /* renamed from: b */
    static String m141329b(int i, int i2) {
        return new StringBuilder().append(i).append('-').append(i2).toString();
    }

    /* renamed from: c */
    static String m141331c(String str, boolean z) {
        return (z ? 1 : 0) + str;
    }

    /* renamed from: a */
    public static void m141327a(String str, boolean z) {
        C89219l.m154721d(str, "");
        m141325a().storeString(m141331c("key_ending_effects_path", z), str);
    }

    /* renamed from: b */
    public static void m141330b(String str, boolean z) {
        C89219l.m154721d(str, "");
        m141325a().storeString(m141331c("key_user_fingerprint", z), str);
    }
}
