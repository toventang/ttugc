package com.bytedance.apm.p773f.p774a;

import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p831i.p832a.C13099c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.c */
public final class C12457c {
    static {
        Covode.recordClassIndex(14267);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm.f.a.c$a */
    public static class C12459a {

        /* renamed from: a */
        public long f30256a;

        /* renamed from: b */
        public long f30257b;

        /* renamed from: c */
        public String f30258c;

        /* renamed from: d */
        public String f30259d;

        /* renamed from: e */
        public String f30260e;

        /* renamed from: f */
        public String f30261f;

        static {
            Covode.recordClassIndex(14269);
        }

        C12459a() {
        }

        public final String toString() {
            return "LockItemInfo{duration=" + this.f30256a + ", startTime=" + this.f30257b + ", blockStackInfo='" + this.f30258c + '\'' + ", completeBlockStackInfo='" + this.f30259d + '\'' + ", ownerStackInfo='" + this.f30260e + '\'' + ", ownerThreadName='" + this.f30261f + '\'' + '}';
        }
    }

    /* renamed from: a */
    public static JSONObject m22423a(C12459a aVar, String str, String str2) {
        boolean z = false;
        if (!aVar.f30258c.isEmpty() && aVar.f30256a >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", aVar.f30257b);
            jSONObject.put("crash_time", aVar.f30257b);
            jSONObject.put("is_main_process", C12397c.m22285b());
            jSONObject.put("process_name", C12397c.m22278a());
            jSONObject.put("block_duration", aVar.f30256a);
            jSONObject.put("raw_dump_info", str);
            StringBuilder sb = new StringBuilder("LockInfo:\n");
            sb.append("-Lock Time ").append(aVar.f30256a).append("ms\n-Block Stack \nat ").append(aVar.f30258c).append("\n");
            if (!aVar.f30259d.isEmpty()) {
                sb.append(aVar.f30259d.replace("\t", "")).append("\n");
            }
            sb.append("-Owner Thread: ").append(aVar.f30261f).append("\n");
            if (aVar.f30260e != null && !aVar.f30260e.isEmpty()) {
                sb.append("-Owner Stack: \n-at ").append(aVar.f30260e).append("\n");
            }
            jSONObject.put("stack", sb.toString());
            jSONObject.put("event_type", "lag");
            JSONObject c = C13099c.m23558a().mo20939c();
            c.put("block_stack_type", "stack");
            c.put(str2, "true");
            jSONObject.put("filters", c);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
