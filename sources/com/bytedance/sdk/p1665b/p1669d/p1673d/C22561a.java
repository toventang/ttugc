package com.bytedance.sdk.p1665b.p1669d.p1673d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1667b.C22528a;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1667b.C22531c;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22557b;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1674e.C22580d;
import com.bytedance.sdk.p1665b.p1675e.C22583a;
import com.bytedance.sdk.p1665b.p1676f.C22584a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.b.d.d.a */
public final class C22561a implements AbstractC22556a {

    /* renamed from: a */
    private AbstractC22557b f53328a = new C22568c();

    /* renamed from: b */
    private AbstractC22557b f53329b = new C22574e();

    static {
        Covode.recordClassIndex(26377);
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a
    /* renamed from: a */
    public final void mo36839a(AbstractC22558a<String> aVar) {
        String a = C22584a.m42606a("/oversea/carrier_flow/settings/");
        if (!TextUtils.isEmpty(a)) {
            C22580d.m42594a().mo36861a(new AbstractC22566b<String>(a, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22561a.C225643 */

                static {
                    Covode.recordClassIndex(26380);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22566b
                /* renamed from: a */
                public final /* synthetic */ String mo36847a(JSONObject jSONObject) {
                    return jSONObject.toString();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a
    /* renamed from: a */
    public final void mo36840a(String str, AbstractC22558a<C22531c> aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("free_flow_id", str);
        String a = C22584a.m42606a("/oversea/carrier_flow/query_flow/");
        if (!TextUtils.isEmpty(a)) {
            C22580d.m42594a().mo36861a(new AbstractC22566b<C22531c>(a, hashMap, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22561a.C225621 */

                static {
                    Covode.recordClassIndex(26378);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22566b
                /* renamed from: a */
                public final /* synthetic */ C22531c mo36847a(JSONObject jSONObject) {
                    String jSONObject2 = jSONObject.toString();
                    C22539a.m42533a("get mobile data result:".concat(String.valueOf(jSONObject2)));
                    C22531c a = C22531c.m42504a(jSONObject2);
                    C22583a a2 = C22583a.m42598a();
                    if (a2.f53362a != null && !TextUtils.isEmpty(jSONObject2)) {
                        a2.f53362a.edit().putString("mobile_status_string", jSONObject2).apply();
                    }
                    return a;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a
    /* renamed from: a */
    public final void mo36843a(boolean z, AbstractC22558a<Boolean> aVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("free_flow_auth", str);
        String a = C22584a.m42606a("/oversea/carrier_flow/free_flow_auth/");
        if (!TextUtils.isEmpty(a)) {
            C22580d.m42594a().mo36861a(new AbstractC22571d<Boolean>(a, hashMap, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22561a.C225654 */

                static {
                    Covode.recordClassIndex(26381);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22571d
                /* renamed from: a */
                public final /* synthetic */ Boolean mo36848a(JSONObject jSONObject) {
                    return true;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a
    /* renamed from: a */
    public final void mo36841a(String str, AbstractC22558a<C22530b> aVar, boolean z) {
        if (!z) {
            AbstractC22557b bVar = this.f53328a;
            if (bVar != null) {
                bVar.mo36844a(str, aVar);
                return;
            }
            return;
        }
        AbstractC22557b bVar2 = this.f53329b;
        if (bVar2 != null) {
            bVar2.mo36844a(str, aVar);
        }
    }

    @Override // com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a
    /* renamed from: a */
    public final void mo36842a(String str, String str2, Map<String, String> map, AbstractC22558a<C22528a> aVar, String str3) {
        HashMap hashMap = new HashMap();
        if (!hashMap.containsKey("in_use_mccmnc")) {
            hashMap.put("in_use_mccmnc", str);
        }
        hashMap.put("all_mccmncs", str2);
        hashMap.put("free_flow_id", str3);
        String a = C22584a.m42606a("/oversea/carrier_flow/data_plans/");
        if (!TextUtils.isEmpty(a)) {
            C22580d.m42594a().mo36861a(new AbstractC22566b<C22528a>(a, hashMap, aVar) {
                /* class com.bytedance.sdk.p1665b.p1669d.p1673d.C22561a.C225632 */

                static {
                    Covode.recordClassIndex(26379);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* access modifiers changed from: package-private */
                @Override // com.bytedance.sdk.p1665b.p1669d.p1673d.AbstractC22566b
                /* renamed from: a */
                public final /* synthetic */ C22528a mo36847a(JSONObject jSONObject) {
                    String jSONArray;
                    JSONArray jSONArray2 = jSONObject.getJSONArray("plans");
                    if (jSONArray2 == null || (jSONArray = jSONArray2.toString()) == null) {
                        return null;
                    }
                    C22539a.m42533a("get data plan info result:".concat(String.valueOf(jSONArray)));
                    C22528a aVar = new C22528a();
                    JSONArray jSONArray3 = new JSONArray(jSONArray);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray3.length(); i++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i);
                        C22528a.C22529a aVar2 = new C22528a.C22529a();
                        aVar2.setPlanId(optJSONObject.optString("plan_id"));
                        aVar2.setTitle(optJSONObject.optString("title"));
                        aVar2.setContent(optJSONObject.optString("content"));
                        aVar2.setIconUrl(optJSONObject.optString("icon"));
                        aVar2.setUrl(optJSONObject.optString("url"));
                        arrayList.add(aVar2);
                    }
                    aVar.f53255a = arrayList;
                    return aVar;
                }
            });
        }
    }
}
