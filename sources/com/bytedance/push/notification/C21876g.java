package com.bytedance.push.notification;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.C21767c;
import com.bytedance.push.C21798f;
import com.bytedance.push.PushBody;
import com.bytedance.push.p1590c.AbstractC21771b;
import com.bytedance.push.p1590c.AbstractC21773d;
import com.bytedance.push.p1590c.AbstractC21776g;
import com.bytedance.push.p1590c.AbstractC21782m;
import com.bytedance.push.p1598i.C21840c;
import com.bytedance.push.p1600k.C21856b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.notification.g */
public final class C21876g implements AbstractC21776g {

    /* renamed from: a */
    public final AbstractC21773d f51810a;

    /* renamed from: b */
    public final List<Long> f51811b = new ArrayList();

    /* renamed from: c */
    private final C21879h f51812c;

    /* renamed from: d */
    private final AbstractC21782m f51813d;

    /* renamed from: e */
    private final C21868d f51814e;

    /* renamed from: f */
    private final C21767c f51815f;

    static {
        Covode.recordClassIndex(25529);
    }

    /* renamed from: a */
    public static String m40999a() {
        AbstractC21771b bVar = C21798f.f51646a.mo35451h().f51604x;
        if (bVar == null) {
            return "";
        }
        String a = bVar.mo35412a();
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return "";
    }

    public C21876g(C21767c cVar) {
        this.f51812c = cVar.f51593m;
        this.f51810a = cVar.f51592l;
        this.f51813d = cVar.f51599s;
        this.f51814e = new C21868d();
        this.f51815f = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r2 == null) goto L_0x009a;
     */
    @Override // com.bytedance.push.p1590c.AbstractC21776g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35434a(java.lang.String r9, int r10) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C21876g.mo35434a(java.lang.String, int):void");
    }

    /* renamed from: a */
    private void m41000a(final int i, final PushBody pushBody, final boolean z) {
        RunnableC218771 r2 = new Runnable() {
            /* class com.bytedance.push.notification.C21876g.RunnableC218771 */

            static {
                Covode.recordClassIndex(25530);
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 183
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C21876g.RunnableC218771.run():void");
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            RunnableC13596e.m24423a(r2);
        } else {
            r2.run();
        }
        RunnableC13596e.m24423a(new C21840c(i, pushBody));
    }

    @Override // com.bytedance.push.p1590c.AbstractC21776g
    /* renamed from: a */
    public final void mo35433a(Context context, String str, int i) {
        C21868d dVar = this.f51814e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (dVar.f51800c != i || elapsedRealtime - dVar.f51798a > 1000 || !TextUtils.equals(dVar.f51799b, str)) {
            dVar.f51799b = str;
            dVar.f51800c = i;
            dVar.f51798a = elapsedRealtime;
            try {
                PushBody pushBody = new PushBody(new JSONObject(str));
                AbstractC21782m mVar = this.f51813d;
                if (mVar != null) {
                    mVar.mo35460a(context, i, pushBody);
                }
                if (!this.f51815f.f51605y) {
                    RunnableC218782 r2 = new Runnable(null, pushBody.f51546e, pushBody.f51542a, pushBody.f51544c) {
                        /* class com.bytedance.push.notification.C21876g.RunnableC218782 */

                        /* renamed from: a */
                        final /* synthetic */ JSONObject f51820a = null;

                        /* renamed from: b */
                        final /* synthetic */ boolean f51821b = true;

                        /* renamed from: c */
                        final /* synthetic */ String f51822c;

                        /* renamed from: d */
                        final /* synthetic */ long f51823d;

                        /* renamed from: e */
                        final /* synthetic */ String f51824e;

                        static {
                            Covode.recordClassIndex(25531);
                        }

                        public final void run() {
                            MethodCollector.m26663i(5527);
                            JSONObject jSONObject = this.f51820a;
                            if (jSONObject == null) {
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            if (!C21856b.f51776a || !TextUtils.isEmpty(jSONObject.optString("rule_id64"))) {
                                if (this.f51821b) {
                                    jSONObject.put("click_position", "notify");
                                } else {
                                    jSONObject.put("click_position", "alert");
                                }
                                jSONObject.put("ttpush_sec_target_uid", this.f51822c);
                                jSONObject.put("local_sec_uid", C21876g.m40999a());
                                jSONObject.put("client_time", System.currentTimeMillis());
                                jSONObject.put("real_filter", "0");
                                jSONObject.put("rule_id", this.f51823d);
                                jSONObject.put("push_sdk_version", "30203");
                                jSONObject.put("push_sdk_version_name", "3.2.3-alpha.16-tiktok");
                                if (!TextUtils.isEmpty(this.f51824e)) {
                                    jSONObject.put("ttpush_group_id", this.f51824e);
                                }
                                synchronized (C21876g.this.f51811b) {
                                    try {
                                        if (!C21876g.this.f51811b.contains(Long.valueOf(this.f51823d))) {
                                            C21876g.this.f51811b.add(Long.valueOf(this.f51823d));
                                            C21876g.this.f51810a.mo35419a("push_click", jSONObject);
                                            MethodCollector.m26664o(5527);
                                        }
                                    } finally {
                                        MethodCollector.m26664o(5527);
                                    }
                                }
                            } else {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("rule_id64 is empty，please set effective rule_id64 for push click event !!");
                                MethodCollector.m26664o(5527);
                                throw illegalArgumentException;
                            }
                        }

                        {
                            this.f51822c = r4;
                            this.f51823d = r5;
                            this.f51824e = r7;
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        RunnableC13596e.m24423a(r2);
                    } else {
                        r2.run();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
