package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.n */
public final class C68190n {

    /* renamed from: a */
    public static final C68190n f152680a = new C68190n();

    /* renamed from: b */
    private static final AbstractC89244h f152681b = C89250i.m154773a((AbstractC89171a) C68191a.f152682a);

    /* renamed from: a */
    public static boolean m120442a() {
        return ((Boolean) f152681b.getValue()).booleanValue();
    }

    private C68190n() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.n$a */
    static final class C68191a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C68191a f152682a = new C68191a();

        static {
            Covode.recordClassIndex(80390);
        }

        C68191a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "studio_use_cache_in_duet", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80389);
    }
}
