package com.bytedance.android.monitor.p709g;

import com.C1764a;
import com.bytedance.android.monitor.p703a.AbstractC11903d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.monitor.g.e */
public class C11935e extends AbstractC11932b implements AbstractC11903d {

    /* renamed from: b */
    private static Map<String, String> f28553b;

    /* renamed from: c */
    private static volatile AbstractC11903d f28554c;

    /* renamed from: a */
    private String f28555a;

    private C11935e() {
    }

    /* renamed from: b */
    public static AbstractC11903d m21050b() {
        MethodCollector.m26663i(10068);
        if (f28554c == null) {
            synchronized (C11935e.class) {
                try {
                    if (f28554c == null) {
                        f28554c = new C11935e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10068);
                    throw th;
                }
            }
        }
        AbstractC11903d dVar = f28554c;
        MethodCollector.m26664o(10068);
        return dVar;
    }

    static {
        Covode.recordClassIndex(13661);
        HashMap hashMap = new HashMap();
        f28553b = hashMap;
        hashMap.put("pv", C1764a.m5928a("tt%s_webview_timing_monitor_pv_service", new Object[]{"live"}));
        f28553b.put("overview", C1764a.m5928a("tt%s_webview_timing_monitor_overview_service", new Object[]{"live"}));
        f28553b.put("performance", C1764a.m5928a("tt%s_webview_timing_monitor_performance_service", new Object[]{"live"}));
        f28553b.put("resource", C1764a.m5928a("tt%s_webview_timing_monitor_resource_service", new Object[]{"live"}));
        f28553b.put("error", C1764a.m5928a("tt%s_webview_timing_monitor_error_service", new Object[]{"live"}));
        f28553b.put("diff", C1764a.m5928a("tt%s_webview_timing_monitor_diff_service", new Object[]{"live"}));
        f28553b.put("custom", C1764a.m5928a("tt%s_webview_timing_monitor_custom_service", new Object[]{"live"}));
        f28553b.put("newcustom", C1764a.m5928a("bd%s_hybrid_monitor_custom_service", new Object[]{"live"}));
    }

    @Override // com.bytedance.android.monitor.p703a.AbstractC11903d
    /* renamed from: b */
    public final String mo19112b(String str) {
        String str2 = f28553b.get(str);
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str2;
    }

    @Override // com.bytedance.android.monitor.p703a.AbstractC11903d
    /* renamed from: a */
    public final void mo19111a(String str) {
        this.f28555a = str;
        f28553b.clear();
        f28553b.put("pv", C1764a.m5928a("tt%s_webview_timing_monitor_pv_service", new Object[]{this.f28555a}));
        f28553b.put("overview", C1764a.m5928a("tt%s_webview_timing_monitor_overview_service", new Object[]{this.f28555a}));
        f28553b.put("performance", C1764a.m5928a("tt%s_webview_timing_monitor_performance_service", new Object[]{this.f28555a}));
        f28553b.put("resource", C1764a.m5928a("tt%s_webview_timing_monitor_resource_service", new Object[]{this.f28555a}));
        f28553b.put("error", C1764a.m5928a("tt%s_webview_timing_monitor_error_service", new Object[]{this.f28555a}));
        f28553b.put("diff", C1764a.m5928a("tt%s_webview_timing_monitor_diff_service", new Object[]{this.f28555a}));
        f28553b.put("custom", C1764a.m5928a("tt%s_webview_timing_monitor_custom_service", new Object[]{this.f28555a}));
        f28553b.put("newcustom", C1764a.m5928a("bd%s_hybrid_monitor_custom_service", new Object[]{this.f28555a}));
    }
}
