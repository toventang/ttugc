package com.bytedance.android.livesdk.lynx.p568b;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.lynx.p568b.p569a.C9344a;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxEnv;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.lynx.b.a */
public final class C9342a {

    /* renamed from: a */
    public static final C9342a f22816a = new C9342a();

    /* renamed from: com.bytedance.android.livesdk.lynx.b.a$a */
    public enum EnumC9343a {
        INIT_FAILED("LynxInitFailed"),
        RUNTIME_NOT_FOUND("RuntimeRetrieveFailed"),
        LOAD_FAILED("OnLoadFailed");
        

        /* renamed from: b */
        private final String f22818b;

        public final String getType() {
            return this.f22818b;
        }

        static {
            Covode.recordClassIndex(10847);
        }

        private EnumC9343a(String str) {
            this.f22818b = str;
        }
    }

    private C9342a() {
    }

    static {
        Covode.recordClassIndex(10846);
    }

    /* renamed from: a */
    public static void m17604a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("live_container_type", "lynx");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", System.currentTimeMillis() - j);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("virtual_aid", "99999");
        jSONObject3.put("platform", 3);
        C9344a.f22819a.mo16228a("hybrid_container_init_duration", null, jSONObject, jSONObject2, null, jSONObject3);
    }

    /* renamed from: b */
    public static void m17611b(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9491a("ttlive_lynx_error", 0, map);
    }

    /* renamed from: a */
    public static void m17608a(String str) {
        C89219l.m154721d(str, "");
        C3868c.m9491a("ttlive_lynx_business_type_not_specified", 0, C89041ag.m154412a(C89387v.m154943a("url", str)));
    }

    /* renamed from: a */
    public static void m17609a(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9491a("ttlive_lynx_update_page", 0, map);
    }

    /* renamed from: b */
    public static void m17610b(long j, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9489a(C6542d.m13985b("ttlive_lynx_page_load"), 1, j, map);
    }

    /* renamed from: c */
    public static void m17612c(long j, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9489a("ttlive_lynx_first_screen", 0, j, map);
    }

    /* renamed from: a */
    public static void m17603a(int i, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9491a("ttlive_lynx_offline", i, map);
        Object obj = map.get("path");
        if (!(obj instanceof String)) {
            obj = null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offline", String.valueOf(i));
        jSONObject.put("live_container_type", "lynx");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        jSONObject2.put("platform", 3);
        C9344a.f22819a.mo16228a("template_offline", (String) obj, jSONObject, null, null, jSONObject2);
    }

    /* renamed from: a */
    public static void m17605a(long j, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9489a("ttlive_lynx_page_start", 0, j, map);
    }

    /* renamed from: a */
    public static void m17602a(int i, long j, Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        map.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9489a(C6542d.m13984a("ttlive_lynx_page_load"), i, j, map);
    }

    /* renamed from: a */
    public static void m17607a(EnumC9343a aVar, String str, String str2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C3868c.m9491a("ttlive_lynx_fallback", 1, C89041ag.m154421a(C89387v.m154943a(StringSet.type, aVar.getType()), C89387v.m154943a("error_message", str), C89387v.m154943a("path", str2)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, aVar.getType());
        jSONObject.put("error_message", str);
        jSONObject.put("path", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        C9344a.f22819a.mo16228a("lynx_fallback", str2, null, null, jSONObject, jSONObject2);
    }
}
