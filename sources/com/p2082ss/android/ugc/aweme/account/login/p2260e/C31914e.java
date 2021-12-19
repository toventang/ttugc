package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.Status;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31686a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.util.C33044m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.e.e */
public final class C31914e extends BroadcastReceiver {

    /* renamed from: a */
    Context f76252a;

    /* renamed from: b */
    private C1213t<String> f76253b;

    static {
        Covode.recordClassIndex(38658);
    }

    /* renamed from: a */
    private static Bundle m66283a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public C31914e(Context context, C1213t<String> tVar) {
        this.f76252a = context;
        this.f76253b = tVar;
    }

    /* renamed from: a */
    private static Object m66284a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Status status;
        if (TextUtils.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle a = m66283a(intent);
            String str = null;
            if (a == null || (status = (Status) m66284a(a, "com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null) {
                z = false;
            } else {
                if (status.f60107g == 0) {
                    Matcher matcher = Pattern.compile("[0-9]{4,}").matcher((String) m66284a(a, "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"));
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        if (!TextUtils.isEmpty(group)) {
                            this.f76253b.setValue(group);
                            z = true;
                            str = String.valueOf(status.f60107g);
                        }
                    }
                }
                z = false;
                str = String.valueOf(status.f60107g);
            }
            boolean a2 = C33044m.m67681a(this.f76252a);
            int b = C32856f.m67456b(this.f76252a);
            if (z) {
                m66285a(true, "", a2, b);
            } else {
                m66285a(false, "Failed to get SMS data from Broadcast Receiver, status code = ".concat(String.valueOf(str)), a2, b);
            }
        }
    }

    /* renamed from: b */
    private static Intent m66286b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m66282a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m66286b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2260e.C31914e.m66282a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: a */
    private static void m66285a(boolean z, String str, boolean z2, int i) {
        C31686a.m66012b(z, str, z2, i);
        C32835a.C32836a.m67402a(z, str, z2, i);
        C39162r.m79460a("sms_auto_fill", new C31376a().mo57397a("is_successful", z ? 1 : 0).mo57399a("error_desc", str).mo57397a("has_sim_card", z2 ? 1 : 0).mo57397a("google_availability", i).f75156a);
    }
}
