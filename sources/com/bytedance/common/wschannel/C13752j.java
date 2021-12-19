package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.C13734d;
import com.bytedance.common.wschannel.client.AbstractC13726j;
import com.bytedance.common.wschannel.client.C13728k;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.p913c.AbstractC13658a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61575ac;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61594p;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.j */
public final class C13752j {

    /* renamed from: a */
    public static final Object f33395a = new Object();

    /* renamed from: b */
    public static AbstractC13726j f33396b = new C13728k();

    /* renamed from: c */
    public static Application f33397c;

    /* renamed from: d */
    public static Map<Integer, C13642a> f33398d = new ConcurrentHashMap();

    /* renamed from: e */
    public static Map<Integer, AbstractC13658a> f33399e = new ConcurrentHashMap();

    /* renamed from: f */
    public static C13755b f33400f;

    /* renamed from: g */
    public static boolean f33401g;

    /* renamed from: h */
    private static volatile boolean f33402h;

    /* renamed from: i */
    private static C13754a f33403i = new C13754a((byte) 0);

    /* renamed from: j */
    private static String f33404j;

    /* renamed from: k */
    private static boolean f33405k;

    /* renamed from: com.bytedance.common.wschannel.j$a */
    static class C13754a implements C13734d.AbstractC13737a {
        static {
            Covode.recordClassIndex(15789);
        }

        private C13754a() {
        }

        @Override // com.bytedance.common.wschannel.C13734d.AbstractC13737a
        /* renamed from: a */
        public final void mo22101a() {
            C13752j.f33401g = false;
            if (C13752j.f33400f == null || C13752j.f33400f.f33406a) {
                C13752j.f33396b.mo22080a(C13752j.f33397c);
            }
        }

        @Override // com.bytedance.common.wschannel.C13734d.AbstractC13737a
        /* renamed from: b */
        public final void mo22102b() {
            C13752j.f33401g = true;
            if (C13752j.f33400f == null || C13752j.f33400f.f33406a) {
                C13752j.f33396b.mo22085b(C13752j.f33397c);
            }
        }

        /* synthetic */ C13754a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.common.wschannel.j$b */
    public static class C13755b {

        /* renamed from: a */
        public boolean f33406a;

        /* renamed from: b */
        public Map<Integer, C13642a> f33407b;

        static {
            Covode.recordClassIndex(15790);
        }

        private C13755b() {
            this.f33407b = new ConcurrentHashMap();
        }

        /* synthetic */ C13755b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public static void m24801b() {
        if (!f33402h) {
            throw new IllegalStateException("please init first");
        }
    }

    static {
        Covode.recordClassIndex(15787);
    }

    /* renamed from: a */
    public static void m24796a() {
        MethodCollector.m26663i(10418);
        m24801b();
        synchronized (f33395a) {
            try {
                C13755b bVar = f33400f;
                if (!(bVar == null || bVar.f33406a)) {
                    f33400f.f33406a = true;
                    if (!f33400f.f33407b.isEmpty()) {
                        for (C13642a aVar : f33400f.f33407b.values()) {
                            m24798a(aVar);
                        }
                        f33400f.f33407b.clear();
                    } else {
                        f33396b.mo22084a((Context) f33397c, true);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        /* class com.bytedance.common.wschannel.C13752j.RunnableC137531 */

                        static {
                            Covode.recordClassIndex(15788);
                        }

                        public final void run() {
                            if (C13752j.f33401g) {
                                C13752j.f33396b.mo22085b(C13752j.f33397c);
                            } else {
                                C13752j.f33396b.mo22080a(C13752j.f33397c);
                            }
                        }
                    }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    MethodCollector.m26664o(10418);
                }
            } finally {
                MethodCollector.m26664o(10418);
            }
        }
    }

    /* renamed from: a */
    public static void m24798a(C13642a aVar) {
        MethodCollector.m26663i(10580);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", C61594p.f139771a);
        jSONObject.put("status", 2);
        C12290b.m22066a("aweme_long_connection_status", jSONObject, (JSONObject) null, (JSONObject) null);
        C61575ac.m111523a("2->registerChannel ");
        m24801b();
        synchronized (f33395a) {
            try {
                C13755b bVar = f33400f;
                if (bVar == null || bVar.f33406a) {
                    C61575ac.m111523a("3->doRealRegisterOrParametersChangedMethod ");
                    f33398d.put(Integer.valueOf(aVar.f33148a), aVar);
                    f33396b.mo22082a(f33397c, m24800b(aVar));
                } else {
                    f33400f.f33407b.put(Integer.valueOf(aVar.f33148a), aVar);
                }
            } finally {
                MethodCollector.m26664o(10580);
            }
        }
    }

    /* renamed from: b */
    private static SsWsApp m24800b(C13642a aVar) {
        Map<String, String> map = aVar.f33151d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                arrayList.add(entry.getKey() + "=" + entry.getValue());
            }
        }
        int i = aVar.f33154g;
        if (i > 0) {
            String str = aVar.f33149b;
            if (!C13627m.m24498a(str)) {
                String str2 = aVar.f33150c;
                if (!C13627m.m24498a(str2)) {
                    int i2 = aVar.f33153f;
                    if (i2 > 0) {
                        String str3 = aVar.f33155h;
                        if (!C13627m.m24498a(str3)) {
                            int i3 = aVar.f33156i;
                            if (i3 > 0) {
                                int i4 = aVar.f33148a;
                                if (i4 > 0) {
                                    SsWsApp.C13765a aVar2 = new SsWsApp.C13765a();
                                    aVar2.f33455a = i;
                                    aVar2.f33456b = str;
                                    aVar2.f33457c = str2;
                                    aVar2.f33460f = i2;
                                    aVar2.f33461g = str3;
                                    aVar2.f33464j = aVar.f33152e;
                                    aVar2.f33458d = i3;
                                    aVar2.f33459e = 0;
                                    aVar2.f33463i = i4;
                                    aVar2.f33462h = TextUtils.join("&", arrayList.toArray());
                                    return aVar2.mo22158a();
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cf, code lost:
        if (r5 != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24797a(android.app.Application r20, com.bytedance.common.wschannel.app.AbstractC13651e r21) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.C13752j.m24797a(android.app.Application, com.bytedance.common.wschannel.app.e):void");
    }

    /* renamed from: a */
    private static Intent m24795a(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m24799b(android.app.Application r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m24795a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.C13752j.m24799b(android.app.Application, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
