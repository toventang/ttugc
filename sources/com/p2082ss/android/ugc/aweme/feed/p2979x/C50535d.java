package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.deviceregister.C29892d;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.d */
public final class C50535d {

    /* renamed from: a */
    public static final C50535d f116803a = new C50535d();

    private C50535d() {
    }

    static {
        Covode.recordClassIndex(59682);
    }

    /* renamed from: a */
    public static String m94738a(Context context) {
        if (!TextUtils.isEmpty(C58029j.f132249a) && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132249a;
        }
        String a = C13624l.m24481a(C13624l.m24479a(context));
        C58029j.f132249a = a;
        return a;
    }

    /* renamed from: a */
    public static final HashMap<String, String> m94740a(String str, String str2, HashMap<String, String> hashMap) {
        C89219l.m154721d(hashMap, "");
        if (str2 != null) {
            hashMap.put("previous_page", str2);
        }
        if (str != null) {
            hashMap.put("enter_from", str);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final HashMap<String, String> m94739a(Context context, String str, String str2, String str3, HashMap<String, String> hashMap) {
        Object obj;
        C89219l.m154721d(context, "");
        C89219l.m154721d(hashMap, "");
        if (str2 != null) {
            hashMap.put("ad_id", str2);
        }
        if (str3 != null) {
            hashMap.put("creative_id", str3);
        }
        if (str != null) {
            hashMap.put("log_extra", str);
        }
        hashMap.put("user_agent", RawURLGetter.m77316a("other"));
        hashMap.put("access", m94738a(context));
        hashMap.put("package", context.getPackageName());
        Pair<String, Boolean> a = C29892d.m60259a(context);
        if (!(a == null || (obj = a.first) == null)) {
            hashMap.put("google_aid", obj);
        }
        return hashMap;
    }
}
