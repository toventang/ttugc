package com.p2082ss.android.ugc.aweme.p2404bs;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.net.p3499i.C61388g;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bs.c */
public final class C34933c {

    /* renamed from: a */
    public static final C34933c f82419a = new C34933c();

    private C34933c() {
    }

    static {
        Covode.recordClassIndex(41954);
    }

    /* renamed from: a */
    public static void m71322a(Request request, String str, C14612a<?> aVar, C34932b bVar) {
        boolean z;
        C89219l.m154721d(request, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wait_duration", aVar.f35361d - aVar.f35360c);
            jSONObject.put("interceptors_pre_duration", aVar.f35362e - aVar.f35361d);
            jSONObject.put("request_duration", aVar.f35363f - aVar.f35362e);
            jSONObject.put("read_response_duration", aVar.f35365h - aVar.f35363f);
            jSONObject.put("parse_response_duration", bVar.f82412T);
            jSONObject.put("interceptors_after_duration", bVar.f82414V);
            jSONObject.put("api_duration", bVar.f82413U - bVar.f52180g);
            if (aVar.f35367j > 0) {
                jSONObject.put("timing_dns", aVar.f35367j);
            }
            if (aVar.f35368k > 0) {
                jSONObject.put("timing_connect", aVar.f35368k);
            }
            if (aVar.f35369l > 0) {
                jSONObject.put("timing_ssl", aVar.f35369l);
            }
            if (aVar.f35370m > 0) {
                jSONObject.put("timing_send", aVar.f35370m);
            }
            if (aVar.f35374q > 0) {
                jSONObject.put("timing_waiting", aVar.f35374q);
            }
            if (aVar.f35372o > 0) {
                jSONObject.put("timing_receive", aVar.f35372o);
            }
            if (aVar.f35375r > 0) {
                jSONObject.put("timing_total", aVar.f35375r);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (request.tag(C61388g.class) != null) {
                z = true;
            } else {
                z = false;
            }
            JSONObject put = jSONObject2.put("is_create_from_RetrofitFactory", z).put("path", request.getPath());
            JSONObject put2 = new JSONObject().put("host", request.getHost()).put("x-tt-logid", str);
            if (bVar.f82409Q != null) {
                for (Map.Entry<String, Long> entry : bVar.f82409Q.entrySet()) {
                    Long value = entry.getValue();
                    C89219l.m154716b(value, "");
                    jSONObject.put(entry.getKey() + "_duration", value.longValue());
                }
            }
            C12290b.m22066a("api_time_log", put, jSONObject, put2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
