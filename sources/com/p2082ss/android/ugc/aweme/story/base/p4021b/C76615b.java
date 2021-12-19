package com.p2082ss.android.ugc.aweme.story.base.p4021b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;

/* renamed from: com.ss.android.ugc.aweme.story.base.b.b */
public final class C76615b {

    /* renamed from: a */
    public static final C76615b f171949a = new C76615b();

    private C76615b() {
    }

    static {
        Covode.recordClassIndex(89601);
    }

    /* renamed from: a */
    public static String m134199a(String str, String str2) {
        if (str == null || str.length() == 0) {
            C73991bj.m130132c("StoryStorageManager:access story work dir before setting session id");
        }
        StringBuilder sb = new StringBuilder("");
        if (C80537hk.m139613a(str)) {
            sb.append(str);
            if (C80537hk.m139613a(str2)) {
                sb.append("/").append(str2);
            }
        }
        C63244g.m114602a().mo73284l().addStoryTempFile(C63244g.m114602a().mo73279g().mo69470c().mo69480f(str));
        return C63244g.m114602a().mo73279g().mo69470c().mo69480f(sb.toString());
    }
}
