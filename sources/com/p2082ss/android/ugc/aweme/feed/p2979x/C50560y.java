package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.x.y */
public final class C50560y {

    /* renamed from: a */
    public static final C50560y f116850a = new C50560y();

    private C50560y() {
    }

    static {
        Covode.recordClassIndex(59707);
    }

    /* renamed from: a */
    public static final String m94791a(String str, String str2) {
        if (TextUtils.equals("homepage_hot", str) || TextUtils.equals("homepage_follow", str)) {
            return str2;
        }
        return "";
    }

    /* renamed from: b */
    public static final Map<String, String> m94792b(String str, String str2) {
        HashMap hashMap = new HashMap();
        String a = m94791a(str, str2);
        if (a != null) {
            hashMap.put("from_group_id", a);
        }
        return hashMap;
    }
}
