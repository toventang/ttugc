package com.p2082ss.android.ugc.aweme.miniapp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.C14044b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.miniapp.a */
public final class C59265a implements ICommonParams {

    /* renamed from: a */
    public String f135477a;

    /* renamed from: b */
    private Context f135478b;

    /* renamed from: c */
    private Map<String, String> f135479c;

    static {
        Covode.recordClassIndex(69631);
    }

    @Override // com.bytedance.crash.ICommonParams
    public final List<String> getPatchInfo() {
        return null;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getSessionId() {
        return this.f135477a;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final long getUserId() {
        try {
            return Long.parseLong(AppLog.getUserId());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.bytedance.crash.ICommonParams
    public final String getDeviceId() {
        if (C14044b.m25518b(this.f135478b)) {
            return AppLog.getServerDeviceId();
        }
        return C34822d.m71158a(this.f135478b, C29866a.f71244a, 0).getString("device_id", "");
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Object> getCommonParams() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C29803q.m60037b(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(this.f135479c);
        if (!hashMap.containsKey("channel")) {
            hashMap.put("channel", C29869d.f71247a);
        }
        if (!hashMap.containsKey("release_build")) {
            hashMap.put("release_build", C29869d.f71252f);
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.ICommonParams
    public final Map<String, Integer> getPluginInfo() {
        try {
            HashMap hashMap = new HashMap();
            IPluginService d = AabPluginServiceImpl.m114069d();
            if (d != null) {
                List<String> a = d.mo28887a();
                if (!a.isEmpty()) {
                    for (String str : a) {
                        hashMap.put(str, 0);
                    }
                }
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }
}
