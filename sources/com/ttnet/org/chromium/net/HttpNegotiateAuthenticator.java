package com.ttnet.org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.base.ThreadUtils;
import java.io.IOException;

public class HttpNegotiateAuthenticator {

    /* renamed from: b */
    static final /* synthetic */ boolean f198488b = true;

    /* renamed from: a */
    Bundle f198489a;

    /* renamed from: c */
    private final String f198490c;

    /* access modifiers changed from: package-private */
    public native void nativeSetResult(long j, int i, String str);

    /* renamed from: com.ttnet.org.chromium.net.HttpNegotiateAuthenticator$c */
    static class C87507c {

        /* renamed from: a */
        public long f198497a;

        /* renamed from: b */
        public AccountManager f198498b;

        /* renamed from: c */
        public Bundle f198499c;

        /* renamed from: d */
        public String f198500d;

        /* renamed from: e */
        public Account f198501e;

        static {
            Covode.recordClassIndex(103460);
        }

        C87507c() {
        }
    }

    static {
        Covode.recordClassIndex(103456);
    }

    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    private HttpNegotiateAuthenticator(String str) {
        if (f198488b || !TextUtils.isEmpty(str)) {
            this.f198490c = str;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: com.ttnet.org.chromium.net.HttpNegotiateAuthenticator$a */
    class C87504a implements AccountManagerCallback<Account[]> {

        /* renamed from: b */
        private final C87507c f198492b;

        static {
            Covode.recordClassIndex(103457);
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            MethodCollector.m26663i(7089);
            try {
                Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    C87457f.m151788b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f198492b.f198497a, -341, null);
                    MethodCollector.m26664o(7089);
                } else if (result.length > 1) {
                    C87457f.m151788b("net_auth", "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(result.length));
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f198492b.f198497a, -341, null);
                    MethodCollector.m26664o(7089);
                } else if (HttpNegotiateAuthenticator.m151859a(C87445c.f198342a, "android.permission.USE_CREDENTIALS", true)) {
                    C87457f.m151789c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.", new Object[0]);
                    HttpNegotiateAuthenticator.this.nativeSetResult(this.f198492b.f198497a, -343, null);
                    MethodCollector.m26664o(7089);
                } else {
                    this.f198492b.f198501e = result[0];
                    this.f198492b.f198498b.getAuthToken(this.f198492b.f198501e, this.f198492b.f198500d, this.f198492b.f198499c, true, (AccountManagerCallback<Bundle>) new C87505b(this.f198492b), new Handler(ThreadUtils.m151755a().getLooper()));
                    MethodCollector.m26664o(7089);
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                C87457f.m151788b("net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.f198492b.f198497a, -9, null);
                MethodCollector.m26664o(7089);
            }
        }

        public C87504a(C87507c cVar) {
            this.f198492b = cVar;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.HttpNegotiateAuthenticator$b */
    class C87505b implements AccountManagerCallback<Bundle> {

        /* renamed from: a */
        public final C87507c f198493a;

        static {
            Covode.recordClassIndex(103458);
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            MethodCollector.m26663i(4760);
            int i = 0;
            try {
                Bundle result = accountManagerFuture.getResult();
                if (result.containsKey("intent")) {
                    final Context context = C87445c.f198342a;
                    m151861b(context, new BroadcastReceiver() {
                        /* class com.ttnet.org.chromium.net.HttpNegotiateAuthenticator.C87505b.C875061 */

                        static {
                            Covode.recordClassIndex(103459);
                        }

                        public final void onReceive(Context context, Intent intent) {
                            context.unregisterReceiver(this);
                            C87505b.this.f198493a.f198498b.getAuthToken(C87505b.this.f198493a.f198501e, C87505b.this.f198493a.f198500d, C87505b.this.f198493a.f198499c, true, (AccountManagerCallback<Bundle>) new C87505b(C87505b.this.f198493a), (Handler) null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                    MethodCollector.m26664o(4760);
                    return;
                }
                HttpNegotiateAuthenticator httpNegotiateAuthenticator = HttpNegotiateAuthenticator.this;
                C87507c cVar = this.f198493a;
                httpNegotiateAuthenticator.f198489a = result.getBundle("spnegoContext");
                switch (result.getInt("spnegoResult", 1)) {
                    case 0:
                        break;
                    case 1:
                    default:
                        i = -9;
                        break;
                    case 2:
                        i = -3;
                        break;
                    case 3:
                        i = -342;
                        break;
                    case 4:
                        i = -320;
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        i = -338;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        i = -339;
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        i = -341;
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        i = -344;
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        i = -329;
                        break;
                }
                httpNegotiateAuthenticator.nativeSetResult(cVar.f198497a, i, result.getString("authtoken"));
                MethodCollector.m26664o(4760);
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                C87457f.m151788b("net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticator.this.nativeSetResult(this.f198493a.f198497a, -9, null);
                MethodCollector.m26664o(4760);
            }
        }

        public C87505b(C87507c cVar) {
            this.f198493a = cVar;
        }

        /* renamed from: a */
        private static Intent m151860a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
        private static android.content.Intent m151861b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m151860a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.HttpNegotiateAuthenticator.C87505b.m151861b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: a */
    static boolean m151859a(Context context, String str, boolean z) {
        if ((!z || Build.VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        boolean z2;
        MethodCollector.m26663i(4818);
        if (f198488b || str != null) {
            Context context = C87445c.f198342a;
            C87507c cVar = new C87507c();
            cVar.f198500d = "SPNEGO:HOSTBASED:".concat(String.valueOf(str));
            cVar.f198498b = AccountManager.get(context);
            cVar.f198497a = j;
            String[] strArr = {"SPNEGO"};
            cVar.f198499c = new Bundle();
            if (str2 != null) {
                cVar.f198499c.putString("incomingAuthToken", str2);
            }
            if (this.f198489a != null) {
                cVar.f198499c.putBundle("spnegoContext", this.f198489a);
            }
            cVar.f198499c.putBoolean("canDelegate", z);
            Activity activity = ApplicationStatus.f198219c;
            String str3 = "android.permission.GET_ACCOUNTS";
            if (activity != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    z2 = true;
                    str3 = "android.permission.MANAGE_ACCOUNTS";
                } else {
                    z2 = false;
                }
                if (m151859a(context, str3, z2)) {
                    C87457f.m151789c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", str3);
                    nativeSetResult(cVar.f198497a, -343, null);
                    MethodCollector.m26664o(4818);
                    return;
                }
                cVar.f198498b.getAuthTokenByFeatures(this.f198490c, cVar.f198500d, strArr, activity, null, cVar.f198499c, new C87505b(cVar), new Handler(ThreadUtils.m151755a().getLooper()));
                MethodCollector.m26664o(4818);
            } else if (m151859a(context, str3, true)) {
                C87457f.m151789c("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
                nativeSetResult(cVar.f198497a, -343, null);
                MethodCollector.m26664o(4818);
            } else {
                AccountManager accountManager = cVar.f198498b;
                String str4 = this.f198490c;
                C87504a aVar = new C87504a(cVar);
                Handler handler = new Handler(ThreadUtils.m151755a().getLooper());
                Pair<Boolean, Object> a = C15346a.m28238a(accountManager, new Object[]{str4, strArr, aVar, handler}, 102502, "android.accounts.AccountManagerFuture", false, null);
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                    MethodCollector.m26664o(4818);
                    return;
                }
                C15346a.m28240a(accountManager.getAccountsByTypeAndFeatures(str4, strArr, aVar, handler), accountManager, new Object[]{str4, strArr, aVar, handler}, 102502, "com_ttnet_org_chromium_net_HttpNegotiateAuthenticator_android_accounts_AccountManager_getAccountsByTypeAndFeatures(Landroid/accounts/AccountManager;Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;");
                MethodCollector.m26664o(4818);
            }
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(4818);
            throw assertionError;
        }
    }
}
