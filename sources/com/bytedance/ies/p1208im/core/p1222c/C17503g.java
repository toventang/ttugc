package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.g */
public final class C17503g {

    /* renamed from: a */
    public static final C17503g f41893a = new C17503g();

    /* renamed from: b */
    private static final AbstractC89244h f41894b = C89250i.m154773a((AbstractC89171a) C17504a.f41895a);

    /* renamed from: a */
    public static boolean m32484a() {
        return ((Boolean) f41894b.getValue()).booleanValue();
    }

    private C17503g() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.g$a */
    static final class C17504a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17504a f41895a = new C17504a();

        static {
            Covode.recordClassIndex(19993);
        }

        C17504a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (SettingsManager.m29616a().mo25394a("iic_local_x_tt_token", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(19992);
    }
}
