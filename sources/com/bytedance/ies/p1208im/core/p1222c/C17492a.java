package com.bytedance.ies.p1208im.core.p1222c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.im.core.c.a */
public final class C17492a {

    /* renamed from: a */
    public static final boolean f41870a = true;

    /* renamed from: b */
    public static final C17492a f41871b = new C17492a();

    /* renamed from: c */
    private static final AbstractC89244h f41872c = C89250i.m154773a((AbstractC89171a) C17493a.f41873a);

    /* renamed from: a */
    public static final boolean m32480a() {
        return ((Boolean) f41872c.getValue()).booleanValue();
    }

    private C17492a() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.a$a */
    static final class C17493a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C17493a f41873a = new C17493a();

        static {
            Covode.recordClassIndex(19982);
        }

        C17493a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.m29616a().mo25400a("async_imsdk_login_and_msg_pull", true));
        }
    }

    static {
        Covode.recordClassIndex(19981);
    }
}
