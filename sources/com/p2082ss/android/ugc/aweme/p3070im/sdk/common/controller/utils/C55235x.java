package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.x */
public final class C55235x {

    /* renamed from: a */
    public static final Map<String, Bundle> f126323a = new HashMap();

    /* renamed from: b */
    public static final C55235x f126324b = new C55235x();

    private C55235x() {
    }

    static {
        Covode.recordClassIndex(64982);
    }

    /* renamed from: a */
    public static String m101007a(String str, String str2) {
        boolean z;
        Bundle bundle;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str2.length() != 0) {
            Map<String, Bundle> map = f126323a;
            if (map.containsKey(str) && (bundle = map.get(str)) != null) {
                return bundle.getString(str2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m101008a(String str, String str2, String str3) {
        if (str != null && str.length() != 0 && str2.length() != 0 && str3 != null && str3.length() != 0) {
            Map<String, Bundle> map = f126323a;
            if (map.containsKey(str)) {
                Bundle bundle = map.get(str);
                if (bundle != null) {
                    bundle.putString(str2, str3);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(str2, str3);
            map.put(str, bundle2);
        }
    }
}
