package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14696f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.h */
public class C14700h extends AbstractC14696f {

    /* renamed from: b */
    private static final String f35725b = C14700h.class.getSimpleName();

    /* renamed from: c */
    private Map<String, String> f35726c = new HashMap();

    static {
        Covode.recordClassIndex(16797);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.AbstractC14696f
    /* renamed from: a */
    public final String mo23699a(Uri uri) {
        String host = uri.getHost();
        String uri2 = uri.toString();
        String str = this.f35726c.get(host);
        if (!TextUtils.isEmpty(str)) {
            return uri2.replaceFirst(host, str);
        }
        return uri2;
    }

    public C14700h(JSONObject jSONObject) {
        super(AbstractC14696f.EnumC14698a.STATIC_DISPATCH_STRATEGY);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    this.f35726c.put(next, optString);
                }
            }
        }
    }
}
