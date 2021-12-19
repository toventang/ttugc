package com.p2082ss.android.ugc.aweme.publish.p3624h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65680m;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.l */
final class C65661l implements AbstractC65680m {
    static {
        Covode.recordClassIndex(77152);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65680m
    /* renamed from: a */
    public final void mo104829a(Context context, String str) {
        C89219l.m154721d(context, "");
        if (!C68747m.m121180a()) {
            if (str == null || str.length() == 0) {
                str = "unknown";
            }
            C39162r.m79460a("publish_service_cancel", new C84425b().mo129406a("invoke_type", "cancelSynthetise").mo129406a("scene", str).f188764a);
            C67296h.m119244d();
        }
    }
}
