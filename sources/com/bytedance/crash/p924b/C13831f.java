package com.bytedance.crash.p924b;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.p924b.AbstractC13829e;
import com.bytedance.crash.runtime.C13994b;
import com.bytedance.crash.util.C14062n;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.b.f */
public final class C13831f {

    /* renamed from: a */
    final C13828d f33661a = new C13828d();

    /* renamed from: b */
    public HashMap<String, String> f33662b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, String> f33663c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, Long> f33664d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Float> f33665e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, String> f33666f = new HashMap<>();

    /* renamed from: g */
    AbstractC13829e.AbstractC13830a f33667g = new AbstractC13829e.AbstractC13830a() {
        /* class com.bytedance.crash.p924b.C13831f.C138321 */

        static {
            Covode.recordClassIndex(15889);
        }

        @Override // com.bytedance.crash.p924b.AbstractC13829e.AbstractC13830a
        /* renamed from: a */
        public final void mo22281a(String str, String str2) {
            C13831f.this.f33662b.put(str, str2);
        }

        @Override // com.bytedance.crash.p924b.AbstractC13829e.AbstractC13830a
        /* renamed from: a */
        public final void mo22280a(String str, float f) {
            C13831f.this.f33665e.put(str, Float.valueOf(f));
        }
    };

    /* renamed from: h */
    final int[] f33668h = {0, 0, 0};

    /* renamed from: i */
    String f33669i = "unknown";

    /* renamed from: j */
    String f33670j = "unknown";

    /* renamed from: k */
    String f33671k = "unknown";

    /* renamed from: l */
    private List<Pattern> f33672l;

    static {
        Covode.recordClassIndex(15888);
    }

    C13831f() {
    }

    /* renamed from: a */
    public final void mo22282a(String str) {
        this.f33667g.mo22281a("anr_reason", str);
    }

    /* renamed from: b */
    public final void mo22285b(String str) {
        this.f33667g.mo22281a("anr_tag", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22287c(String str) {
        this.f33661a.f33641g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22284a(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f33662b.entrySet()) {
            C14062n.m25593a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22286b(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f33663c.entrySet()) {
            C14062n.m25593a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22289d(JSONObject jSONObject) {
        for (Map.Entry<String, String> entry : this.f33666f.entrySet()) {
            C14062n.m25593a(jSONObject, entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22288c(JSONObject jSONObject) {
        for (Map.Entry<String, Long> entry : this.f33664d.entrySet()) {
            C14062n.m25593a(jSONObject, entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Float> entry2 : this.f33665e.entrySet()) {
            C14062n.m25593a(jSONObject, entry2.getKey(), entry2.getValue());
        }
    }

    /* renamed from: d */
    private boolean m24975d(String str) {
        String str2;
        if (this.f33672l == null) {
            JSONArray a = C14062n.m25592a(C13994b.m25330a(), "custom_event_settings", "npth_simple_setting", "max_utm_thread_ignore");
            if (a != null) {
                this.f33672l = new LinkedList();
                str2 = a.optString(0);
                for (int i = 1; i < a.length(); i++) {
                    try {
                        this.f33672l.add(Pattern.compile(a.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            } else {
                str2 = "npth_inner_default";
            }
            if (this.f33672l == null) {
                LinkedList linkedList = new LinkedList();
                this.f33672l = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f33672l.add(Pattern.compile("^default_npth_thread$"));
                this.f33672l.add(Pattern.compile("^RenderThread$"));
                this.f33672l.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
            this.f33667g.mo22281a("max_utm_thread_version", str2);
        }
        for (Pattern pattern : this.f33672l) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo22283a(String str, String str2, int i, int i2, int i3, long j, long j2, long j3) {
        if (!m24975d(str2)) {
            int[] iArr = this.f33668h;
            if (i > iArr[0]) {
                iArr[0] = i;
                this.f33669i = str2;
            }
            if (i2 > iArr[1]) {
                iArr[1] = i2;
                this.f33670j = str2;
            }
            int i4 = i + i2;
            if (i4 > iArr[2]) {
                iArr[2] = i4;
                this.f33671k = str2;
            }
        }
        this.f33661a.mo22273a(str2, Integer.valueOf(str).intValue(), i + i2, i3, j, j2, j3);
    }
}
