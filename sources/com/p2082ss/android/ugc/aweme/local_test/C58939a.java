package com.p2082ss.android.ugc.aweme.local_test;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;

/* renamed from: com.ss.android.ugc.aweme.local_test.a */
public final class C58939a {

    /* renamed from: a */
    public LocalTestApi f134170a;

    static {
        Covode.recordClassIndex(69259);
    }

    /* renamed from: com.ss.android.ugc.aweme.local_test.a$a */
    public static final class C58940a {

        /* renamed from: a */
        public static final C58939a f134171a = new C58939a((byte) 0);

        static {
            Covode.recordClassIndex(69260);
        }
    }

    /* renamed from: a */
    public static boolean m108263a() {
        if (!m108264b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m108264b() {
        LocalTestApi localTestApi = C58940a.f134171a.f134170a;
        if (localTestApi == null) {
            return true;
        }
        return localTestApi instanceof DefaultLocalTestImpl;
    }

    private C58939a() {
        this.f134170a = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
    }

    /* synthetic */ C58939a(byte b) {
        this();
    }
}
