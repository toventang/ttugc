package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1399im.core.p1404a.C19496j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.h */
public final class C17524h {

    /* renamed from: a */
    public static final C19496j f41938a = new C19496j();

    /* renamed from: b */
    static final AbstractC89244h f41939b = C89250i.m154773a((AbstractC89171a) C17525a.f41941a);

    /* renamed from: c */
    public static final C17524h f41940c = new C17524h();

    private C17524h() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.h$a */
    static final class C17525a extends AbstractC89220m implements AbstractC89171a<C19496j> {

        /* renamed from: a */
        public static final C17525a f41941a = new C17525a();

        static {
            Covode.recordClassIndex(IHostUser.MESSAGE_NICKNAME_DUPLICATE);
        }

        C17525a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19496j invoke() {
            return m32500a();
        }

        /* renamed from: a */
        private static C19496j m32500a() {
            C19496j jVar;
            try {
                jVar = (C19496j) C16048b.m29633a().mo25415a(true, "im_sdk_optimize_conv_list_pull", C19496j.class);
            } catch (Throwable unused) {
                jVar = C17524h.f41938a;
            }
            if (jVar == null) {
                return C17524h.f41938a;
            }
            return jVar;
        }
    }

    static {
        Covode.recordClassIndex(20013);
    }
}
