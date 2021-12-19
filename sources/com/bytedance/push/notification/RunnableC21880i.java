package com.bytedance.push.notification;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.p1590c.AbstractC21780k;
import com.bytedance.push.p1590c.AbstractC21784o;
import com.bytedance.push.p1593f.C21800b;
import com.bytedance.push.settings.C21895h;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.C30205a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.i */
final class RunnableC21880i implements Runnable {

    /* renamed from: a */
    public final AbstractC21784o f51828a = null;

    /* renamed from: b */
    private final Context f51829b;

    /* renamed from: c */
    private final AbstractC21780k f51830c;

    /* renamed from: d */
    private final C21800b f51831d = null;

    /* renamed from: e */
    private final boolean f51832e;

    static {
        Covode.recordClassIndex(25533);
    }

    public final void run() {
        String str;
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) C21895h.m41120a(this.f51829b, LocalFrequencySettings.class);
        int b = C30062a.m60805b(this.f51829b);
        Map<String, String> e = this.f51830c.mo35448e();
        if (this.f51832e) {
            str = "0";
        } else {
            str = "1";
        }
        e.put("notice", str);
        e.put("system_notify_status", String.valueOf(b));
        String a = C30062a.m60802a(C30205a.m61093a("/service/1/app_notice_status/"), e);
        try {
            JSONArray a2 = C21869e.f51801a.mo35555a(this.f51829b);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("out_app_channel_notify", a2.toString()));
            C21800b bVar = this.f51831d;
            if (bVar != null) {
                String a3 = bVar.mo35478a();
                if (!TextUtils.isEmpty(a3)) {
                    arrayList.add(new Pair("mute_setting", a3));
                }
                String b2 = this.f51831d.mo35479b();
                if (!TextUtils.isEmpty(b2)) {
                    arrayList.add(new Pair("scene_status_list", b2));
                }
            }
            String a4 = AbstractC13621j.f33100a.mo21869a(a, arrayList, (Map<String, String>) null);
            if (!TextUtils.isEmpty(a4)) {
                String optString = new JSONObject(a4).optString("message");
                if ("success".equals(optString)) {
                    localFrequencySettings.mo35578a(true);
                    localFrequencySettings.mo35574a(b);
                    localFrequencySettings.mo35589f(a2.toString());
                    localFrequencySettings.mo35580b(System.currentTimeMillis());
                    C21798f.m40816d().mo35429d();
                    if (this.f51828a != null) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            /* class com.bytedance.push.notification.RunnableC21880i.RunnableC218811 */

                            static {
                                Covode.recordClassIndex(25534);
                            }

                            public final void run() {
                            }
                        });
                        return;
                    }
                    return;
                }
                this.f51830c.mo35456m().mo35427b(302, a4);
                m41007a(1001, optString);
            } else {
                this.f51830c.mo35456m().mo35427b(304, a4);
                m41007a(1001, "server return empty");
            }
            localFrequencySettings.mo35578a(false);
        } catch (Exception e2) {
            localFrequencySettings.mo35578a(false);
            C21798f.m40816d().mo35427b(301, Log.getStackTraceString(e2));
            e2.printStackTrace();
            if (e2 instanceof IOException) {
                m41007a(1002, "network error : " + e2.getMessage());
            } else {
                m41007a(1003, "unknown error: " + e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m41007a(final int i, final String str) {
        if (this.f51828a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.push.notification.RunnableC21880i.RunnableC218822 */

                static {
                    Covode.recordClassIndex(25535);
                }

                public final void run() {
                }
            });
        }
    }

    RunnableC21880i(Context context, AbstractC21780k kVar, boolean z) {
        this.f51829b = context;
        this.f51830c = kVar;
        this.f51832e = z;
    }
}
