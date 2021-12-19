package com.p2082ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ak */
public final class C48316ak {

    /* renamed from: a */
    public static long f111965a;

    /* renamed from: b */
    public static final C48316ak f111966b = new C48316ak();

    private C48316ak() {
    }

    static {
        Covode.recordClassIndex(57058);
    }

    /* renamed from: a */
    public static final void m91753a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C33744d dVar = new C33744d();
        dVar.mo59983a("action_type", str);
        if (TextUtils.equals(str, "show")) {
            f111965a = System.currentTimeMillis();
            dVar.mo59980a("duration", 0);
        } else {
            dVar.mo59981a("duration", System.currentTimeMillis() - f111965a);
        }
        if (TextUtils.equals(str, "exit")) {
            dVar.mo59983a("exit_method", str2);
        }
        C39162r.m79460a("story_cold_start_notification", dVar.f79943a);
    }
}
