package com.p2082ss.android.ugc.aweme.setting.p3721i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.i.c */
public final class C68088c {

    /* renamed from: a */
    public static final C68088c f152485a = new C68088c();

    /* renamed from: b */
    private static final AbstractC89244h f152486b = C89250i.m154773a((AbstractC89171a) C68089a.f152487a);

    /* renamed from: b */
    private static int m120391b() {
        return ((Number) f152486b.getValue()).intValue();
    }

    private C68088c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.i.c$a */
    static final class C68089a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C68089a f152487a = new C68089a();

        static {
            Covode.recordClassIndex(80285);
        }

        C68089a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "creative_tools_enter_animation_opti", 0));
        }
    }

    static {
        Covode.recordClassIndex(80284);
    }

    /* renamed from: a */
    public static final int m120390a() {
        int b = m120391b();
        if (b == 1) {
            return 7;
        }
        if (b == 2) {
            return 8;
        }
        if (b != 3) {
            return 3;
        }
        return 9;
    }
}
