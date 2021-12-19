package com.p2082ss.android.ugc.aweme.setting.p3721i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.setting.i.f */
public final class C68093f {

    /* renamed from: a */
    public static final C68093f f152492a = new C68093f();

    /* renamed from: b */
    private static final AbstractC89244h f152493b = C89250i.m154773a((AbstractC89171a) C68094a.f152494a);

    /* renamed from: a */
    public static boolean m120394a() {
        return ((Boolean) f152493b.getValue()).booleanValue();
    }

    private C68093f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.i.f$a */
    static final class C68094a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C68094a f152494a = new C68094a();

        static {
            Covode.recordClassIndex(80290);
        }

        C68094a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_open_als_optimize", false));
        }
    }

    static {
        Covode.recordClassIndex(80289);
    }
}
