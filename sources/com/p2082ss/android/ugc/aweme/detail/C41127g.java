package com.p2082ss.android.ugc.aweme.detail;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.detail.g */
public final class C41127g {
    static {
        Covode.recordClassIndex(49010);
    }

    /* renamed from: b */
    public static boolean m82828b(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_chat", str) || TextUtils.equals("from_launch_forward", str) || TextUtils.equals("from_forward_push", str) || TextUtils.equals("from_familiar_tab", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m82827a(String str) {
        if (TextUtils.equals("from_follow_page", str) || TextUtils.equals("from_search_mix", str) || TextUtils.equals("from_special_topic", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_search_compilation", str) || TextUtils.equals("from_search_ad_no_request", str) || TextUtils.equals("from_mix_video", str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("from_search", str)) {
            return true;
        }
        return false;
    }
}
