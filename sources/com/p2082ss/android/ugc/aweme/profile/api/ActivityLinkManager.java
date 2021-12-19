package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.HashMap;
import java.util.Map;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager */
public final class ActivityLinkManager {

    /* renamed from: a */
    private static Map<String, ActivityLinkResponse> f143994a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager$ActivityLinkApi */
    interface ActivityLinkApi {
        static {
            Covode.recordClassIndex(74718);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/activity/profile_link/")
        AbstractFutureC27655q<ActivityLinkResponse> getLinkInfo();

        @AbstractC89722f(mo144276a = "/aweme/v1/activity/profile_link/")
        AbstractFutureC27655q<ActivityLinkResponse> getLinkInfo(@AbstractC89736t(mo144292a = "sec_uid") String str, @AbstractC89736t(mo144292a = "show_other_banner") boolean z);
    }

    static {
        Covode.recordClassIndex(74717);
    }
}
