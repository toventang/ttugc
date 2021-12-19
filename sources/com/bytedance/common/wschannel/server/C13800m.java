package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.server.m */
public class C13800m implements AbstractC13785e {

    /* renamed from: a */
    private static final String f33562a = C13800m.class.getSimpleName();

    /* renamed from: b */
    private final Context f33563b;

    static {
        Covode.recordClassIndex(15848);
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13785e
    /* renamed from: a */
    public final Map<Integer, IWsApp> mo22198a() {
        JSONArray jSONArray;
        int length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String a = C13758l.m24811a(this.f33563b).f33414a.mo21918a("ws_apps", "");
            if (TextUtils.isEmpty(a) || (length = (jSONArray = new JSONArray(a)).length()) <= 0) {
                return linkedHashMap;
            }
            for (int i = 0; i < length; i++) {
                SsWsApp a2 = SsWsApp.C13765a.m24827a(jSONArray.optJSONObject(i));
                if (m24908a(a2)) {
                    linkedHashMap.put(Integer.valueOf(WsChannelService.m24833a(a2)), a2);
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    C13800m(Context context) {
        this.f33563b = context;
    }

    /* renamed from: a */
    private static boolean m24908a(IWsApp iWsApp) {
        if (iWsApp != null && iWsApp.mo21927a() > 0 && iWsApp.mo21928b() > 0 && !C13627m.m24498a(iWsApp.mo21934h()) && iWsApp.mo21931e() > 0 && !iWsApp.mo21937k().isEmpty() && !C13627m.m24498a(iWsApp.mo21929c()) && iWsApp.mo21935i() > 0 && !C13627m.m24498a(iWsApp.mo21930d()) && iWsApp.mo21932f() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13785e
    /* renamed from: a */
    public final void mo22199a(Map<Integer, IWsApp> map) {
        MethodCollector.m26663i(9488);
        if (map == null) {
            MethodCollector.m26664o(9488);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (WsChannelService.class) {
            try {
                for (Map.Entry<Integer, IWsApp> entry : map.entrySet()) {
                    try {
                        if (m24908a(entry.getValue())) {
                            jSONArray.put(entry.getValue().mo21933g());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(9488);
                throw th;
            }
        }
        try {
            C13758l a = C13758l.m24811a(this.f33563b);
            String jSONArray2 = jSONArray.toString();
            WsChannelMultiProcessSharedProvider.C13640a a2 = a.f33414a.mo21917a();
            a2.f33144b.put("ws_apps", jSONArray2);
            a2.mo21915a();
            MethodCollector.m26664o(9488);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.m26664o(9488);
        }
    }
}
