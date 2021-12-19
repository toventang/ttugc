package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ax.a.d */
public abstract class AbstractC34321d implements AbstractC34348t {

    /* renamed from: a */
    private final Map<String, String> f81174a;

    static {
        Covode.recordClassIndex(41265);
    }

    /* renamed from: a */
    public final JSONObject mo60765a() {
        Map<String, String> map = this.f81174a;
        if (map == null || map.isEmpty()) {
            return new JSONObject();
        }
        return new JSONObject(this.f81174a);
    }

    public AbstractC34321d(Map<String, String> map) {
        this.f81174a = map;
    }
}
