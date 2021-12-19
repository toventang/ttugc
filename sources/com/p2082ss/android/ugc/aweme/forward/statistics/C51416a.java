package com.p2082ss.android.ugc.aweme.forward.statistics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.forward.statistics.a */
public final class C51416a {
    static {
        Covode.recordClassIndex(60637);
    }

    /* renamed from: a */
    public static HashMap<String, String> m95776a(String str, Aweme aweme) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        if (aweme != null) {
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("group_id", aweme.getAid());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap<String, String> m95775a(Aweme aweme, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aweme != null && aweme.getAwemeType() == 13) {
            hashMap.put("page_type", str);
            hashMap.put("is_reposted", "1");
            hashMap.put("repost_comment_id", aweme.getForwardCommentId());
            hashMap.put("from_group_id", aweme.getFromGroupId());
            hashMap.put("from_user_id", aweme.getFromUserId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                hashMap.put("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                hashMap.put("forward_user_id", aweme.getForwardUserId());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C33743c m95774a(C33743c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C33743c();
        }
        if (aweme != null && aweme.getAwemeType() == 13) {
            cVar.mo59976a("page_type", str).mo59976a("is_reposted", "1").mo59976a("repost_comment_id", aweme.getForwardCommentId()).mo59976a("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                cVar.mo59976a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                cVar.mo59976a("forward_user_id", aweme.getForwardUserId());
            }
        }
        return cVar;
    }
}
