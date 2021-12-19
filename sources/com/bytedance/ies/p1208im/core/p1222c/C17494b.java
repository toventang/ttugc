package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.b */
public final class C17494b {

    /* renamed from: a */
    public static final int f41874a = 1;

    /* renamed from: b */
    public static final AbstractC89244h f41875b = C89250i.m154773a((AbstractC89171a) C17495a.f41877a);

    /* renamed from: c */
    public static final C17494b f41876c = new C17494b();

    private C17494b() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.b$a */
    static final class C17495a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17495a f41877a = new C17495a();

        static {
            Covode.recordClassIndex(19984);
        }

        C17495a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (C16048b.m29633a().mo25412a(true, "im_replace_sp_with_keva", 1) != C17494b.f41874a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(19983);
    }
}
