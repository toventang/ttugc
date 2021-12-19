package com.bytedance.sdk.p1665b.p1669d.p1673d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22557b;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1674e.C22580d;
import com.bytedance.sdk.p1665b.p1675e.C22583a;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.d.d.e */
public final class C22574e implements AbstractC22557b {
    static {
        Covode.recordClassIndex(26390);
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22557b
    /* renamed from: a */
    public final void mo36844a(String str, AbstractC22558a<C22530b> aVar) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("mccmnc", str);
        String a = C22584a.m42606a("/oversea/carrier_flow/query_free_id/");
        if (!TextUtils.isEmpty(a)) {
            C225751 r1 = new AbstractC22566b<C22530b>(a, treeMap, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22574e.C225751 */

                static {
                    Covode.recordClassIndex(26391);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22566b
                /* renamed from: a */
                public final /* synthetic */ C22530b mo36847a(JSONObject jSONObject) {
                    String optString = jSONObject.optString("data");
                    if (optString == null) {
                        return null;
                    }
                    C22539a.m42533a("get free flow id result:".concat(String.valueOf(optString)));
                    C22530b a = C22530b.m42502a(optString);
                    C22583a.m42598a().mo36863a(optString);
                    return a;
                }
            };
            r1.f53354i = false;
            C22580d.m42594a().mo36861a(r1);
        }
    }
}
