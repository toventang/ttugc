package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58035p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.a.f */
public final class C47811f {

    /* renamed from: a */
    public static final C47811f f110763a = new C47811f();

    private C47811f() {
    }

    static {
        Covode.recordClassIndex(56437);
    }

    /* renamed from: a */
    public static void m90833a(Exception exc) {
        C33743c cVar = new C33743c();
        if (!TextUtils.isEmpty("error")) {
            cVar.mo59976a("msg_type", "error");
        }
        cVar.mo59976a("error_desc", Log.getStackTraceString(exc));
        if (!TextUtils.isEmpty(null)) {
            cVar.mo59976a("tag", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            cVar.mo59976a("channel_name", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            cVar.mo59976a("module_name", (String) null);
        }
        C89219l.m154716b(cVar, "");
        if (!cVar.f79941a.isEmpty()) {
            C33830n.m70668a("aweme_rn_log", cVar.mo59977a());
            if (TextUtils.equals("error", "error")) {
                C51423a.m95790a((Throwable) new C58035p(exc));
                C13468b.m24211a(exc, "aweme_rn_log");
            }
        }
    }
}
