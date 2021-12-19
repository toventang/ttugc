package com.benchmark.strategy;

import com.benchmark.p117a.C2413a;
import com.benchmark.strategy.nativePort.BTCDataProviderPort;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.benchmark.strategy.a */
public final class C2507a {

    /* renamed from: b */
    public static C2507a f7604b = new C2507a();

    /* renamed from: a */
    public BTCDataProviderPort f7605a = new BTCDataProviderPort();

    /* renamed from: c */
    private ConcurrentHashMap<String, Object> f7606c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(2875);
    }

    private C2507a() {
    }

    /* renamed from: a */
    public final float mo6953a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = this.f7605a.getFloat(0, str, 0.0f);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            jSONObject.put("appid", 0);
            jSONObject.put("request_key", str);
            C2413a.m7259a("bytebench_strategy_get_operation_cost_time", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    /* renamed from: a */
    public final void mo6954a(int i, String str, float f) {
        this.f7605a.storeFloat(i, str, false, f);
    }

    /* renamed from: a */
    public final void mo6955a(int i, String str, boolean z, String str2) {
        this.f7605a.storeString(i, str, z, str2);
    }
}
