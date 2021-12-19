package com.p2082ss.android.ugc.aweme.deeplink.actions;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.launcher.service.mob.C58081a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.actions.FeedAction */
public final class FeedAction extends AbstractC41008b<C89391z> {
    static {
        Covode.recordClassIndex(48870);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final ArrayList<Integer> getFlags() {
        return C89070n.m154525d(67108864, 268435456);
    }

    @Override // com.p2082ss.android.ugc.aweme.deeplink.actions.p2732a.AbstractC41008b
    public final C89378p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        boolean z;
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("is_from_notification");
        if (queryParameter != null) {
            Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type kotlin.Boolean");
            z = ((Boolean) queryParameter).booleanValue();
        } else {
            z = false;
        }
        String queryParameter2 = parse.getQueryParameter("tab");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        C89219l.m154716b(queryParameter2, "");
        try {
            int parseInt = Integer.parseInt(queryParameter2);
            hashMap2.put("tab", Integer.valueOf(parseInt));
            if (parseInt == 1) {
                C58081a.f132324a.mo60040a("homepage_hot", parse, z);
            } else if (parseInt == 2) {
                C58081a.f132324a.mo60040a("homepage_fresh", parse, z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        hashMap2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return C51648a.f118980a.mo87302a(str, new C89378p<>("aweme://main", hashMap2));
    }
}
