package com.bytedance.platform.p1572b.p1573a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.p1572b.AbstractC21667c;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.platform.b.a.a */
public final class RunnableC21662a implements Runnable {

    /* renamed from: a */
    private Thread f51410a;

    /* renamed from: b */
    private Runnable f51411b;

    /* renamed from: c */
    private ThreadPoolExecutor f51412c;

    static {
        Covode.recordClassIndex(25303);
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poolName", ((AbstractC21667c) this.f51412c).mo35329a());
            jSONObject.put("poolInfo", this.f51412c.toString());
            jSONObject.put("threadName", this.f51410a.getName());
            jSONObject.put("stack", C21663b.m40611a(this.f51410a.getStackTrace()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public RunnableC21662a(ThreadPoolExecutor threadPoolExecutor, Thread thread, Runnable runnable) {
        this.f51412c = threadPoolExecutor;
        this.f51410a = thread;
        this.f51411b = runnable;
    }
}
