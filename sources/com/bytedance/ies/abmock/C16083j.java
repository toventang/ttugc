package com.bytedance.ies.abmock;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.datacenter.AbstractC16067f;
import com.bytedance.ies.abmock.datacenter.C16065e;
import com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.ies.abmock.datacenter.p1118c.C16059c;
import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.ies.abmock.datacenter.plugin.C16072a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.C28022o;
import java.util.Map;

/* renamed from: com.bytedance.ies.abmock.j */
public class C16083j {

    /* renamed from: e */
    private static volatile C16083j f38732e;

    /* renamed from: a */
    public Application f38733a;

    /* renamed from: b */
    public AbstractC16067f f38734b;

    /* renamed from: c */
    public AbstractC16085l f38735c = new C16084k();

    /* renamed from: d */
    public AbstractC16067f f38736d;

    /* renamed from: f */
    private Boolean f38737f;

    /* renamed from: g */
    private Boolean f38738g;

    static {
        Covode.recordClassIndex(18359);
    }

    /* renamed from: d */
    public final AbstractC16052a mo25539d() {
        return this.f38734b.mo25499c();
    }

    private C16083j() {
    }

    /* renamed from: b */
    public final boolean mo25537b() {
        if (this.f38737f == null) {
            this.f38737f = Boolean.valueOf(this.f38734b.mo25497a());
        }
        return this.f38737f.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo25538c() {
        if (this.f38738g == null) {
            this.f38738g = Boolean.valueOf(this.f38734b.mo25498b());
        }
        return this.f38738g.booleanValue();
    }

    /* renamed from: a */
    public static C16083j m29874a() {
        MethodCollector.m26663i(2694);
        if (f38732e == null) {
            synchronized (C16083j.class) {
                try {
                    if (f38732e == null) {
                        f38732e = new C16083j();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2694);
                    throw th;
                }
            }
        }
        C16083j jVar = f38732e;
        MethodCollector.m26664o(2694);
        return jVar;
    }

    /* renamed from: a */
    public static void m29875a(C28022o oVar) {
        Map<String, ConfigItem> configMap;
        C16059c.f38683b = oVar;
        Map<String, ConfigItem> map = C16075f.f38715a;
        Map<String, ConfigItem> map2 = C16075f.f38716b;
        for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!map2.containsKey(key)) {
                switch (C16059c.C160601.f38684a[entry.getValue().type.ordinal()]) {
                    case 1:
                        C16059c.m29731b(oVar, key);
                        continue;
                    case 2:
                        C16059c.m29730a(oVar, key);
                        continue;
                    case 3:
                        C16059c.m29733d(oVar, key);
                        continue;
                    case 4:
                        C16059c.m29734e(oVar, key);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        C16059c.m29735f(oVar, key);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        C16059c.m29732c(oVar, key);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        C16059c.m29736g(oVar, key);
                        continue;
                    default:
                        C16059c.m29737h(oVar, key);
                        continue;
                }
            }
        }
        Map<BaseConfigPlugin, Boolean> map3 = C16072a.m29859a().f38707a;
        Map<String, ConfigItem> map4 = C16075f.f38715a;
        for (Map.Entry<BaseConfigPlugin, Boolean> entry2 : map3.entrySet()) {
            if (!entry2.getValue().booleanValue() && (configMap = entry2.getKey().getConfigMap()) != null) {
                for (Map.Entry<String, ConfigItem> entry3 : configMap.entrySet()) {
                    String key2 = entry3.getKey();
                    if (map4 == null || !map4.containsKey(key2)) {
                        switch (C16059c.C160601.f38684a[entry3.getValue().type.ordinal()]) {
                            case 1:
                                C16059c.m29731b(oVar, key2);
                                break;
                            case 2:
                                C16059c.m29730a(oVar, key2);
                                break;
                            case 3:
                                C16059c.m29733d(oVar, key2);
                                break;
                            case 4:
                                C16059c.m29734e(oVar, key2);
                                break;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                C16059c.m29735f(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                C16059c.m29732c(oVar, key2);
                                break;
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                C16059c.m29736g(oVar, key2);
                                break;
                            default:
                                C16059c.m29737h(oVar, key2);
                                break;
                        }
                    }
                }
            }
        }
        C16059c.m29729a(oVar);
        try {
            C16059c.f38682a = true;
            C16057a.f38676a.mo25460b("config_center_saved", true);
        } catch (Throwable th) {
            C13468b.m24210a(th);
        }
        C16065e.m29769a().mo25495b();
    }
}
