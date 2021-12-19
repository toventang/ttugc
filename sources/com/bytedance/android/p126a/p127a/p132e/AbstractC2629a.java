package com.bytedance.android.p126a.p127a.p132e;

import com.bytedance.android.p126a.p127a.AbstractC2636g;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.e.a */
public abstract class AbstractC2629a implements AbstractC2630b {

    /* renamed from: a */
    private static AbstractC2630b f7914a;

    /* renamed from: b */
    private static volatile int f7915b;

    static {
        Covode.recordClassIndex(3017);
    }

    /* renamed from: a */
    private static AbstractC2630b m7618a() {
        if (f7914a == null) {
            mo7173b();
        }
        return f7914a;
    }

    /* renamed from: b */
    private static synchronized void mo7173b() {
        synchronized (AbstractC2629a.class) {
            if (f7914a == null) {
                if (f7915b < 3) {
                    AbstractC2636g gVar = C2628e.m7607d().f7912i;
                    if (gVar != null) {
                        C2633a aVar = C2628e.m7607d().f7906c;
                        if (aVar != null && aVar.f7923f) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (C2628e.m7607d().f7911h != null) {
                                    try {
                                        jSONObject.putOpt("device_id", "");
                                        jSONObject.putOpt("channel", "");
                                        jSONObject.putOpt("app_version", "1.6.0-i18n");
                                        jSONObject.putOpt("update_version_code", "");
                                    } catch (Throwable unused) {
                                    }
                                }
                                C2628e.m7607d();
                                f7914a = gVar.mo7155a();
                                f7915b++;
                            } catch (Throwable unused2) {
                                f7915b++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    protected static JSONObject m7619b(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cost", j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7150a(String str, long j, JSONObject jSONObject) {
        mo7151a(str, m7619b(j), jSONObject);
    }

    @Override // com.bytedance.android.p126a.p127a.p132e.AbstractC2630b
    /* renamed from: a */
    public final void mo7148a(String str, int i, JSONObject jSONObject) {
        AbstractC2630b a = m7618a();
        if (a != null) {
            try {
                a.mo7148a(str, i, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.android.p126a.p127a.p132e.AbstractC2630b
    /* renamed from: a */
    public final void mo7151a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        AbstractC2630b a = m7618a();
        if (a != null) {
            try {
                a.mo7151a(str, jSONObject, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.android.p126a.p127a.p132e.AbstractC2630b
    /* renamed from: a */
    public final void mo7149a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        AbstractC2630b a = m7618a();
        if (a != null) {
            try {
                a.mo7149a(str, i, jSONObject, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
