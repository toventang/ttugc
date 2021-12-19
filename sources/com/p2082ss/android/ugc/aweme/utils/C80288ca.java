package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.utils.ca */
public final class C80288ca {

    /* renamed from: a */
    public static final C80288ca f179808a = new C80288ca();

    /* renamed from: b */
    private static final AbstractC89244h f179809b = C89250i.m154773a((AbstractC89171a) C80290b.f179812a);

    /* renamed from: c */
    private static final AbstractC89244h f179810c = C89250i.m154773a((AbstractC89171a) C80289a.f179811a);

    /* renamed from: a */
    public static Keva m139193a() {
        return (Keva) f179809b.getValue();
    }

    /* renamed from: b */
    private static Keva m139196b() {
        return (Keva) f179810c.getValue();
    }

    private C80288ca() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ca$a */
    static final class C80289a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80289a f179811a = new C80289a();

        static {
            Covode.recordClassIndex(93557);
        }

        C80289a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("illegal_music_dialog");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ca$b */
    static final class C80290b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80290b f179812a = new C80290b();

        static {
            Covode.recordClassIndex(93558);
        }

        C80290b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("illegal_music_panel");
        }
    }

    static {
        Covode.recordClassIndex(93556);
    }

    /* renamed from: a */
    public static boolean m139195a(String str) {
        return m139196b().getBoolean(str, true);
    }

    /* renamed from: b */
    public static void m139197b(String str) {
        m139196b().erase(str);
        m139193a().erase(str);
    }

    /* renamed from: a */
    public static void m139194a(String str, boolean z) {
        m139193a().storeBoolean(str, z);
    }

    /* renamed from: b */
    public static void m139198b(String str, boolean z) {
        m139196b().storeBoolean(str, z);
    }
}
