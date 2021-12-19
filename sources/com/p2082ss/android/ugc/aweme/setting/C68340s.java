package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.s */
public final class C68340s {

    /* renamed from: a */
    public static final C68340s f152926a = new C68340s();

    /* renamed from: b */
    private static final AbstractC89244h f152927b = C89250i.m154773a((AbstractC89171a) C68341a.f152928a);

    /* renamed from: a */
    public static boolean m120620a() {
        return ((Boolean) f152927b.getValue()).booleanValue();
    }

    private C68340s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.s$a */
    static final class C68341a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C68341a f152928a = new C68341a();

        static {
            Covode.recordClassIndex(80566);
        }

        C68341a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "studio_can_cancel_loading_in_duet", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80565);
    }
}
