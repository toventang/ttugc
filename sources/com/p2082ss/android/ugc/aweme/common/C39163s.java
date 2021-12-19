package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.s */
public class C39163s {

    /* renamed from: a */
    private Map f92375a = new HashMap();

    static {
        Covode.recordClassIndex(46786);
    }

    /* renamed from: a */
    public final JSONObject mo67942a() {
        return new JSONObject(this.f92375a);
    }

    /* renamed from: a */
    public final C39163s mo67941a(String str, String str2) {
        this.f92375a.put(str, str2);
        return this;
    }
}
