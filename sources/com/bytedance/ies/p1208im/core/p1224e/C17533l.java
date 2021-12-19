package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.l */
public final class C17533l {

    /* renamed from: a */
    static final int f41958a = 1;

    /* renamed from: b */
    static final AbstractC89244h f41959b = C89250i.m154773a((AbstractC89171a) C17534a.f41961a);

    /* renamed from: c */
    public static final C17533l f41960c = new C17533l();

    private C17533l() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.l$a */
    static final class C17534a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17534a f41961a = new C17534a();

        static {
            Covode.recordClassIndex(20023);
        }

        C17534a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "im_recent_msg_async_opt", 0) != C17533l.f41958a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(20022);
    }
}
