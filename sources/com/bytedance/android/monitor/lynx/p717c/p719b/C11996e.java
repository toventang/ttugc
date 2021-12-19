package com.bytedance.android.monitor.lynx.p717c.p719b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitor.lynx.c.b.e */
public final class C11996e {

    /* renamed from: a */
    private Map<String, Map<String, Boolean>> f28742a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13722);
    }

    /* renamed from: a */
    public final void mo19198a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, Boolean> map = this.f28742a.get(str);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.f28742a.put(str, map);
            }
            map.put(str2, true);
        }
    }

    /* renamed from: b */
    public final boolean mo19199b(String str, String str2) {
        Map<String, Boolean> map;
        Boolean bool;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (map = this.f28742a.get(str)) == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
