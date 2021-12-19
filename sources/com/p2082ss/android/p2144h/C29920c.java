package com.p2082ss.android.p2144h;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.h.c */
public final class C29920c {

    /* renamed from: a */
    public String f71394a;

    /* renamed from: b */
    public int f71395b;

    /* renamed from: c */
    public Map<String, Object> f71396c;

    static {
        Covode.recordClassIndex(36331);
    }

    public final String toString() {
        Map<String, Object> map = this.f71396c;
        String str = "";
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                str = str + "[key:" + ((Object) entry.getKey()) + " value: " + entry.getValue() + "]";
            }
        }
        return "event: " + this.f71394a + " send channels: " + this.f71395b + " info: " + str;
    }

    public C29920c(String str, Map<String, Object> map, int i) {
        this.f71394a = str;
        this.f71396c = map;
        this.f71395b = i;
    }
}
