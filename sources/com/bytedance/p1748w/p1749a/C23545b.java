package com.bytedance.p1748w.p1749a;

import com.bytedance.apm.p789q.C12584g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.w.a.b */
public class C23545b implements AbstractC22715a {

    /* renamed from: e */
    private static volatile C23545b f55767e;

    /* renamed from: a */
    boolean f55768a = true;

    /* renamed from: b */
    JSONObject f55769b;

    /* renamed from: c */
    JSONObject f55770c;

    /* renamed from: d */
    private boolean f55771d;

    static {
        Covode.recordClassIndex(27643);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
    }

    private C23545b() {
    }

    /* renamed from: a */
    public static C23545b m44281a() {
        MethodCollector.m26663i(8665);
        if (f55767e == null) {
            synchronized (C23545b.class) {
                try {
                    if (f55767e == null) {
                        f55767e = new C23545b();
                        ((IConfigManager) C21520c.m40424a(IConfigManager.class)).registerConfigListener(f55767e);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8665);
                    throw th;
                }
            }
        }
        C23545b bVar = f55767e;
        MethodCollector.m26664o(8665);
        return bVar;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    public final void mo20180a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        boolean optBoolean;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("tracing")) == null) {
            optBoolean = true;
        } else {
            optBoolean = optJSONObject.optBoolean("enable_open", true);
        }
        this.f55768a = optBoolean;
        if (!this.f55771d) {
            this.f55769b = C12584g.m22675a(jSONObject, "tracing", "allow_service_list");
            this.f55770c = C12584g.m22675a(jSONObject, "tracing", "allow_error_list");
            this.f55771d = true;
        }
    }
}
