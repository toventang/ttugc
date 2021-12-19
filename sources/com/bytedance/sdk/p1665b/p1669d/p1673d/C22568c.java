package com.bytedance.sdk.p1665b.p1669d.p1673d;

import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22557b;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22571d;
import com.bytedance.sdk.p1665b.p1669d.p1674e.C22580d;
import com.bytedance.sdk.p1665b.p1675e.C22583a;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.d.d.c */
public final class C22568c implements AbstractC22557b {
    static {
        Covode.recordClassIndex(26384);
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22557b
    /* renamed from: a */
    public final void mo36844a(String str, AbstractC22558a<C22530b> aVar) {
        final String str2;
        final String str3;
        final String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("apiKey", "D95CZC3v2x8yCXXQAcZDVbdHTNgk8596wnVDdgJmJVfu3Y2FsavdM2scyWqsQ2DMqdARu8GGm9anvvB7");
        hashMap.put("appInBackground", "0");
        hashMap.put("userIsOnline", "0");
        final String b = C22584a.m42610b(str);
        if (str.equals("72430") || str.equals("72431")) {
            str2 = "http://api.oston.io/keepon/user?mccmnc=".concat(String.valueOf(str));
            str4 = "api.keepon.media";
            str3 = "/api/user";
        } else {
            str2 = "http://api.keepon.media/api/user?mccmnc=".concat(String.valueOf(str));
            str4 = "api.oston.io";
            str3 = "/keepon/user";
        }
        if (!TextUtils.isEmpty(str2)) {
            C225691 r1 = new AbstractC22571d<C22530b>(str2, hashMap, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22568c.C225691 */

                static {
                    Covode.recordClassIndex(26385);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22571d
                /* renamed from: a */
                public final /* synthetic */ C22530b mo36848a(JSONObject jSONObject) {
                    String jSONObject2 = jSONObject.toString();
                    if (jSONObject2 == null) {
                        return null;
                    }
                    C22539a.m42533a("get free flow id result:".concat(String.valueOf(jSONObject2)));
                    C22530b a = C22530b.m42502a(jSONObject2);
                    C22583a.m42598a().mo36863a(jSONObject2);
                    return a;
                }
            };
            r1.f53354i = false;
            r1.f53345c = new AbstractC22571d.AbstractC22573a() {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22568c.C225702 */

                static {
                    Covode.recordClassIndex(26386);
                }

                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22571d.AbstractC22573a
                /* renamed from: a */
                public final void mo36850a(int i, int i2, String str) {
                    C12290b.m22066a("bdugfs_free_flow_id_rate", C22584a.m42608a(i, b, str4, str3, str2, i2), (JSONObject) null, C22584a.m42611c(str));
                }
            };
            C22580d.m42594a().mo36861a(r1);
        }
    }
}
