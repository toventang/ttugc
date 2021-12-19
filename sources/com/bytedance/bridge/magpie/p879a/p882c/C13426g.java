package com.bytedance.bridge.magpie.p879a.p882c;

import com.bytedance.bridge.magpie.p879a.AbstractC13408b;
import com.bytedance.covode.number.Covode;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.bridge.magpie.a.c.g */
public final class C13426g extends AbstractC13418a {
    static {
        Covode.recordClassIndex(15426);
    }

    /* renamed from: c */
    private final JSONObject m24139c() {
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC13408b a = mo21643a();
            if (a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("aid", 1180);
                jSONObject2.put("app_version", a.mo21638e());
                jSONObject2.put("os", 0);
                jSONObject2.put("device_id", a.mo21639f());
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("channel", "_jsb_auth");
                jSONObject3.put("local_version", 0);
                jSONArray.put(jSONObject3);
                for (String str : a.mo21640g()) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("channel", "_jsb_auth.".concat(String.valueOf(str)));
                    jSONObject4.put("local_version", 0);
                    jSONArray.put(jSONObject4);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(a.mo21636c(), jSONArray);
                jSONObject.put("common", jSONObject2);
                jSONObject.put("deployment", jSONObject5);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.bridge.magpie.p879a.p882c.AbstractC13418a
    /* renamed from: b */
    public final JSONObject mo21645b() {
        String str;
        JSONObject jSONObject;
        String str2;
        boolean z;
        String str3;
        Iterator<String> it;
        AbstractC13408b a = mo21643a();
        if (a != null) {
            String d = a.mo21637d();
            String jSONObject2 = m24139c().toString();
            C89219l.m154709a((Object) jSONObject2, "");
            AbstractC13408b a2 = mo21643a();
            if (a2 != null) {
                Charset charset = C89338d.f202990a;
                if (jSONObject2 != null) {
                    byte[] bytes = jSONObject2.getBytes(charset);
                    C89219l.m154709a((Object) bytes, "");
                    str = a2.mo21633a(d, "application/json", bytes);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                str = null;
            }
            if (str != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject(str);
                    if (jSONObject3.optInt("status") == 0) {
                        jSONObject = jSONObject3.optJSONObject("data");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        AbstractC13408b a3 = mo21643a();
                        if (a3 != null) {
                            str2 = a3.mo21632a().mo21622a("com.bytedance.bridge.magpie.permission.permission_config_response");
                        } else {
                            str2 = null;
                        }
                        if (str2 == null || C89361p.m154870a((CharSequence) str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str3 = jSONObject.toString();
                        } else {
                            JSONObject jSONObject4 = new JSONObject(str2);
                            JSONObject optJSONObject = jSONObject4.optJSONObject("packages");
                            if (optJSONObject == null) {
                                str3 = jSONObject.toString();
                            } else {
                                JSONObject optJSONObject2 = jSONObject.optJSONObject("packages");
                                if (optJSONObject2 != null) {
                                    it = optJSONObject2.keys();
                                } else {
                                    it = null;
                                }
                                while (it != null && it.hasNext()) {
                                    String next = it.next();
                                    optJSONObject.put(next, optJSONObject2.getJSONArray(next));
                                }
                                str3 = jSONObject4.toString();
                                C89219l.m154709a((Object) str3, "");
                            }
                        }
                        AbstractC13408b a4 = mo21643a();
                        if (a4 != null) {
                            a4.mo21632a().mo21623a("com.bytedance.bridge.magpie.permission.permission_config_response", str3);
                        }
                    }
                    return jSONObject3;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
