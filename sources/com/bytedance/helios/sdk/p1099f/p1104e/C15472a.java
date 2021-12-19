package com.bytedance.helios.sdk.p1099f.p1104e;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.api.config.ControlConfig;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1099f.AbstractC15436a;
import com.bytedance.helios.sdk.utils.C15481c;
import com.bytedance.helios.sdk.utils.C15482d;
import com.bytedance.helios.sdk.utils.C15484f;
import com.bytedance.helios.sdk.utils.C15487h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.f.e.a */
public final class C15472a implements AbstractC15436a {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, RuleInfo> f37707a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static String f37708b = "";

    /* renamed from: c */
    public static final Map<String, RuleInfo> f37709c;

    /* renamed from: d */
    public static final C15472a f37710d = new C15472a();

    /* renamed from: e */
    private static final List<Integer> f37711e;

    /* renamed from: f */
    private static final List<Integer> f37712f;

    /* renamed from: g */
    private static final List<Integer> f37713g;

    private C15472a() {
    }

    /* renamed from: a */
    private static void m28464a() {
        Context baseContext;
        Application application = HeliosEnvImpl.INSTANCE.getApplication();
        if (!(application == null || (baseContext = application.getBaseContext()) == null || !C15487h.m28504a(baseContext))) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, RuleInfo> entry : f37707a.entrySet()) {
                if (true ^ entry.getValue().getApiIds().isEmpty()) {
                    sb.append(entry.getKey()).append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            C15482d.m28488b("sky_eye_rule_update", sb2);
        }
    }

    static {
        Context baseContext;
        Covode.recordClassIndex(17724);
        Application application = HeliosEnvImpl.INSTANCE.getApplication();
        if (!(application == null || (baseContext = application.getBaseContext()) == null || !C15487h.m28504a(baseContext))) {
            C89219l.m154719c("sky_eye_rule_update", "");
            C15482d.f37729a.erase("sky_eye_rule_update");
        }
        List<Integer> b = C89070n.m154522b(100400, 100100, 100102, 100200, 100203, 100202, 102600);
        f37711e = b;
        List<Integer> b2 = C89070n.m154522b(102000, 101000, 100002, 102001, 101700, 100900, 100909, 101701, 101600, 101601, 101900, 101400, 101500, 100000, 101803, 101309, 101304, 102300, 101310, 102500, 102501, 102502, 100013);
        f37712f = b2;
        List<Integer> b3 = C89070n.m154522b(101000, 101100, 100002, 102300, 101700, 100900, 101600, 101601, 101900, 101400, 101500, 100000, 100013, 101309, 101304, 101310);
        f37713g = b3;
        f37709c = C89041ag.m154421a(C89387v.m154943a("app_agreement_scene", new RuleInfo("app_agreement_scene", "manual", C89070n.m154572d((Collection) b, (Iterable) b2))), C89387v.m154943a("guest_mode_scene", new RuleInfo("guest_mode_scene", "manual", b3)));
    }

    @Override // com.bytedance.helios.sdk.p1099f.AbstractC15436a
    /* renamed from: a */
    public final void mo25180a(RuleInfo ruleInfo) {
        C89219l.m154719c(ruleInfo, "");
        ConcurrentHashMap<String, RuleInfo> concurrentHashMap = f37707a;
        concurrentHashMap.put(ruleInfo.getName(), ruleInfo);
        m28464a();
        m28465b(ruleInfo.getName(), true);
        C15484f.m28491a("Helios-Common-Env", "RulesManager.update name=" + ruleInfo.getName() + '\n' + C15481c.m28482a(concurrentHashMap), (String) null, 12);
    }

    /* renamed from: b */
    public static void m28465b(String str, boolean z) {
        List<Integer> apiIds;
        List<Integer> list;
        if (z && f37709c.containsKey(str)) {
            RuleInfo ruleInfo = f37707a.get(str);
            List<ApiInfo> apiInfoList = HeliosEnvImpl.INSTANCE.getApiConfig().getApiInfoList();
            if (!(apiInfoList instanceof Collection) || !apiInfoList.isEmpty()) {
                for (T t : apiInfoList) {
                    List<ControlConfig> monitorConfigs = t.getMonitorConfigs();
                    if (!(monitorConfigs instanceof Collection) || !monitorConfigs.isEmpty()) {
                        Iterator<T> it = monitorConfigs.iterator();
                        while (it.hasNext()) {
                            if (C89361p.m154908a((CharSequence) it.next().getConditionExpression(), (CharSequence) str, false)) {
                                return;
                            }
                        }
                    }
                    List<ControlConfig> blockConfigs = t.getBlockConfigs();
                    if (!(blockConfigs instanceof Collection) || !blockConfigs.isEmpty()) {
                        Iterator<T> it2 = blockConfigs.iterator();
                        while (it2.hasNext()) {
                            if (C89361p.m154908a((CharSequence) it2.next().getConditionExpression(), (CharSequence) str, false)) {
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
            if (C89219l.m154714a((Object) str, (Object) "app_agreement_scene") && C89219l.m154714a(ruleInfo, f37709c.get("app_agreement_scene"))) {
                apiInfoList.add(new ApiInfo(f37711e, null, null, C89070n.m154516a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), null, 22, null));
                apiInfoList.add(new ApiInfo(f37712f, null, null, null, C89070n.m154516a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), 14, null));
            } else if (ruleInfo != null && (apiIds = ruleInfo.getApiIds()) != null && !apiIds.isEmpty()) {
                if (ruleInfo == null || (list = ruleInfo.getApiIds()) == null) {
                    list = C89086z.INSTANCE;
                }
                apiInfoList.add(new ApiInfo(list, null, null, null, C89070n.m154516a(new ControlConfig(null, null, "$".concat(String.valueOf(str)), null, false, false, 59, null)), 14, null));
            }
        }
    }

    @Override // com.bytedance.helios.sdk.p1099f.AbstractC15436a
    /* renamed from: a */
    public final void mo25181a(String str, boolean z) {
        T t;
        C89219l.m154719c(str, "");
        if (z) {
            Iterator<T> it = HeliosEnvImpl.INSTANCE.getRuleInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.getName(), (Object) str)) {
                    break;
                }
            }
            RuleInfo ruleInfo = t;
            if (!(ruleInfo == null && (ruleInfo = f37709c.get(str)) == null)) {
                f37710d.mo25180a(ruleInfo);
            }
        } else {
            f37707a.remove(str);
            m28464a();
        }
        m28465b(str, z);
        C15484f.m28491a("Helios-Common-Env", "RulesManager.update name=" + str + " isEnable=" + z + '\n' + C15481c.m28482a(f37707a), (String) null, 12);
    }
}
