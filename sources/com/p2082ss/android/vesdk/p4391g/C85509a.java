package com.p2082ss.android.vesdk.p4391g;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.vesdk.g.a */
public final class C85509a {

    /* renamed from: a */
    private Map<String, String> f191543a = new HashMap();

    /* renamed from: b */
    private StringBuilder f191544b = new StringBuilder();

    /* renamed from: c */
    private boolean f191545c = true;

    static {
        Covode.recordClassIndex(99665);
    }

    /* renamed from: a */
    public final JSONObject mo131336a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : this.f191543a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C85509a mo131335a(String str, String str2) {
        this.f191543a.put(str, str2);
        m147346b(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C85509a mo131333a(String str, float f) {
        this.f191543a.put(str, String.valueOf(f));
        m147346b(str, String.valueOf(f));
        return this;
    }

    /* renamed from: b */
    private void m147346b(String str, String str2) {
        if (!this.f191545c) {
            this.f191544b.append(",");
        }
        this.f191544b.append("\"");
        this.f191544b.append(str);
        this.f191544b.append("\"");
        this.f191544b.append(":");
        this.f191544b.append("\"");
        this.f191544b.append(str2);
        this.f191544b.append("\"");
        if (this.f191545c) {
            this.f191545c = false;
        }
    }

    /* renamed from: a */
    public final C85509a mo131334a(String str, int i) {
        this.f191543a.put(str, String.valueOf(i));
        m147346b(str, String.valueOf(i));
        return this;
    }
}
