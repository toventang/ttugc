package com.bytedance.android.livesdk.p436af;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.af.a */
public class C6639a extends BroadcastReceiver {

    /* renamed from: a */
    NetworkUtils.EnumC29835h f16534a = NetworkUtils.EnumC29835h.NONE;

    /* renamed from: b */
    private WeakReference<Context> f16535b;

    /* renamed from: c */
    private List<WeakReference<AbstractC6640a>> f16536c = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.af.a$a */
    public interface AbstractC6640a {
        static {
            Covode.recordClassIndex(7378);
        }

        /* renamed from: a */
        void mo12790a(NetworkUtils.EnumC29835h hVar);
    }

    static {
        Covode.recordClassIndex(7377);
    }

    /* renamed from: a */
    public final void mo12785a() {
        WeakReference<Context> weakReference = this.f16535b;
        if (weakReference != null && weakReference.get() != null) {
            try {
                this.f16535b.get().unregisterReceiver(this);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo12787a(AbstractC6640a aVar) {
        this.f16536c.add(new WeakReference<>(aVar));
    }

    /* renamed from: b */
    private static NetworkUtils.EnumC29835h m14116b(Context context) {
        if (C58029j.f132255g != NetworkUtils.EnumC29835h.NONE && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132255g;
        }
        NetworkUtils.EnumC29835h networkType = NetworkUtils.getNetworkType(context);
        C58029j.f132255g = networkType;
        return networkType;
    }

    /* renamed from: a */
    public final void mo12786a(Context context) {
        this.f16535b = new WeakReference<>(context);
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            m14115b(context, this, intentFilter);
        }
        this.f16534a = m14116b(context);
    }

    /* renamed from: b */
    public final void mo12788b(AbstractC6640a aVar) {
        for (WeakReference<AbstractC6640a> weakReference : this.f16536c) {
            if (weakReference != null && weakReference.get() == aVar) {
                this.f16536c.remove(weakReference);
                return;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
            NetworkUtils.EnumC29835h hVar = this.f16534a;
            NetworkUtils.EnumC29835h b = m14116b(context);
            this.f16534a = b;
            List<WeakReference<AbstractC6640a>> list = this.f16536c;
            if (!(list == null || hVar == b)) {
                for (WeakReference<AbstractC6640a> weakReference : list) {
                    if (weakReference != null) {
                        weakReference.get().mo12790a(this.f16534a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static Intent m14114a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m14115b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m14114a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p436af.C6639a.m14115b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
