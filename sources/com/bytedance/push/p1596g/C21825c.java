package com.bytedance.push.p1596g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.g.c */
final class C21825c {

    /* renamed from: a */
    static volatile AtomicBoolean f51718a = new AtomicBoolean(false);

    /* renamed from: b */
    public static long f51719b;

    /* renamed from: c */
    private static WeakHandler.IHandler f51720c = new WeakHandler.IHandler() {
        /* class com.bytedance.push.p1596g.C21825c.C218261 */

        static {
            Covode.recordClassIndex(25478);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 2) {
                RunnableC13596e.m24423a(new Runnable() {
                    /* class com.bytedance.push.p1596g.C21825c.RunnableC218272 */

                    static {
                        Covode.recordClassIndex(25479);
                    }

                    public final void run() {
                        C21825c.m40881a(201, System.currentTimeMillis() - C21825c.f51719b);
                    }
                });
            }
        }
    };

    /* renamed from: d */
    private static Handler f51721d;

    static {
        Covode.recordClassIndex(25477);
    }

    /* renamed from: a */
    static Handler m40880a() {
        if (f51721d == null) {
            f51721d = new WeakHandler(Looper.getMainLooper(), f51720c);
        }
        return f51721d;
    }

    /* renamed from: a */
    public static void m40881a(int i, long j) {
        String str;
        if (i != 201) {
            str = "init success";
        } else {
            str = "not invoke start() method/not invoke start() when 30s passed";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        C21830f.m40902a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
        if (i == 0) {
            i = 0;
        }
        C21823a.m40878a("1002", i, str, null);
    }
}
