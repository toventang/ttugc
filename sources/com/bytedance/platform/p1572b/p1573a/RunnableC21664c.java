package com.bytedance.platform.p1572b.p1573a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1572b.AbstractC21667c;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.platform.b.a.c */
public final class RunnableC21664c implements Runnable {

    /* renamed from: a */
    private Runnable f51418a;

    /* renamed from: b */
    private ThreadPoolExecutor f51419b;

    static {
        Covode.recordClassIndex(25305);
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolName", ((AbstractC21667c) this.f51419b).mo35329a());
            jSONObject.put("poolInfo", this.f51419b.toString());
            jSONObject.put("task", this.f51418a.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public RunnableC21664c(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        this.f51418a = runnable;
        this.f51419b = threadPoolExecutor;
    }
}
