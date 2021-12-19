package com.p2082ss.android.ugc.aweme.net.p3492e;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.e.b */
public final class C61339b {

    /* renamed from: a */
    public static final Random f139308a = new Random();

    static {
        Covode.recordClassIndex(71972);
    }

    /* renamed from: a */
    public static boolean m111037a() {
        if (f139308a.nextFloat() < 0.005f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m111035a(int i) {
        try {
            return C17867d.m33078a().getResources().getResourceEntryName(i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m111036a(final String str, final int i, final long j, final Context context) {
        final String name = Thread.currentThread().getName();
        final long currentTimeMillis = System.currentTimeMillis() - C58945a.C58947b.f134185a.f134181h;
        C58254p.m105192a(false).execute(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.net.p3492e.C61339b.RunnableC613401 */

            static {
                Covode.recordClassIndex(71973);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action_type", str);
                    jSONObject.put("layout_name", C61339b.m111035a(i));
                    jSONObject.put("thread_name", name);
                    Context context = context;
                    if (context != null) {
                        jSONObject.put("ctx_name", context.getClass().getSimpleName());
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("duration", j);
                    jSONObject2.put("app_time", currentTimeMillis);
                    C12290b.m22066a("view_inflate", jSONObject, jSONObject2, (JSONObject) null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
