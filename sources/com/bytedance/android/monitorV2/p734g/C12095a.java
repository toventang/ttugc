package com.bytedance.android.monitorV2.p734g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitorV2.g.a */
public final class C12095a {

    /* renamed from: a */
    private Map<String, Map<String, Boolean>> f29027a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13824);
    }

    /* renamed from: a */
    public final void mo19445a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, Boolean> map = this.f29027a.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f29027a.put(str, map);
            }
            map.put(str2, true);
        }
    }

    /* renamed from: b */
    public final boolean mo19446b(String str, String str2) {
        Map<String, Boolean> map;
        Boolean bool;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f29027a.get(str)) == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
