package com.p2082ss.android.ugc.aweme.qrcode;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;

/* renamed from: com.ss.android.ugc.aweme.qrcode.l */
public final class C66417l {

    /* renamed from: a */
    private Boolean f149321a;

    static {
        Covode.recordClassIndex(77949);
    }

    private C66417l() {
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.l$a */
    public static class C66418a {

        /* renamed from: a */
        public static C66417l f149322a = new C66417l((byte) 0);

        static {
            Covode.recordClassIndex(77950);
        }
    }

    /* renamed from: a */
    public final Boolean mo105336a() {
        if (this.f149321a == null) {
            this.f149321a = Boolean.valueOf(C36145b.m73641b().mo63270b(C17867d.m33078a(), "enable_home_scan_qrcode", false));
        }
        return this.f149321a;
    }

    /* synthetic */ C66417l(byte b) {
        this();
    }
}
