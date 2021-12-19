package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.f */
public final class C17501f {

    /* renamed from: a */
    public static final C17501f f41890a = new C17501f();

    /* renamed from: b */
    private static final AbstractC89244h f41891b = C89250i.m154773a((AbstractC89171a) C17502a.f41892a);

    /* renamed from: a */
    public static boolean m32483a() {
        return ((Boolean) f41891b.getValue()).booleanValue();
    }

    private C17501f() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.f$a */
    static final class C17502a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17502a f41892a = new C17502a();

        static {
            Covode.recordClassIndex(19991);
        }

        C17502a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "im_sync_time", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(19990);
    }
}
