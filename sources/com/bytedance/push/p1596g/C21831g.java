package com.bytedance.push.p1596g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.C21922f;
import com.p2082ss.android.message.C30061a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.g.g */
public final class C21831g {

    /* renamed from: a */
    static Handler f51724a = new WeakHandler(Looper.getMainLooper(), f51726c);

    /* renamed from: b */
    static final Map<Integer, Boolean> f51725b = new ConcurrentHashMap(2);

    /* renamed from: c */
    private static WeakHandler.IHandler f51726c = new WeakHandler.IHandler() {
        /* class com.bytedance.push.p1596g.C21831g.C218321 */

        static {
            Covode.recordClassIndex(25484);
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 1001) {
                String str = C21922f.m41214a(C30061a.f71748a).mo35678d(((Integer) message.obj).intValue()) + " register timeout";
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 108);
                    jSONObject.put("pushType", message.obj);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C21830f.m40902a("push_monitor_register_result", jSONObject, null, null);
                C21823a.m40878a("1004", 108, str, jSONObject);
            }
        }
    };

    static {
        Covode.recordClassIndex(25483);
    }

    /* renamed from: a */
    static void m40903a(int i) {
        f51724a.removeMessages(1001, Integer.valueOf(i));
    }

    /* renamed from: a */
    static void m40904a(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i == 0) {
            i = 0;
        }
        C21823a.m40878a("1005", i, str, jSONObject);
        C21830f.m40902a("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    static void m40905a(int i, JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i == 0) {
            i = 0;
        }
        C21823a.m40878a("1003", i, str, jSONObject);
        C21830f.m40902a("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }
}
