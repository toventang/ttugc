package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.e.r */
public final class C17547r {

    /* renamed from: a */
    static final AbstractC89244h f41986a = C89250i.m154773a((AbstractC89171a) C17548a.f41990a);

    /* renamed from: b */
    public static final C17547r f41987b = new C17547r();

    /* renamed from: c */
    private static final int f41988c = 1;

    /* renamed from: d */
    private static final int f41989d = 2;

    private C17547r() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.r$a */
    static final class C17548a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C17548a f41990a = new C17548a();

        static {
            Covode.recordClassIndex(20037);
        }

        C17548a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "im_sdk_retry_del_con", 0));
        }
    }

    static {
        Covode.recordClassIndex(20036);
    }
}
