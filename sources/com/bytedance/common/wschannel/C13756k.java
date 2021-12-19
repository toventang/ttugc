package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.wschannel.C13734d;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.client.AbstractC13726j;
import com.bytedance.common.wschannel.client.C13733l;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.server.C13786f;
import com.bytedance.common.wschannel.server.C13798l;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.common.wschannel.k */
public final class C13756k {

    /* renamed from: a */
    public static AbstractC13726j f33408a = new C13733l();

    /* renamed from: b */
    static Map<Integer, C13751i> f33409b = new ConcurrentHashMap();

    /* renamed from: c */
    public static AtomicBoolean f33410c = new AtomicBoolean(false);

    /* renamed from: d */
    public static boolean f33411d = true;

    /* renamed from: com.bytedance.common.wschannel.k$a */
    static class C13757a implements C13734d.AbstractC13737a {

        /* renamed from: a */
        private final Application f33412a;

        static {
            Covode.recordClassIndex(15792);
        }

        @Override // com.bytedance.common.wschannel.C13734d.AbstractC13737a
        /* renamed from: a */
        public final void mo22101a() {
            C13756k.f33411d = false;
            if (C13756k.f33410c.get()) {
                C13756k.f33408a.mo22080a(this.f33412a);
            }
        }

        @Override // com.bytedance.common.wschannel.C13734d.AbstractC13737a
        /* renamed from: b */
        public final void mo22102b() {
            C13756k.f33411d = true;
            if (C13756k.f33410c.get()) {
                C13756k.f33408a.mo22085b(this.f33412a);
            }
        }

        C13757a(Application application) {
            this.f33412a = application;
        }
    }

    static {
        Covode.recordClassIndex(15791);
    }

    /* renamed from: a */
    static C13751i m24806a(int i) {
        return f33409b.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    static SsWsApp m24807a(C13642a aVar) {
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

    /* renamed from: a */
    private static Intent m24804a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
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
    private static android.content.Intent m24808b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m24804a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.C13756k.m24808b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: a */
    public static AbstractC13750h m24805a(Context context, C13642a aVar, AbstractC13651e eVar) {
        if (f33410c.compareAndSet(false, true)) {
            if (f33411d) {
                f33408a.mo22085b(context);
            } else {
                f33408a.mo22080a(context);
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                m24808b(context, new C13798l(context, C13786f.m24873a(context)), intentFilter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C13751i iVar = new C13751i(context, f33408a, aVar, eVar);
        f33409b.put(Integer.valueOf(aVar.f33148a), iVar);
        iVar.f33390c.mo22082a(iVar.f33391d, iVar.f33392e);
        return iVar;
    }
}
