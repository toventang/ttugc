package com.p2082ss.android.ugc.aweme.miniapp.abtest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask;

/* renamed from: com.ss.android.ugc.aweme.miniapp.abtest.a */
public final class C59269a {

    /* renamed from: a */
    public static final C59269a f135486a = new C59269a();

    /* renamed from: b */
    private static boolean f135487b;

    private C59269a() {
    }

    static {
        Covode.recordClassIndex(69636);
    }

    /* renamed from: a */
    static void m108976a(EnumC58151ae aeVar) {
        if (!f135487b) {
            C58221f.m105153e().mo95704a(new MiniAppInitTask(aeVar)).mo95706a();
            f135487b = true;
        }
    }
}
