package com.bytedance.android.livesdk.p425aa;

import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.model.C5820b;
import com.bytedance.android.live.p172a.p173a.p174a.C2911c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.aa.a */
public final class C6497a {

    /* renamed from: f */
    public static final C6498a f16144f = new C6498a((byte) 0);

    /* renamed from: a */
    public final JSONObject f16145a;

    /* renamed from: b */
    public final JSONObject f16146b = new JSONObject();

    /* renamed from: c */
    public boolean f16147c;

    /* renamed from: d */
    public boolean f16148d;

    /* renamed from: e */
    public boolean f16149e;

    /* renamed from: g */
    private int f16150g = -1;

    /* renamed from: h */
    private String f16151h = "";

    /* renamed from: i */
    private String f16152i = "LiveBusinessLog";

    /* renamed from: j */
    private final String f16153j;

    static {
        Covode.recordClassIndex(7233);
    }

    /* renamed from: com.bytedance.android.livesdk.aa.a$a */
    public static final class C6498a {
        static {
            Covode.recordClassIndex(7234);
        }

        private C6498a() {
        }

        public /* synthetic */ C6498a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C6497a m13903a(String str) {
            C89219l.m154721d(str, "");
            return new C6497a(str).mo12623a(-1);
        }

        /* renamed from: b */
        public static C6497a m13904b(String str) {
            C89219l.m154721d(str, "");
            return new C6497a(str).mo12623a(0);
        }

        /* renamed from: c */
        public static C6497a m13905c(String str) {
            C89219l.m154721d(str, "");
            return new C6497a(str).mo12623a(1);
        }
    }

    /* renamed from: a */
    public final void mo12632a() {
        if (this.f16146b.length() > 0 || this.f16147c) {
            this.f16146b.put("page", this.f16151h);
            m13887b();
            this.f16145a.put("slardar", true);
        }
        C3854a.m9453a(3, this.f16152i, this.f16145a.toString());
    }

    /* renamed from: a */
    public final C6497a mo12631a(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (C11279p.m20013a((CharSequence) entry.getKey()) && C11279p.m20013a((CharSequence) entry.getValue())) {
                    this.f16145a.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return this;
    }

    /* renamed from: b */
    private final void m13887b() {
        String str;
        String str2;
        if (this.f16148d || C89361p.m154876c(this.f16153j, "_all", false)) {
            if (C89361p.m154876c(this.f16153j, "_error", false)) {
                str2 = C89361p.m154932f(this.f16153j, "_", "all");
            } else if (!C89361p.m154876c(this.f16153j, "_all", false)) {
                str2 = this.f16153j + "_all";
            } else {
                str2 = this.f16153j;
            }
            C3868c.m9492a(str2, this.f16150g, this.f16146b);
        }
        if (this.f16149e || C89361p.m154876c(this.f16153j, "_error", false)) {
            if (this.f16150g != 0) {
                if (C89361p.m154876c(this.f16153j, "_all", false)) {
                    str = C89361p.m154932f(this.f16153j, "_", "error");
                } else if (!C89361p.m154876c(this.f16153j, "_error", false)) {
                    str = this.f16153j + "_error";
                } else {
                    str = this.f16153j;
                }
                C3868c.m9492a(str, this.f16150g, this.f16146b);
            } else {
                C3854a.m9453a(6, this.f16152i, "slardar error log should not be reported with success status");
            }
        }
        if (!this.f16148d && !this.f16149e && !C89361p.m154876c(this.f16153j, "_all", false) && !C89361p.m154876c(this.f16153j, "_error", false)) {
            C3854a.m9453a(6, this.f16152i, "slardar log's service name " + this.f16153j + " must end with _all or _error, please call all() or error() method before submit");
        }
    }

    /* renamed from: a */
    public final C6497a mo12623a(int i) {
        this.f16150g = i;
        if (i != -1) {
            this.f16145a.put("status", i);
        }
        return this;
    }

    /* renamed from: b */
    public final C6497a mo12633b(String str) {
        C89219l.m154721d(str, "");
        this.f16151h = str;
        this.f16145a.put("page", str);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12624a(String str) {
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str)) {
            this.f16152i = str;
        }
        return this;
    }

    public C6497a(String str) {
        C89219l.m154721d(str, "");
        this.f16153j = str;
        JSONObject jSONObject = new JSONObject();
        this.f16145a = jSONObject;
        jSONObject.put("log_name", str);
    }

    /* renamed from: a */
    public final C6497a mo12630a(Throwable th) {
        C89219l.m154721d(th, "");
        if (th instanceof C5820b) {
            C5820b bVar = (C5820b) th;
            return mo12629a("url", bVar.getUrl()).mo12627a("error_code", Integer.valueOf(bVar.getErrorCode())).mo12629a("error_msg", bVar.getErrorMsg()).mo12629a("error_alert", bVar.getAlert()).mo12629a("error_prompt", bVar.getPrompt());
        } else if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            return mo12627a("error_code", Integer.valueOf(aVar.getErrorCode())).mo12629a("error_msg", aVar.getErrorMsg()).mo12629a("error_alert", aVar.getAlert()).mo12629a("error_prompt", aVar.getPrompt());
        } else if (th instanceof C2911c) {
            return mo12627a("error_code", (Integer) 1).mo12629a("error_msg", th.getMessage());
        } else {
            C3854a.m9458a("LiveBroadcastBusinessLog", th);
            return mo12627a("error_code", (Integer) 1).mo12629a("error_msg", th.getMessage());
        }
    }

    /* renamed from: b */
    public final C6497a mo12634b(String str, Boolean bool) {
        boolean z;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        jSONObject.put(str, z);
        JSONObject jSONObject2 = this.f16146b;
        if (bool != null) {
            z2 = bool.booleanValue();
        }
        jSONObject2.put(str, z2);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12625a(String str, Boolean bool) {
        boolean z;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        jSONObject.put(str, z);
        return this;
    }

    /* renamed from: b */
    public final C6497a mo12635b(String str, Integer num) {
        int i;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
        JSONObject jSONObject2 = this.f16146b;
        if (num != null) {
            i2 = num.intValue();
        }
        jSONObject2.put(str, i2);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12626a(String str, Float f) {
        C89219l.m154721d(str, "");
        if (f == null || Float.isNaN(f.floatValue()) || Float.isInfinite(f.floatValue())) {
            this.f16145a.put(str, Float.valueOf(0.0f));
        } else {
            this.f16145a.put(str, f);
        }
        return this;
    }

    /* renamed from: b */
    public final C6497a mo12636b(String str, Long l) {
        long j;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject.put(str, j);
        JSONObject jSONObject2 = this.f16146b;
        if (l != null) {
            j2 = l.longValue();
        }
        jSONObject2.put(str, j2);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12627a(String str, Integer num) {
        int i;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12628a(String str, Long l) {
        long j;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject.put(str, j);
        return this;
    }

    /* renamed from: b */
    public final C6497a mo12637b(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        jSONObject.put(str, str3);
        JSONObject jSONObject2 = this.f16146b;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C6497a mo12629a(String str, String str2) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = this.f16145a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str, str2);
        return this;
    }
}
