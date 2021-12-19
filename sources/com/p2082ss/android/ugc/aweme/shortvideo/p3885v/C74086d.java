package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.d */
public final class C74086d extends Throwable {
    static {
        Covode.recordClassIndex(86838);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_publisher_ChildrenModeException_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m130276xaf1e7fd5(String str, String str2) {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74086d(String str) {
        super("ChildrenModeNotAllowPublish");
        C89219l.m154721d(str, "");
        m130276xaf1e7fd5("aweme-publish", "block publish process in stage: " + str + ", reason: child mode publish not allowed.");
    }
}
