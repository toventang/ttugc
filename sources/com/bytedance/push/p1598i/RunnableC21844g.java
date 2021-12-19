package com.bytedance.push.p1598i;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1600k.C21856b;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.PushOnlineSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.i.g */
public final class RunnableC21844g implements Runnable {

    /* renamed from: a */
    private final JSONObject f51750a;

    /* renamed from: b */
    private final Context f51751b;

    /* renamed from: c */
    private final boolean f51752c;

    static {
        Covode.recordClassIndex(25496);
    }

    public final void run() {
        JSONObject jSONObject = this.f51750a;
        if (jSONObject != null) {
            if (!jSONObject.has("sdk_key_PushSDK") || (jSONObject = this.f51750a.optJSONObject("sdk_key_PushSDK")) != null) {
                if (this.f51752c) {
                    Context context = this.f51751b;
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                        jSONObject2.remove("ttpush_is_notify_service_stick");
                        jSONObject2.remove("ttpush_i18n_allow_push_daemon_monitor");
                        jSONObject2.remove("ttpush_is_close_alarm_wakeup");
                        jSONObject2.remove("ttpush_allow_push_job_service");
                        m40923a(context, jSONObject2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    m40923a(this.f51751b, jSONObject);
                }
            } else if (C21856b.f51776a) {
                throw new IllegalArgumentException("settings missing sdk_key_PushSDK");
            }
        }
    }

    /* renamed from: a */
    private void m40923a(final Context context, final JSONObject jSONObject) {
        RunnableC218451 r2 = new Runnable() {
            /* class com.bytedance.push.p1598i.RunnableC21844g.RunnableC218451 */

            static {
                Covode.recordClassIndex(25497);
            }

            public final void run() {
                ((AliveOnlineSettings) C21895h.m41120a(context, AliveOnlineSettings.class)).updateSettings(context, jSONObject);
                ((PushOnlineSettings) C21895h.m41120a(context, PushOnlineSettings.class)).updateSettings(context, jSONObject);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            RunnableC13596e.m24423a(r2);
        } else {
            r2.run();
        }
    }

    public RunnableC21844g(Context context, JSONObject jSONObject, boolean z) {
        this.f51751b = context;
        this.f51750a = jSONObject;
        this.f51752c = z;
    }
}
